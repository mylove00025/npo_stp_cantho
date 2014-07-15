package com.osp.npo.app.action;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.context.CommonContext;
import com.osp.npo.app.form.LoginForm;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.common.util.Crypter;
import com.osp.npo.core.accessHistory.AccessHistoryInfo;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.core.user.UserAuthorityList;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.AccessHistoryService;
import com.osp.npo.service.CommonService;
import com.osp.npo.service.OfficeService;
import com.osp.npo.service.UserService;


/**
 * Login Action
 *
 * @author HungPT
 * @version $Revision$
 */
public class LoginAction extends BaseMDAction {
	
    private static final String SUCCESS = "success";
    private static final String PREVENT = "prevent";
    private static final String JSESSIONID = "JSESSIONID";
    private String forwardName = null;
    private String forwardName2 = null;


	/**
	 * Action when login
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Boolean success = true;
		forwardName = SUCCESS;
		forwardName2 = PREVENT;
		Boolean checkLogin = false;
		// get user input data: user name and password 		 		
		LoginForm loginForm = (LoginForm) form;
		String userName = loginForm.getUserName();
		String password = loginForm.getPassword();
		if (request.getParameter("acc")!=null&&request.getParameter("p")!=null) {
			checkLogin = true;
			userName = request.getParameter("acc").trim();
			password = request.getParameter("p").trim();
			response.addHeader("P3P","CP=\"NOI CURa ADMa DEVa TAIa OUR BUS IND UNI COM NAV INT\"");
		}
		// set cookie to response
		HttpSession session = request.getSession();
		Cookie cookie = new Cookie(JSESSIONID, session.getId());
		response.addCookie(cookie);
		// get instance of UserService 
		UserService userService = new UserService(getConnection());
		// set filter 
		userService.setAccountIdFilter(userName, FilterKind.FULL);
		userService.setActiveFlgFilter(Boolean.TRUE);
		// get list user, after set filter
		UserList userList = userService.queryAllUser(false);
		// check size of list user, one user is expected value
		UserInfo userInfo = null;
		if (userList.size() != 1) {
			success = false;
		} else {
			userInfo = userList.get(0);
			
			if (!Crypter.matches(userInfo.getPassword(), password)) {
				success = false;
			}	
					
		}
		if (success) {
		    //check active flag of notary office service
            OfficeService officeService = new OfficeService(getConnection());
            officeService.setNoidFilter(userInfo.getOfficeId());            
            NotaryOfficeList notaryOfficeList = officeService.queryAllNotaryOffice(false);
            if (notaryOfficeList.size() != 1) {
               success = false; 
            } else {
                NotaryOfficeInfo notaryOfficeInfo = notaryOfficeList.get(0);
                if (Constants.OFFICE_TYPE_NOTARY.equals(notaryOfficeInfo.getOfficeType())) {
                    success = notaryOfficeInfo.getActiveFlg();
                }
            }
		}
		    
		if (success) {
			// common context, that stores user information 
			CommonContext commonContext = new CommonContext();
			commonContext.setUserInfo(userInfo);
			
			CommonService commonService = new CommonService(getConnection());
			NotaryOfficeInfo notaryOffceInfo = commonService.queryNotaryOfficeByNoid(false, userInfo.getOfficeId());
			if (notaryOffceInfo != null) {
				commonContext.setNotaryOfficeInfo(notaryOffceInfo);
			} 
			
			// query authority by user ID
			UserAuthorityList authorityList = new UserAuthorityList();
			authorityList = userService.queryUserAuthorityByUsid(false, userInfo.getId());
			// save user authority in common context
			for (int i = 0; i < authorityList.size(); i++) {
				commonContext.getAuthorityList().add(authorityList.get(i));
			}
			
			if (session.getAttribute(CommonContext.SESSION_KEY) != null) {
				session.removeAttribute(CommonContext.SESSION_KEY);
			}
			
			CommonService cs = new CommonService(getConnection());
			commonContext.setSystemConfigList(cs.queryAllSystemConfig(false));
			
			
			userInfo.setLastLoginDate(new Timestamp(Calendar.getInstance().getTimeInMillis()));
            userService.modifyUser(userInfo);
            
            //Access history
			AccessHistoryService accessHistoryService = new AccessHistoryService(getConnection());
			AccessHistoryInfo accessHistoryInfo = new AccessHistoryInfo();
			
			accessHistoryInfo.setUsid(userInfo.getId());
			accessHistoryInfo.setExecutePerson(userInfo.getFullName()+" ("+userInfo.getAccount()+")");
			accessHistoryInfo.setAccessType((byte) 0);
			accessHistoryInfo.setExecuteDateTime(userInfo.getLastLoginDate());
			accessHistoryInfo.setClientInfo(this.getClientInfo(request));
			accessHistoryService.entryAccessHistory(accessHistoryInfo);
			
			commonContext.setClientInfo(this.getClientInfo(request));
			
            getConnection().commit();
			if (!checkLogin) {
			    session.setAttribute(CommonContext.SESSION_KEY, commonContext);	
				return mapping.findForward(forwardName);
			}
			else {
				commonContext.setLoginFromClient(true);
			    session.setAttribute(CommonContext.SESSION_KEY, commonContext);	
				return mapping.findForward(forwardName2);
			}
		} else {
			// save error message to request
			ActionMessage actionMessage = new ActionMessage("COM001_not_wrong_username_password");
			ActionMessages msgs = new ActionMessages();
			msgs.add(ActionMessages.GLOBAL_MESSAGE, actionMessage);
			saveMessages(request, msgs);
			return mapping.getInputForward();
		}
		
	}
	
    
	/**
	 * Action when logout
	 * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward logout(ActionMapping mapping, ActionForm form, 
            HttpServletRequest request, HttpServletResponse response) throws Exception {
			
        request.getSession().invalidate();
        
        return mapping.findForward(SUCCESS);
    }
}

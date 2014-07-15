package com.osp.npo.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.context.NotaryOfficeEditContext;
import com.osp.npo.app.form.UserEntryForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.UserEntryViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.common.util.Crypter;
import com.osp.npo.core.user.UserAuthorityInfo;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.UserService;

/**
 * <P>Action for User Entry</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20315 $
 */
public class UserEntryAction extends BaseMDAction {

    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    /**
     * <P>Action for first view</P>
     *
     * @author KienLT
     * @author GiangVT
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return success page
     * @throws Exception
     */
    public ActionForward view(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        createTitle(Constants.SCREEN_ADM016);

        UserEntryViewHelper userEntryViewHelper = new UserEntryViewHelper();
        userEntryViewHelper.setActiveFlg(true);
        userEntryViewHelper.setPreventAuthority(Boolean.TRUE);
        request.getSession().setAttribute(UserEntryViewHelper.SESSION_KEY, userEntryViewHelper);
    
     return mapping.findForward(SUCCESS);
    }
   /**
     * <P>Action save user</P>
     *
     * @author KienLT
     * @author GiangVT
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward save(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserService userService = new UserService(getConnection());
        UserEntryForm userEntryForm = (UserEntryForm)form;
        
        NotaryOfficeEditContext notaryContext = (NotaryOfficeEditContext) request.getSession()
        	.getAttribute(NotaryOfficeEditContext.SESSION_KEY);

        MessageUtil messageUtil = new MessageUtil();
        
        String account = notaryContext.getAuthenticationId() + userEntryForm.getAccount();

        // lay danh sach tai khoan nguoi dung.de kiem tra tai khoan da ton tai hay chua.
        userService.setAccountIdFilter(account, FilterKind.FULL);
        UserList userList = userService.queryUser(false, -1, -1);

        if (userList.size() > 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(messageUtil.createActionMessages("account", "ADM002_err_username_already_exist"));
            saveErrors(request, errors);

            UserEntryViewHelper view = (UserEntryViewHelper)
                request.getSession().getAttribute(UserEntryViewHelper.SESSION_KEY);
            view.reset(userEntryForm);

            return mapping.findForward(FAILURE);
        }
        
        UserInfo userInfo = new UserInfo();
        userInfo.setOfficeId(notaryContext.getOfficeId());
        userInfo.setAccount(account);
        userInfo.setFamilyName(userEntryForm.getFamilyName());
        userInfo.setFirstName(userEntryForm.getFirstName());
        userInfo.setPassword(Crypter.crypt(userEntryForm.getPassword()));
        userInfo.setBirthday(userEntryForm.getBirthday());
        userInfo.setSex(userEntryForm.getSex());
        userInfo.setAddress(userEntryForm.getAddress());
        userInfo.setEmail(userEntryForm.getEmail());
        userInfo.setTelephone(userEntryForm.getTelephone());
        userInfo.setMobile(userEntryForm.getMobile());
        userInfo.setRole(userEntryForm.getRole());
        userInfo.setActiveFlg(Boolean.TRUE);
        userInfo.setHiddenFlg(false);

        //Entry user information
        createEntryUserInfo(userInfo);

        int rs = userService.entryUser(userInfo);

        //Luu quyen tao moi DLNC
        if (rs == 1 && userEntryForm.getPreventAuthority() != null && userEntryForm.getPreventAuthority()) {
            UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
            userAuthorityInfo.setUserId(userInfo.getId());
            userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_PREVENT_DATA);

            userService.entryUserAuthority(userAuthorityInfo);
        }

        getConnection().commit();
        request.getSession().removeAttribute(UserEntryViewHelper.SESSION_KEY);

        //Hien thi thong bao Them moi thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(messageUtil.createActionMessages("", request, "msg_regist_success", "item_user"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }
}

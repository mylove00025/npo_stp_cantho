/**
 * 
 */
package com.osp.npo.app.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.context.NotaryListContext;
import com.osp.npo.app.form.NotaryListForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.NotaryListViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.service.OfficeService;

/**
 * @author SonHD
 * @version $Revision: 20701 $
 */
public class NotaryListAction extends BaseMDAction {
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    private static final Integer FIRST_PAGE = 1;
    public static final String NO_LOGIN = "nologin";
    private static final String ORDER_FIELD_NOTARY = "name";
    private static final Boolean HIDDEN_FLAG = Boolean.FALSE;
    
   

    public ActionForward view(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        createTitle(Constants.SCREEN_ADM013);

        HttpSession session = request.getSession();

        // delete session
        if (session.getAttribute(NotaryListViewHelper.SESSION_KEY) != null) {
            session.removeAttribute(NotaryListViewHelper.SESSION_KEY);
        }
        if (session.getAttribute(NotaryListContext.SESSION_KEY) != null) {
            session.removeAttribute(NotaryListContext.SESSION_KEY);
        }
        NotaryListViewHelper notaryListViewHelper = new NotaryListViewHelper();
        NotaryListContext notaryContext = new NotaryListContext();
        saveDataList(notaryListViewHelper, notaryContext, null);

        session.setAttribute(NotaryListViewHelper.SESSION_KEY, notaryListViewHelper);
        session.setAttribute(NotaryListContext.SESSION_KEY, notaryContext);
        return mapping.findForward(SUCCESS);
    }

    @SuppressWarnings("unchecked")
	private void saveDataList(NotaryListViewHelper notaryListViewHelper, NotaryListContext context, String direction)
            throws SQLException, IOException {

        OfficeService notaryService = new OfficeService(getConnection());

        // set search filter
        
        notaryService.setOfficeTypeFilter(Constants.OFFICE_TYPE_NOTARY);
        notaryService.setHidFlagFilter(HIDDEN_FLAG);
        setSearchFilter(context, notaryService);

        notaryListViewHelper.setNotaryList(null);

        Integer totalCount = notaryService.countTotalNotaryOffice();
        notaryListViewHelper.setTotalCount(totalCount);

        if (totalCount != 0) {
            Integer totalPage = pageCalculation(totalCount, getLineMax());
            notaryListViewHelper.setTotalPage(totalPage);
            notaryListViewHelper.setPage(pageTransition(direction, notaryListViewHelper.getPage(), totalPage));
            notaryService.addOrderFieldNotary(new OrderField(ORDER_FIELD_NOTARY));
            NotaryOfficeList notaryList = notaryService.queryNotaryOffice(false, notaryListViewHelper.getPage(), getLineMax());
            notaryListViewHelper.setNotaryList(notaryList.getList());
        }
    }

    private void setSearchFilter(NotaryListContext context, OfficeService service) {
        if (context.getNotaryNameFilter() != null && context.getNotaryNameFilter().trim().length() > 0) {
            service.setNotaryNameFilter(context.getNotaryNameFilter().trim(), FilterKind.MIDDLE);
        }
    }

    public ActionForward search(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        NotaryListForm notaryListForm = (NotaryListForm) form;

        HttpSession session = request.getSession();
        NotaryListViewHelper notaryListViewHelper = (NotaryListViewHelper) session
                .getAttribute(NotaryListViewHelper.SESSION_KEY);
        NotaryListContext notaryContext = (NotaryListContext) session.getAttribute(NotaryListContext.SESSION_KEY);
        if (notaryListViewHelper != null && notaryListViewHelper != null) {
            notaryListViewHelper.reset(notaryListForm);
            notaryListViewHelper.setChkID(notaryListForm.getChkID());
            notaryContext.clear();
            setContext(notaryContext, notaryListForm, notaryListViewHelper);
            notaryContext.setNotaryNameFilter(notaryListForm.getNotaryNameFilter());
            notaryListViewHelper.setPage(FIRST_PAGE);
            saveDataList(notaryListViewHelper, notaryContext, null);
        }
        if (notaryListViewHelper.getTotalCount() == 0) {
            MessageUtil mu = new MessageUtil();
            saveMessages(request, mu.createActionMessages("", request, "msg_data_not_exist", "item_notary_office"));
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward paging(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

    	 NotaryListForm notaryListForm = (NotaryListForm) form;
          HttpSession session = request.getSession();
          NotaryListViewHelper notaryListViewHelper = (NotaryListViewHelper) session
                  .getAttribute(NotaryListViewHelper.SESSION_KEY);
          NotaryListContext context = (NotaryListContext) session.getAttribute(NotaryListContext.SESSION_KEY);
          
          setContext(context, notaryListForm, notaryListViewHelper);
           if (context.getChkID() != null && context.getChkID().length > 0) {
               String[] checkedId = new String[context.getChkID().length];
               for (int i = 0; i < context.getChkID().length; i++) {
                   checkedId[i] = context.getChkID()[i];
               }    notaryListViewHelper.setChkID(checkedId);
           } else {
               notaryListViewHelper.setChkID(null);
           }
             
           if (notaryListViewHelper != null && context != null) {
               saveDataList(notaryListViewHelper, context, notaryListForm.getDirection());
           }
           return mapping.findForward(SUCCESS);
    }

    public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        NotaryListViewHelper notaryListViewHelper = (NotaryListViewHelper) session
                .getAttribute(NotaryListViewHelper.SESSION_KEY);
        NotaryListContext notaryContext = (NotaryListContext) session.getAttribute(NotaryListContext.SESSION_KEY);
        if (notaryListViewHelper != null && notaryContext != null) {
            setViewHelper(notaryListViewHelper, notaryContext);
            saveDataList(notaryListViewHelper, notaryContext, null);
        } else {
            view(mapping, form, request, response);
        }
        return mapping.findForward(SUCCESS);
    }
    
   
    
    private void setContext(NotaryListContext context, NotaryListForm form, NotaryListViewHelper viewHelper) throws SQLException, IOException {
        

        List<String> notaryList = new ArrayList<String>();
        if (context.getChkID() != null && context.getChkID().length >= 0) {
            for (String item : context.getChkID()) {
                notaryList.add(item);
            }
        }
        
        if(viewHelper.getNotaryList() != null 
        		&& viewHelper.getNotaryList().size() > 0 ) {
        	for (NotaryOfficeInfo info : viewHelper.getNotaryList()) {
				if (notaryList.contains(info.getNoid().toString())) {
					notaryList.remove(info.getNoid().toString());
				}
			}
        }
        
        if (form.getChkID() != null && form.getChkID().length > 0) {
            for (int i = 0; i < form.getChkID().length; i++) {
                if(!notaryList.contains(form.getChkID()[i].toString())) {
                    notaryList.add(form.getChkID()[i].toString());
                }
            }
            
        }
        context.setChkID(notaryList.toArray(new String[notaryList.size()]));
    }

    private void setViewHelper(NotaryListViewHelper viewHelper, NotaryListContext context) {
        viewHelper.setNotaryNameFilter(context.getNotaryNameFilter());
        viewHelper.setChkID(context.getChkID());
    }

    public ActionForward remove(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, SQLException, Exception {

        NotaryListViewHelper helper = (NotaryListViewHelper) request.getSession().getAttribute(NotaryListViewHelper.SESSION_KEY);
        NotaryListContext context = (NotaryListContext) request.getSession().getAttribute(NotaryListContext.SESSION_KEY);
        if (helper == null) {
            return mapping.findForward(NO_LOGIN);
        }
        try {
            OfficeService notaryService = new OfficeService(getConnection());
            NotaryListForm notaryListForm = (NotaryListForm) form;
            if (context != null) {
                setContext(context, notaryListForm, helper);
                setViewHelper(helper, context);
            } else {
                helper.reset(notaryListForm);
            }
            if (helper.getChkID() == null || helper.getChkID().length <= 0) {
                ActionErrors error = new ActionErrors();
                error.add(new MessageUtil().createActionMessages("", "ADM013_not_selected_notary"));
                this.addErrors(request, error);
                return mapping.findForward(SUCCESS);
            } 
            else 
            	
            {
                for (String strNotaryId : helper.getChkID()) 
                {
                    Long notaryId = Long.parseLong(strNotaryId);  
                    notaryService.removeNotaryOffice(notaryId);
                    }
    
                getConnection().commit();
                helper.setChkID(null);
                context.setChkID(null);
                
                ActionMessages messages = new ActionMessages();
                messages.add(new MessageUtil().createActionMessages("", request, "msg_delete_success", "item_notary_office"));
                this.addMessages(request, messages);
                return mapping.findForward(SUCCESS);
            } 
                      
        }
            catch (Exception e) {
            ActionErrors errors = new ActionErrors();
            errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_notary_office"));
            this.addErrors(request, errors);
            return mapping.findForward(FAILURE);
        }
        
    }
    }

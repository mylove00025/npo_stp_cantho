package com.osp.npo.app.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.context.NotaryOfficeEditContext;
import com.osp.npo.app.context.UserListContext;
import com.osp.npo.app.form.NotaryOfficeEditForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.NotaryOfficeEditViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.util.CopyrightUtil;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.OfficeService;
import com.osp.npo.service.UserService;

/**
 * <P>Action for User Edit</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20314 $
 */
public class NotaryOfficeEditAction extends BaseMDAction {
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    private static final String NOTARY_OFFICE_PARAMETER = "noid";
    private static final String ORDER_FIELD = "account";

    /**
     * <P>Action for first view</P>
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
    public ActionForward view(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        createTitle(Constants.SCREEN_ADM015);

        request.getSession().removeAttribute(NotaryOfficeEditViewHelper.SESSION_KEY);
        NotaryOfficeEditViewHelper notaryOfficeEditViewHelper = new NotaryOfficeEditViewHelper();

        OfficeService officeService = new OfficeService(getConnection());

        NotaryOfficeEditContext context = (NotaryOfficeEditContext)
            request.getSession().getAttribute(NotaryOfficeEditContext.SESSION_KEY);
        if (context == null) {
            context = new NotaryOfficeEditContext();
        }
        Long id = Long.parseLong(request.getParameter(NOTARY_OFFICE_PARAMETER));
        
        //khoi tao trang thai hoat dong
        NotaryOfficeEditForm f = (NotaryOfficeEditForm)form;
        f.setActiveFlg(true);

        //Lay thong tin nguoi dung
        officeService.setNoidFilter(id);
        NotaryOfficeList notaryOfficeList = officeService.queryAllNotaryOffice(false);
        if (notaryOfficeList.size() == 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_notary_office_name"));
            saveErrors(request, errors);
            return mapping.findForward(FAILURE);
        } else {
            NotaryOfficeInfo notaryOfficeInfo = notaryOfficeList.get(0);
            context.setOfficeId(notaryOfficeInfo.getNoid());
            context.setOfficeName(notaryOfficeInfo.getName());
            context.setAuthenticationId(notaryOfficeInfo.getAuthenticationId());
        }
        
        NotaryOfficeInfo notaryOfficeInfo = (NotaryOfficeInfo) notaryOfficeList.get(0);
        notaryOfficeEditViewHelper.setNoid(notaryOfficeInfo.getNoid());
        notaryOfficeEditViewHelper.setName(notaryOfficeInfo.getName());
        notaryOfficeEditViewHelper.setAddress(notaryOfficeInfo.getAddress());
        notaryOfficeEditViewHelper.setMacAddress(notaryOfficeInfo.getMacAddress());
        notaryOfficeEditViewHelper.setEmail(notaryOfficeInfo.getEmail());
        notaryOfficeEditViewHelper.setFax(notaryOfficeInfo.getFax());
        notaryOfficeEditViewHelper.setWebsite(notaryOfficeInfo.getWebsite());
        notaryOfficeEditViewHelper.setAuthenticationId(notaryOfficeInfo.getAuthenticationId());
        notaryOfficeEditViewHelper.setAuthenticationCode(notaryOfficeInfo.getAuthenticationCode());
        //userEditViewHelper.setAuthenticationCode(CopyrightUtil.createKey(notaryOfficeEditForm.getAuthenticationId(), notaryOfficeEditForm.getMacAddress()));
        notaryOfficeEditViewHelper.setPhone(notaryOfficeInfo.getPhone());
        notaryOfficeEditViewHelper.setOtherInfo(notaryOfficeInfo.getOtherInfo());
        notaryOfficeEditViewHelper.setActiveFlg(notaryOfficeInfo.getActiveFlg());
        notaryOfficeEditViewHelper.setHiddenFlg(false);
        
        UserService userService = new UserService(getConnection());
        userService.setOfficeIdFilter(notaryOfficeInfo.getNoid());
        notaryOfficeEditViewHelper.setList(null);

        int totalCount = userService.countTotalUserByFilter();
        notaryOfficeEditViewHelper.setTotalCount(totalCount);

        if (totalCount > 0) {
            int totalPage = pageCalculation(totalCount, getLineMax());
            notaryOfficeEditViewHelper.setTotalPage(totalPage);
            notaryOfficeEditViewHelper.setPage(pageTransition(null, notaryOfficeEditViewHelper.getPage(), totalPage));
            userService.addOrderFieldUser(new OrderField(ORDER_FIELD));
            UserList userList = userService.queryUser(false, notaryOfficeEditViewHelper.getPage(), getLineMax());
            notaryOfficeEditViewHelper.setList(userList.getList());
        }

        request.getSession().setAttribute(NotaryOfficeEditViewHelper.SESSION_KEY, notaryOfficeEditViewHelper);
        request.getSession().setAttribute(NotaryOfficeEditContext.SESSION_KEY, context);
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

        NotaryOfficeEditViewHelper view = (NotaryOfficeEditViewHelper)
            request.getSession().getAttribute(NotaryOfficeEditViewHelper.SESSION_KEY);
        NotaryOfficeEditContext context = (NotaryOfficeEditContext)
        request.getSession().getAttribute(NotaryOfficeEditContext.SESSION_KEY);

        OfficeService officeService = new OfficeService(getConnection());
        NotaryOfficeEditForm notaryOfficeEditForm = (NotaryOfficeEditForm)form;
        Long id = context.getOfficeId();

        officeService.setNoidFilter((long)id);
        NotaryOfficeList userList = officeService.queryAllNotaryOffice(false);
        if (userList.size() == 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_notary_office"));
            saveErrors(request, errors);
            return mapping.findForward(FAILURE);
        }

        NotaryOfficeInfo notaryOfficeInfo = (NotaryOfficeInfo) userList.get(0);
        notaryOfficeInfo.setOfficeType(Constants.OFFICE_TYPE_NOTARY);
        notaryOfficeInfo.setName(notaryOfficeEditForm.getName());
        notaryOfficeInfo.setAddress(notaryOfficeEditForm.getAddress());
        notaryOfficeInfo.setMacAddress(notaryOfficeEditForm.getMacAddress());
        notaryOfficeInfo.setEmail(notaryOfficeEditForm.getEmail());
        notaryOfficeInfo.setFax(notaryOfficeEditForm.getFax());
        notaryOfficeInfo.setWebsite(notaryOfficeEditForm.getWebsite());
        notaryOfficeInfo.setAuthenticationCode(CopyrightUtil.createKey(notaryOfficeInfo.getAuthenticationId(), notaryOfficeEditForm.getMacAddress()));
        notaryOfficeInfo.setPhone(notaryOfficeEditForm.getPhone());
        notaryOfficeInfo.setOtherInfo(notaryOfficeEditForm.getOtherInfo());
        notaryOfficeInfo.setActiveFlg(notaryOfficeEditForm.getActiveFlg());
        notaryOfficeInfo.setHiddenFlg(Boolean.FALSE);

        //Update user information
        createUpdateUserInfo(notaryOfficeInfo);

        officeService.modifyNotaryOffice(notaryOfficeInfo);

        view.reset(notaryOfficeEditForm);
        view.setAuthenticationCode(notaryOfficeInfo.getAuthenticationCode());
        getConnection().commit();

        //Hien thi thong bao Sua thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(new MessageUtil().createActionMessages("", request, "msg_update_success", "item_notary_office"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }

    /**
     * <P>Action del user</P>
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
    public ActionForward del(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        NotaryOfficeEditViewHelper view = (NotaryOfficeEditViewHelper)
            request.getSession().getAttribute(NotaryOfficeEditViewHelper.SESSION_KEY);

        OfficeService officeService = new OfficeService(getConnection());
        Long id = view.getNoid();
        officeService.removeNotaryOffice(id);
        getConnection().commit();

        // Hien thi thong bao Xoa thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(new MessageUtil().createActionMessages("", request, "msg_delete_success", "item_notary_office"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }
    
    /**
    *
    * @param request
    * @return
    */
   private UserListContext getListContext(HttpServletRequest request) {

       HttpSession session = request.getSession();
       UserListContext context = (UserListContext) session
               .getAttribute(UserListContext.SESSION_KEY);

       if (context == null) {
           context = new UserListContext();

           session.setAttribute(UserListContext.SESSION_KEY, context);
       }

       return context;
   }
    
    public ActionForward back(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        UserListContext context = getListContext(request);
        NotaryOfficeEditViewHelper notaryOfficeEditViewHelper = (NotaryOfficeEditViewHelper) request.getSession().getAttribute(NotaryOfficeEditViewHelper.SESSION_KEY);
        NotaryOfficeEditContext notaryContext = (NotaryOfficeEditContext)
        request.getSession().getAttribute(NotaryOfficeEditContext.SESSION_KEY);
        if (notaryContext == null) {
            notaryContext = new NotaryOfficeEditContext();
        }
        setUserList(notaryOfficeEditViewHelper, notaryContext, context, null);

        return mapping.findForward(SUCCESS);        
    }
    
    private void setUserList(NotaryOfficeEditViewHelper viewHelper, NotaryOfficeEditContext notaryContext, UserListContext context, String direction)
            throws SQLException, IOException {
        UserService userService = new UserService(getConnection());
        
        // Set filter condition
        if (notaryContext.getOfficeId() != null) {
            userService.setOfficeIdFilter(notaryContext.getOfficeId());
        }
        
        viewHelper.setList(null);
        
        int totalCount = userService.countTotalUserByFilter();
        viewHelper.setTotalCount(totalCount);
        
        if (totalCount > 0) {
            int totalPage = pageCalculation(totalCount, getLineMax());
            viewHelper.setTotalPage(totalPage);
            viewHelper.setPage(pageTransition(direction, viewHelper.getPage(), totalPage));
            userService.addOrderFieldUser(new OrderField(ORDER_FIELD));
            UserList userList = userService.queryUser(false, viewHelper.getPage(), getLineMax());
            viewHelper.setList(userList.getList());
        }
    }
    public ActionForward page(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        NotaryOfficeEditContext notaryContext = (NotaryOfficeEditContext) session.getAttribute(NotaryOfficeEditContext.SESSION_KEY);

        if (notaryContext == null) {
            notaryContext = new NotaryOfficeEditContext();
        
            session.setAttribute(UserListContext.SESSION_KEY, notaryContext);
        }
        UserListContext userContext = getListContext(request);
        NotaryOfficeEditForm f = (NotaryOfficeEditForm)form;

        NotaryOfficeEditViewHelper userListViewHelper = (NotaryOfficeEditViewHelper) request.getSession().getAttribute(NotaryOfficeEditViewHelper.SESSION_KEY);
        userListViewHelper.reset(f);

        setUserList(userListViewHelper, notaryContext, userContext, f.getDirection());

        return mapping.findForward(SUCCESS);
    }
}

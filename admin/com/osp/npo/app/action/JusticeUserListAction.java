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

import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.context.UserEditContext;
import com.osp.npo.app.context.JusticeUserListContext;
import com.osp.npo.app.form.JusticeUserListForm;
import com.osp.npo.app.viewhelper.JusticeUserListViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.OfficeService;
import com.osp.npo.service.UserService;

/**
 * User List Action
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 17783 $
 */
public class JusticeUserListAction extends BaseMDAction {

    private static final String ACTIVEFLG_TYPE_ALL = "00";
    private static final String ACTIVEFLG_TYPE_INACTIVE = "02";
    private static final String ROLE_TYPE_ALL = "00";
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    private static final Integer FIRST_PAGE = 1;
    private static final String ORDER_FIELD = "account";


    /**
     * View action
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return success page
     * @throws Exception
     */
    public ActionForward view(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        createTitle(Constants.SCREEN_ADM001);

        JusticeUserListViewHelper userListViewHelper = new JusticeUserListViewHelper();
        JusticeUserListContext userListContext = new JusticeUserListContext();
        userListContext.reset();

        setUserList(userListViewHelper, userListContext, null);

        request.getSession().setAttribute(JusticeUserListContext.SESSION_KEY, userListContext);
        request.getSession().setAttribute(JusticeUserListViewHelper.SESSION_KEY, userListViewHelper);

        return mapping.findForward(SUCCESS);
    }


    /**
     * Search action
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward search(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        JusticeUserListContext userListContext = getListContext(request);

        JusticeUserListForm userListForm = (JusticeUserListForm)form;

        userListContext.reset();
        setContext(userListContext, userListForm);

        JusticeUserListViewHelper userListViewHelper = (JusticeUserListViewHelper) request.getSession().getAttribute(JusticeUserListViewHelper.SESSION_KEY);
        userListViewHelper.reset(userListForm);
        userListViewHelper.setPage(FIRST_PAGE);
        setUserList(userListViewHelper, userListContext, null);

        if (userListViewHelper.getTotalCount() == 0) {
            MessageUtil mu = new MessageUtil();
            saveMessages(request, mu.createActionMessages("", request, "msg_data_not_exist", "item_user"));
        }

        return mapping.findForward(SUCCESS);
    }

    /**
     * Paging action
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward page(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        JusticeUserListContext context = getListContext(request);
        JusticeUserListForm f = (JusticeUserListForm)form;

        JusticeUserListViewHelper userListViewHelper = (JusticeUserListViewHelper) request.getSession().getAttribute(JusticeUserListViewHelper.SESSION_KEY);
        userListViewHelper.reset(f);

        setUserList(userListViewHelper, context, f.getDirection());

        return mapping.findForward(SUCCESS);
    }

    /**
     * Back action
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward back(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        JusticeUserListContext context = getListContext(request);
        JusticeUserListViewHelper userListViewHelper = (JusticeUserListViewHelper) request.getSession().getAttribute(JusticeUserListViewHelper.SESSION_KEY);

        setUserList(userListViewHelper, context, null);

        return mapping.findForward(SUCCESS);
    }

    /**
     * Select user action
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward select(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        JusticeUserListForm f = (JusticeUserListForm)form;

        UserEditContext context = new UserEditContext();
        int id = f.getId();
        context.setId(id);

        UserService userService = new UserService(getConnection());
        //userService.setUsidFilter((long)id);
        UserList userList = userService.queryAllUser(false);
        if (userList.size() == 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_user"));
            saveErrors(request, errors);
            return mapping.findForward(FAILURE);
        }

        request.getSession().setAttribute(UserEditContext.SESSION_KEY, context);

        return mapping.findForward(SUCCESS);
    }

    /**
     * Set user list to viewhelper
     *
     * @param viewHelper
     * @param context
     * @param direction
     * @throws SQLException
     * @throws IOException
     */
    private void setUserList(JusticeUserListViewHelper viewHelper, JusticeUserListContext context, String direction)
            throws SQLException, IOException {
        UserService userService = new UserService(getConnection());

        // Set filter condition
        setSearchFilter(context, userService);

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


    /**
     * Set filter to service
     *
     * @param context
     * @param userService
     * @throws IOException 
     * @throws SQLException 
     */
    private void setSearchFilter(JusticeUserListContext context, UserService userService) throws SQLException, IOException {
        
        if (context.getFamilyName() != null) {
            userService.setFamilyNameFilter(context.getFamilyName(), FilterKind.MIDDLE);
        }
        if (context.getFirstName() != null) {
            userService.setFirstNameFilter(context.getFirstName(), FilterKind.MIDDLE);
        }
        if (context.getAccount() != null) {
            userService.setAccountIdFilter(context.getAccount(), FilterKind.MIDDLE);
        }
        if (context.getActiveFlg() != null) {
            userService.setActiveFlgFilter(context.getActiveFlg());
        }
        if (context.getHiddenFlg() != null) {
            userService.setHiddenFlgFilter(context.getHiddenFlg());
        }
        //Load nhung van phong co officeType = 1
        //Lay van phong dau tien de set filter
        OfficeService officeService = new OfficeService(getConnection());
        officeService.setOfficeTypeFilter(Constants.OFFICE_TYPE_JUSTICE);
        NotaryOfficeList notaryOfficeList = officeService.queryAllNotaryOffice(false);
        if(notaryOfficeList.size() == 0) {
            userService.setOfficeIdFilter(0L);
        } else {
            Long justiceOfficeId = notaryOfficeList.get(0).getNoid();
            userService.setOfficeIdFilter(justiceOfficeId);
        }
    }

    /**
     * Set data from Form to Context
     *
     * @param context
     * @param form
     */
    private void setContext(JusticeUserListContext context, JusticeUserListForm form) {
        // loc ho dem
        context.setFamilyName(form.getFamilyName());
        // loc ten
        context.setFirstName(form.getFirstName());
        // loc tai khoan dang nhap
        context.setAccount(form.getAccount());
        // loc chuc vu
        String role = form.getRole();
        if (!ROLE_TYPE_ALL.equals(role)) {
            context.setRole(role);
        } else {
            context.setRole(null);
        }

        // loc trang thai hoat dong
        String activeFlg = form.getActiveFlg();
        if (!ACTIVEFLG_TYPE_ALL.equals(activeFlg)) {
            Boolean isActive = true;
            if (ACTIVEFLG_TYPE_INACTIVE.equals(activeFlg)) {
                isActive = false;
            }
            context.setActiveFlg(isActive);
        } else {
            context.setActiveFlg(null);
        }
    }

    /**
     *
     * @param request
     * @return
     */
    private JusticeUserListContext getListContext(HttpServletRequest request) {

        HttpSession session = request.getSession();
        JusticeUserListContext context = (JusticeUserListContext) session
                .getAttribute(JusticeUserListContext.SESSION_KEY);

        if (context == null) {
            context = new JusticeUserListContext();

            session.setAttribute(JusticeUserListContext.SESSION_KEY, context);
        }

        return context;
    }

}

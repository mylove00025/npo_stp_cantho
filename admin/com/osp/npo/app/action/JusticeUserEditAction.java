package com.osp.npo.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.context.CommonContext;
import com.osp.npo.app.context.UserEditContext;
import com.osp.npo.app.form.JusticeUserEditForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.JusticeUserEditViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.util.Crypter;
import com.osp.npo.core.user.UserAuthorityInfo;
import com.osp.npo.core.user.UserAuthorityList;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.UserService;

/**
 * <P>Action for User Edit</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20314 $
 */
public class JusticeUserEditAction extends BaseMDAction {
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
     * @return
     * @throws Exception
     */
    public ActionForward view(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        createTitle(Constants.SCREEN_ADM003);

        request.getSession().removeAttribute(JusticeUserEditViewHelper.SESSION_KEY);
        JusticeUserEditViewHelper userEditViewHelper = new JusticeUserEditViewHelper();

        UserService userService = new UserService(getConnection());

        UserEditContext context = (UserEditContext)
            request.getSession().getAttribute(UserEditContext.SESSION_KEY);
        int id = context.getId();

        //khoi tao trang thai hoat dong
        JusticeUserEditForm f = (JusticeUserEditForm)form;
        f.setActiveFlg(true);

        //Lay thong tin nguoi dung
        userService.setUsidFilter((long)id);
        UserList userList = userService.queryAllUser(false);
        if (userList.size() == 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_justice_user"));
            saveErrors(request, errors);
            return mapping.findForward(FAILURE);
        }

        UserInfo userInfo = (UserInfo) userList.get(0);

        userEditViewHelper.setId(id);
        userEditViewHelper.setFamilyName(userInfo.getFamilyName());
        userEditViewHelper.setFirstName(userInfo.getFirstName());
        userEditViewHelper.setAccount(userInfo.getAccount());
        userEditViewHelper.setBirthday(userInfo.getBirthday());
        userEditViewHelper.setSex(userInfo.getSex());
        userEditViewHelper.setAddress(userInfo.getAddress());
        userEditViewHelper.setEmail(userInfo.getEmail());
        userEditViewHelper.setTelephone(userInfo.getTelephone());
        userEditViewHelper.setMobile(userInfo.getMobile());
        userEditViewHelper.setRole(userInfo.getRole());
        userEditViewHelper.setActiveFlg(userInfo.getActiveFlg());

        CommonContext commonContext = (CommonContext)
            request.getSession().getAttribute(CommonContext.SESSION_KEY);

        UserInfo currentUser = commonContext.getUserInfo();
        if (currentUser.getId().equals(userInfo.getId())) {
            userEditViewHelper.setCanDel(false);
        } else {
            userEditViewHelper.setCanDel(true);
        }

        // Kiem tra quyen quan tri
        Boolean adminAuthority = Boolean.FALSE;
        Boolean preventAuthority = Boolean.FALSE;
        Boolean announcementAuthority = Boolean.FALSE;
        UserAuthorityList userAuthorityList = userService.queryUserAuthorityByUsid(false, (long)id);
        for ( int i = 0; i < userAuthorityList.size(); i++) {
            if (Constants.AUTHORITY_ADMIN.equals(userAuthorityList.get(i).getAuthorityCode())) {
                adminAuthority = Boolean.TRUE;
            }
            if (Constants.AUTHORITY_PREVENT_DATA.equals(userAuthorityList.get(i).getAuthorityCode())) {
                preventAuthority = Boolean.TRUE;
            }
            if (Constants.AUTHORITY_ANNOUNCEMENT.equals(userAuthorityList.get(i).getAuthorityCode())) {
                announcementAuthority = Boolean.TRUE;
            }
        }

        userEditViewHelper.setAdminAuthority(adminAuthority);
        userEditViewHelper.setPreventAuthority(preventAuthority);
        userEditViewHelper.setAnnouncementAuthority(announcementAuthority);

        // kiem tra co the thay doi chuc vu user
//        userEditViewHelper.setHasContract(Boolean.FALSE);
//        ContractService contractService = new ContractService(getConnection());
//        if (contractService.isExistContractInDB(NPO_CONTRACT, new Object[][] {{NPO_CONTRACT_NOTARY_ID, id}}) ||
//                contractService.isExistContractInDB(NPO_CONTRACT, new Object[][] {{NPO_CONTRACT_DRAFTER_ID, id}})) {
//            userEditViewHelper.setHasContract(Boolean.TRUE);
//        }

        request.getSession().setAttribute(JusticeUserEditViewHelper.SESSION_KEY, userEditViewHelper);
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

        JusticeUserEditViewHelper view = (JusticeUserEditViewHelper)
            request.getSession().getAttribute(JusticeUserEditViewHelper.SESSION_KEY);

        UserService userService = new UserService(getConnection());
        JusticeUserEditForm userEditForm = (JusticeUserEditForm)form;
        int id = view.getId();

        userService.setUsidFilter((long)id);
        UserList userList = userService.queryAllUser(false);
        if (userList.size() == 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_justice_user"));
            saveErrors(request, errors);
            return mapping.findForward(FAILURE);
        }

        UserInfo userInfo = (UserInfo) userList.get(0);

        userInfo.setFamilyName(userEditForm.getFamilyName());
        userInfo.setFirstName(userEditForm.getFirstName());
        if (userEditForm.getPassword() != null && !userEditForm.getPassword().equals("")) {
            userInfo.setPassword(Crypter.crypt(userEditForm.getPassword()));
        }
        userInfo.setBirthday(userEditForm.getBirthday());
        userInfo.setSex(userEditForm.getSex());
        userInfo.setAddress(userEditForm.getAddress());
        userInfo.setEmail(userEditForm.getEmail());
        userInfo.setTelephone(userEditForm.getTelephone());
        userInfo.setMobile(userEditForm.getMobile());
        userInfo.setActiveFlg(userEditForm.getActiveFlg());
        userInfo.setRole(userEditForm.getRole());
        //userInfo.setOfficeId(userInfo.getOfficeId());

//        ContractService contractService = new ContractService(getConnection());
//        if (userEditForm.getRole() != null && !userEditForm.getRole().equals(view.getRole())) {
//            if (!(contractService.isExistContractInDB(NPO_CONTRACT, new Object[][] {{NPO_CONTRACT_NOTARY_ID, id}}) ||
//                    contractService.isExistContractInDB(NPO_CONTRACT, new Object[][] {{NPO_CONTRACT_DRAFTER_ID, id}}))) {
//                userInfo.setRole(userEditForm.getRole());
//            } else {
//                ActionErrors errors = new ActionErrors();
//                errors.add(new MessageUtil().createActionMessages("", "ADM003_user_contract_data_reference_modify_role"));
//                saveErrors(request, errors);
//                return mapping.findForward(FAILURE);
//            }
//        }

        //Update user information
        createUpdateUserInfo(userInfo);

        userService.modifyUser(userInfo);

        view.reset(userEditForm);

        //Remove authority
        userService.removeUserAuthority(userInfo.getId());

        if (view.getCanDel()) {
            //Add authority
            if (userEditForm.getAdminAuthority() != null && userEditForm.getAdminAuthority()) {
                UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
                userAuthorityInfo.setUserId(userInfo.getId());
                userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ADMIN);
                userService.entryUserAuthority(userAuthorityInfo);
            }
        } else {
            //Cap nhat cho chinh minh
            UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
            userAuthorityInfo.setUserId(userInfo.getId());
            userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ADMIN);
            userService.entryUserAuthority(userAuthorityInfo);
        }

        //Add authority
        if (userEditForm.getPreventAuthority() != null && userEditForm.getPreventAuthority()) {
            UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
            userAuthorityInfo.setUserId(userInfo.getId());
            userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_PREVENT_DATA);
            userService.entryUserAuthority(userAuthorityInfo);
        }

        if (userEditForm.getAnnouncementAuthority() != null && userEditForm.getAnnouncementAuthority()) {
            UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
            userAuthorityInfo.setUserId(userInfo.getId());
            userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ANNOUNCEMENT);

            userService.entryUserAuthority(userAuthorityInfo);
        }

        getConnection().commit();

        //Hien thi thong bao Sua thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(new MessageUtil().createActionMessages("", request, "msg_update_success", "item_justice_user"));
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

        JusticeUserEditViewHelper view = (JusticeUserEditViewHelper)
            request.getSession().getAttribute(JusticeUserEditViewHelper.SESSION_KEY);

        UserService userService = new UserService(getConnection());
        int id = view.getId();

//        ContractService contractService = new ContractService(getConnection());
//        if (contractService.isExistContractInDB(NPO_CONTRACT, new Object[][] {{NPO_CONTRACT_NOTARY_ID, id}}) ||
//                contractService.isExistContractInDB(NPO_CONTRACT, new Object[][] {{NPO_CONTRACT_DRAFTER_ID, id}})) {
//
//            ActionErrors errors = new ActionErrors();
//            errors.add((new MessageUtil()).createActionMessages("", "ADM003_user_contract_data_reference"));
//            this.addErrors(request, errors);
//            return mapping.findForward(FAILURE);
//        }

        userService.removeUser((long)id);
        getConnection().commit();

        // Hien thi thong bao Xoa thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(new MessageUtil().createActionMessages("", request, "msg_delete_success", "item_justice_user"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }

}

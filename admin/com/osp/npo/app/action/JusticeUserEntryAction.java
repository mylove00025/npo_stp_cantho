package com.osp.npo.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.form.JusticeUserEntryForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.JusticeUserEntryViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.common.util.Crypter;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.core.user.UserAuthorityInfo;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.OfficeService;
import com.osp.npo.service.UserService;

/**
 * <P>Action for User Entry</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20315 $
 */
public class JusticeUserEntryAction extends BaseMDAction {

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

        createTitle(Constants.SCREEN_ADM002);

        JusticeUserEntryViewHelper userEntryViewHelper = new JusticeUserEntryViewHelper();
        userEntryViewHelper.setActiveFlg(true);

        userEntryViewHelper.setPreventAuthority(Boolean.TRUE);

        request.getSession().setAttribute(JusticeUserEntryViewHelper.SESSION_KEY, userEntryViewHelper);

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
        JusticeUserEntryForm userEntryForm = (JusticeUserEntryForm)form;

        MessageUtil messageUtil = new MessageUtil();

        // lay danh sach tai khoan nguoi dung
        userService.setAccountIdFilter(userEntryForm.getAccount(), FilterKind.FULL);
        UserList userList = userService.queryUser(false, -1, -1);

        if (userList.size() > 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(messageUtil.createActionMessages("account", "ADM002_err_username_already_exist"));
            saveErrors(request, errors);
            JusticeUserEntryViewHelper view = (JusticeUserEntryViewHelper)
                request.getSession().getAttribute(JusticeUserEntryViewHelper.SESSION_KEY);
            view.reset(userEntryForm);

            return mapping.findForward(FAILURE);
        }
        
        Long officeId = 0L;
        
        OfficeService officeService = new OfficeService(getConnection());
        officeService.setOfficeTypeFilter(Constants.OFFICE_TYPE_JUSTICE);
        NotaryOfficeList notaryOfficeList = officeService.queryAllNotaryOffice(false);
        if(notaryOfficeList.size() == 0) {
            officeId = 0L;
        } else {
            officeId = notaryOfficeList.get(0).getNoid();
        }
        
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(userEntryForm.getAccount());
        userInfo.setOfficeId(officeId);
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
        userInfo.setActiveFlg(userEntryForm.getActiveFlg());
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

        // Luu quyen quan tri thong bao
        if (rs == 1 && userEntryForm.getAnnouncementAuthority() != null && userEntryForm.getAnnouncementAuthority()) {
            UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
            userAuthorityInfo.setUserId(userInfo.getId());
            userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ANNOUNCEMENT);

            userService.entryUserAuthority(userAuthorityInfo);
        }
        
        //Luu quyen quan tri
        if (rs == 1 && userEntryForm.getAdminAuthority() != null && userEntryForm.getAdminAuthority()) {
            UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
            userAuthorityInfo.setUserId(userInfo.getId());
            userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ADMIN);

            userService.entryUserAuthority(userAuthorityInfo);
        }
        
        getConnection().commit();
        request.getSession().removeAttribute(JusticeUserEntryViewHelper.SESSION_KEY);

        //Hien thi thong bao Them moi thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(messageUtil.createActionMessages("", request, "msg_regist_success", "item_justice_user"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }
}

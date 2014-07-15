package com.osp.npo.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.form.NotaryOfficeEntryForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.NotaryOfficeEntryViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.common.util.CopyrightUtil;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.office.NotaryOfficeList;
import com.osp.npo.service.OfficeService;

/**
 * <P>Action for User Entry</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20315 $
 */
public class NotaryOfficeEntryAction extends BaseMDAction {

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

        createTitle(Constants.SCREEN_ADM014);

        NotaryOfficeEntryViewHelper notaryOfficeEntryViewHelper = new NotaryOfficeEntryViewHelper();
        notaryOfficeEntryViewHelper.setActiveFlg(true);

        request.getSession().setAttribute(NotaryOfficeEntryViewHelper.SESSION_KEY, notaryOfficeEntryViewHelper);

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
        OfficeService officeService = new OfficeService(getConnection());
        NotaryOfficeEntryForm notaryOfficeEntryForm = (NotaryOfficeEntryForm)form;

        NotaryOfficeEntryViewHelper view = (NotaryOfficeEntryViewHelper)
        request.getSession().getAttribute(NotaryOfficeEntryViewHelper.SESSION_KEY);
        MessageUtil messageUtil = new MessageUtil();

        // lay danh sach van phong cong chung
        officeService.setAuthenticationIdFilter(notaryOfficeEntryForm.getAuthenticationId(), FilterKind.FULL);
        NotaryOfficeList notaryOfficeList = officeService.queryNotaryOffice(false, -1, -1);

        if (notaryOfficeList.size() > 0) {
            ActionErrors errors = new ActionErrors();
            errors.add(messageUtil.createActionMessages("authenticationId", "ADM014_err_notary_office_already_exist"));
            saveErrors(request, errors);
            view.reset(notaryOfficeEntryForm);
            return mapping.findForward(FAILURE);
        }

        NotaryOfficeInfo notaryOfficeInfo = new NotaryOfficeInfo();
        notaryOfficeInfo.setOfficeType(Constants.OFFICE_TYPE_NOTARY);
        notaryOfficeInfo.setName(notaryOfficeEntryForm.getName());
        notaryOfficeInfo.setAddress(notaryOfficeEntryForm.getAddress());
        notaryOfficeInfo.setMacAddress(notaryOfficeEntryForm.getMacAddress());
        notaryOfficeInfo.setEmail(notaryOfficeEntryForm.getEmail());
        notaryOfficeInfo.setFax(notaryOfficeEntryForm.getFax());
        notaryOfficeInfo.setWebsite(notaryOfficeEntryForm.getWebsite());
        notaryOfficeInfo.setAuthenticationId(notaryOfficeEntryForm.getAuthenticationId());
        notaryOfficeInfo.setAuthenticationCode(CopyrightUtil.createKey(notaryOfficeEntryForm.getAuthenticationId(), notaryOfficeEntryForm.getMacAddress()));
        notaryOfficeInfo.setPhone(notaryOfficeEntryForm.getPhone());
        notaryOfficeInfo.setOtherInfo(notaryOfficeEntryForm.getOtherInfo());
        notaryOfficeInfo.setActiveFlg(notaryOfficeEntryForm.getActiveFlg());
        notaryOfficeInfo.setHiddenFlg(false);

        //Entry user information
        createEntryUserInfo(notaryOfficeInfo);

        officeService.entryNotaryOffice(notaryOfficeInfo);

        getConnection().commit();
        //request.getSession().removeAttribute(NotaryOfficeEntryViewHelper.SESSION_KEY);

        view.clear();
        //Hien thi thong bao Them moi thanh cong
        ActionMessages messages = new ActionMessages();
        messages.add(messageUtil.createActionMessages("", request, "msg_regist_success", "item_notary_office"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }
}

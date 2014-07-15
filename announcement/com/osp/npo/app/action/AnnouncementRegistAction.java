package com.osp.npo.app.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.context.CommonContext;
import com.osp.npo.app.form.AnnouncementForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.AnnouncementViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.util.EditString;
import com.osp.npo.common.util.FileUtil;
import com.osp.npo.common.util.RelateDateTime;
import com.osp.npo.common.util.SystemProperties;
import com.osp.npo.core.announcement.AnnouncementInfo;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.service.AnnouncementService;
import com.osp.npo.service.SynchronizeService;

/**
 * <P>
 * Bank Regist Action
 * </P>
 * 
 * @author PhuongNT
 * @version $Revision: 20626 $
 */
public class AnnouncementRegistAction extends BaseMDAction {

    private static final String SUCCESS = "success";
    private static final String NO_LOGIN = "nologin";
    private static final String FAILURE = "failure";
    private static final String UPLOAD_FOLDER_KEY = "system_announcement_folder";
    private static final String ANNOUN_FILE_NAME_PREFIX = "ANNT_";
    private static final Byte IMPORTANCE_LOW = 1;
    private static final Byte IMPORTANCE_HIGH = 2;
    private static final Byte TYPE_ANNOUNCEMENT = 1;
    private static final String POPUP_DIS_DAY = "5";
    
    private static final Long POPUP_DIS_DAY_NUM = 5L;
    private static final String POPUP_DIS_DAY_KEY = "announcement_popup_display_day";

    /**
     * <P>
     * Action for first view
     * </P>
     * 
     * @author PhuongNT
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward view(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        createTitle(Constants.SCREEN_ANNT002);

        HttpSession session = request.getSession();
        if (session.getAttribute(AnnouncementViewHelper.SESSION_KEY) != null) {
            session.removeAttribute(AnnouncementViewHelper.SESSION_KEY);
        }

        AnnouncementViewHelper viewHelper = new AnnouncementViewHelper();

        viewHelper.setPopupDisplayDay(POPUP_DIS_DAY);

        session.setAttribute(AnnouncementViewHelper.SESSION_KEY, viewHelper);

        return mapping.findForward(SUCCESS);
    }

    /**
     * <P>
     * Action for regist
     * </P>
     * 
     * @author PhuongNT
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward regist(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        AnnouncementViewHelper viewHelper = (AnnouncementViewHelper) request.getSession().getAttribute(AnnouncementViewHelper.SESSION_KEY);
        if (viewHelper == null) {
            return mapping.findForward(NO_LOGIN);
        }
        CommonContext context = (CommonContext) request.getSession().getAttribute(CommonContext.SESSION_KEY);
        UserInfo user = context.getUserInfo();

        AnnouncementForm annForm = (AnnouncementForm) form;

        MessageUtil messageUtil = new MessageUtil();

        viewHelper.reset(annForm);

        AnnouncementService service = new AnnouncementService(getConnection());
        AnnouncementInfo info = new AnnouncementInfo();
        info.setKind(TYPE_ANNOUNCEMENT);
        info.setTitle(annForm.getTitle().trim());
        info.setContent(annForm.getContent());
        info.setSendDateTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        info.setSenderInfo(user.getFullName());
        if ("true".equals(annForm.getImportanceType())) {
            info.setImportanceType(IMPORTANCE_HIGH);
        } else {
            info.setImportanceType(IMPORTANCE_LOW);
        }
//        if ("true".equals(annForm.getPopupDisplayFlg())) {
//            info.setPopupDisplayFlg(Boolean.TRUE);
//        } else {
//            info.setPopupDisplayFlg(Boolean.FALSE);
//        }
//        if (!"".equals(annForm.getPopupDisplayDay().trim())) {
//            info.setPopupDisplayDay(Long.valueOf(annForm.getPopupDisplayDay()));
//        } else {
//            info.setPopupDisplayFlg(Boolean.FALSE);
//        }
        
        info.setPopupDisplayFlg(Boolean.TRUE);
        info.setPopupDisplayDay(POPUP_DIS_DAY_NUM);
        		
        String displayDay = context.getSystemConfigValue(POPUP_DIS_DAY_KEY);
        if (displayDay != null && !"".equals(displayDay.trim())) {
        	info.setPopupDisplayDay(Long.valueOf(displayDay));
        }
        
        if(annForm.getFormFile()!=null && (!EditString.isNull(annForm.getFormFile().getFileName()))) {
	        try {
	            String filePath = null;
	            File file = FileUtil.createNewFile(SystemProperties.getProperty(UPLOAD_FOLDER_KEY), ANNOUN_FILE_NAME_PREFIX);
	            String localName = annForm.getFormFile().getFileName();
	            FileOutputStream outputStream = null;
	            outputStream = new FileOutputStream(file);
	            outputStream.write(annForm.getFormFile().getFileData());
	            filePath = file.getAbsolutePath();
	            info.setAttachFileName(EditString.convertUnicodeToASCII(localName));
	            info.setAttachFilePath(filePath);
	        } catch (IOException ioe) {
	            // Message Failure
	            ActionErrors errors = new ActionErrors();
	            errors.add(messageUtil.createActionMessages("", "err_cannot_upload_file"));
	            this.addErrors(request, errors);
	            return mapping.findForward(FAILURE);
	        }
        }
        
        createEntryUserInfo(info);
        
        service.entryAnnouncement(info);
        
        info.setSynchronizeId(context.getNotaryOfficeInfo().getAuthenticationId() + Constants.UNIT_SEPARATOR + info.getAid());
        service.modifyAnnouncement(info);
        
        SynchronizeService synService = new SynchronizeService(getConnection());
        synService.entrySyncDataServer(Constants.SYNCHRONIZE_TYPE_ANNOUNCEMENT, info.getSynchronizeId(), Constants.SYNCHRONIZE_ACTION_REGIST, null,
        		RelateDateTime.getTimeNow());

        getConnection().commit();

        annForm.clear();
        viewHelper.reset(annForm);

        ActionMessages messages = new ActionMessages();
        messages.add(messageUtil.createActionMessages("", request, "msg_regist_success", "item_announcement_name"));
        this.addMessages(request, messages);

        return mapping.findForward(SUCCESS);
    }
}

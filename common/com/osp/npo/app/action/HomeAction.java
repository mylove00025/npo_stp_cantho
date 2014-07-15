package com.osp.npo.app.action;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.HomeViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.core.announcement.AnnouncementInfo;
import com.osp.npo.service.AnnouncementService;

public class HomeAction extends BaseMDAction {
    public static final String SUCCESS_PATH = "success";
    private static final String NO_LOGIN = "nologin";  
    private static final String FAILURE_PATH = "failure";
    public static final String CONTRACT_TEMPLATE_ID = "template_id";
    public static final String DOWNLOAD_FAILURE = "downloadFailure";
    public final int COUNT_MESSAGE = 5;

    public ActionForward view(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, SQLException, Exception {
        createTitle(Constants.SCREEN_COM003);

        request.getSession().removeAttribute(HomeViewHelper.SESSION_KEY);
        HomeViewHelper view = new HomeViewHelper();
      
        AnnouncementService annService = new AnnouncementService(getConnection());
        
        AnnouncementInfo annInfo = annService.queryPopupAnnouncement();
        
        if (annInfo != null) {
        	view.setIsShowPopup("true");
        	view.setAnnouncementInfo(annInfo);
        }        
               
		@SuppressWarnings("unchecked")
		List<AnnouncementInfo> lstAnnouncementInfo = annService.queryLatestAnnouncement(this.COUNT_MESSAGE+1).getList();
					
        view.setLstAnnouncementInfo(lstAnnouncementInfo);
        
        if (lstAnnouncementInfo != null && lstAnnouncementInfo.size()>0) {
        	view.setAnnouncementInfoNew(lstAnnouncementInfo.get(0));
        	lstAnnouncementInfo.remove(0);
        }
        
        request.getSession().setAttribute(HomeViewHelper.SESSION_KEY, view);
        return mapping.findForward(SUCCESS_PATH);
    }
    
    public ActionForward downloadAnnouncementFile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, SQLException, Exception {
    	HomeViewHelper helper = (HomeViewHelper)request.getSession().getAttribute(HomeViewHelper.SESSION_KEY);
    	if (helper == null) {
            return mapping.findForward(NO_LOGIN);
        }
        File file = new File(helper.getAnnouncementInfoNew().getAttachFilePath());

        if (file.exists() && file.canRead() && file.isFile() && file.length() < Integer.MAX_VALUE) {
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition",
                    "attachment; filename=\"" + helper.getAnnouncementInfoNew().getAttachFileName() + "\"");
            response.setHeader("Pragma", "public");
            response.setHeader("Cache-Control", "max-age=0");
            ServletOutputStream out = response.getOutputStream();
            FileInputStream fstream = new FileInputStream(file);
            DataInputStream in = new DataInputStream(fstream);
            long length = file.length();
            byte[] b = new byte[(int)length];
            in.read(b);
            out.write(b);
            out.flush();
            out.close();
            in.close();
            return null;
        } else {
            ActionErrors errors = new ActionErrors();
            MessageUtil messageUtil = new MessageUtil();
            errors.add(messageUtil.createActionMessages("", "err_file_not_found"));
            this.addErrors(request, errors);
            return mapping.findForward(FAILURE_PATH);
        }
    }
}

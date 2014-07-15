package com.osp.npo.app.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.osp.npo.common.util.EditString;

/**
 *
 * AjaxAction
 *
 * @author Giangvt
 * @version $Revision: 20517 $
 */
public class AjaxAction extends BaseMDAction {


    private static final String DOT = "\\.";


    String fileType[][] = { { ".doc", "./image/fileicons/doc.gif" }, { ".docx", "./image/fileicons/doc.gif" },
            { ".xls", "./image/fileicons/xls.gif" }, { ".xlsx", "./image/fileicons/xls.gif" }, { ".csv", "./image/fileicons/csv.gif" },
            { ".ppt", "./image/fileicons/ppt.gif" }, { ".pptx", "./image/fileicons/ppt.gif" }, { ".pps", "./image/fileicons/pps.gif" },
            { ".ppsx", "./image/fileicons/pps.gif" }, { ".pdf", "./image/fileicons/pdf.gif" }, { ".txt", "./image/fileicons/txt.gif" },
            { ".jpeg", "./image/fileicons/jpg.gif" }, { ".jpg", "./image/fileicons/jpg.gif" }, { ".png", "./image/fileicons/png.gif" },
            { ".rar", "./image/fileicons/zip.gif" }, { ".zip", "./image/fileicons/zip.gif" } };

    public String getIcon(String fileName) {
        fileName = fileName.toLowerCase();
        for (int i = 0; i < fileType.length; i++) {
            if (fileName.endsWith(fileType[i][0])) {
                return fileType[i][1];
            }
        }
        return "./image/fileicons/unknown.gif";
    }

    

    /**
     *
     * get all contract templates by contract kind id
     *
     * @author HungPT
     * @param mapping
     *            for mapping
     * @param form
     *            for form
     * @param request
     *            for request
     * @param response
     *            for response
     * @return null
     * @throws Exception
     *             process
     */
    public ActionForward calculateTotalCost(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String costTt91 = request.getParameter("costTt91");
        String costDraft = request.getParameter("costDraft");
        String costNotaryOutsite = request.getParameter("costNotaryOutsite");
        String costOtherDetermine = request.getParameter("costOtherDetermine");

        costTt91 = costTt91.replaceAll(DOT, "");
        costDraft = costDraft.replaceAll(DOT, "");
        costNotaryOutsite = costNotaryOutsite.replaceAll(DOT, "");
        costOtherDetermine = costOtherDetermine.replaceAll(DOT, "");

        Long val1 = 0L;
        Long val2 = 0L;
        Long val3 = 0L;
        Long val4 = 0L;
        if (!EditString.isNull(costTt91) && EditString.isNumber(costTt91) && costTt91.length() < 20) {
            val1 = Long.parseLong(costTt91);
        }

        if (!EditString.isNull(costDraft) && EditString.isNumber(costDraft) && costDraft.length() < 20) {
            val2 = Long.parseLong(costDraft);
        }

        if (!EditString.isNull(costNotaryOutsite) && EditString.isNumber(costNotaryOutsite) && costNotaryOutsite.length() < 20) {
            val3 = Long.parseLong(costNotaryOutsite);
        }

        if (!EditString.isNull(costOtherDetermine) && EditString.isNumber(costOtherDetermine) && costOtherDetermine.length() < 20) {
            val4 = Long.parseLong(costOtherDetermine);
        }

        // render html
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(val1 + val2 + val3 + val4);
        out.flush();

        return null;
    }
    
}

package com.osp.npo.app.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.lucene.index.IndexWriter;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.common.global.Constants;
import com.osp.npo.core.prevent.DataPreventList;
import com.osp.npo.core.prevent.TransactionPropertyList;
import com.osp.npo.service.LucenePreventService;
import com.osp.npo.service.LuceneTransactionPropertyService;
import com.osp.npo.service.PreventService;

public class SystemConfigAction extends BaseMDAction {

    private static final String SUCCESS = "success";

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

        createTitle(Constants.SCREEN_ADM018);

        return mapping.findForward(SUCCESS);
    }

    /**
     * <P>Action for create index</P>
     *
     * @author HungPT
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward createIndex(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception, IOException {
    	
    	
    	//For data prevent
    	LucenePreventService lpService = new LucenePreventService();
    	lpService.createIndexFile();
    	
    	IndexWriter preventWriter = lpService.openWriter();
    	
    	PreventService preventService = new PreventService(getConnection());
    	DataPreventList dplist = preventService.queryAllDataPrevent(false);
    	if (dplist.size() > 0) {
    		for (int i = 0; i < dplist.size(); i++) {
    			if (!dplist.get(i).getDeleteFlg()) {
    				lpService.entryDataPreventDocument(preventWriter, dplist.get(i));
    			}
    		}
    	}
    	
    	preventWriter.optimize();
    	preventWriter.close();
    	
    	//For transaction property
    	LuceneTransactionPropertyService ltpService = new LuceneTransactionPropertyService();
    	ltpService.createIndexFile();
    	
    	IndexWriter tpWriter = ltpService.openWriter();
    	int totalcount = preventService.countTotalTransactionProperty();
    	TransactionPropertyList tplist = preventService.queryTransactionProperty(false,1,totalcount+1);
    	if (tplist.size() > 0) {
    		for (int i = 0; i < tplist.size(); i++) {
    			ltpService.entryTransactionPropertyDocument(tpWriter, tplist.get(i));
    			
    		}
    	}
    	
    	tpWriter.optimize();
    	tpWriter.close();
    	
    	ActionMessages messages = new ActionMessages();
        messages.add((new MessageUtil()).createActionMessages("msg_create_index_success"));
        this.addMessages(request, messages);
        
    	return mapping.findForward(SUCCESS);
    }
}

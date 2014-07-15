/**
 * 
 */
package com.osp.npo.app.action;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.osp.npo.app.viewhelper.ContractHistoryDetailViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.OrderField.OrderType;
import com.osp.npo.core.contractHistory.ContractHistoryList;
import com.osp.npo.service.ContractHistoryService;

/**
 * @author SonHD
 * @version $Revision: 23935 $
 */
public class ContractHistoryDetailAction extends BaseMDAction {
    private static final String SUCCESS = "success";
    private static final String NO_LOGIN = "nologin";
    private static final String CONTRACT_ID = "contractId";
    private static final String ID = "Id";
    private static final String ORDER_FIELD = "hid";
    
   
    /**
     * View action
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws SQLException
     * @throws Exception
     */
    public ActionForward view(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, SQLException, Exception {
        createTitle(Constants.SCREEN_CNTR018);
        ContractHistoryDetailViewHelper contractViewHelper = new ContractHistoryDetailViewHelper();
        
        if (contractViewHelper == null) {
        	return mapping.findForward(NO_LOGIN);
        }
        
        if (request.getParameter(CONTRACT_ID) != null) {
        	long contractId = Long.parseLong(request.getParameter(CONTRACT_ID));
        	setContractHistoryList(contractViewHelper,null,contractId);
        }
        if (request.getParameter(ID) != null){
        	long id = Long.parseLong(request.getParameter(ID));
        	contractViewHelper.setIsOpen(id);
        }
        

        request.getSession().setAttribute(ContractHistoryDetailViewHelper.SESSION_KEY,contractViewHelper);
        return mapping.findForward(SUCCESS);
    }
    
    /**
     * Set list
     * @param contractHistoryDetailViewHelper
     * @param direction
     * @param contractId
     * @throws SQLException
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    private void setContractHistoryList(ContractHistoryDetailViewHelper contractHistoryDetailViewHelper
			, String direction,long contractId) 
		throws SQLException, IOException{
    	
    	ContractHistoryService service = new ContractHistoryService(getConnection());
    	
    	contractHistoryDetailViewHelper.setContractHistoryList(null);
    	service.setTpidFilter(contractId);
    	int totalCount = service.countTotalContractHistory();
    	contractHistoryDetailViewHelper.setTotalCount(totalCount);
    	
    	if(totalCount>0){
    		int totalPage = pageCalculation(totalCount, getLineMax());
    		contractHistoryDetailViewHelper.setTotalPage(totalPage);
    		contractHistoryDetailViewHelper.setPage(pageTransition(direction,contractHistoryDetailViewHelper.getPage(), totalPage));
    		service.addOrderFieldName(new OrderField(ORDER_FIELD,OrderType.ASC));
    		ContractHistoryList contractHistoryList =  service.queryContractHistory(false,contractHistoryDetailViewHelper.getPage(), getLineMax());
    		contractHistoryDetailViewHelper.setContractHistoryList(contractHistoryList.getList());
    	}
    }
}
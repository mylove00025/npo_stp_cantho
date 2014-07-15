package com.osp.npo.app.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.osp.npo.app.context.ContractHistoryListContext;
import com.osp.npo.app.form.ContractHistoryListForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.ContractHistoryListViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.global.Constants.FilterKind;
import com.osp.npo.common.util.EditString;
import com.osp.npo.core.OrderField;
import com.osp.npo.core.OrderField.OrderType;
import com.osp.npo.core.contractHistory.ContractHistoryList;
import com.osp.npo.service.ContractHistoryService;
import com.osp.npo.service.OfficeService;

/**
 * List of contract kind page
 * 
 * @author HaiNT
 * @version $Revision: 19134 $
 */
public class ContractHistoryListAction extends BaseMDAction {
	public static final String SUCCESS_PATH = "success";
	private static final Integer FIRST_PAGE = 1;
	private static final String ORDER_FIELD = "execute_date_time";

	/**
	 * View action
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
    public ActionForward view(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws SQLException,
	        IOException {
		createTitle(Constants.SCREEN_ADM004);

		ContractHistoryListViewHelper view = new ContractHistoryListViewHelper();
		ContractHistoryListContext context = new ContractHistoryListContext();
		context.reset();

		OfficeService officeService = new OfficeService(getConnection());
		officeService.setHidFlagFilter(Boolean.FALSE);
		officeService.setOfficeTypeFilter(Constants.OFFICE_TYPE_NOTARY);
		officeService.addOrderFieldNotary(new OrderField("name"));
		view.setOfficeList(officeService.queryAllNotaryOffice(false).getList());
		
		setContractHistoryList(view, context, null);

		request.getSession().setAttribute(ContractHistoryListContext.SESSION_KEY, context);
		request.getSession().setAttribute(ContractHistoryListViewHelper.SESSION_KEY, view);

		return mapping.findForward(SUCCESS_PATH);
	}

	/**
	 * Back action
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward back(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ContractHistoryListContext context = getContractListContext(request);

		ContractHistoryListViewHelper viewHelper = (ContractHistoryListViewHelper) request.getSession().getAttribute(
		        ContractHistoryListViewHelper.SESSION_KEY);

		setContractHistoryList(viewHelper, context, null);

		return mapping.findForward(SUCCESS_PATH);
	}

	/**
	 * Search action
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward search(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ContractHistoryListContext context = getContractListContext(request);

		ContractHistoryListForm kindListForm = (ContractHistoryListForm) form;

		context.reset();
		setContext(context, kindListForm);

		ContractHistoryListViewHelper viewHelper = (ContractHistoryListViewHelper) request.getSession().getAttribute(
		        ContractHistoryListViewHelper.SESSION_KEY);
		viewHelper.reset(kindListForm);
		viewHelper.setPage(FIRST_PAGE);
		setContractHistoryList(viewHelper, context, null);

		if (viewHelper.getTotalCount() == 0) {
			MessageUtil mu = new MessageUtil();
			saveMessages(request, mu.createActionMessages("", request, "msg_data_not_exist", "item_history_contract"));
		}

		return mapping.findForward(SUCCESS_PATH);
	}
	
	/**
	 * Paging action
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward page(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ContractHistoryListContext context = getContractListContext(request);
		ContractHistoryListForm f = (ContractHistoryListForm) form;

		ContractHistoryListViewHelper viewHelper = (ContractHistoryListViewHelper) request.getSession().getAttribute(
		        ContractHistoryListViewHelper.SESSION_KEY);
		setContractHistoryList(viewHelper, context, f.getDirection());

		return mapping.findForward(SUCCESS_PATH);
	}

	/**
	 * Get context
	 * @param request
	 * @return
	 */
	private ContractHistoryListContext getContractListContext(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ContractHistoryListContext context = (ContractHistoryListContext) session.getAttribute(ContractHistoryListContext.SESSION_KEY);

		if (context == null) {
			context = new ContractHistoryListContext();
			session.setAttribute(ContractHistoryListContext.SESSION_KEY, context);
		}

		return context;

	}

	/**
	 * Set list
	 * @param contractHistoryViewHelper
	 * @param ContractHistoryContext
	 * @param direction
	 * @throws SQLException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
    private void setContractHistoryList(ContractHistoryListViewHelper contractHistoryViewHelper, ContractHistoryListContext ContractHistoryContext,
	        String direction) throws SQLException, IOException {

		ContractHistoryService service = new ContractHistoryService(getConnection());
		setSearchFilter(ContractHistoryContext, service);

		contractHistoryViewHelper.setContractHistoryList(null);

		int totalCount = service.countTotalContractHistory();
		contractHistoryViewHelper.setTotalCount(totalCount);

		if (totalCount > 0) {
			int totalPage = pageCalculation(totalCount, getLineMax());
			contractHistoryViewHelper.setTotalPage(totalPage);
			contractHistoryViewHelper.setPage(pageTransition(direction, contractHistoryViewHelper.getPage(), totalPage));
			service.addOrderFieldName(new OrderField(ORDER_FIELD, OrderType.DESC));
			ContractHistoryList contractHistoryList = service.queryContractHistory(false, contractHistoryViewHelper.getPage(), getLineMax());
			contractHistoryViewHelper.setContractHistoryList(contractHistoryList.getList());
		}
	}

	/**
	 * Set filter
	 * @param contractHistoryContext
	 * @param contractHistoryService
	 */
	private void setSearchFilter(ContractHistoryListContext contractHistoryContext, ContractHistoryService contractHistoryService) {
		if (contractHistoryContext.getContractNumber() != null && contractHistoryContext.getContractNumber().length() > 0) {
			contractHistoryService.setContractNumberFilter(contractHistoryContext.getContractNumber(), FilterKind.MIDDLE);
		}
		
		if (contractHistoryContext.getContractContent() != null && contractHistoryContext.getContractContent().length() > 0) {
			contractHistoryService.setContractContentFilter(contractHistoryContext.getContractContent(), FilterKind.MIDDLE);
		}

		if (!EditString.isNull(contractHistoryContext.getOfficeCode())) {
			contractHistoryService.setOfficeCode(contractHistoryContext.getOfficeCode());
		}
	}

	/**
	 * Set context
	 * @param context
	 * @param historyListForm
	 */
	private void setContext(ContractHistoryListContext context, ContractHistoryListForm historyListForm) {
		context.setContractNumber(historyListForm.getContractNumber());
		context.setContractContent(historyListForm.getContractContent());
		context.setOfficeCode(historyListForm.getOfficeCode());
	}

}

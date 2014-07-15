package com.osp.npo.app.viewhelper;

import java.util.List;

import com.osp.npo.app.form.ContractHistoryListForm;
import com.osp.npo.core.contractHistory.ContractHistoryInfo;
import com.osp.npo.core.office.NotaryOfficeInfo;

public class ContractHistoryListViewHelper extends AbstractPageListViewHelper{

    public static final String SESSION_KEY = "contractHistoryListViewHelper";

    private List<ContractHistoryInfo> contractHistoryList;
    
	private String contractNumber;
	
	private String direction;

	private String contractContent;
	
	private String officeCode;
	
	private List<NotaryOfficeInfo> officeList;


	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	

    /**
	 * @return the contractHistoryList
	 */
	public List<ContractHistoryInfo> getContractHistoryList() {
		return contractHistoryList;
	}

	/**
	 * @param contractHistoryList the contractHistoryList to set
	 */
	public void setContractHistoryList(List<ContractHistoryInfo> contractHistoryList) {
		this.contractHistoryList = contractHistoryList;
	}

	/**
	 * @return the contractNumber
	 */
	public String getContractNumber() {
		return contractNumber;
	}

	/**
	 * @param contractNumber the contractNumber to set
	 */
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	/**
	 * @return the contractContent
	 */
	public String getContractContent() {
		return contractContent;
	}

	/**
	 * @param contractContent the contractContent to set
	 */
	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	/**
     * Get officeCode
     * @return the officeCode
     */
    public String getOfficeCode() {
    	return officeCode;
    }

	/**
     * Set officeCode
     * @param officeCode the officeCode to set
     */
    public void setOfficeCode(String officeCode) {
    	this.officeCode = officeCode;
    }

	/**
     * Get officeList
     * @return the officeList
     */
    public List<NotaryOfficeInfo> getOfficeList() {
    	return officeList;
    }

	/**
     * Set officeList
     * @param officeList the officeList to set
     */
    public void setOfficeList(List<NotaryOfficeInfo> officeList) {
    	this.officeList = officeList;
    }

	public void reset(ContractHistoryListForm f) {
        contractNumber = f.getContractNumber();	
        contractContent = f.getContractContent();
        officeCode = f.getOfficeCode();
    }

}
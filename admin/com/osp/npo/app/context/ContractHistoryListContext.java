/**
 * 
 */
package com.osp.npo.app.context;

/**
 * @author PhuongNT
 *
 */
public class ContractHistoryListContext {
	
    /** session key */
    public static final String SESSION_KEY = "contractHistoryListContext";   
    
    private String contractNumber;
    
    private String contractContent;
    
    private String officeCode;

    
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


	public void reset() {
		// TODO Auto-generated method stub
		this.contractNumber = null;
		this.contractContent = null;
		this.officeCode = null;
	}
    
}

package com.osp.npo.app.context;

/**
 * <P>Context for User Edit</P>
 *
 * @author SonHD
 * @version $Revision: 17785 $
 *
 */
public class NotaryOfficeEditContext {
    /** session key */
    public static final String SESSION_KEY = "notaryOfficeEditContext";

    private Long officeId;
    private String officeName;
    private String authenticationId;
    
    
	/**
	 * @return the officeId
	 */
	public Long getOfficeId() {
		return officeId;
	}
	/**
	 * @param officeId the officeId to set
	 */
	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}
	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}
	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	/**
	 * @return the authenticationId
	 */
	public String getAuthenticationId() {
		return authenticationId;
	}
	/**
	 * @param authenticationId the authenticationId to set
	 */
	public void setAuthenticationId(String authenticationId) {
		this.authenticationId = authenticationId;
	}
}

package com.osp.npo.app.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

import com.osp.npo.app.viewhelper.NotaryOfficeEditViewHelper;

/**
 * <P>Form for User Entry</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20306 $
 */
public class NotaryOfficeEditForm extends ValidatorForm {

    
    private static final long serialVersionUID = -1269630214861249062L;

    private Long noid;

    private String name;

    private String address;

    private String phone;

    private String fax;

    private String email;

    private String website;

    private String otherInfo;

    private String macAddress;

    private String authenticationId;

    private String authenticationCode;

    private Boolean activeFlg;

    private Boolean hiddenFlg;
    
    private String direction;

    /*
     *
     * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

        NotaryOfficeEditViewHelper view = (NotaryOfficeEditViewHelper)request.getSession().getAttribute(NotaryOfficeEditViewHelper.SESSION_KEY);
        if (view == null) {
            return new ActionErrors();
        }

        ActionErrors errors = super.validate(mapping, request);

        if (errors.size() > 0) {
            view.reset(this);
        }
        return errors;
    }

    /**
     * Get the noid
     *
     * @return the noid
     */
    public Long getNoid() {
        return noid;
    }

    /**
     * Set the noid
     *
     * @param noid the noid to set
     */
    public void setNoid(Long noid) {
        this.noid = noid;
    }

    /**
     * Get the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address
     *
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the phone
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the phone
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get the fax
     *
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Set the fax
     *
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Get the email
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the website
     *
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Set the website
     *
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Get the otherInfo
     *
     * @return the otherInfo
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * Set the otherInfo
     *
     * @param otherInfo the otherInfo to set
     */
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    /**
     * Get the macAddress
     *
     * @return the macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Set the macAddress
     *
     * @param macAddress the macAddress to set
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * Get the authenticationId
     *
     * @return the authenticationId
     */
    public String getAuthenticationId() {
        return authenticationId;
    }

    /**
     * Set the authenticationId
     *
     * @param authenticationId the authenticationId to set
     */
    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    /**
     * Get the authenticationCode
     *
     * @return the authenticationCode
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Set the authenticationCode
     *
     * @param authenticationCode the authenticationCode to set
     */
    public void setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
    }

    /**
     * Get the activeFlg
     *
     * @return the activeFlg
     */
    public Boolean getActiveFlg() {
        return activeFlg;
    }

    /**
     * Set the activeFlg
     *
     * @param activeFlg the activeFlg to set
     */
    public void setActiveFlg(Boolean activeFlg) {
        this.activeFlg = activeFlg;
    }

    /**
     * Get the hiddenFlg
     *
     * @return the hiddenFlg
     */
    public Boolean getHiddenFlg() {
        return hiddenFlg;
    }

    /**
     * Set the hiddenFlg
     *
     * @param hiddenFlg the hiddenFlg to set
     */
    public void setHiddenFlg(Boolean hiddenFlg) {
        this.hiddenFlg = hiddenFlg;
    }

    /**
     * Get the direction
     *
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Set the direction
     *
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

}

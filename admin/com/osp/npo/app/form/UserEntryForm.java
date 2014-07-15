package com.osp.npo.app.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

import com.osp.npo.app.context.NotaryOfficeEditContext;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.UserEntryViewHelper;

/**
 * <P>Form for User Entry</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20306 $
 */
public class UserEntryForm extends ValidatorForm {

    private static final long serialVersionUID = 3425450514297215640L;

    private String role;
    private String familyName;
    private String firstName;
    private String account;
    private String password;
    private String rePassword;
    private String birthday;
    private Boolean sex;
    private String address;
    private String email;
    private String telephone;
    private String mobile;
    private Boolean activeFlg;
    private Boolean preventAuthority;

    /*
     *
     * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request) {

        UserEntryViewHelper view = (UserEntryViewHelper)
            request.getSession().getAttribute(UserEntryViewHelper.SESSION_KEY);
        if (view == null) {
            return new ActionErrors();
        }

        NotaryOfficeEditContext notaryContext = (NotaryOfficeEditContext) request.getSession()
    		.getAttribute(NotaryOfficeEditContext.SESSION_KEY);
        if (notaryContext == null) {
            return new ActionErrors();
        }
        
        ActionErrors errors = super.validate(mapping, request);
        
        if (notaryContext.getAuthenticationId().length() + this.account.length() > 26) {
        	MessageUtil messageUtil = new MessageUtil();
        	errors.add(messageUtil.createActionMessages("account", request, "err_max_length","item_account","26"));        	
        }

        if (errors.size() > 0) {
            view.reset(this);
        }

        return errors;
    }

    /**
     * Get the email
     *
     * @return the email
     */
    public String getEmail() {
        if (email != null) {
            return email.trim();
        }
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
     * Get the familyName
     *
     * @return the familyName
     */
    public String getFamilyName() {
        if (familyName != null) {
            return familyName.trim();
        }
        return familyName;
    }

    /**
     * Set the familyName
     *
     * @param familyName the familyName to set
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * Get the firstName
     *
     * @return the firstName
     */
    public String getFirstName() {
        if (firstName != null) {
            return firstName.trim();
        }
        return firstName;
    }

    /**
     * Set the firstName
     *
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the account
     *
     * @return the account
     */
    public String getAccount() {
        if (account != null) {
            return account.trim();
        }
        return account;
    }

    /**
     * Set the account
     *
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Get the password
     *
     * @return the password
     */
    public String getPassword() {
        if (password != null) {
            return password.trim();
        }
        return password;
    }

    /**
     * Set the password
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the rePassword
     *
     * @return the rePassword
     */
    public String getRePassword() {
        if (rePassword != null) {
            return rePassword.trim();
        }
        return rePassword;
    }

    /**
     * Set the rePassword
     *
     * @param rePassword the rePassword to set
     */
    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    /**
     * Get the birthday
     *
     * @return the birthday
     */
    public String getBirthday() {
        if (birthday != null) {
            return birthday.trim();
        }
        return birthday;
    }

    /**
     * Set the birthday
     *
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Get the sex
     *
     * @return the sex
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * Set the sex
     *
     * @param sex the sex to set
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * Get the address
     *
     * @return the address
     */
    public String getAddress() {
        if (address != null) {
            return address.trim();
        }
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
     * Get the telephone
     *
     * @return the telephone
     */
    public String getTelephone() {
        if (telephone != null) {
            return telephone.trim();
        }
        return telephone;
    }

    /**
     * Set the telephone
     *
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Get the mobile
     *
     * @return the mobile
     */
    public String getMobile() {
        if (mobile != null) {
            return mobile.trim();
        }
        return mobile;
    }

    /**
     * Set the mobile
     *
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * Get the role
     *
     * @return the role
     */
    public String getRole() {
        if (role != null) {
            return role.trim();
        }
        return role;
    }

    /**
     * Set the role
     *
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Get preventAuthority
     * @return the preventAuthority
     */
    public Boolean getPreventAuthority() {
        return preventAuthority;
    }

    /**
     * Set preventAuthority
     * @param preventAuthority the preventAuthority to set
     */
    public void setPreventAuthority(Boolean preventAuthority) {
        this.preventAuthority = preventAuthority;
    }

}

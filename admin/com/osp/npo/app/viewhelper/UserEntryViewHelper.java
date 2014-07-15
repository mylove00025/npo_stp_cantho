package com.osp.npo.app.viewhelper;

import com.osp.npo.app.form.UserEntryForm;


/**
 * <P>User Entry View Helper</P>
 *
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20306 $
 */
public class UserEntryViewHelper extends AbstractPageListViewHelper {
    public static final String SESSION_KEY = "userEntryViewHelper";

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

   
	/**
     * Reset viewhelper
     * @param f
     */
    public void reset(UserEntryForm f) {
        familyName = f.getFamilyName();
        firstName = f.getFirstName();
        account = f.getAccount();
        password = "";
        rePassword = "";
        birthday = f.getBirthday();
        sex = f.getSex();
        address = f.getAddress();
        email = f.getEmail();
        telephone = f.getTelephone();
        mobile = f.getMobile();
        role = f.getRole();
        activeFlg = f.getActiveFlg();
        //adminAuthority = f.getAdminAuthority();
        preventAuthority = f.getPreventAuthority();
    }

    /**
     * Get the familyName
     *
     * @return the familyName
     */
    public String getFamilyName() {
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
     * Get the telephone
     *
     * @return the telephone
     */
    public String getTelephone() {
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

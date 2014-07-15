package com.osp.npo.app.context;

import java.util.ArrayList;

import com.osp.npo.common.global.Constants;
import com.osp.npo.core.common.SystemConfigInfo;
import com.osp.npo.core.common.SystemConfigList;
import com.osp.npo.core.office.NotaryOfficeInfo;
import com.osp.npo.core.user.UserAuthorityInfo;
import com.osp.npo.core.user.UserInfo;

/**
 * CommonContext class
 *
 * @author HaiNT
 * @version $Revision: 20542 $
 */
public class CommonContext {

    public static final String SESSION_KEY = "CommonContext";

    private NotaryOfficeInfo notaryOfficeInfo = null;
    private UserInfo userInfo = null;
    private ArrayList<UserAuthorityInfo> authorityList = null;
    private String screenTitle;
    private String subMenu;
    private String screenId;
    private SystemConfigList systemConfigList;
    private Boolean loginFromClient = false;
    private String clientInfo;

    public CommonContext() {
        authorityList = new ArrayList<UserAuthorityInfo>();
    }

    /**
     * @return the notaryOfficeInfo
     */
    public NotaryOfficeInfo getNotaryOfficeInfo() {
        return notaryOfficeInfo;
    }


    /**
     * @param notaryOfficeInfo the notaryOfficeInfo to set
     */
    public void setNotaryOfficeInfo(NotaryOfficeInfo notaryOfficeInfo) {
        this.notaryOfficeInfo = notaryOfficeInfo;
    }

    /**
     * @return the userInfo
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * @param userInfo
     *            the userInfo to set
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * @return the authorityList
     */
    public ArrayList<UserAuthorityInfo> getAuthorityList() {
        return authorityList;
    }

    /**
     * @param authorityList the authorityList to set
     */
    public void setAuthorityList(ArrayList<UserAuthorityInfo> authorityList) {
        this.authorityList = authorityList;
    }

    /**
     * @param functionType
     * @return boolean, true if the user has function type
     */
    private boolean isHasFunctionType(String functionType) {
        boolean isHas = false;
        for (UserAuthorityInfo info : authorityList) {
            // check function type
            if (functionType.equals(info.getAuthorityCode())) {
                isHas = true;
                break;
            }
        }

        return isHas;
    }

    /**
     * @return true, current user has authority as Management
     */
    public boolean isAdmin() {
        if (isHasFunctionType(Constants.AUTHORITY_ADMIN)) {
            if (Constants.OFFICE_TYPE_JUSTICE.equals(this.notaryOfficeInfo.getOfficeType())) {
                return true;
            }
        }
        return false;
    }


    /**
     * @return true, current user has announcement authority
     */
    public boolean isAnnouncementManagement() {
        if (isHasFunctionType(Constants.AUTHORITY_ANNOUNCEMENT)) {
            if (Constants.OFFICE_TYPE_JUSTICE.equals(this.notaryOfficeInfo.getOfficeType())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check prevent data authority
     *
     * @return true, current user has prevent data authority
     */
    public boolean isPreventData() {
        return isHasFunctionType(Constants.AUTHORITY_PREVENT_DATA);
    }

    /**
     * @return System Office Name
     */
    public String getSystemOfficeName() {
        //return SystemProperties.getProperty("system_ofice_name");
        return getSystemConfigValue("notary_office_name");
    }


    /**
     * @return Property Prevent Land Address
     */
    public String getPropertyPreventLandAddress() {
        return getSystemConfigValue("npo_property_prevent_land_address");
    }

    /**
     * @return Property Prevent Land Certificate
     */
    public String getPropertyPreventLandCertificate() {
        return getSystemConfigValue("npo_property_prevent_land_certificate");
    }

    /**
     * @return Property Prevent Land Issue Place
     */
    public String getPropertyPreventLandIssuePlace() {
        return getSystemConfigValue("npo_property_prevent_land_issue_place");
    }

    /**
     * @return Property Prevent Land Issue Date
     */
    public String getPropertyPreventLandIssueDate() {
        return getSystemConfigValue("npo_property_prevent_land_issue_date");
    }

    /**
     * @return Property Prevent Land Number
     */
    public String getPropertyPreventLandNumber() {
        return getSystemConfigValue("npo_property_prevent_land_number");
    }

    /**
     * @return Property Prevent Land Map Number
     */
    public String getPropertyPreventLandMapNumber() {
        return getSystemConfigValue("npo_property_prevent_land_map_number");
    }

    /**
     * @return Property Prevent Land Area
     */
    public String getPropertyPreventLandArea() {
        return getSystemConfigValue("npo_property_prevent_land_area");
    }

    /**
     * @return Property Prevent Land Private Area
     */
    public String getPropertyPreventLandPrivateArea() {
        return getSystemConfigValue("npo_property_prevent_land_private_area");
    }

    /**
     * @return Property Prevent Land Public Area
     */
    public String getPropertyPreventLandPublicArea() {
        return getSystemConfigValue("npo_property_prevent_land_public_area");
    }

    /**
     * @return Property Prevent Land Use Purpose
     */
    public String getPropertyPreventLandUsePurpose() {
        return getSystemConfigValue("npo_property_prevent_land_use_purpose");
    }

    /**
     * @return Property Prevent Land Use Period
     */
    public String getPropertyPreventLandUsePeriod() {
        return getSystemConfigValue("npo_property_prevent_land_use_period");
    }

    /**
     * @return Property Prevent Land Use Origin
     */
    public String getPropertyPreventLandUseOrigin() {
        return getSystemConfigValue("npo_property_prevent_land_use_origin");
    }

    /**
     * @return Property Prevent Land Associate Property
     */
    public String getPropertyPreventLandAssociateProperty() {
        return getSystemConfigValue("npo_property_prevent_land_associate_property");
    }

    /**
     * @return Property Prevent Land District
     */
    public String getPropertyPreventLandDistrict() {
        return getSystemConfigValue("npo_property_prevent_land_district");
    }

    /**
     * @return Property Prevent Land Province
     */
    public String getPropertyPreventLandProvince() {
        return getSystemConfigValue("npo_property_prevent_land_province");
    }

    /**
     * @return Property Prevent Car License Number
     */
    public String getPropertyPreventCarLicenseNumber() {
        return getSystemConfigValue("npo_property_prevent_car_license_number");
    }

    /**
     * @return Property Prevent Car Regist Number
     */
    public String getPropertyPreventCarRegistNumber() {
        return getSystemConfigValue("npo_property_prevent_car_regist_number");
    }

    /**
     * @return Property Prevent Car Issue Place
     */
    public String getPropertyPreventCarIssuePlace() {
        return getSystemConfigValue("npo_property_prevent_car_issue_place");
    }

    /**
     * @return Property Prevent Car IssueDate
     */
    public String getPropertyPreventCarIssueDate() {
        return getSystemConfigValue("npo_property_prevent_car_issue_date");
    }

    /**
     * @return Property Prevent Car Frame Number
     */
    public String getPropertyPreventCarFrameNumber() {
        return getSystemConfigValue("npo_property_prevent_car_frame_number");
    }

    /**
     * @return Property Prevent Car Machine Number
     */
    public String getPropertyPreventCarMachineNumber() {
        return getSystemConfigValue("npo_property_prevent_car_machine_number");
    }

    /**
     * Get screen title
     *
     * @return the screenTitle
     */
    public String getScreenTitle() {
        return screenTitle;
    }

    /**
     * Set screen title
     *
     * @param screenTitle the screenTitle to set
     */
    public void setScreenTitle(String screenTitle) {
        this.screenTitle = screenTitle;
    }

    /**
     * Get System config list
     *
     * @return the systemConfigList
     */
    public SystemConfigList getSystemConfigList() {
        return systemConfigList;
    }

    /**
     * Set Get System config list
     *
     * @param systemConfigList the systemConfigList to set
     */
    public void setSystemConfigList(SystemConfigList systemConfigList) {
        this.systemConfigList = systemConfigList;
    }

    /**
     * Get the screenId
     *
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * Set the screenId
     *
     * @param screenId the screenId to set
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * Get the subMenu
     *
     * @return the subMenu
     */
    public String getSubMenu() {
        return subMenu;
    }

    /**
     * Set the subMenu
     *
     * @param subMenu the subMenu to set
     */
    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }

    /**
     * Get system config value by key
     *
     * @param key Input key
     * @return system config value
     */
    public String getSystemConfigValue(String key) {
        if (this.systemConfigList == null) {
            return null;
        }

        for (int i= 0; i < this.systemConfigList.size(); i++) {
            SystemConfigInfo scInfo = this.systemConfigList.get(i);
            if (key.equals(scInfo.getConfigKey())) {
                return scInfo.getConfigValue();
            }
        }

        return null;
    }

	/**
	 * @param loginFromClient the loginFromClient to set
	 */
	public void setLoginFromClient(Boolean loginFromClient) {
		this.loginFromClient = loginFromClient;
	}

	/**
	 * @return the loginFromClient
	 */
	public Boolean getLoginFromClient() {
		return loginFromClient;
	}

	/**
	 * Get clientInfo
	 * @return the clientInfo
	 */
	public String getClientInfo() {
		return clientInfo;
	}

	/**
	 * Set clientInfo
	 * @param clientInfo the clientInfo to set
	 */
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}

}

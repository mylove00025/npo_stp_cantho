package com.osp.npo.core.common;


import com.osp.npo.core.AbstractInfo;
import java.sql.Timestamp;


/**
 * Generate by script
 * Generate date: 10/28/2010 12:04:18 PM
 * @version $Revision: 17046 $
 */
public class SystemConfigInfo extends AbstractInfo {


    /** id t? tang */
    private Long id;

    /** M� s?  */
    private String configKey;

    /** Gi� tr? */
    private String configValue;

    /** T�n ngu?i t?o */
    private String entryUserName;

    /** Ng�y t?o */
    private Timestamp entryDateTime;

    /** id ngu?i c?p nh?t cu?i */
    private Long updateUserId;

    /** T�n ngu?i c?p nh?t cu?i */
    private String updateUserName;

    /** Ng�y c?p nh?t cu?i */
    private Timestamp updateDateTime;


    /**
     * <P>Generate Instance.</P>
     *
     */
    public SystemConfigInfo() {
        super();
    }


    /**
     * <P>Get id t? tang </P>
     *
     * @return id t? tang
     */
    public Long getId() {
        return this.id;
    }

    /**
     * <P>Set id t? tang. </P>
     *
     * @param id id t? tang
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the configKey
     *
     * @return the configKey
     */
    public String getConfigKey() {
        return configKey;
    }


    /**
     * Set the configKey
     *
     * @param configKey the configKey to set
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }


    /**
     * Get the configValue
     *
     * @return the configValue
     */
    public String getConfigValue() {
        return configValue;
    }


    /**
     * Set the configValue
     *
     * @param configValue the configValue to set
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }


    /**
     * <P>Get T�n ngu?i t?o </P>
     *
     * @return T�n ngu?i t?o
     */
    public String getEntryUserName() {
        return this.entryUserName;
    }

    /**
     * <P>Set T�n ngu?i t?o. </P>
     *
     * @param entryUserName T�n ngu?i t?o
     */
    public void setEntryUserName(String entryUserName) {
        this.entryUserName = entryUserName;
    }

    /**
     * <P>Get Ng�y t?o </P>
     *
     * @return Ng�y t?o
     */
    public Timestamp getEntryDateTime() {
        return this.entryDateTime;
    }

    /**
     * <P>Set Ng�y t?o. </P>
     *
     * @param entryDateTime Ng�y t?o
     */
    public void setEntryDateTime(Timestamp entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    /**
     * <P>Get id ngu?i c?p nh?t cu?i </P>
     *
     * @return id ngu?i c?p nh?t cu?i
     */
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    /**
     * <P>Set id ngu?i c?p nh?t cu?i. </P>
     *
     * @param updateUserId id ngu?i c?p nh?t cu?i
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * <P>Get T�n ngu?i c?p nh?t cu?i </P>
     *
     * @return T�n ngu?i c?p nh?t cu?i
     */
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    /**
     * <P>Set T�n ngu?i c?p nh?t cu?i. </P>
     *
     * @param updateUserName T�n ngu?i c?p nh?t cu?i
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    /**
     * <P>Get Ng�y c?p nh?t cu?i </P>
     *
     * @return Ng�y c?p nh?t cu?i
     */
    public Timestamp getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <P>Set Ng�y c?p nh?t cu?i. </P>
     *
     * @param updateDateTime Ng�y c?p nh?t cu?i
     */
    public void setUpdateDateTime(Timestamp updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}

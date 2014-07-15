package com.osp.npo.core.prevent;


import com.osp.npo.core.AbstractInfo;
import java.sql.Timestamp;


/**
 * Generate by script
 * Generate date: 1/24/2011 2:41:43 PM
 * @version $Revision$ 
 */
public class DataPreventHistoryInfo extends AbstractInfo {


    /** id l?ch s? */
    private Long hid;

    /** ID DLNC */
    private Long preventId;

    /** Th�ng tin m�y truy c?p(IP, �) */
    private String clientInfo;

    /** Th?i di?m thao t�c */
    private Timestamp executeDateTime;

    /** Ngu?i thao t�c */
    private String executePerson;

    /** N?i dung thao t�c */
    private String executeContent;


    /**
     * <P>Generate Instance.</P>
     *
     */
    public DataPreventHistoryInfo() {
        super();
    }


    /**
     * <P>Get id l?ch s? </P>
     *
     * @return id l?ch s?
     */
    public Long getHid() {
        return this.hid;
    }

    /**
     * <P>Set id l?ch s?. </P>
     *
     * @param hid id l?ch s?
     */
    public void setHid(Long hid) {
        this.hid = hid;
    }

    /**
     * <P>Get ID DLNC </P>
     *
     * @return ID DLNC
     */
    public Long getPreventId() {
        return this.preventId;
    }

    /**
     * <P>Set ID DLNC. </P>
     *
     * @param preventId ID DLNC
     */
    public void setPreventId(Long preventId) {
        this.preventId = preventId;
    }

    /**
     * <P>Get Th�ng tin m�y truy c?p(IP, �) </P>
     *
     * @return Th�ng tin m�y truy c?p(IP, �)
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    /**
     * <P>Set Th�ng tin m�y truy c?p(IP, �). </P>
     *
     * @param clientInfo Th�ng tin m�y truy c?p(IP, �)
     */
    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    /**
     * <P>Get Th?i di?m thao t�c </P>
     *
     * @return Th?i di?m thao t�c
     */
    public Timestamp getExecuteDateTime() {
        return this.executeDateTime;
    }

    /**
     * <P>Set Th?i di?m thao t�c. </P>
     *
     * @param executeDateTime Th?i di?m thao t�c
     */
    public void setExecuteDateTime(Timestamp executeDateTime) {
        this.executeDateTime = executeDateTime;
    }

    /**
     * <P>Get Ngu?i thao t�c </P>
     *
     * @return Ngu?i thao t�c
     */
    public String getExecutePerson() {
        return this.executePerson;
    }

    /**
     * <P>Set Ngu?i thao t�c. </P>
     *
     * @param executePerson Ngu?i thao t�c
     */
    public void setExecutePerson(String executePerson) {
        this.executePerson = executePerson;
    }

    /**
     * <P>Get N?i dung thao t�c </P>
     *
     * @return N?i dung thao t�c
     */
    public String getExecuteContent() {
        return this.executeContent;
    }

    /**
     * <P>Set N?i dung thao t�c. </P>
     *
     * @param executeContent N?i dung thao t�c
     */
    public void setExecuteContent(String executeContent) {
        this.executeContent = executeContent;
    }
}

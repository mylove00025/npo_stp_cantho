package com.osp.npo.core.common;


import com.osp.npo.core.AbstractInfo;
import java.sql.Timestamp;


/**
 * Generate by script
 * Generate date: 02/17/2011 10:15:26 AM
 */
public class ExecuteHistoryInfo extends AbstractInfo {


    /** History ID */
    private Long hid;

    /** Client information (IP) */
    private String clientInfo;

    /** Execute date time */
    private Timestamp executeDateTime;

    /** Person information */
    private String executePerson;

    /** Execute content */
    private String executeContent;


    /**
     * <P>Generate Instance.</P>
     *
     */
    public ExecuteHistoryInfo() {
        super();
    }


    /**
     * <P>Get History ID </P>
     *
     * @return History ID
     */
    public Long getHid() {
        return this.hid;
    }

    /**
     * <P>Set History ID. </P>
     *
     * @param hid History ID
     */
    public void setHid(Long hid) {
        this.hid = hid;
    }

    /**
     * <P>Get Client information (IP) </P>
     *
     * @return Client information (IP)
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    /**
     * <P>Set Client information (IP). </P>
     *
     * @param clientInfo Client information (IP)
     */
    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    /**
     * <P>Get Execute date time </P>
     *
     * @return Execute date time
     */
    public Timestamp getExecuteDateTime() {
        return this.executeDateTime;
    }

    /**
     * <P>Set Execute date time. </P>
     *
     * @param executeDateTime Execute date time
     */
    public void setExecuteDateTime(Timestamp executeDateTime) {
        this.executeDateTime = executeDateTime;
    }

    /**
     * <P>Get Person information </P>
     *
     * @return Person information
     */
    public String getExecutePerson() {
        return this.executePerson;
    }

    /**
     * <P>Set Person information. </P>
     *
     * @param executePerson Person information
     */
    public void setExecutePerson(String executePerson) {
        this.executePerson = executePerson;
    }

    /**
     * <P>Get Execute content </P>
     *
     * @return Execute content
     */
    public String getExecuteContent() {
        return this.executeContent;
    }

    /**
     * <P>Set Execute content. </P>
     *
     * @param executeContent Execute content
     */
    public void setExecuteContent(String executeContent) {
        this.executeContent = executeContent;
    }
}

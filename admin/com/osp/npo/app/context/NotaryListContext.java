/**
 * 
 */
package com.osp.npo.app.context;

import java.util.List;

import com.osp.npo.core.office.NotaryOfficeInfo;

/**
 * @author SonHD
 * @version $Revision: 20626 $
 */
public class NotaryListContext {
    public static final String SESSION_KEY = "notaryListContext";
    private String notaryNameFilter;
    private List<NotaryOfficeInfo> notaryList;
    private String[] chkID;
   
    /**
     * Get the notaryNameFilter
     *
     * @return the notaryNameFilter
     */
    
    public String getNotaryNameFilter() {
        return notaryNameFilter;
    }
    
    /**
     * Reset data
     */
    public void reset() {
        this.notaryNameFilter = null;
       
      
    }
    /**
     * Set the notaryNameFilter
     *
     * @param notaryNameFilter the notaryNameFilter to set
     */
    public void setNotaryNameFilter(String notaryNameFilter) {
        this.notaryNameFilter = notaryNameFilter;
    }
    /**
     * Get the announcementList
     *
     * @return the announcementList
     */
    public List<NotaryOfficeInfo> getNotaryList() {
        return notaryList;
    }
    /**
     * Set the notaryList
     *
     * @param notaryList the notaryList to set
     */
    public void setNotaryList(List<NotaryOfficeInfo> notaryList) {
        this.notaryList = notaryList;
    }
    /**
     * Get the chkID
     *
     * @return the chkID
     */
    public String[] getChkID() {
        return chkID;
    }
    /**
     * Set the chkID
     *
     * @param chkID the chkID to set
     */
    public void setChkID(String[] chkID) {
        this.chkID = chkID;
    }
    
    public void clear() {
        this.notaryNameFilter = null;
        this.chkID = null;
    }
}

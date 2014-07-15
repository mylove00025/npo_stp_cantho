/**
 * 
 */
package com.osp.npo.app.viewhelper;

import java.util.List;

import com.osp.npo.app.form.NotaryListForm;
import com.osp.npo.core.office.NotaryOfficeInfo;

/**
 * @author SonHD
 * @version $Revision: 20686 $
 */
public class NotaryListViewHelper extends AbstractPageListViewHelper {
    
    public static final String SESSION_KEY = "notaryListViewHelper";
    private String notaryNameFilter;
    private List<NotaryOfficeInfo> notaryList;
    private String[] chkID;
    private String chkAllID;
    
    /**
     * Get the notaryNameFilter
     *
     * @return the notaryNameFilter
     */
    public String getNotaryNameFilter() {
        return notaryNameFilter;
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
     * Set the announcementList
     *
     * @param announcementList the announcementList to set
     */
    public void setNotaryList(List<NotaryOfficeInfo> notaryList) {
        this.notaryList = notaryList;
    }
    /**
     * Get the chkID
     *
     * @return the chkID
     */
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
    
    /**
     * Get the chkAllID
     *
     * @return the chkAllID
     */
    public String getChkAllID() {
        return chkAllID;
    }
    /**
     * Set the chkAllID
     *
     * @param chkAllID the chkAllID to set
     */
    public void setChkAllID(String chkAllID) {
        this.chkAllID = chkAllID;
    }
    public void reset(NotaryListForm form) {
        this.notaryNameFilter = form.getNotaryNameFilter();        
        this.chkID = form.getChkID();
    }
}

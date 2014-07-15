/**
 * 
 */
package com.osp.npo.app.form;

import org.apache.struts.action.ActionForm;

/**
 * @author SonHD
 * @version $Revision: 20626 $
 */
public class NotaryListForm extends ActionForm {

    private static final long serialVersionUID = 4549166071634268494L;
    private String notaryNameFilter;
    private String direction;
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
     * Set the notaryNameFilter
     *
     * @param notaryNameFilter the notaryNameFilter to set
     */
    public void setNotaryNameFilter(String notaryNameFilter) {
        this.notaryNameFilter = notaryNameFilter;
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
}

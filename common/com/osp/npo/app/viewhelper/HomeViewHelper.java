package com.osp.npo.app.viewhelper;

import java.util.List;

import com.osp.npo.core.announcement.AnnouncementInfo;

/**
 *
 * Context of home page
 *
 * @author Giangvt
 * @version $Revision: 20577 $
 */
public class HomeViewHelper {

    public static final String SESSION_KEY = "homeViewHelper";
       
    private List<AnnouncementInfo> lstAnnouncementInfo;
    private AnnouncementInfo announcementInfoNew;
	private AnnouncementInfo announcementInfo;
    private String isShowPopup;
        
   
	/**
	 * @return the lstAnnouncementInfo
	 */
	public List<AnnouncementInfo> getLstAnnouncementInfo() {
		return lstAnnouncementInfo;
	}
	/**
	 * @param lstAnnouncementInfo the lstAnnouncementInfo to set
	 */
	public void setLstAnnouncementInfo(List<AnnouncementInfo> lstAnnouncementInfo) {
		this.lstAnnouncementInfo = lstAnnouncementInfo;
	}
	
	/**
	 * @return the announcementInfo
	 */
	public AnnouncementInfo getAnnouncementInfo() {
		return announcementInfo;
	}
	/**
	 * @param announcementInfo the announcementInfo to set
	 */
	public void setAnnouncementInfo(AnnouncementInfo announcementInfo) {
		this.announcementInfo = announcementInfo;
	}
	/**
	 * @return the isShowPopup
	 */
	public String getIsShowPopup() {
		return isShowPopup;
	}
	/**
	 * @param isShowPopup the isShowPopup to set
	 */
	public void setIsShowPopup(String isShowPopup) {
		this.isShowPopup = isShowPopup;
	}
	
	/**
	 * @return the announcementInfoNew
	 */
	public AnnouncementInfo getAnnouncementInfoNew() {
		return announcementInfoNew;
	}
	/**
	 * @param announcementInfoNew the announcementInfoNew to set
	 */
	public void setAnnouncementInfoNew(AnnouncementInfo announcementInfoNew) {
		this.announcementInfoNew = announcementInfoNew;
	}
    
	public int getPersonCount() {
		int count = 0;
		return count;
	}
}

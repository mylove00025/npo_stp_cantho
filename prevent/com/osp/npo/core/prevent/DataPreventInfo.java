package com.osp.npo.core.prevent;


import com.osp.npo.common.global.Constants;
import com.osp.npo.common.util.EditString;
import com.osp.npo.common.util.SystemMessageProperties;
import com.osp.npo.core.AbstractInfo;
import java.sql.Timestamp;


/**
 * Generate by script
 * Generate date: 1/22/2011 8:59:06 AM
 * @version $Revision: 27306 $
 */
public class DataPreventInfo extends AbstractInfo {

    /** id DLNC */
    private Long id;

    /** TÃ i s?n b? ch?n */
    private Long propertyId;

    /** Synchronize ID */
    private String synchronizeId;

    /** PhÃ¢n lo?i d? li?u ngan ch?n: */
    private String originKind;

    /** C? xÃ³a d? li?u */
    private Boolean deleteFlg;

    /** Ã�on v? dang kÃ½ CV ngan ch?n */
    private String preventRegistAgency;

    /** S? vÃ o s? cÃ´ng van yÃªu c?u */
    private String preventInBookNumber;

    /** ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n */
    private String preventPersonInfo;

    /** S? cÃ´ng van yÃªu c?u ngan ch?n */
    private String preventDocNumber;

    /** NgÃ y cÃ´ng van yÃªu c?u ngan ch?n */
    private Timestamp preventDocDate;

    /** NgÃ y nh?n cÃ´ng van yÃªu c?u ngan ch?n */
    private Timestamp preventDocReceiveDate;

    /** NgÃ y nh?p cÃ´ng van yÃªu c?u ngan ch?n */
    private Timestamp preventInputDate;

    /** TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u ngan ch?n */
    private String preventDocSummary;

    /** TÃªn file dÃ­nh kÃ¨m CV ngan ch?n */
    private String preventFileName;

    /** Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV ngan ch?n */
    private String preventFilePath;

    /** Ghi chÃº ngan ch?n */
    private String preventNote;

    /** TÃ¬nh tr?ng gi?i t?a:  */
    private Boolean releaseFlg;

    /** Ã�on v? dang kÃ½ CV gi?i t?a */
    private String releaseRegistAgency;

    /** S? vÃ o s? cÃ´ng van gi?i t?a */
    private String releaseInBookNumber;

    /** ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u gi?i t?a */
    private String releasePersonInfo;

    /** S? cÃ´ng van yÃªu c?u gi?i t?a */
    private String releaseDocNumber;

    /** NgÃ y cÃ´ng van yÃªu c?u gi?i t?a */
    private Timestamp releaseDocDate;

    /** NgÃ y nh?n cÃ´ng van yÃªu c?u gi?i t?a */
    private Timestamp releaseDocReceiveDate;

    /** NgÃ y nh?p cÃ´ng van yÃªu c?u gi?i t?a */
    private Timestamp releaseInputDate;

    /** TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u gi?i t?a */
    private String releaseDocSummary;

    /** TÃªn file dÃ­nh kÃ¨m CV gi?i t?a */
    private String releaseFileName;

    /** Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV gi?i t?a */
    private String releaseFilePath;

    /** Ghi chÃº gi?i t?a */
    private String releaseNote;

    /** id ngu?i t?o */
    private Long entryUserId;

    /** TÃªn ngu?i t?o */
    private String entryUserName;

    /** NgÃ y t?o */
    private Timestamp entryDateTime;

    /** id ngu?i c?p nh?t cu?i */
    private Long updateUserId;

    /** TÃªn ngu?i c?p nh?t cu?i */
    private String updateUserName;

    /** NgÃ y c?p nh?t cu?i */
    private Timestamp updateDateTime;

    // info from property prevent info

    /** Loai tÃ i s?n ch?n:  */
    private String type;

    /** Thong tin tai san */
    private String propertyInfo;

    /** Thong tin chu so huu */
    private String ownerInfo;

    /** ThÃ´ng tin khÃ¡c */
    private String otherInfo;

    /** NhÃ  d?t - S? gi?y ch?ng nh?n */
    private String landCertificate;

    /** NhÃ  d?t - Noi c?p GCN */
    private String landIssuePlace;

    /** NhÃ  d?t - NgÃ y c?p GCN */
    private Timestamp landIssueDate;

    /** NhÃ  d?t -S? t? b?n d? */
    private String landMapNumber;

    /** NhÃ  d?t -S? th?a d?t */
    private String landNumber;

    /** NhÃ  d?t -Ã�?a ch? th?a d?t */
    private String landAddress;

    /** NhÃ  d?t - Di?n tÃ­ch */
    private String landArea;

    /** NhÃ  d?t - Di?n tÃ­ch s? d?ng chung */
    private String landPublicArea;

    /** NhÃ  d?t - Di?n tÃ­ch s? d?ng riÃªng */
    private String landPrivateArea;

    /** NhÃ  d?t - M?c dÃ­ch s? d?ng */
    private String landUsePurpose;

    /** NhÃ  d?t - M?c dÃ­ch s? d?ng */
    private String landUsePeriod;

    /** NhÃ  d?t - M?c dÃ­ch s? d?ng */
    private String landUseOrigin;

    /** NhÃ  d?t - Ã�?a bÃ n T?nh/ThÃ nh */
    private String landDistrict;
    
    /** NhÃ  d?t - Ã�?a bÃ n phÆ°á»�ng xÃ£ */
    private String landStreet;

    /** NhÃ  d?t - Ã�?a bÃ n Qu?n/Huy?n  */
    private Long landProvince;

    /** Tai san gan lien voi dat */
    private String landAssociateProperty;

    /** Ã” tÃ´, Motor - Bi?n ki?m soÃ¡t */
    private String carLicenseNumber;

    /** Ã” tÃ´, Motor - S? dang kÃ½ */
    private String carRegistNumber;

    /** Ã” tÃ´, Motor - Noi c?p GCN */
    private String carIssuePlace;

    /** Ã” tÃ´, Motor  - NgÃ y c?p GCN */
    private Timestamp carIssueDate;

    /** Ã” tÃ´, Motor - S? khung  */
    private String carFrameNumber;

    /** Ã” tÃ´, Motor - S? mÃ¡y */
    private String carMachineNumber;
    
    /** Lucene ThÃ´ng tin tÃ i sáº£n hiá»ƒn thá»‹ */
    private String lucenePropertyInfoDisp;
    
    /** Lucene ThÃ´ng tin tÃ i sáº£n */
    private String lucenePropertyInfo;
    
     
     

    /**
     * <P>Generate Instance.</P>
     *
     */
    public DataPreventInfo() {
        super();
    }


    /**
     * <P>Get id DLNC </P>
     *
     * @return id DLNC
     */
    public Long getId() {
        return this.id;
    }

    /**
     * <P>Set id DLNC. </P>
     *
     * @param id id DLNC
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <P>Get TÃ i s?n b? ch?n </P>
     *
     * @return TÃ i s?n b? ch?n
     */
    public Long getPropertyId() {
        return this.propertyId;
    }

    /**
     * <P>Set TÃ i s?n b? ch?n. </P>
     *
     * @param propertyId TÃ i s?n b? ch?n
     */
    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <P>Get PhÃ¢n lo?i d? li?u ngan ch?n:
 </P>
     *
     * @return PhÃ¢n lo?i d? li?u ngan ch?n:

     */
    public String getOriginKind() {
        return this.originKind;
    }

    /**
     * <P>Set PhÃ¢n lo?i d? li?u ngan ch?n:
. </P>
     *
     * @param originKind PhÃ¢n lo?i d? li?u ngan ch?n:

     */
    public void setOriginKind(String originKind) {
        this.originKind = originKind;
    }

    /**
     * <P>Get C? xÃ³a d? li?u </P>
     *
     * @return C? xÃ³a d? li?u
     */
    public Boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    /**
     * <P>Set C? xÃ³a d? li?u. </P>
     *
     * @param deleteFlg C? xÃ³a d? li?u
     */
    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * <P>Get Ã�on v? dang kÃ½ CV ngan ch?n </P>
     *
     * @return Ã�on v? dang kÃ½ CV ngan ch?n
     */
    public String getPreventRegistAgency() {
        return this.preventRegistAgency;
    }

    /**
     * <P>Set Ã�on v? dang kÃ½ CV ngan ch?n. </P>
     *
     * @param preventRegistAgency Ã�on v? dang kÃ½ CV ngan ch?n
     */
    public void setPreventRegistAgency(String preventRegistAgency) {
        this.preventRegistAgency = preventRegistAgency;
    }

    /**
     * <P>Get S? vÃ o s? cÃ´ng van yÃªu c?u </P>
     *
     * @return S? vÃ o s? cÃ´ng van yÃªu c?u
     */
    public String getPreventInBookNumber() {
        return this.preventInBookNumber;
    }

    /**
     * <P>Set S? vÃ o s? cÃ´ng van yÃªu c?u. </P>
     *
     * @param preventInBookNumber S? vÃ o s? cÃ´ng van yÃªu c?u
     */
    public void setPreventInBookNumber(String preventInBookNumber) {
        this.preventInBookNumber = preventInBookNumber;
    }

    /**
     * <P>Get ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n </P>
     *
     * @return ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n
     */
    public String getPreventPersonInfo() {
        return this.preventPersonInfo;
    }
    
    /**
     * <P>Get ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n </P>
     *
     * @return ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n
     */
    public String getPreventPersonInfoDisp() {
        return EditString.replaceChangeLine(this.preventPersonInfo);
    }

    /**
     * <P>Set ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n. </P>
     *
     * @param preventPersonInfo ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u ngan ch?n
     */
    public void setPreventPersonInfo(String preventPersonInfo) {
        this.preventPersonInfo = preventPersonInfo;
    }

    /**
     * <P>Get S? cÃ´ng van yÃªu c?u ngan ch?n </P>
     *
     * @return S? cÃ´ng van yÃªu c?u ngan ch?n
     */
    public String getPreventDocNumber() {
        return this.preventDocNumber;
    }

    /**
     * <P>Set S? cÃ´ng van yÃªu c?u ngan ch?n. </P>
     *
     * @param preventDocNumber S? cÃ´ng van yÃªu c?u ngan ch?n
     */
    public void setPreventDocNumber(String preventDocNumber) {
        this.preventDocNumber = preventDocNumber;
    }

    /**
     * <P>Get NgÃ y cÃ´ng van yÃªu c?u ngan ch?n </P>
     *
     * @return NgÃ y cÃ´ng van yÃªu c?u ngan ch?n
     */
    public Timestamp getPreventDocDate() {
        return this.preventDocDate;
    }

    /**
     * <P>Set NgÃ y cÃ´ng van yÃªu c?u ngan ch?n. </P>
     *
     * @param preventDocDate NgÃ y cÃ´ng van yÃªu c?u ngan ch?n
     */
    public void setPreventDocDate(Timestamp preventDocDate) {
        this.preventDocDate = preventDocDate;
    }

    /**
     * <P>Get NgÃ y nh?n cÃ´ng van yÃªu c?u ngan ch?n </P>
     *
     * @return NgÃ y nh?n cÃ´ng van yÃªu c?u ngan ch?n
     */
    public Timestamp getPreventDocReceiveDate() {
        return this.preventDocReceiveDate;
    }

    /**
     * <P>Set NgÃ y nh?n cÃ´ng van yÃªu c?u ngan ch?n. </P>
     *
     * @param preventDocReceiveDate NgÃ y nh?n cÃ´ng van yÃªu c?u ngan ch?n
     */
    public void setPreventDocReceiveDate(Timestamp preventDocReceiveDate) {
        this.preventDocReceiveDate = preventDocReceiveDate;
    }

    /**
     * <P>Get NgÃ y nh?p cÃ´ng van yÃªu c?u ngan ch?n </P>
     *
     * @return NgÃ y nh?p cÃ´ng van yÃªu c?u ngan ch?n
     */
    public Timestamp getPreventInputDate() {
        return this.preventInputDate;
    }

    /**
     * <P>Set NgÃ y nh?p cÃ´ng van yÃªu c?u ngan ch?n. </P>
     *
     * @param preventInputDate NgÃ y nh?p cÃ´ng van yÃªu c?u ngan ch?n
     */
    public void setPreventInputDate(Timestamp preventInputDate) {
        this.preventInputDate = preventInputDate;
    }

    /**
     * <P>Get TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u ngan ch?n </P>
     *
     * @return TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u ngan ch?n
     */
    public String getPreventDocSummary() {
        return this.preventDocSummary;
    }

    /**
     * <P>Set TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u ngan ch?n. </P>
     *
     * @param preventDocSummary TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u ngan ch?n
     */
    public void setPreventDocSummary(String preventDocSummary) {
        this.preventDocSummary = preventDocSummary;
    }

    /**
     * <P>Get TÃªn file dÃ­nh kÃ¨m CV ngan ch?n </P>
     *
     * @return TÃªn file dÃ­nh kÃ¨m CV ngan ch?n
     */
    public String getPreventFileName() {
        return this.preventFileName;
    }

    /**
     * <P>Set TÃªn file dÃ­nh kÃ¨m CV ngan ch?n. </P>
     *
     * @param preventFileName TÃªn file dÃ­nh kÃ¨m CV ngan ch?n
     */
    public void setPreventFileName(String preventFileName) {
        this.preventFileName = preventFileName;
    }

    /**
     * <P>Get Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV ngan ch?n </P>
     *
     * @return Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV ngan ch?n
     */
    public String getPreventFilePath() {
        return this.preventFilePath;
    }

    /**
     * <P>Set Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV ngan ch?n. </P>
     *
     * @param preventFilePath Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV ngan ch?n
     */
    public void setPreventFilePath(String preventFilePath) {
        this.preventFilePath = preventFilePath;
    }

    /**
     * <P>Get Ghi chÃº ngan ch?n </P>
     *
     * @return Ghi chÃº ngan ch?n
     */
    public String getPreventNote() {
        return this.preventNote;
    }

    /**
     * <P>Set Ghi chÃº ngan ch?n. </P>
     *
     * @param preventNote Ghi chÃº ngan ch?n
     */
    public void setPreventNote(String preventNote) {
        this.preventNote = preventNote;
    }

    /**
     * <P>Get TÃ¬nh tr?ng gi?i t?a:
 </P>
     *
     * @return TÃ¬nh tr?ng gi?i t?a:

     */
    public Boolean getReleaseFlg() {
        return this.releaseFlg;
    }

    /**
     * <P>Set TÃ¬nh tr?ng gi?i t?a:
. </P>
     *
     * @param releaseFlg TÃ¬nh tr?ng gi?i t?a:

     */
    public void setReleaseFlg(Boolean releaseFlg) {
        this.releaseFlg = releaseFlg;
    }

    /**
     * <P>Get Ã�on v? dang kÃ½ CV gi?i t?a </P>
     *
     * @return Ã�on v? dang kÃ½ CV gi?i t?a
     */
    public String getReleaseRegistAgency() {
        return this.releaseRegistAgency;
    }

    /**
     * <P>Set Ã�on v? dang kÃ½ CV gi?i t?a. </P>
     *
     * @param releaseRegistAgency Ã�on v? dang kÃ½ CV gi?i t?a
     */
    public void setReleaseRegistAgency(String releaseRegistAgency) {
        this.releaseRegistAgency = releaseRegistAgency;
    }

    /**
     * <P>Get S? vÃ o s? cÃ´ng van gi?i t?a </P>
     *
     * @return S? vÃ o s? cÃ´ng van gi?i t?a
     */
    public String getReleaseInBookNumber() {
        return this.releaseInBookNumber;
    }

    /**
     * <P>Set S? vÃ o s? cÃ´ng van gi?i t?a. </P>
     *
     * @param releaseInBookNumber S? vÃ o s? cÃ´ng van gi?i t?a
     */
    public void setReleaseInBookNumber(String releaseInBookNumber) {
        this.releaseInBookNumber = releaseInBookNumber;
    }

    /**
     * <P>Get ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u gi?i t?a </P>
     *
     * @return ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u gi?i t?a
     */
    public String getReleasePersonInfo() {
        return this.releasePersonInfo;
    }

    /**
     * <P>Set ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u gi?i t?a. </P>
     *
     * @param releasePersonInfo ThÃ´ng tin ngu?i (don v?) g?i yÃªu c?u gi?i t?a
     */
    public void setReleasePersonInfo(String releasePersonInfo) {
        this.releasePersonInfo = releasePersonInfo;
    }

    /**
     * <P>Get S? cÃ´ng van yÃªu c?u gi?i t?a </P>
     *
     * @return S? cÃ´ng van yÃªu c?u gi?i t?a
     */
    public String getReleaseDocNumber() {
        return this.releaseDocNumber;
    }

    /**
     * <P>Set S? cÃ´ng van yÃªu c?u gi?i t?a. </P>
     *
     * @param releaseDocNumber S? cÃ´ng van yÃªu c?u gi?i t?a
     */
    public void setReleaseDocNumber(String releaseDocNumber) {
        this.releaseDocNumber = releaseDocNumber;
    }

    /**
     * <P>Get NgÃ y cÃ´ng van yÃªu c?u gi?i t?a </P>
     *
     * @return NgÃ y cÃ´ng van yÃªu c?u gi?i t?a
     */
    public Timestamp getReleaseDocDate() {
        return this.releaseDocDate;
    }

    /**
     * <P>Set NgÃ y cÃ´ng van yÃªu c?u gi?i t?a. </P>
     *
     * @param releaseDocDate NgÃ y cÃ´ng van yÃªu c?u gi?i t?a
     */
    public void setReleaseDocDate(Timestamp releaseDocDate) {
        this.releaseDocDate = releaseDocDate;
    }

    /**
     * <P>Get NgÃ y nh?n cÃ´ng van yÃªu c?u gi?i t?a </P>
     *
     * @return NgÃ y nh?n cÃ´ng van yÃªu c?u gi?i t?a
     */
    public Timestamp getReleaseDocReceiveDate() {
        return this.releaseDocReceiveDate;
    }

    /**
     * <P>Set NgÃ y nh?n cÃ´ng van yÃªu c?u gi?i t?a. </P>
     *
     * @param releaseDocReceiveDate NgÃ y nh?n cÃ´ng van yÃªu c?u gi?i t?a
     */
    public void setReleaseDocReceiveDate(Timestamp releaseDocReceiveDate) {
        this.releaseDocReceiveDate = releaseDocReceiveDate;
    }

    /**
     * <P>Get NgÃ y nh?p cÃ´ng van yÃªu c?u gi?i t?a </P>
     *
     * @return NgÃ y nh?p cÃ´ng van yÃªu c?u gi?i t?a
     */
    public Timestamp getReleaseInputDate() {
        return this.releaseInputDate;
    }

    /**
     * <P>Set NgÃ y nh?p cÃ´ng van yÃªu c?u gi?i t?a. </P>
     *
     * @param releaseInputDate NgÃ y nh?p cÃ´ng van yÃªu c?u gi?i t?a
     */
    public void setReleaseInputDate(Timestamp releaseInputDate) {
        this.releaseInputDate = releaseInputDate;
    }

    /**
     * <P>Get TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u gi?i t?a </P>
     *
     * @return TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u gi?i t?a
     */
    public String getReleaseDocSummary() {
        return this.releaseDocSummary;
    }

    /**
     * <P>Set TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u gi?i t?a. </P>
     *
     * @param releaseDocSummary TrÃ­ch y?u n?i dung cÃ´ng van yÃªu c?u gi?i t?a
     */
    public void setReleaseDocSummary(String releaseDocSummary) {
        this.releaseDocSummary = releaseDocSummary;
    }

    /**
     * <P>Get TÃªn file dÃ­nh kÃ¨m CV gi?i t?a </P>
     *
     * @return TÃªn file dÃ­nh kÃ¨m CV gi?i t?a
     */
    public String getReleaseFileName() {
        return this.releaseFileName;
    }

    /**
     * <P>Set TÃªn file dÃ­nh kÃ¨m CV gi?i t?a. </P>
     *
     * @param releaseFileName TÃªn file dÃ­nh kÃ¨m CV gi?i t?a
     */
    public void setReleaseFileName(String releaseFileName) {
        this.releaseFileName = releaseFileName;
    }

    /**
     * <P>Get Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV gi?i t?a </P>
     *
     * @return Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV gi?i t?a
     */
    public String getReleaseFilePath() {
        return this.releaseFilePath;
    }

    /**
     * <P>Set Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV gi?i t?a. </P>
     *
     * @param releaseFilePath Luu du?ng d?n ch?a file dÃ­nh kÃ¨m CV gi?i t?a
     */
    public void setReleaseFilePath(String releaseFilePath) {
        this.releaseFilePath = releaseFilePath;
    }

    /**
     * <P>Get Ghi chÃº gi?i t?a </P>
     *
     * @return Ghi chÃº gi?i t?a
     */
    public String getReleaseNote() {
        return this.releaseNote;
    }

    /**
     * <P>Set Ghi chÃº gi?i t?a. </P>
     *
     * @param releaseNote Ghi chÃº gi?i t?a
     */
    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    /**
     * <P>Get id ngu?i t?o </P>
     *
     * @return id ngu?i t?o
     */
    public Long getEntryUserId() {
        return this.entryUserId;
    }

    /**
     * <P>Set id ngu?i t?o. </P>
     *
     * @param entryUserId id ngu?i t?o
     */
    public void setEntryUserId(Long entryUserId) {
        this.entryUserId = entryUserId;
    }

    /**
     * <P>Get TÃªn ngu?i t?o </P>
     *
     * @return TÃªn ngu?i t?o
     */
    public String getEntryUserName() {
        return this.entryUserName;
    }

    /**
     * <P>Set TÃªn ngu?i t?o. </P>
     *
     * @param entryUserName TÃªn ngu?i t?o
     */
    public void setEntryUserName(String entryUserName) {
        this.entryUserName = entryUserName;
    }

    /**
     * <P>Get NgÃ y t?o </P>
     *
     * @return NgÃ y t?o
     */
    public Timestamp getEntryDateTime() {
        return this.entryDateTime;
    }

    /**
     * <P>Set NgÃ y t?o. </P>
     *
     * @param entryDateTime NgÃ y t?o
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
     * <P>Get TÃªn ngu?i c?p nh?t cu?i </P>
     *
     * @return TÃªn ngu?i c?p nh?t cu?i
     */
    public String getUpdateUserName() {
        return this.updateUserName;
    }

    /**
     * <P>Set TÃªn ngu?i c?p nh?t cu?i. </P>
     *
     * @param updateUserName TÃªn ngu?i c?p nh?t cu?i
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    /**
     * <P>Get NgÃ y c?p nh?t cu?i </P>
     *
     * @return NgÃ y c?p nh?t cu?i
     */
    public Timestamp getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <P>Set NgÃ y c?p nh?t cu?i. </P>
     *
     * @param updateDateTime NgÃ y c?p nh?t cu?i
     */
    public void setUpdateDateTime(Timestamp updateDateTime) {
        this.updateDateTime = updateDateTime;
    }


    /**
     * @return the type
     */
    public String getType() {
        return type;
    }


    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * @return the propertyInfo
     */
    public String getPropertyInfo() {
        return propertyInfo;
    }


    /**
     * @param propertyInfo the propertyInfo to set
     */
    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo;
    }


    /**
     * @return the ownerInfo
     */
    public String getOwnerInfo() {
        return ownerInfo;
    }


    /**
     * @param ownerInfo the ownerInfo to set
     */
    public void setOwnerInfo(String ownerInfo) {
        this.ownerInfo = ownerInfo;
    }


    /**
     * @return the otherInfo
     */
    public String getOtherInfo() {
        return otherInfo;
    }


    /**
     * @param otherInfo the otherInfo to set
     */
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }


    /**
     * @return the landCertificate
     */
    public String getLandCertificate() {
        return landCertificate;
    }


    /**
     * @param landCertificate the landCertificate to set
     */
    public void setLandCertificate(String landCertificate) {
        this.landCertificate = landCertificate;
    }


    /**
     * @return the landIssuePlace
     */
    public String getLandIssuePlace() {
        return landIssuePlace;
    }


    /**
     * @param landIssuePlace the landIssuePlace to set
     */
    public void setLandIssuePlace(String landIssuePlace) {
        this.landIssuePlace = landIssuePlace;
    }


    /**
     * @return the landIssueDate
     */
    public Timestamp getLandIssueDate() {
        return landIssueDate;
    }


    /**
     * @param landIssueDate the landIssueDate to set
     */
    public void setLandIssueDate(Timestamp landIssueDate) {
        this.landIssueDate = landIssueDate;
    }


    /**
     * @return the landMapNumber
     */
    public String getLandMapNumber() {
        return landMapNumber;
    }


    /**
     * @param landMapNumber the landMapNumber to set
     */
    public void setLandMapNumber(String landMapNumber) {
        this.landMapNumber = landMapNumber;
    }


    /**
     * @return the landNumber
     */
    public String getLandNumber() {
        return landNumber;
    }


    /**
     * @param landNumber the landNumber to set
     */
    public void setLandNumber(String landNumber) {
        this.landNumber = landNumber;
    }


    /**
     * @return the landAddress
     */
    public String getLandAddress() {
        return landAddress;
    }


    /**
     * @param landAddress the landAddress to set
     */
    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
    }


    /**
     * @return the landArea
     */
    public String getLandArea() {
        return landArea;
    }


    /**
     * @param landArea the landArea to set
     */
    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }


    /**
     * @return the landPublicArea
     */
    public String getLandPublicArea() {
        return landPublicArea;
    }


    /**
     * @param landPublicArea the landPublicArea to set
     */
    public void setLandPublicArea(String landPublicArea) {
        this.landPublicArea = landPublicArea;
    }


    /**
     * @return the landPrivateArea
     */
    public String getLandPrivateArea() {
        return landPrivateArea;
    }


    /**
     * @param landPrivateArea the landPrivateArea to set
     */
    public void setLandPrivateArea(String landPrivateArea) {
        this.landPrivateArea = landPrivateArea;
    }


    /**
     * @return the landUsePurpose
     */
    public String getLandUsePurpose() {
        return landUsePurpose;
    }


    /**
     * @param landUsePurpose the landUsePurpose to set
     */
    public void setLandUsePurpose(String landUsePurpose) {
        this.landUsePurpose = landUsePurpose;
    }


    /**
     * @return the landUsePeriod
     */
    public String getLandUsePeriod() {
        return landUsePeriod;
    }


    /**
     * @param landUsePeriod the landUsePeriod to set
     */
    public void setLandUsePeriod(String landUsePeriod) {
        this.landUsePeriod = landUsePeriod;
    }


    /**
     * @return the landUseOrigin
     */
    public String getLandUseOrigin() {
        return landUseOrigin;
    }


    /**
     * @param landUseOrigin the landUseOrigin to set
     */
    public void setLandUseOrigin(String landUseOrigin) {
        this.landUseOrigin = landUseOrigin;
    }


    /**
     * @return the landDistrict
     */
    public String getLandDistrict() {
        return landDistrict;
    }


    /**
     * @param landDistrict the landDistrict to set
     */
    public void setLandDistrict(String landDistrict) {
        this.landDistrict = landDistrict;
    }


    /**
     * @return the landProvince
     */
    public Long getLandProvince() {
        return landProvince;
    }


    /**
     * @param landProvince the landProvince to set
     */
    public void setLandProvince(Long landProvince) {
        this.landProvince = landProvince;
    }


    /**
     * @return the landAssociateProperty
     */
    public String getLandAssociateProperty() {
        return landAssociateProperty;
    }


    /**
     * @param landAssociateProperty the landAssociateProperty to set
     */
    public void setLandAssociateProperty(String landAssociateProperty) {
        this.landAssociateProperty = landAssociateProperty;
    }


    /**
     * @return the carLicenseNumber
     */
    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }


    /**
     * @param carLicenseNumber the carLicenseNumber to set
     */
    public void setCarLicenseNumber(String carLicenseNumber) {
        this.carLicenseNumber = carLicenseNumber;
    }


    /**
     * @return the carRegistNumber
     */
    public String getCarRegistNumber() {
        return carRegistNumber;
    }


    /**
     * @param carRegistNumber the carRegistNumber to set
     */
    public void setCarRegistNumber(String carRegistNumber) {
        this.carRegistNumber = carRegistNumber;
    }


    /**
     * @return the carIssuePlace
     */
    public String getCarIssuePlace() {
        return carIssuePlace;
    }


    /**
     * @param carIssuePlace the carIssuePlace to set
     */
    public void setCarIssuePlace(String carIssuePlace) {
        this.carIssuePlace = carIssuePlace;
    }


    /**
     * @return the carIssueDate
     */
    public Timestamp getCarIssueDate() {
        return carIssueDate;
    }


    /**
     * @param carIssueDate the carIssueDate to set
     */
    public void setCarIssueDate(Timestamp carIssueDate) {
        this.carIssueDate = carIssueDate;
    }


    /**
     * @return the carFrameNumber
     */
    public String getCarFrameNumber() {
        return carFrameNumber;
    }


    /**
     * @param carFrameNumber the carFrameNumber to set
     */
    public void setCarFrameNumber(String carFrameNumber) {
        this.carFrameNumber = carFrameNumber;
    }


    /**
     * @return the carMachineNumber
     */
    public String getCarMachineNumber() {
        return carMachineNumber;
    }


    /**
     * @param carMachineNumber the carMachineNumber to set
     */
    public void setCarMachineNumber(String carMachineNumber) {
        this.carMachineNumber = carMachineNumber;
    }

    /**
     * Get the propertyInfoDisp
     *
     * @return the propertyInfoDisp
     */
    public String getPropertyInfoDisp() {
        return EditString.replaceChangeLine(propertyInfo);
    }

    /**
     * <P>Get the ownerInfoDisp </P>
     *
     * @return ownerInfoDisp
     */
    public String getOwnerInfoDisp() {
        return EditString.replaceChangeLine(ownerInfo);
    }

    /**
     * <P>Get the info </P>
     *
     * @return info
     */
    public String getInfo() {
        String info = "";
        String landArea = getLandArea2();
        if ("01".equals(type)&&!"".equals(landArea)) {
        	info += getLandArea2();
        }
        info += propertyInfo;
        if (!EditString.isNull(ownerInfo)) {
            info += Constants.SEMI_COLON + SystemMessageProperties.getSystemProperty("item_owner")
                + Constants.COLON + Constants.SPACE + ownerInfo;
        }
        if (!EditString.isNull(otherInfo)) {
            info += Constants.SEMI_COLON + SystemMessageProperties.getSystemProperty("item_other_info")
                + Constants.COLON + Constants.SPACE + otherInfo;
        }
        return EditString.replaceChangeLine(info);
    }
    
    /**
     * <P>Get the info </P>
     *
     * @return info
     */
    public String getPropertyInfoLucene() {
        String info = "";
        String landArea = getLandArea2();
        if ("01".equals(type)&&!"".equals(landArea)) {
        	info += getLandArea2();
        }
        info += propertyInfo;
        if (!EditString.isNull(ownerInfo)) {
            info += Constants.SEMI_COLON + SystemMessageProperties.getSystemProperty("item_owner")
                + Constants.COLON + Constants.SPACE + ownerInfo;
        }
        if (!EditString.isNull(otherInfo)) {
            info += Constants.SEMI_COLON + SystemMessageProperties.getSystemProperty("item_other_info")
                + Constants.COLON + Constants.SPACE + otherInfo;
        }
        return EditString.replaceChangeLine(info);
    }

    /**
     * <P>Get the infoDisp </P>
     *
     * @return infoDisp
     */
    public String getInfoDisp() {
        return EditString.getDisp(getInfo(), Constants.LENGTH_OUTPUT_LIMIT);
    }


    /**
     * @return the synchronizeId
     */
    public String getSynchronizeId() {
        return synchronizeId;
    }


    /**
     * @param synchronizeId the synchronizeId to set
     */
    public void setSynchronizeId(String synchronizeId) {
        this.synchronizeId = synchronizeId;
    }


	/**
	 * @param lucenePropertyInfoDisp the lucenePropertyInfoDisp to set
	 */
	public void setLucenePropertyInfoDisp(String lucenePropertyInfoDisp) {
		this.lucenePropertyInfoDisp = lucenePropertyInfoDisp;
	}


	/**
	 * @return the lucenePropertyInfoDisp
	 */
	public String getLucenePropertyInfoDisp() {
		return lucenePropertyInfoDisp;
	}


	/**
	 * @param lucenePropertyInfo the lucenePropertyInfo to set
	 */
	public void setLucenePropertyInfo(String lucenePropertyInfo) {
		this.lucenePropertyInfo = lucenePropertyInfo;
	}


	/**
	 * @return the lucenePropertyInfo
	 */
	public String getLucenePropertyInfo() {
		return lucenePropertyInfo;
	}


	/**
	 * @param landStreet the landStreet to set
	 */
	public void setLandStreet(String landStreet) {
		this.landStreet = landStreet;
	}


	/**
	 * @return the landStreet
	 */
	public String getLandStreet() {
		return landStreet;
	}
	
	public String getLandArea2(){
		String landArea = "";
		if ((getLandDistrict()!=null && !"".equals(getLandDistrict().trim()))||(getLandStreet()!=null && !"".equals(getLandStreet().trim()))) {
			landArea += SystemMessageProperties.getSystemProperty("item_area") + Constants.COLON + Constants.SPACE;
			landArea += landStreet + Constants.SPACE; 
			if (getLandDistrict()!=null && getLandStreet()!=null && !"".equals(getLandDistrict().trim()) && !"".equals(getLandStreet().trim())) {
				landArea += "-" + Constants.SPACE;
			}
			landArea += landDistrict;
		}
		if (!"".equals(landArea)) landArea += Constants.ENTER;
		return landArea;
	}
}

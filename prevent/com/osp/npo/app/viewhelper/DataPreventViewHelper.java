package com.osp.npo.app.viewhelper;

import java.util.List;
import org.apache.struts.upload.FormFile;
import com.osp.npo.app.form.DataPreventForm;
import com.osp.npo.core.basicData.DistrictInfo;
import com.osp.npo.core.basicData.PropertyInfo;
import com.osp.npo.core.prevent.DataPreventHistoryInfo;

/**
 *
 * Data Prevent View Helper
 *
 * @author GiangVT
 * @version $Revision: 27190 $
 */
public class DataPreventViewHelper {

    public static final String SESSION_KEY = "dataPreventViewHelper";
    public static final String SESSION_KEY_DETAIL = "dataPreventViewHelperDetail";

    /** Danh sÃ¡ch cÃ¡c loáº¡i tÃ i sáº£n */
    private List<PropertyInfo> lstProperty;
    private List<DataPreventHistoryInfo> lstHistoryInfo;

//    /** Danh sÃ¡ch thÃ nh phá»‘ */
//    private List<ProvinceInfo> lstProvince;
//
//    /** Danh sÃ¡ch cÃ¡c huyá»‡n thÃ nh phá»‘ */
//    private List<DistrictInfo> lstDistrict;

    /** ID tÃ i sáº£n cháº·n **/
    private Long id;

    /** TÃ i sáº£n bÃ¡o cháº·n */
    private String propertyType;

//    /** Quáº­n huyá»‡n nÆ¡i chá»©a tÃ i sáº£n Ä‘áº¥t */
//    private Long district;

//    /** Tinh thÃ nh noi cáº¥p hoáº·c chá»©a tÃ i sáº£n lÃ  Ä‘áº¥t Ä‘ai */
//    private Long landProvince;
//
//    /** Tinh thÃ nh noi cáº¥p hoáº·c chá»©a tÃ i sáº£n lÃ  xe cá»™ */
//    private Long vehicleProvince;

    /** Remove file flag */
    private Boolean isSimpleInsert;

    /** is notary office */
    private Boolean isNotaryOfficeData;

    /** File */
    private FormFile formFilePrevent;

    /** File */
    private FormFile formFileRelease;

    /** remove file */
    private Boolean filePreventExisted;

    /** remove file release */
    private Boolean fileReleaseExisted;

    /** T�i s?n b? ch?n */
    private Long propertyId;

    /** Ph�n lo?i d? li?u ngan ch?n: */
    private String originKind;

    /** �on v? dang k� CV ngan ch?n */
    private String preventRegistAgency;

    /** Th�ng tin ngu?i (don v?) g?i y�u c?u ngan ch?n */
    private String preventPersonInfo;

    /** S? v�o s? c�ng van y�u c?u */
    private String preventInBookNumber;

    /** S? c�ng van y�u c?u ngan ch?n */
    private String preventDocNumber;

    /** Ng�y c�ng van y�u c?u ngan ch?n */
    private String preventDocDate;

    /** Ng�y nh?n c�ng van y�u c?u ngan ch?n */
    private String preventDocReceiveDate;

    /** Ng�y nh?p c�ng van y�u c?u ngan ch?n */
    private String preventInputDate;

    /** Tr�ch y?u n?i dung c�ng van y�u c?u ngan ch?n */
    private String preventDocSummary;

    /** T�n file d�nh k�m CV ngan ch?n */
    private String preventFileName;

    /** Luu du?ng d?n ch?a file d�nh k�m CV ngan ch?n */
    private String preventFilePath;

    /** Ghi ch� ngan ch?n */
    private String preventNote;

    /** T�nh tr?ng gi?i t?a:  */
    private Boolean releaseFlg;

    /** �on v? dang k� CV gi?i t?a */
    private String releaseRegistAgency;

    /** S? v�o s? c�ng van gi?i t?a */
    private String releaseInBookNumber;

    /** Th�ng tin ngu?i (don v?) g?i y�u c?u gi?i t?a */
    private String releasePersonInfo;

    /** S? c�ng van y�u c?u gi?i t?a */
    private String releaseDocNumber;

    /** Ng�y c�ng van y�u c?u gi?i t?a */
    private String releaseDocDate;

    /** Ng�y nh?n c�ng van y�u c?u gi?i t?a */
    private String releaseDocReceiveDate;

    /** Ng�y nh?p c�ng van y�u c?u gi?i t?a */
    private String releaseInputDate;

    /** Tr�ch y?u n?i dung c�ng van y�u c?u gi?i t?a */
    private String releaseDocSummary;

    /** T�n file d�nh k�m CV gi?i t?a */
    private String releaseFileName;

    /** Luu du?ng d?n ch?a file d�nh k�m CV gi?i t?a */
    private String releaseFilePath;

    /** Ghi ch� gi?i t?a */
    private String releaseNote;

    // for property prevent info
    /** Thong tin tai san */
    private String propertyInfo;

    /** Thong tin chu so huu */
    private String ownerInfo;

    /** Th�ng tin kh�c */
    private String otherInfo;

    /** Nh� d?t - S? gi?y ch?ng nh?n */
    private String landCertificate;

    /** Nh� d?t - Noi c?p GCN */
    private String landIssuePlace;

    /** Nh� d?t - Ng�y c?p GCN */
    private String landIssueDate;

    /** Nh� d?t -S? t? b?n d? */
    private String landMapNumber;

    /** Nh� d?t -S? th?a d?t */
    private String landNumber;

    /** Nh� d?t -�?a ch? th?a d?t */
    private String landAddress;

    /** Nh� d?t - Di?n t�ch */
    private String landArea;

    /** Nh� d?t - Di?n t�ch s? d?ng chung */
    private String landPublicArea;

    /** Nh� d?t - Di?n t�ch s? d?ng ri�ng */
    private String landPrivateArea;

    /** Nh� d?t - M?c d�ch s? d?ng */
    private String landUsePurpose;

    /** Nh� d?t - M?c d�ch s? d?ng */
    private String landUsePeriod;

    /** Nh� d?t - M?c d�ch s? d?ng */
    private String landUseOrigin;

    /** Nh� d?t - �?a b�n T?nh/Th�nh */
    private String landDistrict;

    /** Nh� d?t - �?a b�n Qu?n/Huy?n  */
    private Long landProvince;

    /** Tai san gan lien voi dat */
    private String landAssociateProperty;

    /** � t�, Motor - Bi?n ki?m so�t */
    private String carLicenseNumber;

    /** � t�, Motor - S? dang k� */
    private String carRegistNumber;

    /** � t�, Motor - Noi c?p GCN */
    private String carIssuePlace;

    /** � t�, Motor  - Ng�y c?p GCN */
    private String carIssueDate;

    /** � t�, Motor - S? khung  */
    private String carFrameNumber;

    /** � t�, Motor - S? m�y */
    private String carMachineNumber;
    
    private List<DistrictInfo> districtList;
    
    private String landStreet;
    
    

//    /** province name */
//    private String provinceName;
//
//    /** district name */
//    private String districtName;

    /** checking from regist screen to */
    private Boolean fromRegistScreen;

    public void reset(DataPreventForm f) {
        this.setPropertyType(f.getPropertyType());
        this.setCarFrameNumber(f.getCarFrameNumber());
        this.setCarIssueDate(f.getCarIssueDate());
        this.setCarIssuePlace(f.getCarIssuePlace());
        this.setCarLicenseNumber(f.getCarLicenseNumber());
        this.setCarMachineNumber(f.getCarMachineNumber());
        this.setCarRegistNumber(f.getCarRegistNumber());
        this.setLandAddress(f.getLandAddress());
        this.setLandArea(f.getLandArea());
        this.setLandAssociateProperty(f.getLandAssociateProperty());
        this.setLandCertificate(f.getLandCertificate());
//        this.setLandDistrict(f.getLandDistrict());
        this.setLandIssueDate(f.getLandIssueDate());
        this.setLandIssuePlace(f.getLandIssuePlace());
        this.setLandNumber(f.getLandNumber());
        this.setLandMapNumber(f.getLandMapNumber());
        this.setLandPrivateArea(f.getLandPrivateArea());
//        this.setLandProvince(f.getLandPublicArea());
        this.setLandPublicArea(f.getLandPublicArea());
        this.setLandUseOrigin(f.getLandUseOrigin());
        this.setLandUsePeriod(f.getLandUsePeriod());
        this.setLandUsePurpose(f.getLandUsePurpose());

        this.setOtherInfo(f.getOtherInfo());
        this.setOwnerInfo(f.getOwnerInfo());
        this.setOriginKind(f.getOriginKind());

        if ("99".equals(this.getPropertyType())) {
            this.setPropertyInfo(f.getPropertyInfo());
        }

        this.setPreventDocDate(f.getPreventDocDate());
        this.setPreventDocNumber(f.getPreventDocNumber());
        this.setPreventDocReceiveDate(f.getPreventDocReceiveDate());
        this.setPreventInputDate(f.getPreventInputDate());
        this.setPreventDocSummary(f.getPreventDocSummary());
        this.setPreventInBookNumber(f.getPreventInBookNumber());
        this.setPreventNote(f.getPreventNote());
        this.setPreventPersonInfo(f.getPreventPersonInfo());
//        this.setPreventRegistAgency(f.getPreventRegistAgency());

        this.setReleaseDocDate(f.getReleaseDocDate());
        this.setReleaseDocNumber(f.getReleaseDocNumber());
        this.setReleaseDocReceiveDate(f.getReleaseDocReceiveDate());
        this.setReleaseDocSummary(f.getReleaseDocSummary());
        this.setReleaseInBookNumber(f.getReleaseInBookNumber());
        this.setReleaseInputDate(f.getReleaseInputDate());
        this.setReleaseNote(f.getReleaseNote());
        this.setReleasePersonInfo(f.getReleasePersonInfo());
//        this.setReleaseRegistAgency(f.getReleaseRegistAgency());

        this.setIsSimpleInsert(f.getIsSimpleInsert());
        this.setFilePreventExisted(f.getFilePreventExisted());
        this.setFileReleaseExisted(f.getFileReleaseExisted());
        this.setLandDistrict(f.getLandDistrict());
        this.setLandStreet(f.getLandStreet());
    }

    /**
     * @return the lstProperty
     */
    public List<PropertyInfo> getLstProperty() {
        return lstProperty;
    }

    /**
     * @param lstProperty the lstProperty to set
     */
    public void setLstProperty(List<PropertyInfo> lstProperty) {
        this.lstProperty = lstProperty;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the propertyType
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * @param propertyType the propertyType to set
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * @return the formFilePrevent
     */
    public FormFile getFormFilePrevent() {
        return formFilePrevent;
    }

    /**
     * @param formFilePrevent the formFilePrevent to set
     */
    public void setFormFilePrevent(FormFile formFilePrevent) {
        this.formFilePrevent = formFilePrevent;
    }

    /**
     * @return the formFileRelease
     */
    public FormFile getFormFileRelease() {
        return formFileRelease;
    }

    /**
     * @param formFileRelease the formFileRelease to set
     */
    public void setFormFileRelease(FormFile formFileRelease) {
        this.formFileRelease = formFileRelease;
    }

    /**
     * @return the filePreventExisted
     */
    public Boolean getFilePreventExisted() {
        return filePreventExisted;
    }

    /**
     * @param filePreventExisted the filePreventExisted to set
     */
    public void setFilePreventExisted(Boolean filePreventExisted) {
        this.filePreventExisted = filePreventExisted;
    }

    /**
     * @return the fileReleaseExisted
     */
    public Boolean getFileReleaseExisted() {
        return fileReleaseExisted;
    }

    /**
     * @param fileReleaseExisted the fileReleaseExisted to set
     */
    public void setFileReleaseExisted(Boolean fileReleaseExisted) {
        this.fileReleaseExisted = fileReleaseExisted;
    }

    /**
     * @return the propertyId
     */
    public Long getPropertyId() {
        return propertyId;
    }

    /**
     * @param propertyId the propertyId to set
     */
    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * @return the originKind
     */
    public String getOriginKind() {
        return originKind;
    }

    /**
     * @param originKind the originKind to set
     */
    public void setOriginKind(String originKind) {
        this.originKind = originKind;
    }

    /**
     * @return the preventRegistAgency
     */
    public String getPreventRegistAgency() {
        return preventRegistAgency;
    }

    /**
     * @param preventRegistAgency the preventRegistAgency to set
     */
    public void setPreventRegistAgency(String preventRegistAgency) {
        this.preventRegistAgency = preventRegistAgency;
    }

    /**
     * @return the preventInBookNumber
     */
    public String getPreventInBookNumber() {
        return preventInBookNumber;
    }

    /**
     * @param preventInBookNumber the preventInBookNumber to set
     */
    public void setPreventInBookNumber(String preventInBookNumber) {
        this.preventInBookNumber = preventInBookNumber;
    }

    /**
     * @return the preventDocNumber
     */
    public String getPreventDocNumber() {
        return preventDocNumber;
    }

    /**
     * @param preventDocNumber the preventDocNumber to set
     */
    public void setPreventDocNumber(String preventDocNumber) {
        this.preventDocNumber = preventDocNumber;
    }

    /**
     * @return the preventDocDate
     */
    public String getPreventDocDate() {
        return preventDocDate;
    }

    /**
     * @param preventDocDate the preventDocDate to set
     */
    public void setPreventDocDate(String preventDocDate) {
        this.preventDocDate = preventDocDate;
    }

    /**
     * @return the preventDocReceiveDate
     */
    public String getPreventDocReceiveDate() {
        return preventDocReceiveDate;
    }

    /**
     * @param preventDocReceiveDate the preventDocReceiveDate to set
     */
    public void setPreventDocReceiveDate(String preventDocReceiveDate) {
        this.preventDocReceiveDate = preventDocReceiveDate;
    }

    /**
     * @return the preventInputDate
     */
    public String getPreventInputDate() {
        return preventInputDate;
    }

    /**
     * @param preventInputDate the preventInputDate to set
     */
    public void setPreventInputDate(String preventInputDate) {
        this.preventInputDate = preventInputDate;
    }

    /**
     * @return the preventDocSummary
     */
    public String getPreventDocSummary() {
        return preventDocSummary;
    }

    /**
     * @param preventDocSummary the preventDocSummary to set
     */
    public void setPreventDocSummary(String preventDocSummary) {
        this.preventDocSummary = preventDocSummary;
    }

    /**
     * @return the preventFileName
     */
    public String getPreventFileName() {
        return preventFileName;
    }

    /**
     * @param preventFileName the preventFileName to set
     */
    public void setPreventFileName(String preventFileName) {
        this.preventFileName = preventFileName;
    }

    /**
     * @return the preventFilePath
     */
    public String getPreventFilePath() {
        return preventFilePath;
    }

    /**
     * @param preventFilePath the preventFilePath to set
     */
    public void setPreventFilePath(String preventFilePath) {
        this.preventFilePath = preventFilePath;
    }

    /**
     * @return the preventNote
     */
    public String getPreventNote() {
        return preventNote;
    }

    /**
     * @param preventNote the preventNote to set
     */
    public void setPreventNote(String preventNote) {
        this.preventNote = preventNote;
    }

    /**
     * @return the releaseFlg
     */
    public Boolean getReleaseFlg() {
        return releaseFlg;
    }

    /**
     * @param releaseFlg the releaseFlg to set
     */
    public void setReleaseFlg(Boolean releaseFlg) {
        this.releaseFlg = releaseFlg;
    }

    /**
     * @return the releaseRegistAgency
     */
    public String getReleaseRegistAgency() {
        return releaseRegistAgency;
    }

    /**
     * @param releaseRegistAgency the releaseRegistAgency to set
     */
    public void setReleaseRegistAgency(String releaseRegistAgency) {
        this.releaseRegistAgency = releaseRegistAgency;
    }

    /**
     * @return the releaseInBookNumber
     */
    public String getReleaseInBookNumber() {
        return releaseInBookNumber;
    }

    /**
     * @param releaseInBookNumber the releaseInBookNumber to set
     */
    public void setReleaseInBookNumber(String releaseInBookNumber) {
        this.releaseInBookNumber = releaseInBookNumber;
    }

    /**
     * @return the releasePersonInfo
     */
    public String getReleasePersonInfo() {
        return releasePersonInfo;
    }

    /**
     * @param releasePersonInfo the releasePersonInfo to set
     */
    public void setReleasePersonInfo(String releasePersonInfo) {
        this.releasePersonInfo = releasePersonInfo;
    }

    /**
     * @return the releaseDocNumber
     */
    public String getReleaseDocNumber() {
        return releaseDocNumber;
    }

    /**
     * @param releaseDocNumber the releaseDocNumber to set
     */
    public void setReleaseDocNumber(String releaseDocNumber) {
        this.releaseDocNumber = releaseDocNumber;
    }

    /**
     * @return the releaseDocDate
     */
    public String getReleaseDocDate() {
        return releaseDocDate;
    }

    /**
     * @param releaseDocDate the releaseDocDate to set
     */
    public void setReleaseDocDate(String releaseDocDate) {
        this.releaseDocDate = releaseDocDate;
    }

    /**
     * @return the releaseDocReceiveDate
     */
    public String getReleaseDocReceiveDate() {
        return releaseDocReceiveDate;
    }

    /**
     * @param releaseDocReceiveDate the releaseDocReceiveDate to set
     */
    public void setReleaseDocReceiveDate(String releaseDocReceiveDate) {
        this.releaseDocReceiveDate = releaseDocReceiveDate;
    }

    /**
     * @return the releaseInputDate
     */
    public String getReleaseInputDate() {
        return releaseInputDate;
    }

    /**
     * @param releaseInputDate the releaseInputDate to set
     */
    public void setReleaseInputDate(String releaseInputDate) {
        this.releaseInputDate = releaseInputDate;
    }

    /**
     * @return the releaseDocSummary
     */
    public String getReleaseDocSummary() {
        return releaseDocSummary;
    }

    /**
     * @param releaseDocSummary the releaseDocSummary to set
     */
    public void setReleaseDocSummary(String releaseDocSummary) {
        this.releaseDocSummary = releaseDocSummary;
    }

    /**
     * @return the releaseFileName
     */
    public String getReleaseFileName() {
        return releaseFileName;
    }

    /**
     * @param releaseFileName the releaseFileName to set
     */
    public void setReleaseFileName(String releaseFileName) {
        this.releaseFileName = releaseFileName;
    }

    /**
     * @return the releaseFilePath
     */
    public String getReleaseFilePath() {
        return releaseFilePath;
    }

    /**
     * @param releaseFilePath the releaseFilePath to set
     */
    public void setReleaseFilePath(String releaseFilePath) {
        this.releaseFilePath = releaseFilePath;
    }

    /**
     * @return the releaseNote
     */
    public String getReleaseNote() {
        return releaseNote;
    }

    /**
     * @param releaseNote the releaseNote to set
     */
    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
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
    public String getLandIssueDate() {
        return landIssueDate;
    }

    /**
     * @param landIssueDate the landIssueDate to set
     */
    public void setLandIssueDate(String landIssueDate) {
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
    public String getCarIssueDate() {
        return carIssueDate;
    }

    /**
     * @param carIssueDate the carIssueDate to set
     */
    public void setCarIssueDate(String carIssueDate) {
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
     * @return the fromRegistScreen
     */
    public Boolean getFromRegistScreen() {
        return fromRegistScreen;
    }

    /**
     * @param fromRegistScreen the fromRegistScreen to set
     */
    public void setFromRegistScreen(Boolean fromRegistScreen) {
        this.fromRegistScreen = fromRegistScreen;
    }

    /**
     * @return the isSimpleInsert
     */
    public Boolean getIsSimpleInsert() {
        return isSimpleInsert;
    }

    /**
     * @param isSimpleInsert the isSimpleInsert to set
     */
    public void setIsSimpleInsert(Boolean isSimpleInsert) {
        this.isSimpleInsert = isSimpleInsert;
    }

    /**
     * @return the preventPersonInfo
     */
    public String getPreventPersonInfo() {
        return preventPersonInfo;
    }

    /**
     * @param preventPersonInfo the preventPersonInfo to set
     */
    public void setPreventPersonInfo(String preventPersonInfo) {
        this.preventPersonInfo = preventPersonInfo;
    }

    /**
     * @return the lstHistoryInfo
     */
    public List<DataPreventHistoryInfo> getLstHistoryInfo() {
        return lstHistoryInfo;
    }

    /**
     * @param lstHistoryInfo the lstHistoryInfo to set
     */
    public void setLstHistoryInfo(List<DataPreventHistoryInfo> lstHistoryInfo) {
        this.lstHistoryInfo = lstHistoryInfo;
    }

    /**
     * @return the isNotaryOfficeData
     */
    public Boolean getIsNotaryOfficeData() {
        return isNotaryOfficeData;
    }

    /**
     * @param isNotaryOfficeData the isNotaryOfficeData to set
     */
    public void setIsNotaryOfficeData(Boolean isNotaryOfficeData) {
        this.isNotaryOfficeData = isNotaryOfficeData;
    }

	/**
	 * @param districtList the districtList to set
	 */
	public void setDistrictList(List<DistrictInfo> districtList) {
		this.districtList = districtList;
	}

	/**
	 * @return the districtList
	 */
	public List<DistrictInfo> getDistrictList() {
		return districtList;
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

//    /**
//     * @return the lstProvince
//     */
//    public List<ProvinceInfo> getLstProvince() {
//        return lstProvince;
//    }
//
//    /**
//     * @param lstProvince the lstProvince to set
//     */
//    public void setLstProvince(List<ProvinceInfo> lstProvince) {
//        this.lstProvince = lstProvince;
//    }
//
//    /**
//     * @return the lstDistrict
//     */
//    public List<DistrictInfo> getLstDistrict() {
//        return lstDistrict;
//    }
//
//    /**
//     * @param lstDistrict the lstDistrict to set
//     */
//    public void setLstDistrict(List<DistrictInfo> lstDistrict) {
//        this.lstDistrict = lstDistrict;
//    }
}

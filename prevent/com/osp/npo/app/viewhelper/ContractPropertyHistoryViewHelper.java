package com.osp.npo.app.viewhelper;

import java.util.List;
import com.osp.npo.core.prevent.DataPreventHistoryInfo;

/**
 *
 * Data Prevent View Helper
 *
 * @author GiangVT
 * @version $Revision$
 */
public class ContractPropertyHistoryViewHelper {

    public static final String SESSION_KEY = "contractPropertyViewHelper";

    private List<DataPreventHistoryInfo> lstHistoryInfo;

    /** TÃ i sáº£n bÃ¡o cháº·n */
    private String propertyTypeName;

    /** Thong tin tai san */
    private String propertyInfo;

    /** Ph�n lo?i d? li?u ngan ch?n: */
    private String originKind;

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

    /**
     * @return the propertyTypeName
     */
    public String getPropertyTypeName() {
        return propertyTypeName;
    }

    /**
     * @param propertyTypeName the propertyTypeName to set
     */
    public void setPropertyTypeName(String propertyTypeName) {
        this.propertyTypeName = propertyTypeName;
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
}
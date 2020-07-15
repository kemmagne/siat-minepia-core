package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.User;

/**
 *
 * @author ht
 */
public class MinaderFileTracking implements Serializable {

    private String fileNumber;
    /**
     * n° e-FORCE
     */
    private String requestNumber;
    private String fileTypeCode;
    private String fileTypeNameFr;
    private String fileTypeNameEn;
    private Date creationDate;
    private String niu;
    private String exporterName;
    private String productyTypeCode;
    private String productyTypeName;
    private Long officeId;
    private String officeCode;
    private String officeNameFr;
    private String officeNameEn;
    private Step currenStep;
    private User currenStepUser;
    private Date userReceivedDate;
    private Long userDeadline;
    private Long globalDeadline;

    private File file;

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(String fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getFileTypeNameFr() {
        return fileTypeNameFr;
    }

    public void setFileTypeNameFr(String fileTypeNameFr) {
        this.fileTypeNameFr = fileTypeNameFr;
    }

    public String getFileTypeNameEn() {
        return fileTypeNameEn;
    }

    public void setFileTypeNameEn(String fileTypeNameEn) {
        this.fileTypeNameEn = fileTypeNameEn;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getNiu() {
        return niu;
    }

    public void setNiu(String niu) {
        this.niu = niu;
    }

    public String getExporterName() {
        return exporterName;
    }

    public void setExporterName(String exporterName) {
        this.exporterName = exporterName;
    }

    public String getProductyTypeCode() {
        return productyTypeCode;
    }

    public void setProductyTypeCode(String productyTypeCode) {
        this.productyTypeCode = productyTypeCode;
    }

    public String getProductyTypeName() {
        return productyTypeName;
    }

    public void setProductyTypeName(String productyTypeName) {
        this.productyTypeName = productyTypeName;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getOfficeNameFr() {
        return officeNameFr;
    }

    public void setOfficeNameFr(String officeNameFr) {
        this.officeNameFr = officeNameFr;
    }

    public String getOfficeNameEn() {
        return officeNameEn;
    }

    public void setOfficeNameEn(String officeNameEn) {
        this.officeNameEn = officeNameEn;
    }

    public Step getCurrenStep() {
        return currenStep;
    }

    public void setCurrenStep(Step currenStep) {
        this.currenStep = currenStep;
    }

    public User getCurrenStepUser() {
        return currenStepUser;
    }

    public void setCurrenStepUser(User currenStepUser) {
        this.currenStepUser = currenStepUser;
    }

    public Date getUserReceivedDate() {
        return userReceivedDate;
    }

    public void setUserReceivedDate(Date userReceivedDate) {
        this.userReceivedDate = userReceivedDate;
    }

    public Long getUserDeadline() {
        return userDeadline;
    }

    public void setUserDeadline(Long userDeadline) {
        this.userDeadline = userDeadline;
    }

    public Long getGlobalDeadline() {
        return globalDeadline;
    }

    public void setGlobalDeadline(Long globalDeadline) {
        this.globalDeadline = globalDeadline;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}

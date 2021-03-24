package org.guce.siat.core.ct.filter;

import java.util.Date;
import org.guce.siat.common.model.User;

/**
 *
 * @author yenke
 */
public class CteFilter {

    private Date validationFromDate;
    private Date validationToDate;

    private Date creationFromDate;
    private Date creationToDate;

    private String[] processCodeList;

    private String[] productNatureList;

    private String[] officeCodeList;

    private String[] operationType;

    private String clientNiu;

    private User loggedUser;

    public Date getValidationFromDate() {
        return validationFromDate;
    }

    public void setValidationFromDate(Date validationFromDate) {
        this.validationFromDate = validationFromDate;
    }

    public Date getValidationToDate() {
        return validationToDate;
    }

    public void setValidationToDate(Date validationToDate) {
        this.validationToDate = validationToDate;
    }

    public Date getCreationFromDate() {
        return creationFromDate;
    }

    public void setCreationFromDate(Date creationFromDate) {
        this.creationFromDate = creationFromDate;
    }

    public Date getCreationToDate() {
        return creationToDate;
    }

    public void setCreationToDate(Date creationToDate) {
        this.creationToDate = creationToDate;
    }

    public String[] getProcessCodeList() {
        return processCodeList;
    }

    public void setProcessCodeList(String[] processCodeList) {
        this.processCodeList = processCodeList;
    }

    public String[] getProductNatureList() {
        return productNatureList;
    }

    public void setProductNatureList(String[] productNatureList) {
        this.productNatureList = productNatureList;
    }

    public String[] getOfficeCodeList() {
        return officeCodeList;
    }

    public void setOfficeCodeList(String[] officeCodeList) {
        this.officeCodeList = officeCodeList;
    }

    public String[] getOperationType() {
        return operationType;
    }

    public void setOperationType(String[] operationType) {
        this.operationType = operationType;
    }

    public String getClientNiu() {
        return clientNiu;
    }

    public void setClientNiu(String clientNiu) {
        this.clientNiu = clientNiu;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

}

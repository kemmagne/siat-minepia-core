package org.guce.siat.core.ct.filter;

import java.util.List;
import org.guce.siat.common.model.User;

/**
 *
 * @author ht
 */
public class MinaderFileTrackingFilter extends Filter {

    /**
     * liste des codes des procédures
     */
    private List<String> fileTypesList;
    private String fileNumber;
    /**
     * n° e-FORCE
     */
    private String requestNumber;
    private List<String> producTypesList;
    private List<Long> officesList;
    private User loggedUser;

    public List<String> getFileTypesList() {
        return fileTypesList;
    }

    public void setFileTypesList(List<String> fileTypesList) {
        this.fileTypesList = fileTypesList;
    }

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

    public List<String> getProducTypesList() {
        return producTypesList;
    }

    public void setProducTypesList(List<String> producTypesList) {
        this.producTypesList = producTypesList;
    }

    public List<Long> getOfficesList() {
        return officesList;
    }

    public void setOfficesList(List<Long> officesList) {
        this.officesList = officesList;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

}

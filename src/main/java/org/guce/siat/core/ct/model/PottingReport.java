package org.guce.siat.core.ct.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;

/**
 *
 * @author ht
 */
@Entity
@Table(name = "POTTING_REPORT")
public class PottingReport extends AbstractModel {

    /**
     * The id.
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POTTING_REPORT_SEQ")
    @SequenceGenerator(name = "POTTING_REPORT_SEQ", sequenceName = "POTTING_REPORT_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FILE_ID", referencedColumnName = "id")
    private File file;

    @ManyToOne
    @JoinColumn(name = "APP_ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow appointmentItemFlow;
    @Column(name = "INSPECTION_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date inspectionDate;
    @ManyToOne
    @JoinColumn(name = "INSPECTION_CONTROLLER_ID", referencedColumnName = "id")
    private User inspectionController;
    @Column(name = "TREATMENT_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date treatmentDate;
    @ManyToOne
    @JoinColumn(name = "TREATMENT_CONTROLLER_ID", referencedColumnName = "id")
    private User treatmentController;
    @Column(name = "APPOINTMENT_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date appointmentDate;
    @Column(name = "APPOINTMENT_DATE_BACK")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date appointmentDateBack;
    @Column(name = "APPOINTMENT_DETAILS")
    private String appointmentDetails;

    @ManyToOne
    @JoinColumn(name = "POTTING_CONTROLLER_ID", referencedColumnName = "id")
    private User pottingController;
    @Column(name = "POTTING_END_DATE")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pottingEndDate;
    @ManyToOne
    @JoinColumn(name = "VALID_ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow validationItemFlow;
    @Column(name = "AUTHORIZATION_NUMBER", length = 35)
    private String authorizationNumber;
    @Column(name = "AUTHORIZATION_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date authorizationDate;
    @Column(name = "TREATMENT_CERT_NUMBER", length = 35)
    private String treatmentCertNumber;
    @Column(name = "TREATMENT_CERT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date treatmentCertDate;
    @Column(name = "QUALITY", length = 35)
    private String quality;
    @Column(name = "OTHER_PRODUCT_TYPE_DESC", length = 100)
    private String otherProcductTypeDescription;
    @Column(name = "ADDITIONAL_INFORMATIONS")
    private String additionalInformations;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ItemFlow getAppointmentItemFlow() {
        return appointmentItemFlow;
    }

    public void setAppointmentItemFlow(ItemFlow appointmentItemFlow) {
        this.appointmentItemFlow = appointmentItemFlow;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public User getInspectionController() {
        return inspectionController;
    }

    public void setInspectionController(User inspectionController) {
        this.inspectionController = inspectionController;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public User getTreatmentController() {
        return treatmentController;
    }

    public void setTreatmentController(User treatmentController) {
        this.treatmentController = treatmentController;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Date getAppointmentDateBack() {
        return appointmentDateBack;
    }

    public void setAppointmentDateBack(Date appointmentDateBack) {
        this.appointmentDateBack = appointmentDateBack;
    }

    public String getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(String appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }

    public Date getPottingEndDate() {
        return pottingEndDate;
    }

    public void setPottingEndDate(Date pottingEndDate) {
        this.pottingEndDate = pottingEndDate;
    }

    public ItemFlow getValidationItemFlow() {
        return validationItemFlow;
    }

    public void setValidationItemFlow(ItemFlow validationItemFlow) {
        this.validationItemFlow = validationItemFlow;
    }

    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public Date getAuthorizationDate() {
        return authorizationDate;
    }

    public void setAuthorizationDate(Date authorizationDate) {
        this.authorizationDate = authorizationDate;
    }

    public String getTreatmentCertNumber() {
        return treatmentCertNumber;
    }

    public void setTreatmentCertNumber(String treatmentCertNumber) {
        this.treatmentCertNumber = treatmentCertNumber;
    }

    public Date getTreatmentCertDate() {
        return treatmentCertDate;
    }

    public void setTreatmentCertDate(Date treatmentCertDate) {
        this.treatmentCertDate = treatmentCertDate;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getOtherProcductTypeDescription() {
        return otherProcductTypeDescription;
    }

    public void setOtherProcductTypeDescription(String otherProcductTypeDescription) {
        this.otherProcductTypeDescription = otherProcductTypeDescription;
    }

    public String getAdditionalInformations() {
        return additionalInformations;
    }

    public void setAdditionalInformations(String additionalInformations) {
        this.additionalInformations = additionalInformations;
    }

    public User getPottingController() {
        return pottingController;
    }

    public void setPottingController(User pottingController) {
        this.pottingController = pottingController;
    }

}

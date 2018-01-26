package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;

/**
 *
 * @author tadzotsa
 */
@Entity
@Table(name = "INTERCEPTION_NOTIFICATION")
@XmlRootElement
public class InterceptionNotification extends AbstractModel implements Serializable {

    private static final long serialVersionUID = -3467922231028830373L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERCEPTION_NOTIFICATION_SEQ")
    @SequenceGenerator(name = "INTERCEPTION_NOTIFICATION_SEQ", sequenceName = "INTERCEPTION_NOTIFICATION_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow itemFlow;

    @Column(name = "NOTIFICATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date notificationDate;

    @Column(name = "CONTAMINATED_PRODUCT")
    private boolean contaminatedProduct;

    @Column(name = "CONTAMINATION_AGENT")
    private String contaminationAgent;

    @Column(name = "PROHIBITED_PRODUCT")
    private boolean prohibitedProduct;

    @Column(name = "ACTIVE_INGREDIENT")
    private String activeIngredient;

    @Column(name = "PHYTO_ABSENT")
    private boolean phytoAbsent;

    @Column(name = "PHYTO_UNACCEPTABLE")
    private boolean phytoUnacceptable;

    @Column(name = "PHYTO_REASONS")
    private String phytoReasons;

    @Column(name = "TM_DESTRUCTION")
    private boolean tmDestruction;

    @Column(name = "TM_QUARANTINE")
    private boolean tmQuarantine;

    @Column(name = "TM_SUPPRESSION")
    private boolean tmSuppression;

    @Column(name = "TM_ELIMINATION")
    private boolean tmElimination;

    @Column(name = "TM_TREATMENT")
    private boolean tmTreatment;

    @Column(name = "OTHER_TAKEN_MEASURE")
    private String otherTakenMeasure;

    @Column(name = "COMMODITY_CATEGORY")
    private String commodityCategory;

    @Column(name = "SHIPMENT_QUANTITY")
    private String shipmentQuantity;

    @Column(name = "SHIPMENT_DETAILS")
    private String shipmentDetails;

    @Column(name = "SENDER")
    private String sender;

    @Column(name = "RECIPIENT")
    private String recipient;

    @Column(name = "PACKAGES_MARK")
    private String packagesMark;

    @Column(name = "MEAN_OF_TRANSPORT")
    private String meanOfTransport;

    @Column(name = "PHYTO_NUMBER")
    private String phytoNumber;

    @Column(name = "INSPECTION_DATE")
    @Temporal(TemporalType.DATE)
    private Date inspectionDate;

    @Column(name = "INSPECTION_PLACE")
    private String inspectionPlace;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public ItemFlow getItemFlow() {
        return itemFlow;
    }

    public void setItemFlow(ItemFlow itemFlow) {
        this.itemFlow = itemFlow;
    }

    public Date getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }

    public boolean isContaminatedProduct() {
        return contaminatedProduct;
    }

    public void setContaminatedProduct(boolean contaminatedProduct) {
        this.contaminatedProduct = contaminatedProduct;
    }

    public String getContaminationAgent() {
        return contaminationAgent;
    }

    public void setContaminationAgent(String contaminationAgent) {
        this.contaminationAgent = contaminationAgent;
    }

    public boolean isProhibitedProduct() {
        return prohibitedProduct;
    }

    public void setProhibitedProduct(boolean prohibitedProduct) {
        this.prohibitedProduct = prohibitedProduct;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public boolean isPhytoAbsent() {
        return phytoAbsent;
    }

    public void setPhytoAbsent(boolean phytoAbsent) {
        this.phytoAbsent = phytoAbsent;
    }

    public boolean isPhytoUnacceptable() {
        return phytoUnacceptable;
    }

    public void setPhytoUnacceptable(boolean phytoUnacceptable) {
        this.phytoUnacceptable = phytoUnacceptable;
    }

    public String getPhytoReasons() {
        return phytoReasons;
    }

    public void setPhytoReasons(String phytoReasons) {
        this.phytoReasons = phytoReasons;
    }

    public String getOtherTakenMeasure() {
        return otherTakenMeasure;
    }

    public void setOtherTakenMeasure(String otherTakenMeasure) {
        this.otherTakenMeasure = otherTakenMeasure;
    }

    public String getCommodityCategory() {
        return commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
    }

    public String getShipmentQuantity() {
        return shipmentQuantity;
    }

    public void setShipmentQuantity(String shipmentQuantity) {
        this.shipmentQuantity = shipmentQuantity;
    }

    public String getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(String shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPackagesMark() {
        return packagesMark;
    }

    public void setPackagesMark(String packagesMark) {
        this.packagesMark = packagesMark;
    }

    public String getMeanOfTransport() {
        return meanOfTransport;
    }

    public void setMeanOfTransport(String meanOfTransport) {
        this.meanOfTransport = meanOfTransport;
    }

    public String getPhytoNumber() {
        return phytoNumber;
    }

    public void setPhytoNumber(String phytoNumber) {
        this.phytoNumber = phytoNumber;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspectionPlace() {
        return inspectionPlace;
    }

    public void setInspectionPlace(String inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }

    public boolean isTmDestruction() {
        return tmDestruction;
    }

    public void setTmDestruction(boolean tmDestruction) {
        this.tmDestruction = tmDestruction;
    }

    public boolean isTmQuarantine() {
        return tmQuarantine;
    }

    public void setTmQuarantine(boolean tmQuarantine) {
        this.tmQuarantine = tmQuarantine;
    }

    public boolean isTmSuppression() {
        return tmSuppression;
    }

    public void setTmSuppression(boolean tmSuppression) {
        this.tmSuppression = tmSuppression;
    }

    public boolean isTmElimination() {
        return tmElimination;
    }

    public void setTmElimination(boolean tmElimination) {
        this.tmElimination = tmElimination;
    }

    public boolean isTmTreatment() {
        return tmTreatment;
    }

    public void setTmTreatment(boolean tmTreatment) {
        this.tmTreatment = tmTreatment;
    }

    @PrePersist
    public void prePersist() {
        notificationDate = new Date();
    }

}


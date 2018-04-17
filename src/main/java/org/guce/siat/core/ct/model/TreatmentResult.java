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
 * The Class TreatmentResult.
 */
@Entity
@Table(name = "TREATMENT_RESULT")
@XmlRootElement
public class TreatmentResult extends AbstractModel implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1063393868984320428L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_RESULT_SEQ")
    @SequenceGenerator(name = "TREATMENT_RESULT_SEQ", sequenceName = "TREATMENT_RESULT_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The treatment date.
     */
    @Column(name = "TREATMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date treatmentDate;

    @Column(name = "SAVED_DATE")
    @Temporal(TemporalType.DATE)
    private Date savedDate;

    /**
     * The amount.
     */
    @Column(name = "AMOUNT")
    private String amount;

    /**
     * The dosage.
     */
    @Column(name = "DOSAGE")
    private String dosage;

    /**
     * The treatment product name.
     */
    @Column(name = "TREATMENT_PRODUCT_NAME")
    private String treatmentProductName;

    /**
     * The observation.
     */
    @Column(name = "OBSERVATION")
    private String observation;

    /**
     * The item flow.
     */
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow itemFlow;

    /**
     * The treatment order.
     */
    @ManyToOne
    @JoinColumn(name = "TREATMENT_ORDER_ID", referencedColumnName = "id")
    private TreatmentOrder treatmentOrder;

    /**
     * Informations attestation de traitement
     */
    @Column(name = "AT_ATTESTATION_NUMBER")
    private String attestationNumber;
    @Column(name = "AT_TREATMENT_TYPE")
    private String treatmentType;
    @Column(name = "AT_HOMOLOGATION_NUMBER")
    private String homologationNumber;
    @Column(name = "AT_CONCENTRATION")
    private String atConcentration;

    /**
     * Informations fiche de supervision de traitement
     */
    @Column(name = "TSS_SHEET_NUMBER")
    private String sheetNumber;
    @Column(name = "TSS_TREATMENT_MODE")
    private String treatmentMode;
    @Column(name = "TSS_OTHER_TREATMENT_MODE")
    private String otherTreatmentMode;
    @Column(name = "TSS_PRODUCT_USED")
    private String productUsed;
    @Column(name = "TSS_OTHER_PRODUCT_USED")
    private String otherProductUsed;
    @Column(name = "TSS_ACTIVE_INGREDIENT")
    private String activeIngredient;
    @Column(name = "TSS_TREATMENT_DOSE")
    private String treatmentDose;
    @Column(name = "TSS_CONCENTRATION")
    private String tsfConcentration;
    @Column(name = "TSS_ANTIDOTE")
    private String antidote;
    @Column(name = "TSS_TREATMENT_TIME")
    @Temporal(TemporalType.TIME)
    private Date treatmentTime;
    @Column(name = "TSS_STORAGE_ENV")
    private String treatmentEnvironment;
    @Column(name = "TSS_OTHER_TREAT_ENV")
    private String otherTreatmentEnvironment;
    @Column(name = "TSS_OPTIMAL_TEMPERATURE")
    private String optimalTemperature;
    @Column(name = "TSS_STORAGE_PLACE")
    private String storagePlace;
    @Column(name = "TSS_OTHER_STORAGE_PLACE")
    private String otherStoragePlace;
    @Column(name = "TSS_SANITARY_PLACE")
    private boolean sanitaryState;
    @Column(name = "TSS_CONDITIONING")
    private String conditioning;
    @Column(name = "TSS_WEATHER_CONDITION")
    private String weatherCondition;
    @Column(name = "TSS_OTHER_WEATHER_CONDITION")
    private String otherWeatherCondition;
    @Column(name = "TSS_TREATMENT_PREVENTION")
    private boolean treatmentPrevention;
    @Column(name = "TSS_RESIDENTS_INFO")
    private boolean residentsInformations;
    @Column(name = "TSS_PREV_PLAQUE_PRESENT")
    private boolean preventionPlaquePresent;
    @Column(name = "TSS_STAFF_SEC_NATURE")
    private String staffSecurityNature;
    @Column(name = "TSS_PROTECTION_EQUIP")
    private String protectionEquipements;
    @Column(name = "TSS_GENERAL_OBS")
    private String generalObservations;
    @Column(name = "TSS_TREATMENT_DURATION")
    private String treatmentDuration;
    @Column(name = "TSS_TREATMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uncoveringDate;
    @Column(name = "TREATMENT_COMPANY_NAME")
    private String treatmentCompanyName;
    @Column(name = "TREATMENT_COMPANY_ADDRESS")
    private String treatmentCompanyAddress;
    @Column(name = "TREATMENT_COMPANY_TEL")
    private String treatmentCompanyTel;
    @Column(name = "TREATMENT_COMPANY_BP")
    private String treatmentCompanyBp;
    @Column(name = "TREATMENT_COMPANY_FAX")
    private String treatmentCompanyFax;
    @Column(name = "TREATMENT_COMPANY_EMAIL")
    private String treatmentCompanyEmail;
    @Column(name = "TREATMENT_SUPERVISOR")
    private String supervisor;

    /**
     * Gets the id.
     *
     * @return the id
     */
    @Override

    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id to set
     */
    @Override
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Gets the treatment date.
     *
     * @return the treatmentDate
     */
    public Date getTreatmentDate() {
        return treatmentDate;
    }

    /**
     * Sets the treatment date.
     *
     * @param treatmentDate the treatmentDate to set
     */
    public void setTreatmentDate(final Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    /**
     * Gets the amount.
     *
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     *
     * @param amount the amount to set
     */
    public void setAmount(final String amount) {
        this.amount = amount;
    }

    /**
     * Gets the dosage.
     *
     * @return the dosage
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Sets the dosage.
     *
     * @param dosage the dosage to set
     */
    public void setDosage(final String dosage) {
        this.dosage = dosage;
    }

    /**
     * Gets the treatment product name.
     *
     * @return the treatmentProductName
     */
    public String getTreatmentProductName() {
        return treatmentProductName;
    }

    /**
     * Sets the treatment product name.
     *
     * @param treatmentProductName the treatmentProductName to set
     */
    public void setTreatmentProductName(final String treatmentProductName) {
        this.treatmentProductName = treatmentProductName;
    }

    /**
     * Gets the observation.
     *
     * @return the observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Sets the observation.
     *
     * @param observation the observation to set
     */
    public void setObservation(final String observation) {
        this.observation = observation;
    }

    /**
     * Gets the item flow.
     *
     * @return the itemFlow
     */
    public ItemFlow getItemFlow() {
        return itemFlow;
    }

    /**
     * Sets the item flow.
     *
     * @param itemFlow the itemFlow to set
     */
    public void setItemFlow(final ItemFlow itemFlow) {
        this.itemFlow = itemFlow;
    }

    /**
     * Gets the treatment order.
     *
     * @return the treatmentOrder
     */
    public TreatmentOrder getTreatmentOrder() {
        return treatmentOrder;
    }

    /**
     * Sets the treatment order.
     *
     * @param treatmentOrder the treatmentOrder to set
     */
    public void setTreatmentOrder(final TreatmentOrder treatmentOrder) {
        this.treatmentOrder = treatmentOrder;
    }

    public String getAttestationNumber() {
        return attestationNumber;
    }

    public void setAttestationNumber(String attestationNumber) {
        this.attestationNumber = attestationNumber;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public String getHomologationNumber() {
        return homologationNumber;
    }

    public void setHomologationNumber(String homologationNumber) {
        this.homologationNumber = homologationNumber;
    }

    public String getAtConcentration() {
        return atConcentration;
    }

    public void setAtConcentration(String atConcentration) {
        this.atConcentration = atConcentration;
    }

    public String getSheetNumber() {
        return sheetNumber;
    }

    public void setSheetNumber(String sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    public String getTreatmentMode() {
        return treatmentMode;
    }

    public void setTreatmentMode(String treatmentMode) {
        this.treatmentMode = treatmentMode;
    }

    public String getOtherTreatmentMode() {
        return otherTreatmentMode;
    }

    public void setOtherTreatmentMode(String otherTreatmentMode) {
        this.otherTreatmentMode = otherTreatmentMode;
    }

    public String getProductUsed() {
        return productUsed;
    }

    public void setProductUsed(String productUsed) {
        this.productUsed = productUsed;
    }

    public String getOtherProductUsed() {
        return otherProductUsed;
    }

    public void setOtherProductUsed(String otherProductUsed) {
        this.otherProductUsed = otherProductUsed;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getTreatmentDose() {
        return treatmentDose;
    }

    public void setTreatmentDose(String treatmentDose) {
        this.treatmentDose = treatmentDose;
    }

    public String getTsfConcentration() {
        return tsfConcentration;
    }

    public void setTsfConcentration(String tsfConcentration) {
        this.tsfConcentration = tsfConcentration;
    }

    public String getAntidote() {
        return antidote;
    }

    public void setAntidote(String antidote) {
        this.antidote = antidote;
    }

    public Date getTreatmentTime() {
        return treatmentTime;
    }

    public void setTreatmentTime(Date treatmentTime) {
        this.treatmentTime = treatmentTime;
    }

    public String getTreatmentEnvironment() {
        return treatmentEnvironment;
    }

    public void setTreatmentEnvironment(String treatmentEnvironment) {
        this.treatmentEnvironment = treatmentEnvironment;
    }

    public String getOtherTreatmentEnvironment() {
        return otherTreatmentEnvironment;
    }

    public void setOtherTreatmentEnvironment(String otherTreatmentEnvironment) {
        this.otherTreatmentEnvironment = otherTreatmentEnvironment;
    }

    public String getOptimalTemperature() {
        return optimalTemperature;
    }

    public void setOptimalTemperature(String optimalTemperature) {
        this.optimalTemperature = optimalTemperature;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public String getOtherStoragePlace() {
        return otherStoragePlace;
    }

    public void setOtherStoragePlace(String otherStoragePlace) {
        this.otherStoragePlace = otherStoragePlace;
    }

    public boolean isSanitaryState() {
        return sanitaryState;
    }

    public void setSanitaryState(boolean sanitaryState) {
        this.sanitaryState = sanitaryState;
    }

    public String getConditioning() {
        return conditioning;
    }

    public void setConditioning(String conditioning) {
        this.conditioning = conditioning;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getOtherWeatherCondition() {
        return otherWeatherCondition;
    }

    public void setOtherWeatherCondition(String otherWeatherCondition) {
        this.otherWeatherCondition = otherWeatherCondition;
    }

    public boolean isTreatmentPrevention() {
        return treatmentPrevention;
    }

    public void setTreatmentPrevention(boolean treatmentPrevention) {
        this.treatmentPrevention = treatmentPrevention;
    }

    public boolean isResidentsInformations() {
        return residentsInformations;
    }

    public void setResidentsInformations(boolean residentsInformations) {
        this.residentsInformations = residentsInformations;
    }

    public String getStaffSecurityNature() {
        return staffSecurityNature;
    }

    public void setStaffSecurityNature(String staffSecurityNature) {
        this.staffSecurityNature = staffSecurityNature;
    }

    public String getProtectionEquipements() {
        return protectionEquipements;
    }

    public void setProtectionEquipements(String protectionEquipements) {
        this.protectionEquipements = protectionEquipements;
    }

    public String getGeneralObservations() {
        return generalObservations;
    }

    public void setGeneralObservations(String generalObservations) {
        this.generalObservations = generalObservations;
    }

    public String getTreatmentDuration() {
        return treatmentDuration;
    }

    public void setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }

    public Date getUncoveringDate() {
        return uncoveringDate;
    }

    public void setUncoveringDate(Date uncoveringDate) {
        this.uncoveringDate = uncoveringDate;
    }

    public boolean isPreventionPlaquePresent() {
        return preventionPlaquePresent;
    }

    public void setPreventionPlaquePresent(boolean preventionPlaquePresent) {
        this.preventionPlaquePresent = preventionPlaquePresent;
    }

    public String getTreatmentCompanyName() {
        return treatmentCompanyName;
    }

    public void setTreatmentCompanyName(String treatmentCompanyName) {
        this.treatmentCompanyName = treatmentCompanyName;
    }

    public String getTreatmentCompanyAddress() {
        return treatmentCompanyAddress;
    }

    public void setTreatmentCompanyAddress(String treatmentCompanyAddress) {
        this.treatmentCompanyAddress = treatmentCompanyAddress;
    }

    public String getTreatmentCompanyTel() {
        return treatmentCompanyTel;
    }

    public void setTreatmentCompanyTel(String treatmentCompanyTel) {
        this.treatmentCompanyTel = treatmentCompanyTel;
    }

    public String getTreatmentCompanyFax() {
        return treatmentCompanyFax;
    }

    public void setTreatmentCompanyFax(String treatmentCompanyFax) {
        this.treatmentCompanyFax = treatmentCompanyFax;
    }

    public String getTreatmentCompanyEmail() {
        return treatmentCompanyEmail;
    }

    public void setTreatmentCompanyEmail(String treatmentCompanyEmail) {
        this.treatmentCompanyEmail = treatmentCompanyEmail;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getTreatmentCompanyBp() {
        return treatmentCompanyBp;
    }

    public void setTreatmentCompanyBp(String treatmentCompanyBp) {
        this.treatmentCompanyBp = treatmentCompanyBp;
    }

    @PrePersist
    private void prePersist() {
        savedDate = java.util.Calendar.getInstance().getTime();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TreatmentResult)) {
            return false;
        }
        final TreatmentResult other = (TreatmentResult) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("TreatmentResult [id=");
        builder.append(id);
        builder.append(", treatmentDate=");
        builder.append(treatmentDate);
        builder.append(", amount=");
        builder.append(amount);
        builder.append(", dosage=");
        builder.append(dosage);
        builder.append(", treatmentProductName=");
        builder.append(treatmentProductName);
        builder.append(", observation=");
        builder.append(observation);
        builder.append(']');
        return builder.toString();
    }

}

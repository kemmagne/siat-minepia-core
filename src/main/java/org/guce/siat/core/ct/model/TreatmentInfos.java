package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
import org.guce.siat.core.ct.util.annotations.CustomProperty;

/**
 *
 * @author tadzotsa
 */
@Entity
@Table(name = "TREATMENT_INFOS")
@XmlRootElement
public class TreatmentInfos extends AbstractModel implements Serializable {

    private static final long serialVersionUID = -2909713764041243938L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_INFOS_SEQ")
    @SequenceGenerator(name = "TREATMENT_INFOS_SEQ", sequenceName = "TREATMENT_INFOS_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The date.
     */
    @Column(name = "REGISTRATION_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date date;

    /**
     * The item flow.
     */
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow itemFlow;

    @CustomProperty(labelEn = "Fumigation", labelFr = "Fumigation")
    @Column(name = "FUMIGATION")
    private boolean fumigation;
    @CustomProperty(labelEn = "Disenfection", labelFr = "Désinfection")
    @Column(name = "DISENFECTION")
    private boolean disinfection;
    @CustomProperty(labelEn = "Chemical product", labelFr = "Product chimique")
    @Column(name = "CHEMICAL_PRODUCT")
    private String chemicalProduct;
    @CustomProperty(labelEn = "Duration", labelFr = "Durée")
    @Column(name = "DURATION")
    private String duration;
    @CustomProperty(labelEn = "Temperature", labelFr = "Température")
    @Column(name = "TEMPERATURE")
    private String temperature;
    @CustomProperty(labelEn = "Concentration", labelFr = "Concentration")
    @Column(name = "CONCENTRATION")
    private String concentration;
    @CustomProperty(labelEn = "Addtional informations", labelFr = "Informations additionnelles")
    @Column(name = "ADDITIONAL_INFOS", length = 1000)
    private String additionalInfos;
    @CustomProperty(labelEn = "Treatments carried out", labelFr = "Traitements effectués")
    @Column(name = "TREATMENTS_CARRIED_OUT")
    private String treatmentsCarriedOut;
    @CustomProperty(labelEn = "Treatment type", labelFr = "Type de traitement")
    @Column(name = "TYPE_OF_TREATMENT")
    private String typeOfTreatment;
    @CustomProperty(labelEn = "Additional declaration", labelFr = "Déclaration additionnelle")
    @Column(name = "ADDITIONAL_DECLARATION", length = 1000)
    private String additionnalDeclaration;
    @Column(name = "DELIVRABLE_TYPE", length = 10)
    private String delivrableType;
    @CustomProperty(labelEn = "Commodity category", labelFr = "Catégorie de la marchandise")
    @Column(name = "COMMODITY_CATEGORY", length = 5)
    private String commodityCaterory;
    @CustomProperty(labelEn = "Certificate Validity", labelFr = "Validité du certificat")
    @Column(name = "VALIDITY")
    private String validity;
    @CustomProperty(labelEn = "PAckager on packing", labelFr = "Emballeur sur l'emballage")
    @Column(name = "PACKAGER_ON_PACKAGING", length = 100)
    private String packagerOnPackaging;
    @CustomProperty(labelEn = "Conservation temperature", labelFr = "Température de conservation")
    @Column(name = "CONSERVATION_TEMPERATURE", length = 10)
    private String conservationTemperature;

    @Column(name = "TREATMENT_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date treatmentDate;

    @Column(name = "TREATMENT_END_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date treatmentEndDate;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ItemFlow getItemFlow() {
        return itemFlow;
    }

    public void setItemFlow(ItemFlow itemFlow) {
        this.itemFlow = itemFlow;
    }

    public boolean isFumigation() {
        return fumigation;
    }

    public void setFumigation(boolean fumigation) {
        this.fumigation = fumigation;
    }

    public boolean isDisinfection() {
        return disinfection;
    }

    public void setDisinfection(boolean disinfection) {
        this.disinfection = disinfection;
    }

    public String getChemicalProduct() {
        return chemicalProduct;
    }

    public void setChemicalProduct(String chemicalProduct) {
        this.chemicalProduct = chemicalProduct;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getAdditionalInfos() {
        return additionalInfos;
    }

    public void setAdditionalInfos(String additionalInfos) {
        this.additionalInfos = additionalInfos;
    }

    public String getTreatmentsCarriedOut() {
        return treatmentsCarriedOut;
    }

    public void setTreatmentsCarriedOut(String treatmentsCarriedOut) {
        this.treatmentsCarriedOut = treatmentsCarriedOut;
    }

    public String getTypeOfTreatment() {
        return typeOfTreatment;
    }

    public void setTypeOfTreatment(String typeOfTreatment) {
        this.typeOfTreatment = typeOfTreatment;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public Date getTreatmentEndDate() {
        return treatmentEndDate;
    }

    public void setTreatmentEndDate(Date treatmentEndDate) {
        this.treatmentEndDate = treatmentEndDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TreatmentInfos other = (TreatmentInfos) obj;
        return Objects.equals(this.id, other.id);
    }

    public String getAdditionnalDeclaration() {
        return additionnalDeclaration;
    }

    public void setAdditionnalDeclaration(String additionnalDeclaration) {
        this.additionnalDeclaration = additionnalDeclaration;
    }

    public String getDelivrableType() {
        return delivrableType;
    }

    public void setDelivrableType(String delivrableType) {
        this.delivrableType = delivrableType;
    }

    public String getCommodityCaterory() {
        return commodityCaterory;
    }

    public void setCommodityCaterory(String commodityCaterory) {
        this.commodityCaterory = commodityCaterory;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getPackagerOnPackaging() {
        return packagerOnPackaging;
    }

    public void setPackagerOnPackaging(String packagerOnPackaging) {
        this.packagerOnPackaging = packagerOnPackaging;
    }

    public String getConservationTemperature() {
        return conservationTemperature;
    }

    public void setConservationTemperature(String conservationTemperature) {
        this.conservationTemperature = conservationTemperature;
    }

    @Override
    public String toString() {
        return "TreatmentInfos{" + "id=" + id + ", date=" + date + ", itemFlow=" + itemFlow + ", fumigation=" + fumigation + ", disinfection=" + disinfection + ", chemicalProduct=" + chemicalProduct + ", duration=" + duration + ", temperature=" + temperature + ", concentration=" + concentration + ", additionalInfos=" + additionalInfos + ", treatmentsCarriedOut=" + treatmentsCarriedOut + ", typeOfTreatment=" + typeOfTreatment + '}';
    }

    @PrePersist
    private void prePersist() {
        date = new Date();
    }

}

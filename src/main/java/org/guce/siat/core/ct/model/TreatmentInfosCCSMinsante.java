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
 * @author lissouck
 */
@Entity
@Table(name = "TREATMENT_INFOS_CCS_MINSANTE")
@XmlRootElement
public class TreatmentInfosCCSMinsante extends AbstractModel implements Serializable {

    private static final long serialVersionUID = -2909713764041243938L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_INFOS_CCS_SEQ")
    @SequenceGenerator(name = "TREATMENT_INFOS_CCS_SEQ", sequenceName = "TREATMENT_INFOS_CCS_SEQ", allocationSize = 1)
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

    @CustomProperty(labelEn = "Products and foodstuffs intended for human consumption", labelFr = "Produits et denrées alimentaires destinés à la consommation humaine")
    @Column(name = "PRODUCTS_FOODS_IHC")
    private boolean productFoodIHC;
    @CustomProperty(labelEn = "Hygiene and sanitation products", labelFr = "Produits d’hygiène et d’assainissement")
    @Column(name = "HYGIENE_SANITATION_PRODUCTS")
    private boolean hygienSanitationProducts;
    @CustomProperty(labelEn = "Thrift shop", labelFr = "Friperie")
    @Column(name = "THRIFT_SHOP")
    private boolean thriftShop;
    @CustomProperty(labelEn = "Flea market", labelFr = "Brocante")
    @Column(name = "FLEA_MARKET")
    private boolean fleaMarket;
    @CustomProperty(labelEn = "Vehicle", labelFr = "Véhicule")
    @Column(name = "VEHICLE")
    private boolean vehicle;
    
    @CustomProperty(labelEn = "Drugs", labelFr = "Médicaments")
    @Column(name = "DRUGS")
    private boolean drugs;
    @CustomProperty(labelEn = "Medical devices", labelFr = "Dispositifs médicaux")
    @Column(name = "MEDICAL_DEVICES")
    private boolean medicalDevices;
    @CustomProperty(labelEn = "Topical corticosteroids", labelFr = "Dermocorticoïdes")
    @Column(name = "TROPICAL_CORTICOSTEROIDS")
    private boolean tropicalCorticosteroids;
    @CustomProperty(labelEn = "Laboratory products", labelFr = "Produits de laboratoire")
    @Column(name = "LABORATORY_PRODUCTS")
    private boolean laboratoryProducts;
    @CustomProperty(labelEn = "Packaging and semi-finished products", labelFr = "Emballages et produits semi-finis")
    @Column(name = "PACKAGING_SF_PRODUCTS")
    private boolean packagingSfProducts;
    
    @CustomProperty(labelEn = "A", labelFr = "A")
    @Column(name = "CONFORME_A")
    private boolean conformeA;
    @CustomProperty(labelEn = "Conformity Observation of A", labelFr = "Conformity Observation of A")
    @Column(name = "CONFORMITY_OBSERVATION_A", length = 1000)
    private String conformityObservationA;
    @CustomProperty(labelEn = "AMM/AMC", labelFr = "AMM/AMC")
    @Column(name = "CONFORME_AMM_AMC")
    private boolean conformeAmmAmc;
    @CustomProperty(labelEn = "Conformity Observation of AMM/AMC", labelFr = "Conformity Observation of AMM/AMC")
    @Column(name = "CONFORMITY_OBSERVATION_AMM_AMC", length = 1000)
    private String conformityObservationAmmAmc;
    @CustomProperty(labelEn = "AI", labelFr = "AI")
    @Column(name = "CONFORME_AI")
    private boolean conformeAI;
    @CustomProperty(labelEn = "Conformity Observation of AI", labelFr = "Conformity Observation of AI")
    @Column(name = "CONFORMITY_OBSERVATION_AI", length = 1000)
    private String conformityObservationAI;
    @CustomProperty(labelEn = "ATQ", labelFr = "ATQ")
    @Column(name = "CONFORME_ATQ")
    private boolean conformeATQ;
    @CustomProperty(labelEn = "Conformity Observation of ATQ", labelFr = "Conformity Observation of ATQ")
    @Column(name = "CONFORMITY_OBSERVATION_ATQ", length = 1000)
    private String conformityObservationATQ;
    @CustomProperty(labelEn = "CC", labelFr = "CC")
    @Column(name = "CONFORME_CC")
    private boolean conformeCC;
    @CustomProperty(labelEn = "Conformity Observation of CC", labelFr = "Conformity Observation of CC")
    @Column(name = "CONFORMITY_OBSERVATION_CC", length = 1000)
    private String conformityObservationCC;
    @CustomProperty(labelEn = "CF/CD", labelFr = "CF/CD")
    @Column(name = "CONFORME_CF_CD")
    private boolean conformeCFCD;
    @CustomProperty(labelEn = "Conformity Observation of CF/CD", labelFr = "Conformity Observation of CF/CD")
    @Column(name = "CONFORMITY_OBSERVATION_CF_CD", length = 1000)
    private String conformityObservationCFCD;
    @CustomProperty(labelEn = "CAPC/M", labelFr = "CAPC/M")
    @Column(name = "CONFORME_CAPC_M")
    private boolean conformeCAPCM;
    @CustomProperty(labelEn = "Conformity Observation of CAPC/M", labelFr = "Conformity Observation of CAPC/M")
    @Column(name = "CONFORMITY_OBSERVATION_CAPC_M", length = 1000)
    private String conformityObservationCAPCM;
    @CustomProperty(labelEn = "CE", labelFr = "CE")
    @Column(name = "CONFORME_CE")
    private boolean conformeCE;
    @CustomProperty(labelEn = "Conformity Observation of CE", labelFr = "Conformity Observation of CE")
    @Column(name = "CONFORMITY_OBSERVATION_CE", length = 1000)
    private String conformityObservationCE;
    
    @CustomProperty(labelEn = "AMM", labelFr = "AMM")
    @Column(name = "CONFORME_AMM")
    private boolean conformeAMM;
    @CustomProperty(labelEn = "Conformity Observation of AMM", labelFr = "Conformity Observation of AMM")
    @Column(name = "CONFORMITY_OBSERVATION_AMM", length = 1000)
    private String conformityObservationAMM;
    
    @CustomProperty(labelEn = "VT", labelFr = "VT")
    @Column(name = "CONFORME_VT")
    private boolean conformeVT;
    @CustomProperty(labelEn = "Conformity Observation of VT", labelFr = "Conformity Observation of VT")
    @Column(name = "CONFORMITY_OBSERVATION_VT", length = 1000)
    private String conformityObservationVT;
    
    @CustomProperty(labelEn = "AOI", labelFr = "AOI")
    @Column(name = "CONFORME_AOI")
    private boolean conformeAOI;
    @CustomProperty(labelEn = "Conformity Observation of AOI", labelFr = "Conformity Observation of AOI")
    @Column(name = "CONFORMITY_OBSERVATION_AOI", length = 1000)
    private String conformityObservationAOI;
    
    @CustomProperty(labelEn = "CBPSD", labelFr = "CBPSD")
    @Column(name = "CONFORME_CBPSD")
    private boolean conformeCBPSD;
    @CustomProperty(labelEn = "Conformity Observation of CBPSD", labelFr = "Conformity Observation of CBPSD")
    @Column(name = "CONFORMITY_OBSERVATION_CBPSD", length = 1000)
    private String conformityObservationCBPSD;


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

    public boolean isProductFoodIHC() {
        return productFoodIHC;
    }

    public void setProductFoodIHC(boolean productFoodIHC) {
        this.productFoodIHC = productFoodIHC;
    }

    public boolean isHygienSanitationProducts() {
        return hygienSanitationProducts;
    }

    public void setHygienSanitationProducts(boolean hygienSanitationProducts) {
        this.hygienSanitationProducts = hygienSanitationProducts;
    }

    public boolean isThriftShop() {
        return thriftShop;
    }

    public void setThriftShop(boolean thriftShop) {
        this.thriftShop = thriftShop;
    }

    public boolean isFleaMarket() {
        return fleaMarket;
    }

    public void setFleaMarket(boolean fleaMarket) {
        this.fleaMarket = fleaMarket;
    }

    public boolean isVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isConformeA() {
        return conformeA;
    }

    public void setConformeA(boolean conformeA) {
        this.conformeA = conformeA;
    }

    public String getConformityObservationA() {
        return conformityObservationA;
    }

    public void setConformityObservationA(String conformityObservationA) {
        this.conformityObservationA = conformityObservationA;
    }

    public boolean isConformeAmmAmc() {
        return conformeAmmAmc;
    }

    public void setConformeAmmAmc(boolean conformeAmmAmc) {
        this.conformeAmmAmc = conformeAmmAmc;
    }

    public String getConformityObservationAmmAmc() {
        return conformityObservationAmmAmc;
    }

    public void setConformityObservationAmmAmc(String conformityObservationAmmAmc) {
        this.conformityObservationAmmAmc = conformityObservationAmmAmc;
    }

    public boolean isConformeAI() {
        return conformeAI;
    }

    public void setConformeAI(boolean conformeAI) {
        this.conformeAI = conformeAI;
    }

    public String getConformityObservationAI() {
        return conformityObservationAI;
    }

    public void setConformityObservationAI(String conformityObservationAI) {
        this.conformityObservationAI = conformityObservationAI;
    }

    public boolean isConformeATQ() {
        return conformeATQ;
    }

    public void setConformeATQ(boolean conformeATQ) {
        this.conformeATQ = conformeATQ;
    }

    public String getConformityObservationATQ() {
        return conformityObservationATQ;
    }

    public void setConformityObservationATQ(String conformityObservationATQ) {
        this.conformityObservationATQ = conformityObservationATQ;
    }

    public boolean isConformeCC() {
        return conformeCC;
    }

    public void setConformeCC(boolean conformeCC) {
        this.conformeCC = conformeCC;
    }

    public String getConformityObservationCC() {
        return conformityObservationCC;
    }

    public void setConformityObservationCC(String conformityObservationCC) {
        this.conformityObservationCC = conformityObservationCC;
    }

    public boolean isConformeCFCD() {
        return conformeCFCD;
    }

    public void setConformeCFCD(boolean conformeCFCD) {
        this.conformeCFCD = conformeCFCD;
    }

    public String getConformityObservationCFCD() {
        return conformityObservationCFCD;
    }

    public void setConformityObservationCFCD(String conformityObservationCFCD) {
        this.conformityObservationCFCD = conformityObservationCFCD;
    }

    public boolean isConformeCAPCM() {
        return conformeCAPCM;
    }

    public void setConformeCAPCM(boolean conformeCAPCM) {
        this.conformeCAPCM = conformeCAPCM;
    }

    public String getConformityObservationCAPCM() {
        return conformityObservationCAPCM;
    }

    public void setConformityObservationCAPCM(String conformityObservationCAPCM) {
        this.conformityObservationCAPCM = conformityObservationCAPCM;
    }

    public boolean isConformeCE() {
        return conformeCE;
    }

    public void setConformeCE(boolean conformeCE) {
        this.conformeCE = conformeCE;
    }

    public String getConformityObservationCE() {
        return conformityObservationCE;
    }

    public void setConformityObservationCE(String conformityObservationCE) {
        this.conformityObservationCE = conformityObservationCE;
    }

    public boolean isDrugs() {
        return drugs;
    }

    public void setDrugs(boolean drugs) {
        this.drugs = drugs;
    }

    public boolean isMedicalDevices() {
        return medicalDevices;
    }

    public void setMedicalDevices(boolean medicalDevices) {
        this.medicalDevices = medicalDevices;
    }

    public boolean isTropicalCorticosteroids() {
        return tropicalCorticosteroids;
    }

    public void setTropicalCorticosteroids(boolean tropicalCorticosteroids) {
        this.tropicalCorticosteroids = tropicalCorticosteroids;
    }

    public boolean isLaboratoryProducts() {
        return laboratoryProducts;
    }

    public void setLaboratoryProducts(boolean laboratoryProducts) {
        this.laboratoryProducts = laboratoryProducts;
    }

    public boolean isPackagingSfProducts() {
        return packagingSfProducts;
    }

    public void setPackagingSfProducts(boolean packagingSfProducts) {
        this.packagingSfProducts = packagingSfProducts;
    }

    public boolean isConformeAMM() {
        return conformeAMM;
    }

    public void setConformeAMM(boolean conformeAMM) {
        this.conformeAMM = conformeAMM;
    }

    public String getConformityObservationAMM() {
        return conformityObservationAMM;
    }

    public void setConformityObservationAMM(String conformityObservationAMM) {
        this.conformityObservationAMM = conformityObservationAMM;
    }

    public boolean isConformeVT() {
        return conformeVT;
    }

    public void setConformeVT(boolean conformeVT) {
        this.conformeVT = conformeVT;
    }

    public String getConformityObservationVT() {
        return conformityObservationVT;
    }

    public void setConformityObservationVT(String conformityObservationVT) {
        this.conformityObservationVT = conformityObservationVT;
    }

    public boolean isConformeAOI() {
        return conformeAOI;
    }

    public void setConformeAOI(boolean conformeAOI) {
        this.conformeAOI = conformeAOI;
    }

    public String getConformityObservationAOI() {
        return conformityObservationAOI;
    }

    public void setConformityObservationAOI(String conformityObservationAOI) {
        this.conformityObservationAOI = conformityObservationAOI;
    }

    public boolean isConformeCBPSD() {
        return conformeCBPSD;
    }

    public void setConformeCBPSD(boolean conformeCBPSD) {
        this.conformeCBPSD = conformeCBPSD;
    }

    public String getConformityObservationCBPSD() {
        return conformityObservationCBPSD;
    }

    public void setConformityObservationCBPSD(String conformityObservationCBPSD) {
        this.conformityObservationCBPSD = conformityObservationCBPSD;
    }

    public boolean isCcsMinsanteDrugProducts() {
        return this.drugs || this.medicalDevices || this.tropicalCorticosteroids || this.laboratoryProducts || this.packagingSfProducts;
    }
    
    public boolean isCcsMinsanteFoodProducts() {
        return this.productFoodIHC || this.fleaMarket || this.thriftShop || this.hygienSanitationProducts || this.vehicle;
    }

    @Override
    public String toString() {
        return "TreatmentInfos{" + "id=" + id + ", date=" + date + ", itemFlow=" + itemFlow + "}";
    }

    @PrePersist
    private void prePersist() {
        date = new Date();
    }

}

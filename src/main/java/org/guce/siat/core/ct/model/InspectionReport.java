/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.gr.utils.enums.CertficatGoodness;

/**
 * The Class InspectionReport.
 */
@Entity
@Table(name = "INSPECTION_REPORT")
@XmlRootElement
public class InspectionReport extends AbstractModel implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 7688976541459925704L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INSPECTION_REPORT_SEQ")
    @SequenceGenerator(name = "INSPECTION_REPORT_SEQ", sequenceName = "INSPECTION_REPORT_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The place.
     */
    @Column(name = "PLACE")
    private String place;

    /**
     * The report date.
     */
    @Column(name = "REPORT_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportDate;

    /**
     * The report time.
     */
    @Column(name = "REPORT_TIME")
    @Temporal(TemporalType.TIME)
    private Date reportTime;

    /**
     * The controller decision.
     */
    @Column(name = "CONTROLLER_DECISION")
    private String controllerDecision;

    /**
     * The quarantined culture place.
     */
    @Column(name = "QUARANTINED_CULTURE_PLACE")
    private String quarantinedCulturePlace;

    /**
     * The observation.
     */
    @Column(name = "OBSERVATION", length = 1000)
    private String observation;

    /**
     * The motif.
     */
    @Column(name = "MOTIF", length = 1000)
    private String motif;

    /**
     * The inspection fees fcfa.
     */
    @Column(name = "INSPECTION_FEES_FCFA")
    private String inspectionFeesFCFA;

    /**
     * The inspection fees.
     */
    @Column(name = "INSPECTION_FEES")
    private String inspectionFees;

    /**
     * The other special fees.
     */
    @Column(name = "OTHER_SPECIAL_FEES")
    private String otherSpecialFees;

    /**
     * ********* BEGIN Labelling attributes **********.
     */
    /**
     * The label.
     */
    @Column(name = "LABEL")
    private String label;

    /**
     * The standard compliance.
     */
    @Column(name = "STANDARD_COMPLIANCE")
    private Boolean standardCompliance;

    /**
     * The standard number.
     */
    @Column(name = "STANDARD_NUMBER")
    private Integer standardNumber;

    /**
     * ********* END Labelling attributes **********.
     */
    /**
     * ********* BEGIN Temperature Attributes **********
     */
    /**
     * The temperature.
     */
    @Column(name = "TEMPERATURE")
    private Integer temperature;

    /**
     * The aspect.
     */
    @Column(name = "ASPECT")
    private String aspect;

    /**
     * ********* END Temperature Attributes **********.
     */
    /**
     * ********* BEGIN Certificats Attribute **********
     */
    /**
     * The origin certificate.
     */
    @Column(name = "ORIGIN_CERTIFICATE")
    private Boolean originCertificate;

    /**
     * The phyto general certificate.
     */
    @Column(name = "PHYTO_GENERAL_CERTIFICATE")
    private Boolean phytoGeneralCertificate;

    /**
     * The phyto special certificate.
     */
    @Column(name = "PHYTO_SPECIAL_CERTIFICATE")
    private Boolean phytoSpecialCertificate;

    /**
     * The quality attestation.
     */
    @Column(name = "QUALITY_ATTESTATION")
    private Boolean qualityAttestation;

    /**
     * The sanitary vet certificate.
     */
    @Column(name = "SANITARY_VET_CERTIFICATE")
    private Boolean sanitaryVetCertificate;

    /**
     * The wholesomeness certificate.
     */
    @Column(name = "WHOLESOMENESS_CERTIFICATE")
    private Boolean wholesomenessCertificate;

    /**
     * The conformity certificate.
     */
    @Column(name = "CONFORMITY_CERTIFICATE")
    private Boolean conformityCertificate;

    /**
     * The other certificate.
     */
    @Column(name = "OTHER_CERTIFICATE")
    private String otherCertificate;

    /**
     * The other goodness.
     */
    @Column(name = "OTHER_CERTFICAT_GOODNESS")
    @Enumerated(EnumType.STRING)
    private CertficatGoodness otherGoodness;

    /**
     * The infraction.
     */
    @Column(name = "INFRACTION_NATURE", length = 1000)
    private String infraction;
    /**
     * ********* END Certificats Attribute **********.
     */

    /**
     * The file item.
     */
    @OneToOne
    @JoinColumn(name = "FILE_ITEM_ID")
    private FileItem fileItem;

    /**
     * The item flow.
     */
    @JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
    @ManyToOne(cascade
            = {CascadeType.REFRESH})
    private ItemFlow itemFlow;

    /**
     * The appointment.
     */
    @JoinColumn(name = "APPOINTMENT_ID", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Appointment appointment;

    /**
     * The sample.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SAMPLE_ID")
    private Sample sample;

    /**
     * The Inspection controller list.
     */
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "inspection")
    private List<InspectionController> inspectionControllerList;

    /*
		 * Respect des normes nationales et internationales
     */
    @Column(name = "RESPCT_NORME")
    private Boolean respectNorme;

    /**
     * Source de propagation de la peste
     */
    @Column(name = "SOURCE_PROPAGATION_PESTE")
    private Boolean sourcePropagationPeste;

    /**
     * Existence des documents d'auto-controle
     */
    @Column(name = "DOCUMENT_AUTO_CONTOLE")
    private String autocontrolDocument;

    /**
     * Suivi des équipements d'auto-controle
     */
    @Column(name = "EQUIPEMENT_AUTO_CONTROLE")
    private String autocontrolEquipement;

    /**
     * Analyse du processus
     */
    @Column(name = "ANALYSE_PROCESSUS")
    private String processAnalyse;

    /**
     * Existance Casque
     */
    @Column(name = "CASQUE")
    private Boolean casque;

    /**
     * Gants
     */
    @Column(name = "GANTS")
    private Boolean gants;

    /**
     * Combinaison
     */
    @Column(name = "COMBINAISON")
    private Boolean combinaison;

    /**
     * Chaussures de sécurités
     */
    @Column(name = "CHAUSSURE_SECURITE")
    private Boolean chaussureSecurite;

    /**
     * Eau
     */
    @Column(name = "EAU")
    private String water;

    /**
     * Evacuation des déchet
     */
    @Column(name = "EVAUCATION_DECHET")
    private String dechet;

    /**
     * Procédures
     */
    @Column(name = "PROCEDURE")
    private String procedure;

    /**
     * Champs relatifs au procès verbal d'inspection phytosanitaire
     */
    /*private String articleReglemente;
    private String proprietaire;
    private String utilisation;*/
    /**
     * situation de l'article (stoké ou en mouvement)
     */
    /*private String situationArticle;
    private Boolean couvertDocumentation;
    private String reference;
    private String natureArticle;
    private String dispositionsPrises;*/
    /**
     *
     */
    @Column(name = "TYPE_TRAITEMENT")
    private String typeTraitement;

    @Column(name = "ETAT_DATE_DERNIER_TRAITEMENT")
    private String etatDateDernierTraitement;

    /**
     * Produit utilisé
     */
    @Column(name = "PRODUIT_UTILISE")
    private String produitUtilise;

    /**
     * Dosage
     */
    @Column(name = "DOSAGE")
    private String dosage;

    @Column(name = "ENV_STOCKAGE")
    private String environnementStockage;

    @Column(name = "ENV_TRANSPORT")
    private String environnementTransport;

    @Column(name = "CONDITION_CLIMATIQUE")
    private String conditionClimatique;

    @Column(name = "MESURE_PROTECTION")
    private String mesureProtection;

    @Column(name = "OBSERVATIONS")
    private String observations;

    /**
     * Instantiates a new inspection report.
     */
    public InspectionReport() {
    }

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
     * Gets the place.
     *
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the place.
     *
     * @param place the place to set
     */
    public void setPlace(final String place) {
        this.place = place;
    }

    /**
     * Gets the report date.
     *
     * @return the reportDate
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * Sets the report date.
     *
     * @param reportDate the reportDate to set
     */
    public void setReportDate(final Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * Gets the report time.
     *
     * @return the reportTime
     */
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * Sets the report time.
     *
     * @param reportTime the reportTime to set
     */
    public void setReportTime(final Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * Gets the controller decision.
     *
     * @return the controllerDecision
     */
    public String getControllerDecision() {
        return controllerDecision;
    }

    /**
     * Sets the controller decision.
     *
     * @param controllerDecision the controllerDecision to set
     */
    public void setControllerDecision(final String controllerDecision) {
        this.controllerDecision = controllerDecision;
    }

    /**
     * Gets the quarantined culture place.
     *
     * @return the quarantinedCulturePlace
     */
    public String getQuarantinedCulturePlace() {
        return quarantinedCulturePlace;
    }

    /**
     * Sets the quarantined culture place.
     *
     * @param quarantinedCulturePlace the quarantinedCulturePlace to set
     */
    public void setQuarantinedCulturePlace(final String quarantinedCulturePlace) {
        this.quarantinedCulturePlace = quarantinedCulturePlace;
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
     * Gets the motif.
     *
     * @return the motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Sets the motif.
     *
     * @param motif the motif to set
     */
    public void setMotif(final String motif) {
        this.motif = motif;
    }

    /**
     * Gets the inspection fees fcfa.
     *
     * @return the inspectionFeesFCFA
     */
    public String getInspectionFeesFCFA() {
        return inspectionFeesFCFA;
    }

    /**
     * Sets the inspection fees fcfa.
     *
     * @param inspectionFeesFCFA the inspectionFeesFCFA to set
     */
    public void setInspectionFeesFCFA(final String inspectionFeesFCFA) {
        this.inspectionFeesFCFA = inspectionFeesFCFA;
    }

    /**
     * Gets the inspection fees.
     *
     * @return the inspectionFees
     */
    public String getInspectionFees() {
        return inspectionFees;
    }

    /**
     * Sets the inspection fees.
     *
     * @param inspectionFees the inspectionFees to set
     */
    public void setInspectionFees(final String inspectionFees) {
        this.inspectionFees = inspectionFees;
    }

    /**
     * Gets the other special fees.
     *
     * @return the otherSpecialFees
     */
    public String getOtherSpecialFees() {
        return otherSpecialFees;
    }

    /**
     * Sets the other special fees.
     *
     * @param otherSpecialFees the otherSpecialFees to set
     */
    public void setOtherSpecialFees(final String otherSpecialFees) {
        this.otherSpecialFees = otherSpecialFees;
    }

    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the label to set
     */
    public void setLabel(final String label) {
        this.label = label;
    }

    /**
     * Gets the standard compliance.
     *
     * @return the standardCompliance
     */
    public Boolean getStandardCompliance() {
        return standardCompliance;
    }

    /**
     * Sets the standard compliance.
     *
     * @param standardCompliance the standardCompliance to set
     */
    public void setStandardCompliance(final Boolean standardCompliance) {
        this.standardCompliance = standardCompliance;
    }

    /**
     * Gets the standard number.
     *
     * @return the standardNumber
     */
    public Integer getStandardNumber() {
        return standardNumber;
    }

    /**
     * Sets the standard number.
     *
     * @param standardNumber the standardNumber to set
     */
    public void setStandardNumber(final Integer standardNumber) {
        this.standardNumber = standardNumber;
    }

    /**
     * Gets the temperature.
     *
     * @return the temperature
     */
    public Integer getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature.
     *
     * @param temperature the temperature to set
     */
    public void setTemperature(final Integer temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets the aspect.
     *
     * @return the aspect
     */
    public String getAspect() {
        return aspect;
    }

    /**
     * Sets the aspect.
     *
     * @param aspect the aspect to set
     */
    public void setAspect(final String aspect) {
        this.aspect = aspect;
    }

    /**
     * Gets the origin certificate.
     *
     * @return the originCertificate
     */
    public Boolean getOriginCertificate() {
        return originCertificate;
    }

    /**
     * Sets the origin certificate.
     *
     * @param originCertificate the originCertificate to set
     */
    public void setOriginCertificate(final Boolean originCertificate) {
        this.originCertificate = originCertificate;
    }

    /**
     * Gets the phyto general certificate.
     *
     * @return the phytoGeneralCertificate
     */
    public Boolean getPhytoGeneralCertificate() {
        return phytoGeneralCertificate;
    }

    /**
     * Sets the phyto general certificate.
     *
     * @param phytoGeneralCertificate the phytoGeneralCertificate to set
     */
    public void setPhytoGeneralCertificate(final Boolean phytoGeneralCertificate) {
        this.phytoGeneralCertificate = phytoGeneralCertificate;
    }

    /**
     * Gets the phyto special certificate.
     *
     * @return the phytoSpecialCertificate
     */
    public Boolean getPhytoSpecialCertificate() {
        return phytoSpecialCertificate;
    }

    /**
     * Sets the phyto special certificate.
     *
     * @param phytoSpecialCertificate the phytoSpecialCertificate to set
     */
    public void setPhytoSpecialCertificate(final Boolean phytoSpecialCertificate) {
        this.phytoSpecialCertificate = phytoSpecialCertificate;
    }

    /**
     * Gets the quality attestation.
     *
     * @return the qualityAttestation
     */
    public Boolean getQualityAttestation() {
        return qualityAttestation;
    }

    /**
     * Sets the quality attestation.
     *
     * @param qualityAttestation the qualityAttestation to set
     */
    public void setQualityAttestation(final Boolean qualityAttestation) {
        this.qualityAttestation = qualityAttestation;
    }

    /**
     * Gets the sanitary vet certificate.
     *
     * @return the sanitaryVetCertificate
     */
    public Boolean getSanitaryVetCertificate() {
        return sanitaryVetCertificate;
    }

    /**
     * Sets the sanitary vet certificate.
     *
     * @param sanitaryVetCertificate the sanitaryVetCertificate to set
     */
    public void setSanitaryVetCertificate(final Boolean sanitaryVetCertificate) {
        this.sanitaryVetCertificate = sanitaryVetCertificate;
    }

    /**
     * Gets the wholesomeness certificate.
     *
     * @return the wholesomenessCertificate
     */
    public Boolean getWholesomenessCertificate() {
        return wholesomenessCertificate;
    }

    /**
     * Sets the wholesomeness certificate.
     *
     * @param wholesomenessCertificate the wholesomenessCertificate to set
     */
    public void setWholesomenessCertificate(final Boolean wholesomenessCertificate) {
        this.wholesomenessCertificate = wholesomenessCertificate;
    }

    /**
     * Gets the conformity certificate.
     *
     * @return the conformityCertificate
     */
    public Boolean getConformityCertificate() {
        return conformityCertificate;
    }

    /**
     * Sets the conformity certificate.
     *
     * @param conformityCertificate the conformityCertificate to set
     */
    public void setConformityCertificate(final Boolean conformityCertificate) {
        this.conformityCertificate = conformityCertificate;
    }

    /**
     * Gets the other certificate.
     *
     * @return the otherCertificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     *
     * @param otherCertificate the otherCertificate to set
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the other goodness.
     *
     * @return the other goodness
     */
    public CertficatGoodness getOtherGoodness() {
        return otherGoodness;
    }

    /**
     * Sets the other goodness.
     *
     * @param otherGoodness the new other goodness
     */
    public void setOtherGoodness(final CertficatGoodness otherGoodness) {
        this.otherGoodness = otherGoodness;
    }

    /**
     * Gets the file item.
     *
     * @return the fileItem
     */
    public FileItem getFileItem() {
        return fileItem;
    }

    /**
     * Sets the file item.
     *
     * @param fileItem the fileItem to set
     */
    public void setFileItem(final FileItem fileItem) {
        this.fileItem = fileItem;
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
     * Gets the appointment.
     *
     * @return the appointment
     */
    public Appointment getAppointment() {
        return appointment;
    }

    /**
     * Sets the appointment.
     *
     * @param appointment the appointment to set
     */
    public void setAppointment(final Appointment appointment) {
        this.appointment = appointment;
    }

    /**
     * Gets the sample.
     *
     * @return the sample
     */
    public Sample getSample() {
        return sample;
    }

    /**
     * Sets the sample.
     *
     * @param sample the sample to set
     */
    public void setSample(final Sample sample) {
        this.sample = sample;
    }

    /**
     * Gets the infraction.
     *
     * @return the infraction
     */
    public String getInfraction() {
        return infraction;
    }

    /**
     * Sets the infraction.
     *
     * @param infraction the infraction to set
     */
    public void setInfraction(final String infraction) {
        this.infraction = infraction;
    }

    /**
     * @return the inspectionControllerList
     */
    public List<InspectionController> getInspectionControllerList() {
        return inspectionControllerList;
    }

    /**
     * @param inspectionControllerList the inspectionControllerList to set
     */
    public void setInspectionControllerList(final List<InspectionController> inspectionControllerList) {
        this.inspectionControllerList = inspectionControllerList;
    }

    public Boolean getRespectNorme() {
        return respectNorme;
    }

    public void setRespectNorme(Boolean respectNorme) {
        this.respectNorme = respectNorme;
    }

    public Boolean getSourcePropagationPeste() {
        return sourcePropagationPeste;
    }

    public void setSourcePropagationPeste(Boolean sourcePropagationPeste) {
        this.sourcePropagationPeste = sourcePropagationPeste;
    }

    public String getAutocontrolDocument() {
        return autocontrolDocument;
    }

    public void setAutocontrolDocument(String autocontrolDocument) {
        this.autocontrolDocument = autocontrolDocument;
    }

    public String getAutocontrolEquipement() {
        return autocontrolEquipement;
    }

    public void setAutocontrolEquipement(String autocontrolEquipement) {
        this.autocontrolEquipement = autocontrolEquipement;
    }

    public String getProcessAnalyse() {
        return processAnalyse;
    }

    public void setProcessAnalyse(String processAnalyse) {
        this.processAnalyse = processAnalyse;
    }

    public Boolean getCasque() {
        return casque;
    }

    public void setCasque(Boolean casque) {
        this.casque = casque;
    }

    public Boolean getGants() {
        return gants;
    }

    public void setGants(Boolean gants) {
        this.gants = gants;
    }

    public Boolean getCombinaison() {
        return combinaison;
    }

    public void setCombinaison(Boolean combinaison) {
        this.combinaison = combinaison;
    }

    public Boolean getChaussureSecurite() {
        return chaussureSecurite;
    }

    public void setChaussureSecurite(Boolean chaussureSecurite) {
        this.chaussureSecurite = chaussureSecurite;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getDechet() {
        return dechet;
    }

    public void setDechet(String dechet) {
        this.dechet = dechet;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getTypeTraitement() {
        return typeTraitement;
    }

    public void setTypeTraitement(String typeTraitement) {
        this.typeTraitement = typeTraitement;
    }

    public String getEtatDateDernierTraitement() {
        return etatDateDernierTraitement;
    }

    public void setEtatDateDernierTraitement(String etatDateDernierTraitement) {
        this.etatDateDernierTraitement = etatDateDernierTraitement;
    }

    public String getProduitUtilise() {
        return produitUtilise;
    }

    public void setProduitUtilise(String produitUtilise) {
        this.produitUtilise = produitUtilise;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getEnvironnementStockage() {
        return environnementStockage;
    }

    public void setEnvironnementStockage(String environnementStockage) {
        this.environnementStockage = environnementStockage;
    }

    public String getEnvironnementTransport() {
        return environnementTransport;
    }

    public void setEnvironnementTransport(String environnementTransport) {
        this.environnementTransport = environnementTransport;
    }

    public String getConditionClimatique() {
        return conditionClimatique;
    }

    public void setConditionClimatique(String conditionClimatique) {
        this.conditionClimatique = conditionClimatique;
    }

    public String getMesureProtection() {
        return mesureProtection;
    }

    public void setMesureProtection(String mesureProtection) {
        this.mesureProtection = mesureProtection;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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
        if (!(object instanceof InspectionReport)) {
            return false;
        }
        final InspectionReport other = (InspectionReport) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("InspectionReport [id=");
        builder.append(id);
        builder.append(", place=");
        builder.append(place);
        builder.append(", reportDate=");
        builder.append(reportDate);
        builder.append(", reportTime=");
        builder.append(reportTime);
        builder.append(", controllerDecision=");
        builder.append(controllerDecision);
        builder.append(", quarantinedCulturePlace=");
        builder.append(quarantinedCulturePlace);
        builder.append(", observation=");
        builder.append(observation);
        builder.append(", motif=");
        builder.append(motif);
        builder.append(", inspectionFeesFCFA=");
        builder.append(inspectionFeesFCFA);
        builder.append(", inspectionFees=");
        builder.append(inspectionFees);
        builder.append(", otherSpecialFees=");
        builder.append(otherSpecialFees);
        builder.append(']');
        return builder.toString();
    }

}

package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author ht
 */
@Immutable
@Entity
@Table(name = "MINADER_FILES")
public class MinaderFile implements Serializable {

    private static final long serialVersionUID = -7684683208191041947L;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID")
    private File id;

    /**
     * The reference SIAT.
     */
    @Column(name = "REFERENCE_SIAT", unique = true, length = 35)
    private String referenceSiat;

    /**
     * The reference GUCE.
     */
    @Column(name = "REFERENCE_GUCE", nullable = false, unique = true, length = 35)
    private String referenceGuce;

    /**
     * The numero demande.
     */
    @Column(name = "NUMERO_DEMANDE", length = 35)
    private String numeroDemande;

    /**
     * The numero dossier.
     */
    @Column(name = "NUMERO_DOSSIER", length = 35, nullable = false)
    private String numeroDossier;

    /**
     * The file type guce.
     */
    @Column(name = "FILE_TYPE_GUCE", nullable = false, length = 35)
    private String fileTypeGuce;

    /**
     * The emetteur.
     */
    @Column(name = "EMETTEUR", length = 35, nullable = false)
    private String emetteur;

    /**
     * The destinataire.
     */
    @Column(name = "DESTINATAIRE", length = 35, nullable = false)
    private String destinataire;

    //	Procédure ANNULATION
    /**
     * The reference guce annulation.
     */
    @Column(name = "REFERENCE_GUCE_ANNULATION", unique = true, length = 35)
    private String referenceGuceAnnulation;

    /**
     * The numero demande.
     */
    @Column(name = "NUMERO_DEMANDE_ANNULATION", length = 35)
    private String numeroDemandeAnnulation;

    /**
     * The file type guce.
     */
    @Column(name = "FILE_TYPE_GUCE_ANNULATION", length = 35)
    private String fileTypeGuceAnnulation;

    /**
     * The reference guce paiement.
     */
    // procédure paiement
    @Column(name = "REFERENCE_GUCE_PAIEMENT", unique = true, length = 35)
    private String referenceGucePaiement;

    /**
     * The numero demande paiement.
     */
    @Column(name = "NUMERO_DEMANDE_PAIEMENT", length = 35)
    private String numeroDemandePaiement;

    /**
     * The file type guce paiement.
     */
    @Column(name = "FILE_TYPE_GUCE_PAIEMENT", length = 35)
    private String fileTypeGucePaiement;
    /**
     * The created date.
     */
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    /**
     * The signature date.
     */
    @Column(name = "SIGNATURE_DATE")
    @Temporal(TemporalType.DATE)
    private Date signatureDate;

    /**
     * The validity date.
     */
    @Column(name = "VALIDITY_DATE")
    @Temporal(TemporalType.DATE)
    private Date validityDate;

    /**
     * The bureau.
     */
    @ManyToOne
    @JoinColumn(name = "BUREAU_ID")
    private Bureau bureau;
    @Column(name = "CODE_BUREAU")
    private String bureauCode;
    @Column(name = "NOM_BUREAU")
    private String bureauName;
    @Column(name = "BUREAU_NAME_FR")
    private String bureauNameFr;
    @Column(name = "BUREAU_NAME_EN")
    private String bureauNameEn;

    /**
     * The assigned user.
     */
    @ManyToOne
    @JoinColumn(name = "ASSIGNED_USER_ID")
    private User assignedUser;

    /**
     * The operator.
     */
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Company client;

    /**
     * The file type.
     */
    @ManyToOne
    @JoinColumn(name = "FILE_TYPE_ID")
    private FileType fileType;
    /**
     * The code.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "FILE_TYPE_CODE")
    private FileTypeCode fileTypeCode;
    /**
     * The label fr.
     */
    @Column(name = "FILE_TYPE_NAME_FR")
    private String fileTypeLabelFr;
    /**
     * The label en.
     */
    @Column(name = "FILE_TYPE_NAME_EN")
    private String fileTypeLabelEn;
    /**
     * The label en.
     */
    @Column(name = "FILE_TYPE_NAME")
    private String fileTypeName;

    /**
     * The company name.
     */
    @Column(name = "COMPANY_NAME")
    private String companyName;

    /**
     * The num contribuable.
     */
    @Column(name = "NUM_CONTRIBUABLE")
    private String numContribuable;

    /**
     * The country of origin.
     */
    @ManyToOne
    @JoinColumn(name = "COUNTRY_OF_ORIGIN")
    private Country countryOfOrigin;

    /**
     * The country of destination.
     */
    @ManyToOne
    @JoinColumn(name = "COUNTRY_OF_DESTINATION")
    private Country countryOfDestination;

    /**
     * The country of provenance.
     */
    @ManyToOne
    @JoinColumn(name = "COUNTRY_OF_PROVENANCE")
    private Country countryOfProvenance;

    /**
     * the signatory of file
     */
    @ManyToOne
    @JoinColumn(name = "SIGNATORY_USER_ID")
    private User signatory;

    /**
     * The last decision date.
     */
    @Column(name = "LAST_DECISION_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDecisionDate;

    @Column(name = "TYPE_OPERATION")
    private String operationType;

    @Column(name = "TYPE_PRODUIT_CODE")
    private String productTypeCode;

    @Column(name = "TYPE_PRODUIT_NOM")
    private String productTypeName;

    @Column(name = "DATE_REJET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rejectionDate;

    @Column(name = "TRANSITAIRE_NIU")
    private String transitaireNiu;
    @Column(name = "TRANSITAIRE_NOM")
    private String transitaireName;

    @Column(name = "SOCIETE_TRAITEMENT_CODE")
    private String treatmentSocietyCode;
    @Column(name = "SOCIETE_TRAITEMENT_NOM")
    private String treatmentSocietyName;
    @Column(name = "DATE_TRAITEMENT")
    @Temporal(TemporalType.DATE)
    private Date treatmentDate;

    /**
     * The file items list.
     */
    @OneToMany(mappedBy = "file")
    private List<MinaderFileItem> fileItemsList;

    public File getId() {
        return id;
    }

    public void setId(File id) {
        this.id = id;
    }

    public String getReferenceSiat() {
        return referenceSiat;
    }

    public void setReferenceSiat(String referenceSiat) {
        this.referenceSiat = referenceSiat;
    }

    public String getReferenceGuce() {
        return referenceGuce;
    }

    public void setReferenceGuce(String referenceGuce) {
        this.referenceGuce = referenceGuce;
    }

    public String getNumeroDemande() {
        return numeroDemande;
    }

    public void setNumeroDemande(String numeroDemande) {
        this.numeroDemande = numeroDemande;
    }

    public String getNumeroDossier() {
        return numeroDossier;
    }

    public void setNumeroDossier(String numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public String getFileTypeGuce() {
        return fileTypeGuce;
    }

    public void setFileTypeGuce(String fileTypeGuce) {
        this.fileTypeGuce = fileTypeGuce;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getReferenceGuceAnnulation() {
        return referenceGuceAnnulation;
    }

    public void setReferenceGuceAnnulation(String referenceGuceAnnulation) {
        this.referenceGuceAnnulation = referenceGuceAnnulation;
    }

    public String getNumeroDemandeAnnulation() {
        return numeroDemandeAnnulation;
    }

    public void setNumeroDemandeAnnulation(String numeroDemandeAnnulation) {
        this.numeroDemandeAnnulation = numeroDemandeAnnulation;
    }

    public String getFileTypeGuceAnnulation() {
        return fileTypeGuceAnnulation;
    }

    public void setFileTypeGuceAnnulation(String fileTypeGuceAnnulation) {
        this.fileTypeGuceAnnulation = fileTypeGuceAnnulation;
    }

    public String getReferenceGucePaiement() {
        return referenceGucePaiement;
    }

    public void setReferenceGucePaiement(String referenceGucePaiement) {
        this.referenceGucePaiement = referenceGucePaiement;
    }

    public String getNumeroDemandePaiement() {
        return numeroDemandePaiement;
    }

    public void setNumeroDemandePaiement(String numeroDemandePaiement) {
        this.numeroDemandePaiement = numeroDemandePaiement;
    }

    public String getFileTypeGucePaiement() {
        return fileTypeGucePaiement;
    }

    public void setFileTypeGucePaiement(String fileTypeGucePaiement) {
        this.fileTypeGucePaiement = fileTypeGucePaiement;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public String getBureauCode() {
        return bureauCode;
    }

    public void setBureauCode(String bureauCode) {
        this.bureauCode = bureauCode;
    }

    public String getBureauName() {
        return bureauName;
    }

    public void setBureauName(String bureauName) {
        this.bureauName = bureauName;
    }

    public String getBureauNameFr() {
        return bureauNameFr;
    }

    public void setBureauNameFr(String bureauNameFr) {
        this.bureauNameFr = bureauNameFr;
    }

    public String getBureauNameEn() {
        return bureauNameEn;
    }

    public void setBureauNameEn(String bureauNameEn) {
        this.bureauNameEn = bureauNameEn;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Company getClient() {
        return client;
    }

    public void setClient(Company client) {
        this.client = client;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public FileTypeCode getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(FileTypeCode fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getFileTypeLabelFr() {
        return fileTypeLabelFr;
    }

    public void setFileTypeLabelFr(String fileTypeLabelFr) {
        this.fileTypeLabelFr = fileTypeLabelFr;
    }

    public String getFileTypeLabelEn() {
        return fileTypeLabelEn;
    }

    public void setFileTypeLabelEn(String fileTypeLabelEn) {
        this.fileTypeLabelEn = fileTypeLabelEn;
    }

    public String getFileTypeName() {
        return fileTypeName;
    }

    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNumContribuable() {
        return numContribuable;
    }

    public void setNumContribuable(String numContribuable) {
        this.numContribuable = numContribuable;
    }

    public Country getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(Country countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Country getCountryOfDestination() {
        return countryOfDestination;
    }

    public void setCountryOfDestination(Country countryOfDestination) {
        this.countryOfDestination = countryOfDestination;
    }

    public Country getCountryOfProvenance() {
        return countryOfProvenance;
    }

    public void setCountryOfProvenance(Country countryOfProvenance) {
        this.countryOfProvenance = countryOfProvenance;
    }

    public User getSignatory() {
        return signatory;
    }

    public void setSignatory(User signatory) {
        this.signatory = signatory;
    }

    public Date getLastDecisionDate() {
        return lastDecisionDate;
    }

    public void setLastDecisionDate(Date lastDecisionDate) {
        this.lastDecisionDate = lastDecisionDate;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public Date getRejectionDate() {
        return rejectionDate;
    }

    public void setRejectionDate(Date rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    public String getTransitaireNiu() {
        return transitaireNiu;
    }

    public void setTransitaireNiu(String transitaireNiu) {
        this.transitaireNiu = transitaireNiu;
    }

    public String getTransitaireName() {
        return transitaireName;
    }

    public void setTransitaireName(String transitaireName) {
        this.transitaireName = transitaireName;
    }

    public String getTreatmentSocietyCode() {
        return treatmentSocietyCode;
    }

    public void setTreatmentSocietyCode(String treatmentSocietyCode) {
        this.treatmentSocietyCode = treatmentSocietyCode;
    }

    public String getTreatmentSocietyName() {
        return treatmentSocietyName;
    }

    public void setTreatmentSocietyName(String treatmentSocietyName) {
        this.treatmentSocietyName = treatmentSocietyName;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public List<MinaderFileItem> getFileItemsList() {
        return fileItemsList;
    }

    public void setFileItemsList(List<MinaderFileItem> fileItemsList) {
        this.fileItemsList = fileItemsList;
    }

}

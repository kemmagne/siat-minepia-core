package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;

/**
 * The Class PaymentData.
 */
@Entity
@Table(name = "PAYMENT_DATA")
@XmlRootElement
public class PaymentData extends AbstractModel implements Serializable {

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_SEQ")
    @SequenceGenerator(name = "PAYMENT_SEQ", sequenceName = "PAYMENT_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The ref facture.
     */
    @Column(name = "REF_FACTURE")
    private String refFacture;

    /**
     * The montant frais.
     */
    @Column(name = "MONTANT_HT")
    private Long montantHt;

    /**
     * The montant frais.
     */
    @Column(name = "AUTRE_MONTANT")
    private Long autreMontant;

    /**
     * The nature frais.
     */
    @Column(name = "NATURE_FRAIS")
    private String natureFrais;

    /**
     * The nature frais.
     */
    @Column(name = "MONTANT_TVA")
    private Long montantTva;

    /**
     * The nom signature.
     */
    @Column(name = "NOM_SIGNATURE")
    private String nomSignature;

    /**
     * The qualite signature.
     */
    @Column(name = "QUALITE_SIGNATURE")
    private String qualiteSignature;

    /**
     * The lieu signature.
     */
    @Column(name = "LIEU_SIGNATURE")
    private String lieuSignature;

    /**
     * The date signature.
     */
    @Column(name = "DATE_SIGNATURE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSignature;

    /**
     * The num recu.
     */
    @Column(name = "NUM_RECU")
    private String numRecu;

    /**
     * The date encaissement.
     */
    @Column(name = "DATE_ENCAISSEMENT")
    @Temporal(TemporalType.DATE)
    private Date dateEncaissement;

    /**
     * The part vers.
     */
    @Column(name = "PARTIE_VERSANTE_CONT")
    private String partVersCont;

    /**
     * The part vers.
     */
    @Column(name = "PARTIE_VERSANTE_Rs")
    private String partVersRs;

    /**
     * The montant encaissement.
     */
    @Column(name = "MONTANT_ENCAISSEMENT")
    private Double montantEncaissement;

    /**
     * The nature encaissement.
     */
    @Column(name = "NATURE_ENCAISSEMENT")
    private String natureEncaissement;

    /**
     * The observation.
     */
    @Column(name = "OBSERVATION")
    private String observation;

    /**
     * The role recette.
     */
    @Column(name = "ROLE_RECETTE")
    private String roleRecette;

    /**
     * The num quittance.
     */
    @Column(name = "NUM_QUITTANCE")
    private String numQuittance;

    /**
     * The imputation.
     */
    @Column(name = "IMPUTATION")
    private String imputation;

    /**
     * The nature recette.
     */
    @Column(name = "NATURE_RECETTE")
    private String natureRecette;

    /**
     * The article.
     */
    @Column(name = "ARTICLE")
    private String article;

    /**
     * The deleted.
     */
    @Column(name = "DELETED", nullable = true)
    private Boolean deleted;

    /**
     * The item flow.
     */
    @OneToMany(mappedBy = "primaryKey.paymentData", cascade = CascadeType.PERSIST)
    private List<PaymentItemFlow> paymentItemFlowList;

    @OneToMany(mappedBy = "paymentData", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<InvoiceLine> invoiceLines;

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
     * Gets the ref facture.
     *
     * @return the refFacture
     */
    public String getRefFacture() {
        return refFacture;
    }

    /**
     * Sets the ref facture.
     *
     * @param refFacture the refFacture to set
     */
    public void setRefFacture(final String refFacture) {
        this.refFacture = refFacture;
    }

    /**
     * Gets the montant ht.
     *
     * @return the montant ht
     */
    public Long getMontantHt() {
        return montantHt;
    }

    /**
     * Sets the montant ht.
     *
     * @param montantHt the new montant ht
     */
    public void setMontantHt(final Long montantHt) {
        this.montantHt = montantHt;
    }

    /**
     * Gets the montant tva.
     *
     * @return the montant tva
     */
    public Long getMontantTva() {
        return montantTva;
    }

    /**
     * Sets the montant tva.
     *
     * @param montantTva the new montant tva
     */
    public void setMontantTva(final Long montantTva) {
        this.montantTva = montantTva;
    }

    /**
     * Gets the nature frais.
     *
     * @return the natureFrais
     */
    public String getNatureFrais() {
        return natureFrais;
    }

    /**
     * Sets the nature frais.
     *
     * @param natureFrais the natureFrais to set
     */
    public void setNatureFrais(final String natureFrais) {
        this.natureFrais = natureFrais;
    }

    /**
     * Gets the nom signature.
     *
     * @return the nomSignature
     */
    public String getNomSignature() {
        return nomSignature;
    }

    /**
     * Sets the nom signature.
     *
     * @param nomSignature the nomSignature to set
     */
    public void setNomSignature(final String nomSignature) {
        this.nomSignature = nomSignature;
    }

    /**
     * Gets the qualite signature.
     *
     * @return the qualiteSignature
     */
    public String getQualiteSignature() {
        return qualiteSignature;
    }

    /**
     * Sets the qualite signature.
     *
     * @param qualiteSignature the qualiteSignature to set
     */
    public void setQualiteSignature(final String qualiteSignature) {
        this.qualiteSignature = qualiteSignature;
    }

    /**
     * Gets the lieu signature.
     *
     * @return the lieuSignature
     */
    public String getLieuSignature() {
        return lieuSignature;
    }

    /**
     * Sets the lieu signature.
     *
     * @param lieuSignature the lieuSignature to set
     */
    public void setLieuSignature(final String lieuSignature) {
        this.lieuSignature = lieuSignature;
    }

    /**
     * Gets the date signature.
     *
     * @return the dateSignature
     */
    public Date getDateSignature() {
        return dateSignature;
    }

    /**
     * Sets the date signature.
     *
     * @param dateSignature the dateSignature to set
     */
    public void setDateSignature(final Date dateSignature) {
        this.dateSignature = dateSignature;
    }

    /**
     * Gets the num recu.
     *
     * @return the numRecu
     */
    public String getNumRecu() {
        return numRecu;
    }

    /**
     * Sets the num recu.
     *
     * @param numRecu the numRecu to set
     */
    public void setNumRecu(final String numRecu) {
        this.numRecu = numRecu;
    }

    /**
     * Gets the date encaissement.
     *
     * @return the dateEncaissement
     */
    public Date getDateEncaissement() {
        return dateEncaissement;
    }

    /**
     * Sets the date encaissement.
     *
     * @param dateEncaissement the dateEncaissement to set
     */
    public void setDateEncaissement(final Date dateEncaissement) {
        this.dateEncaissement = dateEncaissement;
    }

    /**
     * Gets the part vers cont.
     *
     * @return the part vers cont
     */
    public String getPartVersCont() {
        return partVersCont;
    }

    /**
     * Sets the part vers cont.
     *
     * @param partVersCont the new part vers cont
     */
    public void setPartVersCont(final String partVersCont) {
        this.partVersCont = partVersCont;
    }

    /**
     * Gets the part vers rs.
     *
     * @return the part vers rs
     */
    public String getPartVersRs() {
        return partVersRs;
    }

    /**
     * Sets the part vers rs.
     *
     * @param partVersRs the new part vers rs
     */
    public void setPartVersRs(final String partVersRs) {
        this.partVersRs = partVersRs;
    }

    /**
     * Gets the montant encaissement.
     *
     * @return the montantEncaissement
     */
    public Double getMontantEncaissement() {
        return montantEncaissement;
    }

    /**
     * Sets the montant encaissement.
     *
     * @param montantEncaissement the montantEncaissement to set
     */
    public void setMontantEncaissement(final Double montantEncaissement) {
        this.montantEncaissement = montantEncaissement;
    }

    /**
     * Gets the nature encaissement.
     *
     * @return the natureEncaissement
     */
    public String getNatureEncaissement() {
        return natureEncaissement;
    }

    /**
     * Sets the nature encaissement.
     *
     * @param natureEncaissement the natureEncaissement to set
     */
    public void setNatureEncaissement(final String natureEncaissement) {
        this.natureEncaissement = natureEncaissement;
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
     * Gets the role recette.
     *
     * @return the roleRecette
     */
    public String getRoleRecette() {
        return roleRecette;
    }

    /**
     * Sets the role recette.
     *
     * @param roleRecette the roleRecette to set
     */
    public void setRoleRecette(final String roleRecette) {
        this.roleRecette = roleRecette;
    }

    /**
     * Gets the num quittance.
     *
     * @return the numQuittance
     */
    public String getNumQuittance() {
        return numQuittance;
    }

    /**
     * Sets the num quittance.
     *
     * @param numQuittance the numQuittance to set
     */
    public void setNumQuittance(final String numQuittance) {
        this.numQuittance = numQuittance;
    }

    /**
     * Gets the imputation.
     *
     * @return the imputation
     */
    public String getImputation() {
        return imputation;
    }

    /**
     * Sets the imputation.
     *
     * @param imputation the imputation to set
     */
    public void setImputation(final String imputation) {
        this.imputation = imputation;
    }

    /**
     * Gets the nature recette.
     *
     * @return the natureRecette
     */
    public String getNatureRecette() {
        return natureRecette;
    }

    /**
     * Sets the nature recette.
     *
     * @param natureRecette the natureRecette to set
     */
    public void setNatureRecette(final String natureRecette) {
        this.natureRecette = natureRecette;
    }

    /**
     * Gets the article.
     *
     * @return the article
     */
    public String getArticle() {
        return article;
    }

    /**
     * Sets the article.
     *
     * @param article the article to set
     */
    public void setArticle(final String article) {
        this.article = article;
    }

    /**
     * Gets the payment item flow list.
     *
     * @return the paymentItemFlowList
     */
    public List<PaymentItemFlow> getPaymentItemFlowList() {
        return paymentItemFlowList;
    }

    /**
     * Sets the payment item flow list.
     *
     * @param paymentItemFlowList the paymentItemFlowList to set
     */
    public void setPaymentItemFlowList(final List<PaymentItemFlow> paymentItemFlowList) {
        this.paymentItemFlowList = paymentItemFlowList;
    }

    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    /**
     * Gets the deleted.
     *
     * @return the deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted the deleted to set
     */
    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Gets the autre montant.
     *
     * @return the autre montant
     */
    public Long getAutreMontant() {
        return autreMontant;
    }

    /**
     * Sets the autre montant.
     *
     * @param autreMontant the new autre montant
     */
    public void setAutreMontant(final Long autreMontant) {
        this.autreMontant = autreMontant;
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
        if (!(object instanceof PaymentData)) {
            return false;
        }
        final PaymentData other = (PaymentData) object;
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
        builder.append("PaymentData [id=");
        builder.append(id);
        builder.append(", refFacture=");
        builder.append(refFacture);
        builder.append(", montantFrais=");
        builder.append(montantHt);
        builder.append(", natureFrais=");
        builder.append(natureFrais);
        builder.append(", nomSignature=");
        builder.append(nomSignature);
        builder.append(", qualiteSignature=");
        builder.append(qualiteSignature);
        builder.append(", lieuSignature=");
        builder.append(lieuSignature);
        builder.append(", dateSignature=");
        builder.append(dateSignature);
        builder.append(", numRecu=");
        builder.append(numRecu);
        builder.append(", dateEncaissement=");
        builder.append(dateEncaissement);
        builder.append(", partVers=");
        builder.append(partVersCont);
        builder.append(", montantEncaissement=");
        builder.append(montantEncaissement);
        builder.append(", natureEncaissement=");
        builder.append(natureEncaissement);
        builder.append(", observation=");
        builder.append(observation);
        builder.append(", roleRecette=");
        builder.append(roleRecette);
        builder.append(", numQuittance=");
        builder.append(numQuittance);
        builder.append(", imputation=");
        builder.append(imputation);
        builder.append(", natureRecette=");
        builder.append(natureRecette);
        builder.append(", article=");
        builder.append(article);
        builder.append(']');
        return builder.toString();
    }

}

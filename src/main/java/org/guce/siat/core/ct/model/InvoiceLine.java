package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author tadzotsa
 */
@Entity
@Table(name = "INVOICE_LINE")
public class InvoiceLine implements Serializable {

    /**
     * The id.
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INVOICE_LINE_SEQ")
    @SequenceGenerator(name = "INVOICE_LINE_SEQ", sequenceName = "INVOICE_LINE_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The montant frais.
     */
    @Column(name = "MONTANT_HT")
    private Long montantHt;

    /**
     * The nature frais.
     */
    @Column(name = "MONTANT_TVA")
    private Long montantTva;

    /**
     * The montant frais.
     */
    @Column(name = "MONTANT_TTC")
    private Long montantTtc;

    /**
     * The nature frais.
     */
    @Column(name = "NATURE_FRAIS")
    private String natureFrais;

    /**
     * The nature frais.
     */
    @Column(name = "OBSERVATION")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_DATA_ID")
    private PaymentData paymentData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMontantHt() {
        return montantHt;
    }

    public void setMontantHt(Long montantHt) {
        this.montantHt = montantHt;
    }

    public Long getMontantTva() {
        return montantTva;
    }

    public void setMontantTva(Long montantTva) {
        this.montantTva = montantTva;
    }

    public Long getMontantTtc() {
        return montantTtc;
    }

    public void setMontantTtc(Long montantTtc) {
        this.montantTtc = montantTtc;
    }

    public String getNatureFrais() {
        return natureFrais;
    }

    public void setNatureFrais(String natureFrais) {
        this.natureFrais = natureFrais;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public PaymentData getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(PaymentData paymentData) {
        this.paymentData = paymentData;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final InvoiceLine other = (InvoiceLine) obj;
        return Objects.equals(this.id, other.id);
    }

}

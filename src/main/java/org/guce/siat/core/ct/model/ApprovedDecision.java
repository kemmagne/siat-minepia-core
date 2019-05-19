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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.util.annotations.CustomProperty;

/**
 *
 * @author dzotang
 */
@Entity
@Table(name = "APPROVED_DECISION")
public class ApprovedDecision extends AbstractModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APPROVED_DECISION_SEQ")
    @SequenceGenerator(name = "APPROVED_DECISION_SEQ", sequenceName = "APPROVED_DECISION_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The item flow.
     */
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow itemFlow;

    /**
     * The date.
     */
    @Column(name = "DEPARTURE_DATE")
    @CustomProperty(labelEn = "Departure Date", labelFr = "Date de départ")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date departureDate;

    @CustomProperty(labelEn = "Temperature of product", labelFr = "Température du produit")
    @Column(name = "PRODUCT_TEMPERATURE", length = 100)
    private String productTemperature;

    @CustomProperty(labelEn = "Total number of packages", labelFr = "Nombre d’unités emballées")
    @Column(name = "NB_UNITS_PACKAGED", length = 100)
    private String numberOfUnitPackaged;

    @CustomProperty(labelEn = " Identification of container/seal number", labelFr = "Identification des conteneurs/ No des scellés")
    @Column(name = "CONTAINERS_SEALS", length = 1000)
    private String containerSeals;

    @CustomProperty(labelEn = "Type of packaging", labelFr = "Nature de l'emballage")
    @Column(name = "PACKAGING_TYPE", length = 100)
    private String typeOfPagkaging;

    @CustomProperty(labelEn = "Commodities intended for use as", labelFr = "Marchandises certifiées à des fins de")
    @Column(name = "GOODS_CERTIFIED_FOR", length = 100)
    private String goodsCertifiedFor;

    @CustomProperty(labelEn = "Species (Scientific name)", labelFr = "Espèces (Nom scientifique)")
    @Column(name = "GOODS_SPECIES", length = 100)
    private String goodsSpecies;

    @CustomProperty(labelEn = "Nature of commodity", labelFr = "Nature de la marchandise")
    @Column(name = "GOODS_NATURE", length = 100)
    private String goodsNature;

    @CustomProperty(labelEn = "Treatment type", labelFr = "Type de traitement")
    @Column(name = "GOODS_TREATMENT", length = 100)
    private String goodsTreatment;

    @CustomProperty(labelEn = "Number of packages", labelFr = "Nombre de colis")
    @Column(name = "GOODS_NB_PACKAGES", length = 100)
    private String goodsPackageNumber;

    @CustomProperty(labelEn = "Approved number of Establishments", labelFr = "No d’agrément des établissements")
    @Column(name = "GOODS_AGREEMENT_REFERENCE", length = 100)
    private String goodsAgreementReference;

    @CustomProperty(labelEn = "Net weight", labelFr = "Poids net")
    @Column(name = "GOODS_NET_WEIGHT", length = 100)
    private String goodsNetWeight;

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

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getProductTemperature() {
        return productTemperature;
    }

    public void setProductTemperature(String productTemperature) {
        this.productTemperature = productTemperature;
    }

    public String getNumberOfUnitPackaged() {
        return numberOfUnitPackaged;
    }

    public void setNumberOfUnitPackaged(String numberOfUnitPackaged) {
        this.numberOfUnitPackaged = numberOfUnitPackaged;
    }

    public String getContainerSeals() {
        return containerSeals;
    }

    public void setContainerSeals(String containerSeals) {
        this.containerSeals = containerSeals;
    }

    public String getTypeOfPagkaging() {
        return typeOfPagkaging;
    }

    public void setTypeOfPagkaging(String typeOfPagkaging) {
        this.typeOfPagkaging = typeOfPagkaging;
    }

    public String getGoodsCertifiedFor() {
        return goodsCertifiedFor;
    }

    public void setGoodsCertifiedFor(String goodsCertifiedFor) {
        this.goodsCertifiedFor = goodsCertifiedFor;
    }

    public String getGoodsSpecies() {
        return goodsSpecies;
    }

    public void setGoodsSpecies(String goodsSpecies) {
        this.goodsSpecies = goodsSpecies;
    }

    public String getGoodsNature() {
        return goodsNature;
    }

    public void setGoodsNature(String goodsNature) {
        this.goodsNature = goodsNature;
    }

    public String getGoodsTreatment() {
        return goodsTreatment;
    }

    public void setGoodsTreatment(String goodsTreatment) {
        this.goodsTreatment = goodsTreatment;
    }

    public String getGoodsPackageNumber() {
        return goodsPackageNumber;
    }

    public void setGoodsPackageNumber(String goodsPackageNumber) {
        this.goodsPackageNumber = goodsPackageNumber;
    }

    public String getGoodsAgreementReference() {
        return goodsAgreementReference;
    }

    public void setGoodsAgreementReference(String goodsAgreementReference) {
        this.goodsAgreementReference = goodsAgreementReference;
    }

    public String getGoodsNetWeight() {
        return goodsNetWeight;
    }

    public void setGoodsNetWeight(String goodsNetWeight) {
        this.goodsNetWeight = goodsNetWeight;
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
        final ApprovedDecision other = (ApprovedDecision) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ApprovedDecision{" + "id=" + id
                + ", departureDate=" + departureDate
                + ", itemFlow=" + itemFlow
                + ", productTemperature=" + productTemperature
                + ", numberOfUnitPackaged=" + numberOfUnitPackaged
                + ", containerSeals=" + containerSeals
                + ", typeOfPagkaging=" + typeOfPagkaging
                + ", goodsCertifiedFor=" + goodsCertifiedFor
                + ", goodsSpecies=" + goodsSpecies
                + ", goodsNature=" + goodsNature
                + ", goodsTreatment=" + goodsTreatment
                + ", goodsPackageNumber=" + goodsPackageNumber
                + ", goodsAgreementReference=" + goodsAgreementReference
                + ", goodsNetWeight=" + goodsNetWeight + '}';
    }

}

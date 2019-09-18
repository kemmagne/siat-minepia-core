package org.guce.siat.core.ct.model;

import java.io.Serializable;
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
import javax.persistence.Transient;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.util.annotations.CustomProperty;

/**
 *
 * @author dzotang
 */
@Entity
@Table(name = "CCT_CP_PARAM_VALUE")
public class CCTCPParamValue extends AbstractModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CCT_CP_PARAM_VALUE_SEQ")
    @SequenceGenerator(name = "CCT_CP_PARAM_VALUE_SEQ", sequenceName = "CCT_CP_PARAM_VALUE_SEQ", allocationSize = 1)
    private Long id;

    /**
     * The item flow.
     */
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
    private ItemFlow itemFlow;

    @CustomProperty(labelEn = "Number of containers/plumbs", labelFr = "Nombre de conteneurs/plombs")
    @Column(name = "MAX_CONTAINER_NUMBER")
    private int maxContainerNumber;

    @CustomProperty(labelEn = "Number of merchendise line", labelFr = "Nombre de ligne marchandise")
    @Column(name = "MAX_GOODS_LINES_NUMBER")
    private int maxGoodsLineNumber;

    @CustomProperty(labelEn = "Number of package", labelFr = "Nombre de numero de lots")
    @Column(name = "MAX_PACKAGE_NUMBER")
    private int maxPackageNumber;

    @Column(name = "LABEL_MORE")
    private String labelMore;

//    @Column(name = "OBSERVATIONS")
//    private String observations;

    @Transient
    private int fileContainerCountValue;
    @Transient
    private int fileGoodsCountValue;
    @Transient
    private int filePackageCountValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxContainerNumber() {
        return maxContainerNumber;
    }

    public void setMaxContainerNumber(int maxContainerNumber) {
        this.maxContainerNumber = maxContainerNumber;
    }

    public int getMaxGoodsLineNumber() {
        return maxGoodsLineNumber;
    }

    public void setMaxGoodsLineNumber(int maxGoodsLineNumber) {
        this.maxGoodsLineNumber = maxGoodsLineNumber;
    }

    public int getMaxPackageNumber() {
        return maxPackageNumber;
    }

    public void setMaxPackageNumber(int maxPackageNumber) {
        this.maxPackageNumber = maxPackageNumber;
    }

    public ItemFlow getItemFlow() {
        return itemFlow;
    }

    public void setItemFlow(ItemFlow itemFlow) {
        this.itemFlow = itemFlow;
    }

    public int getFileContainerCountValue() {
        return fileContainerCountValue;
    }

    public void setFileContainerCountValue(int fileContainerCountValue) {
        this.fileContainerCountValue = fileContainerCountValue;
    }

    public int getFileGoodsCountValue() {
        return fileGoodsCountValue;
    }

    public void setFileGoodsCountValue(int fileGoodsCountValue) {
        this.fileGoodsCountValue = fileGoodsCountValue;
    }

    public int getFilePackageCountValue() {
        return filePackageCountValue;
    }

    public void setFilePackageCountValue(int filePackageCountValue) {
        this.filePackageCountValue = filePackageCountValue;
    }

    public String getLabelMore() {
        return labelMore;
    }

    public void setLabelMore(String labelMore) {
        this.labelMore = labelMore;
    }

//    public String getObservations() {
//        return observations;
//    }
//
//    public void setObservations(String observations) {
//        this.observations = observations;
//    }

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
        final CCTCPParamValue other = (CCTCPParamValue) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "CCTCPParamValue{" + "id=" + id + ", maxContainerNumber=" + maxContainerNumber + ", maxGoodsLineNumber=" + maxGoodsLineNumber + ", maxPackageNumber=" + maxPackageNumber + '}';
    }

}

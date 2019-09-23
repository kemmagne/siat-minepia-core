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
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.Administration;
import org.guce.siat.core.ct.util.annotations.CustomProperty;

/**
 *
 * @author dzotang
 */
@Entity
@Table(name = "PARAMS_CCT_CP")
public class ParamCCTCP extends AbstractModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The id.
     */
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAM_CCT_CP_SEQ")
    @SequenceGenerator(name = "PARAM_CCT_CP_SEQ", sequenceName = "PARAM_CCT_CP_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ADMINISTRATION_ID", referencedColumnName = "ID")
    private Administration administration;

    @Column(name = "LABEL_ATTACHMENT")
    @CustomProperty(labelEn = "Label for See attachment", labelFr = "Mention pour voir pièce jointe")
    private String labelAttachment;

    @CustomProperty(labelEn = "Number of containers/plumbs", labelFr = "Nombre de conteneurs/plombs")
    @Column(name = "MAX_CONTAINER_NUMBER")
    private int maxContainerNumber;

    @CustomProperty(labelEn = "Number of merchendise line", labelFr = "Nombre de ligne marchandise")
    @Column(name = "MAX_GOODS_LINES_NUMBER")
    private int maxGoodsLineNumber;

    @CustomProperty(labelEn = "Number of package", labelFr = "Nombre de numero de lots")
    @Column(name = "MAX_PACKAGE_NUMBER")
    private int maxPackageNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public String getLabelAttachment() {
        return labelAttachment;
    }

    public void setLabelAttachment(String labelAttachment) {
        this.labelAttachment = labelAttachment;
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

    @Override
    public String toString() {
        return "ParamCCTCP{" + "id=" + id + ", administration=" + administration + ", labelAttachment=" + labelAttachment + ", maxContainerNumber=" + maxContainerNumber + ", maxGoodsLineNumber=" + maxGoodsLineNumber + ", maxPackageNumber=" + maxPackageNumber + '}';
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
        final ParamCCTCP other = (ParamCCTCP) obj;
        return Objects.equals(this.id, other.id);
    }

}

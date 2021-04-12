package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Item;
import org.guce.siat.common.model.Step;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author tadzotsa
 */
@Immutable
@Entity
@Table(name = "MINADER_FILE_ITEM")
public class MinaderFileItem implements Serializable {

    private static final long serialVersionUID = -696142840365509220L;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID")
    private FileItem id;

    /**
     * The draft.
     */
    @Column(name = "DRAFT")
    private Boolean draft;

    /**
     * The quantity.
     */
    @Column(name = "QUANTITY")
    private BigDecimal quantity;

    /**
     * The valeur fob.
     */
    @Column(name = "VALEUR_FOB")
    private BigDecimal fobValue;

    @ManyToOne
    @JoinColumn(name = "FILE_ID")
    private File file;

    @ManyToOne
    @JoinColumn(name = "NSH_ID")
    private Item nsh;
    @Column(name = "GOODS_ITEM_DESC")
    private String nshDesc;

    @ManyToOne
    @JoinColumn(name = "STEP_ID")
    private Step step;

    @Column(name = "SUBFAMILY_ID")
    private Long subFamily;

    @Column(name = "NOMBRE_GRUMES")
    private BigDecimal logsNumber;
    @Column(name = "NOMBRE_SACS")
    private BigDecimal bagsNumber;
    @Column(name = "VOLUME")
    private BigDecimal volume;
    @Column(name = "POIDS_BRUT")
    private BigDecimal grossWeight;
    @Column(name = "POIDS_NET")
    private BigDecimal netWeight;

    public FileItem getId() {
        return id;
    }

    public void setId(FileItem id) {
        this.id = id;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getFobValue() {
        return fobValue;
    }

    public void setFobValue(BigDecimal fobValue) {
        this.fobValue = fobValue;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Item getNsh() {
        return nsh;
    }

    public void setNsh(Item nsh) {
        this.nsh = nsh;
    }

    public String getNshDesc() {
        return nshDesc;
    }

    public void setNshDesc(String nshDesc) {
        this.nshDesc = nshDesc;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public Long getSubFamily() {
        return subFamily;
    }

    public void setSubFamily(Long subFamily) {
        this.subFamily = subFamily;
    }

    public BigDecimal getLogsNumber() {
        return logsNumber;
    }

    public void setLogsNumber(BigDecimal logsNumber) {
        this.logsNumber = logsNumber;
    }

    public BigDecimal getBagsNumber() {
        return bagsNumber;
    }

    public void setBagsNumber(BigDecimal bagsNumber) {
        this.bagsNumber = bagsNumber;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

}

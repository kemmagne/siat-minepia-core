package org.guce.siat.core.ct.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileType;

/**
 *
 * @author tadzotsa
 */
@javax.persistence.Entity
@Table(name = "DECISION_HISTORY")
public class DecisionHistory extends AbstractModel implements Serializable {

    private static final long serialVersionUID = -3019184773702263811L;

    /**
     * The id.
     */
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "DECISION_HISTORY_SEQ", sequenceName = "DECISION_HISTORY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DECISION_HISTORY_SEQ")
    private Long id;

    /**
     * the file to which this decision history is related
     */
    @JoinColumn(name = "FILE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private File file;

    /**
     * the file type for which this decision history has been sent to e-GUCE
     */
    @JoinColumn(name = "FILE_TYPE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private FileType fileType;

    @Column(name = "CODE", length = 50, nullable = false)
    private String code;
    @Column(name = "LABEL_FR")
    private String labelFr;
    @Column(name = "LABEL_EN")
    private String labelEn;
    @Column(name = "VALUE")
    private String value;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabelFr() {
        return labelFr;
    }

    public void setLabelFr(String labelFr) {
        this.labelFr = labelFr;
    }

    public String getLabelEn() {
        return labelEn;
    }

    public void setLabelEn(String labelEn) {
        this.labelEn = labelEn;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        final StringBuilder builder = new StringBuilder();

        builder.append("FileType [id=");
        builder.append(id);
        builder.append(", code=");
        builder.append(code);
        builder.append(", labelFr=");
        builder.append(labelFr);
        builder.append(", labelEn=");
        builder.append(labelEn);
        builder.append(", value=");
        builder.append(value);
        builder.append("]");

        return builder.toString();
    }

}


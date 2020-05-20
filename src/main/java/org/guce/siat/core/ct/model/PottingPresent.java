package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.guce.siat.common.model.File;

/**
 * @author Gildas AYEFOU
 * @author ht
 */
@Entity
@Table(name = "POTTING_PRESENT")
public class PottingPresent implements Serializable {

    private static final long serialVersionUID = 7623714594362495763L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POTTING_PRESENT_SEQ")
    @SequenceGenerator(name = "POTTING_PRESENT_SEQ", sequenceName = "POTTING_PRESENT_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", length = 100)
    private String name;
    @Column(name = "QUALITY", length = 50)
    private String quality;
    @Column(name = "ORGANISM", length = 35)
    private String organism;
    @ManyToOne
    private File file;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getOrganism() {
        return organism;
    }

    public void setOrganism(String organism) {
        this.organism = organism;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final PottingPresent other = (PottingPresent) obj;
        return Objects.equals(this.id, other.id);
    }

}

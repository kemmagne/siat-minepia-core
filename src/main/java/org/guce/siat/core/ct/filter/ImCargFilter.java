package org.guce.siat.core.ct.filter;

import java.io.Serializable;

/**
 *
 * @author tadzotsa
 */
public class ImCargFilter extends Filter implements Serializable {

    private static final long serialVersionUID = -5013010247044722122L;

    private String yearStart;
    private String yearEnd;

    private String niu;

    private String provenanceCountry;

    private String category;
    private String model;
    private String mark;

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getProvenanceCountry() {
        return provenanceCountry;
    }

    public void setProvenanceCountry(String provenanceCountry) {
        this.provenanceCountry = provenanceCountry;
    }

    public String getNiu() {
        return niu;
    }

    public void setNiu(String niu) {
        this.niu = niu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

}

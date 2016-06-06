package org.guce.siat.core.ct.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The Class TreatmentCompany.
 */
@Entity
@Table(name = "TREATMENT_COMPANY")
@XmlRootElement
public class TreatmentCompany extends org.guce.siat.common.model.Entity
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7671222120551255079L;

	/** The treatment type list. */
	@ManyToMany(cascade = CascadeType.REFRESH)
	@JoinTable(name = "TREATMENT_COMPANY_TYPE", joinColumns = @JoinColumn(name = "TREATMENT_COMPANY_ID"), inverseJoinColumns = @JoinColumn(name = "TREATMENT_TYPE_ID"))
	private List<TreatmentType> treatmentTypeList;

	/**
	 * Gets the treatment type list.
	 *
	 * @return the treatment type list
	 */
	public List<TreatmentType> getTreatmentTypeList()
	{
		return treatmentTypeList;
	}

	/**
	 * Sets the treatment type list.
	 *
	 * @param treatmentTypeList
	 *           the new treatment type list
	 */
	public void setTreatmentTypeList(final List<TreatmentType> treatmentTypeList)
	{
		this.treatmentTypeList = treatmentTypeList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.model.Entity#toString()
	 */
	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("TreatmentCompany [id=");
		builder.append(getId());
		builder.append(", code=");
		builder.append(getCode());
		builder.append(", labelFr=");
		builder.append(super.getLabelFr());
		builder.append(", labelEn=");
		builder.append(super.getLabelEn());
		builder.append(", address=");
		builder.append(getAddress());
		builder.append(", telephone=");
		builder.append(getTelephone());
		builder.append(", fax=");
		builder.append(getFax());
		builder.append(", email=");
		builder.append(getEmail());
		builder.append(", deleted=");
		builder.append(getDeleted());
		builder.append(']');
		return builder.toString();
	}



}

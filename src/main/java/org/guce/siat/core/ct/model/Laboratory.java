package org.guce.siat.core.ct.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AnalyseType;


/**
 * The Class Laboratory.
 */
@Entity
@Table(name = "LABORATORY")
@XmlRootElement
public class Laboratory extends org.guce.siat.common.model.Entity
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4771220229085458213L;


	/** The analyse type list. */
	@ManyToMany(cascade = CascadeType.REFRESH)
	@JoinTable(name = "LABORATORY_ANALYSE_TYPE", joinColumns = @JoinColumn(name = "LABORATORY_ID"), inverseJoinColumns = @JoinColumn(name = "ANALYSE_TYPE_ID"))
	private List<AnalyseType> analyseTypeList;


	/**
	 * Gets the analyse type list.
	 *
	 * @return the analyse type list
	 */
	public List<AnalyseType> getAnalyseTypeList()
	{
		return analyseTypeList;
	}


	/**
	 * Sets the analyse type list.
	 *
	 * @param analyseTypeList
	 *           the new analyse type list
	 */
	public void setAnalyseTypeList(final List<AnalyseType> analyseTypeList)
	{
		this.analyseTypeList = analyseTypeList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.model.Entity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof Laboratory))
		{
			return false;
		}
		final Laboratory other = (Laboratory) object;
		if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())))
		{
			return false;
		}
		return true;
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
		builder.append("Laboratory [id=");
		builder.append(super.getId());
		builder.append(", code=");
		builder.append(super.getCode());
		builder.append(", labelFr=");
		builder.append(super.getLabelFr());
		builder.append(", labelEn=");
		builder.append(super.getLabelEn());
		builder.append(", address=");
		builder.append(super.getAddress());
		builder.append(", telephone=");
		builder.append(super.getTelephone());
		builder.append(", fax=");
		builder.append(super.getFax());
		builder.append(", email=");
		builder.append(super.getEmail());
		builder.append(", deleted=");
		builder.append(super.getDeleted());
		builder.append(']');
		return builder.toString();
	}

}

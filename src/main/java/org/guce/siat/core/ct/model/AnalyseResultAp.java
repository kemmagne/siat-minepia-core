package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;

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


/**
 * The Class AnalyseResultAp.
 */
@Entity
@Table(name = "ANALYSE_RESULT_AP")
public class AnalyseResultAp extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7498432578766985768L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANALYSE_RESULT_AP_SEQ")
	@SequenceGenerator(name = "ANALYSE_RESULT_AP_SEQ", sequenceName = "ANALYSE_RESULT_AP_SEQ", allocationSize = 1)
	private Long id;

	/** The analyse type. */
	@Column(name = "ANALYSE_TYPE")
	private String analyseType;

	/** The description. */
	@Column(name = "DESCRIPTION")
	private String description;

	/** The result. */
	@Column(name = "RESULT")
	private String result;

	/** The analyse date. */
	@Column(name = "ANALYSE_DATE")
	@Temporal(value = TemporalType.DATE)
	private Date analyseDate;

	/** The observations. */
	@Column(name = "OBSERVATIONS", length = 1000)
	private String observations;

	/** The laboratory. */
	@ManyToOne
	@JoinColumn(name = "LABORATORY_ID", referencedColumnName = "ID")
	private Laboratory laboratory;

	/** The item flow. */
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "ID")
	@ManyToOne(cascade =
	{ CascadeType.REFRESH, CascadeType.REMOVE })
	private ItemFlow itemFlow;

	/**
	 * Instantiates a new analyse result ap.
	 */
	public AnalyseResultAp()
	{

	}

	/**
	 * Instantiates a new analyse result ap.
	 *
	 * @param id
	 *           the id
	 */
	public AnalyseResultAp(final Long id)
	{
		this.id = id;
	}

	/**
	 * Instantiates a new analyse result ap.
	 *
	 * @param itemFlow
	 *           the item flow
	 */
	public AnalyseResultAp(final ItemFlow itemFlow)
	{
		this.itemFlow = itemFlow;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Override
	public Long getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *           the id to set
	 */
	@Override
	public void setId(final Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the analyse type.
	 *
	 * @return the analyseType
	 */
	public String getAnalyseType()
	{
		return analyseType;
	}

	/**
	 * Sets the analyse type.
	 *
	 * @param analyseType
	 *           the analyseType to set
	 */
	public void setAnalyseType(final String analyseType)
	{
		this.analyseType = analyseType;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *           the description to set
	 */
	public void setDescription(final String description)
	{
		this.description = description;
	}

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public String getResult()
	{
		return result;
	}

	/**
	 * Sets the result.
	 *
	 * @param result
	 *           the result to set
	 */
	public void setResult(final String result)
	{
		this.result = result;
	}

	/**
	 * Gets the analyse date.
	 *
	 * @return the analyseDate
	 */
	public Date getAnalyseDate()
	{
		return analyseDate;
	}

	/**
	 * Sets the analyse date.
	 *
	 * @param analyseDate
	 *           the analyseDate to set
	 */
	public void setAnalyseDate(final Date analyseDate)
	{
		this.analyseDate = analyseDate;
	}

	/**
	 * Gets the laboratory.
	 *
	 * @return the laboratory
	 */
	public Laboratory getLaboratory()
	{
		return laboratory;
	}

	/**
	 * Gets the observations.
	 *
	 * @return the observations
	 */
	public String getObservations()
	{
		return observations;
	}

	/**
	 * Sets the observations.
	 *
	 * @param observations
	 *           the observations to set
	 */
	public void setObservations(final String observations)
	{
		this.observations = observations;
	}

	/**
	 * Sets the laboratory.
	 *
	 * @param laboratory
	 *           the laboratory to set
	 */
	public void setLaboratory(final Laboratory laboratory)
	{
		this.laboratory = laboratory;
	}

	/**
	 * Gets the item flow.
	 *
	 * @return the itemFlow
	 */
	public ItemFlow getItemFlow()
	{
		return itemFlow;
	}

	/**
	 * Sets the item flow.
	 *
	 * @param itemFlow
	 *           the itemFlow to set
	 */
	public void setItemFlow(final ItemFlow itemFlow)
	{
		this.itemFlow = itemFlow;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof AnalyseResultAp))
		{
			return false;
		}
		final AnalyseResultAp other = (AnalyseResultAp) object;
		if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())))
		{
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("AnalyseResultAp [id=");
		builder.append(id);
		builder.append(", analyseType=");
		builder.append(analyseType);
		builder.append(", description=");
		builder.append(description);
		builder.append(", result=");
		builder.append(result);
		builder.append(", analyseDate=");
		builder.append(analyseDate);
		builder.append(']');
		return builder.toString();
	}

}

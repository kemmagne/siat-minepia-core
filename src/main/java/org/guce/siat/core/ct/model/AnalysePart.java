package org.guce.siat.core.ct.model;


import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.AnalyseType;


/**
 * The Class AnalysePart.
 */
@Entity
@Table(name = "ANALYSE_PART")
@XmlRootElement
public class AnalysePart extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -22252507657632273L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANALYSE_PART_SEQ")
	@SequenceGenerator(name = "ANALYSE_PART_SEQ", sequenceName = "ANALYSE_PART_SEQ", allocationSize = 1)
	private Long id;

	/** The observation. */
	@Column(name = "OBSERVATION", length = 1000)
	private String observation;

	/** The compliant. */
	@Column(name = "COMPLIANT")
	private Boolean compliant;

	/** The attachment. */
	@Column(name = "ATTACHMENT")
	private String attachment;

	/** The analyse order. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "ANALYSE_ORDER_ID", referencedColumnName = "id")
	private AnalyseOrder analyseOrder;

	/** The analyse type. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "ANALYSE_TYPE_ID", referencedColumnName = "id")
	private AnalyseType analyseType;

	/**
	 * Instantiates a new analyse part.
	 */
	public AnalysePart()
	{
	}

	/**
	 * Instantiates a new analyse part.
	 *
	 * @param id
	 *           the id
	 */
	public AnalysePart(final Long id)
	{
		super();
		this.id = id;
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
	 * Gets the observation.
	 *
	 * @return the observation
	 */
	public String getObservation()
	{
		return observation;
	}

	/**
	 * Sets the observation.
	 *
	 * @param observation
	 *           the observation to set
	 */
	public void setObservation(final String observation)
	{
		this.observation = observation;
	}

	/**
	 * Gets the compliant.
	 *
	 * @return the compliant
	 */
	public Boolean getCompliant()
	{
		return compliant;
	}

	/**
	 * Sets the compliant.
	 *
	 * @param compliant
	 *           the compliant to set
	 */
	public void setCompliant(final Boolean compliant)
	{
		this.compliant = compliant;
	}

	/**
	 * Gets the attachment.
	 *
	 * @return the attachment
	 */
	public String getAttachment()
	{
		return attachment;
	}

	/**
	 * Sets the attachment.
	 *
	 * @param attachment
	 *           the attachment to set
	 */
	public void setAttachment(final String attachment)
	{
		this.attachment = attachment;
	}

	/**
	 * Gets the analyse order.
	 *
	 * @return the analyseOrder
	 */
	public AnalyseOrder getAnalyseOrder()
	{
		return analyseOrder;
	}

	/**
	 * Sets the analyse order.
	 *
	 * @param analyseOrder
	 *           the analyseOrder to set
	 */
	public void setAnalyseOrder(final AnalyseOrder analyseOrder)
	{
		this.analyseOrder = analyseOrder;
	}

	/**
	 * Gets the analyse type.
	 *
	 * @return the analyseType
	 */
	public AnalyseType getAnalyseType()
	{
		return analyseType;
	}

	/**
	 * Sets the analyse type.
	 *
	 * @param analyseType
	 *           the analyseType to set
	 */
	public void setAnalyseType(final AnalyseType analyseType)
	{
		this.analyseType = analyseType;
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
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof AnalysePart))
		{
			return false;
		}
		final AnalysePart other = (AnalysePart) object;
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
		builder.append("AnalysePart [id=");
		builder.append(id);
		builder.append(", observation=");
		builder.append(observation);
		builder.append(", compliant=");
		builder.append(compliant);
		builder.append(", attachment=");
		builder.append(attachment);
		builder.append(']');
		return builder.toString();
	}


}

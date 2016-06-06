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


/**
 * The Class TreatmentPart.
 */
@Entity
@Table(name = "TREATMENT_PART")
@XmlRootElement
public class TreatmentPart extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4058461805098922938L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_PART_SEQ")
	@SequenceGenerator(name = "TREATMENT_PART_SEQ", sequenceName = "TREATMENT_PART_SEQ", allocationSize = 1)
	private Long id;

	/** The observation. */
	@Column(name = "observation", length = 1000)
	private String observation;

	/** The attachment. */
	@Column(name = "ATTACHMENT")
	private String attachment;

	/** The treatment order. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "TREATMENT_ORDER_ID", referencedColumnName = "id")
	private TreatmentOrder treatmentOrder;

	/** The treatment type. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "TREATMENT_TYPE_ID", referencedColumnName = "id")
	private TreatmentType treatmentType;

	/**
	 * Instantiates a new treatment part.
	 */
	public TreatmentPart()
	{
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
	 * Gets the treatment order.
	 *
	 * @return the treatmentOrder
	 */
	public TreatmentOrder getTreatmentOrder()
	{
		return treatmentOrder;
	}

	/**
	 * Sets the treatment order.
	 *
	 * @param treatmentOrder
	 *           the treatmentOrder to set
	 */
	public void setTreatmentOrder(final TreatmentOrder treatmentOrder)
	{
		this.treatmentOrder = treatmentOrder;
	}

	/**
	 * Gets the treatment type.
	 *
	 * @return the treatmentType
	 */
	public TreatmentType getTreatmentType()
	{
		return treatmentType;
	}

	/**
	 * Sets the treatment type.
	 *
	 * @param treatmentType
	 *           the treatmentType to set
	 */
	public void setTreatmentType(final TreatmentType treatmentType)
	{
		this.treatmentType = treatmentType;
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
		if (!(object instanceof TreatmentPart))
		{
			return false;
		}
		final TreatmentPart other = (TreatmentPart) object;
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
		builder.append("TreatmentPart [id=");
		builder.append(id);
		builder.append(", observation=");
		builder.append(observation);
		builder.append(", attachment=");
		builder.append(attachment);
		builder.append(']');
		return builder.toString();
	}

}

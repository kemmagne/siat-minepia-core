/*
 *
 */
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
 * The Class InspectionController.
 */
/**
 *
 */
@Entity
@Table(name = "INSPECTION_CONTROLLER")
@XmlRootElement
public class InspectionController extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5921273486534027133L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INSPECTION_CONTROLLER_SEQ")
	@SequenceGenerator(name = "INSPECTION_CONTROLLER_SEQ", sequenceName = "INSPECTION_CONTROLLER_SEQ", allocationSize = 1)
	private Long id;

	/** The name. */
	@Column(name = "NAME")
	private String name;

	/** The position. */
	@Column(name = "POSITION")
	private String position;

	/** The service. */
	@Column(name = "SERVICE")
	private String service;

	/** The inspection. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "INSPECTION_ID", nullable = false)
	private InspectionReport inspection;

	/**
	 * Instantiates a new inspection controller.
	 */
	public InspectionController()
	{
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.model.AbstractModel#getId()
	 */
	@Override
	public Long getId()
	{
		return id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.model.AbstractModel#setId(java.lang.Long)
	 */
	@Override
	public void setId(final Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *           the name to set
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public String getPosition()
	{
		return position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position
	 *           the position to set
	 */
	public void setPosition(final String position)
	{
		this.position = position;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public String getService()
	{
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service
	 *           the service to set
	 */
	public void setService(final String service)
	{
		this.service = service;
	}

	/**
	 * Gets the inspection.
	 *
	 * @return the inspection
	 */
	public InspectionReport getInspection()
	{
		return inspection;
	}

	/**
	 * Sets the inspection.
	 *
	 * @param inspection
	 *           the inspection to set
	 */
	public void setInspection(final InspectionReport inspection)
	{
		this.inspection = inspection;
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
		if (!(object instanceof InspectionController))
		{
			return false;
		}
		final InspectionController other = (InspectionController) object;
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
		builder.append("InspectionController [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", position=");
		builder.append(position);
		builder.append(", service=");
		builder.append(service);
		builder.append(']');
		return builder.toString();
	}

}

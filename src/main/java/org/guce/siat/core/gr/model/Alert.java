package org.guce.siat.core.gr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.ServicesItem;


/**
 * The Class Alert.
 */
@Entity
@Table(name = "ALERT", uniqueConstraints = @UniqueConstraint(columnNames =
{ "country_id", "services_item_id" }))
@XmlRootElement
public class Alert extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALERT_SEQ")
	@SequenceGenerator(name = "ALERT_SEQ", sequenceName = "ALERT_SEQ", allocationSize = 1)
	private Long id;

	/** The label. */
	@Column(name = "label")
	private String label;

	/** The brand. */
	@Column(name = "brand")
	private String brand;

	/** The start date. */
	@Column(name = "startDate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date startDate;

	/** The end date. */
	@Column(name = "endDate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endDate;

	/** The manufacturer. */
	@Column(name = "manufacturer")
	private String manufacturer;

	/** The model. */
	@Column(name = "model")
	private String model;

	/** The country id. */
	@Column(name = "country_id")
	private String countryId;

	/** The send. */
	private Boolean send;

	/** The services item. */
	@OneToOne
	@JoinColumn(name = "services_item_id")
	private ServicesItem servicesItem;


	/** The country. */
	@Transient
	private Country country;

	/**
	 * Instantiates a new alert.
	 */
	public Alert()
	{
		super();
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
	 * Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel()
	{
		return label;
	}


	/**
	 * Sets the label.
	 *
	 * @param label
	 *           the label to set
	 */
	public void setLabel(final String label)
	{
		this.label = label;
	}


	/**
	 * Gets the brand.
	 *
	 * @return the brand
	 */
	public String getBrand()
	{
		return brand;
	}


	/**
	 * Sets the brand.
	 *
	 * @param brand
	 *           the brand to set
	 */
	public void setBrand(final String brand)
	{
		this.brand = brand;
	}


	/**
	 * Gets the start date.
	 *
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return startDate;
	}


	/**
	 * Sets the start date.
	 *
	 * @param startDate
	 *           the startDate to set
	 */
	public void setStartDate(final Date startDate)
	{
		this.startDate = startDate;
	}


	/**
	 * Gets the end date.
	 *
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return endDate;
	}


	/**
	 * Sets the end date.
	 *
	 * @param endDate
	 *           the endDate to set
	 */
	public void setEndDate(final Date endDate)
	{
		this.endDate = endDate;
	}


	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public String getManufacturer()
	{
		return manufacturer;
	}


	/**
	 * Sets the manufacturer.
	 *
	 * @param manufacturer
	 *           the manufacturer to set
	 */
	public void setManufacturer(final String manufacturer)
	{
		this.manufacturer = manufacturer;
	}


	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}


	/**
	 * Sets the model.
	 *
	 * @param model
	 *           the model to set
	 */
	public void setModel(final String model)
	{
		this.model = model;
	}

	/**
	 * @return the countryId
	 */
	public String getCountryId()
	{
		return countryId;
	}

	/**
	 * @param countryId
	 *           the countryId to set
	 */
	public void setCountryId(final String countryId)
	{
		this.countryId = countryId;
	}


	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public Country getCountry()
	{
		return country;
	}


	/**
	 * Sets the country.
	 *
	 * @param country
	 *           the country to set
	 */
	public void setCountry(final Country country)
	{
		this.country = country;
	}


	/**
	 * Gets the services item.
	 *
	 * @return the servicesItem
	 */
	public ServicesItem getServicesItem()
	{
		return servicesItem;
	}


	/**
	 * Sets the services item.
	 *
	 * @param servicesItem
	 *           the servicesItem to set
	 */
	public void setServicesItem(final ServicesItem servicesItem)
	{
		this.servicesItem = servicesItem;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof Alert))
		{
			return false;
		}
		final Alert other = (Alert) object;
		if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())))
		{
			return false;
		}
		return true;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("Alert [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", manufacturer=");
		builder.append(manufacturer);
		builder.append(", model=");
		builder.append(model);
		builder.append(", countryId=");
		builder.append(countryId);
		builder.append(']');
		return builder.toString();
	}

	/**
	 * Gets the send.
	 *
	 * @return the send
	 */
	public Boolean getSend()
	{
		return send;
	}

	/**
	 * Sets the send.
	 *
	 * @param send
	 *           the new send
	 */
	public void setSend(final Boolean send)
	{
		this.send = send;
	}
}

package org.guce.siat.core.ct.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;


/**
 * The Class TreatmentOrder.
 */
@Entity
@Table(name = "TREATMENT_ORDER")
@XmlRootElement
public class TreatmentOrder extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1539181757314943516L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_ORDER_SEQ")
	@SequenceGenerator(name = "TREATMENT_ORDER_SEQ", sequenceName = "TREATMENT_ORDER_SEQ", allocationSize = 1)
	private Long id;

	/** The date. */
	@Column(name = "TREATMENT_DATE")
	@Temporal(value = TemporalType.DATE)
	private Date date;

	/** The quantity. */
	@Column(name = "QUANTITY")
	private Integer quantity;

	/** The observation. */
	@Column(name = "OBSERVATION", length = 1000)
	private String observation;

	/** The treatment company. */
	@ManyToOne
	@JoinColumn(name = "TREATMENT_COMPANY_ID", referencedColumnName = "id")
	private TreatmentCompany treatmentCompany;

	/** The treatments results list. */
	@OneToMany(mappedBy = "treatmentOrder")
	private List<TreatmentResult> treatmentsResultsList;

	/** The item flow. */
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
	private ItemFlow itemFlow;

	/** The treatment parts list. */
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "treatmentOrder")
	private List<TreatmentPart> treatmentPartsList;


	/**
	 * Instantiates a new treatment order.
	 */
	public TreatmentOrder()
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
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date
	 *           the date to set
	 */
	public void setDate(final Date date)
	{
		this.date = date;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Integer getQuantity()
	{
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *           the quantity to set
	 */
	public void setQuantity(final Integer quantity)
	{
		this.quantity = quantity;
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
	 * Gets the treatment company.
	 *
	 * @return the treatmentCompany
	 */
	public TreatmentCompany getTreatmentCompany()
	{
		return treatmentCompany;
	}

	/**
	 * Sets the treatment company.
	 *
	 * @param treatmentCompany
	 *           the treatmentCompany to set
	 */
	public void setTreatmentCompany(final TreatmentCompany treatmentCompany)
	{
		this.treatmentCompany = treatmentCompany;
	}

	/**
	 * Gets the treatments results list.
	 *
	 * @return the treatmentsResultsList
	 */
	public List<TreatmentResult> getTreatmentsResultsList()
	{
		return treatmentsResultsList;
	}

	/**
	 * Sets the treatments results list.
	 *
	 * @param treatmentsResultsList
	 *           the treatmentsResultsList to set
	 */
	public void setTreatmentsResultsList(final List<TreatmentResult> treatmentsResultsList)
	{
		this.treatmentsResultsList = treatmentsResultsList;
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

	/**
	 * Gets the treatment parts list.
	 *
	 * @return the treatmentPartsList
	 */
	public List<TreatmentPart> getTreatmentPartsList()
	{
		return treatmentPartsList;
	}

	/**
	 * Sets the treatment parts list.
	 *
	 * @param treatmentPartsList
	 *           the treatmentPartsList to set
	 */
	public void setTreatmentPartsList(final List<TreatmentPart> treatmentPartsList)
	{
		this.treatmentPartsList = treatmentPartsList;
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
		if (!(object instanceof TreatmentOrder))
		{
			return false;
		}
		final TreatmentOrder other = (TreatmentOrder) object;
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
		builder.append("TreatmentOrder [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", observation=");
		builder.append(observation);
		builder.append(']');
		return builder.toString();
	}


}

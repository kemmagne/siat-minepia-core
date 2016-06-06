/*
 *
 */
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
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;


/**
 * The Class TreatmentResult.
 */
@Entity
@Table(name = "TREATMENT_RESULT")
@XmlRootElement
public class TreatmentResult extends AbstractModel implements Serializable
{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1063393868984320428L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_RESULT_SEQ")
	@SequenceGenerator(name = "TREATMENT_RESULT_SEQ", sequenceName = "TREATMENT_RESULT_SEQ", allocationSize = 1)
	private Long id;

	/** The treatment date. */
	@Column(name = "TREATMENT_DATE")
	@Temporal(TemporalType.DATE)
	private Date treatmentDate;

	/** The amount. */
	@Column(name = "AMOUNT")
	private String amount;

	/** The dosage. */
	@Column(name = "DOSAGE")
	private String dosage;

	/** The treatment product name. */
	@Column(name = "TREATMENT_PRODUCT_NAME")
	private String treatmentProductName;

	/** The observation. */
	@Column(name = "OBSERVATION")
	private String observation;

	/** The item flow. */
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
	private ItemFlow itemFlow;

	/** The treatment order. */
	@ManyToOne
	@JoinColumn(name = "TREATMENT_ORDER_ID", referencedColumnName = "id")
	private TreatmentOrder treatmentOrder;

	/**
	 * Instantiates a new treatment result.
	 */
	public TreatmentResult()
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
	 * Gets the treatment date.
	 *
	 * @return the treatmentDate
	 */
	public Date getTreatmentDate()
	{
		return treatmentDate;
	}

	/**
	 * Sets the treatment date.
	 *
	 * @param treatmentDate
	 *           the treatmentDate to set
	 */
	public void setTreatmentDate(final Date treatmentDate)
	{
		this.treatmentDate = treatmentDate;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public String getAmount()
	{
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *           the amount to set
	 */
	public void setAmount(final String amount)
	{
		this.amount = amount;
	}

	/**
	 * Gets the dosage.
	 *
	 * @return the dosage
	 */
	public String getDosage()
	{
		return dosage;
	}

	/**
	 * Sets the dosage.
	 *
	 * @param dosage
	 *           the dosage to set
	 */
	public void setDosage(final String dosage)
	{
		this.dosage = dosage;
	}

	/**
	 * Gets the treatment product name.
	 *
	 * @return the treatmentProductName
	 */
	public String getTreatmentProductName()
	{
		return treatmentProductName;
	}

	/**
	 * Sets the treatment product name.
	 *
	 * @param treatmentProductName
	 *           the treatmentProductName to set
	 */
	public void setTreatmentProductName(final String treatmentProductName)
	{
		this.treatmentProductName = treatmentProductName;
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
		if (!(object instanceof TreatmentResult))
		{
			return false;
		}
		final TreatmentResult other = (TreatmentResult) object;
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
		builder.append("TreatmentResult [id=");
		builder.append(id);
		builder.append(", treatmentDate=");
		builder.append(treatmentDate);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", dosage=");
		builder.append(dosage);
		builder.append(", treatmentProductName=");
		builder.append(treatmentProductName);
		builder.append(", observation=");
		builder.append(observation);
		builder.append(']');
		return builder.toString();
	}


}

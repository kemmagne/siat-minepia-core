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
 * The Class AnalyseResult.
 */
@Entity
@Table(name = "ANALYSE_RESULT")
@XmlRootElement
public class AnalyseResult extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1575519384697922791L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANALYSE_RESULT_SEQ")
	@SequenceGenerator(name = "ANALYSE_RESULT_SEQ", sequenceName = "ANALYSE_RESULT_SEQ", allocationSize = 1)
	private Long id;

	/** The analyse date. */
	@Column(name = "ANALYSE_DATE")
	@Temporal(TemporalType.DATE)
	private Date date;

	/** The amount. */
	@Column(name = "AMOUNT")
	private String amount;

	/** The observation. */
	@Column(name = "OBSERVATION")
	private String observation;

	/** The item flow. */
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
	private ItemFlow itemFlow;

	/** The analyse order. */
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ANALYSE_ORDER_ID", referencedColumnName = "id")
	private AnalyseOrder analyseOrder;

	/**
	 * Instantiates a new analyse result.
	 */
	public AnalyseResult()
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
	 *           the new date
	 */
	public void setDate(final Date date)
	{
		this.date = date;
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
		if (!(object instanceof AnalyseResult))
		{
			return false;
		}
		final AnalyseResult other = (AnalyseResult) object;
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
		builder.append("AnalyseResult [id=");
		builder.append(id);
		builder.append(", analyseDate=");
		builder.append(date);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", observation=");
		builder.append(observation);
		builder.append(", AnalyseOrder=");
		builder.append(analyseOrder);
		builder.append(']');
		return builder.toString();
	}

}

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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;


/**
 * The Class AnalyseOrder.
 */
@Entity
@Table(name = "ANALYSE_ORDER")
@XmlRootElement
public class AnalyseOrder extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5773218751793343623L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANALYSE_ORDER_SEQ")
	@SequenceGenerator(name = "ANALYSE_ORDER_SEQ", sequenceName = "ANALYSE_ORDER_SEQ", allocationSize = 1)
	private Long id;

	/** The date. */
	@Column(name = "ORDER_DATE")
	@Temporal(value = TemporalType.DATE)
	private Date date;

	/** The quantity. */
	@Column(name = "QUANTITY")
	private Integer quantity;

	/** The observation. */
	@Column(name = "OBSERVATION")
	private String observation;

	/** The laboratory id. */
	@ManyToOne
	@JoinColumn(name = "LABORATORY_ID", referencedColumnName = "id")
	private Laboratory laboratory;

	/** The analyses results list. */
	@OneToMany(mappedBy = "analyseOrder", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<AnalyseResult> analysesResultsList;

	/** The sample. */
	@ManyToOne
	@JoinColumn(name = "SAMPLE_ID", referencedColumnName = "id")
	private Sample sample;

	/** The item flow. */
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "id")
	private ItemFlow itemFlow;

	/** The analyses parts list. */
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "analyseOrder")
	private List<AnalysePart> analysePartsList;

	/** The all analyse parts list. */
	@Transient
	private String analyseTypeListFr;

	/** The all analyse parts list. */
	@Transient
	private String analyseTypeListEn;

	/**
	 * Instantiates a new analyse order.
	 */
	public AnalyseOrder()
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
	 * Gets the laboratory.
	 *
	 * @return the laboratory
	 */
	public Laboratory getLaboratory()
	{
		return laboratory;
	}

	/**
	 * Sets the laboratory.
	 *
	 * @param laboratory
	 *           the new laboratory
	 */
	public void setLaboratory(final Laboratory laboratory)
	{
		this.laboratory = laboratory;
	}

	/**
	 * Gets the analyses results list.
	 *
	 * @return the analysesResultsList
	 */
	public List<AnalyseResult> getAnalysesResultsList()
	{
		return analysesResultsList;
	}

	/**
	 * Sets the analyses results list.
	 *
	 * @param analysesResultsList
	 *           the analysesResultsList to set
	 */
	public void setAnalysesResultsList(final List<AnalyseResult> analysesResultsList)
	{
		this.analysesResultsList = analysesResultsList;
	}

	/**
	 * Gets the sample.
	 *
	 * @return the sample
	 */
	public Sample getSample()
	{
		return sample;
	}

	/**
	 * Sets the sample.
	 *
	 * @param sample
	 *           the sample to set
	 */
	public void setSample(final Sample sample)
	{
		this.sample = sample;
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
	 * Gets the analyse parts list.
	 *
	 * @return the analysePartsList
	 */
	public List<AnalysePart> getAnalysePartsList()
	{
		return analysePartsList;
	}

	/**
	 * Sets the analyse parts list.
	 *
	 * @param analysePartsList
	 *           the analysePartsList to set
	 */
	public void setAnalysePartsList(final List<AnalysePart> analysePartsList)
	{
		this.analysePartsList = analysePartsList;
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
		if (!(object instanceof AnalyseOrder))
		{
			return false;
		}
		final AnalyseOrder other = (AnalyseOrder) object;
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
		builder.append("AnalyseOrder [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", observation=");
		builder.append(observation);
		builder.append(", sample=");
		builder.append(sample);
		builder.append(']');
		return builder.toString();
	}


	/**
	 * Gets the analyse type list fr.
	 *
	 * @return the analyse type list fr
	 */
	public String getAnalyseTypeListFr()
	{
		final StringBuilder returnedString = new StringBuilder();
		for (final AnalysePart analysePart : analysePartsList)
		{
			if (CollectionUtils.isNotEmpty(analysePartsList) && analysePart.getAnalyseType().getLabelFr() != null)
			{
				returnedString.append(analysePart.getAnalyseType().getLabelFr());
				returnedString.append(", ");
			}
		}
		return returnedString.toString();
	}

	/**
	 * Sets the analyse type list fr.
	 *
	 * @param analyseTypeListFr
	 *           the new analyse type list fr
	 */
	public void setAnalyseTypeListFr(final String analyseTypeListFr)
	{
		this.analyseTypeListFr = analyseTypeListFr;
	}

	/**
	 * Gets the analyse type list en.
	 *
	 * @return the analyse type list en
	 */
	public String getAnalyseTypeListEn()
	{
		final StringBuilder returnedString = new StringBuilder();
		for (final AnalysePart analysePart : analysePartsList)
		{
			if (CollectionUtils.isNotEmpty(analysePartsList) && analysePart.getAnalyseType().getLabelEn() != null)
			{
				returnedString.append(analysePart.getAnalyseType().getLabelEn());
				returnedString.append(", ");
			}
		}
		return returnedString.toString();
	}

	/**
	 * Sets the analyse type list en.
	 *
	 * @param analyseTypeListEn
	 *           the new analyse type list en
	 */
	public void setAnalyseTypeListEn(final String analyseTypeListEn)
	{
		this.analyseTypeListEn = analyseTypeListEn;
	}
}

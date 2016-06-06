package org.guce.siat.core.gr.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;



/**
 * The Class TrendPerformance.
 */
@Entity
@Table(name = "TREND_PERFORMANCE")
@XmlRootElement
public class TrendPerformance extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREND_PERFORMANCE_SEQ")
	@SequenceGenerator(name = "TREND_PERFORMANCE_SEQ", sequenceName = "TREND_PERFORMANCE_SEQ", allocationSize = 1)
	private Long id;

	/** The user. */
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne
	private User user;

	/** The item flow. */
	@OneToOne
	@JoinColumn(name = "itemflow_id", referencedColumnName = "id")
	private ItemFlow itemFlow;

	/** The user decision. */
	@Column(name = "user_decision")
	private String userDecision;

	/** The system decision. */
	@Column(name = "system_decision")
	private String systemDecision;

	/** The concordance. */
	@Column(name = "concordance")
	private Boolean concordance;



	/**
	 * Instantiates a new alert.
	 */
	public TrendPerformance()
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
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser()
	{
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user
	 *           the new user
	 */
	public void setUser(final User user)
	{
		this.user = user;
	}

	/**
	 * Gets the item flow.
	 *
	 * @return the item flow
	 */
	public ItemFlow getItemFlow()
	{
		return itemFlow;
	}

	/**
	 * Sets the item flow.
	 *
	 * @param itemFlow
	 *           the new item flow
	 */
	public void setItemFlow(final ItemFlow itemFlow)
	{
		this.itemFlow = itemFlow;
	}

	/**
	 * Gets the concordance.
	 *
	 * @return the concordance
	 */
	public Boolean getConcordance()
	{
		return concordance;
	}

	/**
	 * Sets the concordance.
	 *
	 * @param concordance
	 *           the new concordance
	 */
	public void setConcordance(final Boolean concordance)
	{
		this.concordance = concordance;
	}

	/**
	 * Gets the user decision.
	 *
	 * @return the user decision
	 */
	public String getUserDecision()
	{
		return userDecision;
	}

	/**
	 * Sets the user decision.
	 *
	 * @param userDecision
	 *           the new user decision
	 */
	public void setUserDecision(final String userDecision)
	{
		this.userDecision = userDecision;
	}

	/**
	 * Gets the system decision.
	 *
	 * @return the system decision
	 */
	public String getSystemDecision()
	{
		return systemDecision;
	}

	/**
	 * Sets the system decision.
	 *
	 * @param systemDecision
	 *           the new system decision
	 */
	public void setSystemDecision(final String systemDecision)
	{
		this.systemDecision = systemDecision;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof TrendPerformance))
		{
			return false;
		}
		final TrendPerformance other = (TrendPerformance) object;
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
		builder.append("TrendPerformance [id=");
		builder.append(id);
		builder.append(", user=");
		builder.append(user);
		builder.append(", userDecision=");
		builder.append(userDecision);
		builder.append(", systemDecision=");
		builder.append(systemDecision);
		builder.append(", itemFlow=");
		builder.append(itemFlow);
		builder.append(", concordance=");
		builder.append(concordance);
		builder.append(']');
		return builder.toString();
	}


}

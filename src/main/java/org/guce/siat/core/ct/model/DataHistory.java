package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.User;


/**
 * The Class DataHistory.
 */
@Entity
@Table(name = "DATA_HISTORY")
@XmlRootElement
public class DataHistory extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DATA_HISTORY_SEQ")
	@SequenceGenerator(name = "DATA_HISTORY_SEQ", sequenceName = "DATA_HISTORY_SEQ", allocationSize = 1)
	private Long id;

	/** The action. */
	@Column(name = "action")
	private String action;

	/** The created. */
	@Column(name = "created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	/** The data class. */
	@Column(name = "data_class")
	private String dataClass;

	/** The data id. */
	@Column(name = "data_id")
	private String dataId;

	/** The user. */
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne
	private User user;

	/**
	 * Instantiates a new data history.
	 */
	public DataHistory()
	{
	}

	/**
	 * Instantiates a new data history.
	 *
	 * @param id
	 *           the id
	 */
	public DataHistory(final Long id)
	{
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
	 * Gets the action.
	 *
	 * @return the action
	 */
	public String getAction()
	{
		return action;
	}

	/**
	 * Sets the action.
	 *
	 * @param action
	 *           the action to set
	 */
	public void setAction(final String action)
	{
		this.action = action;
	}

	/**
	 * Gets the created.
	 *
	 * @return the created
	 */
	public Date getCreated()
	{
		return created;
	}

	/**
	 * Sets the created.
	 *
	 * @param created
	 *           the created to set
	 */
	public void setCreated(final Date created)
	{
		this.created = created;
	}

	/**
	 * Gets the data class.
	 *
	 * @return the dataClass
	 */
	public String getDataClass()
	{
		return dataClass;
	}

	/**
	 * Sets the data class.
	 *
	 * @param dataClass
	 *           the dataClass to set
	 */
	public void setDataClass(final String dataClass)
	{
		this.dataClass = dataClass;
	}

	/**
	 * Gets the data id.
	 *
	 * @return the dataId
	 */
	public String getDataId()
	{
		return dataId;
	}

	/**
	 * Sets the data id.
	 *
	 * @param dataId
	 *           the dataId to set
	 */
	public void setDataId(final String dataId)
	{
		this.dataId = dataId;
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
	 *           the user to set
	 */
	public void setUser(final User user)
	{
		this.user = user;
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
		if (!(object instanceof DataHistory))
		{
			return false;
		}
		final DataHistory other = (DataHistory) object;
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
		builder.append("DataHistory [id=");
		builder.append(id);
		builder.append(", action=");
		builder.append(action);
		builder.append(", created=");
		builder.append(created);
		builder.append(", dataClass=");
		builder.append(dataClass);
		builder.append(", dataId=");
		builder.append(dataId);
		builder.append(']');
		return builder.toString();
	}
}

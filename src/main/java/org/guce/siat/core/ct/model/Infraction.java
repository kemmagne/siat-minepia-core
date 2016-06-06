package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.Ministry;


/**
 * The Class infraction.
 */
@Entity
@Table(name = "REP_INFRACTION")
@XmlRootElement
public class Infraction implements Serializable
{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -922111223911944371L;


	/** The infraction code. */
	@Id
	@Basic(optional = false)
	@Column(name = "INFRACTION_CODE")
	private String infractionCode;



	/** The infraction desc. */
	@Column(name = "INFRACTION_DESC")
	private String infractionDesc;


	/** The infraction desc en. */
	@Column(name = "INFRACTION_DESC_EN")
	private String infractionDescEn;

	/** The ministry. */
	@ManyToOne
	@JoinColumn(name = "MINISTRY_ID", referencedColumnName = "ID")
	private Ministry ministry;



	/**
	 * Gets the infraction code.
	 *
	 * @return the infraction code
	 */
	public String getinfractionCode()
	{
		return infractionCode;
	}



	/**
	 * Sets the infraction code.
	 *
	 * @param infractionCode
	 *           the new infraction code
	 */
	public void setinfractionCode(final String infractionCode)
	{
		this.infractionCode = infractionCode;
	}



	/**
	 * Gets the infraction desc.
	 *
	 * @return the infraction desc
	 */
	public String getinfractionDesc()
	{
		return infractionDesc;
	}


	/**
	 * Sets the infraction type desc.
	 *
	 * @param infractionDesc
	 *           the new infraction type desc
	 */
	public void setinfractionDesc(final String infractionDesc)
	{
		this.infractionDesc = infractionDesc;
	}


	/**
	 * Gets the infraction type desc en.
	 *
	 * @return the infraction type desc en
	 */
	public String getinfractionDescEn()
	{
		return infractionDescEn;
	}


	/**
	 * Sets the infraction type desc en.
	 *
	 * @param infractionDescEn
	 *           the new infraction type desc en
	 */
	public void setinfractionDescEn(final String infractionDescEn)
	{
		this.infractionDescEn = infractionDescEn;
	}


	/**
	 * Gets the ministry.
	 *
	 * @return the ministry
	 */
	public Ministry getMinistry()
	{
		return ministry;
	}



	/**
	 * Sets the ministry.
	 *
	 * @param ministry
	 *           the new ministry
	 */
	public void setMinistry(final Ministry ministry)
	{
		this.ministry = ministry;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof Infraction))
		{
			return false;
		}
		final Infraction other = (Infraction) object;
		if ((this.getinfractionCode() == null && other.getinfractionCode() != null)
				|| (this.getinfractionCode() != null && !this.getinfractionCode().equals(other.getinfractionCode())))
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
		builder.append("Infraction [infractionCode=");
		builder.append(infractionCode);
		builder.append(", infractionDesc=");
		builder.append(infractionDesc);
		builder.append(", infractionDescEn=");
		builder.append(infractionDescEn);
		builder.append(']');
		return builder.toString();
	}



}

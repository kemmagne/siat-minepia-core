package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The Class Operator.
 */
@Entity
@Table(name = "REP_NIU")
@XmlRootElement
public class Operator implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Op nui. */
	@Id
	@Basic(optional = false)
	@Column(name = "OP_NUI")
	private String opNui;

	/** The Op last name. */
	@Column(name = "OP_LAST_NAME")
	private String opLastName;

	/** The Op first name. */
	@Column(name = "OP_FIRST_NAME")
	private String opFirstName;

	/** The Op first cni. */
	@Column(name = "OP_FIRST_CNI")
	private String opFirstCni;

	/** The Op address. */
	@Column(name = "OP_ADDRESS")
	private String opAddress;

	/** The Op post office box. */
	@Column(name = "OP_POST_OFFICE_BOX")
	private String opPostOfficeBox;

	/** The Op tel. */
	@Column(name = "OP_TEL")
	private String opTel;

	/** The Op fax. */
	@Column(name = "OP_FAX")
	private String opFax;

	/** The Op mobile. */
	@Column(name = "OP_MOBILE")
	private String opMobile;

	/** The Op email. */
	@Column(name = "OP_EMAIL")
	private String opEmail;

	/** The Op issued date. */
	@Column(name = "OP_ISSUED_DATE")
	private String opIssuedDate;

	/** The Op expiration date. */
	@Column(name = "OP_EXPIRATION_DATE")
	private String opExpirationDate;

	/**
	 * Gets the op nui.
	 *
	 * @return the opNui
	 */
	public String getOpNui()
	{
		return opNui;
	}

	/**
	 * Sets the op nui.
	 *
	 * @param opNui
	 *           the opNui to set
	 */
	public void setOpNui(final String opNui)
	{
		this.opNui = opNui;
	}

	/**
	 * Gets the op last name.
	 *
	 * @return the opLastName
	 */
	public String getOpLastName()
	{
		return opLastName;
	}

	/**
	 * Sets the op last name.
	 *
	 * @param opLastName
	 *           the opLastName to set
	 */
	public void setOpLastName(final String opLastName)
	{
		this.opLastName = opLastName;
	}

	/**
	 * Gets the op first name.
	 *
	 * @return the opFirstName
	 */
	public String getOpFirstName()
	{
		return opFirstName;
	}

	/**
	 * Sets the op first name.
	 *
	 * @param opFirstName
	 *           the opFirstName to set
	 */
	public void setOpFirstName(final String opFirstName)
	{
		this.opFirstName = opFirstName;
	}

	/**
	 * Gets the op first cni.
	 *
	 * @return the opFirstCni
	 */
	public String getOpFirstCni()
	{
		return opFirstCni;
	}

	/**
	 * Sets the op first cni.
	 *
	 * @param opFirstCni
	 *           the opFirstCni to set
	 */
	public void setOpFirstCni(final String opFirstCni)
	{
		this.opFirstCni = opFirstCni;
	}

	/**
	 * Gets the op address.
	 *
	 * @return the opAddress
	 */
	public String getOpAddress()
	{
		return opAddress;
	}

	/**
	 * Sets the op address.
	 *
	 * @param opAddress
	 *           the opAddress to set
	 */
	public void setOpAddress(final String opAddress)
	{
		this.opAddress = opAddress;
	}

	/**
	 * Gets the op post office box.
	 *
	 * @return the opPostOfficeBox
	 */
	public String getOpPostOfficeBox()
	{
		return opPostOfficeBox;
	}

	/**
	 * Sets the op post office box.
	 *
	 * @param opPostOfficeBox
	 *           the opPostOfficeBox to set
	 */
	public void setOpPostOfficeBox(final String opPostOfficeBox)
	{
		this.opPostOfficeBox = opPostOfficeBox;
	}

	/**
	 * Gets the op tel.
	 *
	 * @return the opTel
	 */
	public String getOpTel()
	{
		return opTel;
	}

	/**
	 * Sets the op tel.
	 *
	 * @param opTel
	 *           the opTel to set
	 */
	public void setOpTel(final String opTel)
	{
		this.opTel = opTel;
	}

	/**
	 * Gets the op fax.
	 *
	 * @return the opFax
	 */
	public String getOpFax()
	{
		return opFax;
	}

	/**
	 * Sets the op fax.
	 *
	 * @param opFax
	 *           the opFax to set
	 */
	public void setOpFax(final String opFax)
	{
		this.opFax = opFax;
	}

	/**
	 * Gets the op mobile.
	 *
	 * @return the opMobile
	 */
	public String getOpMobile()
	{
		return opMobile;
	}

	/**
	 * Sets the op mobile.
	 *
	 * @param opMobile
	 *           the opMobile to set
	 */
	public void setOpMobile(final String opMobile)
	{
		this.opMobile = opMobile;
	}

	/**
	 * Gets the op email.
	 *
	 * @return the opEmail
	 */
	public String getOpEmail()
	{
		return opEmail;
	}

	/**
	 * Sets the op email.
	 *
	 * @param opEmail
	 *           the opEmail to set
	 */
	public void setOpEmail(final String opEmail)
	{
		this.opEmail = opEmail;
	}

	/**
	 * Gets the op issued date.
	 *
	 * @return the opIssuedDate
	 */
	public String getOpIssuedDate()
	{
		return opIssuedDate;
	}

	/**
	 * Sets the op issued date.
	 *
	 * @param opIssuedDate
	 *           the opIssuedDate to set
	 */
	public void setOpIssuedDate(final String opIssuedDate)
	{
		this.opIssuedDate = opIssuedDate;
	}

	/**
	 * Gets the op expiration date.
	 *
	 * @return the opExpirationDate
	 */
	public String getOpExpirationDate()
	{
		return opExpirationDate;
	}

	/**
	 * Sets the op expiration date.
	 *
	 * @param opExpirationDate
	 *           the opExpirationDate to set
	 */
	public void setOpExpirationDate(final String opExpirationDate)
	{
		this.opExpirationDate = opExpirationDate;
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
		hash += (opNui != null ? opNui.hashCode() : 0);
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
		if (!(object instanceof Operator))
		{
			return false;
		}
		final Operator other = (Operator) object;
		if ((this.getOpNui() == null && other.getOpNui() != null)
				|| (this.getOpNui() != null && !this.getOpNui().equals(other.getOpNui())))
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
		builder.append("RepNiu [opNui=");
		builder.append(opNui);
		builder.append(", opLastName=");
		builder.append(opLastName);
		builder.append(", opFirstName=");
		builder.append(opFirstName);
		builder.append(", opFirstCni=");
		builder.append(opFirstCni);
		builder.append(", opAddress=");
		builder.append(opAddress);
		builder.append(", opPostOfficeBox=");
		builder.append(opPostOfficeBox);
		builder.append(", opTel=");
		builder.append(opTel);
		builder.append(", opFax=");
		builder.append(opFax);
		builder.append(", opMobile=");
		builder.append(opMobile);
		builder.append(", opEmail=");
		builder.append(opEmail);
		builder.append(", opIssuedDate=");
		builder.append(opIssuedDate);
		builder.append(", opExpirationDate=");
		builder.append(opExpirationDate);
		builder.append(']');
		return builder.toString();
	}

}

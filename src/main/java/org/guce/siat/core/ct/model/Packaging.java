package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The Class Packaging.
 */
@Entity
@Table(name = "REP_TYPES_PACKAGE")
@XmlRootElement
public class Packaging implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The package type code. */
	@Id
	@Basic(optional = false)
	@Column(name = "PACKAGE_TYPE_CODE")
	private String packageTypeCode;

	/** The package type desc. */
	@Column(name = "PACKAGE_TYPE_DESC")
	private String packageTypeDesc;

	/** The package type desc en. */
	@Column(name = "PACKAGE_TYPE_DESC_EN")
	private String packageTypeDescEn;

	/**
	 * Gets the package type code.
	 *
	 * @return the packageTypeCode
	 */
	public String getPackageTypeCode()
	{
		return packageTypeCode;
	}

	/**
	 * Sets the package type code.
	 *
	 * @param packageTypeCode
	 *           the packageTypeCode to set
	 */
	public void setPackageTypeCode(final String packageTypeCode)
	{
		this.packageTypeCode = packageTypeCode;
	}

	/**
	 * Gets the package type desc.
	 *
	 * @return the packageTypeDesc
	 */
	public String getPackageTypeDesc()
	{
		return packageTypeDesc;
	}

	/**
	 * Sets the package type desc.
	 *
	 * @param packageTypeDesc
	 *           the packageTypeDesc to set
	 */
	public void setPackageTypeDesc(final String packageTypeDesc)
	{
		this.packageTypeDesc = packageTypeDesc;
	}

	/**
	 * Gets the package type desc en.
	 *
	 * @return the packageTypeDescEn
	 */
	public String getPackageTypeDescEn()
	{
		return packageTypeDescEn;
	}

	/**
	 * Sets the package type desc en.
	 *
	 * @param packageTypeDescEn
	 *           the packageTypeDescEn to set
	 */
	public void setPackageTypeDescEn(final String packageTypeDescEn)
	{
		this.packageTypeDescEn = packageTypeDescEn;
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
		hash += (packageTypeCode != null ? packageTypeCode.hashCode() : 0);
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
		if (!(object instanceof Packaging))
		{
			return false;
		}
		final Packaging other = (Packaging) object;
		if ((this.getPackageTypeCode() == null && other.getPackageTypeCode() != null)
				|| (this.getPackageTypeCode() != null && !this.getPackageTypeCode().equals(other.getPackageTypeCode())))
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
		builder.append("Packaging [packageTypeCode=");
		builder.append(packageTypeCode);
		builder.append(", packageTypeDesc=");
		builder.append(packageTypeDesc);
		builder.append(", packageTypeDescEn=");
		builder.append(packageTypeDescEn);
		builder.append(']');
		return builder.toString();
	}

}

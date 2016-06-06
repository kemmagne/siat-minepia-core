package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The Class UniteMesure.
 */
@Entity
@Table(name = "REP_UNIT_MEASURE")
@XmlRootElement
public class UniteMesure implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The unit measure code. */
	@Id
	@Basic(optional = false)
	@Column(name = "UNIT_MEASURE_CODE")
	private String unitMeasureCode;

	/** The unit measure name. */
	@Column(name = "UNIT_MEASURE_NAME")
	private String unitMeasureName;

	/** The unit measure name en. */
	@Column(name = "UNIT_MEASURE_NAME_EN")
	private String unitMeasureNameEn;

	/** The unit measure sector. */
	@Column(name = "UNIT_MEASURE_SECTOR")
	private String unitMeasureSector;

	/** The unit measure category. */
	@Column(name = "UNIT_MEASURE_CATEGORY")
	private String unitMeasureCategory;

	/** The unit measure quantity. */
	@Column(name = "UNIT_MEASURE_QUANTITY")
	private String unitMeasureQuantity;

	/**
	 * Gets the unit measure code.
	 *
	 * @return the unitMeasureCode
	 */
	public String getUnitMeasureCode()
	{
		return unitMeasureCode;
	}

	/**
	 * Sets the unit measure code.
	 *
	 * @param unitMeasureCode
	 *           the unitMeasureCode to set
	 */
	public void setUnitMeasureCode(final String unitMeasureCode)
	{
		this.unitMeasureCode = unitMeasureCode;
	}

	/**
	 * Gets the unit measure name.
	 *
	 * @return the unitMeasureName
	 */
	public String getUnitMeasureName()
	{
		return unitMeasureName;
	}

	/**
	 * Sets the unit measure name.
	 *
	 * @param unitMeasureName
	 *           the unitMeasureName to set
	 */
	public void setUnitMeasureName(final String unitMeasureName)
	{
		this.unitMeasureName = unitMeasureName;
	}

	/**
	 * Gets the unit measure name en.
	 *
	 * @return the unitMeasureNameEn
	 */
	public String getUnitMeasureNameEn()
	{
		return unitMeasureNameEn;
	}

	/**
	 * Sets the unit measure name en.
	 *
	 * @param unitMeasureNameEn
	 *           the unitMeasureNameEn to set
	 */
	public void setUnitMeasureNameEn(final String unitMeasureNameEn)
	{
		this.unitMeasureNameEn = unitMeasureNameEn;
	}

	/**
	 * Gets the unit measure sector.
	 *
	 * @return the unitMeasureSector
	 */
	public String getUnitMeasureSector()
	{
		return unitMeasureSector;
	}

	/**
	 * Sets the unit measure sector.
	 *
	 * @param unitMeasureSector
	 *           the unitMeasureSector to set
	 */
	public void setUnitMeasureSector(final String unitMeasureSector)
	{
		this.unitMeasureSector = unitMeasureSector;
	}

	/**
	 * Gets the unit measure category.
	 *
	 * @return the unitMeasureCategory
	 */
	public String getUnitMeasureCategory()
	{
		return unitMeasureCategory;
	}

	/**
	 * Sets the unit measure category.
	 *
	 * @param unitMeasureCategory
	 *           the unitMeasureCategory to set
	 */
	public void setUnitMeasureCategory(final String unitMeasureCategory)
	{
		this.unitMeasureCategory = unitMeasureCategory;
	}

	/**
	 * Gets the unit measure quantity.
	 *
	 * @return the unitMeasureQuantity
	 */
	public String getUnitMeasureQuantity()
	{
		return unitMeasureQuantity;
	}

	/**
	 * Sets the unit measure quantity.
	 *
	 * @param unitMeasureQuantity
	 *           the unitMeasureQuantity to set
	 */
	public void setUnitMeasureQuantity(final String unitMeasureQuantity)
	{
		this.unitMeasureQuantity = unitMeasureQuantity;
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
		hash += (unitMeasureCode != null ? unitMeasureCode.hashCode() : 0);
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
		if (!(object instanceof UniteMesure))
		{
			return false;
		}
		final UniteMesure other = (UniteMesure) object;
		if ((this.getUnitMeasureCode() == null && other.getUnitMeasureCode() != null)
				|| (this.getUnitMeasureCode() != null && !this.getUnitMeasureCode().equals(other.getUnitMeasureCode())))
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
		builder.append("UniteMesure [unitMeasureCode=");
		builder.append(unitMeasureCode);
		builder.append(", unitMeasureName=");
		builder.append(unitMeasureName);
		builder.append(", unitMeasureNameEn=");
		builder.append(unitMeasureNameEn);
		builder.append(", unitMeasureSector=");
		builder.append(unitMeasureSector);
		builder.append(", unitMeasureCategory=");
		builder.append(unitMeasureCategory);
		builder.append(", unitMeasureQuantity=");
		builder.append(unitMeasureQuantity);
		builder.append(']');
		return builder.toString();
	}


}

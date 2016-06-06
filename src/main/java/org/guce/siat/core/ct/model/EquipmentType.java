package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The Class EquipmentType.
 */
@Entity
@Table(name = "REP_TYPE_EQUIPMENT")
@XmlRootElement
public class EquipmentType implements Serializable
{
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The equipment type code. */
	@Id
	@Basic(optional = false)
	@Column(name = "EQUIPMENT_TYPE_CODE")
	private String equipmentTypeCode;

	/** The equipment type name. */
	@Column(name = "EQUIPMENT_TYPE_NAME")
	private String equipmentTypeName;

	/** The equipment type name en. */
	@Column(name = "EQUIPMENT_TYPE_NAME_EN")
	private String equipmentTypeNameEn;

	/**
	 * Gets the equipment type code.
	 *
	 * @return the equipmentTypeCode
	 */
	public String getEquipmentTypeCode()
	{
		return equipmentTypeCode;
	}

	/**
	 * Sets the equipment type code.
	 *
	 * @param equipmentTypeCode
	 *           the equipmentTypeCode to set
	 */
	public void setEquipmentTypeCode(final String equipmentTypeCode)
	{
		this.equipmentTypeCode = equipmentTypeCode;
	}

	/**
	 * Gets the equipment type name.
	 *
	 * @return the equipmentTypeName
	 */
	public String getEquipmentTypeName()
	{
		return equipmentTypeName;
	}

	/**
	 * Sets the equipment type name.
	 *
	 * @param equipmentTypeName
	 *           the equipmentTypeName to set
	 */
	public void setEquipmentTypeName(final String equipmentTypeName)
	{
		this.equipmentTypeName = equipmentTypeName;
	}

	/**
	 * Gets the equipment type name en.
	 *
	 * @return the equipmentTypeNameEn
	 */
	public String getEquipmentTypeNameEn()
	{
		return equipmentTypeNameEn;
	}

	/**
	 * Sets the equipment type name en.
	 *
	 * @param equipmentTypeNameEn
	 *           the equipmentTypeNameEn to set
	 */
	public void setEquipmentTypeNameEn(final String equipmentTypeNameEn)
	{
		this.equipmentTypeNameEn = equipmentTypeNameEn;
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
		hash += (equipmentTypeCode != null ? equipmentTypeCode.hashCode() : 0);
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
		if (!(object instanceof EquipmentType))
		{
			return false;
		}
		final EquipmentType other = (EquipmentType) object;
		if ((this.getEquipmentTypeCode() == null && other.getEquipmentTypeCode() != null)
				|| (this.getEquipmentTypeCode() != null && !this.getEquipmentTypeCode().equals(other.getEquipmentTypeCode())))
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
		builder.append("EquipmentType [equipmentTypeCode=");
		builder.append(equipmentTypeCode);
		builder.append(", equipmentTypeName=");
		builder.append(equipmentTypeName);
		builder.append(", equipmentTypeNameEn=");
		builder.append(equipmentTypeNameEn);
		builder.append(']');
		return builder.toString();
	}

}

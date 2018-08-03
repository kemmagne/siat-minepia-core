/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.FileItem;


/**
 * The Class Sample.
 */
@Entity
@Table(name = "SAMPLE")
@XmlRootElement
public class Sample extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8259751913428839011L;

	/** The id. */
	//SAMPLE_SEQ is reserved to MDSYS Oracle User
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SAMPLE_SEQ")
	@SequenceGenerator(name = "SAMPLE_SEQ", sequenceName = "SAMPLE_SEQUENCE", allocationSize = 1)
	private Long id;

	/** The taken quantity. */
	@Column(name = "TAKEN_QUANTITY")
	private Integer takenQuantity;

	/** The container number. */
	@Column(name = "CONTAINER_NUMBER")
	private Integer containerNumber;

	/** The lot number. */
	@Column(name = "LOT_NUMBER")
	private String lotNumber;

	/** The file item. */
	@OneToOne
	@JoinColumn(name = "FILE_ITEM_ID")
	private FileItem fileItem;
	
	/**
	 * The storage place of sample
	 */
	@Column(name = "STORAGE_PLACE")
	private String storagePlace;
	
	@Column(name = "RECONDITIONNING_MODE")
	private String reconditionningMode;
	
	@Column(name = "RECONDITIONNIG_UNITY")
	private String reconditionningUnity;
	
	@Column(name = "TRANSPORT_MEANS")
	private String transportMeans;
	
	@Column(name = "SAMPLING_DATE")
	private Date samplingDate;

	/**
	 * Instantiates a new sample.
	 */
	public Sample()
	{
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.model.AbstractModel#getId()
	 */
	@Override
	public Long getId()
	{
		return id;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.model.AbstractModel#setId(java.lang.Long)
	 */
	@Override
	public void setId(final Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the taken quantity.
	 *
	 * @return the takenQuantity
	 */
	public Integer getTakenQuantity()
	{
		return takenQuantity;
	}

	/**
	 * Sets the taken quantity.
	 *
	 * @param takenQuantity
	 *           the takenQuantity to set
	 */
	public void setTakenQuantity(final Integer takenQuantity)
	{
		this.takenQuantity = takenQuantity;
	}

	/**
	 * Gets the container number.
	 *
	 * @return the containerNumber
	 */
	public Integer getContainerNumber()
	{
		return containerNumber;
	}

	/**
	 * Sets the container number.
	 *
	 * @param containerNumber
	 *           the containerNumber to set
	 */
	public void setContainerNumber(final Integer containerNumber)
	{
		this.containerNumber = containerNumber;
	}

	/**
	 * Gets the lot number.
	 *
	 * @return the lotNumber
	 */
	public String getLotNumber()
	{
		return lotNumber;
	}

	/**
	 * Sets the lot number.
	 *
	 * @param lotNumber
	 *           the lotNumber to set
	 */
	public void setLotNumber(final String lotNumber)
	{
		this.lotNumber = lotNumber;
	}

	/**
	 * Gets the file item.
	 *
	 * @return the fileItem
	 */
	public FileItem getFileItem()
	{
		return fileItem;
	}

	/**
	 * Sets the file item.
	 *
	 * @param fileItem
	 *           the fileItem to set
	 */
	public void setFileItem(final FileItem fileItem)
	{
		this.fileItem = fileItem;
	}

	public String getStoragePlace() {
		return storagePlace;
	}

	public void setStoragePlace(String storagePlace) {
		this.storagePlace = storagePlace;
	}

	public String getReconditionningMode() {
		return reconditionningMode;
	}

	public void setReconditionningMode(String reconditionningMode) {
		this.reconditionningMode = reconditionningMode;
	}

	public String getReconditionningUnity() {
		return reconditionningUnity;
	}

	public void setReconditionningUnity(String reconditionningUnity) {
		this.reconditionningUnity = reconditionningUnity;
	}

	public String getTransportMeans() {
		return transportMeans;
	}

	public void setTransportMeans(String transportMeans) {
		this.transportMeans = transportMeans;
	}

	public Date getSamplingDate() {
		return samplingDate;
	}

	public void setSamplingDate(Date samplingDate) {
		this.samplingDate = samplingDate;
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
		if (!(object instanceof Sample))
		{
			return false;
		}
		final Sample other = (Sample) object;
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
		builder.append("Sample [id=");
		builder.append(id);
		builder.append(", takenQuantity=");
		builder.append(takenQuantity);
		builder.append(", containerNumber=");
		builder.append(containerNumber);
		builder.append(", lotNumber=");
		builder.append(lotNumber);
		builder.append(", storagePlace=");
		builder.append(storagePlace);
		builder.append(", reconditionningMode=");
		builder.append(reconditionningMode);
		builder.append(", reconditionningUnity=");
		builder.append(reconditionningUnity);
		builder.append(", transportMeans");
		builder.append(transportMeans);
		builder.append(", samplingDate");
		builder.append(samplingDate);
		builder.append(']');
		return builder.toString();
	}

}

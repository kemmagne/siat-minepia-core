package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;


/**
 * The Class AppointmentItemFlow.
 */
@Entity
@Table(name = "PAYMENT_ITEM_FLOW")
@XmlRootElement
@AssociationOverrides(
{ @AssociationOverride(name = "primaryKey.paymentData", joinColumns = @JoinColumn(name = "PAYMENT_DATA_ID")),
		@AssociationOverride(name = "primaryKey.itemFlow", joinColumns = @JoinColumn(name = "ITEM_FLOW_ID")) })
public class PaymentItemFlow extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1661540340062149431L;

	/** The primary key. */
	@EmbeddedId
	private PaymentItemFlowId primaryKey = new PaymentItemFlowId();

	/** The deleted. */
	@Column(name = "DELETED", nullable = false)
	private Boolean deleted;


	/** The montant frais. */
	@Column(name = "MONTANT_HT")
	private Long montantHt;

	/** The montant frais. */
	@Column(name = "MONTANT_TVA")
	private Long montantTva;

	/** The nature frais. */
	@Column(name = "NATURE_FRAIS")
	private String natureFrais;
	/** The file item id. */
	@Transient
	private Long fileItemId;



	/**
	 * Instantiates a new appointment item flow.
	 */
	public PaymentItemFlow()
	{
	}

	/**
	 * Instantiates a new payment item flow.
	 *
	 * @param deleted
	 *           the deleted
	 * @param fileItemId
	 *           the file item id
	 */
	public PaymentItemFlow(final Boolean deleted, final Long fileItemId)
	{
		this.deleted = deleted;
		this.fileItemId = fileItemId;
	}

	/**
	 * Instantiates a new appointment item flow.
	 *
	 * @param primaryKey
	 *           the primary key
	 */
	public PaymentItemFlow(final PaymentItemFlowId primaryKey)
	{
		this.primaryKey = primaryKey;
	}

	/**
	 * Gets the primary key.
	 *
	 * @return the primaryKey
	 */
	public PaymentItemFlowId getPrimaryKey()
	{
		return primaryKey;
	}

	/**
	 * Sets the primary key.
	 *
	 * @param primaryKey
	 *           the primaryKey to set
	 */
	public void setPrimaryKey(final PaymentItemFlowId primaryKey)
	{
		this.primaryKey = primaryKey;
	}

	/**
	 * Gets the appointment.
	 *
	 * @return the appointment
	 */
	@Transient
	public PaymentData getPaymentData()
	{
		return primaryKey.getPaymentData();
	}

	/**
	 * Gets the item flow.
	 *
	 * @return the item flow
	 */
	@Transient
	public ItemFlow getItemFlow()
	{
		return primaryKey.getItemFlow();
	}


	/**
	 * Sets the payment data.
	 *
	 * @param paymentData
	 *           the new payment data
	 */
	public void setPaymentData(final PaymentData paymentData)
	{
		primaryKey.setPaymentData(paymentData);
	}

	/**
	 * Sets the item flow.
	 *
	 * @param itemFlow
	 *           the new item flow
	 */
	public void setItemFlow(final ItemFlow itemFlow)
	{
		primaryKey.setItemFlow(itemFlow);
	}

	/**
	 * Gets the deleted.
	 *
	 * @return the deleted
	 */
	public Boolean getDeleted()
	{
		return deleted;
	}

	/**
	 * Sets the deleted.
	 *
	 * @param deleted
	 *           the new deleted
	 */
	public void setDeleted(final Boolean deleted)
	{
		this.deleted = deleted;
	}

	/**
	 * Gets the montant ht.
	 *
	 * @return the montant ht
	 */
	public Long getMontantHt()
	{
		return montantHt;
	}

	/**
	 * Sets the montant ht.
	 *
	 * @param montantHt
	 *           the new montant ht
	 */
	public void setMontantHt(final Long montantHt)
	{
		this.montantHt = montantHt;
	}

	/**
	 * Gets the montant tva.
	 *
	 * @return the montant tva
	 */
	public Long getMontantTva()
	{
		return montantTva;
	}

	/**
	 * Sets the montant tva.
	 *
	 * @param montantTva
	 *           the new montant tva
	 */
	public void setMontantTva(final Long montantTva)
	{
		this.montantTva = montantTva;
	}

	/**
	 * Gets the file item id.
	 *
	 * @return the file item id
	 */
	public Long getFileItemId()
	{
		return fileItemId;
	}

	/**
	 * Sets the file item id.
	 *
	 * @param fileItemId
	 *           the new file item id
	 */
	public void setFileItemId(final Long fileItemId)
	{
		this.fileItemId = fileItemId;
	}

	/**
	 * Gets the nature frais.
	 *
	 * @return the nature frais
	 */
	public String getNatureFrais()
	{
		return natureFrais;
	}

	/**
	 * Sets the nature frais.
	 *
	 * @param natureFrais
	 *           the new nature frais
	 */
	public void setNatureFrais(final String natureFrais)
	{
		this.natureFrais = natureFrais;
	}

}

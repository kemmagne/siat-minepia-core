package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.guce.siat.common.model.ItemFlow;



/**
 * The Class PaymentItemFlowId.
 */
@Embeddable
public class PaymentItemFlowId implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8836011199107093252L;


	/** The payment. */
	@ManyToOne(cascade =
	{ CascadeType.MERGE })
	@JoinColumn(name = "PAYMENT_DATA_ID", referencedColumnName = "ID")
	private PaymentData paymentData;

	/** The item flow. */
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "ID")
	private ItemFlow itemFlow;

	/**
	 * Gets the payment.
	 *
	 * @return the payment
	 */
	public PaymentData getPaymentData()
	{
		return paymentData;
	}

	/**
	 * Sets the payment.
	 *
	 * @param paymentData
	 *           the new payment data
	 */
	public void setPaymentData(final PaymentData paymentData)
	{
		this.paymentData = paymentData;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemFlow == null) ? 0 : itemFlow.hashCode());
		result = prime * result + ((paymentData == null) ? 0 : paymentData.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof PaymentItemFlowId))
		{
			return false;
		}
		final PaymentItemFlowId other = (PaymentItemFlowId) obj;
		if (itemFlow == null)
		{
			if (other.itemFlow != null)
			{
				return false;
			}
		}
		else if (!itemFlow.equals(other.itemFlow))
		{
			return false;
		}
		if (paymentData == null)
		{
			if (other.paymentData != null)
			{
				return false;
			}
		}
		else if (!paymentData.equals(other.paymentData))
		{
			return false;
		}
		return true;
	}



}

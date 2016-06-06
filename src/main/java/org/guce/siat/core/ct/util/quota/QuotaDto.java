package org.guce.siat.core.ct.util.quota;

import java.util.Date;

import org.guce.siat.common.model.FileItem;


/**
 * The Class QuotaDto.
 */
public class QuotaDto implements java.io.Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6171128753996548815L;

	/** The num contribuable. */
	private String numContribuable;

	/** The product. */
	private transient FileItem product;

	/** The quantity. */
	private Integer quantity;

	/** The imp exp quantity. */
	private Integer impExpQuantity;

	/** The remaining quantity. */
	private Integer remainingQuantity;

	/** The deadline. */
	private transient Date deadline;


	/** The begin date filter. */
	private transient Date beginDateFilter;

	/** The end date filter. */
	private transient Date endDateFilter;

	/**
	 * Instantiates a new quota dto.
	 */
	public QuotaDto()
	{
	}


	/**
	 * Instantiates a new quota dto.
	 *
	 * @param numContribuable
	 *           the num contribuable
	 * @param product
	 *           the product
	 */
	public QuotaDto(final String numContribuable, final FileItem product)
	{
		this.numContribuable = numContribuable;
		this.product = product;
	}


	/**
	 * Gets the num contribuable.
	 *
	 * @return the num contribuable
	 */
	public String getNumContribuable()
	{
		return numContribuable;
	}

	/**
	 * Sets the num contribuable.
	 *
	 * @param numContribuable
	 *           the new num contribuable
	 */
	public void setNumContribuable(final String numContribuable)
	{
		this.numContribuable = numContribuable;
	}

	/**
	 * Gets the product.
	 *
	 * @return the product
	 */
	public FileItem getProduct()
	{
		return product;
	}

	/**
	 * Sets the product.
	 *
	 * @param product
	 *           the new product
	 */
	public void setProduct(final FileItem product)
	{
		this.product = product;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Integer getQuantity()
	{
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *           the new quantity
	 */
	public void setQuantity(final Integer quantity)
	{
		this.quantity = quantity;
	}

	/**
	 * Gets the imp exp quantity.
	 *
	 * @return the imp exp quantity
	 */
	public Integer getImpExpQuantity()
	{
		return impExpQuantity;
	}

	/**
	 * Sets the imp exp quantity.
	 *
	 * @param impExpQuantity
	 *           the new imp exp quantity
	 */
	public void setImpExpQuantity(final Integer impExpQuantity)
	{
		this.impExpQuantity = impExpQuantity;
	}

	/**
	 * Gets the remaining quantity.
	 *
	 * @return the remaining quantity
	 */
	public Integer getRemainingQuantity()
	{
		if (this.quantity != null && this.impExpQuantity != null)
		{
			return quantity - impExpQuantity;
		}
		return remainingQuantity;
	}

	/**
	 * Sets the remaining quantity.
	 *
	 * @param remainingQuantity
	 *           the new remaining quantity
	 */
	public void setRemainingQuantity(final Integer remainingQuantity)
	{

		this.remainingQuantity = remainingQuantity;
	}

	/**
	 * Gets the deadline.
	 *
	 * @return the deadline
	 */
	public Date getDeadline()
	{
		return deadline;
	}

	/**
	 * Sets the deadline.
	 *
	 * @param deadline
	 *           the new deadline
	 */
	public void setDeadline(final Date deadline)
	{
		this.deadline = deadline;
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
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}


	/**
	 * Gets the begin date filter.
	 *
	 * @return the begin date filter
	 */
	public Date getBeginDateFilter()
	{
		return beginDateFilter;
	}


	/**
	 * Sets the begin date filter.
	 *
	 * @param beginDateFilter
	 *           the new begin date filter
	 */
	public void setBeginDateFilter(final Date beginDateFilter)
	{
		this.beginDateFilter = beginDateFilter;
	}


	/**
	 * Gets the end date filter.
	 *
	 * @return the end date filter
	 */
	public Date getEndDateFilter()
	{
		return endDateFilter;
	}


	/**
	 * Sets the end date filter.
	 *
	 * @param endDateFilter
	 *           the new end date filter
	 */
	public void setEndDateFilter(final Date endDateFilter)
	{
		this.endDateFilter = endDateFilter;
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
		if (!(obj instanceof QuotaDto))
		{
			return false;
		}
		final QuotaDto other = (QuotaDto) obj;
		if (product == null)
		{
			if (other.product != null)
			{
				return false;
			}
		}
		else if (!product.equals(other.product))
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
		return "QuotaDto [numContribuable=" + numContribuable + ", beginDateFilter=" + beginDateFilter + ", endDateFilter="
				+ endDateFilter + "]";
	}




}

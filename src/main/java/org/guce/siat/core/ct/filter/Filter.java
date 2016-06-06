package org.guce.siat.core.ct.filter;

import java.util.Date;


/**
 * The Class Filter.
 */
public class Filter
{


	/** The from date. */
	private Date fromDate;

	/** The to date. */
	private Date toDate;

	/**
	 * Gets the from date.
	 *
	 * @return the fromDate
	 */
	public Date getFromDate()
	{
		return fromDate;
	}

	/**
	 * Sets the from date.
	 *
	 * @param fromDate
	 *           the fromDate to set
	 */
	public void setFromDate(final Date fromDate)
	{
		this.fromDate = fromDate;
	}

	/**
	 * Gets the to date.
	 *
	 * @return the toDate
	 */
	public Date getToDate()
	{
		return toDate;
	}

	/**
	 * Sets the to date.
	 *
	 * @param toDate
	 *           the toDate to set
	 */
	public void setToDate(final Date toDate)
	{
		this.toDate = toDate;
	}
}

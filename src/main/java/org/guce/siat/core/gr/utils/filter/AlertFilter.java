package org.guce.siat.core.gr.utils.filter;

import java.util.Date;


/**
 * The Class AlertFilter.
 */
public class AlertFilter
{

	/** The begin date. */
	private Date beginDate;

	/** The end date. */
	private Date endDate;

	/**
	 * Instantiates a new alert filter.
	 */
	public AlertFilter()
	{
	}

	/**
	 * Gets the begin date.
	 *
	 * @return the beginDate
	 */
	public Date getBeginDate()
	{
		return beginDate;
	}

	/**
	 * Sets the begin date.
	 *
	 * @param beginDate
	 *           the beginDate to set
	 */
	public void setBeginDate(final Date beginDate)
	{
		this.beginDate = beginDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate
	 *           the endDate to set
	 */
	public void setEndDate(final Date endDate)
	{
		this.endDate = endDate;
	}

}

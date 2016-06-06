package org.guce.siat.core.ct.filter;

import org.guce.siat.common.model.Company;


/**
 * The Class PaymentFilter.
 */
public class PaymentFilter extends Filter
{

	/** The operator. */
	private Company operator;

	/** The payed. */
	private Boolean payed;


	/**
	 * Gets the payed.
	 *
	 * @return the payed
	 */
	public Boolean getPayed()
	{
		return payed;
	}

	/**
	 * Sets the payed.
	 *
	 * @param payed
	 *           the payed to set
	 */
	public void setPayed(final Boolean payed)
	{
		this.payed = payed;
	}

	/**
	 * @return the operator
	 */
	public Company getOperator()
	{
		return operator;
	}

	/**
	 * @param operator
	 *           the operator to set
	 */
	public void setOperator(final Company operator)
	{
		this.operator = operator;
	}




}

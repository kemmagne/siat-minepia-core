package org.guce.siat.core.ct.filter;

import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.Item;


 
/**
 * The Class HistoricClientFilter.
 */
public class HistoricClientFilter extends Filter
{

	/** The company. */
	private Company client;

	/** The nsh. */
	private Item nsh;

	/** The flow. */
	private Flow flow;

	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Company getClient()
	{
		return client;
	}

	/**
	 * Sets the client.
	 *
	 * @param client
	 *           the new client
	 */
	public void setClient(final Company client)
	{
		this.client = client;
	}

	/**
	 * Gets the nsh.
	 *
	 * @return the nsh
	 */
	public Item getNsh()
	{
		return nsh;
	}

	/**
	 * Sets the nsh.
	 *
	 * @param nsh
	 *           the new nsh
	 */
	public void setNsh(final Item nsh)
	{
		this.nsh = nsh;
	}

	/**
	 * Gets the flow.
	 *
	 * @return the flow
	 */
	public Flow getFlow()
	{
		return flow;
	}

	/**
	 * Sets the flow.
	 *
	 * @param flow
	 *           the new flow
	 */
	public void setFlow(final Flow flow)
	{
		this.flow = flow;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return String.format("HistoricClientFilter [client=%s, nsh=%s, flow=%s]", client, nsh, flow);
	}


}

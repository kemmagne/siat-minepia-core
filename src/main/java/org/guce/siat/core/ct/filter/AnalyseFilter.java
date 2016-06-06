package org.guce.siat.core.ct.filter;

import org.guce.siat.core.ct.model.Laboratory;


/**
 * The Class AnalyseFilter.
 */
public class AnalyseFilter extends Filter
{
	/** The laboratory. */
	private Laboratory laboratory;

	/**
	 * Gets the laboratory.
	 *
	 * @return the laboratory
	 */
	public Laboratory getLaboratory()
	{
		return laboratory;
	}

	/**
	 * Sets the laboratory.
	 *
	 * @param laboratory
	 *           the laboratory to set
	 */
	public void setLaboratory(final Laboratory laboratory)
	{
		this.laboratory = laboratory;
	}
}

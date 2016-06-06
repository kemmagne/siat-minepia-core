package org.guce.siat.core.ct.filter;

import org.guce.siat.common.utils.enums.StepCode;



/**
 * The Class InspectionDestributionFilter.
 */
public class InspectionDestribFilter extends Filter
{

	/** The step. */
	private StepCode stepCode;

	/**
	 * Gets the step code.
	 *
	 * @return the step code
	 */
	public StepCode getStepCode()
	{
		return stepCode;
	}

	/**
	 * Sets the step code.
	 *
	 * @param stepCode
	 *           the new step code
	 */
	public void setStepCode(final StepCode stepCode)
	{
		this.stepCode = stepCode;
	}
}

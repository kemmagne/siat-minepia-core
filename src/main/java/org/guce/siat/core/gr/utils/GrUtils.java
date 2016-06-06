package org.guce.siat.core.gr.utils;

import java.util.Date;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.enums.StepCode;


/**
 * The Class GrUtils.
 */
public final class GrUtils
{

	/**
	 * Instantiates a new gr utils.
	 */
	private GrUtils()
	{

	}

	/**
	 * Checks if is pending request flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @param config
	 *           the config
	 * @return the boolean
	 */

	public static Boolean isPendingRequestFlow(final ItemFlow itemFlow, final SynthesisConfig config)
	{
		final StepCode toStep = itemFlow.getFlow().getToStep().getStepCode();
		final Date created = itemFlow.getCreated();


		if ((StepCode.ST_CT_07.equals(toStep) && new Date().getTime() - created.getTime() > DateUtils.CONST_DURATION_OF_DAY//ape
				* config.getClearanceDelay())
				|| (StepCode.ST_CT_08.equals(toStep) && new Date().getTime() - created.getTime() > DateUtils.CONST_DURATION_OF_DAY//visite à quai
						* config.getClearanceDelay())
				|| (StepCode.ST_CT_09.equals(toStep) && new Date().getTime() - created.getTime() > DateUtils.CONST_DURATION_OF_DAY//ok mec
						* config.getMecDelay())
				|| (StepCode.ST_CT_21.equals(toStep) && new Date().getTime() - created.getTime() > DateUtils.CONST_DURATION_OF_DAY//ok réexamen
						* config.getRddDelay())
				|| (StepCode.ST_CT_23.equals(toStep) && new Date().getTime() - created.getTime() > DateUtils.CONST_DURATION_OF_DAY//ok rdd
						* config.getRddDelay()))
		{
			return true;

		}

		return false;
	}
}

package org.guce.siat.core.gr.service;

import java.util.List;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.core.gr.utils.DocumentInfo;
import org.guce.siat.core.gr.utils.SynthesisConfig;
import org.guce.siat.core.gr.utils.SynthesisResult;


/**
 * The Interface RiskService.
 */
public interface RiskService
{

	/**
	 * Gets the pending request count.
	 *
	 * @param importerId
	 *           the importer id
	 * @return the pending request count
	 */
	int getPendingRequestCount(Long importerId);

	/**
	 * Gets the synthesis.
	 *
	 * @param config
	 *           the config
	 * @param fileItem
	 *           the file item
	 * @return the synthesis
	 */
	SynthesisResult getSynthesis(final SynthesisConfig config, final FileItem fileItem);


	/**
	 * Gets the pending requests.
	 *
	 * @param importerId
	 *           the importer id
	 * @param config
	 *           the config
	 * @return the pending requests
	 */
	List<DocumentInfo> getPendingRequests(final Long importerId, final SynthesisConfig config);

}

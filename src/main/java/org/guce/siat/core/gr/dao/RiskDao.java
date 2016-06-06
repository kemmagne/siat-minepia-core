package org.guce.siat.core.gr.dao;

import java.util.List;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.gr.utils.SynthesisConfig;


/**
 * The Interface RiskDao.
 */
public interface RiskDao
{

	/**
	 * Gets the pending requests.
	 *
	 * @param importerId
	 *           the importer id
	 * @return the pending requests
	 */
	List<ItemFlow> getPendingRequests(final Long importerId);

	/**
	 * Gets the pending request count.
	 *
	 * @param importerId
	 *           the importer id
	 * @return the pending request count
	 */
	int getPendingRequestCount(Long importerId);

	/**
	 * Check product has alert.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	Boolean checkProductHasAlert(FileItem fileItem);

	/**
	 * Check product has target.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	Boolean checkProductHasTarget(FileItem fileItem);


	/**
	 * Check product has suspicious origins.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	Boolean checkProductHasSuspiciousOrigins(FileItem fileItem, final SynthesisConfig config);

	/**
	 * Check exporter has negative decisions.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	Boolean checkExporterHasNegativeDecisions(FileItem fileItem);

	/**
	 * Check importer has target.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	Boolean checkImporterHasTarget(FileItem fileItem);

	/**
	 * Check importer has out dated requests.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	Boolean checkImporterHasOutDatedRequests(FileItem fileItem, SynthesisConfig config);


	/**
	 * Gets the file count.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the file count
	 */
	int getFileCount(FileItem fileItem, SynthesisConfig config);

	/**
	 * Check product is tested.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	Boolean checkProductIsTested(FileItem fileItem, SynthesisConfig config);

	/**
	 * Check product quantity is small.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	Boolean checkProductQuantityIsSmall(FileItem fileItem, SynthesisConfig config);

	/**
	 * Gets the file item count.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the file item count
	 */
	Integer getFileItemCount(FileItem fileItem, final SynthesisConfig config);

	/**
	 * Calculate out dated requests.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the int
	 */
	int calculateOutDatedRequests(FileItem fileItem, SynthesisConfig config);

}

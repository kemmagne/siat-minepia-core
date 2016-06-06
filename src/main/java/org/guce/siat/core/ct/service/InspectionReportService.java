package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.InspectionReport;


/**
 * The Interface InspectionReportService.
 */
public interface InspectionReportService extends AbstractService<InspectionReport>
{
	/**
	 * Find by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the inspection report
	 */
	InspectionReport findByItemFlow(ItemFlow itemFlow);

	/**
	 * Find last inspection reports by file item.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the inspection report
	 */
	InspectionReport findLastInspectionReportsByFileItem(FileItem fileItem);
}

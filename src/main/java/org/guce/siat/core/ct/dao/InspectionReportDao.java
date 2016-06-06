package org.guce.siat.core.ct.dao;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.InspectionReport;


/**
 * The Interface InspectionReportDao.
 */
public interface InspectionReportDao extends AbstractJpaDao<InspectionReport>
{

	/**
	 * Find inspection reports by item flow list.
	 *
	 * @param itemFlows
	 *           the item flows
	 * @return the list
	 */
	List<InspectionReport> findInspectionReportsByItemFlowList(List<ItemFlow> itemFlows);

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
	InspectionReport findLastInspectionReportsByFileItem(final FileItem fileItem);

}

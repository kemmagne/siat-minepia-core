package org.guce.siat.core.gr.dao;

import java.util.List;
import java.util.Map;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemFieldValue;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.gr.model.Alert;
import org.guce.siat.core.gr.utils.filter.AlertFilter;



/**
 * The Interface AlertDao.
 */
public interface AlertDao extends AbstractJpaDao<Alert>
{

	/**
	 * Find by filter.
	 *
	 * @param filter
	 *           the filter
	 * @return the list
	 */
	List<Alert> findByFilter(AlertFilter filter);

	/**
	 * Find alert for risk managment.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemFieldValuesMap
	 *           the file item field values map
	 * @return the list
	 */
	List<Alert> findAlertForRiskManagment(FileItem fileItem, Map<String, FileItemFieldValue> fileItemFieldValuesMap);
	
	
	/**
	 * Find by organism.
	 *
	 * @param organism the organism
	 * @return the list
	 */
	List<Alert> findByOrganism(Organism organism);


}

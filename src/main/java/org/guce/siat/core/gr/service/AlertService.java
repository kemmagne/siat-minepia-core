package org.guce.siat.core.gr.service;

import java.util.List;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.gr.model.Alert;
import org.guce.siat.core.gr.utils.filter.AlertFilter;


/**
 * The Interface AlertService.
 */
public interface AlertService extends AbstractService<Alert>
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
	 * @return the list
	 */
	List<Alert> findAlertForRiskManagment(FileItem fileItem);
	
	/**
	 * Find by organism.
	 *
	 * @param organism the organism
	 * @return the list
	 */
	List<Alert> findByOrganism(Organism organism);

}

package org.guce.siat.core.gr.service;

import java.util.List;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.gr.model.Ciblage;
import org.guce.siat.core.gr.utils.filter.CiblageFilter;


/**
 * The Interface CiblageService.
 */
public interface CiblageService extends AbstractService<Ciblage>
{

	/**
	 * Find by filter.
	 *
	 * @param filter
	 *           the filter
	 * @return the list
	 */
	List<Ciblage> findByFilter(CiblageFilter filter);

	/**
	 * Find ciblagefor risk managment.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the list
	 */
	List<Ciblage> findCiblageforRiskManagment(FileItem fileItem);

	/**
	 * Find by organism.
	 *
	 * @param organism the organism
	 * @return the list
	 */
	List<Ciblage> findByOrganism(Organism organism);
}

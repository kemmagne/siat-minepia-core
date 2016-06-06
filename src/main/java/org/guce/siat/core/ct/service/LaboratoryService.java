package org.guce.siat.core.ct.service;

import java.util.List;

import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.Laboratory;




/**
 * The Interface LaboratoryService.
 */
public interface LaboratoryService extends AbstractService<Laboratory>
{
	/**
	 * Find by organism.
	 *
	 * @param organism
	 *           the organism
	 * @return the list
	 */
	List<Laboratory> findByOrganism(final Organism organism);

	/**
	 * Find by administration.
	 *
	 * @param administration
	 *           the administration
	 * @return the list
	 */
	List<Laboratory> findByAdministration(Administration administration);

}

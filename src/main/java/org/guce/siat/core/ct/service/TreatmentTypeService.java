/**
 *
 */
package org.guce.siat.core.ct.service;

import java.util.List;

import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentType;


/**
 * The Interface TreatmentTypeService.
 */
public interface TreatmentTypeService extends AbstractService<TreatmentType>
{


	/**
	 * Find by organism.
	 *
	 * @param organism
	 *           the organism
	 * @return the list
	 */
	List<TreatmentType> findByOrganism(Organism organism);
}

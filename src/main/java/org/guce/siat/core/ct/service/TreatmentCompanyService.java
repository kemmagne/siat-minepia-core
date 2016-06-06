package org.guce.siat.core.ct.service;

import java.util.List;

import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentCompany;


/**
 * The Interface TreatmentCompanyService.
 */
public interface TreatmentCompanyService extends AbstractService<TreatmentCompany>
{


	/**
	 * Find by organism.
	 *
	 * @param organsim
	 *           the organsim
	 * @return the list
	 */
	List<TreatmentCompany> findByOrganism(final Organism organsim);

	/**
	 * Find by administration.
	 *
	 * @param servicesIds the services ids
	 * @return the list
	 */
	List<TreatmentCompany> findByAdministration(List<Long> servicesIds);
}

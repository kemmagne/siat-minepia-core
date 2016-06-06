package org.guce.siat.core.ct.dao;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.ct.model.TreatmentCompany;


/**
 * The Interface TreatmentCompanyDao.
 */
public interface TreatmentCompanyDao extends AbstractJpaDao<TreatmentCompany>
{

	/**
	 * Find by organisme.
	 *
	 * @param currentOrganism
	 *           the current organism
	 * @return the list
	 */
	List<TreatmentCompany> findByOrganisme(final Organism currentOrganism);

	/**
	 * Find by administration.
	 *
	 * @param services the services
	 * @return the list
	 */
	List<TreatmentCompany> findByAdministration(List<Long> services);
}

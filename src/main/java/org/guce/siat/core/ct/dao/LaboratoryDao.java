package org.guce.siat.core.ct.dao;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.ct.model.Laboratory;


/**
 * The Interface LaboratoryDao.
 */
public interface LaboratoryDao extends AbstractJpaDao<Laboratory>
{

	/**
	 * Find by organisme.
	 *
	 * @param currentOrganism
	 *           the current organism
	 * @return the list
	 */
	List<Laboratory> findByOrganism(final Organism currentOrganism);

	/**
	 * Find by administration.
	 *
	 * @param administration
	 *           the administration
	 * @return the list
	 */
	List<Laboratory> findByAdministration(Administration administration);

}

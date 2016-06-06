/**
 *
 */
package org.guce.siat.core.ct.dao;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.ct.model.TreatmentType;


/**
 * The Interface TreatmentTypeDao.
 */
public interface TreatmentTypeDao extends AbstractJpaDao<TreatmentType>
{

	/**
	 * Find by organisme.
	 *
	 * @param currentOrganism
	 *           the current organism
	 * @return the list
	 */
	List<TreatmentType> findByOrganism(Organism currentOrganism);
}

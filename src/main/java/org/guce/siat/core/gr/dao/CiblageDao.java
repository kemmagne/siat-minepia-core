package org.guce.siat.core.gr.dao;

import java.util.List;
import java.util.Map;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemFieldValue;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.gr.model.Ciblage;
import org.guce.siat.core.gr.utils.filter.CiblageFilter;


/**
 * The Interface CiblageDao.
 */
public interface CiblageDao extends AbstractJpaDao<Ciblage>
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
	 * @param fileItemFieldValuesMap
	 *           the file item field values map
	 * @return the list
	 */
	List<Ciblage> findCiblageforRiskManagment(FileItem fileItem, Map<String, FileItemFieldValue> fileItemFieldValuesMap);
	
	/**
	 * Find by organism.
	 *
	 * @param organism the organism
	 * @return the list
	 */
	List<Ciblage> findByOrganism(Organism organism);

}

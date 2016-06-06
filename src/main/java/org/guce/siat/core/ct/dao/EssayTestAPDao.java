package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.EssayTestAP;


/**
 * The Interface EssayTestAPDao.
 */
public interface EssayTestAPDao extends AbstractJpaDao<EssayTestAP>
{

	/**
	 * Find by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the essay test ap
	 */
	EssayTestAP findByItemFlow(ItemFlow itemFlow);

}

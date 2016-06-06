/**
 *
 */
package org.guce.siat.core.ct.dao.impl;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.core.ct.dao.AnalysePartDao;
import org.guce.siat.core.ct.model.AnalysePart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class AnalysPartDaoImpl.
 */
@Repository("analysePartDao")
@Transactional(propagation = Propagation.REQUIRED)
public class AnalysPartDaoImpl extends AbstractJpaDaoImpl<AnalysePart> implements AnalysePartDao
{

	/**
	 * Instantiates a new analys part dao impl.
	 */
	public AnalysPartDaoImpl()
	{
		super();
		setClasse(AnalysePart.class);
	}
}

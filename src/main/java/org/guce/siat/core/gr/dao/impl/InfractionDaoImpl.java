package org.guce.siat.core.gr.dao.impl;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.core.ct.model.Infraction;
import org.guce.siat.core.gr.dao.InfractionDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class InfractionDaoImpl.
 */
@Repository("infractionDao")
@Transactional(propagation = Propagation.REQUIRED)
public class InfractionDaoImpl extends AbstractJpaDaoImpl<Infraction> implements InfractionDao
{

	/**
	 * Instantiates a new infraction dao impl.
	 */
	public InfractionDaoImpl()
	{
		super();
		setClasse(Infraction.class);
	}

}

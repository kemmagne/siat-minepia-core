/**
 *
 */
package org.guce.siat.core.ct.dao.impl;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.core.ct.dao.TreatmentPartDao;
import org.guce.siat.core.ct.model.TreatmentPart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TreatmentPartDaoImpl.
 */
@Repository("treatmentPartDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentPartDaoImpl extends AbstractJpaDaoImpl<TreatmentPart> implements TreatmentPartDao
{
	/**
	 * Instantiates a new analys Order dao impl.
	 */
	public TreatmentPartDaoImpl()
	{
		super();
		setClasse(TreatmentPart.class);
	}
}

package org.guce.siat.core.ct.dao.impl;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.core.ct.dao.InspectionControllerDao;
import org.guce.siat.core.ct.model.InspectionController;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class InspectionControllerDaoImpl.
 */
@Repository("inspectionControllerDao")
@Transactional(propagation = Propagation.REQUIRED)
public class InspectionControllerDaoImpl extends AbstractJpaDaoImpl<InspectionController>implements InspectionControllerDao
{

	/**
	 * Instantiates a new inspection report dao impl.
	 */
	public InspectionControllerDaoImpl()
	{
		super();
		setClasse(InspectionController.class);
	}


}

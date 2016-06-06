package org.guce.siat.core.ct.dao.impl;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.core.ct.dao.PaymentItemFlowDao;
import org.guce.siat.core.ct.model.PaymentItemFlow;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class PaymentItemFlowDaoImpl.
 */
@Repository("paymentItemFlowDaoImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class PaymentItemFlowDaoImpl extends AbstractJpaDaoImpl<PaymentItemFlow>implements PaymentItemFlowDao
{

	/**
	 * Instantiates a new payment item flow dao impl.
	 */
	public PaymentItemFlowDaoImpl()
	{
		super();
		setClasse(PaymentItemFlow.class);
	}



}

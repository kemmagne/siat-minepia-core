package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.PaymentDataDao;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PaymentItemFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class PaymentDataDaoImpl.
 */
@Repository("paymentDataDaoImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class PaymentDataDaoImpl extends AbstractJpaDaoImpl<PaymentData>implements PaymentDataDao
{


	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(PaymentDataDaoImpl.class);


	/**
	 * Instantiates a new payment data dao impl.
	 */
	public PaymentDataDaoImpl()
	{
		super();
		setClasse(PaymentData.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.dao.PaymentDataDao#findPaymentDataByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public PaymentData findPaymentDataByItemFlow(final ItemFlow itemFlow)
	{

		if (!Objects.equals(itemFlow, null))
		{
			try
			{
				final String hqlString = "SELECT p.primaryKey.paymentData FROM PaymentItemFlow p "
						+ "WHERE p.deleted=false AND p.primaryKey.itemFlow.id = :itemFlowId";
				final TypedQuery<PaymentData> query = super.entityManager.createQuery(hqlString, PaymentData.class);
				query.setParameter("itemFlowId", itemFlow.getId());

				return query.getSingleResult();

			}
			catch (NoResultException | NonUniqueResultException e)
			{
				LOG.error(Objects.toString(e));
			}

		}
		return null;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.dao.PaymentDataDao#findPaymentItemFlowByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public PaymentItemFlow findPaymentItemFlowByItemFlow(final ItemFlow itemFlow)
	{
		if (!Objects.equals(itemFlow, null))
		{
			final StringBuilder hqlBuilder = new StringBuilder();
			hqlBuilder.append("SELECT p FROM PaymentItemFlow p ");
			hqlBuilder.append("WHERE p.deleted=false AND p.primaryKey.itemFlow.id  ");
			hqlBuilder.append("=:itemFlowId AND p.primaryKey.paymentData.deleted=false");

			final TypedQuery<PaymentItemFlow> query = super.entityManager.createQuery(hqlBuilder.toString(), PaymentItemFlow.class);
			query.setParameter("itemFlowId", itemFlow.getId());
			try
			{
				return query.getSingleResult();
			}
			catch (NoResultException | NonUniqueResultException e)
			{
				LOG.error(Objects.toString(e));
			}

		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.dao.PaymentDataDao#delete(org.guce.siat.core.co.model.PaymentItemFlow)
	 */
	@Override
	public void delete(final PaymentItemFlow paymentItemFlow)
	{
		entityManager.remove(paymentItemFlow);

	}

	@Override
	public PaymentData findPaymentDataByFileItem(final FileItem fileItem)
	{

		if (!Objects.equals(fileItem, null))
		{
			try
			{
				final String hqlString = "SELECT DISTINCT p.primaryKey.paymentData FROM PaymentItemFlow p "
						+ "WHERE p.deleted=false AND p.primaryKey.itemFlow.fileItem.id = :fileItemId";
				final TypedQuery<PaymentData> query = super.entityManager.createQuery(hqlString, PaymentData.class);
				query.setParameter("fileItemId", fileItem.getId());

				return query.getSingleResult();

			}
			catch (NoResultException | NonUniqueResultException e)
			{
				LOG.error(Objects.toString(e));
			}

		}
		return null;

	}





}

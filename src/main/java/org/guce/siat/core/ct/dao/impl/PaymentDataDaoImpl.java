package org.guce.siat.core.ct.dao.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.File;
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
public class PaymentDataDaoImpl extends AbstractJpaDaoImpl<PaymentData> implements PaymentDataDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(PaymentDataDaoImpl.class);

    /**
     * Instantiates a new payment data dao impl.
     */
    public PaymentDataDaoImpl() {
        setClasse(PaymentData.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.dao.PaymentDataDao#findPaymentDataByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
   @Override
    public PaymentData findPaymentDataByItemFlow(final ItemFlow itemFlow) {

        if (!Objects.equals(itemFlow, null)) {
            try {
                final String hqlString = "SELECT p.primaryKey.paymentData FROM PaymentItemFlow p WHERE p.deleted=false AND p.primaryKey.itemFlow.id = :itemFlowId";
                final TypedQuery<PaymentData> query = super.entityManager.createQuery(hqlString, PaymentData.class);
                query.setParameter("itemFlowId", itemFlow.getId());
                query.setMaxResults(1);

                return query.getSingleResult();

            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }

        }
        return null;

    }
    
    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.dao.PaymentDataDao#findPaymentDataByItemFlowList(java.util.List)
     */
    @Override
    public PaymentData findPaymentDataByItemFlowList(final List<ItemFlow> itemFlowList) {

        if (!Objects.equals(itemFlowList, null) && CollectionUtils.isNotEmpty(itemFlowList)) {
            try {
                final List<Long> itemFlowIdList = (List<Long>) CollectionUtils.collect(itemFlowList, new Transformer() {
                    @Override
                    public Object transform(final Object itemFlow) {
                        return ((ItemFlow) itemFlow).getId();
                    }
                });
                final String hqlString = "SELECT p.primaryKey.paymentData FROM PaymentItemFlow p WHERE p.deleted=false AND p.primaryKey.itemFlow.id IN (:itemFlowIdList)";
                final TypedQuery<PaymentData> query = super.entityManager.createQuery(hqlString, PaymentData.class);
                query.setParameter("itemFlowIdList", itemFlowIdList);
                query.setMaxResults(1);

                return query.getSingleResult();

            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
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
    public PaymentItemFlow findPaymentItemFlowByItemFlow(final ItemFlow itemFlow) {
        if (!Objects.equals(itemFlow, null)) {
            final StringBuilder hqlBuilder = new StringBuilder();
            hqlBuilder.append("SELECT p FROM PaymentItemFlow p ");
            hqlBuilder.append("WHERE p.deleted=false AND p.primaryKey.itemFlow.id  ");
            hqlBuilder.append("=:itemFlowId AND p.primaryKey.paymentData.deleted=false");

            final TypedQuery<PaymentItemFlow> query = super.entityManager.createQuery(hqlBuilder.toString(), PaymentItemFlow.class);
            query.setParameter("itemFlowId", itemFlow.getId());
            try {
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
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
    public void delete(final PaymentItemFlow paymentItemFlow) {
        entityManager.remove(paymentItemFlow);

    }

    @Override
    public PaymentData findPaymentDataByFileItem(final FileItem fileItem) {

        try {

            TypedQuery<PaymentData> query = super.entityManager.createQuery("SELECT DISTINCT p.primaryKey.paymentData FROM PaymentItemFlow p WHERE p.deleted=false AND p.primaryKey.itemFlow.fileItem.id = :fileItemId", PaymentData.class);

            query.setParameter("fileItemId", fileItem.getId());

            List<PaymentData> list = query.getResultList();

            if (CollectionUtils.isEmpty(list)) {
                return null;
            }

            Collections.sort(list, new Comparator<PaymentData>() {
                @Override
                public int compare(PaymentData pd1, PaymentData pd2) {
                    return new BigDecimal(pd2.getId()).compareTo(new BigDecimal(pd1.getId()));
                }
            });

            return list.get(0);
        } catch (NoResultException | NonUniqueResultException e) {
            LOG.error(Objects.toString(e), e);
        }

        return null;
    }
    
    @Override
    public PaymentData findPaymentDataByFile(final File file) {

        try {
            Map<String, Object> params = new HashMap<>();
            StringBuilder hqlQuery = new StringBuilder();
            hqlQuery.append("SELECT DISTINCT p.primaryKey.paymentData FROM PaymentItemFlow p ");
            hqlQuery.append("join p.primaryKey.itemFlow it ");
            hqlQuery.append("join it.fileItem fi ");
            hqlQuery.append("join fi.file f ");
            hqlQuery.append("WHERE f.id = :fileId ");
            params.put("fileId", file.getId());

            TypedQuery<PaymentData> query = super.entityManager.createQuery(hqlQuery.toString(), PaymentData.class);

            for (Map.Entry<String, Object> entry : params.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }

            List<PaymentData> list = query.getResultList();

            if (CollectionUtils.isEmpty(list)) {
                return null;
            }

            return list.get(0);
        } catch (NoResultException | NonUniqueResultException e) {
            LOG.error(Objects.toString(e), e);
        }

        return null;
    }

}

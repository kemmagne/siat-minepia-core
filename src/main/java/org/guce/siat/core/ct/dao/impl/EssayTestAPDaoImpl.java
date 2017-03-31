package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.EssayTestAPDao;
import org.guce.siat.core.ct.model.EssayTestAP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class EssayTestAPDaoImpl.
 */
@Repository("essayTestAPDao")
@Transactional(propagation = Propagation.REQUIRED)
public class EssayTestAPDaoImpl extends AbstractJpaDaoImpl<EssayTestAP> implements EssayTestAPDao {

	/**
	 * The Constant LOG.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(EssayTestAPDaoImpl.class);

	/**
	 * Instantiates a new analyse type dao impl.
	 */
	public EssayTestAPDaoImpl() {
		super();
		setClasse(EssayTestAP.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.dao.EssayTestAPDao#findByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public EssayTestAP findByItemFlow(final ItemFlow itemFlow) {
		try {
			if (itemFlow != null) {
				final StringBuilder hqlBuilder = new StringBuilder();

				hqlBuilder.append("SELECT a FROM EssayTestAP a ");
				hqlBuilder.append("WHERE a.itemFlow.id= :itemFlowId ");

				final TypedQuery<EssayTestAP> query = entityManager.createQuery(hqlBuilder.toString(), EssayTestAP.class);
				query.setParameter("itemFlowId", itemFlow.getId());
				return query.getSingleResult();
			}
		} catch (NoResultException | NonUniqueResultException e) {
			LOG.error(Objects.toString(e), e);
		}

		return null;
	}

}

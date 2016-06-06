package org.guce.siat.core.gr.dao.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemFieldValue;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.core.ct.model.AnalysePart;
import org.guce.siat.core.ct.model.AnalyseResult;
import org.guce.siat.core.gr.dao.RiskDao;
import org.guce.siat.core.gr.model.Alert;
import org.guce.siat.core.gr.model.Ciblage;
import org.guce.siat.core.gr.utils.GrUtils;
import org.guce.siat.core.gr.utils.SynthesisConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class RisckDaoImpl.
 */
@Repository("risckDao")
@Transactional(propagation = Propagation.REQUIRED)
public class RiskDaoImpl implements RiskDao
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(RiskDaoImpl.class);

	/** The entity manager. */
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private FileItemDao fileItemDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#getPendingRequests(java.lang.Long)
	 */
	@Override
	public List<ItemFlow> getPendingRequests(final Long importerId)
	{
		final StringBuilder hqlString = new StringBuilder();

		hqlString.append("SELECT i FROM ItemFlow i JOIN i.fileItem.step.roleList rl ");
		hqlString.append("WHERE i.fileItem.file.client.id = :importerId ");
		hqlString.append("AND rl.role IN ('IMP') ");
		hqlString.append("AND i.fileItem.step.isFinal = false ");
		hqlString.append("AND i.id = (SELECT Max(i1.id) FROM ItemFlow i1 WHERE i1.fileItem.id = i.fileItem.id AND i1.sent = 1) ");
		hqlString.append("ORDER BY i.fileItem.file.id ASC, i.fileItem.id ASC");

		final TypedQuery<ItemFlow> query = entityManager.createQuery(hqlString.toString(), ItemFlow.class);
		query.setParameter("importerId", importerId);

		return query.getResultList();
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.RiskDao#getPendingRequestCount(java.lang.Long)
	 */
	@Override
	public int getPendingRequestCount(final Long importerId)
	{
		return getPendingRequests(importerId).size();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkProductHasAlert(org.guce.siat.core.ct.model.FileItem)
	 */
	@Override
	public Boolean checkProductHasAlert(final FileItem fileItem)
	{
		final StringBuilder hqlString = new StringBuilder();
		hqlString.append(" FROM Alert a ");
		hqlString.append("WHERE a.servicesItem.id = :servicesItemId ");
		hqlString.append("AND ");
		hqlString.append("(a.startDate <= TO_DATE(:startDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD);
		hqlString.append("') AND a.endDate >= ");
		hqlString.append(" TO_DATE(:endDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD);
		hqlString.append("')) ");

		final TypedQuery<Alert> query = entityManager.createQuery(hqlString.toString(), Alert.class);

		query.setParameter("servicesItemId", fileItem.getSubfamily().getId());
		query.setParameter("startDate", DateUtils.formatSimpleDate(new Date()));
		query.setParameter("endDate", DateUtils.formatSimpleDate(new Date()));

		return query.getResultList().size() >= Constants.ONE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkProductHasTarget(org.guce.siat.core.ct.model.FileItem)
	 */
	@Override
	public Boolean checkProductHasTarget(final FileItem fileItem)
	{

		final StringBuilder hqlString = new StringBuilder();
		hqlString.append(" FROM Ciblage c ");
		hqlString.append("WHERE c.servicesItem.id = :servicesItemId ");
		hqlString.append("AND ");
		hqlString.append("(c.startDate <= TO_DATE(:startDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD);
		hqlString.append("') AND c.endDate >= ");
		hqlString.append(" TO_DATE(:endDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD);
		hqlString.append("')) ");

		final TypedQuery<Ciblage> query = entityManager.createQuery(hqlString.toString(), Ciblage.class);

		query.setParameter("servicesItemId", fileItem.getSubfamily().getId());
		query.setParameter("startDate", DateUtils.formatSimpleDate(new Date()));
		query.setParameter("endDate", DateUtils.formatSimpleDate(new Date()));

		return query.getResultList().size() >= Constants.ONE;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkProductHasSuspiciousOrigins(org.guce.siat.common.model.FileItem,
	 * org.guce.siat.core.gr.utils.SynthesisConfig)
	 */
	@Override
	public Boolean checkProductHasSuspiciousOrigins(final FileItem fileItem, final SynthesisConfig config)
	{

		final StringBuilder hqlString = new StringBuilder();
		hqlString.append(" FROM Alert a ");
		hqlString.append("WHERE a.servicesItem.id = :servicesItemId ");
		final TypedQuery<Alert> query = entityManager.createQuery(hqlString.toString(), Alert.class);

		query.setParameter("servicesItemId", fileItem.getSubfamily().getId());

		return query.getResultList().size() >= Constants.ONE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkExporterHasNegativeDecisions(org.guce.siat.core.ct.model.FileItem)
	 */
	@Override
	public Boolean checkExporterHasNegativeDecisions(final FileItem fileItem)
	{

		final StringBuilder hqlString = new StringBuilder();
		hqlString.append("FROM ItemFlow i ");
		hqlString.append("WHERE i.fileItem.file.client.id = :clientId ");
		hqlString.append("AND i.fileItem.subfamily.id = :subfamilyId ");
		hqlString.append("AND i.flow.toStep.stepCode IN ( :stepCodes ) ");
		final TypedQuery<ItemFlow> query = entityManager.createQuery(hqlString.toString(), ItemFlow.class);

		query.setParameter("clientId", fileItem.getFile().getClient().getId());
		query.setParameter("subfamilyId", fileItem.getSubfamily().getId());

		final List<StepCode> stepCodes = new ArrayList<StepCode>();

		stepCodes.add(StepCode.ST_CT_05);//rejet
		stepCodes.add(StepCode.ST_CT_09);//régularisation
		stepCodes.add(StepCode.ST_CT_25);//RDD
		stepCodes.add(StepCode.ST_CT_26);//Fin RDD

		query.setParameter("stepCodes", stepCodes);
		return CollectionUtils.isNotEmpty(query.getResultList());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkImporterHasTarget(org.guce.siat.core.ct.model.FileItem)
	 */
	@Override
	public Boolean checkImporterHasTarget(final FileItem fileItem)
	{
		final StringBuilder hqlString = new StringBuilder();
		hqlString.append(" FROM Ciblage c ");
		hqlString.append("WHERE c.company.id = :companyId ");
		hqlString.append("AND ");
		hqlString.append("(c.startDate <= TO_DATE(:startDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD);
		hqlString.append("') AND c.endDate >= ");
		hqlString.append(" TO_DATE(:endDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD);
		hqlString.append("')) ");


		final TypedQuery<Ciblage> query = entityManager.createQuery(hqlString.toString(), Ciblage.class);
		query.setParameter("companyId", fileItem.getFile().getClient().getId());
		query.setParameter("startDate", DateUtils.formatSimpleDate(new Date()));
		query.setParameter("endDate", DateUtils.formatSimpleDate(new Date()));
		return CollectionUtils.isNotEmpty(query.getResultList());
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkImporterHasOutDatedRequests(org.guce.siat.common.model.FileItem,
	 * org.guce.siat.core.gr.utils.SynthesisConfig)
	 */
	@Override
	public Boolean checkImporterHasOutDatedRequests(final FileItem fileItem, final SynthesisConfig config)
	{

		List<ItemFlow> result = null;

		if (fileItem.getFile().getClient() != null)
		{
			result = getPendingRequests(fileItem.getFile().getClient().getId());
		}

		if (CollectionUtils.isEmpty(result))
		{
			return false;
		}

		for (final ItemFlow itemFlow : result)
		{
			if (GrUtils.isPendingRequestFlow(itemFlow, config))
			{
				return true;
			}
		}
		return false;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.RiskDao#calculateOutDatedRequests(org.guce.siat.common.model.FileItem,
	 * org.guce.siat.core.gr.utils.SynthesisConfig)
	 */
	@Override
	public int calculateOutDatedRequests(final FileItem fileItem, final SynthesisConfig config)
	{

		List<ItemFlow> result = null;
		int outDatedRequests = 0;

		if (fileItem.getFile().getClient() != null)
		{
			result = getPendingRequests(fileItem.getFile().getClient().getId());
		}

		if (CollectionUtils.isNotEmpty(result))
		{
			for (final ItemFlow itemFlow : result)
			{
				if (GrUtils.isPendingRequestFlow(itemFlow, config))
				{
					outDatedRequests++;
				}
			}
		}
		return outDatedRequests;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#getFileCount(org.guce.siat.core.ct.model.FileItem)
	 */
	@Override
	public int getFileCount(final FileItem fileItem, final SynthesisConfig config)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1 * config.getImporterKnownPeriod());

		final StringBuilder hqlString = new StringBuilder();
		hqlString.append(" FROM File fi ");
		hqlString.append("WHERE fi.client.id = :companyId ");
		hqlString.append("AND fi.createdDate >= TO_DATE(:cDate,'");
		hqlString.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
		hqlString.append("')");
		final TypedQuery<File> query = entityManager.createQuery(hqlString.toString(), File.class);
		query.setParameter("companyId", fileItem.getFile().getClient().getId());
		query.setParameter("cDate", DateUtils.formatSimpleDateForOracle(calendar.getTime()));
		return query.getResultList().size();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkProductIsTested(org.guce.siat.core.ct.model.FileItem,
	 * org.guce.siat.core.gr.utils.SynthesisConfig)
	 */
	@Override
	public Boolean checkProductIsTested(final FileItem fileItem, final SynthesisConfig config)
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1 * config.getProductTestedPeriod());

		final StringBuilder hqlBuilder = new StringBuilder();

		hqlBuilder.append("SELECT ar FROM AnalyseResult ar JOIN ar.itemFlow i  ");
		hqlBuilder.append("WHERE i.fileItem.subfamily.id = :subfamilyId ");
		hqlBuilder.append("AND i.created >= TO_DATE(:cDate,'");
		hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
		hqlBuilder.append("')");

		final TypedQuery<AnalyseResult> query = entityManager.createQuery(hqlBuilder.toString(), AnalyseResult.class);
		query.setParameter("cDate", DateUtils.formatSimpleDateForOracle(calendar.getTime()));
		query.setParameter("subfamilyId", fileItem.getSubfamily().getId());

		if (CollectionUtils.isEmpty(query.getResultList()))
		{
			return null;
		}

		else
		{
			for (final AnalyseResult analyseResult : query.getResultList())
			{
				for (final AnalysePart analysePart : (analyseResult).getAnalyseOrder().getAnalysePartsList())
				{
					if ((Boolean.FALSE).equals(analysePart.getCompliant()))
					{
						return false;
					}
				}
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#checkProductQuantityIsSmall(org.guce.siat.core.ct.model.FileItem,
	 * org.guce.siat.core.gr.utils.SynthesisConfig)
	 */
	@Override
	public Boolean checkProductQuantityIsSmall(final FileItem fileItem, final SynthesisConfig config)
	{
		try
		{
			final StringBuilder hqlString = new StringBuilder();
			hqlString.append("SELECT MAX(fiv.value) FROM ItemFlow if JOIN if.fileItem.fileItemFieldValueList fiv ");
			hqlString.append("WHERE if.fileItem.subfamily.id = :subfamilyId ");
			hqlString.append("AND if.flow.toStep.stepCode = :AMCcode ");
			hqlString.append("AND fiv.primaryKey.fileItemField.code='QUANTITE' ");

			final TypedQuery<String> query = entityManager.createQuery(hqlString.toString(), String.class);
			query.setParameter("subfamilyId", fileItem.getSubfamily() != null ? fileItem.getSubfamily().getId() : null);
			query.setParameter("AMCcode", StepCode.ST_CT_06);

			final String maxQuantityString = query.getSingleResult();
			Long maxQuantity = null;

			if (StringUtils.isEmpty(maxQuantityString))
			{
				maxQuantity = new Long(0);
			}
			else
			{
				maxQuantity = Long.parseLong(maxQuantityString);
			}
			final FileItemFieldValue fileItemFieldValue = fileItemDao.findFileItemFieldValueByFieldCode(fileItem, "QUANTITE");
			return Integer.parseInt(fileItemFieldValue != null ? fileItemFieldValue.getValue() : "0") <= ((config
					.getQuantityCoefficient()) * maxQuantity);

		}
		catch (final NoResultException | NonUniqueResultException e)
		{
			LOG.info(Objects.toString(e));
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.dao.RiskDao#getFileItemCount(org.guce.siat.core.ct.model.FileItem,
	 * org.guce.siat.core.gr.utils.SynthesisConfig)
	 */
	@Override
	public Integer getFileItemCount(final FileItem fileItem, final SynthesisConfig config)
	{

		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1 * config.getProductKnownPeriod());

		final StringBuilder hqlBuilder = new StringBuilder();
		hqlBuilder.append(" FROM FileItem fi ");
		hqlBuilder.append("WHERE fi.subfamily.id = :subfamilyId ");
		hqlBuilder.append("AND fi.file.createdDate >= TO_DATE(:cDate,'");
		hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
		hqlBuilder.append("')");

		final TypedQuery<FileItem> query = entityManager.createQuery(hqlBuilder.toString(), FileItem.class);
		query.setParameter("cDate", DateUtils.formatSimpleDateForOracle(calendar.getTime()));
		query.setParameter("subfamilyId", fileItem.getSubfamily() != null ? fileItem.getSubfamily().getId() : null);
		return query.getResultList().size();
	}
}

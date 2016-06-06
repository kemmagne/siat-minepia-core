package org.guce.siat.core.ct.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.SiatUtils;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.core.ct.dao.CommonDao;
import org.guce.siat.core.ct.filter.AnalyseFilter;
import org.guce.siat.core.ct.filter.FileItemFilter;
import org.guce.siat.core.ct.filter.Filter;
import org.guce.siat.core.ct.filter.HistoricClientFilter;
import org.guce.siat.core.ct.filter.InspectionDestribFilter;
import org.guce.siat.core.ct.filter.PaymentFilter;
import org.guce.siat.core.ct.filter.SampleFilter;
import org.guce.siat.core.ct.filter.StatisticBusinessFilter;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.Sample;
import org.guce.siat.core.ct.util.quota.QuotaDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class CommonDaoImpl.
 */
@Repository("commonDaoImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class CommonDaoImpl extends AbstractJpaDaoImpl<ItemFlow> implements CommonDao
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(CommonDaoImpl.class);

	/**
	 * Instantiates a new common dao impl.
	 */
	public CommonDaoImpl()
	{
		setClasse(ItemFlow.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#findSampleByFileItem(org.guce.siat.common.model.FileItem)
	 */
	@Override
	public Sample findSampleByFileItem(final FileItem fileItem)
	{
		try
		{
			final StringBuilder hqlBuilder = new StringBuilder();
			hqlBuilder.append("FROM Sample s ");
			hqlBuilder.append("WHERE s.fileItem.id = :fileItemId");

			final TypedQuery<Sample> query = super.entityManager.createQuery(hqlBuilder.toString(), Sample.class);
			query.setParameter("fileItemId", fileItem.getId());

			return query.getSingleResult();
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
	 * @see org.guce.siat.core.ct.dao.FileItemDao#findByFilter(org.guce.siat.core.ct.utils.fiter.FileItemFilter,
	 * org.guce.siat.common.model.Administration)
	 */
	@Override
	public List<FileItem> findByFilter(final Filter filter, final Administration administration,
			final List<FileTypeCode> fileTypeCodes)
	{
		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		hqlQuery.append("SELECT DISTINCT fi FROM FileItem fi ");
		hqlQuery.append("LEFT OUTER JOIN fi.fileItemFieldValueList fifv ");
		hqlQuery.append("LEFT OUTER JOIN fi.file.fileFieldValueList ffv ");
		hqlQuery.append("WHERE fi.file.fileType.code IN (:fileTypeCodes) ");
		params.put("fileTypeCodes", fileTypeCodes);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append(" AND fi.file.bureau IN (:bureausList)");
			params.put("bureausList", bureausList);
		}
		if (filter.getFromDate() != null && filter.getToDate() == null)
		{
			hqlQuery.append(" AND fi.file.createdDate >= TO_DATE(:createdDate,'");
			hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
			hqlQuery.append("')");
			params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
		}

		if (filter.getFromDate() == null && filter.getToDate() != null)
		{
			hqlQuery.append(" AND fi.file.createdDate < :createDate ");

			params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
		}

		if (filter.getFromDate() != null && filter.getToDate() != null)
		{
			hqlQuery.append(" AND fi.file.createdDate >= :fromDate");
			hqlQuery.append(" AND fi.file.createdDate < :toDate ");
			params.put("fromDate", filter.getFromDate());
			params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
		}
		if (filter instanceof FileItemFilter)
		{
			final FileItemFilter fileItemFilter = (FileItemFilter) filter;

			if (fileItemFilter.getStep() != null)
			{
				hqlQuery.append(" AND  fi.step.id = :stepId");
				params.put("stepId", fileItemFilter.getStep().getId());
			}

			if (fileItemFilter.getFileType() != null)
			{
				hqlQuery.append(" AND  fi.file.fileType.id = :fileTypeId");
				params.put("fileTypeId", fileItemFilter.getFileType().getId());
			}



			hqlQuery.append(advancedFileItemFilter(fileItemFilter, params));
		}
		else if (filter instanceof PaymentFilter)
		{
			final List<StepCode> stepCodes = new ArrayList<StepCode>();
			stepCodes.add(StepCode.ST_AP_64);
			stepCodes.add(StepCode.ST_CT_42);
			stepCodes.add(StepCode.ST_AP_65);
			// afficher uniquement les Dossier en attente dans l'etape PAIEMENT
			params.put("stepCodes", stepCodes);
			hqlQuery.append(" AND  fi.step.stepCode IN (:stepCodes)");

			final PaymentFilter paymentFilter = (PaymentFilter) filter;

			if (paymentFilter.getOperator() != null)
			{
				hqlQuery.append(" AND  fi.file.client.numContribuable = :numContribuable");
				params.put("numContribuable", paymentFilter.getOperator().getNumContribuable());
			}


		}
		final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

		for (final Entry<String, Object> entry : params.entrySet())
		{
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query.getResultList();

	}

	/**
	 * Advanced file item filter.
	 *
	 * @param filter
	 *           the filter
	 * @param params
	 *           the params
	 * @return the string
	 */
	private String advancedFileItemFilter(final FileItemFilter filter, final Map<String, Object> params)
	{
		final StringBuilder advacedFilterBuilder = new StringBuilder();

		if (filter.getOperator() != null)
		{
			advacedFilterBuilder.append(" AND  fi.file.client.numContribuable = :numContribuable");
			params.put("numContribuable", filter.getOperator().getNumContribuable());
		}

		if (filter.getSubfamily() != null && !filter.getSubfamily().isEmpty())
		{
			advacedFilterBuilder.append(" AND  fi.nsh.goodsItemCode = :goodsItemCode");
			params.put("goodsItemCode", filter.getSubfamily());
		}

		if (filter.getTransportType() != null)
		{
			advacedFilterBuilder
					.append(" AND  ffv.primaryKey.fileField.code ='INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_CODE' AND ffv.value=:codeModeDeTransport");
			params.put("codeModeDeTransport", filter.getTransportType().getTypeMeanTransportCode());
		}

		if (filter.getOriginCountry() != null)
		{
			advacedFilterBuilder.append(" AND  fi.file.countryOfOrigin.countryIdAlpha2 = :countryCode");
			params.put("countryCode", filter.getOriginCountry().getCountryIdAlpha2());
		}

		if (filter.getArrivalPort() != null)
		{
			advacedFilterBuilder.append(" AND  ffv.primaryKey.fileField.code ='POINT_ENTREE' AND ffv.value=:locationCode");
			params.put("locationCode", filter.getArrivalPort().getLocationCode());
		}

		if (filter.getFile() != null)
		{
			advacedFilterBuilder.append(" AND  fi.file.referenceSiat  = :referenceSiat");
			params.put("referenceSiat", filter.getFile());
		}

		if (filter.getAnalyseType() != null)
		{
			advacedFilterBuilder
					.append(" AND fi IN (SELECT DISTINCT ao.itemFlow.fileItem FROM AnalyseOrder ao LEFT OUTER JOIN ao.analysePartsList ap WHERE ap.analyseType.id = :analyseTypeId) ");
			params.put("analyseTypeId", filter.getAnalyseType().getId());
		}

		if (filter.getController() != null)
		{
			advacedFilterBuilder
					.append(" AND fi IN (SELECT DISTINCT appif.primaryKey.itemFlow.fileItem FROM Appointment app LEFT OUTER JOIN app.appointmentItemFlowList appif WHERE app.controller.id = :controllerId)");
			params.put("controllerId", filter.getController().getId());
		}

		if (filter.getLaboratory() != null)
		{
			advacedFilterBuilder
					.append(" AND fi IN (SELECT DISTINCT ao.itemFlow.fileItem FROM AnalyseOrder ao WHERE ao.laboratory.id = :laboratoryId) ");
			params.put("laboratoryId", filter.getLaboratory().getId());
		}

		return advacedFilterBuilder.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#findStatisticByFilter(org.guce.siat.core.ct.filter.Filter)
	 */
	@Override
	public List<AnalyseOrder> findStatisticByFilter(final Filter filter)
	{
		if (filter != null)
		{
			final Map<String, Object> params = new HashMap<String, Object>();
			final StringBuilder hqlQuery = new StringBuilder();

			if (filter instanceof AnalyseFilter)
			{
				final AnalyseFilter analyseFilter = (AnalyseFilter) filter;
				hqlQuery.append("SELECT DISTINCT a FROM AnalyseOrder a WHERE 1=1 ");

				if (analyseFilter.getLaboratory() != null)
				{
					hqlQuery.append(" AND a.laboratory.id = :laboratoryId");
					params.put("laboratoryId", analyseFilter.getLaboratory().getId());
				}
				if (analyseFilter.getFromDate() != null && analyseFilter.getToDate() == null)
				{
					hqlQuery.append(" AND a.date >= TO_DATE(:createdDate,'");
					hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					hqlQuery.append("')");
					params.put("createdDate", DateUtils.formatSimpleDateForOracle(analyseFilter.getFromDate()));
				}

				if (analyseFilter.getFromDate() == null && analyseFilter.getToDate() != null)
				{
					hqlQuery.append(" AND a.date <:toDate");

					params.put("toDate", DateUtils.addDays(analyseFilter.getToDate(), 1));
				}

				if (analyseFilter.getFromDate() != null && analyseFilter.getToDate() != null)
				{
					hqlQuery.append(" AND a.date >= :fromDate");

					hqlQuery.append(" AND a.date <:toDate");

					params.put("fromDate", analyseFilter.getFromDate());
					params.put("toDate", DateUtils.addDays(analyseFilter.getToDate(), 1));
				}
			}
			else if (filter instanceof SampleFilter)
			{
				final SampleFilter sampleFilter = (SampleFilter) filter;
				hqlQuery.append("SELECT DISTINCT a FROM AnalyseOrder a WHERE 1=1 ");

				if (sampleFilter.getLaboratory() != null)
				{
					hqlQuery.append(" AND a.laboratory.id = :laboratoryId");
					params.put("laboratoryId", sampleFilter.getLaboratory().getId());
				}
				if (sampleFilter.getFromDate() != null && sampleFilter.getToDate() == null)
				{
					hqlQuery.append(" AND a.date >= TO_DATE(:createdDate,'");
					hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					hqlQuery.append("')");
					params.put("createdDate", DateUtils.formatSimpleDateForOracle(sampleFilter.getFromDate()));
				}

				if (sampleFilter.getFromDate() == null && sampleFilter.getToDate() != null)
				{
					hqlQuery.append(" AND a.date <:toDate");
					params.put("toDate", DateUtils.addDays(sampleFilter.getToDate(), 1));
				}

				if (sampleFilter.getFromDate() != null && sampleFilter.getToDate() != null)
				{
					hqlQuery.append(" AND a.date >= :fromDate");
					hqlQuery.append(" AND a.date < :toDate");
					params.put("fromDate", sampleFilter.getFromDate());
					params.put("toDate", DateUtils.addDays(sampleFilter.getToDate(), 1));
				}


			}
			final TypedQuery<AnalyseOrder> query = super.entityManager.createQuery(hqlQuery.toString(), AnalyseOrder.class);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();
		}
		return Collections.emptyList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#fileItemByDesicionByFilter(org.guce.siat.core.ct.filter.Filter,
	 * java.util.List, java.util.List, java.util.List, org.guce.siat.common.model.Administration)
	 */
	@Override
	public List<FileItem> fileItemByDesicionByFilter(final Filter filter, final List<FileTypeCode> fileTypeCodes,
			final List<String> flowCodeList, final List<String> restrectionFlowCode, final Administration administration)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));
		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		hqlQuery.append("SELECT DISTINCT i.fileItem FROM ItemFlow i ");
		hqlQuery.append("WHERE i.fileItem.file.fileType.code IN (:fileTypeCodes) ");
		params.put("fileTypeCodes", fileTypeCodes);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append("AND i.fileItem.file.bureau IN (:bureausList) ");
			params.put("bureausList", bureausList);
		}

		if (filter != null)
		{
			if (filter.getFromDate() != null && filter.getToDate() == null)
			{
				hqlQuery.append(" AND i.fileItem.file.createdDate >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
			}
			if (filter.getFromDate() == null && filter.getToDate() != null)
			{
				hqlQuery.append(" AND i.fileItem.file.createdDate < :createDate ");
				params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
			}
			if (filter.getFromDate() != null && filter.getToDate() != null)
			{
				hqlQuery.append(" AND i.fileItem.file.createdDate >= :fromDate ");

				hqlQuery.append(" AND i.fileItem.file.createdDate <:toDate ");

				params.put("fromDate", filter.getFromDate());
				params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
			}
		}

		hqlQuery.append(" AND i.flow.code IN :flowCodeList ");
		params.put("flowCodeList", flowCodeList);

		if (CollectionUtils.isNotEmpty(restrectionFlowCode))
		{
			hqlQuery
					.append("AND i.fileItem NOT IN (SELECT DISTINCT it.fileItem FROM ItemFlow it WHERE it.flow.code IN (:confirmRDDCode))");
			params.put("confirmRDDCode", restrectionFlowCode);
		}

		final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

		for (final Entry<String, Object> entry : params.entrySet())
		{
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query.getResultList();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#fileItemByCompanyAndDecicionByFilter(org.guce.siat.core.ct.filter.Filter,
	 * java.util.List, org.guce.siat.common.model.Administration)
	 */
	@Override
	public List<FileItem> fileItemByCompanyAndDecicionByFilter(final Filter filter, final List<FileTypeCode> fileTypeCodes,
			final Administration administration)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		final HistoricClientFilter historicClientFilter = (HistoricClientFilter) filter;
		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
		hqlQuery.append("WHERE ");
		hqlQuery.append(" f.file.fileType.code IN (:fileTypeCodes) ");
		params.put("fileTypeCodes", fileTypeCodes);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
			params.put("bureausList", bureausList);
		}

		if (filter instanceof HistoricClientFilter)
		{
			if (historicClientFilter.getFlow() != null)
			{
				hqlQuery.append("AND f.step = :step ");
				params.put("step", historicClientFilter.getFlow().getToStep());
			}
			if (historicClientFilter.getClient() != null)
			{
				hqlQuery.append(" AND f.file.client.id = :companyId");
				params.put("companyId", historicClientFilter.getClient().getId());
			}

			if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() == null)
			{
				hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(historicClientFilter.getFromDate()));
			}

			if (historicClientFilter.getFromDate() == null && historicClientFilter.getToDate() != null)
			{
				hqlQuery.append(" AND f.file.createdDate < :createDate");
				params.put("createDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
			}

			if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() != null)
			{
				hqlQuery.append(" AND f.file.createdDate >= :fromDate");
				hqlQuery.append("  AND f.file.createdDate < :toDate");
				params.put("fromDate", historicClientFilter.getFromDate());
				params.put("toDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
			}

			final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();
		}
		return Collections.emptyList();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#fileItemByCompanyAndProductByFilter(org.guce.siat.core.ct.filter.Filter,
	 * java.util.List, org.guce.siat.common.model.Administration)
	 */
	@Override
	public List<FileItem> fileItemByCompanyAndProductByFilter(final Filter filter, final List<FileTypeCode> fileTypeCodes,
			final Administration administration)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		final HistoricClientFilter historicClientFilter = (HistoricClientFilter) filter;
		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
		hqlQuery.append("WHERE f.file.fileType.code IN (:fileTypeCodes) ");
		params.put("fileTypeCodes", fileTypeCodes);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
			params.put("bureausList", bureausList);
		}

		if (filter instanceof HistoricClientFilter)
		{
			if (historicClientFilter.getClient() != null)
			{
				hqlQuery.append(" AND f.file.client.id = :companyId");
				params.put("companyId", historicClientFilter.getClient().getId());
			}

			if (historicClientFilter.getNsh() != null)
			{
				hqlQuery.append(" AND f.nsh.goodsItemCode = :goodsItemCode");
				params.put("goodsItemCode", historicClientFilter.getNsh().getGoodsItemCode());
			}

			if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() == null)
			{
				hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(historicClientFilter.getFromDate()));
			}

			if (historicClientFilter.getFromDate() == null && historicClientFilter.getToDate() != null)
			{
				hqlQuery.append(" AND f.file.createdDate < :createDate");
				params.put("createDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
			}

			if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() != null)
			{
				hqlQuery.append(" AND f.file.createdDate >= :fromDate");
				hqlQuery.append(" AND f.file.createdDate <:toDate");
				params.put("fromDate", historicClientFilter.getFromDate());
				params.put("toDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
			}

			final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();
		}
		return Collections.emptyList();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#fileItemByInspectionDestribByFilter(org.guce.siat.core.ct.filter.Filter,
	 * java.util.List, org.guce.siat.common.model.Administration)
	 */
	@Override
	public List<FileItem> fileItemByInspectionDestribByFilter(final Filter filter, final List<FileTypeCode> fileTypeCodes,
			final Administration administration)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		final InspectionDestribFilter inspectionDestribFilter = (InspectionDestribFilter) filter;
		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		hqlQuery.append("SELECT i.fileItem FROM ItemFlow i ");
		hqlQuery
				.append("WHERE i.fileItem.file.fileType.code IN (:fileTypeCodes)  AND i.id IN (SELECT DISTINCT ins.fileItem.id FROM InspectionReport ins)");
		params.put("fileTypeCodes", fileTypeCodes);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append("AND i.fileItem.file.bureau IN (:bureausList) ");
			params.put("bureausList", bureausList);
		}

		if (filter instanceof InspectionDestribFilter)
		{
			if (inspectionDestribFilter.getFromDate() != null && inspectionDestribFilter.getToDate() == null)
			{
				hqlQuery.append(" AND i.fileItem.file.createdDate >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(inspectionDestribFilter.getFromDate()));
			}

			if (inspectionDestribFilter.getFromDate() == null && inspectionDestribFilter.getToDate() != null)
			{
				hqlQuery.append(" AND i.fileItem.file.createdDate <:createDate");
				params.put("createDate", DateUtils.addDays(inspectionDestribFilter.getToDate(), 1));
			}

			if (inspectionDestribFilter.getFromDate() != null && inspectionDestribFilter.getToDate() != null)
			{
				hqlQuery.append(" AND i.fileItem.file.createdDate >= :fromDate");
				hqlQuery.append(" AND i.fileItem.file.createdDate <:toDate");
				params.put("fromDate", inspectionDestribFilter.getFromDate());
				params.put("toDate", DateUtils.addDays(inspectionDestribFilter.getToDate(), 1));
			}

			final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();
		}
		return Collections.emptyList();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.CommonDao#serviceItemProductsQuantitiesByFilter(org.guce.siat.core.ct.filter.Filter,
	 * java.util.List, org.guce.siat.common.model.Administration)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> serviceItemProductsQuantitiesByFilter(final Filter filter, final List<Long> fileTypeIdList,
			final Administration administration)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();

		hqlQuery
				.append("SELECT (FILE_ITEM.NSH_ID) SSNH, SERVICES_ITEM.LABEL, SUM(FILE_ITEM.QUANTITY), SUM (FILE_ITEM.VALEUR_FOB) FROM FILE_ITEM ");
		hqlQuery.append("JOIN  SERVICES_ITEM ON FILE_ITEM.SUBFAMILY_ID = SERVICES_ITEM.ID LEFT ");
		hqlQuery.append("JOIN FILES ON FILE_ITEM.FILE_ID  = FILES.ID ");
		hqlQuery.append("WHERE FILES.FILE_TYPE_ID IN (:fileTypeIdList)");
		params.put("fileTypeIdList", fileTypeIdList);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append(" AND FILES.BUREAU_ID IN (:bureausList)");
			params.put("bureausList", bureausList);
		}

		if (filter != null)
		{
			if (filter.getFromDate() != null && filter.getToDate() == null)
			{
				hqlQuery.append(" AND FILES.CREATED_DATE >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
			}

			if (filter.getFromDate() == null && filter.getToDate() != null)
			{
				hqlQuery.append(" AND FILES.CREATED_DATE <:createDate");
				params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
			}

			if (filter.getFromDate() != null && filter.getToDate() != null)
			{
				hqlQuery.append(" AND FILES.CREATED_DATE >= :fromDate");
				hqlQuery.append(" AND FILES.CREATED_DATE <:toDate");
				params.put("fromDate", filter.getFromDate());
				params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
			}

			hqlQuery.append(" GROUP BY (FILE_ITEM.NSH_ID, SERVICES_ITEM.LABEL)");

			final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			final List<Object[]> list = query.getResultList();
			return list;
		}
		return Collections.emptyList();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.CommonDao#serviceItemProductsQuantitiesByDrdByFilter(org.guce.siat.core.ct.filter.Filter
	 * , java.util.List, java.util.List, org.guce.siat.common.model.Administration)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> serviceItemProductsQuantitiesByDrdByFilter(final Filter filter, final List<Long> flowIdList,
			final List<Long> fileTypeIdList, final Administration administration)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();

		hqlQuery
				.append("SELECT (FILE_ITEM.NSH_ID) SSNH, SERVICES_ITEM.LABEL, SUM(FILE_ITEM.QUANTITY), SUM (FILE_ITEM.VALEUR_FOB) FROM FILE_ITEM ");
		hqlQuery.append("JOIN  SERVICES_ITEM ON FILE_ITEM.SUBFAMILY_ID = SERVICES_ITEM.ID LEFT ");
		hqlQuery.append("JOIN FILES ON FILE_ITEM.FILE_ID  = FILES.ID ");
		hqlQuery.append("LEFT JOIN ITEM_FLOW ON ITEM_FLOW.FILE_ITEM_ID = FILE_ITEM.FILE_ID ");
		hqlQuery.append("WHERE FILES.FILE_TYPE_ID IN (:fileTypeIdList)");
		params.put("fileTypeIdList", fileTypeIdList);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append(" AND FILES.BUREAU_ID IN (:bureausList)");
			params.put("bureausList", bureausList);
		}

		if (CollectionUtils.isNotEmpty(flowIdList))
		{
			hqlQuery.append(" AND ITEM_FLOW.FLOW_ID IN (:flowIdList)");
			params.put("flowIdList", flowIdList);
		}

		if (filter != null)
		{
			if (filter.getFromDate() != null && filter.getToDate() == null)
			{
				hqlQuery.append(" AND FILES.CREATED_DATE >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
			}

			if (filter.getFromDate() == null && filter.getToDate() != null)
			{
				hqlQuery.append(" AND FILES.CREATED_DATE < :createDate");
				params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
			}

			if (filter.getFromDate() != null && filter.getToDate() != null)
			{
				hqlQuery.append(" AND FILES.CREATED_DATE >= :fromDate");
				hqlQuery.append(" AND FILES.CREATED_DATE <:toDate");
				params.put("fromDate", filter.getFromDate());
				params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
			}

			hqlQuery.append(" GROUP BY (FILE_ITEM.NSH_ID, SERVICES_ITEM.LABEL)");

			final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}

			final List<Object[]> list = query.getResultList();
			return list;
		}
		return Collections.emptyList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#findQuotsByCreteria(org.guce.siat.core.ct.util.quota.QuotaDto)
	 */
	@Override
	public List<QuotaDto> findQuotsByCreteria(final QuotaDto searchFilter)
	{
		final StringBuilder hqlBuilder = new StringBuilder();
		final Map<String, Object> params = new HashMap<String, Object>();
		hqlBuilder.append("SELECT new org.guce.siat.core.ct.util.quota.QuotaDto(f.file.client.numContribuable,f) FROM FileItem f");
		hqlBuilder
				.append(" JOIN f.itemFlowsList if WHERE  if.flow.code IN ('FL_AP_101','FL_AP_102','FL_AP_103','FL_AP_104','FL_AP_105','FL_AP_106') AND if.sent=true");
		if (StringUtils.isNotBlank(searchFilter.getNumContribuable()))
		{
			hqlBuilder.append(" AND f.file.client.numContribuable= :numContribuable");
			params.put("numContribuable", searchFilter.getNumContribuable());
		}
		if (searchFilter.getBeginDateFilter() != null)
		{
			hqlBuilder.append(" AND if.created > :beginDate");
			params.put("beginDate", searchFilter.getBeginDateFilter());
		}
		final TypedQuery<org.guce.siat.core.ct.util.quota.QuotaDto> query = entityManager.createQuery(hqlBuilder.toString(),
				org.guce.siat.core.ct.util.quota.QuotaDto.class);
		for (final Entry<String, Object> entry : params.entrySet())
		{
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#getImportedExportedQuatityByQuotaList(java.util.List)
	 */
	@Override
	public List<QuotaDto> getImportedExportedQuatityByQuotaList(final List<QuotaDto> quotaList)
	{
		final List<QuotaDto> quotaDtoList = new ArrayList<QuotaDto>();
		for (final QuotaDto quota : quotaList)
		{
			final List<FileTypeCode> imputaionList = Arrays.asList(FileTypeCode.IDE, FileTypeCode.IDI);
			final TypedQuery<String> query = entityManager.createQuery(
					"SELECT f.quantity FROM FileItem f WHERE f.nsh=:nsh AND f.file.fileType.code IN (:fileTypeList)", String.class);
			query.setParameter("nsh", quota.getProduct().getNsh());
			query.setParameter("fileTypeList", imputaionList);
			try
			{
				if (query.getSingleResult() != null)
				{
					quota.setImpExpQuantity(Integer.valueOf(query.getSingleResult()));
				}
				else
				{
					quota.setImpExpQuantity(0);
				}
			}
			catch (NonUniqueResultException | NoResultException noResultException)
			{
				LOG.info(Objects.toString(noResultException));
				quota.setImpExpQuantity(0);
			}
			quotaDtoList.add(quota);
		}
		return quotaDtoList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#getGrantedQuantityByQuotaList(java.util.List)
	 */
	@Override
	public List<QuotaDto> getGrantedQuantityByQuotaList(final List<QuotaDto> quotaList, final QuotaDto searchFilter)
	{
		final List<QuotaDto> quotaDtoList = new ArrayList<QuotaDto>();

		for (final QuotaDto quota : quotaList)
		{
			final StringBuilder hqlBuilder = new StringBuilder();
			hqlBuilder
					.append("SELECT i FROM ItemFlowData i WHERE i.itemFlow.fileItem= :fileItem AND i.itemFlow.flow.code IN('FL_AP_101','FL_AP_102','FL_AP_103','FL_AP_104','FL_AP_105','FL_AP_106')");
			final TypedQuery<ItemFlowData> query = entityManager.createQuery(hqlBuilder.toString(), ItemFlowData.class);
			query.setParameter("fileItem", quota.getProduct());
			final List<ItemFlowData> result = query.getResultList();
			final String dateValidite = ((ItemFlowData) CollectionUtils.find(result, new Predicate()
			{
				@Override
				public boolean evaluate(final Object object)
				{
					return ((ItemFlowData) object).getDataType().getLabel().equals("Date validité");
				}
			})).getValue();
			try
			{
				if (searchFilter.getEndDateFilter() != null
						&& searchFilter.getEndDateFilter().after(new SimpleDateFormat(DateUtils.FRENCH_DATE).parse(dateValidite)))
				{
					quota.setQuantity(Integer.valueOf(((ItemFlowData) CollectionUtils.find(result, new Predicate()
					{
						@Override
						public boolean evaluate(final Object object)
						{
							return ((ItemFlowData) object).getDataType().getLabel().equals("Quantité accordé");
						}
					})).getValue()));

					quota.setDeadline(new SimpleDateFormat(DateUtils.FRENCH_DATE).parse(dateValidite));
					quotaDtoList.add(quota);
				}
			}
			catch (NumberFormatException | ParseException e)
			{
				LOG.error("############# {}", e);
			}
		}
		return quotaDtoList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#fileItemByStatisticBusinessByFilter(org.guce.siat.core.ct.filter.Filter,
	 * org.guce.siat.common.model.Administration, java.util.List)
	 */
	@Override
	public List<FileItem> fileItemByStatisticBusinessByFilter(final Filter filter, final Administration administration,
			final List<FileTypeCode> fileTypeCodes)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(administration)));

		final StatisticBusinessFilter statisticBusinessFilter = (StatisticBusinessFilter) filter;
		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
		hqlQuery.append("WHERE f.file.fileType.code IN (:fileTypeCodes) ");
		params.put("fileTypeCodes", fileTypeCodes);

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
			params.put("bureausList", bureausList);
		}

		if (filter instanceof StatisticBusinessFilter)
		{
			if (statisticBusinessFilter.getClient() != null)
			{
				hqlQuery.append(" AND f.file.client.id = :companyId");
				params.put("companyId", statisticBusinessFilter.getClient().getId());
			}

			if (statisticBusinessFilter.getNsh() != null)
			{
				hqlQuery.append(" AND f.nsh.goodsItemCode = :goodsItemCode");
				params.put("goodsItemCode", statisticBusinessFilter.getNsh().getGoodsItemCode());
			}

			if (statisticBusinessFilter.getCountryOfProvenance() != null)
			{
				hqlQuery.append(" AND f.file.countryOfProvenance.id = :countryOfProvenanceId");
				params.put("countryOfProvenanceId", statisticBusinessFilter.getCountryOfProvenance().getCountryIdAlpha2());
			}

			if (statisticBusinessFilter.getCountryOfDestination() != null)
			{
				hqlQuery.append(" AND f.file.countryOfDestination.id = :countryOfDestinationId");
				params.put("countryOfDestinationId", statisticBusinessFilter.getCountryOfDestination().getCountryIdAlpha2());
			}

			if (statisticBusinessFilter.getFromDate() != null && statisticBusinessFilter.getToDate() == null)
			{
				hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
				hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
				hqlQuery.append("')");
				params.put("createdDate", DateUtils.formatSimpleDateForOracle(statisticBusinessFilter.getFromDate()));
			}

			if (statisticBusinessFilter.getFromDate() == null && statisticBusinessFilter.getToDate() != null)
			{
				hqlQuery.append(" AND f.file.createdDate <:createDate");
				params.put("createDate", DateUtils.addDays(statisticBusinessFilter.getToDate(), 1));
			}

			if (statisticBusinessFilter.getFromDate() != null && statisticBusinessFilter.getToDate() != null)
			{
				hqlQuery.append(" AND f.file.createdDate >= :fromDate");
				hqlQuery.append(" AND f.file.createdDate < :toDate");
				params.put("fromDate", statisticBusinessFilter.getFromDate());
				params.put("toDate", DateUtils.addDays(statisticBusinessFilter.getToDate(), 1));
			}

			final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();
		}
		return Collections.emptyList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#findPindingFileItem(org.guce.siat.core.ct.filter.Filter,
	 * org.guce.siat.common.model.User, java.util.List)
	 */
	@Override
	public List<FileItem> findPindingFileItem(final Filter filter, final User user)
	{
		final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<Administration>(
				Collections.singletonList(user.getAdministration())));

		final Map<String, Object> params = new HashMap<String, Object>();
		final StringBuilder hqlQuery = new StringBuilder();
		hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
		hqlQuery.append("WHERE f.step.isFinal=false ");

		if (CollectionUtils.isNotEmpty(bureausList))
		{
			hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
			params.put("bureausList", bureausList);
		}

		if (filter.getFromDate() != null && filter.getToDate() == null)
		{
			hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
			hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
			hqlQuery.append("')");
			params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
		}

		if (filter.getFromDate() == null && filter.getToDate() != null)
		{
			hqlQuery.append(" AND f.file.createdDate <:createDate");
			params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
		}

		if (filter.getFromDate() != null && filter.getToDate() != null)
		{
			hqlQuery.append(" AND f.file.createdDate >= :fromDate");
			hqlQuery.append(" AND f.file.createdDate <:toDate");

			params.put("fromDate", filter.getFromDate());
			params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
		}

		final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

		for (final Entry<String, Object> entry : params.entrySet())
		{
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query.getResultList();

	}
}

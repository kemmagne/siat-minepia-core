package org.guce.siat.core.ct.dao.impl;

import java.lang.reflect.Field;
import java.text.MessageFormat;
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
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.SiatUtils;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.core.ct.dao.CommonDao;
import org.guce.siat.core.ct.filter.AnalyseFilter;
import org.guce.siat.core.ct.filter.AssignedFileItemFilter;
import org.guce.siat.core.ct.filter.CteFilter;
import org.guce.siat.core.ct.filter.FileItemFilter;
import org.guce.siat.core.ct.filter.Filter;
import org.guce.siat.core.ct.filter.HistoricClientFilter;
import org.guce.siat.core.ct.filter.InspectionDestribFilter;
import org.guce.siat.core.ct.filter.PaymentFilter;
import org.guce.siat.core.ct.filter.SampleFilter;
import org.guce.siat.core.ct.filter.StatisticBusinessFilter;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.PottingPresent;
import org.guce.siat.core.ct.model.Sample;
import org.guce.siat.core.ct.model.UserCctExportProductType;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
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
public class CommonDaoImpl extends AbstractJpaDaoImpl<ItemFlow> implements CommonDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CommonDaoImpl.class);

    private final List<String> CTE_ADMISIBILITY_FLOW = Arrays.asList(FlowCode.FL_CT_05.name(), FlowCode.FL_CT_100.name(), FlowCode.FL_CT_95.name(), FlowCode.FL_CT_111.name());
    private final List<String> CTE_COTATION_FLOW = Arrays.asList(FlowCode.FL_CT_06.name(), FlowCode.FL_CT_103.name(), FlowCode.FL_CT_109.name());
    private final List<String> CTE_APPOINTMENT_FLOW = Arrays.asList(FlowCode.FL_CT_104.name(), FlowCode.FL_CT_105.name(), FlowCode.FL_CT_118.name());
    private final List<String> CTE_TREATMENT_FLOW = Arrays.asList(FlowCode.FL_CT_07.name(), FlowCode.FL_CT_112.name());
    private final List<String> CTE_SIGNATURE_FLOW = Arrays.asList(FlowCode.FL_CT_08.name(), FlowCode.FL_CT_117.name());
    private final List<String> CTE_CI_FLOW = Arrays.asList(FlowCode.FL_CT_02.name(), FlowCode.FL_CT_24.name(), FlowCode.FL_CT_101.name(), FlowCode.FL_CT_96.name());

    /**
     * Instantiates a new common dao impl.
     */
    public CommonDaoImpl() {
        setClasse(ItemFlow.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CommonDao#findSampleByFileItem(org.guce.siat.common.model.FileItem)
     */
    @Override
    public Sample findSampleByFileItem(final FileItem fileItem) {
        try {
            final StringBuilder hqlBuilder = new StringBuilder();
            hqlBuilder.append("FROM Sample s ");
            hqlBuilder.append("WHERE s.fileItem.id = :fileItemId");

            final TypedQuery<Sample> query = super.entityManager.createQuery(hqlBuilder.toString(), Sample.class);
            query.setParameter("fileItemId", fileItem.getId());

            return query.getSingleResult();
        } catch (final NoResultException | NonUniqueResultException e) {
            LOG.info(Objects.toString(e), e);
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
    public List<FileItem> findByFilter(final Filter filter, final Administration administration, final List<FileTypeCode> fileTypeCodes) {
        return this.findByFilter(filter, new ArrayList<>(Collections.singletonList(administration)), fileTypeCodes);
    }

    @Override
    public List<FileItem> findByFilter(final Filter filter, final List<Administration> administrations, final List<FileTypeCode> fileTypeCodes) {
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(administrations);

        hqlQuery.append("SELECT DISTINCT fi FROM FileItem fi ");
        hqlQuery.append("LEFT OUTER JOIN fi.fileItemFieldValueList fifv ");
        hqlQuery.append("LEFT OUTER JOIN fi.file.fileFieldValueList ffv ");
        hqlQuery.append("WHERE fi.file.fileType.code IN (:fileTypeCodes) ");
        params.put("fileTypeCodes", fileTypeCodes);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append(" AND fi.file.bureau IN (:bureausList)");
            params.put("bureausList", bureausList);
        }
        if (filter.getFromDate() != null && filter.getToDate() == null) {
            hqlQuery.append(" AND fi.file.createdDate >= TO_DATE(:createdDate,'");
            hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
            hqlQuery.append("')");
            params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
        }

        if (filter.getFromDate() == null && filter.getToDate() != null) {
            hqlQuery.append(" AND fi.file.createdDate < :createDate ");

            params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
        }

        if (filter.getFromDate() != null && filter.getToDate() != null) {
            hqlQuery.append(" AND fi.file.createdDate >= :fromDate");
            hqlQuery.append(" AND fi.file.createdDate < :toDate ");
            params.put("fromDate", filter.getFromDate());
            params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
        }
        if (filter instanceof AssignedFileItemFilter) {
            final List<StepCode> stepCodes = new ArrayList<>();
            final AssignedFileItemFilter assignedFileItemFilter = (AssignedFileItemFilter) filter;
            // afficher uniquement les dossiers en attente de traitement
            stepCodes.add(StepCode.ST_CT_48);
            stepCodes.add(StepCode.ST_CT_04);
            params.put("stepCodes", stepCodes);
            hqlQuery.append(" AND  fi.step.stepCode IN (:stepCodes)");
            if (assignedFileItemFilter.getFileType() != null) {
                hqlQuery.append(" AND  fi.file.fileType.id = :fileTypeId");
                params.put("fileTypeId", assignedFileItemFilter.getFileType().getId());
            }
        } else if (filter instanceof FileItemFilter) {
            final FileItemFilter fileItemFilter = (FileItemFilter) filter;

            if (fileItemFilter.getStep() != null) {
                hqlQuery.append(" AND  fi.step.id = :stepId");
                params.put("stepId", fileItemFilter.getStep().getId());
            }

            if (fileItemFilter.getFileType() != null) {
                hqlQuery.append(" AND  fi.file.fileType.id = :fileTypeId");
                params.put("fileTypeId", fileItemFilter.getFileType().getId());
            }

            hqlQuery.append(advancedFileItemFilter(fileItemFilter, params));
        } else if (filter instanceof PaymentFilter) {
            final List<StepCode> stepCodes = new ArrayList<>();
            stepCodes.add(StepCode.ST_AP_64);
            stepCodes.add(StepCode.ST_CT_42);
            stepCodes.add(StepCode.ST_AP_65);
            // afficher uniquement les Dossier en attente dans l'etape PAIEMENT
            params.put("stepCodes", stepCodes);
            hqlQuery.append(" AND  fi.step.stepCode IN (:stepCodes)");

            final PaymentFilter paymentFilter = (PaymentFilter) filter;

            if (paymentFilter.getOperator() != null) {
                hqlQuery.append(" AND  fi.file.client.numContribuable = :numContribuable");
                params.put("numContribuable", paymentFilter.getOperator().getNumContribuable());
            }

        }
        final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.getResultList();

    }

    /**
     * Advanced file item filter.
     *
     * @param filter the filter
     * @param params the params
     * @return the string
     */
    private String advancedFileItemFilter(final FileItemFilter filter, final Map<String, Object> params) {
        final StringBuilder advacedFilterBuilder = new StringBuilder();

        if (filter.getOperator() != null) {
            advacedFilterBuilder.append(" AND  fi.file.client.numContribuable = :numContribuable");
            params.put("numContribuable", filter.getOperator().getNumContribuable());
        }

        if (filter.getSubfamily() != null && !filter.getSubfamily().isEmpty()) {
            advacedFilterBuilder.append(" AND  fi.nsh.goodsItemCode = :goodsItemCode");
            params.put("goodsItemCode", filter.getSubfamily());
        }

        if (filter.getTransportType() != null) {
            advacedFilterBuilder
                    .append(" AND  ffv.primaryKey.fileField.code ='INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_CODE' AND ffv.value=:codeModeDeTransport");
            params.put("codeModeDeTransport", filter.getTransportType().getTypeMeanTransportCode());
        }

        if (filter.getOriginCountry() != null) {
            advacedFilterBuilder.append(" AND  fi.file.countryOfOrigin.countryIdAlpha2 = :countryCode");
            params.put("countryCode", filter.getOriginCountry().getCountryIdAlpha2());
        }

        if (filter.getArrivalPort() != null) {
            advacedFilterBuilder.append(" AND  ffv.primaryKey.fileField.code ='POINT_ENTREE' AND ffv.value=:locationCode");
            params.put("locationCode", filter.getArrivalPort().getLocationCode());
        }

        if (filter.getFile() != null) {
            advacedFilterBuilder.append(" AND  fi.file.referenceSiat  = :referenceSiat");
            params.put("referenceSiat", filter.getFile());
        }

        if (filter.getAnalyseType() != null) {
            advacedFilterBuilder
                    .append(" AND fi IN (SELECT DISTINCT ao.itemFlow.fileItem FROM AnalyseOrder ao LEFT OUTER JOIN ao.analysePartsList ap WHERE ap.analyseType.id = :analyseTypeId) ");
            params.put("analyseTypeId", filter.getAnalyseType().getId());
        }

        if (filter.getController() != null) {
            advacedFilterBuilder
                    .append(" AND fi IN (SELECT DISTINCT appif.primaryKey.itemFlow.fileItem FROM Appointment app LEFT OUTER JOIN app.appointmentItemFlowList appif WHERE app.controller.id = :controllerId)");
            params.put("controllerId", filter.getController().getId());
        }

        if (filter.getLaboratory() != null) {
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
    public List<AnalyseOrder> findStatisticByFilter(final Filter filter) {
        if (filter != null) {
            final Map<String, Object> params = new HashMap<>();
            final StringBuilder hqlQuery = new StringBuilder();

            if (filter instanceof AnalyseFilter) {
                final AnalyseFilter analyseFilter = (AnalyseFilter) filter;
                hqlQuery.append("SELECT DISTINCT a FROM AnalyseOrder a WHERE 1=1 ");

                if (analyseFilter.getLaboratory() != null) {
                    hqlQuery.append(" AND a.laboratory.id = :laboratoryId");
                    params.put("laboratoryId", analyseFilter.getLaboratory().getId());
                }
                if (analyseFilter.getFromDate() != null && analyseFilter.getToDate() == null) {
                    hqlQuery.append(" AND a.date >= TO_DATE(:createdDate,'");
                    hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                    hqlQuery.append("')");
                    params.put("createdDate", DateUtils.formatSimpleDateForOracle(analyseFilter.getFromDate()));
                }

                if (analyseFilter.getFromDate() == null && analyseFilter.getToDate() != null) {
                    hqlQuery.append(" AND a.date <:toDate");

                    params.put("toDate", DateUtils.addDays(analyseFilter.getToDate(), 1));
                }

                if (analyseFilter.getFromDate() != null && analyseFilter.getToDate() != null) {
                    hqlQuery.append(" AND a.date >= :fromDate");

                    hqlQuery.append(" AND a.date <:toDate");

                    params.put("fromDate", analyseFilter.getFromDate());
                    params.put("toDate", DateUtils.addDays(analyseFilter.getToDate(), 1));
                }
            } else if (filter instanceof SampleFilter) {
                final SampleFilter sampleFilter = (SampleFilter) filter;
                hqlQuery.append("SELECT DISTINCT a FROM AnalyseOrder a WHERE 1=1 ");

                if (sampleFilter.getLaboratory() != null) {
                    hqlQuery.append(" AND a.laboratory.id = :laboratoryId");
                    params.put("laboratoryId", sampleFilter.getLaboratory().getId());
                }
                if (sampleFilter.getFromDate() != null && sampleFilter.getToDate() == null) {
                    hqlQuery.append(" AND a.date >= TO_DATE(:createdDate,'");
                    hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                    hqlQuery.append("')");
                    params.put("createdDate", DateUtils.formatSimpleDateForOracle(sampleFilter.getFromDate()));
                }

                if (sampleFilter.getFromDate() == null && sampleFilter.getToDate() != null) {
                    hqlQuery.append(" AND a.date <:toDate");
                    params.put("toDate", DateUtils.addDays(sampleFilter.getToDate(), 1));
                }

                if (sampleFilter.getFromDate() != null && sampleFilter.getToDate() != null) {
                    hqlQuery.append(" AND a.date >= :fromDate");
                    hqlQuery.append(" AND a.date < :toDate");
                    params.put("fromDate", sampleFilter.getFromDate());
                    params.put("toDate", DateUtils.addDays(sampleFilter.getToDate(), 1));
                }

            }
            final TypedQuery<AnalyseOrder> query = super.entityManager.createQuery(hqlQuery.toString(), AnalyseOrder.class);

            for (final Entry<String, Object> entry : params.entrySet()) {
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
            final List<String> flowCodeList, final List<String> restrectionFlowCode, final Administration administration) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT DISTINCT i.fileItem FROM ItemFlow i ");
        hqlQuery.append("WHERE i.fileItem.file.fileType.code IN (:fileTypeCodes) ");
        params.put("fileTypeCodes", fileTypeCodes);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append("AND i.fileItem.file.bureau IN (:bureausList) ");
            params.put("bureausList", bureausList);
        }

        if (filter != null) {
            if (filter.getFromDate() != null && filter.getToDate() == null) {
                hqlQuery.append(" AND i.fileItem.file.createdDate >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
            }
            if (filter.getFromDate() == null && filter.getToDate() != null) {
                hqlQuery.append(" AND i.fileItem.file.createdDate < :createDate ");
                params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
            }
            if (filter.getFromDate() != null && filter.getToDate() != null) {
                hqlQuery.append(" AND i.fileItem.file.createdDate >= :fromDate ");

                hqlQuery.append(" AND i.fileItem.file.createdDate <:toDate ");

                params.put("fromDate", filter.getFromDate());
                params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
            }
        }

        hqlQuery.append(" AND i.flow.code IN :flowCodeList ");
        params.put("flowCodeList", flowCodeList);

        if (CollectionUtils.isNotEmpty(restrectionFlowCode)) {
            hqlQuery
                    .append("AND i.fileItem NOT IN (SELECT DISTINCT it.fileItem FROM ItemFlow it WHERE it.flow.code IN (:confirmRDDCode))");
            params.put("confirmRDDCode", restrectionFlowCode);
        }

        final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

        for (final Entry<String, Object> entry : params.entrySet()) {
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
            final Administration administration) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));

        final HistoricClientFilter historicClientFilter = (HistoricClientFilter) filter;
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
        hqlQuery.append("WHERE ");
        hqlQuery.append(" f.file.fileType.code IN (:fileTypeCodes) ");
        params.put("fileTypeCodes", fileTypeCodes);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
            params.put("bureausList", bureausList);
        }

        if (filter instanceof HistoricClientFilter) {
            if (historicClientFilter.getFlow() != null) {
                hqlQuery.append("AND f.step = :step ");
                params.put("step", historicClientFilter.getFlow().getToStep());
            }
            if (historicClientFilter.getClient() != null) {
                hqlQuery.append(" AND f.file.client.id = :companyId");
                params.put("companyId", historicClientFilter.getClient().getId());
            }

            if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() == null) {
                hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(historicClientFilter.getFromDate()));
            }

            if (historicClientFilter.getFromDate() == null && historicClientFilter.getToDate() != null) {
                hqlQuery.append(" AND f.file.createdDate < :createDate");
                params.put("createDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
            }

            if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() != null) {
                hqlQuery.append(" AND f.file.createdDate >= :fromDate");
                hqlQuery.append("  AND f.file.createdDate < :toDate");
                params.put("fromDate", historicClientFilter.getFromDate());
                params.put("toDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
            }

            final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

            for (final Entry<String, Object> entry : params.entrySet()) {
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
            final Administration administration) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));

        final HistoricClientFilter historicClientFilter = (HistoricClientFilter) filter;
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
        hqlQuery.append("WHERE f.file.fileType.code IN (:fileTypeCodes) ");
        params.put("fileTypeCodes", fileTypeCodes);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
            params.put("bureausList", bureausList);
        }

        if (filter instanceof HistoricClientFilter) {
            if (historicClientFilter.getClient() != null) {
                hqlQuery.append(" AND f.file.client.id = :companyId");
                params.put("companyId", historicClientFilter.getClient().getId());
            }

            if (historicClientFilter.getNsh() != null) {
                hqlQuery.append(" AND f.nsh.goodsItemCode = :goodsItemCode");
                params.put("goodsItemCode", historicClientFilter.getNsh().getGoodsItemCode());
            }

            if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() == null) {
                hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(historicClientFilter.getFromDate()));
            }

            if (historicClientFilter.getFromDate() == null && historicClientFilter.getToDate() != null) {
                hqlQuery.append(" AND f.file.createdDate < :createDate");
                params.put("createDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
            }

            if (historicClientFilter.getFromDate() != null && historicClientFilter.getToDate() != null) {
                hqlQuery.append(" AND f.file.createdDate >= :fromDate");
                hqlQuery.append(" AND f.file.createdDate <:toDate");
                params.put("fromDate", historicClientFilter.getFromDate());
                params.put("toDate", DateUtils.addDays(historicClientFilter.getToDate(), 1));
            }

            final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

            for (final Entry<String, Object> entry : params.entrySet()) {
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
            final Administration administration) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));

        final InspectionDestribFilter inspectionDestribFilter = (InspectionDestribFilter) filter;
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT i.fileItem FROM ItemFlow i ");
        hqlQuery
                .append("WHERE i.fileItem.file.fileType.code IN (:fileTypeCodes)  AND i.id IN (SELECT DISTINCT ins.fileItem.id FROM InspectionReport ins)");
        params.put("fileTypeCodes", fileTypeCodes);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append("AND i.fileItem.file.bureau IN (:bureausList) ");
            params.put("bureausList", bureausList);
        }

        if (filter instanceof InspectionDestribFilter) {
            if (inspectionDestribFilter.getFromDate() != null && inspectionDestribFilter.getToDate() == null) {
                hqlQuery.append(" AND i.fileItem.file.createdDate >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(inspectionDestribFilter.getFromDate()));
            }

            if (inspectionDestribFilter.getFromDate() == null && inspectionDestribFilter.getToDate() != null) {
                hqlQuery.append(" AND i.fileItem.file.createdDate <:createDate");
                params.put("createDate", DateUtils.addDays(inspectionDestribFilter.getToDate(), 1));
            }

            if (inspectionDestribFilter.getFromDate() != null && inspectionDestribFilter.getToDate() != null) {
                hqlQuery.append(" AND i.fileItem.file.createdDate >= :fromDate");
                hqlQuery.append(" AND i.fileItem.file.createdDate <:toDate");
                params.put("fromDate", inspectionDestribFilter.getFromDate());
                params.put("toDate", DateUtils.addDays(inspectionDestribFilter.getToDate(), 1));
            }

            final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

            for (final Entry<String, Object> entry : params.entrySet()) {
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
            final Administration administration) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));

        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();

        hqlQuery
                .append("SELECT (FILE_ITEM.NSH_ID) SSNH, SERVICES_ITEM.LABEL, SUM(FILE_ITEM.QUANTITY), SUM (FILE_ITEM.VALEUR_FOB) FROM FILE_ITEM ");
        hqlQuery.append("JOIN  SERVICES_ITEM ON FILE_ITEM.SUBFAMILY_ID = SERVICES_ITEM.ID LEFT ");
        hqlQuery.append("JOIN FILES ON FILE_ITEM.FILE_ID  = FILES.ID ");
        hqlQuery.append("WHERE FILES.FILE_TYPE_ID IN (:fileTypeIdList)");
        params.put("fileTypeIdList", fileTypeIdList);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append(" AND FILES.BUREAU_ID IN (:bureausList)");
            params.put("bureausList", bureausList);
        }

        if (filter != null) {
            if (filter.getFromDate() != null && filter.getToDate() == null) {
                hqlQuery.append(" AND FILES.CREATED_DATE >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
            }

            if (filter.getFromDate() == null && filter.getToDate() != null) {
                hqlQuery.append(" AND FILES.CREATED_DATE <:createDate");
                params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
            }

            if (filter.getFromDate() != null && filter.getToDate() != null) {
                hqlQuery.append(" AND FILES.CREATED_DATE >= :fromDate");
                hqlQuery.append(" AND FILES.CREATED_DATE <:toDate");
                params.put("fromDate", filter.getFromDate());
                params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
            }

            hqlQuery.append(" GROUP BY (FILE_ITEM.NSH_ID, SERVICES_ITEM.LABEL)");

            final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

            for (final Entry<String, Object> entry : params.entrySet()) {
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
            final List<Long> fileTypeIdList, final Administration administration) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));

        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();

        hqlQuery
                .append("SELECT (FILE_ITEM.NSH_ID) SSNH, SERVICES_ITEM.LABEL, SUM(FILE_ITEM.QUANTITY), SUM (FILE_ITEM.VALEUR_FOB) FROM FILE_ITEM ");
        hqlQuery.append("JOIN  SERVICES_ITEM ON FILE_ITEM.SUBFAMILY_ID = SERVICES_ITEM.ID LEFT ");
        hqlQuery.append("JOIN FILES ON FILE_ITEM.FILE_ID  = FILES.ID ");
        hqlQuery.append("LEFT JOIN ITEM_FLOW ON ITEM_FLOW.FILE_ITEM_ID = FILE_ITEM.FILE_ID ");
        hqlQuery.append("WHERE FILES.FILE_TYPE_ID IN (:fileTypeIdList)");
        params.put("fileTypeIdList", fileTypeIdList);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append(" AND FILES.BUREAU_ID IN (:bureausList)");
            params.put("bureausList", bureausList);
        }

        if (CollectionUtils.isNotEmpty(flowIdList)) {
            hqlQuery.append(" AND ITEM_FLOW.FLOW_ID IN (:flowIdList)");
            params.put("flowIdList", flowIdList);
        }

        if (filter != null) {
            if (filter.getFromDate() != null && filter.getToDate() == null) {
                hqlQuery.append(" AND FILES.CREATED_DATE >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
            }

            if (filter.getFromDate() == null && filter.getToDate() != null) {
                hqlQuery.append(" AND FILES.CREATED_DATE < :createDate");
                params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
            }

            if (filter.getFromDate() != null && filter.getToDate() != null) {
                hqlQuery.append(" AND FILES.CREATED_DATE >= :fromDate");
                hqlQuery.append(" AND FILES.CREATED_DATE <:toDate");
                params.put("fromDate", filter.getFromDate());
                params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
            }

            hqlQuery.append(" GROUP BY (FILE_ITEM.NSH_ID, SERVICES_ITEM.LABEL)");

            final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

            for (final Entry<String, Object> entry : params.entrySet()) {
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
    public List<QuotaDto> findQuotsByCreteria(final QuotaDto searchFilter) {
        final StringBuilder hqlBuilder = new StringBuilder();
        final Map<String, Object> params = new HashMap<>();
        hqlBuilder.append("SELECT new org.guce.siat.core.ct.util.quota.QuotaDto(f.file.client.numContribuable,f) FROM FileItem f");
        hqlBuilder
                .append(" JOIN f.itemFlowsList if WHERE  if.flow.code IN ('FL_AP_101','FL_AP_102','FL_AP_103','FL_AP_104','FL_AP_105','FL_AP_106') AND if.sent=true");
        if (StringUtils.isNotBlank(searchFilter.getNumContribuable())) {
            hqlBuilder.append(" AND f.file.client.numContribuable= :numContribuable");
            params.put("numContribuable", searchFilter.getNumContribuable());
        }
        if (searchFilter.getBeginDateFilter() != null) {
            hqlBuilder.append(" AND if.created > :beginDate");
            params.put("beginDate", searchFilter.getBeginDateFilter());
        }
        final TypedQuery<org.guce.siat.core.ct.util.quota.QuotaDto> query = entityManager.createQuery(hqlBuilder.toString(),
                org.guce.siat.core.ct.util.quota.QuotaDto.class);
        for (final Entry<String, Object> entry : params.entrySet()) {
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
    public List<QuotaDto> getImportedExportedQuatityByQuotaList(final List<QuotaDto> quotaList) {
        final List<QuotaDto> quotaDtoList = new ArrayList<>();
        for (final QuotaDto quota : quotaList) {
            final List<FileTypeCode> imputaionList = Arrays.asList(FileTypeCode.IDE, FileTypeCode.IDI);
            final TypedQuery<String> query = entityManager.createQuery(
                    "SELECT f.quantity FROM FileItem f WHERE f.nsh=:nsh AND f.file.fileType.code IN (:fileTypeList)", String.class);
            query.setParameter("nsh", quota.getProduct().getNsh());
            query.setParameter("fileTypeList", imputaionList);
            try {
                if (query.getSingleResult() != null) {
                    quota.setImpExpQuantity(Integer.valueOf(query.getSingleResult()));
                } else {
                    quota.setImpExpQuantity(0);
                }
            } catch (NonUniqueResultException | NoResultException noResultException) {
                LOG.info(Objects.toString(noResultException), noResultException);
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
    public List<QuotaDto> getGrantedQuantityByQuotaList(final List<QuotaDto> quotaList, final QuotaDto searchFilter) {
        final List<QuotaDto> quotaDtoList = new ArrayList<>();

        for (final QuotaDto quota : quotaList) {
            final StringBuilder hqlBuilder = new StringBuilder();
            hqlBuilder
                    .append("SELECT i FROM ItemFlowData i WHERE i.itemFlow.fileItem= :fileItem AND i.itemFlow.flow.code IN('FL_AP_101','FL_AP_102','FL_AP_103','FL_AP_104','FL_AP_105','FL_AP_106')");
            final TypedQuery<ItemFlowData> query = entityManager.createQuery(hqlBuilder.toString(), ItemFlowData.class);
            query.setParameter("fileItem", quota.getProduct());
            final List<ItemFlowData> result = query.getResultList();
            final String dateValidite = ((ItemFlowData) CollectionUtils.find(result, new Predicate() {
                @Override
                public boolean evaluate(final Object object) {
                    return ((ItemFlowData) object).getDataType().getLabel().equals("Date validité");
                }
            })).getValue();
            try {
                if (searchFilter.getEndDateFilter() != null
                        && searchFilter.getEndDateFilter().after(new SimpleDateFormat(DateUtils.FRENCH_DATE).parse(dateValidite))) {
                    quota.setQuantity(Integer.valueOf(((ItemFlowData) CollectionUtils.find(result, new Predicate() {
                        @Override
                        public boolean evaluate(final Object object) {
                            return ((ItemFlowData) object).getDataType().getLabel().equals("Quantité accordé");
                        }
                    })).getValue()));

                    quota.setDeadline(new SimpleDateFormat(DateUtils.FRENCH_DATE).parse(dateValidite));
                    quotaDtoList.add(quota);
                }
            } catch (NumberFormatException | ParseException e) {
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
            final List<FileTypeCode> fileTypeCodes) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(administration)));

        final StatisticBusinessFilter statisticBusinessFilter = (StatisticBusinessFilter) filter;
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
        hqlQuery.append("WHERE f.file.fileType.code IN (:fileTypeCodes) ");
        params.put("fileTypeCodes", fileTypeCodes);

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
            params.put("bureausList", bureausList);
        }

        if (filter instanceof StatisticBusinessFilter) {
            if (statisticBusinessFilter.getClient() != null) {
                hqlQuery.append(" AND f.file.client.id = :companyId");
                params.put("companyId", statisticBusinessFilter.getClient().getId());
            }

            if (statisticBusinessFilter.getNsh() != null) {
                hqlQuery.append(" AND f.nsh.goodsItemCode = :goodsItemCode");
                params.put("goodsItemCode", statisticBusinessFilter.getNsh().getGoodsItemCode());
            }

            if (statisticBusinessFilter.getCountryOfProvenance() != null) {
                hqlQuery.append(" AND f.file.countryOfProvenance.id = :countryOfProvenanceId");
                params.put("countryOfProvenanceId", statisticBusinessFilter.getCountryOfProvenance().getCountryIdAlpha2());
            }

            if (statisticBusinessFilter.getCountryOfDestination() != null) {
                hqlQuery.append(" AND f.file.countryOfDestination.id = :countryOfDestinationId");
                params.put("countryOfDestinationId", statisticBusinessFilter.getCountryOfDestination().getCountryIdAlpha2());
            }

            if (statisticBusinessFilter.getFromDate() != null && statisticBusinessFilter.getToDate() == null) {
                hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
                hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
                hqlQuery.append("')");
                params.put("createdDate", DateUtils.formatSimpleDateForOracle(statisticBusinessFilter.getFromDate()));
            }

            if (statisticBusinessFilter.getFromDate() == null && statisticBusinessFilter.getToDate() != null) {
                hqlQuery.append(" AND f.file.createdDate <:createDate");
                params.put("createDate", DateUtils.addDays(statisticBusinessFilter.getToDate(), 1));
            }

            if (statisticBusinessFilter.getFromDate() != null && statisticBusinessFilter.getToDate() != null) {
                hqlQuery.append(" AND f.file.createdDate >= :fromDate");
                hqlQuery.append(" AND f.file.createdDate < :toDate");
                params.put("fromDate", statisticBusinessFilter.getFromDate());
                params.put("toDate", DateUtils.addDays(statisticBusinessFilter.getToDate(), 1));
            }

            final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

            for (final Entry<String, Object> entry : params.entrySet()) {
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
    public List<FileItem> findPindingFileItem(final Filter filter, final User user) {
        final List<Bureau> bureausList = SiatUtils.findCombinedBureausByAdministrationList(new ArrayList<>(
                Collections.singletonList(user.getAdministration())));

        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT DISTINCT f FROM FileItem f ");
        hqlQuery.append("WHERE f.step.isFinal=false ");

        if (CollectionUtils.isNotEmpty(bureausList)) {
            hqlQuery.append("AND f.file.bureau IN (:bureausList) ");
            params.put("bureausList", bureausList);
        }

        if (filter.getFromDate() != null && filter.getToDate() == null) {
            hqlQuery.append(" AND f.file.createdDate >= TO_DATE(:createdDate,'");
            hqlQuery.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
            hqlQuery.append("')");
            params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getFromDate()));
        }

        if (filter.getFromDate() == null && filter.getToDate() != null) {
            hqlQuery.append(" AND f.file.createdDate <:createDate");
            params.put("createDate", DateUtils.addDays(filter.getToDate(), 1));
        }

        if (filter.getFromDate() != null && filter.getToDate() != null) {
            hqlQuery.append(" AND f.file.createdDate >= :fromDate");
            hqlQuery.append(" AND f.file.createdDate <:toDate");

            params.put("fromDate", filter.getFromDate());
            params.put("toDate", DateUtils.addDays(filter.getToDate(), 1));
        }

        final TypedQuery<FileItem> query = super.entityManager.createQuery(hqlQuery.toString(), FileItem.class);

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.getResultList();

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getExportNshDestination(CteFilter filter, List<Long> fileTypeIdList) {
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();

        hqlQuery
                .append("SELECT fi.NSH_ID, f.COUNTRY_OF_DESTINATION, f.TYPE_PRODUIT_NOM, fi.GOODS_ITEM_DESC, SUM(fi.NOMBRE_GRUMES) NOMBRE_GRUMES, SUM(fi.NOMBRE_SACS) NOMBRE_SACS, SUM(fi.VOLUME) VOLUME, SUM(fi.POIDS_BRUT) POIDS_BRUT, SUM(fi.POIDS_NET) POIDS_NET, c.COUNTRY_NAME_FR LIBELLE_PAYS_DESTINATION, f.COUNTRY_OF_ORIGIN, c1.COUNTRY_NAME_FR LIBELLE_PAYS_ORIGIN, f.CODE_BUREAU, f.NOM_BUREAU ");
        hqlQuery.append("FROM MINADER_FILE_ITEM fi JOIN MINADER_FILES f ON fi.FILE_ID = f.ID JOIN REP_COUNTRY c ON f.COUNTRY_OF_DESTINATION = c.COUNTRY_ID_ALPHA2");
        hqlQuery.append(" JOIN REP_COUNTRY c1 ON f.COUNTRY_OF_ORIGIN = c1.COUNTRY_ID_ALPHA2 ");
        hqlQuery.append(" WHERE f.FILE_TYPE_ID = 33 AND f.SIGNATURE_DATE IS NOT NULL AND f.SIGNATURE_DATE BETWEEN TO_DATE(:dateDebut,'yyyy-MM-dd') AND TO_DATE(:dateFin,'yyyy-MM-dd') ");

        if (filter.getOperationType() != null && filter.getOperationType().length > 0) {
            hqlQuery.append(" AND f.TYPE_OPERATION IN (:operationType)");
            params.put("operationType", Arrays.asList(filter.getOperationType()));
        }
        if (filter.getProductNatureList() != null && filter.getProductNatureList().length > 0) {
            hqlQuery.append(" AND f.TYPE_PRODUIT_CODE IN (:productType)");
            params.put("productType", Arrays.asList(filter.getProductNatureList()));
        }

        if (filter.getOfficeCodeList() != null && filter.getOfficeCodeList().length > 0) {
            hqlQuery.append(" AND f.BUREAU_ID  IN (:officeCode)");
            params.put("officeCode", Arrays.asList(filter.getOfficeCodeList()));
        }

        hqlQuery.append(" GROUP BY fi.NSH_ID, f.COUNTRY_OF_DESTINATION, f.TYPE_PRODUIT_NOM, fi.GOODS_ITEM_DESC, c.COUNTRY_NAME_FR,f.COUNTRY_OF_ORIGIN, c1.COUNTRY_NAME_FR, f.CODE_BUREAU, f.NOM_BUREAU ");
//		params.put("fileTypeIdList", fileTypeIdList);
        params.put("dateDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationFromDate()));
        params.put("dateFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationToDate()));

        final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }

        final List<Object[]> list = query.getResultList();
        return list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getExportNshDestinationSender(CteFilter filter, List<Long> fileTypeIdList) {
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();

        hqlQuery
                .append("SELECT fi.NSH_ID, f.COUNTRY_OF_DESTINATION, f.TYPE_PRODUIT_NOM, fi.GOODS_ITEM_DESC, SUM(fi.NOMBRE_GRUMES) NOMBRE_GRUMES, SUM(fi.NOMBRE_SACS) NOMBRE_SACS, SUM(fi.VOLUME) VOLUME, SUM(fi.POIDS_BRUT) POIDS_BRUT, SUM(fi.POIDS_NET) POIDS_NET, c.COUNTRY_NAME_FR LIBELLE_PAYS_DESTINATION, f.COUNTRY_OF_ORIGIN, c1.COUNTRY_NAME_FR LIBELLE_PAYS_ORIGIN, f.CODE_BUREAU, f.NOM_BUREAU ");
        hqlQuery.append(", co.NUM_CONTRIBUABLE,co.COMPANY_NAME FROM MINADER_FILE_ITEM fi JOIN MINADER_FILES f ON fi.FILE_ID = f.ID JOIN COMPANY co ON f.CLIENT_ID = co.ID JOIN REP_COUNTRY c ON f.COUNTRY_OF_DESTINATION = c.COUNTRY_ID_ALPHA2");
        hqlQuery.append(" JOIN REP_COUNTRY c1 ON f.COUNTRY_OF_ORIGIN = c1.COUNTRY_ID_ALPHA2 ");
        hqlQuery.append(" WHERE f.FILE_TYPE_ID = 33 AND f.SIGNATURE_DATE IS NOT NULL AND f.SIGNATURE_DATE BETWEEN TO_DATE(:dateDebut,'yyyy-MM-dd') AND TO_DATE(:dateFin,'yyyy-MM-dd') ");

        if (filter.getOperationType() != null && filter.getOperationType().length > 0) {
            hqlQuery.append(" AND f.TYPE_OPERATION IN (:operationType)");
            params.put("operationType", Arrays.asList(filter.getOperationType()));
        }
        if (filter.getProductNatureList() != null && filter.getProductNatureList().length > 0) {
            hqlQuery.append(" AND f.TYPE_PRODUIT_CODE IN (:productType)");
            params.put("productType", Arrays.asList(filter.getProductNatureList()));
        }

        if (filter.getClientNiu() != null && !filter.getClientNiu().isEmpty()) {
            hqlQuery.append(" AND co.NUM_CONTRIBUABLE =:numContribuable ");
            params.put("numContribuable", filter.getClientNiu());
        }

        if (filter.getOfficeCodeList() != null && filter.getOfficeCodeList().length > 0) {
            hqlQuery.append(" AND f.BUREAU_ID  IN (:officeCode)");
            params.put("officeCode", Arrays.asList(filter.getOfficeCodeList()));
        }

        hqlQuery.append(" GROUP BY fi.NSH_ID, f.COUNTRY_OF_DESTINATION, f.TYPE_PRODUIT_NOM, fi.GOODS_ITEM_DESC, c.COUNTRY_NAME_FR,f.COUNTRY_OF_ORIGIN, c1.COUNTRY_NAME_FR, f.CODE_BUREAU, f.NOM_BUREAU, co.NUM_CONTRIBUABLE,co.COMPANY_NAME");
        params.put("dateDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationFromDate()));
        params.put("dateFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationToDate()));

        final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }

        final List<Object[]> list = query.getResultList();
        return list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getDelayListingStakeholder(CteFilter filter, List<Long> fileTypeIdList) {
        final Map<String, Object> params = new HashMap<>();
        StringBuilder hqlQuery = new StringBuilder();

        StringBuilder commomFrom = new StringBuilder(" FROM MINADER_FILES f JOIN COMPANY c ON c.ID = f.CLIENT_ID JOIN FILE_ITEM fi ON fi.FILE_ID = (SELECT MAX(FILE_ID) FROM FILE_ITEM WHERE FILE_ID = f.ID) LEFT JOIN REP_COUNTRY ctr ON ctr.COUNTRY_ID_ALPHA2 = f.COUNTRY_OF_DESTINATION JOIN FILES_PROCESSING proc ON (proc.FILE_ITEM_ID = fi.ID AND proc.FLOW_CODE IN (:%s)) JOIN USERS agent ON agent.ID = proc.SENDER_ID WHERE f.CREATED_DATE BETWEEN TO_DATE(:dateCreationDebut,'yyyy-MM-dd') AND TO_DATE(:dateCreationFin,'yyyy-MM-dd') ");
        String groupByCountCi = " GROUP BY NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME, f.TYPE_PRODUIT_NOM,ctr.COUNTRY_NAME,f.COUNTRY_OF_DESTINATION";

        if (filter.getOperationType() != null && filter.getOperationType().length > 0) {
            commomFrom.append(" AND f.TYPE_OPERATION IN (:operationType)");
            params.put("operationType", Arrays.asList(filter.getOperationType()));
        }
        if (filter.getProductNatureList() != null && filter.getProductNatureList().length > 0) {
            commomFrom.append(" AND f.TYPE_PRODUIT_CODE IN (:productType)");
            params.put("productType", Arrays.asList(filter.getProductNatureList()));
        }
        if (filter.getClientNiu() != null && !filter.getClientNiu().isEmpty()) {
            commomFrom.append(" AND c.NUM_CONTRIBUABLE =:numContribuable ");
            params.put("numContribuable", filter.getClientNiu());
        }

        if (filter.getOfficeCodeList() != null && filter.getOfficeCodeList().length > 0) {
            commomFrom.append(" AND f.BUREAU_ID  IN (:officeCode)");
            params.put("officeCode", Arrays.asList(filter.getOfficeCodeList()));
        }
        commomFrom.append(" AND f.FILE_TYPE_ID  IN (:fileTypeIdList)");
        if (filter.getProcessCodeList() != null && filter.getProcessCodeList().length > 0) {
            params.put("fileTypeIdList", Arrays.asList(filter.getProcessCodeList()));
        } else {
            params.put("fileTypeIdList", fileTypeIdList);
        }
        if (filter.getValidationFromDate() != null && filter.getValidationToDate() != null) {
            commomFrom.append(" AND (f.SIGNATURE_DATE BETWEEN TO_DATE(:dateFinDebut,'yyyy-MM-dd') AND TO_DATE(:dateFinFin,'yyyy-MM-dd') OR f.DATE_REJET BETWEEN TO_DATE(:dateFinDebut,'yyyy-MM-dd') AND TO_DATE(:dateFinFin,'yyyy-MM-dd'))");
            params.put("dateFinDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationFromDate()));
            params.put("dateFinFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationToDate()));
        }

        params.put("dateCreationDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getCreationFromDate()));
        params.put("dateCreationFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getCreationToDate()));

        StringBuilder selectAdmisibility = new StringBuilder("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME RAISON_SOCIALE, f.TYPE_PRODUIT_NOM, CASE WHEN ctr.COUNTRY_NAME IS NULL THEN f.COUNTRY_OF_DESTINATION ELSE ctr.COUNTRY_NAME END PAYS_DESTINATION, FIRST_VALUE(agent.FIRST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) || ' ' || FIRST_VALUE(agent.LAST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) AGENT_RECEVABILITE, INTERVAL_DAY_TO_SEC(proc.DATE_FIN - proc.DATE_DEBUT) DELAI_RECEVABILITE, '' AGENT_COTATION, 0 DELAI_COTATION, '' AGENT_TRAITEMENT, 0 DELAI_CONFIRMATION_RDV, 0 DELAI_TRAITEMENT, '' SIGNATAIRE, 0 DELAI_SIGNATURE, 0 DELAI_REPONSE_CI, 0 NOMBRE_CI ");
        StringBuilder selectcotation = new StringBuilder("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME RAISON_SOCIALE, f.TYPE_PRODUIT_NOM,CASE WHEN ctr.COUNTRY_NAME IS NULL THEN f.COUNTRY_OF_DESTINATION ELSE ctr.COUNTRY_NAME END PAYS_DESTINATION,'' AGENT_RECEVABILITE, 0 DELAI_RECEVABILITE,FIRST_VALUE(agent.FIRST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) || ' ' || FIRST_VALUE(agent.LAST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) AGENT_COTATION, INTERVAL_DAY_TO_SEC(proc.DATE_FIN - proc.DATE_DEBUT) DELAI_COTATION,'' AGENT_TRAITEMENT, 0 DELAI_CONFIRMATION_RDV, 0 DELAI_TRAITEMENT, '' SIGNATAIRE, 0 DELAI_SIGNATURE, 0 DELAI_REPONSE_CI, 0 NOMBRE_CI ");
        StringBuilder selectApointment = new StringBuilder("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME RAISON_SOCIALE, f.TYPE_PRODUIT_NOM,CASE WHEN ctr.COUNTRY_NAME IS NULL THEN f.COUNTRY_OF_DESTINATION ELSE ctr.COUNTRY_NAME END PAYS_DESTINATION,'' AGENT_RECEVABILITE, 0 DELAI_RECEVABILITE,'' AGENT_COTATION, 0 DELAI_COTATION,FIRST_VALUE(agent.FIRST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) || ' ' || FIRST_VALUE(agent.LAST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) AGENT_TRAITEMENT, INTERVAL_DAY_TO_SEC(proc.DATE_FIN - proc.DATE_DEBUT) DELAI_CONFIRMATION_RDV, 0 DELAI_TRAITEMENT, '' IGNATAIRE, 0 DELAI_SIGNATURE, 0 DELAI_REPONSE_CI, 0 NOMBRE_CI");
        StringBuilder selectTreatment = new StringBuilder("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME RAISON_SOCIALE, f.TYPE_PRODUIT_NOM,CASE WHEN ctr.COUNTRY_NAME IS NULL THEN f.COUNTRY_OF_DESTINATION ELSE ctr.COUNTRY_NAME END PAYS_DESTINATION,'' AGENT_RECEVABILITE, 0 DELAI_RECEVABILITE,'' AGENT_COTATION, 0 DELAI_COTATION, FIRST_VALUE(agent.FIRST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) || ' ' || FIRST_VALUE(agent.LAST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) AGENT_TRAITEMENT,0 DELAI_CONFIRMATION_RDV,INTERVAL_DAY_TO_SEC(proc.DATE_FIN - proc.DATE_DEBUT) DELAI_TRAITEMENT,'' SIGNATAIRE, 0 DELAI_SIGNATURE, 0 DELAI_REPONSE_CI, 0 NOMBRE_CI");
        StringBuilder selectSignature = new StringBuilder("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME RAISON_SOCIALE, f.TYPE_PRODUIT_NOM, CASE WHEN ctr.COUNTRY_NAME IS NULL THEN f.COUNTRY_OF_DESTINATION ELSE ctr.COUNTRY_NAME END PAYS_DESTINATION, '' AGENT_RECEVABILITE, 0 DELAI_RECEVABILITE,'' AGENT_COTATION, 0 DELAI_COTATION,'' AGENT_TRAITEMENT, 0 DELAI_CONFIRMATION_RDV, 0 DELAI_TRAITEMENT,FIRST_VALUE(agent.FIRST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) || ' ' ||FIRST_VALUE(agent.LAST_NAME) IGNORE NULLS OVER (PARTITION BY proc.FILE_ITEM_ID ORDER BY proc.CREATED DESC) SIGNATAIRE, INTERVAL_DAY_TO_SEC(proc.DATE_FIN - proc.DATE_DEBUT) DELAI_SIGNATURE, 0 DELAI_REPONSE_CI, 0 NOMBRE_CI");
        StringBuilder selectCountCi = new StringBuilder("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, c.NUM_CONTRIBUABLE, c.COMPANY_NAME RAISON_SOCIALE, f.TYPE_PRODUIT_NOM,CASE WHEN ctr.COUNTRY_NAME IS NULL THEN f.COUNTRY_OF_DESTINATION ELSE ctr.COUNTRY_NAME END PAYS_DESTINATION,'' AGENT_RECEVABILITE, 0 DELAI_RECEVABILITE,'' AGENT_COTATION, 0 DELAI_COTATION,'' AGENT_TRAITEMENT, 0 DELAI_CONFIRMATION_RDV, 0 DELAI_TRAITEMENT, '' SIGNATAIRE, 0 DELAI_SIGNATURE, 0 DELAI_REPONSE_CI, COUNT(NUMERO_DOSSIER) NOMBRE_CI");

        selectAdmisibility.append(String.format(commomFrom.toString(), "admisibilityFlow"));
        params.put("admisibilityFlow", CTE_ADMISIBILITY_FLOW);
        selectcotation.append(String.format(commomFrom.toString(), "cotationFlow"));
        params.put("cotationFlow", CTE_COTATION_FLOW);
        selectApointment.append(String.format(commomFrom.toString(), "apointmentFlow"));
        params.put("apointmentFlow", CTE_APPOINTMENT_FLOW);
        selectTreatment.append(String.format(commomFrom.toString(), "treatmentFlow"));
        params.put("treatmentFlow", CTE_TREATMENT_FLOW);
        selectSignature.append(String.format(commomFrom.toString(), "signatureFlow"));
        params.put("signatureFlow", CTE_SIGNATURE_FLOW);
        selectCountCi.append(String.format(commomFrom.toString(), "ciFlow")).append(groupByCountCi);
        params.put("ciFlow", CTE_CI_FLOW);
        hqlQuery.append("SELECT DISTINCT NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, NUM_CONTRIBUABLE, RAISON_SOCIALE, TYPE_PRODUIT_NOM, PAYS_DESTINATION,MAX(AGENT_RECEVABILITE) AGENT_RECEVABILITE, SUM(DELAI_RECEVABILITE) DELAI_RECEVABILITE, MAX(AGENT_COTATION) AGENT_COTATION, SUM(DELAI_COTATION)  DELAI_COTATION,MAX(AGENT_TRAITEMENT) AGENT_TRAITEMENT, SUM(DELAI_CONFIRMATION_RDV)  DELAI_CONFIRMATION_RDV, SUM(DELAI_TRAITEMENT)  DELAI_TRAITEMENT, MAX(SIGNATAIRE) SIGNATAIRE, SUM(DELAI_SIGNATURE)  DELAI_SIGNATURE, SUM(DELAI_REPONSE_CI)  DELAI_REPONSE_CI, SUM(NOMBRE_CI) NOMBRE_CI FROM (")
                //                .append(" FROM (")
                .append(selectAdmisibility)
                .append(" UNION ")
                .append(selectcotation)
                .append(" UNION ")
                .append(selectApointment)
                .append(" UNION ")
                .append(selectTreatment)
                .append(" UNION ")
                .append(selectSignature)
                .append(" UNION ")
                .append(selectCountCi)
                .append(" ) GROUP BY NUMERO_DOSSIER,NUMERO_DEMANDE, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, NUM_CONTRIBUABLE, TYPE_PRODUIT_NOM, RAISON_SOCIALE, PAYS_DESTINATION");
        final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }

        final List<Object[]> list = query.getResultList();
        return list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getGlobalDelayListing(CteFilter filter, List<Long> fileTypeIdList) {
        final Map<String, Object> params = new HashMap<>();
        StringBuilder hqlQuery = new StringBuilder();
        hqlQuery.append("SELECT DISTINCT f.NUMERO_DOSSIER, f.FILE_TYPE_NAME,f.NUMERO_DEMANDE,C.NUM_CONTRIBUABLE,C.COMPANY_NAME");
        hqlQuery.append(",f.TYPE_PRODUIT_NOM,p.COUNTRY_NAME_FR PAYS_DESTINATION,f.CREATED_DATE,COALESCE(f.SIGNATURE_DATE,f.DATE_REJET) DATE_SORTIE");
        hqlQuery.append(",s.LABELFR ETAPE,f.CODE_BUREAU, f.NOM_BUREAU, f.TRANSITAIRE_NOM ");
        hqlQuery.append(" FROM MINADER_FILES f ");
        hqlQuery.append(" JOIN COMPANY C ON f.CLIENT_ID = C.ID JOIN REP_COUNTRY p ON f.COUNTRY_OF_DESTINATION = p.COUNTRY_ID_ALPHA2 ");
        hqlQuery.append(" JOIN FILE_ITEM fi ON f.ID = fi.FILE_ID JOIN STEP s ON fi.STEP_ID = s.ID ");
        hqlQuery.append(" WHERE f.CREATED_DATE BETWEEN TO_DATE(:dateDebut,'yyyy-MM-dd') AND TO_DATE(:dateFin,'yyyy-MM-dd') ");

        if (filter.getOperationType() != null && filter.getOperationType().length > 0) {
            hqlQuery.append(" AND f.TYPE_OPERATION IN (:operationType)");
            params.put("operationType", Arrays.asList(filter.getOperationType()));
        }
        if (filter.getProductNatureList() != null && filter.getProductNatureList().length > 0) {
            hqlQuery.append(" AND f.TYPE_PRODUIT_CODE IN (:productType)");
            params.put("productType", Arrays.asList(filter.getProductNatureList()));
        }

        if (filter.getOfficeCodeList() != null && filter.getOfficeCodeList().length > 0) {
            hqlQuery.append(" AND f.BUREAU_ID  IN (:officeCode)");
            params.put("officeCode", Arrays.asList(filter.getOfficeCodeList()));
        }
        if (filter.getClientNiu() != null && !filter.getClientNiu().isEmpty()) {
            hqlQuery.append(" AND C.NUM_CONTRIBUABLE =:numContribuable ");
            params.put("numContribuable", filter.getClientNiu());
        }
        hqlQuery.append(" AND f.FILE_TYPE_ID  IN (:fileTypeIdList)");
        if (filter.getProcessCodeList() != null && filter.getProcessCodeList().length > 0) {
            params.put("fileTypeIdList", Arrays.asList(filter.getProcessCodeList()));
        } else {
            params.put("fileTypeIdList", fileTypeIdList);
        }
        if (filter.getValidationFromDate() != null && filter.getValidationToDate() != null) {
            hqlQuery.append(" AND ((f.SIGNATURE_DATE IS NOT NULL AND f.SIGNATURE_DATE BETWEEN TO_DATE(:dateSignatureDebut,'yyyy-MM-dd') AND TO_DATE(:dateSignatureFin,'yyyy-MM-dd')) OR (f.DATE_REJET IS NOT NULL AND f.DATE_REJET BETWEEN TO_DATE(:dateSignatureDebut,'yyyy-MM-dd') AND TO_DATE(:dateSignatureFin,'yyyy-MM-dd')))");
            params.put("dateSignatureDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationFromDate()));
            params.put("dateSignatureFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getValidationToDate()));
        }

        params.put("dateDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getCreationFromDate()));
        params.put("dateFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getCreationToDate()));

        final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }

        final List<Object[]> list = query.getResultList();
        return list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> getActivitiesReport(CteFilter filter, List<Long> fileTypeIdList) {
        final Map<String, Object> params = new HashMap<>();
        final StringBuilder hqlQuery = new StringBuilder();
        final String where1 = " f.CREATED_DATE BETWEEN TO_DATE(:dateDebut,'yyyy-MM-dd') AND TO_DATE(:dateFin,'yyyy-MM-dd') ";
        final String where2 = " f.SIGNATURE_DATE IS NOT NULL AND f.SIGNATURE_DATE BETWEEN TO_DATE(:dateDebut,'yyyy-MM-dd') AND TO_DATE(:dateFin,'yyyy-MM-dd') ";
        final String where3 = " f.DATE_REJET IS NOT NULL AND f.DATE_REJET BETWEEN TO_DATE(:dateDebut,'yyyy-MM-dd') AND TO_DATE(:dateFin,'yyyy-MM-dd') ";
        final String groupBy = " GROUP BY FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU ";
        final StringBuilder where4 = new StringBuilder();

        if (filter.getOperationType() != null && filter.getOperationType().length > 0) {
            where4.append(" AND f.TYPE_OPERATION IN (:operationType)");
            params.put("operationType", Arrays.asList(filter.getOperationType()));
        }
        if (filter.getProductNatureList() != null && filter.getProductNatureList().length > 0) {
            where4.append(" AND f.TYPE_PRODUIT_CODE IN (:productType)");
            params.put("productType", Arrays.asList(filter.getProductNatureList()));
        }

        if (filter.getOfficeCodeList() != null && filter.getOfficeCodeList().length > 0) {
            where4.append(" AND f.BUREAU_ID  IN (:officeCode)");
            params.put("officeCode", Arrays.asList(filter.getOfficeCodeList()));
        }
        where4.append(" AND f.FILE_TYPE_ID  IN (:fileTypeIdList)");
        if (filter.getProcessCodeList() != null && filter.getProcessCodeList().length > 0) {
            params.put("fileTypeIdList", Arrays.asList(filter.getProcessCodeList()));
        } else {
            params.put("fileTypeIdList", fileTypeIdList);
        }

        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, SUM(NB_RECU) NB_RECU, SUM(NB_SIGNE) NB_SIGNE,SUM(NB_RECU_SIGNE) NB_RECU_SIGNE, SUM(NB_REJETE) NB_REJETE, SUM(NB_RECU_REJETE) NB_RECU_REJETE, SUM(NB_COURS) NB_COURS ");
        hqlQuery.append("FROM ( ");
        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, COUNT(*) NB_RECU, 0 NB_SIGNE ,0 NB_RECU_SIGNE, 0 NB_REJETE, 0 NB_RECU_REJETE, 0 NB_COURS ");
        hqlQuery.append("FROM MINADER_FILES f WHERE ");
        hqlQuery.append(where1).append(where4).append(groupBy);
        hqlQuery.append(" UNION ");
        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, 0 NB_RECU, COUNT(*) NB_SIGNE ,0 NB_RECU_SIGNE, 0 NB_REJETE, 0 NB_RECU_REJETE, 0 NB_COURS FROM MINADER_FILES f WHERE ");
        hqlQuery.append(where2).append(where4).append(groupBy);
        hqlQuery.append(" UNION ");
        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, 0 NB_RECU, 0 NB_SIGNE ,COUNT(*) NB_RECU_SIGNE, 0 NB_REJETE, 0 NB_RECU_REJETE, 0 NB_COURS FROM MINADER_FILES f WHERE ");
        hqlQuery.append(where1).append(" AND f.SIGNATURE_DATE IS NOT NULL ").append(where4).append(groupBy);
//        hqlQuery.append(where1).append(" AND ").append(where2).append(where4).append(groupBy);
        hqlQuery.append(" UNION ");
        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, 0 NB_RECU, 0 NB_SIGNE ,0 NB_RECU_SIGNE, COUNT(*) NB_REJETE, 0 NB_RECU_REJETE, 0 NB_COURS FROM MINADER_FILES f WHERE ");
        hqlQuery.append(where3).append(where4).append(groupBy);
        hqlQuery.append(" UNION ");
        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, 0 NB_RECU, 0 NB_SIGNE ,0 NB_RECU_SIGNE, 0 NB_REJETE, COUNT(*) NB_RECU_REJETE, 0 NB_COURS FROM MINADER_FILES f WHERE ");
        hqlQuery.append(where1).append(" AND f.DATE_REJET IS NOT NULL ").append(where4).append(groupBy);
//        hqlQuery.append(where1).append(" AND ").append(where3).append(where4).append(groupBy);
        hqlQuery.append(" UNION ");
        hqlQuery.append("SELECT FILE_TYPE_ID, FILE_TYPE_NAME, CODE_BUREAU, NOM_BUREAU, 0 NB_RECU, 0 NB_SIGNE ,0 NB_RECU_SIGNE, 0 NB_REJETE, 0 NB_RECU_REJETE, COUNT(*) NB_COURS FROM MINADER_FILES f WHERE ");
        hqlQuery.append(where1).append(" AND f.DATE_REJET IS NULL AND f.SIGNATURE_DATE IS NULL ").append(where4).append(groupBy);
        hqlQuery.append(" ) ");
        hqlQuery.append(groupBy);

        params.put("dateDebut", new SimpleDateFormat("yyyy-MM-dd").format(filter.getCreationFromDate()));
        params.put("dateFin", new SimpleDateFormat("yyyy-MM-dd").format(filter.getCreationToDate()));

        final Query query = super.entityManager.createNativeQuery(hqlQuery.toString());

        for (final Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }

        final List<Object[]> list = query.getResultList();
        return list;
    }

    @Override
    public void save(List<UserCctExportProductType> userProductTypes) {

        for (UserCctExportProductType upt : userProductTypes) {

            Map<String, Object> map = new HashMap<>();

            map.put("user", upt.getUser().getId());
            map.put("productType", upt.getProductType());

            save(upt.getClass(), map);
        }
    }

    private void save(Class clazz, Map<String, Object> map) {

        String queryFormat = "INSERT INTO {0} ({1}) VALUES ({2})";
        String table = getTableName(clazz);
        if (table == null) {
            return;
        }

        List<String> columnNames = new ArrayList<>();
        List<Object> values = new ArrayList<>();
        for (Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            columnNames.add(getColumnName(clazz, key));
            Object value = entry.getValue();
            values.add(String.format("'%s'", value));
        }

        String finalQuery = MessageFormat.format(queryFormat, table, StringUtils.join(columnNames, ','), StringUtils.join(values, ','));

        Query query = super.entityManager.createNativeQuery(finalQuery);
        query.executeUpdate();
    }

    @Override
    public void remove(List<UserCctExportProductType> userProductTypes) {

        for (UserCctExportProductType upt : userProductTypes) {

            Map<String, Object> map = new HashMap<>();

            map.put("user", upt.getUser().getId());
            map.put("productType", upt.getProductType());

            remove(upt.getClass(), map);
        }
    }

    private void remove(Class clazz, Map<String, Object> map) {
        String queryFormat = "DELETE FROM {0} WHERE {1}";
        String table = getTableName(clazz);
        if (table == null) {
            return;
        }

        List<String> whereParts = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            whereParts.add(String.format("%s = '%s'", getColumnName(clazz, key), value));
        }

        String finalQuery = MessageFormat.format(queryFormat, table, StringUtils.join(whereParts, " AND "));

        Query query = super.entityManager.createNativeQuery(finalQuery);
        query.executeUpdate();
    }

    private String getTableName(Class clazz) {
        Table table = (Table) clazz.getAnnotation(Table.class);
        if (table != null) {
            return table.name();
        }
        return null;
    }

    private String getColumnName(Class clazz, String fieldName) {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            Column c = field.getAnnotation(Column.class);
            if (c != null) {
                return c.name();
            } else {
                JoinColumn jc = field.getAnnotation(JoinColumn.class);
                if (jc != null) {
                    return jc.name();
                }
            }
        } catch (NoSuchFieldException | SecurityException ex) {
        }

        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public UserCctExportProductType findByUserAndProductType(User user, CctExportProductType productType) {

        TypedQuery<UserCctExportProductType> query = super.entityManager.createQuery("SELECT upt FROM UserCctExportProductType upt WHERE upt.user = :user AND upt.productType = :productType", UserCctExportProductType.class);

        query.setParameter("user", user);
        query.setParameter("productType", productType);

        try {
            return query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<CctExportProductType> findProductTypesByUser(User user) {

        Query query = super.entityManager.createQuery("SELECT upt.productType FROM UserCctExportProductType upt WHERE upt.user = :user");

        query.setParameter("user", user);

        return query.getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<UserCctExportProductType> findUsersAndProductTypes() {

        TypedQuery<UserCctExportProductType> query = super.entityManager.createQuery("SELECT upt FROM UserCctExportProductType upt", UserCctExportProductType.class);

        return query.getResultList();
    }

    @Override
    public PottingPresent savePottingPresent(PottingPresent pottingPresent) {

        super.entityManager.persist(pottingPresent);
        super.entityManager.flush();

        return pottingPresent;
    }

    @Override
    public void updatePottingPresent(PottingPresent pottingPresent) {
        this.entityManager.merge(pottingPresent);
    }

    @Override
    public List<PottingPresent> findPottingPresentsByFile(File file) {

        TypedQuery<PottingPresent> query = super.entityManager.createQuery("SELECT pp FROM PottingPresent pp WHERE pp.file.id = :fileId", PottingPresent.class);

        query.setParameter("fileId", file.getId());

        return query.getResultList();
    }

}

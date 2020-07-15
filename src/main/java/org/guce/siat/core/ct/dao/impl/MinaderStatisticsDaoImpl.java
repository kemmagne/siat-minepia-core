package org.guce.siat.core.ct.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.dao.MinaderStatisticsDao;
import org.guce.siat.core.ct.filter.MinaderFileTrackingFilter;
import org.guce.siat.core.ct.model.MinaderFileTracking;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ht
 */
@Repository("minaderStatisticsDao")
@Transactional(readOnly = true)
public class MinaderStatisticsDaoImpl implements MinaderStatisticsDao {

    /**
     * The entity manager.
     */
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> retrievePotentialAgents(MinaderFileTracking fileTracking) {

        TypedQuery<User> query = entityManager.createQuery("SELECT DISTINCT u FROM User u JOIN u.userAuthorityList ua, UserCctExportProductType upt, StepAuthority sa WHERE u.administration.id = :bureauId AND upt.user.id = u.id AND upt.productType = :productType AND ua.authorityGranted.id = sa.primaryKey.authorityGranted.id AND sa.primaryKey.step.id = :currentStepId", User.class);

        query.setParameter("bureauId", fileTracking.getOfficeId());
        query.setParameter("productType", CctExportProductType.valueOf(fileTracking.getProductyTypeCode()));
        query.setParameter("currentStepId", fileTracking.getCurrenStep().getId());

        return query.getResultList();
    }

    @Override
    public List<Object[]> retrieveFilesForTracking(MinaderFileTrackingFilter filter) {

        List<String> wheres = new ArrayList<>();

        if (StringUtils.isNotBlank(filter.getFileNumber())) {
            wheres.add(String.format("NUMERO_DOSSIER = '%s'", filter.getFileNumber()));
        }

        if (StringUtils.isNotBlank(filter.getRequestNumber())) {
            wheres.add(String.format("NUMERO_DEMANDE = '%s'", filter.getRequestNumber()));
        }

        if (CollectionUtils.isNotEmpty(filter.getFileTypesList())) {
            wheres.add(String.format("FILE_TYPE_CODE IN (%s)", StringUtils.join(transform(filter.getFileTypesList()), ", ")));
        }

        if (CollectionUtils.isNotEmpty(filter.getOfficesList())) {
            wheres.add(String.format("BUREAU_ID IN (%s)", StringUtils.join(transform(filter.getOfficesList()), ", ")));
        }

        if (CollectionUtils.isNotEmpty(filter.getProducTypesList())) {
            wheres.add(String.format("TYPE_PRODUIT_CODE IN (%s)", StringUtils.join(transform(filter.getProducTypesList()), ", ")));
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        if (filter.getFromDate() != null) {
            wheres.add(String.format("CREATED_DATE >= TO_DATE('%s', 'YYYY-MM-DD HH24:MI')", df.format(toStartOfDay(filter.getFromDate()))));
        }

        if (filter.getToDate() != null) {
            wheres.add(String.format("CREATED_DATE <= TO_DATE('%s', 'YYYY-MM-DD HH24:MI')", df.format(toEndOfDay(filter.getToDate()))));
        }

        String queryStr = "SELECT NUMERO_DEMANDE, NUMERO_DOSSIER, FILE_TYPE_CODE, FILE_TYPE_NAME_FR, FILE_TYPE_NAME_EN, CREATED_DATE, NUM_CONTRIBUABLE, COMPANY_NAME, TYPE_PRODUIT_CODE, TYPE_PRODUIT_NOM, BUREAU_ID, CODE_BUREAU, BUREAU_NAME_FR, BUREAU_NAME_EN FROM MINADER_FILES";
        if (!wheres.isEmpty()) {
            queryStr = queryStr.concat(" WHERE ").concat(StringUtils.join(wheres, " AND "));
        }

        Query query = entityManager.createNativeQuery(queryStr);

        List<Object[]> list = query.getResultList();

        return list;
    }

    private <T extends Object> List<String> transform(List<T> list) {

        List<String> result = new ArrayList<>();

        for (Object object : list) {
            result.add(String.format("'%s'", object));
        }

        return result;
    }

    private Date toStartOfDay(Date date) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);

        return calendar.getTime();
    }

    private Date toEndOfDay(Date date) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        calendar.set(Calendar.HOUR, 23);
        calendar.set(Calendar.MINUTE, 59);

        return calendar.getTime();
    }

}

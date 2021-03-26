package org.guce.siat.core.ct.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.guce.siat.common.model.Country;
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
    public Map<String, String> findCDAs() {

        Query query = entityManager.createQuery("SELECT DISTINCT mf.transitaireNiu, mf.transitaireName FROM MinaderFile mf WHERE mf.transitaireNiu IS NOT NULL AND mf.transitaireName IS NOT NULL");

        List<Object[]> list = query.getResultList();
        Map<String, String> result = new HashMap<>();
        for (Object[] line : list) {
            result.put((String) line[0], (String) line[1]);
        }

        return result;
    }

    @Override
    public Map<String, String> findTreatmentSocieties() {

        Query query = entityManager.createQuery("SELECT DISTINCT mf.treatmentSocietyCode, mf.treatmentSocietyName FROM MinaderFile mf WHERE mf.treatmentSocietyCode IS NOT NULL AND mf.treatmentSocietyName IS NOT NULL");

        List<Object[]> list = query.getResultList();
        Map<String, String> result = new HashMap<>();
        for (Object[] line : list) {
            result.put((String) line[0], (String) line[1]);
        }

        return result;
    }

    @Override
    public List<Country> findDestinationCountries() {

        Query query = entityManager.createQuery("SELECT DISTINCT mf.countryOfDestination, c.countryName FROM MinaderFile mf, Country c WHERE mf.countryOfDestination = c.countryIdAlpha2");

        List<Object[]> list = query.getResultList();
        List<Country> countries = new ArrayList<>();
        for (Object[] line : list) {
            countries.add(new Country((String) line[0], (String) line[1]));
        }

        return countries;
    }

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

        Map<String, Object> params = new HashMap<>();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        wheres.add("CREATED_DATE >= TO_DATE(:fromDate, 'YYYY-MM-DD')");
        params.put("fromDate", df.format(toStartOfDay(filter.getFromDate())));
        wheres.add("CREATED_DATE < TO_DATE(:toDate, 'YYYY-MM-DD')");
        params.put("toDate", df.format(toNextDay(filter.getToDate())));

        if (StringUtils.isNotBlank(filter.getFileNumber())) {
            wheres.add("NUMERO_DOSSIER = :fileNumber");
            params.put("fileNumber", filter.getFileNumber());
        }

        if (StringUtils.isNotBlank(filter.getRequestNumber())) {
            wheres.add("NUMERO_DEMANDE = :requestNumber");
            params.put("requestNumber", filter.getRequestNumber());
        }

        if (CollectionUtils.isNotEmpty(filter.getFileTypesList())) {
            wheres.add("FILE_TYPE_CODE IN (:fileTypesList)");
            params.put("fileTypesList", filter.getFileTypesList());
        }

        if (CollectionUtils.isNotEmpty(filter.getOfficesList())) {
            wheres.add("BUREAU_ID IN (:officesList)");
            params.put("officesList", filter.getOfficesList());
        }

        if (CollectionUtils.isNotEmpty(filter.getProducTypesList())) {
            wheres.add("TYPE_PRODUIT_CODE IN (:producTypesList)");
            params.put("producTypesList", filter.getProducTypesList());
        }

        if (null != filter.getFileState()) {
            switch (filter.getFileState()) {
                case IN_PROCESS:
                    wheres.add("SIGNATURE_DATE IS NULL");
                    wheres.add("DATE_REJET IS NULL");
                    break;
                case SIGNED:
                    wheres.add("SIGNATURE_DATE IS NOT NULL");
                    break;
                case REJECTED:
                    wheres.add("DATE_REJET IS NOT NULL");
                    break;
                default:
                    break;
            }
        }

        String queryStr = "SELECT NUMERO_DEMANDE, NUMERO_DOSSIER, FILE_TYPE_CODE, FILE_TYPE_NAME_FR, FILE_TYPE_NAME_EN, CREATED_DATE, NUM_CONTRIBUABLE, COMPANY_NAME, TYPE_PRODUIT_CODE, TYPE_PRODUIT_NOM, BUREAU_ID, CODE_BUREAU, BUREAU_NAME_FR, BUREAU_NAME_EN FROM MINADER_FILES";
        queryStr = queryStr.concat(" WHERE ").concat(StringUtils.join(wheres, " AND "));

        Query query = entityManager.createNativeQuery(queryStr);

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            query.setParameter(key, value);
        }

        List<Object[]> list = query.getResultList();

        return list;
    }

    public void initCalendar(Calendar calendar) {

        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }

    private Date toStartOfDay(Date date) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        initCalendar(calendar);

        return calendar.getTime();
    }

    private Date toNextDay(Date date) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        initCalendar(calendar);
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        return calendar.getTime();
    }

}

package org.guce.siat.core.ct.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.guce.siat.common.model.Pair;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.enums.FileTypeCode;
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
    public List<String> findMinaderProductNames() {

        String queryString = "SELECT DISTINCT PNFIFV.VALUE FROM FILE_ITEM_FIELD PNFIF JOIN FILE_ITEM_FIELD_VALUE PNFIFV ON PNFIFV.FILE_ITEM_FIELD_ID = PNFIF.ID AND PNFIF.CODE = 'NOM_PRODUIT' JOIN FILE_TYPE FT ON FT.ID = PNFIF.FILE_TYPE_ID AND FT.CODE IN (:minaderFileTypes)";

        Query query = entityManager.createNativeQuery(queryString);

        query.setParameter("minaderFileTypes", Arrays.asList(FileTypeCode.CCT_CT_E_PVI.name(), FileTypeCode.CCT_CT_E_FSTP.name(), FileTypeCode.CCT_CT_E_ATP.name(), FileTypeCode.CCT_CT_E_PVE.name(), FileTypeCode.CCT_CT_E.name()));

        List<String> result = query.getResultList();

        return result;
    }

    @Override
    public List<Pair> findCDAs() {

        String queryString = "SELECT DISTINCT TNC.VALUE NIU_CDA, TRS.VALUE NOM_CDA FROM (SELECT FFV.VALUE, FFV.FILE_ID FROM FILE_FIELD FF JOIN FILE_FIELD_VALUE FFV ON FFV.FILE_FIELD_ID = FF.ID WHERE FF.CODE = 'TRANSITAIRE_NUMERO_CONTRIBUABLE') TNC JOIN (SELECT FFV.VALUE, FFV.FILE_ID FROM FILE_FIELD FF JOIN FILE_FIELD_VALUE FFV ON FFV.FILE_FIELD_ID = FF.ID WHERE FF.CODE = 'TRANSITAIRE_RAISONSOCIALE') TRS ON TRS.FILE_ID = TNC.FILE_ID";

        Query query = entityManager.createNativeQuery(queryString);

        List<Object[]> list = query.getResultList();
        List<Pair> result = new ArrayList<>();
        for (Object[] line : list) {
            result.add(new Pair((String) line[0], (String) line[1]));
        }

        return result;
    }

    @Override
    public List<Pair> findTreatmentSocieties() {

        String queryString = "SELECT DISTINCT STC.VALUE NIU_CDA, STN.VALUE NOM_CDA FROM (SELECT FFV.VALUE, FFV.FILE_ID FROM FILE_FIELD FF JOIN FILE_FIELD_VALUE FFV ON FFV.FILE_FIELD_ID = FF.ID WHERE FF.CODE = 'TRAITEMENT_SOCIETE_TRAITEMENT_CODE') STC JOIN (SELECT FFV.VALUE, FFV.FILE_ID FROM FILE_FIELD FF JOIN FILE_FIELD_VALUE FFV ON FFV.FILE_FIELD_ID = FF.ID WHERE FF.CODE = 'TRAITEMENT_SOCIETE_TRAITEMENT_NOM') STN ON STN.FILE_ID = STC.FILE_ID";

        Query query = entityManager.createNativeQuery(queryString);

        List<Object[]> list = query.getResultList();
        List<Pair> result = new ArrayList<>();
        for (Object[] line : list) {
            result.add(new Pair((String) line[0], (String) line[1]));
        }

        return result;
    }

    @Override
    public List<Pair> findDestinationCountries() {

        Query query = entityManager.createNativeQuery("SELECT COUNTRY_ID_ALPHA2, COUNTRY_NAME FROM REP_COUNTRY");

        List<Object[]> list = query.getResultList();
        List<Pair> result = new ArrayList<>();
        for (Object[] line : list) {
            result.add(new Pair((String) line[0], (String) line[1]));
        }

        return result;
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

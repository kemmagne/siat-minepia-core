package org.guce.siat.core.ct.dao.impl;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.FileFieldValueDao;
import org.guce.siat.common.dao.UserDao;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.enums.AuthorityConstants;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.core.ct.dao.CotationDao;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tadzotsa
 */
@Repository("cotationDao")
@Transactional(readOnly = true)
public class CotationDaoImpl implements CotationDao {

    /**
     * The entity manager.
     */
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserDao userDao;
    @Autowired
    private FileFieldValueDao fileFieldValueDao;

    @Override
    public List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile) {

        TypedQuery<User> query = entityManager.createQuery("SELECT DISTINCT upt.user FROM UserCctExportProductType upt JOIN upt.user.userAuthorityList aut, UserAuthorityFileType auft WHERE upt.user.deleted = false AND upt.user.enabled = true AND upt.user.administration.id = :bureauId AND aut.authorityGranted.role IN (:authoritiesList) AND aut.id = auft.primaryKey.userAuthority.id AND auft.primaryKey.fileType.id = :fileTypeId AND upt.user.deleted = false AND upt.productType = :productType", User.class);

        FileFieldValue ffv = fileFieldValueDao.findValueByFileFieldAndFile(CctExportProductType.getFileFieldCode(), currentFile);
        CctExportProductType productType = CctExportProductType.valueOf(ffv.getValue());

        query.setParameter("bureauId", currentFile.getBureau().getId());
        query.setParameter("authoritiesList", Arrays.asList(AuthorityConstants.INSPECTEUR.getCode()));
        query.setParameter("productType", productType);
        query.setParameter("fileTypeId", currentFile.getFileType().getId());

        return query.getResultList();
    }

    @Deprecated
    @Override
    public User findUserForCotation(CctExportProductType productType, Bureau bureau) {

        StringBuilder builder = new StringBuilder("SELECT UPT.USER_ID, NVL(T.NB,0) NB FROM USERS_CCT_EXPORT_PRODUCT_TYPE UPT ");
        builder.append("JOIN USERS U ON U.ID = UPT.USER_ID AND U.DELETED = 0 AND U.ENABLED = 1 AND U.ADMINISTRATION_ID = :bureauId AND U.ID IN (SELECT UA.USER_ID FROM USER_AUTHORITY UA JOIN AUTHORITY A ON UA.AUTHORITY_ID = A.ID AND A.ROLE IN (:authoritiesList)) ")
                .append("LEFT JOIN (SELECT ASSIGNED_USER_ID, COUNT(*) NB FROM (")
                .append("SELECT DISTINCT TR.ASSIGNED_USER_ID, TR.NUMERO_DEMANDE FROM TRANSFER TR ")
                .append("JOIN FILES F ON F.NUMERO_DEMANDE = TR.NUMERO_DEMANDE ")
                .append("JOIN FILE_FIELD FF ON FF.FILE_TYPE_ID = F.FILE_TYPE_ID AND FF.CODE = :ptFieldCode ")
                .append("JOIN FILE_FIELD_VALUE FFV ON FFV.FILE_ID = F.ID AND FFV.VALUE = :productType ")
                .append("WHERE TR.NUMERO_DEMANDE IS NOT NULL ")
                .append(") GROUP BY ASSIGNED_USER_ID) T ")
                .append("ON T.ASSIGNED_USER_ID = UPT.USER_ID WHERE UPT.PRODUCT_TYPE = :productType ORDER BY NB, UPT.USER_ID DESC");
        Query query = entityManager.createNativeQuery(builder.toString());

        query.setParameter("bureauId", bureau.getId());
        query.setParameter("authoritiesList", Arrays.asList(AuthorityConstants.INSPECTEUR.getCode()));
        query.setParameter("ptFieldCode", CctExportProductType.getFileFieldCode());
        query.setParameter("productType", productType.name());

        List list = query.getResultList();

        if (CollectionUtils.isEmpty(list)) {
            return null;
        }

        Object[] line = (Object[]) list.get(0);

        Number id = (Number) line[0];

        return userDao.find(id.longValue());
    }

    @Override
    public List<User> findUsersForCotation(Bureau bureau, CctExportProductType productType) {

        TypedQuery<User> query = entityManager.createQuery("SELECT DISTINCT upt.user FROM UserCctExportProductType upt JOIN upt.user.userAuthorityList aut, UserAuthorityFileType auft WHERE upt.user.deleted = false AND upt.user.enabled = true AND upt.user.administration.id = :bureauId AND aut.authorityGranted.role IN (:authoritiesList) AND aut.id = auft.primaryKey.userAuthority.id AND auft.primaryKey.fileType.code IN (:fileTypesCodes) AND upt.user.deleted = false AND upt.productType = :productType", User.class);

        query.setParameter("bureauId", bureau.getId());
        query.setParameter("authoritiesList", Arrays.asList(AuthorityConstants.INSPECTEUR.getCode()));
        query.setParameter("fileTypesCodes", Arrays.asList(FileTypeCode.CCT_CT_E, FileTypeCode.CCT_CT_E_ATP, FileTypeCode.CCT_CT_E_FSTP, FileTypeCode.CCT_CT_E_PVE, FileTypeCode.CCT_CT_E_PVI));
        query.setParameter("productType", productType);

        return query.getResultList();
    }

}

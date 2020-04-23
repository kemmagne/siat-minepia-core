package org.guce.siat.core.ct.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.FileFieldValueDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.User;
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
@Transactional
public class CotationDaoImpl implements CotationDao {

    /**
     * The entity manager.
     */
    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    private FileFieldValueDao fieldValueDao;

    @Transactional(readOnly = true)
    @Override
    public List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile) {

        TypedQuery<User> query = entityManager.createQuery("SELECT DISTINCT u FROM User u, UserCctExportProductType upt WHERE upt.user.id = u.id AND u.administration.id = :bureauId AND upt.productType = :productType", User.class);

        FileFieldValue ffv = fieldValueDao.findValueByFileFieldAndFile(CctExportProductType.getFileFieldCode(), currentFile);
        CctExportProductType productType = CctExportProductType.valueOf(ffv.getValue());

        query.setParameter("bureauId", currentFile.getBureau().getId());
        query.setParameter("currentFileId", currentFile.getId());
        query.setParameter("productType", productType);

        return query.getResultList();
    }

}

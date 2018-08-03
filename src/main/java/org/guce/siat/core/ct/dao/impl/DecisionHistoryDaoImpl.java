package org.guce.siat.core.ct.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.File;
import org.guce.siat.core.ct.dao.DecisionHistoryDao;
import org.guce.siat.core.ct.model.DecisionHistory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * this class DecisionHistoryDaoImpl
 *
 * @author tadzotsa
 */
@Repository("decisionHistoryDao")
@Transactional(propagation = Propagation.REQUIRED)
public class DecisionHistoryDaoImpl extends AbstractJpaDaoImpl<DecisionHistory> implements DecisionHistoryDao {

    public DecisionHistoryDaoImpl() {
        super();
        setClasse(DecisionHistory.class);
    }

    /**
     * Find history of decisions by required file
     *
     * @param file
     * @return the list of decisions
     */
    @Override
    public List<DecisionHistory> findByFile(final File file) {

        if (file == null) {
            return null;
        }

        final TypedQuery<DecisionHistory> query = entityManager.createQuery("SELECT dh FROM DecisionHistory dh WHERE dh.file.id = :fileId",
                DecisionHistory.class);

        query.setParameter("fileId", file.getId());

        return query.getResultList();
    }

}

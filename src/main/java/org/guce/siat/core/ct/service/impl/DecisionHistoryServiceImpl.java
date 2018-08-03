package org.guce.siat.core.ct.service.impl;

import java.util.List;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.DecisionHistoryDao;
import org.guce.siat.core.ct.model.DecisionHistory;
import org.guce.siat.core.ct.service.DecisionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * the DecisionHistoryServiceImpl class
 *
 * @author tadzotsa
 */
@Service("decisionHistoryService")
@Transactional(readOnly = true)
public class DecisionHistoryServiceImpl extends AbstractServiceImpl<DecisionHistory> implements DecisionHistoryService {

    @Autowired
    private DecisionHistoryDao decisionHistoryDao;

    public DecisionHistoryServiceImpl() {
        super();
    }

    @Override
    public List<DecisionHistory> findByFile(final File file) {
        return decisionHistoryDao.findByFile(file);
    }

    @Override
    public AbstractJpaDao<DecisionHistory> getJpaDao() {
        return decisionHistoryDao;
    }

    @Override
    public void setJpaDao(final AbstractJpaDao<DecisionHistory> jpaDao) {
        this.decisionHistoryDao = (DecisionHistoryDao) jpaDao;
    }

}

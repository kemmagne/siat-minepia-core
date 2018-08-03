package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.core.ct.model.DecisionHistory;

/**
 *
 * @author tadzotsa
 */
public interface DecisionHistoryDao extends AbstractJpaDao<DecisionHistory> {

    List<DecisionHistory> findByFile(File file);

}

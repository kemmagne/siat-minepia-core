package org.guce.siat.core.ct.service;

import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.DecisionHistory;

/**
 *
 * @author tadzotsa
 */
public interface DecisionHistoryService extends AbstractService<DecisionHistory> {

    List<DecisionHistory> findByFile(File file);

}

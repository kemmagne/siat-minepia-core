package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.core.ct.model.PottingReport;

/**
 *
 * @author ht
 */
public interface PottingReportDao extends AbstractJpaDao<PottingReport> {

    PottingReport findPottingReportByFile(File file);

}

package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.PottingReportDao;
import org.guce.siat.core.ct.model.PottingReport;
import org.guce.siat.core.ct.service.PottingReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ht
 */
@Service("pottingReportService")
@Transactional
public class PottingReportServiceImpl extends AbstractServiceImpl<PottingReport> implements PottingReportService {

    @Autowired
    private PottingReportDao pottingReportDao;

    @Override
    public PottingReportDao getJpaDao() {
        return pottingReportDao;
    }

    @Override
    public void setJpaDao(AbstractJpaDao<PottingReport> jpaDao) {
        pottingReportDao = (PottingReportDao) jpaDao;
    }

    @Transactional(readOnly = true)
    @Override
    public PottingReport findPottingReportByFile(File file) {
        return getJpaDao().findPottingReportByFile(file);
    }

}

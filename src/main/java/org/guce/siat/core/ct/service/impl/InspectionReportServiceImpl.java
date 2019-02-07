package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.InspectionReportDao;
import org.guce.siat.core.ct.model.InspectionReport;
import org.guce.siat.core.ct.service.InspectionReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class InspectionReportServiceImpl.
 */
@Service("inspectionReportService")
@Transactional(readOnly = true)
public class InspectionReportServiceImpl extends AbstractServiceImpl<InspectionReport> implements InspectionReportService {

    /**
     * The inspection report dao.
     */
    @Autowired
    private InspectionReportDao inspectionReportDao;

    /**
     * Instantiates a new inspection report service impl.
     */
    public InspectionReportServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<InspectionReport> getJpaDao() {
        return inspectionReportDao;
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<InspectionReport> jpaDao) {
        this.inspectionReportDao = (InspectionReportDao) jpaDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.InspectionReportService#findByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public InspectionReport findByItemFlow(final ItemFlow itemFlow) {
        return inspectionReportDao.findByItemFlow(itemFlow);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.InspectionReportService#findLastInspectionReportsByFileItem(org.guce.siat.common
	 * .model.FileItem)
     */
    @Override
    public InspectionReport findLastInspectionReportsByFileItem(final FileItem fileItem) {
        return inspectionReportDao.findLastInspectionReportsByFileItem(fileItem);
    }
}

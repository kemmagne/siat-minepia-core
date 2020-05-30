package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.PottingReport;

/**
 *
 * @author ht
 */
public interface PottingReportDao extends AbstractJpaDao<PottingReport> {

    PottingReport findPottingReportByFile(File file);

    PottingReport findPottingReportByFile(File file, boolean validated);

    PottingReport findPottingReportByAppointmentFlow(ItemFlow appointmentItemFlow);

    PottingReport findPottingReportByValidationFlow(ItemFlow validationItemFlow);

}

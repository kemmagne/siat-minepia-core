package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.PottingReport;

/**
 *
 * @author ht
 */
public interface PottingReportService extends AbstractService<PottingReport> {

    PottingReport findPottingReportByFile(File file);

    void resetAppointmentUpdates(PottingReport pottingReport, Flow currentFlow);

    void resetValdiationUpdates(PottingReport pottingReport, Flow currentFlow);

    PottingReport findPottingReportByAppointmentFlow(ItemFlow appointmentItemFlow);

    PottingReport findPottingReportByValidationFlow(ItemFlow validationItemFlow);

    void updateAfterSignature(PottingReport pottingReport);

}

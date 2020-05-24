package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.File;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.PottingReport;

/**
 *
 * @author ht
 */
public interface PottingReportService extends AbstractService<PottingReport> {

    PottingReport findPottingReportByFile(File file);

}

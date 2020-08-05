package org.guce.siat.core.ct.service;

import java.util.Arrays;
import java.util.List;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.core.ct.filter.MinaderFileTrackingFilter;
import org.guce.siat.core.ct.model.MinaderFileTracking;

/**
 *
 * @author ht
 */
public interface MinaderStatisticsService {

    List<StepCode> TREATMENT_STEPS_CODES = Arrays.asList(StepCode.ST_CT_04, StepCode.ST_CT_48, StepCode.ST_CT_63, StepCode.ST_CT_55);

    List<User> retrievePotentialAgents(MinaderFileTracking fileTracking);

    List<MinaderFileTracking> retrieveFilesForTracking(MinaderFileTrackingFilter filter);

}

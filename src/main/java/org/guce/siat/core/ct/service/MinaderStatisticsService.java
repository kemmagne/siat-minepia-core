package org.guce.siat.core.ct.service;

import java.util.List;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.filter.MinaderFileTrackingFilter;
import org.guce.siat.core.ct.model.MinaderFileTracking;

/**
 *
 * @author ht
 */
public interface MinaderStatisticsService {

    List<User> retrievePotentialAgents(MinaderFileTracking fileTracking);

    List<MinaderFileTracking> retrieveFilesForTracking(MinaderFileTrackingFilter filter);

}

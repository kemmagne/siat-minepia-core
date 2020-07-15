package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.filter.MinaderFileTrackingFilter;
import org.guce.siat.core.ct.model.MinaderFileTracking;

/**
 *
 * @author ht
 */
public interface MinaderStatisticsDao {

    List<User> retrievePotentialAgents(MinaderFileTracking fileTracking);

    List<Object[]> retrieveFilesForTracking(MinaderFileTrackingFilter filter);

}

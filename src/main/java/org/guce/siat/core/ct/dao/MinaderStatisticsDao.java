package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.model.Pair;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.filter.MinaderFileTrackingFilter;
import org.guce.siat.core.ct.model.MinaderFileTracking;

/**
 *
 * @author ht
 */
public interface MinaderStatisticsDao {

    List<String> findMinaderProductNames();

    List<Pair> findCDAs();
    
    List<Pair> findCDAsByNuiOrNameLike(String searchQuery);

    List<Pair> findTreatmentSocieties();
    
    List<Pair> findTreatmentSocietiesByNuiOrNameLike(String searchQuery);

    List<Pair> findDestinationCountries();
    
    List<Pair> findDestinationCountriesByCodeORNameLike(String searchQuery);

    List<User> retrievePotentialAgents(MinaderFileTracking fileTracking);

    List<Object[]> retrieveFilesForTracking(MinaderFileTrackingFilter filter);

}

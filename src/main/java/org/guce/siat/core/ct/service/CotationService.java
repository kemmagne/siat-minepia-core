package org.guce.siat.core.ct.service;

import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.User;

/**
 *
 * @author tadzotsa
 */
public interface CotationService {

    void dispatch(File currentFile, Flow currentFlow);
    void automaticQuotation(File currentFile, Flow currentFlow, User loggedUser);

    
    
    List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile);

}

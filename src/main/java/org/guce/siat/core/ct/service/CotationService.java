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

    void dispatch(File currentFile, User loggedUser, Flow currentFlow);

    List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile);

}

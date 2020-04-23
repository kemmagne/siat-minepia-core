package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.User;

/**
 *
 * @author tadzotsa
 */
public interface CotationDao {

    List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile);

}

package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.util.enums.CctExportProductType;

/**
 *
 * @author tadzotsa
 */
public interface CotationDao {

    List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile);

    User findUserForCotation(CctExportProductType productType, Bureau bureau);

}

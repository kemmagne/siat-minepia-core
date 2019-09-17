package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Administration;
import org.guce.siat.core.ct.model.ParamCCTCP;

/**
 * The Interface ParamCCTCP.
 */
public interface ParamCCTCPDao extends AbstractJpaDao<ParamCCTCP> {

    /**
     * Find ParamCCTCPDao
     *
     * @param administration the office
     * @return the ParamCCTCP
     */
    ParamCCTCP findParamCCTCPByAdministration(Administration administration);

    /**
     * Find ParamCCTCPDao .
     *
     * @return the default ParamCCTCP
     */
    ParamCCTCP findParamCCTCPDefault();

}

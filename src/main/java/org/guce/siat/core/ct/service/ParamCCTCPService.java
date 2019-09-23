package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.Administration;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.ParamCCTCP;

/**
 * The Interface ParamCCTCPService.
 */
public interface ParamCCTCPService extends AbstractService<ParamCCTCP> {

    /**
     * Find ParamCCTCP by bureau.
     *
     * @param administration the office
     * @return the ParamCCTCP
     */
    ParamCCTCP findParamCCTCPByAdministration(Administration administration);

    /**
     * Find Default ParamCCTCP .
     *
     * @return the ParamCCTCP
     */
    ParamCCTCP findParamCCTCPDefault();

}

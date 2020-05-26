package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FlowGuceSiat;
import org.guce.siat.common.model.GuceSiatBureau;
import org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl;
import org.guce.siat.utility.jaxb.common.MESSAGE;
import org.guce.siat.utility.jaxb.common.REFERENCEDOSSIER;

/**
 *
 * @author ht
 */
public abstract class AbstractXmlConverter implements XmlConverter {

    protected final XmlConverterServiceImpl xmlConverterService;

    public AbstractXmlConverter(XmlConverterServiceImpl xmlConverterService) {
        this.xmlConverterService = xmlConverterService;
    }

    protected abstract Serializable checkInstance(Serializable serializable);

    protected void initXmlConverterService(REFERENCEDOSSIER refDossier, MESSAGE msg, String documentType, String officeCode) {

        FlowGuceSiat flowGuceSiat = xmlConverterService.getFlowGuceSiatDao().findFlowGuceSiatByFlowGuce(documentType);
        xmlConverterService.setFlowGuceSiat(flowGuceSiat);

        String refSiat = refDossier.getREFERENCESIAT();
        xmlConverterService.setRefSiat(refSiat);

        String numDossier = refDossier.getNUMERODOSSIER();
        xmlConverterService.setNumDossier(numDossier);

        String numEbmsMessage = msg.getNUMEROMESSAGE();
        xmlConverterService.setNumEbmsMessage(numEbmsMessage);

        if (StringUtils.isNotBlank(officeCode)) {
            GuceSiatBureau guceSiatBureau = xmlConverterService.getGuceSiatBureauDao().findByBureauGuce(officeCode);
            xmlConverterService.setGuceSiatBureau(guceSiatBureau);
        }
    }

    @Override
    public void update(File file, Serializable serializable) {
    }

}

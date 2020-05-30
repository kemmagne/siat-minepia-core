package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
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

    protected void setNumeroDossier(File current) {

        if (StringUtils.isNotBlank(xmlConverterService.getRefSiat())) { // ce n'est pas un nouveau dossier
            return;
        }

        String numeroDossier = current.getNumeroDossier();

        File root = xmlConverterService.getFileDao().findByRefSiat(numeroDossier);
        if (root == null) {
            return;
        }

        List<File> children = root.getChildrenList();
        String suffix = new DecimalFormat("M00").format(children.size() + 1);
        numeroDossier = numeroDossier.concat(suffix);

        current.setNumeroDossier(numeroDossier);
        current.setParent(root);
        xmlConverterService.setNumDossier(numeroDossier);
    }

    @Override
    public void update(File file, Serializable serializable) {
    }

}

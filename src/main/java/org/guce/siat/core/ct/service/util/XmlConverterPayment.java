package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.FlowGuceSiat;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.utils.ConverterGuceSiatUtils;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.ebms.ESBConstants;
import org.guce.siat.common.utils.ebms.UtilitiesException;
import org.guce.siat.common.utils.exception.ValidationException;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl;
import org.guce.siat.utility.jaxb.common.PAIEMENT;
import org.guce.siat.utility.jaxb.common.PaymentDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ht
 */
public class XmlConverterPayment extends AbstractXmlConverter {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConverterPayment.class);

    public XmlConverterPayment(XmlConverterServiceImpl xmlConverterService) {
        super(xmlConverterService);
    }

    @Override
    protected PaymentDocument checkInstance(Serializable serializable) {
        return (PaymentDocument) serializable;
    }

    @Override
    public File convertDocumentToFile(final Serializable serializable) throws ParseException, ValidationException {

        PaymentDocument document = checkInstance(serializable);

        initXmlConverterService(document.getREFERENCEDOSSIER(), document.getMESSAGE(), document.getTYPEDOCUMENT(), null);

        String numDossier;
        if (ESBConstants.INVOICE_FLOW_GUCE.equals(document.getTYPEDOCUMENT())) {
            numDossier = document.getREFERENCEDOSSIER().getNUMERODEMANDE();
        } else {
            numDossier = document.getREFERENCEDOSSIER().getNUMERODOSSIER();
        }
        xmlConverterService.setNumDossier(numDossier);

        File fileToReturn = xmlConverterService.getFileDao().findByRefSiat(xmlConverterService.getRefSiat());
        xmlConverterService.setNumDossier(fileToReturn.getNumeroDossier());
        fileToReturn.setAttachmentsList(null);
        fileToReturn.setFileFieldValueList(null);
        fileToReturn.setFileItemsList(null);
        if (ESBConstants.INVOICE_FLOW_GUCE.equals(document.getTYPEDOCUMENT())) {
            fileToReturn.setFileTypeGucePaiement(document.getREFERENCEDOSSIER().getSERVICE());
            fileToReturn.setNumeroDemandePaiement(document.getREFERENCEDOSSIER().getNUMERODOSSIER());
            fileToReturn.setReferenceGucePaiement(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
        }

        return fileToReturn;
    }

    @Override
    public PaymentDocument convertFileToDocument(File file, List<FileItem> fileItemList, List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        PaymentDocument paymentDocument = new PaymentDocument();

        paymentDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());

        paymentDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        paymentDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, Boolean.FALSE));

        paymentDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        PaymentDocument.CONTENT content = new PaymentDocument.CONTENT();

        PAIEMENT paiement = new PAIEMENT();

        ItemFlow paymentItemFlow = itemFlowList.get(0);
        PaymentData paymentData = xmlConverterService.getPaymentDataDao().findPaymentDataByItemFlow(paymentItemFlow);

        PAIEMENT.FACTURE facture = new PAIEMENT.FACTURE();
        facture.setREFERENCEFACTURE(paymentData.getRefFacture());
        paiement.setFACTURE(facture);

        PAIEMENT.ENCAISSEMENT encaissement = new PAIEMENT.ENCAISSEMENT();

        encaissement.setCANALENCAISSEMENT(file.getDestinataire());
        encaissement.setDATEENCAISSEMENT(DateUtils.formatSimpleDate(DateUtils.FRENCH_DATE, paymentData.getDateEncaissement()));
        encaissement.setMONTANT(Long.toString(paymentData.getMontantHt() + paymentData.getMontantTva()));
        encaissement.setNATURE(paymentData.getNatureEncaissement());
        encaissement.setNUMERORECU(paymentData.getNumRecu());
        encaissement.setOBSERVATIONS(paymentData.getObservation());

        paiement.setENCAISSEMENT(encaissement);

        PAIEMENT.FICHERECETTE ficherecette = new PAIEMENT.FICHERECETTE();

        ficherecette.setARTICLE(paymentData.getArticle());
        ficherecette.setIMPUTATION(paymentData.getImputation());
        ficherecette.setNUMEROQUITTANCE(paymentData.getNumQuittance());
        ficherecette.setNUMEROROLE(paymentData.getRoleRecette());

        paiement.setFICHERECETTE(ficherecette);

        PAIEMENT.SIGNATAIRE signataire = new PAIEMENT.SIGNATAIRE();

        signataire.setDATE(DateUtils.formatSimpleDate(DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS_SSS_XXX, paymentItemFlow.getCreated()));
        signataire.setLIEU(paymentData.getLieuSignature());
        signataire.setNOM(paymentData.getNomSignature());
        signataire.setQUALITE(paymentItemFlow.getSender().getPosition().getLabelFr());

        paiement.setSIGNATAIRE(signataire);

        content.setPAIEMENT(paiement);

        paymentDocument.setCONTENT(content);

        return paymentDocument;
    }

}

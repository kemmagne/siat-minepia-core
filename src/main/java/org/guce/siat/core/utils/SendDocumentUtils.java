package org.guce.siat.core.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.guce.siat.common.utils.ConstantsXsdPaths;
import org.guce.siat.utility.jaxb.common.PaymentDocument;
import org.springframework.core.io.ClassPathResource;
import org.xml.sax.SAXException;

/**
 * The Class FileFieldValueUtils.
 */
public final class SendDocumentUtils {

    /**
     * Instantiates a new send document utils.
     */
    private SendDocumentUtils() {
    }

    /**
     * Prepare ap document.
     *
     * @param documentSerializable the document serializable
     * @param ebxmlFolder the ebxml folder
     * @param service the service
     * @param documentType the document type
     * @return the file
     * @throws JAXBException the JAXB exception
     * @throws SAXException the SAX exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static ByteArrayOutputStream prepareApDocument(final Serializable documentSerializable, String service, String documentType) throws JAXBException, SAXException, IOException {

        JAXBContext jaxbContext;
        Marshaller jaxbMarshallerz;
        final ByteArrayOutputStream output = new ByteArrayOutputStream();

        if (documentSerializable instanceof org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.VT_MINEPIA.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT document = (org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) documentSerializable;

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.VT_MINEPIA_XSD_PATH);

            jaxbMarshallerz = jaxbContext.createMarshaller();
            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.VT_MINEPDED.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT document = (org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.VT_MINEPDED_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AT_MINEPIA.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT document = (org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AT_MINEPIA_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.CEA_MINMIDT.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT document = (org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CEA_MINMIDT_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AI_MINSANTE.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT document = (org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AI_MINSANTE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AT_MINSANTE.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT document = (org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AT_MINSANTE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.DI_MINADER.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.DI_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);

            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.PIVPSRP_MINADER.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.PIVPSRP_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.CAT_MINADER.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CAT_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.EH_MINADER.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.EH_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AIE_MINADER.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AIE_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AE_MINADER.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AE_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AS_MINADER.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT document = (org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AS_MINADER_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.VTP_MINSANTE.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT document = (org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.VTP_MINSANTE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.VTD_MINSANTE.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT document = (org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.VTD_MINSANTE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AI_MINMIDT.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT document = (org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AI_MINMIDT_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);

            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AE_MINMIDT.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT document = (org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AE_MINMIDT_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.CP_MINEPDED.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT document = (org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CP_MINEPDED_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.AS_MINFOF.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT document = (org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AS_MINFOF_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT document = (org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.AS_MINCOMMERCE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.monitoring.FIMEX_WF.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT document = (org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.FIMEX_WF_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.CO_MINFOF_FORET.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT document = (org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CO_MINFOF_FORET_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT document = (org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CO_MINFOF_FAUNE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.LVTB_MINFOF.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT document = (org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.LVTB_MINFOF_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.ap.BSBE_MINFOF.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT document = (org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.BSBE_MINFOF_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();

        } else if (documentSerializable instanceof org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT document = (org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.IRPM_MINCOMMERCE_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        }

        return output;
    }

    /**
     * Validate document.
     *
     * @param source the source
     * @param xsdPath the xsd path
     * @throws SAXException the SAX exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static void validateDocument(final JAXBSource source, final String xsdPath) throws SAXException, IOException {
        final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        final Schema schema = sf.newSchema(new StreamSource(new ClassPathResource(xsdPath).getInputStream()));

        final Validator validator = schema.newValidator();
        validator.setErrorHandler(null);
        validator.validate(source);
    }

    /**
     * Prepare cct document.
     *
     * @param documentSerializable the document serializable
     * @param ebxmlFolder the ebxml folder
     * @param service the service
     * @param documentType the document type
     * @return the file
     * @throws JAXBException the JAXB exception
     * @throws SAXException the SAX exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static ByteArrayOutputStream prepareCctDocument(final Serializable documentSerializable, String service, String documentType) throws JAXBException, SAXException, IOException {

        JAXBContext jaxbContext;
        Marshaller jaxbMarshallerz;
        final ByteArrayOutputStream output = new ByteArrayOutputStream();

        if (documentSerializable instanceof org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.cct.CCT_CT.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT document = (org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CCT_CT_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.cct.CCT_CT_E.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document = (org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CCT_CT_E_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.cct.CC_CT.JAXBContextCreator.getInstance();

            final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT document = (org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CC_CT_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        } else if (documentSerializable instanceof org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) {
            jaxbContext = org.guce.siat.jaxb.cct.CQ_CT.JAXBContextCreator.getInstance();
            final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT document = (org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) documentSerializable;
            jaxbMarshallerz = jaxbContext.createMarshaller();

            final JAXBSource source = new JAXBSource(jaxbContext, document);
            validateDocument(source, ConstantsXsdPaths.CQ_CT_XSD_PATH);

            jaxbMarshallerz.marshal(document, output);
            documentType = document.getTYPEDOCUMENT();
            service = document.getREFERENCEDOSSIER().getSERVICE();
        }

        return output;
    }

    public static ByteArrayOutputStream preparePaymentDocument(final Serializable documentSerializable, String service, String documentType) throws JAXBException, SAXException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(PaymentDocument.class);
        PaymentDocument document = (PaymentDocument) documentSerializable;
        JAXBSource source = new JAXBSource(jaxbContext, document);
        validateDocument(source, ConstantsXsdPaths.PAYMENT_XSD_PATH);

        Marshaller jaxbMarshallerz = jaxbContext.createMarshaller();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        jaxbMarshallerz.marshal(document, output);

        documentType = document.getTYPEDOCUMENT();
        service = document.getREFERENCEDOSSIER().getSERVICE();

        return output;
    }

}

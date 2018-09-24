package org.guce.siat.core.ct.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.persistence.PersistenceException;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.exceptions.CmisObjectNotFoundException;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.mail.MailConstants;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FlowGuceSiat;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AlfrescoDirectoryCreator;
import org.guce.siat.common.service.EbxmlPropertiesService;
import org.guce.siat.common.service.FileProducer;
import org.guce.siat.common.service.FlowGuceSiatService;
import org.guce.siat.common.service.ItemFlowService;
import org.guce.siat.common.service.MailService;
import org.guce.siat.common.service.ValidationFlowService;
import org.guce.siat.common.service.XmlConverterService;
import org.guce.siat.common.utils.SiatUtils;
import org.guce.siat.common.utils.XmlXPathUtils;
import org.guce.siat.common.utils.ebms.ESBConstants;
import org.guce.siat.common.utils.ebms.EbmsUtility;
import org.guce.siat.common.utils.ebms.Generator;
import org.guce.siat.common.utils.enums.AperakType;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.exception.ValidationException;
import org.guce.siat.common.utils.ged.AlfrescoDirectoriesInitializer;
import org.guce.siat.common.utils.ged.CmisSession;
import org.guce.siat.common.utils.ged.CmisUtils;
import org.guce.siat.common.utils.io.IOUtils;
import org.guce.siat.core.ct.service.CtDocumentReciever;
import org.guce.siat.utility.jaxb.common.ERREURS;
import org.guce.siat.utility.jaxb.common.ERREURS.ERREUR;
import org.guce.siat.utility.jaxb.common.MESSAGE;
import org.guce.siat.utility.jaxb.common.REFERENCEDOSSIER;
import org.guce.siat.utility.jaxb.common.ROUTAGE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * The Class DocumentRecieverWSImpl.
 */
@PropertySources(value = @PropertySource("classpath:global-config.properties"))
@Service("ctDocumentReciever")
@Transactional(readOnly = true)
public class CtDocumentRecieverImpl implements CtDocumentReciever {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CtDocumentRecieverImpl.class);

    /**
     * The Constant APERAK_XSD_PATH.
     */
    private static final String APERAK_XSD_PATH = "/xsd/aperak/aperak.xsd";

    /**
     * The Constant REFERENCE_GUCE_EXPRESSION.
     */
    private static final String REFERENCE_GUCE_EXPRESSION = "/DOCUMENT/TYPE_DOCUMENT";

    /**
     * The xml folder.
     */
    @Value("${xml.folder}")
    private String xmlFolder;

    /**
     * The xml converter service.
     */
    @Autowired
    @Qualifier("xmlConverterService")
    private XmlConverterService xmlConverterService;

    /**
     * The validation flow service.
     */
    @Autowired
    private ValidationFlowService validationFlowService;

    /**
     * The flow guce siat service.
     */
    @Autowired
    private FlowGuceSiatService flowGuceSiatService;

    /**
     * The ebxml properties service.
     */
    @Autowired
    private EbxmlPropertiesService propertiesService;

    /**
     * The mail service.
     */
    @Autowired
    private MailService mailService;

    /**
     * the item flow service
     */
    @Autowired
    private ItemFlowService itemFlowService;

    /**
     * the file producer
     */
    @Autowired
    private FileProducer fileProducer;

    /**
     * The Constant NEGATIVE_APERAK_MAIL.
     */
    private static final String NEGATIVE_APERAK_MAIL = "negatifAperakReceived.vm";

    /**
     * The aperak document.
     */
    private org.guce.siat.utility.jaxb.aperak.DOCUMENT aperakDocument = new org.guce.siat.utility.jaxb.aperak.DOCUMENT();

    /**
     * The x path.
     */
    final XPath xPath = XPathFactory.newInstance().newXPath();

    /**
     * The file dao.
     */
    @Autowired
    private FileDao fileDao;

    /**
     * The item flow dao.
     */
    @Autowired
    private ItemFlowDao itemFlowDao;

    /**
     * The file item.
     */
    @Autowired
    private FileItemDao fileItemDao;

    /**
     * The alfresco directory creator.
     */
    @Autowired
    private AlfrescoDirectoryCreator alfrescoDirectoryCreator;

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CtDocumentReciever#uploadEbxmlFile(java.util.HashMap)
     */
    @SuppressWarnings("unchecked")
    @Override
    @Transactional(readOnly = false)
    public Map<String, Object> uploadEbxmlFile(final Map<String, Object> ebxmlBytes) throws ValidationException,
            ParseException, TransformerException, SOAPException, SAXException, ParserConfigurationException, JAXBException,
            XPathExpressionException {
        final HashMap<String, Object> data = new HashMap<>();
        Map<String, byte[]> attached;
        File xmlFile;
        byte[] response;
        String xmlContent;

        try {

            attached = (ebxmlBytes.get(ESBConstants.ATTACHMENT) != null ? (HashMap<String, byte[]>) ebxmlBytes
                    .get(ESBConstants.ATTACHMENT) : null);
            final String id = (String) ebxmlBytes.get(ESBConstants.ID);

            final byte[] xmlBytes = (byte[]) ebxmlBytes.get(ESBConstants.FLOW);
            final byte[] message = (byte[]) ebxmlBytes.get(ESBConstants.MESSAGE);
            final StringBuilder fileName = new StringBuilder(xmlFolder).append('/').append(id);
            xmlFile = new File(fileName.toString());
            FileUtils.writeByteArrayToFile(xmlFile, xmlBytes);

            // ebxmlMessage = EbxmlUtils.getEbxmlMessageFromBytes(ebxmlBytes);
            xmlContent = FileUtils.readFileToString(xmlFile, ESBConstants.CHARACTER_ENCODING);
            LOG.info(" check if the received message is an APERAK");
            final Element rootElement = XmlXPathUtils.stringToXMLDOM(xmlContent).getDocumentElement();

            // process received aperak
            if (processReceivedAperak(rootElement)) {
                return null;
            }

            // Validation metier
            validationFlowService.validateFlowFromGuce(rootElement);
            // Injection file in BDD
            final Serializable document = getReceivedDocument(xmlFile, xmlContent, xPath);
            LOG.info("################### getReceivedDocument finished");
            final org.guce.siat.common.model.File savedFile = xmlConverterService.saveReceivedFileAndExecuteFlow(document);
            LOG.info(" saveReceivedFileAndExecuteFlow finished");
            // Add PJ to GED
            LOG.info("Liste des fichiers attachés : {}", attached.size());
            if (MapUtils.isNotEmpty(attached)) {
                alfrescoDirectoryCreator.createDirectory(savedFile);
                final String attachmentRootFolder = alfrescoDirectoryCreator.generateAlfrescoPath(savedFile);

                final Session sessionCmisClient = CmisSession.getInstance();
                if (savedFile.getBureau() != null) {
                    try {
                        CmisUtils.getRootFolder(sessionCmisClient, attachmentRootFolder);
                    } catch (final CmisObjectNotFoundException e) {
                        LOG.info(Objects.toString(e), e);
                        final String bureauRootPath = attachmentRootFolder.replace(AlfrescoDirectoriesInitializer.SLASH
                                + savedFile.getBureau().getCode(), StringUtils.EMPTY);
                        final Folder bureauFolder = CmisUtils.getRootFolder(sessionCmisClient, bureauRootPath);
                        CmisUtils.createFolder(bureauFolder, savedFile.getBureau().getCode());
                    }
                }

                final List<File> attachedFiles = new ArrayList<>();
                for (final Map.Entry<String, byte[]> entry : attached.entrySet()) {
                    final File tempFile = new File(entry.getKey());
                    IOUtils.writeBytesToFile(tempFile, entry.getValue());
                    attachedFiles.add(tempFile);
                }

                final Folder folder = CmisUtils.getRootFolder(sessionCmisClient, attachmentRootFolder);
                CmisUtils.createFolder(folder, savedFile.getNumeroDossier());
                final StringBuilder directory = new StringBuilder();
                directory.append(attachmentRootFolder);
                directory.append(AlfrescoDirectoriesInitializer.SLASH);
                directory.append(savedFile.getNumeroDossier());
                CmisUtils.sendDocument(attachedFiles, CmisSession.getInstance(), directory.toString());
                LOG.info("################# Attachment Path is {} ", attachmentRootFolder);
            }
            // SIAT reference must be sent in the APERAK_F
            aperakDocument = generateAperakDocument(xmlContent, xPath, AperakType.APERAK_K.getCode(), null, savedFile);
            LOG.info("############## generateAperakDocument K finished");
            // xml file based on aperak document
            final java.io.File aperackDFile = generateXmlAperakFile(aperakDocument);
            LOG.info(" generateXmlAperakFile finished");
            final Path path = Paths.get(aperackDFile.getAbsolutePath());
            response = Files.readAllBytes(path);
            data.put(ESBConstants.FLOW, response);
            data.put(ESBConstants.ATTACHMENT, null);
            data.put(ESBConstants.TYPE_DOCUMENT, aperakDocument.getTYPEDOCUMENT());
            data.put(ESBConstants.SERVICE, aperakDocument.getREFERENCEDOSSIER().getSERVICE());
            data.put(ESBConstants.MESSAGE, message);
            data.put(ESBConstants.EBXML_TYPE, ESBConstants.APERAK);
            data.put(ESBConstants.TO_PARTY_ID, propertiesService.getToPartyId());
            data.put(ESBConstants.DEAD, "0");
            // put elements for backup
            final List<ItemFlow> itemFlowList = itemFlowService
                    .findLastItemFlowsByFileItemList(savedFile.getFileItemsList());
            data.put(ESBConstants.FILE, savedFile);
            data.put(ESBConstants.CURRENT_FLOW, itemFlowList.get(0).getFlow().getCode());
            data.put(ESBConstants.ITEM_FLOW_IDS, SiatUtils.getEntitiesIds(itemFlowList));
            // create backup
            fileProducer.createAperakBackup(data);
            LOG.info(" generateEbxmlFiles aperak K finished");
        } catch (final IOException e) {
            LOG.error("#####Error to connect to ressource:" + e.getMessage(), e);
            throw new RuntimeException("Technical Exception occured : " + e.getMessage());
        } catch (final ValidationException e) {
            LOG.error("####Error to parse document: " + Objects.toString(e), e);
            throw new ValidationException("Validation Exception : " + e.getMessage());
        } catch (final ParseException e) {
            LOG.error("####Error ParseException: " + e.getMessage(), e);
            throw new ParseException("Parse Exception : " + e.getMessage(), 0);
        } catch (final SAXException e) {
            LOG.error("####Error to parse document: " + Objects.toString(e), e);
            throw new SAXException("SAX Exception : " + e.getMessage());
        } catch (final ParserConfigurationException e) {
            LOG.error("####Error to parse document: {}", Objects.toString(e));
            throw new ParserConfigurationException("ParserConfiguration Exception : " + e.getMessage());
        } catch (final JAXBException e) {
            LOG.error("####Error to parse document: " + Objects.toString(e), e);
            throw new JAXBException("JAXB Exception " + e.getMessage());
        } catch (final XPathExpressionException e) {
            LOG.error("####Error to parse document: " + Objects.toString(e), e);
            throw new XPathExpressionException("XPathExpression Exception " + e.getMessage());
        } catch (final PersistenceException e) {
            LOG.error("####Error to parse document: " + Objects.toString(e), e);
            throw new PersistenceException("PersistenceException Exception " + e.getMessage());
        } catch (final IndexOutOfBoundsException e) {
            LOG.error("####Error to parse document: " + Objects.toString(e), e);
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException Exception " + e.getMessage());
        } catch (final NullPointerException e) {
            LOG.error("####Error to parse document: ", e);
            throw new NullPointerException("NullPointerException Exception " + e.getMessage());
        } catch (Exception e) {
            LOG.warn("####Cannot create aperak backup: ", e);
        }
        return data;

    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CtDocumentReciever#generateAperakCFile(java.util.HashMap, java.lang.String)
     */
    @Override
    public Map<String, Object> generateAperakCFile(final Map<String, Object> ebxmlBytes, final String errorMessage) throws Exception {

        final Map<String, Object> data = new HashMap<>();
        final Map<String, byte[]> attached = new HashMap<>();
        File xmlFile;
        byte[] response;
        String xmlContent;

        try {

            final byte[] xmlBytes = (byte[]) ebxmlBytes.get(ESBConstants.FLOW);
            final byte[] message = (byte[]) ebxmlBytes.get(ESBConstants.MESSAGE);
            final StringBuilder fileName = new StringBuilder(xmlFolder).append('/').append(ESBConstants.ID);
            xmlFile = new File(fileName.toString());
            FileUtils.writeByteArrayToFile(xmlFile, xmlBytes);
            xmlContent = FileUtils.readFileToString(xmlFile);
            aperakDocument = generateAperakDocument(xmlContent, xPath, AperakType.APERAK_C.getCode(), errorMessage, null);
            // xml file based on aperak document
            final java.io.File aperakCFile = generateXmlAperakFile(aperakDocument);

            final Path path = Paths.get(aperakCFile.getAbsolutePath());
            response = Files.readAllBytes(path);
            data.put(ESBConstants.FLOW, response);
            data.put(ESBConstants.ATTACHMENT, attached);
            data.put(ESBConstants.TYPE_DOCUMENT, aperakDocument.getTYPEDOCUMENT());
            data.put(ESBConstants.SERVICE, aperakDocument.getREFERENCEDOSSIER().getSERVICE());
            data.put(ESBConstants.EBXML_TYPE, ESBConstants.APERAK);
            data.put(ESBConstants.TO_PARTY_ID, propertiesService.getToPartyId());
            data.put(ESBConstants.MESSAGE, message);
            data.put(ESBConstants.DEAD, "0");
        } catch (final Exception e) {
            LOG.error("Error to send Aprerack C :" + Objects.toString(e), e);
            throw new RuntimeException("Error to send Aprerack C :{}", e);
        }

        return data;

    }

    /**
     * Save received document.
     *
     * @param xmlFile the xml file
     * @param xmlContent the xml content
     * @param xPath the x path
     * @return Document
     * @throws XPathExpressionException the x path expression exception
     * @throws JAXBException the JAXB exception
     */
    public Serializable getReceivedDocument(final File xmlFile, final String xmlContent, final XPath xPath)
            throws XPathExpressionException, JAXBException {
        final InputSource source = new InputSource(new StringReader(xmlContent));
        final String flowSource = xPath.evaluate(REFERENCE_GUCE_EXPRESSION, source);
        System.out.println("org.guce.siat.core.ct.service.impl.CtDocumentRecieverImpl.getReceivedDocument()");
        System.out.println("flow comming from webguce : " + flowSource);

        final FlowGuceSiat flowGuceSiat = flowGuceSiatService.findFlowGuceSiatByFlowGuce(flowSource);
        System.out.println("flow guce siat : ");
        System.out.println(flowGuceSiat);
        System.out.println("file type : " + flowGuceSiat.getFileType().getCode());

        Serializable document = null;

        if (FileTypeCode.AIE_MINADER.equals(flowGuceSiat.getFileType().getCode())) {
            final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AIE_MINADER.JAXBContextCreator.getInstance();
            // Unmarshalling the document
            final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
            document = (org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
        }
        if (null != flowGuceSiat.getFileType().getCode()) {
            switch (flowGuceSiat.getFileType().getCode()) {
                case AE_MINADER: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AE_MINADER.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case EH_MINADER: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.EH_MINADER.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AS_MINADER: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AS_MINADER.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CAT_MINADER: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.CAT_MINADER.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case PIVPSRP_MINADER: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.PIVPSRP_MINADER.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case DI_MINADER: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.DI_MINADER.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AT_MINSANTE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AT_MINSANTE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case VTP_MINSANTE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.VTP_MINSANTE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case VTD_MINSANTE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.VTD_MINSANTE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AI_MINSANTE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AI_MINSANTE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AI_MINMIDT: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AI_MINMIDT.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AE_MINMIDT: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AE_MINMIDT.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CEA_MINMIDT: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.CEA_MINMIDT.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AT_MINEPIA: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AT_MINEPIA.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case VT_MINEPIA: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.VT_MINEPIA.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case VT_MINEPDED: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.VT_MINEPDED.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CP_MINEPDED: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.CP_MINEPDED.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AS_MINFOF: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.AS_MINFOF.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CCT_CT: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.cct.CCT_CT.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CCT_CT_E:
                case CCT_CT_E_PVI:
                case CCT_CT_E_ATP:
                case CCT_CT_E_FSTP:
                case CCT_CT_E_PVE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.cct.CCT_CT_E.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CC_CT: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.cct.CC_CT.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CQ_CT: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.cct.CQ_CT.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    System.out.println("jaxbContext null pour CQ_CT ? " + (jaxbContext == null));
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case DI_MINCOMMERCE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case DE_MINCOMMERCE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case IDI: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.IDI.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.IDI.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case IDE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.IDE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.IDE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case FIMEX: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.FIMEX.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case FIMEX_WF: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.FIMEX_WF.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CO_MINFOF_FORET: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.CO_MINFOF_FORET.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case CO_MINFOF_FAUNE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case AS_MINCOMMERCE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case LVTB_MINFOF: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.LVTB_MINFOF.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case BSBE_MINFOF: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.ap.BSBE_MINFOF.JAXBContextCreator.getInstance();
                    // Unmarshalling the document
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                case IRMP_MINCOMMERCE: {
                    final JAXBContext jaxbContext = org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.JAXBContextCreator.getInstance();
                    final Unmarshaller jaxbUnmarshallerz = jaxbContext.createUnmarshaller();
                    document = (org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT) jaxbUnmarshallerz.unmarshal(xmlFile);
                    break;
                }
                default:
                    break;
            }
        }
        return document;
    }

    /**
     * Generate aperak document.
     *
     * @param xmlDocument the xml document
     * @param xPath the x path
     * @param aperakType the aperak type
     * @param errorMessage the error message
     * @param savedFile the saved file
     * @return the document
     * @throws XPathExpressionException the x path expression exception
     */
    public org.guce.siat.utility.jaxb.aperak.DOCUMENT generateAperakDocument(final String xmlDocument, final XPath xPath,
            final String aperakType, final String errorMessage, final org.guce.siat.common.model.File savedFile)
            throws XPathExpressionException {

        final String numeroMessageOrigineExpression = "/DOCUMENT/MESSAGE/NUMERO_MESSAGE";
        final String dateEmissionMsgOrigineExpression = "/DOCUMENT/MESSAGE/DATE_EMISSION";

        final String dateCreationExpression = "/DOCUMENT/REFERENCE_DOSSIER/DATE_CREATION";
        final String numDemandeExpression = "/DOCUMENT/REFERENCE_DOSSIER/NUMERO_DEMANDE";
        final String numDossierExpression = "/DOCUMENT/REFERENCE_DOSSIER/NUMERO_DOSSIER";
        final String refGuceExpression = "/DOCUMENT/REFERENCE_DOSSIER/REFERENCE_GUCE";
        final String refSiatExpression = "/DOCUMENT/REFERENCE_DOSSIER/REFERENCE_SIAT";
        final String siExpression = "/DOCUMENT/REFERENCE_DOSSIER/SI";
        final String serviceExpression = "/DOCUMENT/REFERENCE_DOSSIER/SERVICE";
        final String emetteurExpression = "/DOCUMENT/ROUTAGE/EMETTEUR";
        final String destinataireExpression = "/DOCUMENT/ROUTAGE/DESTINATAIRE";

        final InputSource numeroMessageOrigineSource = new InputSource(new StringReader(xmlDocument));
        final InputSource dateEmissionMsgOrigineSource = new InputSource(new StringReader(xmlDocument));

        final InputSource dateCreationSource = new InputSource(new StringReader(xmlDocument));
        final InputSource numDemandeSource = new InputSource(new StringReader(xmlDocument));
        final InputSource numDossierSource = new InputSource(new StringReader(xmlDocument));
        final InputSource refGuceSource = new InputSource(new StringReader(xmlDocument));
        final InputSource refSiatSource = new InputSource(new StringReader(xmlDocument));
        final InputSource siSource = new InputSource(new StringReader(xmlDocument));
        final InputSource serviceSource = new InputSource(new StringReader(xmlDocument));

        final InputSource emetteurSource = new InputSource(new StringReader(xmlDocument));
        final InputSource destinataireSource = new InputSource(new StringReader(xmlDocument));

        final String numeroMessageOrigine = xPath.evaluate(numeroMessageOrigineExpression, numeroMessageOrigineSource);
        final String dateEmissionMsgOrigine = xPath.evaluate(dateEmissionMsgOrigineExpression, dateEmissionMsgOrigineSource);

        final String dateCreation = xPath.evaluate(dateCreationExpression, dateCreationSource);
        final String numDemande = xPath.evaluate(numDemandeExpression, numDemandeSource);
        final String numDossier = xPath.evaluate(numDossierExpression, numDossierSource);
        final String refGuce = xPath.evaluate(refGuceExpression, refGuceSource);
        final String refSiat = xPath.evaluate(refSiatExpression, refSiatSource);
        final String siSiat = xPath.evaluate(siExpression, siSource);
        final String service = xPath.evaluate(serviceExpression, serviceSource);

        final String emetteur = xPath.evaluate(emetteurExpression, emetteurSource);
        final String destinataire = xPath.evaluate(destinataireExpression, destinataireSource);

        // MESSAGE
        final MESSAGE message = new MESSAGE();
        final String numeroMessage = Generator.generateMessageID();
        final String dateEmisson = EbmsUtility.getCurrentUTCDateTime();

        message.setDATEEMISSION(dateEmisson);
        message.setDATEEMISSIONMSGORIGINE(dateEmissionMsgOrigine);
        message.setNUMEROMESSAGE(numeroMessage);
        message.setNUMEROMESSAGEORIGINE(numeroMessageOrigine);
        message.setTYPEMESSAGE(StringUtils.EMPTY);
        message.setETAT(StringUtils.EMPTY);

        // REFERENCE DOSSIER
        final REFERENCEDOSSIER referencedossier = new REFERENCEDOSSIER();

        referencedossier.setDATECREATION(dateCreation);
        referencedossier.setNUMERODEMANDE(numDemande);
        referencedossier.setNUMERODOSSIER(numDossier);
        referencedossier.setREFERENCEGUCE(refGuce);
        referencedossier.setREFERENCESIAT(refSiat);
        referencedossier.setSERVICE(service);
        referencedossier.setSI(siSiat);
        if (AperakType.APERAK_K.name().equals(aperakType)) {
            referencedossier.setREFERENCESIAT(savedFile.getReferenceSiat());
        }
        // ROUTAGE

        final ROUTAGE routage = new ROUTAGE();

        routage.setEMETTEUR(destinataire);
        routage.setDESTINATAIRE(emetteur);
        final org.guce.siat.utility.jaxb.aperak.DOCUMENT aperakDocument = new org.guce.siat.utility.jaxb.aperak.DOCUMENT();
        aperakDocument.setTYPEDOCUMENT(aperakType);
        aperakDocument.setMESSAGE(message);
        aperakDocument.setREFERENCEDOSSIER(referencedossier);
        aperakDocument.setROUTAGE(routage);

        // APERAK CONTENT
        if (AperakType.APERAK_C.name().equals(aperakType)) {
            final ERREURS error = new ERREURS();
            error.setERREUR(new ERREUR());
            error.getERREUR().setCODEERREUR(StringUtils.EMPTY);
            error.getERREUR().setLIBELLEERREUR(errorMessage);
            error.getERREUR().setREFERENCEDONNEE(null);
            aperakDocument.setERREURS(error);
        }
        return aperakDocument;
    }

    /**
     * Generate xml aperak file.
     *
     * @param aperakDocument the aperak document
     * @return the java.io. file
     * @throws JAXBException the JAXB exception
     * @throws SAXException the SAX exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public java.io.File generateXmlAperakFile(final org.guce.siat.utility.jaxb.aperak.DOCUMENT aperakDocument)
            throws JAXBException, SAXException, IOException {
        final StringBuilder xmlFileNamebuilder = new StringBuilder(propertiesService.getXmlFolder()).append(File.separator)
                .append(Generator.generateMessageID()).append(ESBConstants.XML_FILE_EXTENSION);
        final java.io.File xmlFile = new java.io.File(xmlFileNamebuilder.toString());

        // JAXB instance of DOCUMENT
        final JAXBContext jaxbContext = org.guce.siat.utility.jaxb.aperak.JAXBContextCreator.getInstance();
        final JAXBSource source = new JAXBSource(jaxbContext, aperakDocument);
        final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        final Schema schema = sf.newSchema(new StreamSource(new ClassPathResource(APERAK_XSD_PATH).getInputStream()));

        // validation XSD
        final Validator validator = schema.newValidator();
        validator.setErrorHandler(null);
        validator.validate(source);

        // Marshalling the document
        final Marshaller jaxbMarshallerz = jaxbContext.createMarshaller();
        jaxbMarshallerz.marshal(aperakDocument, xmlFile);

        return xmlFile;
    }

    /**
     * Process received aperak.
     *
     * @param rootElement the root element
     * @return true, if successful
     */
    private boolean processReceivedAperak(final Element rootElement) {

        final String referenceSiatExpression = "/DOCUMENT/REFERENCE_DOSSIER/REFERENCE_SIAT";

        final String documentType = XmlXPathUtils.findSingleValue(REFERENCE_GUCE_EXPRESSION, rootElement);
        final String referenceSiat = XmlXPathUtils.findSingleValue(referenceSiatExpression, rootElement);
        if (StringUtils.isNotBlank(documentType) && StringUtils.isNotBlank(referenceSiat)) {
            final org.guce.siat.common.model.File siatFile = fileDao.findByRefSiat(referenceSiat);
            final List<FileItem> fileItems = siatFile.getFileItemsList();

            if (AperakType.APERAK_C.name().equals(documentType) || AperakType.APERAK_J.name().equals(documentType)) {
                LOG.debug("#################  {} Received ", documentType);
                // rollback the last decision
                String senderMail = null;
                for (final FileItem fileItem : fileItems) {
                    final ItemFlow itemflow = itemFlowDao.findLastOutgoingItemFlowByFileItem(fileItem);
                    senderMail = itemflow.getSender().getEmail();
                    itemflow.setReceived(AperakType.APERAK_C.getCharCode());
                    itemflow.setSent(Boolean.FALSE);
                    itemFlowDao.update(itemflow);
                    fileItem.setDraft(Boolean.TRUE);
                    fileItem.setStep(itemflow.getFlow().getFromStep());
                    fileItemDao.update(fileItem);
                }
                final String templateFileName = NEGATIVE_APERAK_MAIL;
                final Map<String, String> map = new HashMap<String, String>();
                map.put(MailConstants.SUBJECT, "SIAT : Dossier non envoyé");
                map.put(MailConstants.FROM, mailService.getFromValue());
                map.put(MailConstants.EMAIL, senderMail);
                map.put("refSiat", siatFile.getReferenceSiat());
                map.put(MailConstants.VMF, templateFileName);
                mailService.sendMail(map);
                return true;
            } else if (AperakType.APERAK_D.name().equals(documentType) || AperakType.APERAK_F.name().equals(documentType)) {
                LOG.debug("#################  {} Received ", documentType);
                for (final FileItem fileItem : fileItems) {
                    final ItemFlow itemFlow = itemFlowDao.findLastOutgoingItemFlowByFileItem(fileItem);
                    if (itemFlow != null) {
                        itemFlow.setReceived(AperakType.APERAK_D.getCharCode());
                        itemFlowDao.update(itemFlow);
                    }
                }
                return true;
            }
        }
        return false;
    }
}


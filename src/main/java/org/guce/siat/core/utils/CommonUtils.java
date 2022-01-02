package org.guce.siat.core.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.JAXBException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.exceptions.CmisObjectNotFoundException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.service.AlfrescoDirectoryCreator;
import org.guce.siat.common.service.EbxmlPropertiesService;
import org.guce.siat.common.service.FileService;
import org.guce.siat.common.utils.PropertiesConstants;
import org.guce.siat.common.utils.PropertiesLoader;
import org.guce.siat.common.utils.XmlXPathUtils;
import org.guce.siat.common.utils.ebms.ESBConstants;
import org.guce.siat.common.utils.enums.AperakType;
import org.guce.siat.common.utils.enums.ValidationType;
import org.guce.siat.common.utils.exception.ValidationException;
import org.guce.siat.common.utils.ged.AlfrescoDirectoriesInitializer;
import org.guce.siat.common.utils.ged.CmisSession;
import org.guce.siat.common.utils.ged.CmisUtils;
import org.guce.siat.core.ct.service.impl.CtDocumentRecieverImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author tadzotsa
 */
public class CommonUtils {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CommonUtils.class);

    /**
     * The Constant LOCAL_BUNDLE_NAME.
     */
    private static final String LOCAL_BUNDLE_NAME = "org.guce.siat.messages.locale";

    public static <E> E clone(E source) throws Exception {

        final Class clazz = source.getClass();
        final Object result = clazz.newInstance();

        final Field[] allFields = clazz.getDeclaredFields();
        for (final Field field : allFields) {

            if (field.isAnnotationPresent(Column.class) || field.isAnnotationPresent(JoinColumn.class)
                    || field.isAnnotationPresent(OneToMany.class) || field.isAnnotationPresent(Transient.class)) {

                final String fieldName = field.getName();
                final String getter = (!"boolean".equals(field.getType().getName()) ? "get" : "is")
                        + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                final Method getterMethod = clazz.getMethod(getter);
                final Object value = getterMethod.invoke(source);
                final String setter = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                final Method setterMethod = clazz.getMethod(setter, field.getType());
                setterMethod.invoke(result, value);
            }
        }

        return (E) result;
    }

    public static org.guce.siat.common.model.File saveAttachments(ValidationException ve, Element rootElement, Map<String, byte[]> attached,
            AlfrescoDirectoryCreator alfrescoDirectoryCreator, PropertiesLoader propertiesLoader, FileService fileService) throws IOException, ValidationException {

        if (!ResourceBundle.getBundle(LOCAL_BUNDLE_NAME, Locale.FRANCE).getString(ValidationType.VALIDATE_LAST_FLOW.getCode()).equals(ve.getMessage())) {
            throw ve;
        }

        String referenceGuceExpression = "/DOCUMENT/REFERENCE_DOSSIER/NUMERO_DOSSIER";
        String numeroDossier = XmlXPathUtils.findSingleValue(referenceGuceExpression, rootElement);
        org.guce.siat.common.model.File savedFile = fileService.findByNumDossierGuce(numeroDossier);

        addAttachmentsToGED(propertiesLoader, alfrescoDirectoryCreator, savedFile, attached);

        return savedFile;
    }

    public static void addAttachmentsToGED(PropertiesLoader propertiesLoader, AlfrescoDirectoryCreator alfrescoDirectoryCreator, org.guce.siat.common.model.File savedFile, Map<String, byte[]> attached) throws IOException {
        // Add PJ to GED
        if (attached == null || attached.isEmpty()) {
            return;
        }
        if (savedFile == null) {
            return;
        }
        LOG.info("Liste des fichiers attachés : {}", attached.size());
        alfrescoDirectoryCreator.createDirectory(savedFile);
        String attachmentRootFolder = alfrescoDirectoryCreator.generateAlfrescoPath(savedFile);

        Session sessionCmisClient = CmisSession.getInstance();
        if (savedFile.getBureau() != null) {
            try {
                CmisUtils.getRootFolder(sessionCmisClient, attachmentRootFolder);
            } catch (CmisObjectNotFoundException e) {
                LOG.info(Objects.toString(e), e);
                String bureauRootPath = attachmentRootFolder.replace(AlfrescoDirectoriesInitializer.SLASH
                        + savedFile.getBureau().getCode(), StringUtils.EMPTY);
                Folder bureauFolder = CmisUtils.getRootFolder(sessionCmisClient, bureauRootPath);
                CmisUtils.createFolder(bureauFolder, savedFile.getBureau().getCode());
            }
        }

        List<File> attachedFiles = new ArrayList<>();
        for (Map.Entry<String, byte[]> entry : attached.entrySet()) {
            String attachmentFolder = propertiesLoader.getProperty(PropertiesConstants.ATTACHMENT_FOLDER);
            String finalFileName = entry.getKey();
            if (finalFileName.matches("\\d{14}-.*")) {
                finalFileName = finalFileName.substring(15);
            }
            File tempFile = new File(attachmentFolder, finalFileName);
            FileUtils.writeByteArrayToFile(tempFile, entry.getValue());
            attachedFiles.add(tempFile);
        }

        Folder folder = CmisUtils.getRootFolder(sessionCmisClient, attachmentRootFolder);
        CmisUtils.createFolder(folder, savedFile.getNumeroDossier());
        StringBuilder directory = new StringBuilder();
        directory.append(attachmentRootFolder);
        directory.append(AlfrescoDirectoriesInitializer.SLASH);
        directory.append(savedFile.getNumeroDossier());
        CmisUtils.sendDocument(attachedFiles, CmisSession.getInstance(), directory.toString());
        LOG.info("################# Attachment Path is {} ", directory.toString());
        for (File attachedFile : attachedFiles) {
            attachedFile.delete();
        }
    }

    public static Map<String, Object> generateAperak(EbxmlPropertiesService propertiesService, CtDocumentRecieverImpl documentReciever, String xmlContent, XPath xPath, byte[] message, org.guce.siat.common.model.File savedFile) throws JAXBException, SAXException, IOException, XPathExpressionException {
        org.guce.siat.utility.jaxb.aperak.DOCUMENT aperakDocument = documentReciever.generateAperakDocument(xmlContent, xPath, AperakType.APERAK_K.getCode(), null, savedFile);
        LOG.info("############## generateAperakDocument K finished");
        byte[] response = documentReciever.generateAperakData(aperakDocument);
        Map<String, Object> data = new HashMap<>();
        data.put(ESBConstants.FLOW, response);
        data.put(ESBConstants.ATTACHMENT, null);
        data.put(ESBConstants.TYPE_DOCUMENT, aperakDocument.getTYPEDOCUMENT());
        data.put(ESBConstants.SERVICE, aperakDocument.getREFERENCEDOSSIER().getSERVICE());
        data.put(ESBConstants.MESSAGE, message);
        data.put(ESBConstants.EBXML_TYPE, ESBConstants.APERAK);
        data.put(ESBConstants.TO_PARTY_ID, propertiesService.getToPartyId());
        data.put(ESBConstants.DEAD, "0");
        return data;
    }

    private CommonUtils() {
    }

}

package org.guce.siat.core.ct.service.impl;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Document;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.data.ContentStream;
import org.apache.chemistry.opencmis.commons.exceptions.CmisObjectNotFoundException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AlfrescoDirectoryCreator;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.PropertiesConstants;
import org.guce.siat.common.utils.PropertiesLoader;
import org.guce.siat.common.utils.ged.AlfrescoDirectoriesInitializer;
import org.guce.siat.common.utils.ged.CmisSession;
import org.guce.siat.common.utils.ged.CmisUtils;
import org.guce.siat.core.ct.dao.UserStampSignatureDao;
import org.guce.siat.core.ct.model.UserStampSignature;
import org.guce.siat.core.ct.service.UserStampSignatureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class UserStampSignatureServiceImpl.
 */
@Service("userStampSignatureService")
@Transactional(readOnly = true)
public class UserStampSignatureServiceImpl extends AbstractServiceImpl<UserStampSignature> implements UserStampSignatureService {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserStampSignatureServiceImpl.class);

    /**
     * The user signature stamp dao.
     */
    @Autowired
    private UserStampSignatureDao userStampSignatureDao;

    /**
     * The properties loader
     */
    @Autowired
    private PropertiesLoader propertiesLoader;

    /**
     * The alfresco directory creator.
     */
    @Autowired
    private AlfrescoDirectoryCreator alfrescoDirectoryCreator;

    /**
     * Instantiates a new user stamp service impl.
     */
    public UserStampSignatureServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<UserStampSignature> getJpaDao() {
        return userStampSignatureDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<UserStampSignature> jpaDao) {
        this.userStampSignatureDao = (UserStampSignatureDao) jpaDao;

    }

    @Override
    public UserStampSignature findUserStampSignatureByUser(User user) {
        return userStampSignatureDao.findUserStampSignatureByUser(user);
    }

    @Override
    public UserStampSignature saveUserStampSignature(User user, byte[] signatureData, String signatureFileName, byte[] stampData, String stampFileName) throws IOException {
        UserStampSignature userStampSignature = userStampSignatureDao.findUserStampSignatureByUser(user);
        if (userStampSignature == null) {
            userStampSignature = new UserStampSignature();
        }
        List<File> attachedFiles = new ArrayList<>();
        if (signatureData != null && StringUtils.isNotEmpty(signatureFileName)) {
            String attachmentFolder = propertiesLoader.getProperty(PropertiesConstants.ATTACHMENT_FOLDER);
            String finalFileName = signatureFileName;
            if (finalFileName.matches("\\d{14}-.*")) {
                finalFileName = finalFileName.substring(15);
            }
            File tempFile = new File(attachmentFolder, finalFileName);
            FileUtils.writeByteArrayToFile(tempFile, signatureData);
            attachedFiles.add(tempFile);
        }
        if (stampData != null && StringUtils.isNotEmpty(stampFileName)) {
            String attachmentFolder = propertiesLoader.getProperty(PropertiesConstants.ATTACHMENT_FOLDER);
            String finalFileName = stampFileName;
            if (finalFileName.matches("\\d{14}-.*")) {
                finalFileName = finalFileName.substring(15);
            }
            File tempFile = new File(attachmentFolder, finalFileName);
            FileUtils.writeByteArrayToFile(tempFile, stampData);
            attachedFiles.add(tempFile);
        }

        if (!attachedFiles.isEmpty()) {
            Session sessionCmisClient = CmisSession.getInstance();
            final StringBuilder pathBuilder = new StringBuilder();
            final Folder rootFolder = CmisUtils.getRootFolder(sessionCmisClient, AlfrescoDirectoriesInitializer.GED_DIRECTORY);
            pathBuilder.append(AlfrescoDirectoriesInitializer.GED_DIRECTORY).append(AlfrescoDirectoriesInitializer.SLASH).append("CT");
            String appName = "CT";
            Folder appFolder = null;
            try {
                appFolder = CmisUtils.getRootFolder(sessionCmisClient, pathBuilder.toString());
            } catch (final CmisObjectNotFoundException e) {
                appFolder = CmisUtils.createFolder(rootFolder, appName);
            }
            if (appFolder == null) {
                appFolder = CmisUtils.createFolder(rootFolder, appName);
            }
            pathBuilder.append(AlfrescoDirectoriesInitializer.SLASH).append("USERS-SIGNATURE-STAMP");
            Folder signatureStampRootFolder;
            try {
                signatureStampRootFolder = CmisUtils.getRootFolder(sessionCmisClient, pathBuilder.toString());
            } catch (final CmisObjectNotFoundException e) {
                signatureStampRootFolder = CmisUtils.createFolder(appFolder, "USERS-SIGNATURE-STAMP");
            }
            CmisUtils.createFolder(signatureStampRootFolder, user.getLogin());
            StringBuilder directory = new StringBuilder();
            directory.append(pathBuilder.toString());
            directory.append(AlfrescoDirectoriesInitializer.SLASH);
            directory.append(user.getLogin());
            CmisUtils.sendDocument(attachedFiles, CmisSession.getInstance(), directory.toString());
            LOG.info("################# Attachment Path is {} ", pathBuilder.toString());
            userStampSignature.setUser(user);
            if (signatureData != null && StringUtils.isNotEmpty(signatureFileName)) {
                userStampSignature.setSignaturePath(directory.toString() + AlfrescoDirectoriesInitializer.SLASH + signatureFileName);
            }
            if (stampData != null && StringUtils.isNotEmpty(stampFileName)) {
                userStampSignature.setStampPath(directory.toString() + AlfrescoDirectoriesInitializer.SLASH + stampFileName);
            }
            if (userStampSignature.getId() != null) {
                userStampSignatureDao.update(userStampSignature);
            } else {
                userStampSignatureDao.save(userStampSignature);
            }
        }
        return userStampSignature;
    }

    @Override
    public InputStream getUserSignature(User user) throws Exception {
        byte[] userSignatureByte = getUserSignatureAsByte(user);
        if (userSignatureByte != null) {
            return new ByteArrayInputStream(userSignatureByte);
        }
        return null;
    }

    @Override
    public byte[] getUserSignatureAsByte(User user) throws Exception {
        byte[] signatureData = null;
        Session sessionCmisClient = CmisSession.getInstance();
        UserStampSignature userStampSignature = userStampSignatureDao.findUserStampSignatureByUser(user);
        if (userStampSignature != null) {
            CmisObject object = sessionCmisClient.getObjectByPath(userStampSignature.getSignaturePath());
            Document doc = (Document) object;

            ContentStream contentStream = doc.getContentStream();
            ByteArrayOutputStream file = new ByteArrayOutputStream();
            if (contentStream != null) {
                InputStream stream = contentStream.getStream();
                try {
                    IOUtils.copy(stream, file);
                } finally {
                    IOUtils.closeQuietly(stream);
                }
            }
            return file.toByteArray();
        }
        return signatureData;
    }

    @Override
    public InputStream getUserStamp(User user) throws Exception {
        byte[] userStampByte = getUserStampAsByte(user);
        if (userStampByte != null) {
            return new ByteArrayInputStream(userStampByte);
        }
        return null;
    }

    @Override
    public byte[] getUserStampAsByte(User user) throws Exception {
        byte[] stampData = null;
        Session sessionCmisClient = CmisSession.getInstance();
        UserStampSignature userStampSignature = userStampSignatureDao.findUserStampSignatureByUser(user);
        if (userStampSignature != null) {
            CmisObject object = sessionCmisClient.getObjectByPath(userStampSignature.getStampPath());
            Document doc = (Document) object;
            ContentStream contentStream = doc.getContentStream();
            ByteArrayOutputStream file = new ByteArrayOutputStream();
            if (contentStream != null) {
                InputStream stream = contentStream.getStream();
                try {
                    IOUtils.copy(stream, file);
                } finally {
                    IOUtils.closeQuietly(stream);
                }
            }
            return file.toByteArray();
        }
        return stampData;
    }

    @Override
    public InputStream getUserSignature(UserStampSignature userStampSignature) throws Exception {
        byte[] userSignatureByte = getUserSignatureAsByte(userStampSignature);
        if (userSignatureByte != null) {
            return new ByteArrayInputStream(userSignatureByte);
        }
        return null;
    }

    @Override
    public byte[] getUserSignatureAsByte(UserStampSignature userStampSignature) throws Exception {
        byte[] signatureData = null;
        Session sessionCmisClient = CmisSession.getInstance();
        if (userStampSignature != null) {
            CmisObject object = sessionCmisClient.getObjectByPath(userStampSignature.getSignaturePath());
            Document doc = (Document) object;

            ContentStream contentStream = doc.getContentStream();
            ByteArrayOutputStream file = new ByteArrayOutputStream();
            if (contentStream != null) {
                InputStream stream = contentStream.getStream();
                try {
                    IOUtils.copy(stream, file);
                } finally {
                    IOUtils.closeQuietly(stream);
                }
            }
            return file.toByteArray();
        }
        return signatureData;
    }

    @Override
    public InputStream getUserStamp(UserStampSignature userStampSignature) throws Exception {
        byte[] userStampByte = getUserStampAsByte(userStampSignature);
        if (userStampByte != null) {
            return new ByteArrayInputStream(userStampByte);
        }
        return null;
    }

    @Override
    public byte[] getUserStampAsByte(UserStampSignature userStampSignature) throws Exception {
        byte[] stampData = null;
        Session sessionCmisClient = CmisSession.getInstance();
        if (userStampSignature != null) {
            CmisObject object = sessionCmisClient.getObjectByPath(userStampSignature.getStampPath());
            Document doc = (Document) object;
            ContentStream contentStream = doc.getContentStream();
            ByteArrayOutputStream file = new ByteArrayOutputStream();
            if (contentStream != null) {
                InputStream stream = contentStream.getStream();
                try {
                    IOUtils.copy(stream, file);
                } finally {
                    IOUtils.closeQuietly(stream);
                }
            }
            return file.toByteArray();
        }
        return stampData;
    }

    @Override
    public String getMimeType(byte data[]) throws Exception {
        InputStream is = new BufferedInputStream(new ByteArrayInputStream(data));
        String mimeType = URLConnection.guessContentTypeFromStream(is);
        return mimeType;
    }

    @Override
    public String getFileNameFormPath(String path) {
        return StringUtils.substringAfterLast(path, AlfrescoDirectoriesInitializer.SLASH);
    }
}

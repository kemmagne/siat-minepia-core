package org.guce.siat.core.ct.service;

import java.io.IOException;
import java.io.InputStream;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.UserStampSignature;

/**
 * The Interface UserStampSignatureService.
 */
public interface UserStampSignatureService extends AbstractService<UserStampSignature> {

    /**
     * Find user stamp signature by user infos by user.
     *
     * @param user the user
     * @return the user stamp and signature
     */
    UserStampSignature findUserStampSignatureByUser(User user);
    
    UserStampSignature saveUserStampSignature(User user, byte[] signatureData, String signatureFileName, byte[] stampData, String stampFileName) throws IOException;
    
    public InputStream getUserSignature(User user) throws Exception;
    
    public byte[] getUserSignatureAsByte(User user) throws Exception;
    
    public InputStream getUserStamp(User user) throws Exception;
    
    public byte[] getUserStampAsByte(User user) throws Exception;
    
    
    public InputStream getUserSignature(UserStampSignature userStampSignature) throws Exception;
    
    public byte[] getUserSignatureAsByte(UserStampSignature userStampSignature) throws Exception;
    
    public InputStream getUserStamp(UserStampSignature userStampSignature) throws Exception;
    
    public byte[] getUserStampAsByte(UserStampSignature userStampSignature) throws Exception;
    
    public String getMimeType(byte data[]) throws Exception;
    
    public String getFileNameFormPath(String path);

}

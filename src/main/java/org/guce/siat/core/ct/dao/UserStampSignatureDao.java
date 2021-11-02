package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.model.UserStampSignature;

/**
 * The Interface UserStampSignatureDao.
 */
public interface UserStampSignatureDao extends AbstractJpaDao<UserStampSignature> {

    /**
     * Find user stamp signature by user infos by user.
     *
     * @param user the user
     * @return the user stamp and signature
     */
    UserStampSignature findUserStampSignatureByUser(User user);
}

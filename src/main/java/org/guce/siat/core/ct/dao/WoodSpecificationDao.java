package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;

public interface WoodSpecificationDao extends AbstractJpaDao {

   List findByFile(File var1);

   void removeByFile(File var1);
}

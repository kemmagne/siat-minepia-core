package org.guce.siat.core.ct.service.impl;

import java.util.List;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.WoodSpecificationDao;
import org.guce.siat.core.ct.service.WoodSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("woodSpecificationService")
@Transactional(
   readOnly = true
)
public class WoodSpecificationServiceImpl extends AbstractServiceImpl implements WoodSpecificationService {

   @Autowired
   private WoodSpecificationDao woodSpecificationDao;


   public AbstractJpaDao getJpaDao() {
      return this.woodSpecificationDao;
   }

   public void setJpaDao(AbstractJpaDao jpaDao) {
      this.woodSpecificationDao = (WoodSpecificationDao)jpaDao;
   }

   public List findByFile(File file) {
      return this.woodSpecificationDao.findByFile(file);
   }
}

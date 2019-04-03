package org.guce.siat.core.ct.dao.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.File;
import org.guce.siat.core.ct.dao.WoodSpecificationDao;
import org.guce.siat.core.ct.model.WoodSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("woodSpecificationDao")
@Transactional(
   propagation = Propagation.REQUIRED
)
public class WoodSpecificationDaoImpl extends AbstractJpaDaoImpl implements WoodSpecificationDao {

   private static final Logger LOG = LoggerFactory.getLogger(AbstractJpaDaoImpl.class);


   public WoodSpecificationDaoImpl() {
      this.setClasse(WoodSpecification.class);
   }

   public List findByFile(File file) {
      if(file != null) {
         String hqlString = "SELECT w FROM WoodSpecification w WHERE w.file.id= :fileId";
         TypedQuery query = super.entityManager.createQuery("SELECT w FROM WoodSpecification w WHERE w.file.id= :fileId", WoodSpecification.class);
         query.setParameter("fileId", file.getId());
         return query.getResultList();
      } else {
         return Collections.emptyList();
      }
   }

   public void removeByFile(File file) {
      if(file != null) {
         String queryString = "DELETE FROM WoodSpecification w WHERE w.file.id=:fileId";
         Query query = super.entityManager.createQuery("DELETE FROM WoodSpecification w WHERE w.file.id=:fileId");
         query.setParameter("fileId", file.getId());
         int executeUpdate = query.executeUpdate();
         LOG.info("{} item(s) deleted ", Integer.valueOf(executeUpdate));
      }

   }

}

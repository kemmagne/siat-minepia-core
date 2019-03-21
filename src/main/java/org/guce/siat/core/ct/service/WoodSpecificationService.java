package org.guce.siat.core.ct.service;

import java.util.List;
import org.guce.siat.common.model.File;
import org.guce.siat.common.service.AbstractService;

public interface WoodSpecificationService extends AbstractService {

   List findByFile(File var1);
}

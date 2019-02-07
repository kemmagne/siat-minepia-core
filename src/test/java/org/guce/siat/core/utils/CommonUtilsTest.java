package org.guce.siat.core.utils;

import java.util.Arrays;
import org.guce.siat.core.ct.model.InspectionReport;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author tadzotsa
 */
public class CommonUtilsTest {

    @Ignore
    @Test
    public void test() throws Exception {
        final InspectionReport ir = new InspectionReport();
        ir.setTreatmentTypesList(Arrays.asList("A", "B", "C"));
        ir.setStorageEnvsList(Arrays.asList("A", "B", "C"));
        final InspectionReport irClone = CommonUtils.clone(ir);
        irClone.prePersist();
        System.out.println(irClone.getTreatmentTypes());
        System.out.println(irClone.getTreatmentTypesList());
        System.out.println(irClone.getStorageEnvs());
        System.out.println(irClone.getStorageEnvsList());
    }

}

package org.guce.siat.core.ct.service;

import java.io.File;
import java.util.Map;
import junit.framework.TestCase;
import org.guce.siat.common.service.ValidationFlowService;
import org.guce.siat.common.service.XmlConverterService;
import org.guce.siat.common.utils.EbxmlUtils;
import org.guce.siat.core.ct.service.impl.CtDocumentRecieverImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author ht
 */
@RunWith(MockitoJUnitRunner.class)
public class CtDocumentRecieverTest extends TestCase {

    @Mock
    private ValidationFlowService validationFlowService;
    private CtDocumentReciever documentReciever;
    @Mock
    private XmlConverterService xmlConverterService;

    private org.guce.siat.common.model.File file;

    @Before
    @Override
    public void setUp() throws Exception {
        Mockito.when(validationFlowService.validateFlowFromGuce(null)).thenReturn(true);
        file = new org.guce.siat.common.model.File();
        Mockito.when(xmlConverterService.convertDocumentToFile(null)).thenReturn(file);
        documentReciever = Mockito.mock(CtDocumentRecieverImpl.class);
    }

    @Ignore
    @Test
    public void test_uploadEbxmlFile() throws Exception {
        String path = "C:\\Users\\ht\\Downloads\\20201027-130317-94846@172.24.2.20.ebxml";
        byte[] bytes = org.apache.commons.io.FileUtils.readFileToByteArray(new File(path));
        Map<String, Object> messageMap = EbxmlUtils.ebxmlToMap(bytes);
        documentReciever.uploadEbxmlFile(messageMap);
    }

}

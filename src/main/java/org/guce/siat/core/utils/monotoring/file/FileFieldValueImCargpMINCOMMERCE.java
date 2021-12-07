package org.guce.siat.core.utils.monotoring.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE.DOCUMENT;

/**
 * The class FileFieldValueIrmpMINCOMMERCE
 *
 * @author yenke
 */
public class FileFieldValueImCargpMINCOMMERCE {

    public static FileFieldValue generateFileFieldValueImCargMINCOMMERCE(final File file, final FileField fileField,
            final DOCUMENT document, final ApplicationPropretiesService applicationPropretiesService) {

        final FileFieldValue fileFieldValue = new FileFieldValue();
        fileFieldValue.setFileField(fileField);
        fileFieldValue.setFile(file);
        switch (fileField.getCode()) {
        }
        return fileFieldValue;
    }
}

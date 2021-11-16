package org.guce.siat.core.utils.monotoring.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;

/**
 * The Class FileItemFieldValueDeMINCOMMERCE.
 */
public class FileItemFieldValueImCargMINCOMMERCE {

    /**
     * Generate file item field value de mincommerce.
     *
     * @param fileItem the file item
     * @param fileItemField the file item field
     * @param marchandise the marchandise
     * @return the file item field value
     */
    public static FileItemFieldValue generateFileItemFieldValueImCargMINCOMMERCE(final FileItem fileItem,
            final FileItemField fileItemField,
            final org.guce.siat.jaxb.monitoring.IM_CARG_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise) {
        final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
        fileItemFieldValue.setFileItem(fileItem);
        fileItemFieldValue.setFileItemField(fileItemField);
        switch (fileItemField.getCode()) {
            case "UNITE": {
                fileItemFieldValue.setValue(marchandise.getUNITE());
                break;
            }
            case "CATEGORIE": {
                fileItemFieldValue.setValue(marchandise.getCATEGORIE());
                break;
            }
            case "MODELE": {
                fileItemFieldValue.setValue(marchandise.getMODELE());
                break;
            }
            case "MARQUE": {
                fileItemFieldValue.setValue(marchandise.getMARQUE());
                break;
            }
        }
        return fileItemFieldValue;
    }

}

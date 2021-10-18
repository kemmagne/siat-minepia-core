package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;

/**
 * The Class FileItemFieldValueVtMINEPIA.
 */
public class FileItemFieldValueVtMINEPIA {

    /**
     * Generate file item field value_ v t_ minepia.
     *
     * @param fileItem the file item
     * @param fileItemField the file item field
     * @param marchandise the marchandise
     * @return the file item field value
     */
    public static FileItemFieldValue generateFileItemFieldValueVtMINEPIA(final FileItem fileItem,
            final FileItemField fileItemField,
            final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise) {
        final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
        fileItemFieldValue.setFileItem(fileItem);
        fileItemFieldValue.setFileItemField(fileItemField);
        switch (fileItemField.getCode()) {
            case "AMM": {
                fileItemFieldValue.setValue(marchandise.getAMM());
                break;
            }
            case "DESCRIPTION": {
                fileItemFieldValue.setValue(marchandise.getDESCRIPTION());
                break;
            }
            case "MODE_EMBALAGE": {
                fileItemFieldValue.setValue(marchandise.getMODEEMBALAGE());
                break;
            }
            case "NOMBRE_COLIS": {
                if (marchandise.getNOMBRECOLIS() != null) {
                    fileItemFieldValue.setValue(marchandise.getNOMBRECOLIS().toString());
                }
                break;
            }
            case "UNITE": {
                fileItemFieldValue.setValue(marchandise.getUNITE());
                break;
            }
            case "POIDS": {
                fileItemFieldValue.setValue(marchandise.getPOIDS());
                break;
            }
            case "VOLUME": {
                fileItemFieldValue.setValue(marchandise.getVOLUME());
                break;
            }
            case "NOM_COMMERCIAL": {
                fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIALE());
                break;
            }
            default:
                break;

        }
        return fileItemFieldValue;
    }

}

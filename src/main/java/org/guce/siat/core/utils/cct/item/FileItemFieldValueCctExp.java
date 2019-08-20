package org.guce.siat.core.utils.cct.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;

/**
 * The Class FileItemFieldValueCct.
 */
public class FileItemFieldValueCctExp {

    /**
     * Generate file field value_ cc t_ ct.
     *
     * @param fileItem the file item
     * @param fileItemField the file item field
     * @param marchandise the marchandise
     * @return the file field value
     */
    public static FileItemFieldValue generateFileItemFieldValueCctCtExp(final FileItem fileItem,
            final FileItemField fileItemField,
            final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise) {
        final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
        fileItemFieldValue.setFileItem(fileItem);
        fileItemFieldValue.setFileItemField(fileItemField);
        switch (fileItemField.getCode()) {
            case "NOM_COMMERCIAL": {
                fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIAL());
                break;
            }
            case "VOLUME": {
                fileItemFieldValue.setValue(marchandise.getVOLUME());
                break;
            }
            case "UNITE": {
                fileItemFieldValue.setValue(marchandise.getUNITE());
                break;
            }
            case "NOMBRE_SACS": {
                fileItemFieldValue.setValue(marchandise.getNOMBRESACS());
                break;
            }
            case "POIDS_BRUT": {
                if (marchandise.getPOIDSBRUT() != null) {
                    fileItemFieldValue.setValue(marchandise.getPOIDSBRUT().toString());
                } else {
                    fileItemFieldValue.setValue(marchandise.getPOIDS());
                }
                break;
            }
            case "POIDS": {
                if (marchandise.getPOIDS() != null) {
                    fileItemFieldValue.setValue(marchandise.getPOIDS());
                } 
                break;
            }
            case "NOMBRE_GRUMES": {
                if (marchandise.getNOMBREGRUMES() != null) {
                    fileItemFieldValue.setValue(marchandise.getNOMBREGRUMES().toString());
                }
                break;
            }
			case "NOM_BOTANIQUE": {
				if (marchandise.getNOMBOTANIQUE() != null){
					fileItemFieldValue.setValue(marchandise.getNOMBOTANIQUE());
				}
				break;
			}
            default:
                break;
        }
        return fileItemFieldValue;
    }

}


package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;

/**
 * The Class FileItemFieldValueVtdMINSANTE.
 */
public class FileItemFieldValueVtdMINSANTE {

    /**
     * Generate file item field value_ vt d_ minsante.
     *
     * @param fileItem the file item
     * @param fileItemField the file item field
     * @param marchandise the marchandise
     * @return the file item field value
     */
    public static FileItemFieldValue generateFileItemFieldValueVtdMINSANTE(final FileItem fileItem,
            final FileItemField fileItemField,
            final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise) {
        final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
        fileItemFieldValue.setFileItem(fileItem);
        fileItemFieldValue.setFileItemField(fileItemField);
        switch (fileItemField.getCode()) {
            case "DCI": {
                fileItemFieldValue.setValue(marchandise.getDCI());
                break;
            }
            case "FORME": {
                fileItemFieldValue.setValue(marchandise.getFORME());
                break;
            }
            case "DOSAGE": {
                fileItemFieldValue.setValue(marchandise.getDOSAGE());
                break;
            }
            case "PRESENTATION": {
                fileItemFieldValue.setValue(marchandise.getPRESENTATION());
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
                fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIAL());
                break;
            }
            case "NOM_SCIENTIFIQUE": {
                fileItemFieldValue.setValue(marchandise.getNOMSCIENTIFIQUE());
                break;
            }
//			case "FORMULE_CHIMIQUE":
//			{
//				fileItemFieldValue.setValue(marchandise.getFORMULECHIMIQUE());
//				break;
//			}
            case "SPECIFICATION_TECHNIQUE": {
                fileItemFieldValue.setValue(marchandise.getSPECIFICATIONTECHNIQUE());
                break;
            }

            case "PAYS_ORIGINE_CODE": {
                if (marchandise.getPAYSORIGINE() != null) {
                    fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getCODEPAYS());
                }
                break;
            }
            case "PAYS_ORIGINE_LIBELLE": {
                if (marchandise.getPAYSORIGINE() != null) {
                    fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getNOMPAYS());
                }
                break;
            }
            
            case "QUANTITE_IMPORTEE": {
                fileItemFieldValue.setValue(marchandise.getQUANTITEIMPORTEE());
                break;
            }
            case "MODE_EMBALLAGE": {
                fileItemFieldValue.setValue(marchandise.getMODEEMBALLAGE());
                break;
            }
			case "AMM": {
				fileItemFieldValue.setValue(marchandise.getAMM());
			}
            
            case "FABRICANT_RAISONSOCIALE": {
                if (marchandise.getFABRICANT() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getRAISONSOCIALE());
                }
                break;
            }
            case "FABRICANT_ADRESSE_ADRESSE1": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getADRESSE1());
                }
                break;
            }
            case "FABRICANT_ADRESSE_ADRESSE2": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getADRESSE2());
                }
                break;
            }
            case "FABRICANT_ADRESSE_BP": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getBP());
                }
                break;
            }
            case "FABRICANT_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null
                        && marchandise.getFABRICANT().getADRESSE().getPAYSADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "FABRICANT_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null
                        && marchandise.getFABRICANT().getADRESSE().getPAYSADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "FABRICANT_ADRESSE_VILLE": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getVILLE());
                }
                break;
            }
            case "FABRICANT_ADRESSE_ADRESSEELECTRONIQUE": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getEMAIL());
                }
                break;
            }
            case "FABRICANT_ADRESSE_SITEWEB": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getADRESSE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getADRESSE().getSITEWEB());
                }
                break;
            }
            case "FABRICANT_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getTELEPHONEFIXE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "FABRICANT_TELEPHONE_FIXE_NUMERO": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getTELEPHONEFIXE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "FABRICANT_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getTELEPHONEMOBILE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "FABRICANT_TELEPHONE_MOBILE_NUMERO": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getTELEPHONEMOBILE() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "FABRICANT_FAX_INDICATIFPAYS": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getFAX() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getFAX().getINDICATIFPAYS());
                }
                break;
            }
            case "FABRICANT_FAX_NUMERO": {
                if (marchandise.getFABRICANT() != null && marchandise.getFABRICANT().getFAX() != null) {
                    fileItemFieldValue.setValue(marchandise.getFABRICANT().getFAX().getNUMERO());
                }
                break;
            }
            default:
                break;
        }
        return fileItemFieldValue;
    }
}

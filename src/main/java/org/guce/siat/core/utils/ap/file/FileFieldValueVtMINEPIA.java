package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueVtMINEPIA.
 */
public class FileFieldValueVtMINEPIA {

    /**
     * Generate file field value_ v t_ minepia.
     *
     * @param file the file
     * @param fileField the file field
     * @param document the document
     * @param applicationPropretiesService the application propreties service
     * @return the file field value
     */
    public static FileFieldValue generateFileFieldValueVtMINEPIA(final File file, final FileField fileField,
            final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT document,
            final ApplicationPropretiesService applicationPropretiesService) {
        FileFieldValueUtils.applicationPropretiesService = applicationPropretiesService;

        final FileFieldValue fileFieldValue = new FileFieldValue();
        fileFieldValue.setFileField(fileField);
        fileFieldValue.setFile(file);
        switch (fileField.getCode()) {
            case "CODE_BUREAU": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getCODEBUREAU());
                }
                break;
            }
            case "TRANSITAIRE_NUMERO_CONTRIBUABLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getNUMEROCONTRIBUABLE());
                }
                break;
            }
            case "TRANSITAIRE_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getRAISONSOCIALE());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE1());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE2());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getBP());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getVILLE());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getEMAIL());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getSITEWEB());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "TRANSITAIRE_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getINDICATIFPAYS());
                }
                break;
            }
            case "TRANSITAIRE_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getNUMERO());
                }
                break;
            }

            case "FOURNISSEUR_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getRAISONSOCIALE());
                }
                break;
            }
            case "FOURNISSEUR_SIGLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getSIGLE());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getADRESSE1());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getADRESSE2());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getBP());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getVILLE());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getEMAIL());
                }
                break;
            }
            case "FOURNISSEUR_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getSITEWEB());
                }
                break;
            }
            case "FOURNISSEUR_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "FOURNISSEUR_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "FOURNISSEUR_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "FOURNISSEUR_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "FOURNISSEUR_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getFAX().getINDICATIFPAYS());
                }
                break;
            }
            case "FOURNISSEUR_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
                        && document.getCONTENT().getFOURNISSEUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getFAX().getNUMERO());
                }
                break;
            }
            case "FACTURE_NUMERO_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                        && document.getCONTENT().getFACTURE().getNUMEROFACTURE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getNUMEROFACTURE());
                }
                break;
            }
            case "FACTURE_DATE_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                        && document.getCONTENT().getFACTURE().getDATEFACTURE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFACTURE().getDATEFACTURE()));
                }
                break;
            }
            case "FACTURE_NUMERO_VOYAGE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                        && document.getCONTENT().getFACTURE().getNUMEROVOYAGE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getNUMEROVOYAGE());
                }
                break;
            }
            case "FACTURE_NUMERO_BL": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                        && document.getCONTENT().getFACTURE().getNUMEROBL() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getNUMEROBL());
                }
                break;
            }
            case "FACTURE_DATE_DEPART": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                        && document.getCONTENT().getFACTURE().getDATEDEPART()!= null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFACTURE().getDATEDEPART()));
                }
                break;
            }
            case "FACTURE_DATE_ARRIVEE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                        && document.getCONTENT().getFACTURE().getDATEARRIVEE()!= null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFACTURE().getDATEARRIVEE()));
                }
                break;
            }            
            case "TRANSPORT_MODE_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getCODE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getCODE());
                }
                break;
            }
            case "TRANSPORT_MODE_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getLIBELLE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getLIBELLE());
                }
                break;
            }
            case "TRANSPORT_LIEU_DEDOUANEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getUNLOCODE());
                }
                break;
            }
            case "TRANSPORT_LIEU_DEDOUANEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getLIBELLE());
                }
                break;
            }
            case "TRANSPORT_LIEU_CHARGEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getLIEUCHARGEMENT()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUCHARGEMENT().getUNLOCODE());
                }
                break;
            }
            case "TRANSPORT_LIEU_CHARGEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getLIEUCHARGEMENT()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUCHARGEMENT().getLIBELLE());
                }
                break;
            }
            case "SIGNATAIRE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getNOM());
                }
                break;
            }
            case "SIGNATAIRE_QUALITE": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getQUALITE());
                }
                break;
            }
            case "SIGNATAIRE_LIEU": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getLIEU());
                }
                break;
            }
            case "SIGNATAIRE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
                }
                break;
            }

            default:
                break;
        }

        return fileFieldValue;
    }

}

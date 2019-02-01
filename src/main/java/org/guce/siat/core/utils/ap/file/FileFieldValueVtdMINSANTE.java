package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueVtdMINSANTE.
 */
public class FileFieldValueVtdMINSANTE {

    /**
     * Generate file field value_ vt d_ minsante.
     *
     * @param file the file
     * @param fileField the file field
     * @param document the document
     * @param applicationPropretiesService the application propreties service
     * @return the file field value
     */
    public static FileFieldValue generateFileFieldValueVtdMINSANTE(final File file, final FileField fileField,
            final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT document,
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
//
//                        case "PHARMACIEN_NUMEROCONTRIBUABLE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getNUMEROCONTRIBUABLE());
//				}
//				break;
//			}
//                        case "PHARMACIEN_RAISONSOCIALE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getRAISONSOCIALE());
//				}
//				break;
//			}
//			case "PHARMACIEN_NOMSTRUCTUREPHARMACIEN":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getNOMSTRUCUTREPHARMACIEN());
//				}
//				break;
//			}
//                        case "PHARMACIEN_NUMINSCRIPTIONORDREPHARMACIEN":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getNUMINSCRIPTIONORDREPHARMACIEN());
//				}
//				break;
//			}
//                        case "PHARMACIEN_NUMEROAGREMENT":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getNUMEROAGREMENT());
//				}
//				break;
//			}
//                        case "PHARMACIEN_DATEEMISSIONAGREMENT":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getDATEEMISSIONAGREMENT());
//				}
//				break;
//			}
//                        case "PHARMACIEN_DATEFINAGREMENT":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getDATEFINAGREMENT());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_ADRESSE1":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getADRESSE1());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_ADRESSE2":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getADRESSE2());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_BP":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getBP());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_PAYSADDRESS_CODEPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE().getPAYSADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getPAYSADRESSE().getCODEPAYS());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_PAYSADDRESS_NOMPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE().getPAYSADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getPAYSADRESSE().getNOMPAYS());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_VILLE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getVILLE());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_ADRESSEELECTRONIQUE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getEMAIL());
//				}
//				break;
//			}
//			case "PHARMACIEN_ADRESSE_SITEWEB":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getADRESSE().getSITEWEB());
//				}
//				break;
//			}
//			case "PHARMACIEN_TELEPHONE_FIXE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getTELEPHONEFIXE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getTELEPHONEFIXE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "PHARMACIEN_TELEPHONE_FIXE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getTELEPHONEFIXE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getTELEPHONEFIXE().getNUMERO());
//				}
//				break;
//			}
//			case "PHARMACIEN_TELEPHONE_MOBILE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getTELEPHONEMOBILE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getTELEPHONEMOBILE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "PHARMACIEN_TELEPHONE_MOBILE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getTELEPHONEMOBILE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getTELEPHONEMOBILE().getNUMERO());
//				}
//				break;
//			}
//			case "PHARMACIEN_FAX_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getFAX().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "PHARMACIEN_FAX_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getPHARMACIEN() != null
//						&& document.getCONTENT().getPHARMACIEN().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getPHARMACIEN().getFAX().getNUMERO());
//				}
//				break;
//			}
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
//                        case "LABORATOIREFABRICANT_RAISONSOCIALE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT()!= null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getRAISONSOCIALE());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_ADRESSE1":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getADRESSE1());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_ADRESSE2":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getADRESSE2());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_BP":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getBP());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_PAYSADDRESS_CODEPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getPAYSADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getPAYSADRESSE().getCODEPAYS());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_PAYSADDRESS_NOMPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getPAYSADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getPAYSADRESSE().getNOMPAYS());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_VILLE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getVILLE());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_ADRESSEELECTRONIQUE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getEMAIL());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_ADRESSE_SITEWEB":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getADRESSE().getSITEWEB());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_TELEPHONE_FIXE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEFIXE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEFIXE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_TELEPHONE_FIXE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEFIXE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEFIXE().getNUMERO());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_TELEPHONE_MOBILE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEMOBILE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEMOBILE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_TELEPHONE_MOBILE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEMOBILE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getTELEPHONEMOBILE().getNUMERO());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_FAX_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getFAX().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "LABORATOIREFABRICANT_FAX_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getLABORATOIREFABRICANT() != null
//						&& document.getCONTENT().getLABORATOIREFABRICANT().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getLABORATOIREFABRICANT().getFAX().getNUMERO());
//				}
//				break;
//			}
//                        case "AGREMENTMINSANTE_NUMEROAOI":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAGREMENTMINSANTE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAGREMENTMINSANTE().getNUMEROAOI());
//				}
//				break;
//			}
//                        case "AGREMENTMINSANTE_NUMEROVTP":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAGREMENTMINSANTE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAGREMENTMINSANTE().getNUMEROVTP());
//				}
//				break;
//			}
//                        case "AGREMENTMINSANTE_NUMEROAGREMENT":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAGREMENTMINSANTE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAGREMENTMINSANTE().getNUMEROAGREMENT());
//				}
//				break;
//			}
//                        case "AGREMENTMINSANTE_DATEEMISSIONAGREMENT":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAGREMENTMINSANTE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAGREMENTMINSANTE().getDATEEMISSIONAGREMENT());
//				}
//				break;
//			}
//                        case "AGREMENTMINSANTE_DATEEXPIRATIONAGREMENT":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAGREMENTMINSANTE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAGREMENTMINSANTE().getDATEEXPIRATIONAGREMENT());
//				}
//				break;
//			}
//                        case "AMM_NUMEROAMM":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAMM() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAMM().getNUMEROAMM());
//				}
//				break;
//			}
//                        case "AMM_DATEEMISSION":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAMM() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAMM().getDATEEMISSION());
//				}
//				break;
//			}
//                        case "AMM_DATEFIN":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getAMM() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getAMM().getDATEFIN());
//				}
//				break;
//			}
            case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getCERTIFICATEXPERTISE().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_TYPE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getTYPE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL()
                            .getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
                            .getCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
                            .getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
                            .getCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
                            .getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_DATE_ARRIVEE_DEPART": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT()
                            .getDATEARRIVEEDEPART()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_NUM_CONNAISSEMENT_LTA": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getNUMCONNAISSEMENTLTA());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_TRANSIT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_TRANSIT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getNOM());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_QUALITE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getQUALITE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_LIEU": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getLIEU());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE()
                            .getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_NUMERO_PERMIS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getNUMEROPERMIS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getRAISONSOCIALE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getADRESSE1());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getADRESSE2());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getBP());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getVILLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getEMAIL());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getSITEWEB());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
                            .getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_PAYS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_PAYS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_ESCALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT().getNUMEROESCALE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_TYPE_LETTRE_TRANSPORT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
                            .getTYPELETTRETRANSPORT());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_LETTRE_TRANSPORT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
                            .getNUMEROLettreTRANSPORT());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_DATE_LETTRE_TRANSPORT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
                            .getDATELETTRETRANSPORT()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_TRANSIT_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_TRANSIT_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONDITIONS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONDITIONS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE_DEVISE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODEDEVISE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANT());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT_TOTAL_DEVISE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALDEVISE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_MONTANT_TOTAL_FCFA": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALFCFA());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_POINT_ENTREE_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_POINT_ENTREE_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_AGREMENT_TYPE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getTYPE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_AGREMENT_REFERENCE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getREFERENCE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_AGREMENT_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null) {
                    fileFieldValue
                            .setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_NUMERO_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION()
                            .getNUMEROFACTURE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_DATE_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION()
                            .getDATEFACTURE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_VALIDITE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getVALIDITE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_TITULAIRE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getTITULAIRE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getRAISONSOCIALE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getADRESSE1());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getADRESSE2());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getBP());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue
                            .setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getVILLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue
                            .setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getEMAIL());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getSITEWEB());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
                            .getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
                            .getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_DESTINATAIRE_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_LIEU_DELIVRANCE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getLIEUDELIVRANCE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_ORGANISME": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getORGANISME());
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
            case "NUMERO_DI": {
                if (document.getCONTENT() != null && document.getCONTENT().getNUMERODI() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getNUMERODI());
                }
                break;
            }
            case "NUMERO_VTP": {
                if (document.getCONTENT() != null && document.getCONTENT().getNUMEROVTP() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getNUMEROVTP());
                }
                break;
            }
            default:
                int fieldType = org.guce.siat.core.utils.FileFieldValueUtils.FIELD_TYPE_STRING;
                if (fileField.getCode().contains("_DATE") || fileField.getCode().contains("DATE_") || fileField.getCode().equals("DATE")) {
                    fieldType = org.guce.siat.core.utils.FileFieldValueUtils.FIELD_TYPE_DATE;
                }
                fileFieldValue.setValue(org.guce.siat.core.utils.FileFieldValueUtils.retrieveValue(document.getCONTENT(), fileField.getCode(), fieldType));
                break;
        }
        return fileFieldValue;
    }

}

package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueAtMINEPIA.
 */
public class FileFieldValueAtmMINEPIA
{
	/**
	 * Generate file field value_ a t_ minepia.
	 *
	 * @param file
	 *           the file
	 * @param fileField
	 *           the file field
	 * @param document
	 *           the document
	 * @param applicationPropretiesService
	 *           the application propreties service
	 * @return the file field value
	 */
	public static FileFieldValue generateFileFieldValueAtmMINEPIA(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.ATM_MINEPIA.DOCUMENT document,
			final ApplicationPropretiesService applicationPropretiesService)
	{
		FileFieldValueUtils.applicationPropretiesService = applicationPropretiesService;

		final FileFieldValue fileFieldValue = new FileFieldValue();
		fileFieldValue.setFileField(fileField);
		fileFieldValue.setFile(file);
		switch (fileField.getCode())
		{
			case "CODE_BUREAU":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCODEBUREAU());
				}
				break;
			}
//			case "NUMERO_AVIS_TECHNIQUE":
//			{
//				if (document.getCONTENT() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getNUMEROAVISTECHNIQUE());
//				}
//				break;
//			}
//			case "NUMERO_CCT":
//			{
//				if (document.getCONTENT() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getNUMEROCCT());
//				}
//				break;
//			}
//			case "DATE_AVIS_TECHNIQUE":
//			{
//				if (document.getCONTENT() != null)
//				{
//					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEAVISTECHNIQUE()));
//				}
//				break;
//			}
//			case "DATE_VALIDITE_AVIS_TECHNIQUE":
//			{
//				if (document.getCONTENT() != null)
//				{
//					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEVALIDITEAVISTECHNIQUE()));
//				}
//				break;
//			}
//			case "TRANSITAIRE_NUMERO_CONTRIBUABLE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getNUMEROCONTRIBUABLE());
//				}
//				break;
//			}
//			case "TRANSITAIRE_RAISONSOCIALE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getRAISONSOCIALE());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_ADRESSE1":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE1());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_ADRESSE2":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE2());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_BP":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getBP());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_VILLE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getVILLE());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_ADRESSEELECTRONIQUE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getEMAIL());
//				}
//				break;
//			}
//			case "TRANSITAIRE_ADRESSE_SITEWEB":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getSITEWEB());
//				}
//				break;
//			}
//			case "TRANSITAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "TRANSITAIRE_TELEPHONE_FIXE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getNUMERO());
//				}
//				break;
//			}
//			case "TRANSITAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "TRANSITAIRE_TELEPHONE_MOBILE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getNUMERO());
//				}
//				break;
//			}
//			case "TRANSITAIRE_FAX_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "TRANSITAIRE_FAX_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
//						&& document.getCONTENT().getTRANSITAIRE().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getNUMERO());
//				}
//				break;
//			}
			case "SIGNATAIRE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getNOM());
				}
				break;
			}
			case "SIGNATAIRE_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getQUALITE());
				}
				break;
			}
			case "SIGNATAIRE_LIEU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getLIEU());
				}
				break;
			}
			case "SIGNATAIRE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
				}
				break;
			}
			case "CLIENT_RAISON_SOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getRAISONSOCIALE());
				}
				break;
			}
//			case "FOURNISSEUR_SIGLE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getSIGLE());
//				}
//				break;
//			}
			case "CLIENT_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "CLIENT_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "CLIENT_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getBP());
				}
				break;
			}
			case "CLIENT_ADRESSE_PAYS_ADRESSE_CODE_PAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "CLIENT_ADRESSE_PAYS_ADRESSE_NOM_PAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
                                                                                                case "IS_RENEWING":
                                                                                                {
                                                                                                        if (document.getCONTENT() != null)
                                                                                                        {
                                                                                                                String isrenewing = new String();
                                                                                                                fileFieldValue.setValue(String.valueOf(isrenewing));
                                                                                                                
                                                                                                        }
                                                                                                        break;
                                                                                                }
			case "CLIENT_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "CLIENT_ADRESSE_EMAIL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FOURNISSEUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "CLIENT_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FOURNISSEUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "CLIENT_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FOURNISSEUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "CLIENT_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getFAX().getNUMERO());
				}
				break;
			}
			case "FACTURE_NUMERO_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                                      && document.getCONTENT().getFACTURE().getNUMEROFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFACTURE().getNUMEROFACTURE());
				}
				break;
			}
                        
                        	case "FACTURE_DATE_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null
                                      && document.getCONTENT().getFACTURE().getDATEFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFACTURE().getDATEFACTURE());
				}
				break;
			}
                       
                        
                              
                        case "TRANSPORT_PAYS_PROVENANCE_NOM_PAYS":
                        {
                          if(document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null && document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE() != null)
                          {
                               fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE().getNOMPAYS());
                          }
                           break;
                        
                        }
                        
                        case "TRANSPORT_PAYS_PROVENANCE_CODE_PAYS":
                         {
                          if(document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null && document.getCONTENT().getTRANSPORT().getPAYSORIGINE() != null)
                          {
                               fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getNOMPAYS());
                          }
                           break;
                        
                        }
                         
                       case "TRANSPORT_DATE_DEPART":
                         {
                          if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT()!= null
                                 && document.getCONTENT().getTRANSPORT().getDATEDEPART()!= null) {
                                String dateDepart = document.getCONTENT().getTRANSPORT().getDATEDEPART();
                                fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getTRANSPORT().getDATEDEPART()));
                              }
                           break;
                        
                        }   
                                     
                       case "TRANSPORT_DATE_ARRIVEE":
                         {
                            if (document.getCONTENT() != null  && document.getCONTENT().getTRANSPORT()!= null
                                     && document.getCONTENT().getTRANSPORT().getDATEARRIVEE() != null) {
                                 String dateArrivee = document.getCONTENT().getTRANSPORT().getDATEARRIVEE();
                                 fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getTRANSPORT().getDATEARRIVEE()));
                              }
                           break;
                        
                        }
                         
                        case "TRANSPORT_LIEU_CHARGEMENT_UNLOCODE": {
                                if (document.getCONTENT() != null  && document.getCONTENT().getTRANSPORT() != null
                                        && document.getCONTENT().getTRANSPORT().getLIEUCHARGEMENT() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUCHARGEMENT().getUNLOCODE());
                                }
                                break;
                            }
                        case "TRANSPORT_LIEU_DE_DECHARGEMENT_LIBELLE": {
                            if (document.getCONTENT() != null  && document.getCONTENT().getTRANSPORT() != null
                                    && document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT()!= null) {
                                fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getLIBELLE());
                            }
                            break;
                        }
                         
                       case "TRANSPORT_MODE_TRANSPORT_CODE":
                         {
                          if(document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null)
                          {
                               fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getCODE());
                          }
                           break;
                        }
                        
                        case "TRANSPORT_MODE_TRANSPORT_LIBELLE":
                         {
                          if(document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null)
                          {
                               fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getLIBELLE());
                          }
                           break;
                        } 
                         
                         
                         
                         
                     case "TRANSPORT_PAYS_ORIGINE_NOM_PAYS": {
                        if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                             && document.getCONTENT().getTRANSPORT().getPAYSORIGINE()!= null) {
                             fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getNOMPAYS());
                            }
                         break;
                     }  
                     

//                    case "TRANSPORT_PAYS_DESTINATION_NOM_PAYS": {
//                       if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
//                         && document.getCONTENT().getTRANSPORT().getPAYSDESTINATION()!= null) {
//                           fileFieldValue.setValue("CAMEROUN");
//                         //  fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSDESTINATION().getNOMPAYS());
//                           }
//                         break;
//                      }
                    
//                       case "TRANSPORT_PAYS_DESTINATION_CODE_PAYS": {
//                       if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
//                         && document.getCONTENT().getTRANSPORT().getPAYSDESTINATION()!= null) {
//                           fileFieldValue.setValue("CM");
//                         //  fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSDESTINATION().getNOMPAYS());
//                           }
//                         break;
//                      }    
//                    

                    case "TRANSPORT_PAYS_DESTINATION_NOM_PAYS": {
                       if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                          && document.getCONTENT().getTRANSPORT().getPAYSDESTINATION()!= null &&
                               document.getCONTENT().getTRANSPORT().getPAYSDESTINATION().getNOMPAYS() != null
                                 ) {
                           
                           fileFieldValue.setValue("CAMEROUN");
                            fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSDESTINATION().getNOMPAYS());
                           }
                         break;
                      }
                    
                       case "TRANSPORT_PAYS_DESTINATION_CODE_PAYS": {
                       if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                         && document.getCONTENT().getTRANSPORT().getPAYSDESTINATION()!= null &&
                               document.getCONTENT().getTRANSPORT().getPAYSDESTINATION().getCODEPAYS() != null
                               ) {
                          // fileFieldValue.setValue("CM");
                          fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSDESTINATION().getCODEPAYS());
                           }
                         break;
                      }    
                    
                  

                        case "TRANSPORT_MODE_DEDOUANEMENT_CODE":
                         {
                          if(document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null && document.getCONTENT().getTRANSPORT().getPAYSORIGINE()!= null)
                          {
                               fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getUNLOCODE());
                          }
                           break;
                        }
                        
                        case "TRANSPORT_MODE_DEDOUANEMENT_LIBELLE":
                         {
                          if(document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null && document.getCONTENT().getTRANSPORT().getPAYSORIGINE()!= null)
                          {
                               fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getLIBELLE());
                          }
                           break;
                        }  
                         
                     
                                 
                         //Mise a jour des Good
                         
                         
          
                        
//			case "FACTURE_DATE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null)
//				{
//					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFACTURE().getDATE()));
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_NOM":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getNOM());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_AORTIQUE":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getAORTIQUE());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_TELEPHONE_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
//						&& document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_TELEPHONE_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
//						&& document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE().getNUMERO());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_FAX_INDICATIFPAYS":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
//						&& document.getCONTENT().getDETENTEURMARQUE().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getFAX().getINDICATIFPAYS());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_FAX_NUMERO":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
//						&& document.getCONTENT().getDETENTEURMARQUE().getFAX() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getFAX().getNUMERO());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_E-MAIL":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getEMAIL());
//				}
//				break;
//			}
//			case "DETENTEUR_MARQUE_SITE-WEB":
//			{
//				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getSITEWEB());
//				}
//				break;
//			}
//			case "COMMENTAIRES":
//			{
//				if (document.getCONTENT() != null)
//				{
//					fileFieldValue.setValue(document.getCONTENT().getCOMMENTAIRES());
//				}
//				break;
//			}
			default:
				break;
 	}

		return fileFieldValue;
	}

}

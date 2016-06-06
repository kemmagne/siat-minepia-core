package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueAtMINEPIA.
 */
public class FileFieldValueAtMINEPIA
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
	public static FileFieldValue generateFileFieldValueAtMINEPIA(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT document,
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
			case "NUMERO_AVIS_TECHNIQUE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROAVISTECHNIQUE());
				}
				break;
			}
			case "NUMERO_CCT":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROCCT());
				}
				break;
			}
			case "DATE_AVIS_TECHNIQUE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEAVISTECHNIQUE()));
				}
				break;
			}
			case "DATE_VALIDITE_AVIS_TECHNIQUE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEVALIDITEAVISTECHNIQUE()));
				}
				break;
			}
			case "TRANSITAIRE_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "TRANSITAIRE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getRAISONSOCIALE());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getBP());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getVILLE());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "TRANSITAIRE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "TRANSITAIRE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getNUMERO());
				}
				break;
			}
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
			case "FOURNISSEUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "FOURNISSEUR_SIGLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getSIGLE());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getBP());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFOURNISSEUR() != null
						&& document.getCONTENT().getFOURNISSEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFOURNISSEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_ADRESSEELECTRONIQUE":
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
			case "FOURNISSEUR_TELEPHONE_FIXE_NUMERO":
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
			case "FOURNISSEUR_TELEPHONE_MOBILE_NUMERO":
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
			case "FOURNISSEUR_FAX_NUMERO":
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
				if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFACTURE().getNUMEROFACTURE());
				}
				break;
			}
			case "FACTURE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFACTURE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFACTURE().getDATE()));
				}
				break;
			}
			case "DETENTEUR_MARQUE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getNOM());
				}
				break;
			}
			case "DETENTEUR_MARQUE_AORTIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getAORTIQUE());
				}
				break;
			}
			case "DETENTEUR_MARQUE_TELEPHONE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
						&& document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE().getINDICATIFPAYS());
				}
				break;
			}
			case "DETENTEUR_MARQUE_TELEPHONE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
						&& document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getTELEPHONE().getNUMERO());
				}
				break;
			}
			case "DETENTEUR_MARQUE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
						&& document.getCONTENT().getDETENTEURMARQUE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "DETENTEUR_MARQUE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null
						&& document.getCONTENT().getDETENTEURMARQUE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getFAX().getNUMERO());
				}
				break;
			}
			case "DETENTEUR_MARQUE_E-MAIL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getEMAIL());
				}
				break;
			}
			case "DETENTEUR_MARQUE_SITE-WEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDETENTEURMARQUE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDETENTEURMARQUE().getSITEWEB());
				}
				break;
			}
			case "COMMENTAIRES":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCOMMENTAIRES());
				}
				break;
			}
			default:
				break;
		}

		return fileFieldValue;
	}

}

package org.guce.siat.core.utils.monotoring.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueFimex.
 */
public class FileFieldValueFimex
{

	/**
	 * Generate file field value fimex.
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
	public static FileFieldValue generateFileFieldValueFimex(final File file, final FileField fileField,
			final org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT document,
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
			case "TYPE_DEMANDE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTYPEDEMANDE());
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
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null && document.getCONTENT().getSIGNATAIRE().getNOM() != null )
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getNOM());
				}
				break;
			}
			case "SIGNATAIRE_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null && document.getCONTENT().getSIGNATAIRE().getQUALITE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getQUALITE());
				}
				break;
			}
			case "SIGNATAIRE_LIEU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null && document.getCONTENT().getSIGNATAIRE().getLIEU() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getLIEU());
				}
				break;
			}
			case "SIGNATAIRE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null && document.getCONTENT().getSIGNATAIRE().getDATE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDateSignatairePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
				}
				break;
			}
			case "DONNEES_GENERALES_TYPE_DONNEES":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getTYPEDONNEES());
				}
				break;
			}
			case "DONNEES_GENERALES_CARTE_CONTRIBUABLE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getCARTECONTRIBUABLE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDONNEESGENERALES().getCARTECONTRIBUABLE()
							.getDATE()));
				}
				break;
			}
			case "DONNEES_GENERALES_REGISTRE_COMMERCE_NUMERO_RCCM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getREGISTRECOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getREGISTRECOMMERCE().getNUMERORCCM());
				}
				break;
			}
			case "DONNEES_GENERALES_REGISTRE_COMMERCE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getREGISTRECOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDONNEESGENERALES().getREGISTRECOMMERCE()
							.getDATE()));
				}
				break;
			}
			case "DONNEES_GENERALES_REGISTRE_COMMERCE_LIEU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getREGISTRECOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getREGISTRECOMMERCE().getLIEU());
				}
				break;
			}
			case "DONNEES_GENERALES_PATENTE_NUMERO_IMMATRICULATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getPATENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getPATENTE().getNUMEROIMMATRICULATION());
				}
				break;
			}
			case "DONNEES_GENERALES_PATENTE_DATE_DELIVRANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getPATENTE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDONNEESGENERALES().getPATENTE()
							.getDATEDELIVRANCE()));
				}
				break;
			}
			case "DONNEES_GENERALES_PATENTE_DATE_EXPIRATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getPATENTE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDONNEESGENERALES().getPATENTE()
							.getDATEEXPIRATION()));
				}
				break;
			}
			case "DONNEES_GENERALES_PATENTE_REGIME_IMPORTATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getPATENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getPATENTE().getREGIMEIMPORTATION());
				}
				break;
			}
			case "DONNEES_GENERALES_PATENTE_ACTIVITE_PRINCIPALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getPATENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getPATENTE().getACTIVITEPRINCIPALE());
				}
				break;
			}
			case "DONNEES_GENERALES_PATENTE_ACTIVITE_SECONDAIRE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDONNEESGENERALES() != null
						&& document.getCONTENT().getDONNEESGENERALES().getPATENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDONNEESGENERALES().getPATENTE().getACTIVITESECONDAIRE());
				}
				break;
			}
			case "ENCAISSEMENTS_ENCAISSEMENT_MANDAT_CNCE_NUMERO_MANDAT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTMANDATCNCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTMANDATCNCE().getNUMEROMANDAT());
				}
				break;
			}
			case "ENCAISSEMENTS_ENCAISSEMENT_QUITTANCE_NUMERO_QUITTANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTQUITTANCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTQUITTANCE().getNUMEROQUITTANCE());
				}
				break;
			}
			case "ENCAISSEMENTS_ENCAISSEMENT_QUITTANCE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTQUITTANCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTQUITTANCE()
							.getDATE()));
				}
				break;
			}
			case "ENCAISSEMENTS_ENCAISSEMENT_QUITTANCE_NOM_REGISSEUR":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTQUITTANCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getENCAISSEMENTQUITTANCE().getNOMREGISSEUR());
				}
				break;
			}
			case "ENCAISSEMENTS_FACTURE_REFERENCE_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getFACTURE().getREFERENCEFACTURE());
				}
				break;
			}
			case "ENCAISSEMENTS_FACTURE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getFACTURE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getENCAISSEMENTS().getFACTURE().getDATE()));
				}
				break;
			}
			case "ENCAISSEMENTS_FACTURE_MONTANT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getFACTURE().getMONTANT());
				}
				break;
			}
			case "ENCAISSEMENTS_FACTURE_OBJET":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getFACTURE().getOBJET());
				}
				break;
			}
			case "ENCAISSEMENTS_FACTURE_OBSERVATIONS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getFACTURE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getFACTURE().getOBSERVATIONS());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_REFERENCE_PAIEMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getREFERENCEPAIEMENT());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getDATE()));
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_HEURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getHEURE());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_MONTANT_PAYE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getMONTANTPAYE());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_MODE_PAIEMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getMODEPAIEMENT());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_BENEFICIAIRE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getBENEFICIAIRE());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_OBJET":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getOBJET());
				}
				break;
			}
			case "ENCAISSEMENTS_PAIEMENT_OBSERVATIONS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getENCAISSEMENTS() != null
						&& document.getCONTENT().getENCAISSEMENTS().getPAIEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getENCAISSEMENTS().getPAIEMENT().getOBSERVATIONS());
				}
				break;
			}
			default:
				break;
		}
		return fileFieldValue;

	}

}

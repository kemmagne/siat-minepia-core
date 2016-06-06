package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;


/**
 * The Class FileFieldValueCoCitesMINFOF.
 */
public class FileFieldValueCoFauneMINFOF
{
	/**
	 * Generate file field value_ c o_ cite s_ minfof.
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
	public static FileFieldValue generateFileFieldValueCoFauneMINFOF(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT document,
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
			case "NUMERO_ORDRE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROORDRE());
				}
				break;
			}
			case "TYPE_CO":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTYPECO());
				}
				break;
			}
			case "TRANSITAIRE_NUMEROCONTRIBUABLE":
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
			case "FORMALITES_PREALABLES_DECLARATION_DETAIL_MARCHANDISES_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getDECLARATIONDETAILMARCHANDISES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getDECLARATIONDETAILMARCHANDISES()
							.getREFERENCE());
				}
				break;
			}
			case "FORMALITES_PREALABLES_DECLARATION_DETAIL_MARCHANDISES_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getDECLARATIONDETAILMARCHANDISES() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFORMALITESPREALABLES()
							.getDECLARATIONDETAILMARCHANDISES().getDATE()));
				}
				break;
			}
			case "FORMALITES_PREALABLES_DECLARATION_DETAIL_MARCHANDISES_CODE_BUREAU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getDECLARATIONDETAILMARCHANDISES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getDECLARATIONDETAILMARCHANDISES()
							.getCODEBUREAU());
				}
				break;
			}
			case "FORMALITES_PREALABLES_AUTORISATION_AUTORISATION_EXPORTATION_MINFOF_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getAUTORISATIONEXPORTATIONMINFOF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getAUTORISATIONEXPORTATIONMINFOF()
							.getREFERENCE());
				}
				break;
			}
			case "FORMALITES_PREALABLES_AUTORISATION_EXPORTATION_MINFOF_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getAUTORISATIONEXPORTATIONMINFOF() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFORMALITESPREALABLES()
							.getAUTORISATIONEXPORTATIONMINFOF().getDATE()));
				}
				break;
			}
			case "FORMALITES_PREALABLES_CERTIFICAT_EMPOTAGE_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATEMPOTAGE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATEMPOTAGE().getREFERENCE());
				}
				break;
			}
			case "FORMALITES_PREALABLES_CERTIFICAT_EMPOTAGE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATEMPOTAGE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFORMALITESPREALABLES()
							.getCERTIFICATEMPOTAGE().getDATE()));
				}
				break;
			}
			case "FORMALITES_PREALABLES_CERTIFICAT_CONTROLE_TECHNIQUE_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATCONTROLETECHNIQUE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATCONTROLETECHNIQUE()
							.getREFERENCE());
				}
				break;
			}
			case "FORMALITES_PREALABLES_CERTIFICAT_CONTROLE_TECHNIQUE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATCONTROLETECHNIQUE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFORMALITESPREALABLES()
							.getCERTIFICATCONTROLETECHNIQUE().getDATE()));
				}
				break;
			}
			case "FORMALITES_PREALABLES_CERTIFICAT_ORIGINE_PAYS_EXPEDITION_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATORIGINEPAYSEXPEDITION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATORIGINEPAYSEXPEDITION()
							.getREFERENCE());
				}
				break;
			}
			case "FORMALITES_PREALABLES_CERTIFICAT_ORIGINE_PAYS_EXPEDITION_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getCERTIFICATORIGINEPAYSEXPEDITION() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFORMALITESPREALABLES()
							.getCERTIFICATORIGINEPAYSEXPEDITION().getDATE()));
				}
				break;
			}
			case "FORMALITES_PREALABLES_QUITUS_FISCAL_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getQUITUSFISCAL() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMALITESPREALABLES().getQUITUSFISCAL().getREFERENCE());
				}
				break;
			}
			case "FORMALITES_PREALABLES_QUITUS_FISCAL_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMALITESPREALABLES() != null
						&& document.getCONTENT().getFORMALITESPREALABLES().getQUITUSFISCAL() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFORMALITESPREALABLES()
							.getQUITUSFISCAL().getDATE()));
				}
				break;
			}

			default:
				break;
		}
		return fileFieldValue;
	}
}

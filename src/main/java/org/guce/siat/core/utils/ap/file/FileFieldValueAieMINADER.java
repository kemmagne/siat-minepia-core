package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueAieMINADER.
 */
public class FileFieldValueAieMINADER
{
	/**
	 * Generate file field value_ ai e_ minader.
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
	public static FileFieldValue generateFileFieldValueAieMINADER(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT document,
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
			case "PROMOTEUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getBP());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "PROMOTEUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getFAX().getNUMERO());
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
			case "FORMULATEUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getBP());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FORMULATEUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FORMULATEUR_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getFAX().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getRAISONSOCIALE());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getBP());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE()
							.getNOMPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getVILLE());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX().getNUMERO());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getRAISONSOCIALE());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getBP());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue
							.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getVILLE());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getEMAIL());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getCERTIFICATEXPERTISE().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getTYPE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL()
							.getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
							.getCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
							.getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
							.getCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
							.getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_DATE_ARRIVEE_DEPART":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT()
							.getDATEARRIVEEDEPART()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_NUM_CONNAISSEMENT_LTA":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getNUMCONNAISSEMENTLTA());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_TRANSIT_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_TRANSIT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getNOM());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getQUALITE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_LIEU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getLIEU());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE()
							.getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_NUMERO_PERMIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getNUMEROPERMIS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getRAISONSOCIALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getADRESSE1());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getADRESSE2());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getBP());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getVILLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getEMAIL());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getSITEWEB());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
							.getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_PAYS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_PAYS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_ESCALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT().getNUMEROESCALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_TYPE_LETTRE_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
							.getTYPELETTRETRANSPORT());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_Lettre_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
							.getNUMEROLettreTRANSPORT());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_DATE_LETTRE_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
							.getDATELETTRETRANSPORT()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_TRANSIT_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_TRANSIT_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONDITIONS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONDITIONS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE_DEVISE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODEDEVISE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANT());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT_TOTAL_DEVISE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALDEVISE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_MONTANT_TOTAL_FCFA":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALFCFA());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_POINT_ENTREE_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_POINT_ENTREE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_AGREMENT_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getTYPE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_AGREMENT_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getREFERENCE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_AGREMENT_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null)
				{
					fileFieldValue
							.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_NUMERO_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION()
							.getNUMEROFACTURE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_DATE_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION()
							.getDATEFACTURE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getVALIDITE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_TITULAIRE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getTITULAIRE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getRAISONSOCIALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getADRESSE1());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getADRESSE2());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getBP());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue
							.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getVILLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue
							.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getSITEWEB());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
							.getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
							.getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_LIEU_DELIVRANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getLIEUDELIVRANCE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_ORGANISME":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getORGANISME());
				}
				break;
			}
			default:
				break;
		}
		return fileFieldValue;
	}
}

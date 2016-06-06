package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;


/**
 * The Class FileFieldValueDiMINADER.
 */
public class FileFieldValueDiMINADER
{
	/**
	 * Generate file field value_ d i_ minader.
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
	public static FileFieldValue generateFileFieldValueDiMINADER(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT document, final ApplicationPropretiesService applicationPropretiesService)
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
			case "NUMERO_CERTIFICATION":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROCERTIFICATION());
				}
				break;
			}
			case "NUMERO_AUTORISATION_SPECIALE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROAUTORISATIONSPECIALE());
				}
				break;
			}
			case "NUMERO_ARRETE_HOMOLOGATION":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROARRETEHOMOLOGATION());
				}
				break;
			}
			case "NUMERO_DECLARATION_IMPORTATION":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMERODECLARATIONIMPORTATION());
				}
				break;
			}
			case "DATE_DECLARATION_IMPORTATION":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT()
							.getDATEDECLARATIONIMPORTATION()));
				}
				break;
			}
			case "DATE_VALIDITE_DECLARATION":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEVALIDITEDECLARATION()));
				}
				break;
			}
			case "REFERENCE_NUMERO_ARRETE_HOMOLOGATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREFERENCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREFERENCE().getNUMEROARRETEHOMOLOGATION());
				}
				break;
			}
			case "REFERENCE_NUMERO_AUTORISATION_SPECIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREFERENCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREFERENCE().getNUMEROAUTORISATIONSPECIALE());
				}
				break;
			}
			case "REFERENCE_NUMERO_CERTIFICATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREFERENCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREFERENCE().getNUMEROCERTIFICATION());
				}
				break;
			}
			case "REFERENCE_NOM_DETENTEUR":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREFERENCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREFERENCE().getNOMDETENTEUR());
				}
				break;
			}
			case "FABRICANT_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getRAISONSOCIALE());
				}
				break;
			}
			case "FABRICANT_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FABRICANT_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FABRICANT_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getBP());
				}
				break;
			}
			case "FABRICANT_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FABRICANT_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FABRICANT_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getVILLE());
				}
				break;
			}
			case "FABRICANT_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FABRICANT_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}

			case "FABRICANT_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getFAX().getNUMERO());
				}
				break;
			}
			case "INFORMATION_ARRIVEE_POINT_ENTREE_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONARRIVEE() != null
						&& document.getCONTENT().getINFORMATIONARRIVEE().getPOINTENTREE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONARRIVEE().getPOINTENTREE().getUNLOCODE());
				}
				break;
			}
			case "INFORMATION_ARRIVEE_POINT_ENTREE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONARRIVEE() != null
						&& document.getCONTENT().getINFORMATIONARRIVEE().getPOINTENTREE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONARRIVEE().getPOINTENTREE().getLIBELLE());
				}
				break;
			}

			case "INFORMATION_ARRIVEE_DATE_ARRIVEE_PREVUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONARRIVEE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONARRIVEE()
							.getDATEARRIVEEPREVUE()));
				}
				break;
			}

			case "INFORMATION_ARRIVEE_DESTINATION_PRODUIT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONARRIVEE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONARRIVEE().getDESTINATIONPRODUIT());
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
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null
						&& document.getCONTENT().getSIGNATAIRE().getDATE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
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
			case "DESTINATAIRE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getRAISONSOCIALE());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getBP());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getVILLE());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "DESTINATAIRE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "DESTINATAIRE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getNUMERO());
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getCONTRATCOMMERCIAL().getDATE()));
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getTRANSPORT().getDATEARRIVEEDEPART()));
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getSIGNATAIRE().getDATE()));
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getPERMIS().getDATE()));
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getLETTRETRANSPORT().getDATELETTRETRANSPORT()));
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getAGREMENT().getDATE()));
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
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getPERMISEXPLOITATION().getDATEFACTURE()));
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

package org.guce.siat.core.utils.ap.file;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;
import org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI;


/**
 * The Class FileFieldValueCatMINADER.
 */
public class FileFieldValueCatMINADER
{
	/**
	 * Generate file field value_ ca t_ minader.
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
	public static FileFieldValue generateFileFieldValueCatMINADER(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT document,
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
			case "CARACTERISTIQUES_TECHNIQUES_CLES":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCARACTERISTIQUESTECHNIQUESCLES());
				}
				break;
			}
			case "ACCESSOIRES":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getACCESSOIRES());
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
			case "RESULTATS_ESSAIS_CLIENT_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getRAISONSOCIALE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_COMMERCE_NUMERO_INSCRIPTION_FICHIER":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTCOMMERCE()
							.getNUMEROINSCRIPTIONFICHIER());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_COMMERCE_DATE_OBTENTION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSESSAIS()
							.getCLIENT().getAGREMENTCOMMERCE().getDATEOBTENTION()));
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_COMMERCE_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSESSAIS()
							.getCLIENT().getAGREMENTCOMMERCE().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_COMMERCE_NUMERO_CARTE_COMMERCANT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTCOMMERCE()
							.getNUMEROCARTECOMMERCANT());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_METIER_TYPE_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTMETIER()
							.getTYPEAGREMENT());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_METIER_DATE_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSESSAIS()
							.getCLIENT().getAGREMENTMETIER().getDATEAGREMENT()));
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_METIER_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSESSAIS()
							.getCLIENT().getAGREMENTMETIER().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_PERMIS_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPERMIS().getTYPE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_PERMIS_DATE_OBTENTION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSESSAIS()
							.getCLIENT().getPERMIS().getDATEOBTENTION()));
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_PERMIS_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSESSAIS()
							.getCLIENT().getPERMIS().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_PERMIS_NUMERO_PERMIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPERMIS().getNUMEROPERMIS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_AGREMENT_METIER_NUMERO_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getAGREMENTMETIER()
							.getNUMEROAGREMENT());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_PROFESSION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getPROFESSION());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_NUMERO_REGISTRE_COMMERCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getNUMEROREGISTRECOMMERCE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_CNI":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getCNI());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getBP());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getPAYSADRESSE()
							.getNOMPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getVILLE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getADRESSE().getEMAIL());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEFIXE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEMOBILE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_CLIENT_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getCLIENT().getFAX().getNUMERO());
				}
				break;
			}
			case "RESULTATS_ESSAIS_ESSAIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getESSAIS() != null
						&& CollectionUtils.isNotEmpty(document.getCONTENT().getRESULTATSESSAIS().getESSAIS().getESSAI()))
				{

					final List<String> essaiFiledsValuesList = new ArrayList<String>();
					final List<String> columns = new ArrayList<String>();
					columns.add("Type essais");
					columns.add("Nature essai");
					columns.add("Conditions");
					columns.add("Culture");
					columns.add("Stade");
					columns.add("Description");
					columns.add("Date");
					columns.add("Lieu(Unlcode)");
					columns.add("Lieu(Libelle)");
					columns.add("Code village");
					columns.add("Nom");
					columns.add("Intervenants");
					columns.add("Resultats");
					columns.add("Observation");
					final int essaisSize = document.getCONTENT().getRESULTATSESSAIS().getESSAIS().getESSAI().size();
					for (int i = 0; i < essaisSize; i++)
					{
						if (document.getCONTENT().getRESULTATSESSAIS().getESSAIS().getESSAI().get(i) != null)
						{
							final ESSAI currentEssai = document.getCONTENT().getRESULTATSESSAIS().getESSAIS().getESSAI().get(i);
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getTYPEESSAIS()) ? currentEssai
									.getTYPEESSAIS() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getNATUREESSAI()) ? currentEssai
									.getNATUREESSAI() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getCONDITIONS()) ? currentEssai
									.getCONDITIONS() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getCULTURE()) ? currentEssai.getCULTURE()
									: "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getSTADE()) ? currentEssai.getSTADE() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getDESCRIPTION()) ? currentEssai
									.getDESCRIPTION() : "-");
							essaiFiledsValuesList.add(FileFieldValueUtils.formatDatePattern(currentEssai.getDATE()));
							essaiFiledsValuesList.add(currentEssai.getLIEU() != null
									&& StringUtils.isNotBlank(currentEssai.getLIEU().getUNLOCODE()) ? currentEssai.getLIEU().getUNLOCODE()
									: "-");
							essaiFiledsValuesList.add(currentEssai.getLIEU() != null
									&& StringUtils.isNotBlank(currentEssai.getLIEU().getLIBELLE()) ? currentEssai.getLIEU().getLIBELLE()
									: "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getCODEVILLAGE()) ? currentEssai
									.getCODEVILLAGE() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getNOM()) ? currentEssai.getNOM() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getINTERVENANTS()) ? currentEssai
									.getINTERVENANTS() : "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getRESULTATS()) ? currentEssai.getRESULTATS()
									: "-");
							essaiFiledsValuesList.add(StringUtils.isNotBlank(currentEssai.getOBSERVATIONS()) ? currentEssai
									.getOBSERVATIONS() : "-");
						}
					}
					fileFieldValue.setValue(FileFieldValueUtils.addValueRepetable(essaiFiledsValuesList, columns, null));
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_CODE_TARIF_CODE_NSH":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getCODETARIF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getCODETARIF()
							.getCODENSH());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_CODE_TARIF_DESIGNATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getCODETARIF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getCODETARIF()
							.getDESIGNATION());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_SOUS_FAMILLE_CODE_SOUS_FAMILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getSOUSFAMILLE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getSOUSFAMILLE()
							.getCODESOUSFAMILLE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_SOUS_FAMILLE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getSOUSFAMILLE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getSOUSFAMILLE()
							.getNOM());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_MARQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getMARQUE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_MODELE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getMODELE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_CLASSE_APPAREIL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getCLASSEAPPAREIL());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_USAGE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getUSAGE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_DOSE_TRAITEMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getDOSETRAITEMENT());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_PAYS_ORIGINE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getPAYSORIGINE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getPAYSORIGINE()
							.getCODEPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_PAYS_ORIGINE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getPAYSORIGINE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getPAYSORIGINE()
							.getNOMPAYS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_NOM_COMMERCIAL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getNOMCOMMERCIAL());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_NOM_SCIENTIFIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getNOMSCIENTIFIQUE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_FORMULE_CHIMIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getFORMULECHIMIQUE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_SPECIFICATION_TECHNIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT()
							.getSPECIFICATIONTECHNIQUE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_QUANTITEE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getQUANTITE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_UNITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getUNITE());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_POIDS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getPOIDS());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_VOLUME":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getVOLUME());
				}
				break;
			}
			case "RESULTATS_ESSAIS_APPAREIL_TRAITEMENT_VALEUR_FOB_DEVISEE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSESSAIS() != null
						&& document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSESSAIS().getAPPAREILTRAITEMENT().getVALEURFOBDEVISE());
				}
				break;
			}
			default:
				break;
		}
		return fileFieldValue;
	}
}

package org.guce.siat.core.utils.ap.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;


/**
 * The Class FileFieldValueAeMINMIDT.
 */
public class FileFieldValueLvtbMINFOF
{
	/**
	 * Generate file field value_ a e_ minmidt.
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
	public static FileFieldValue generateFileFieldValueLvtbMINFOF(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT document,
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
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null && document.getCONTENT().getSIGNATAIRE().getDATE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDateSignatairePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_NUMERO_LETTRE_VOITURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getNUMEROLETTREVOITURE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_DATE_LETTRE_VOITURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getDATELETTREVOITURE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_EXERCICE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXERCICE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_TITRE_PROVENANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTITREPROVENANCE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_DATE_PROVENANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getDATEPROVENANCE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_EXPLOITANT_GRUMES_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES()
							.getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_EXPLOITANT_GRUMES_CODE_AGREE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES()
							.getCODEAGREE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_EXPLOITANT_GRUMES_RAISON_SOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES()
							.getRAISONSOCIALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_EXPLOITANT_GRUMES_LOCALISATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getEXPLOITANTGRUMES()
							.getLOCALISATION());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_BOIS_NEGOCE_NOM_ACHETEUR":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getBOISNEGOCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getBOISNEGOCE()
							.getNOMACHETEUR());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_BOIS_NEGOCE_PARC_PROVENANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getBOISNEGOCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getBOISNEGOCE()
							.getPARCPROVENANCE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_TRANSPORT_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT()
							.getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_TRANSPORT_NOM_TRANSPORTEUR":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT()
							.getNOMTRANSPORTEUR());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_TRANSPORT_IMMATRICULATION_CAMION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT()
							.getIMMATRICULATIONCAMION());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_TRANSPORT_DESTINATION_BOIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getTRANSPORT()
							.getDESTINATIONBOIS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_OBSERVATIONS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getOBSERVATIONS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_SIGNATURE_DEPART_NON":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREDEPART() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getSIGNATUREDEPART().getNOM());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_SIGNATURE_DEPART_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREDEPART() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getSIGNATUREDEPART().getQUALITE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_SIGNATURE_DEPART_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREDEPART() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getSIGNATUREDEPART().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_CONDUCTEUR_NON":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getCONDUCTEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getCONDUCTEUR().getNOM());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_CONDUCTEUR_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREDEPART() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getCONDUCTEUR().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_SIGNATURE_ARRIVEE_NON":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREARRIVEE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getSIGNATUREARRIVEE().getNOM());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_SIGNATURE_ARRIVEE_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREDEPART() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getSIGNATUREARRIVEE().getQUALITE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_SIGNATURES_SIGNATURE_ARRIVEE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES().getSIGNATUREDEPART() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getSIGNATURES()
							.getSIGNATUREARRIVEE().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_INDUSTRIEL_DEBITES_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getINDUSTRIELDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getINDUSTRIELDEBITES()
							.getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_INDUSTRIEL_DEBITES_RAISON_SOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getINDUSTRIELDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getINDUSTRIELDEBITES()
							.getRAISONSOCIALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_GRUME_DEBITES_INDUSTRIEL_DEBITES_LOCALISATION_USINE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getINDUSTRIELDEBITES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALESGRUMEDEBITES().getINDUSTRIELDEBITES()
							.getLOCALISATIONUSINE());
				}
				break;
			}
			default:
				break;
		}
		return fileFieldValue;
	}
}

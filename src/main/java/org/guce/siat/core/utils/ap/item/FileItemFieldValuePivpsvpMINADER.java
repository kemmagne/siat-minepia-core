package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValuePivpsvpMINADER.
 */
public class FileItemFieldValuePivpsvpMINADER
{
	/**
	 * Generate file item field value_ pivpsr p_ minader.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValuePivpsrpMINADER(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "PAYS_DESTINATION_CODE":
			{
				if (marchandise.getPAYSDESTINATION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSDESTINATION().getCODEPAYS());
				}
				break;
			}
			case "PAYS_DESTINATION_LIBELLE":
			{
				if (marchandise.getPAYSDESTINATION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSDESTINATION().getNOMPAYS());
				}
				break;
			}
			case "PAYS_PROVENANCE_CODE":
			{
				if (marchandise.getPAYSPROVENANCE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSPROVENANCE().getCODEPAYS());
				}
				break;
			}
			case "PAYS_PROVENANCE_LIBELLE":
			{
				if (marchandise.getPAYSPROVENANCE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSPROVENANCE().getNOMPAYS());
				}
				break;
			}
			case "CONDITIONNEMENT_CODE":
			{
				if (marchandise.getCONDITIONNEMENT() != null)
				{
					fileItemFieldValue.setValue(marchandise.getCONDITIONNEMENT().getCODE());
				}
				break;
			}
			case "CONDITIONNEMENT_LIBELLE":
			{
				if (marchandise.getCONDITIONNEMENT() != null)
				{
					fileItemFieldValue.setValue(marchandise.getCONDITIONNEMENT().getLIBELLE());
				}
				break;
			}
			case "CATEGORIES":
			{
				fileItemFieldValue.setValue(marchandise.getCATEGORIE());
				break;
			}
			case "VEGETAUX_NBR_CERTIF_PHYTOSA":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNBRCERTIFPHYTOSA());
				break;
			}
			case "VEGETAUX_NBR_LOTS":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNBRLOTS());
				break;
			}
			case "VEGETAUX_NBR_CONTENEURS":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNBRCONTENEURS());
				break;
			}
			case "VEGETAUX_NUM_CONTENEUR":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNUMCONTENEUR());
				break;
			}
			case "BUT_IMPORTATION":
			{
				fileItemFieldValue.setValue(marchandise.getBUTIMPORTATION());
				break;
			}
			case "OGM":
			{
				fileItemFieldValue.setValue(marchandise.getOGM());
				break;
			}
			case "VEGETAUX_OBSERVATIONS":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXOBSERVATIONS());
				break;
			}
			case "VEGETAUX_NUMERO":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNUMERO());
				break;
			}
			case "VEGETAUX_NOM_BOTANIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNOMBOTANIQUE());
				break;
			}
			case "VEGETAUX_VARIETE_VEGETALE":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXVARIETEVEGETALE());
				break;
			}
			case "VEGETAUX_NATURE":
			{
				fileItemFieldValue.setValue(marchandise.getVEGETAUXNATURE());
				break;
			}
			case "ORGANISATION_QUARANTAINE":
			{
				fileItemFieldValue.setValue(marchandise.getORGANISATIONQUARANTAINE());
				break;
			}
			case "SPECIFICITE":
			{
				fileItemFieldValue.setValue(marchandise.getSPECIFICITE());
				break;
			}
			case "AGENT_LUTTE_DESCRIPTION":
			{
				fileItemFieldValue.setValue(marchandise.getAGENTLUTTEDESCRIPTION());
				break;
			}
			case "AGENT_LUTTE_TAXONOMIE":
			{
				fileItemFieldValue.setValue(marchandise.getAGENTLUTTETAXONOMIE());
				break;
			}
			case "AGENT_LUTTE_STADE_DEVELOPP":
			{
				fileItemFieldValue.setValue(marchandise.getAGENTLUTTESTADEDEVELOPP());
				break;
			}
			case "AGENT_LUTTE_BUT_SPRCIFIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getAGENTLUTTEBUTSPRCIFIQUE());
				break;
			}
			case "AGENT_LUTTE_NUM_PERMIS_IMP":
			{
				fileItemFieldValue.setValue(marchandise.getAGENTLUTTENUMPERMISIMP());
				break;
			}
			case "AGENT_LUTTE_MARQUE_DISTINCTION":
			{
				fileItemFieldValue.setValue(marchandise.getAGENTLUTTEMARQUEDISTINCTION());
				break;
			}
			case "SOLS_QUANTITE_IMPORTEE":
			{
				fileItemFieldValue.setValue(marchandise.getSOLSQUANTITEIMPORTEE());
				break;
			}
			case "SOLS_COMPOSITION_SOL":
			{
				fileItemFieldValue.setValue(marchandise.getSOLSCOMPOSITIONSOL());
				break;
			}
			case "SOLS_PARASITE_NUISIBLE":
			{
				fileItemFieldValue.setValue(marchandise.getSOLSPARASITENUISIBLE());
				break;
			}
			case "SOLS_CERTIFICAT_PHYTOSANITAIRE":
			{
				fileItemFieldValue.setValue(marchandise.getSOLSCERTIFICATPHYTOSANITAIRE());
				break;
			}
			case "NOM_COMMERCIAL":
			{
				fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIAL());
				break;
			}
			case "NOM_SCIENTIFIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getNOMSCIENTIFIQUE());
				break;
			}
			case "FORMULE_CHIMIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getFORMULECHIMIQUE());
				break;
			}
			case "SPECIFICATION_TECHNIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getSPECIFICATIONTECHNIQUE());
				break;
			}
			case "VOLUME":
			{
				fileItemFieldValue.setValue(marchandise.getVOLUME());
				break;
			}
			case "UNITE":
			{
				fileItemFieldValue.setValue(marchandise.getUNITE());
				break;
			}
			case "PAYS_ORIGINE_CODE":
			{
				if (marchandise.getPAYSORIGINE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getCODEPAYS());
				}
				break;
			}
			case "PAYS_ORIGINE_LIBELLE":
			{
				if (marchandise.getPAYSORIGINE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getNOMPAYS());
				}
				break;
			}
			case "POIDS":
			{
				fileItemFieldValue.setValue(marchandise.getPOIDS());
				break;
			}
			default:
				break;
		}
		return fileItemFieldValue;
	}

}

package org.guce.siat.core.utils.cct.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueCct.
 */
public class FileItemFieldValueCctExp
{
	/**
	 * Generate file field value_ cc t_ ct.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueCctCtExp(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "CATEGORIES":
			{
				fileItemFieldValue.setValue(marchandise.getCATEGORIE());
				break;
			}
			case "OBSERVATIONS":
			{
				fileItemFieldValue.setValue(marchandise.getOBSERVATIONS());
				break;
			}
			case "NOM_BOTANIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getNOMBOTANIQUE());
				break;
			}
			case "NATURE":
			{
				fileItemFieldValue.setValue(marchandise.getNATURE());
				break;
			}
			case "NBR_CERTIFICAT":
			{
				fileItemFieldValue.setValue(marchandise.getNBRCERTIFICAT());
				break;
			}
			case "NBR_LOTS_COLIS":
			{
				fileItemFieldValue.setValue(marchandise.getNBRLOTSCOLIS());
				break;
			}
			case "NUMERO_LOTS":
			{
				fileItemFieldValue.setValue(marchandise.getNUMEROLOTS());
				break;
			}
			case "NUMERO_CONTENEUR":
			{
				fileItemFieldValue.setValue(marchandise.getNUMEROCONTENEUR());
				break;
			}
			case "QUANTITE_TOTALE":
			{
				fileItemFieldValue.setValue(marchandise.getQUANTITETOTALE());
				break;
			}
			case "LIEU_STOCKAGE_UNLOCODE":
			{
				if (marchandise.getLIEUSTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getLIEUSTOCKAGE().getUNLOCODE());
				}
				break;
			}
			case "LIEU_STOCKAGE_LIBELLE":
			{
				if (marchandise.getLIEUSTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getLIEUSTOCKAGE().getLIBELLE());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_ADRESSE1":
			{
				if (marchandise.getADRESSESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getADRESSE1());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_ADRESSE2":
			{
				if (marchandise.getADRESSESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getADRESSE2());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_BP":
			{
				if (marchandise.getADRESSESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getBP());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_PAYS_ADRESSE_CODE_PAYS":
			{
				if (marchandise.getADRESSESTOCKAGE() != null && marchandise.getADRESSESTOCKAGE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_PAYS_ADRESSE_NOM_PAYS":
			{
				if (marchandise.getADRESSESTOCKAGE() != null && marchandise.getADRESSESTOCKAGE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_VILLE":
			{
				if (marchandise.getADRESSESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getVILLE());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_EMAIL":
			{
				if (marchandise.getADRESSESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getEMAIL());
				}
				break;
			}
			case "ADRESSE_STOCKAGE_SITE_WEB":
			{
				if (marchandise.getADRESSESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getADRESSESTOCKAGE().getSITEWEB());
				}
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
			case "PAYS_ORIGINE_CODE_PAYS":
			{
				if (marchandise.getPAYSORIGINE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getCODEPAYS());
				}
				break;
			}
			case "PAYS_ORIGINE_NOM_PAYS":
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
			case "MODE_EMBALLAGE":
			{
				fileItemFieldValue.setValue(marchandise.getMODEEMBALLAGE());
				break;
			}
			default:
				break;
		}
		return fileItemFieldValue;
	}

}

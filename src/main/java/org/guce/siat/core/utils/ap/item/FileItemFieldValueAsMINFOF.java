package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueAsMINFOF.
 */
public class FileItemFieldValueAsMINFOF
{
	/**
	 * Generate file item field value_ a s_ minfof.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueAsMINFOF(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "TYPE":
			{
				fileItemFieldValue.setValue(marchandise.getTYPE());
				break;
			}
			case "BOIS_ESSENCE":
			{
				fileItemFieldValue.setValue(marchandise.getBOISESSENCE());
				break;
			}
			case "BOIS_NATURE":
			{
				fileItemFieldValue.setValue(marchandise.getBOISNATURE());
				break;
			}
			case "BOIS_NBRE_COLIS":
			{
				fileItemFieldValue.setValue(marchandise.getBOISNBRECOLIS());
				break;
			}
			case "BOIS_QUANTITE":
			{
				fileItemFieldValue.setValue(marchandise.getBOISQUANTITE());
				break;
			}
			case "BOIS_UNITE":
			{
				fileItemFieldValue.setValue(marchandise.getBOISUNITE());
				break;
			}
			case "FAUNE_AGE":
			{
				fileItemFieldValue.setValue(marchandise.getFAUNEAGE());
				break;
			}
			case "FAUNE_SEXE":
			{
				fileItemFieldValue.setValue(marchandise.getFAUNESEXE());
				break;
			}
			case "FAUNE_DESCRIPTION":
			{
				fileItemFieldValue.setValue(marchandise.getFAUNEDESCRIPTION());
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

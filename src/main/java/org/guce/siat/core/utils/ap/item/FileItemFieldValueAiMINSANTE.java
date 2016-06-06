package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueAiMINSANTE.
 */
public class FileItemFieldValueAiMINSANTE
{
	/**
	 * Generate file item field value_ a i_ minsante.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueAiMINSANTE(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "DCI":
			{
				fileItemFieldValue.setValue(marchandise.getDCI());
				break;
			}
			case "FORME":
			{
				fileItemFieldValue.setValue(marchandise.getFORME());
				break;
			}
			case "DOSAGE":
			{
				fileItemFieldValue.setValue(marchandise.getDOSAGE());
				break;
			}
			case "PRESENTATION":
			{
				fileItemFieldValue.setValue(marchandise.getPRESENTATION());
				break;
			}
			case "UNITE":
			{
				fileItemFieldValue.setValue(marchandise.getUNITE());
				break;
			}
			case "POIDS":
			{
				fileItemFieldValue.setValue(marchandise.getPOIDS());
				break;
			}
			case "VOLUME":
			{
				fileItemFieldValue.setValue(marchandise.getVOLUME());
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
			case "QUANTITE_IMPORTEE":
			{
				fileItemFieldValue.setValue(marchandise.getQUANTITEIMPORTEE());
				break;
			}
			case "MODE_STOCKAGE_CODE":
			{
				if (marchandise.getMODESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getMODESTOCKAGE().getCODE());
				}
				break;
			}
			case "MODE_STOCKAGE_LIBELLE":
			{
				if (marchandise.getMODESTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getMODESTOCKAGE().getLIBELLE());
				}
				break;
			}
			default:
				break;
		}
		return fileItemFieldValue;
	}
}

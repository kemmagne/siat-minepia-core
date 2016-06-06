package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueCatMINADER.
 */
public class FileItemFieldValueCatMINADER
{
	/**
	 * Generate file item field value_ ca t_ minader.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueCatMINADER(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "MARQUE":
			{
				fileItemFieldValue.setValue(marchandise.getMARQUE());
				break;
			}
			case "MODELE":
			{
				fileItemFieldValue.setValue(marchandise.getMODELE());
				break;
			}
			case "CLASSE_APPAREIL":
			{
				fileItemFieldValue.setValue(marchandise.getCLASSEAPPAREIL());
				break;
			}
			case "USAGE":
			{
				fileItemFieldValue.setValue(marchandise.getUSAGE());
				break;
			}
			case "CATEGORIES":
			{
				fileItemFieldValue.setValue(marchandise.getCATEGORIES());
				break;
			}
			case "COULEUR":
			{
				fileItemFieldValue.setValue(marchandise.getCOULEUR());
				break;
			}
			case "CAPACITE":
			{
				fileItemFieldValue.setValue(marchandise.getCAPACITE());
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
			default:
				break;
		}
		return fileItemFieldValue;
	}
}

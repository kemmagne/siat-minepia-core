package org.guce.siat.core.utils.cct.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueCc.
 */
public class FileItemFieldValueCc
{
	/**
	 * Generate file item field value cc ct.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueCcCT(final FileItem fileItem, final FileItemField fileItemField,
			final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
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
			case "QUANTITE":
			{
				fileItemFieldValue.setValue(marchandise.getQUANTITE());
				break;
			}


			default:
				break;
		}
		return fileItemFieldValue;
	}

}

package org.guce.siat.core.utils.monotoring.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;

/**
 * The Class FileItemFieldValueAsMINCOMMERCE.
 */
public class FileItemFieldValueAsMINCOMMERCE
{
	/**
	 * Generate file item field value as mincommerce.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueAsMINCOMMERCE(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
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
			default:
				break;
		}
		return fileItemFieldValue;
	}
}

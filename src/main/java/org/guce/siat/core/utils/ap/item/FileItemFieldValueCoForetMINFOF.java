package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueCoCitesMINFOF.
 */
public class FileItemFieldValueCoForetMINFOF
{
	/**
	 * Generate file item field value_ c o_ cite s_ minfof.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueCoForetMINFOF(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
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
				fileItemFieldValue.setValue(marchandise.getSPECIFICATIONSTECHNIQUES());
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
			case "BOIS_NOMBRE_COLIS":
			{
				fileItemFieldValue.setValue(marchandise.getBOISNOMBRECOLIS());
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
			case "FAUNE_AGE_PRODUIT":
			{
				fileItemFieldValue.setValue(marchandise.getFAUNEAGEPRODUIT());
				break;
			}
			case "FAUNE_SEXE_PRODUIT":
			{
				fileItemFieldValue.setValue(marchandise.getFAUNESEXEPRODUIT());
				break;
			}
			case "FAUNE_DESCRIPTION_PRODUIT":
			{
				fileItemFieldValue.setValue(marchandise.getFAUNEDESCRIPTIONPRODUIT());
				break;
			}
			default:
				break;
		}
		return fileItemFieldValue;
	}

}

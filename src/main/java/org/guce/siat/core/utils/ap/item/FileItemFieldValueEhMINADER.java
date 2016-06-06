package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueEhMINADER.
 */
public class FileItemFieldValueEhMINADER
{
	/**
	 * Generate file item field value_ e h_ minader.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueEhMINADER(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "MATIERE_ACTIVE":
			{
				fileItemFieldValue.setValue(marchandise.getMATIEREACTIVE());
				break;
			}
			case "CONCENTRATION":
			{
				fileItemFieldValue.setValue(marchandise.getCONCENTRATION());
				break;
			}
			case "TYPE_FORMULATION":
			{
				fileItemFieldValue.setValue(marchandise.getTYPEFORMULATION());
				break;
			}
			case "CLASSE_TOXICOLOGIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getCLASSETOXICOLOGIQUE());
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
			case "USAGE":
			{
				fileItemFieldValue.setValue(marchandise.getUSAGE());
				break;
			}
			case "DOSES_UTILISATION":
			{
				fileItemFieldValue.setValue(marchandise.getDOSESUTILISATION());
				break;
			}
			case "PRESENTATION":
			{
				fileItemFieldValue.setValue(marchandise.getPRESENTATION());
				break;
			}

			case "ETIQUETAGE":
			{
				fileItemFieldValue.setValue(marchandise.getETIQUETAGE());
				break;
			}
			case "SPECIALITE":
			{
				fileItemFieldValue.setValue(marchandise.getSPECIALITE());
				break;
			}
			case "SPECULATION_CIBLE":
			{
				fileItemFieldValue.setValue(marchandise.getSPECULATIONCIBLE());
				break;
			}

			case "MALADIE_CIBLE":
			{
				fileItemFieldValue.setValue(marchandise.getMALADIECIBLE());
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

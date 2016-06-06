package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueCpMINEPDED.
 */
public class FileItemFieldValueCpMINEPDED
{
	/**
	 * Generate file item field value_ c p_ minepded.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueCpMINEPDED(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
			case "NUM_CAS":
			{
				fileItemFieldValue.setValue(marchandise.getNUMCAS());
				break;
			}
			case "NOM_COMMUN":
			{
				fileItemFieldValue.setValue(marchandise.getNOMCOMMUN());
				break;
			}
			case "NOM_PRODUIT_APRES_NIR":
			{
				fileItemFieldValue.setValue(marchandise.getNOMPRODUITAPRESNIR());
				break;
			}
			case "DENOMINATION_SCIENTIFIQUE":
			{
				fileItemFieldValue.setValue(marchandise.getDENOMINATIONSCIENTIFIQUE());
				break;
			}
			case "IDENTITES_PREPARATIONS_EXPORTER_A":
			{
				fileItemFieldValue.setValue(marchandise.getIDENTITESPREPARATIONSEXPORTER().getA());
				break;
			}
			case "IDENTITES_PREPARATIONS_EXPORTER_B":
			{
				fileItemFieldValue.setValue(marchandise.getIDENTITESPREPARATIONSEXPORTER().getB());
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

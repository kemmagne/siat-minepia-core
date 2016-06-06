package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueAeMINMIDT.
 */
public class FileItemFieldValueLvtbMINFOF
{
	/**
	 * Generate file item field value_ a e_ minmidt.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueLvtbMINFOF(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
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
			case "GRUMES_NUMERO":
			{
				fileItemFieldValue.setValue(marchandise.getGRUMESNUMERO());
				break;
			}
			case "GRUMES_MOYEN_GROS_BOUT":
			{
				fileItemFieldValue.setValue(marchandise.getGRUMESMOYENGROSBOUT());
				break;
			}
			case "GRUMES_MOYEN_PETIT_BOUT":
			{
				fileItemFieldValue.setValue(marchandise.getGRUMESMOYENPETITBOUT());
				break;
			}
			case "GRUMES_PAYS_PROVENANCE_CODE_PAYS":
			{
				if (marchandise.getGRUMESPAYSPROVENANCE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getGRUMESPAYSPROVENANCE().getCODEPAYS());
				}
				break;
			}
			case "GRUMES_PAYS_PROVENANCE_NOM_PAYS":
			{
				if (marchandise.getGRUMESPAYSPROVENANCE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getGRUMESPAYSPROVENANCE().getNOMPAYS());
				}
				break;
			}
			case "GRUMES_VOLUME":
			{
				fileItemFieldValue.setValue(marchandise.getGRUMESVOLUME());
				break;
			}
			case "ESSENCE":
			{
				fileItemFieldValue.setValue(marchandise.getESSENCE());
				break;
			}
			case "LONGUEUR":
			{
				fileItemFieldValue.setValue(marchandise.getLONGUEUR());
				break;
			}
			case "REFERENCE_CODE_BARRE":
			{
				fileItemFieldValue.setValue(marchandise.getREFERENCECODEBARRE());
				break;
			}

			case "DEBITES_NUMERO_COLIS":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESNUMEROCOLIS());
				break;
			}
			case "DEBITES_NATURE_PRODUIT":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESNATUREPRODUIT());
				break;
			}
			case "DEBITES_CODE":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESCODE());
				break;
			}
			case "DEBITES_EPAISSEUR":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESEPAISSEUR());
				break;
			}
			case "DEBITES_LARGEUR":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESLARGEUR());
				break;
			}
			case "DEBITES_NOMBRE_PIECES":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESNOMBREPIECES());
				break;
			}
			case "DEBITES_CUBAGE":
			{
				fileItemFieldValue.setValue(marchandise.getDEBITESCUBAGE());
				break;
			}
			default:
				break;
		}
		return fileItemFieldValue;
	}

}

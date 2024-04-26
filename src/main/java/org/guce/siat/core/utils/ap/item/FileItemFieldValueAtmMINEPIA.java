package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueAtMINEPIA.
 */
public class FileItemFieldValueAtmMINEPIA
{
	/**
	 * Generate file item field value_ a t_ minepia.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueAtmMINEPIA(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.ATM_MINEPIA.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
	{
		final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
		fileItemFieldValue.setFileItem(fileItem);
		fileItemFieldValue.setFileItemField(fileItemField);
		switch (fileItemField.getCode())
		{
                    
                    
                    
                    case "UNITE":
			{
				if (marchandise.getUNITE() != null)
				{
                                        
					fileItemFieldValue.setValue(marchandise.getUNITE());
                                         String Unity;
                                        
				}
				break;
			}

                    case "DESCRIPTION":
			{
				if (marchandise.getDESCRIPTION() != null)
				{
                                    String description = marchandise.getDESCRIPTION();
					fileItemFieldValue.setValue(marchandise.getDESCRIPTION());
				}
				break;
			}
			case "VALEUR_FOB_DEVISE":
			{
				if (marchandise.getVALEURFOBDEVISE() != null)
				{
                                        String valeurOfFoBDevise = marchandise.getVALEURFOBDEVISE().toString();
					fileItemFieldValue.setValue(marchandise.getVALEURFOBDEVISE().toString());
				}
				break;
			}
			case "LINE_NUMBER":
			{
				if (marchandise.getLINENUMBER() != null)
				{      
                                        String lineNumber = marchandise.getLINENUMBER().toString();
					fileItemFieldValue.setValue(marchandise.getLINENUMBER().toString());
				}
				break;
			}
			case "MODE_EMBALAGE":
			{
				if (marchandise.getMODEEMBALAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getMODEEMBALAGE());
				}
				break;
			}
			case "NOMBRE_COLIS":
			{
				if (marchandise.getNOMBRECOLIS() != null)
				{
					fileItemFieldValue.setValue(marchandise.getNOMBRECOLIS().toString());
				}
				break;
			}
//			case "QUANTITE":
//			{
//				if (marchandise.getQUANTITE() != null)
//				{
//					fileItemFieldValue.setValue(marchandise.getQUANTITE().toString());
//				}
//				break;
//			}
			case "NOM_COMMERCIAL":
			{
				if (marchandise.getNOMCOMMERCIALE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIALE());
				}
				break;
			}
			case "MARCHANDISE_UNITE":
			{
				if (marchandise.getUNITE() != null)
				{
                                        
					fileItemFieldValue.setValue(marchandise.getUNITE());
                                         String Unity;
                                        
				}
				break;
			}
                        
             
                        
//                        case "MARCHANDISE_POIDS":
//			{
//				if (marchandise.getPOIDS() != null)
//				{       String poids = marchandise.getPOIDS();
//					fileItemFieldValue.setValue(marchandise.getPOIDS());
//				}
//				break;
//			}
                        
			case "VALEUR_CFA":
			{
				if (marchandise.getVALEURCFA() != null)
				{
					fileItemFieldValue.setValue(marchandise.getVALEURCFA().toString());
				}
				break;
			}
			case "VOLUME":
			{
				if (marchandise.getVOLUME() != null)
				{
					fileItemFieldValue.setValue(marchandise.getVOLUME().toString());
				}
				break;
			}
//			case "POIDS":
//			{
//				if (marchandise.getPOIDS() != null)
//				{
//					fileItemFieldValue.setValue(marchandise.getPOIDS().toString());
//				}
//				break;
//			}
			case "CODE_TARIF_CODE_NSH":
			{
				if (marchandise.getCODETARIF() != null && marchandise.getCODETARIF().getCODENSH() != null)
				{
					fileItemFieldValue.setValue(marchandise.getCODETARIF().getCODENSH());
				}
				break;
			}
			case "CODE_TARIF_DESIGNATION":
			{
				if (marchandise.getCODETARIF() != null && marchandise.getCODETARIF().getDESIGNATION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getCODETARIF().getDESIGNATION());
				}
				break;
			}	
                        
                        case "MARCHANDISE_QUANTITE":
			{
				if (marchandise.getQUANTITE() != null)
				{
                                       String quantity = marchandise.getQUANTITE();
					fileItemFieldValue.setValue(marchandise.getQUANTITE());
				}
				break;
			}
                    

//			case "MARCHANDISE_QUANTITE":
//			{
//				fileItemFieldValue.setValue(marchandise.getQUANTITEIMPORTEE());
//				break;
//			}
//			case "MODE_STOCKAGE_CODE":
//			{
//				if (marchandise.getMODESTOCKAGE() != null)
//				{
//					fileItemFieldValue.setValue(marchandise.getMODESTOCKAGE().getCODE());
//				}
//				break;
//			}
//			case "MODE_STOCKAGE_LIBELLE":
//			{
//				if (marchandise.getMODESTOCKAGE() != null)
//				{
//					fileItemFieldValue.setValue(marchandise.getMODESTOCKAGE().getLIBELLE());
//				}
//				break;
//			}
//			case "USAGE":
//			{
//				fileItemFieldValue.setValue(marchandise.getUSAGE());
//				break;
//			}
//			case "NOM_COMMERCIAL":
//			{
//				fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIAL());
//				break;
//			}
//			case "NOM_SCIENTIFIQUE":
//			{
//				fileItemFieldValue.setValue(marchandise.getNOMSCIENTIFIQUE());
//				break;
//			}
//			case "FORMULE_CHIMIQUE":
//			{
//				fileItemFieldValue.setValue(marchandise.getFORMULECHIMIQUE());
//				break;
//			}
//			case "SPECIFICATION_TECHNIQUE":
//			{
//				fileItemFieldValue.setValue(marchandise.getSPECIFICATIONTECHNIQUE());
//				break;
//			}
//			case "VOLUME":
//			{
//				fileItemFieldValue.setValue(marchandise.getVOLUME());
//				break;
//			}
//			case "UNITE":
//			{
//				fileItemFieldValue.setValue(marchandise.getUNITE());
//				break;
//			}
//			case "PAYS_ORIGINE_CODE":
//			{
//				if (marchandise.getPAYSORIGINE() != null)
//				{
//					fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getCODEPAYS());
//				}
//				break;
//			}
//			case "PAYS_ORIGINE_LIBELLE":
//			{
//				if (marchandise.getPAYSORIGINE() != null)
//				{
//					fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getNOMPAYS());
//				}
//				break;
//			}
//			case "POIDS":
//			{
//				fileItemFieldValue.setValue(marchandise.getPOIDS());
//				break;
//			}
			default:
				break;
		}
		return fileItemFieldValue;
	}

}

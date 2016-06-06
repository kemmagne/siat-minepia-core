package org.guce.siat.core.utils.cct.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueCq.
 */
public class FileItemFieldValueCq
{
	/**
	 * Generate file item field value cq ct.
	 *
	 * @param fileItem
	 *           the file item
	 * @param fileItemField
	 *           the file item field
	 * @param marchandise
	 *           the marchandise
	 * @return the file item field value
	 */
	public static FileItemFieldValue generateFileItemFieldValueCqCT(final FileItem fileItem, final FileItemField fileItemField,
			final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
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
			case "PROMOTEUR_RAISON_SOCIALE":
			{
				if (marchandise.getPROMOTEUR() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSE1":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSE2":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_BP":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getBP());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_PAYS_ADRESSE_CODE_PAYS":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null
						&& marchandise.getPROMOTEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_PAYS_ADRESSE_NOM_PAYS":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null
						&& marchandise.getPROMOTEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_VILLE":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_EMAIL":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_SITE_WEB":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_FIXE_INDICATIF_PAYS":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getTELEPHONEFIXE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_FIXE_NUMERO":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getTELEPHONEFIXE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_MOBILE_INDICATIF_PAYS":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getTELEPHONEMOBILE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getTELEPHONEMOBILE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "PROMOTEUR_FAX_INDICATIF_PAYS":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getFAX() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_FAX_NUMERO":
			{
				if (marchandise.getPROMOTEUR() != null && marchandise.getPROMOTEUR().getFAX() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPROMOTEUR().getFAX().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MA_RAISON_SOCIALE":
			{
				if (marchandise.getFABRICANTMA() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getRAISONSOCIALE());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_ADRESSE1":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_ADRESSE2":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_BP":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getBP());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_PAYS_ADRESSE_CODE_PAYS":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null
						&& marchandise.getFABRICANTMA().getADRESSE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_PAYS_ADRESSE_NOM_PAYS":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null
						&& marchandise.getFABRICANTMA().getADRESSE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_VILLE":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getVILLE());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_EMAIL":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FABRICANT_MA_ADRESSE_SITE_WEB":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FABRICANT_MA_TELEPHONE_FIXE_INDICATIF_PAYS":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getTELEPHONEFIXE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MA_TELEPHONE_FIXE_NUMERO":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getTELEPHONEFIXE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MA_TELEPHONE_MOBILE_INDICATIF_PAYS":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getTELEPHONEMOBILE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MA_TELEPHONE_MOBILE_NUMERO":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getTELEPHONEMOBILE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MA_FAX_INDICATIF_PAYS":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getFAX() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MA_FAX_NUMERO":
			{
				if (marchandise.getFABRICANTMA() != null && marchandise.getFABRICANTMA().getFAX() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFABRICANTMA().getFAX().getNUMERO());
				}
				break;
			}
			case "PAYS_DESTINATION_CODE_PAYS":
			{
				if (marchandise.getPAYSDESTINATION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSDESTINATION().getCODEPAYS());
				}
				break;
			}
			case "PAYS_DESTINATION_NOM_PAYS":
			{
				if (marchandise.getPAYSDESTINATION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getPAYSDESTINATION().getNOMPAYS());
				}
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
			case "CONDITIONNEMENT_TYPE":
			{
				if (marchandise.getCONDITIONNEMENT() != null)
				{
					fileItemFieldValue.setValue(marchandise.getCONDITIONNEMENT().getTYPE());
				}
				break;
			}
			case "SPECIALITE":
			{
				fileItemFieldValue.setValue(marchandise.getSPECIALITE());
				break;
			}
			case "USAGE":
			{
				fileItemFieldValue.setValue(marchandise.getUSAGE());
				break;
			}
			case "PRESETATION":
			{
				fileItemFieldValue.setValue(marchandise.getPRESENTATION());
				break;
			}
			case "MARQUE":
			{
				fileItemFieldValue.setValue(marchandise.getMARQUE());
				break;
			}
			case "ETIQUETAGE":
			{
				fileItemFieldValue.setValue(marchandise.getETIQUETAGE());
				break;
			}
			case "LIEU_INSPECTION_UNLOCODE":
			{
				if (marchandise.getLIEUINSPECTION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getLIEUINSPECTION().getUNLOCODE());
				}
				break;
			}
			case "LIEU_INSPECTION_LIBELLE":
			{
				if (marchandise.getLIEUINSPECTION() != null)
				{
					fileItemFieldValue.setValue(marchandise.getLIEUINSPECTION().getLIBELLE());
				}
				break;
			}
			case "LIEU_STOCKAGE_UNLOCODE":
			{
				if (marchandise.getLIEUSTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getLIEUSTOCKAGE().getUNLOCODE());
				}
				break;
			}
			case "LIEU_STOCKAGE_LIBELLE":
			{
				if (marchandise.getLIEUSTOCKAGE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getLIEUSTOCKAGE().getLIBELLE());
				}
				break;
			}
			case "VALIDITE":
			{
				fileItemFieldValue.setValue(marchandise.getVALIDITE());
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

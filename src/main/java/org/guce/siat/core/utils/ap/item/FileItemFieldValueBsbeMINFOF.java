package org.guce.siat.core.utils.ap.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;


/**
 * The Class FileItemFieldValueAeMINMIDT.
 */
public class FileItemFieldValueBsbeMINFOF
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
	public static FileItemFieldValue generateFileItemFieldValueBsbeMINFOF(final FileItem fileItem,
			final FileItemField fileItemField,
			final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise)
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
			case "ESSENCE":
			{
				fileItemFieldValue.setValue(marchandise.getESSENCE());
				break;
			}
			case "NUMERO_COLIS":
			{
				fileItemFieldValue.setValue(marchandise.getNUMEROCOLIS());
				break;
			}
			case "NOMBRE_PIECES":
			{
				fileItemFieldValue.setValue(marchandise.getNOMBREPIECES());
				break;
			}
			case "EPAISSEUR":
			{
				fileItemFieldValue.setValue(marchandise.getEPAISSEUR());
				break;
			}
			case "LARGEUR":
			{
				fileItemFieldValue.setValue(marchandise.getLARGEUR());
				break;
			}
			case "LONGUEUR":
			{
				fileItemFieldValue.setValue(marchandise.getLONGUEUR());
				break;
			}
			case "VOLUME":
			{
				fileItemFieldValue.setValue(marchandise.getVOLUME());
				break;
			}

			case "OBSERVATIONS":
			{
				fileItemFieldValue.setValue(marchandise.getOBSERVATIONS());
				break;
			}
			case "FOURNISSEUR_RAISONSOCIALE":
			{
				if (marchandise.getFOURNISSEUR() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "FOURNISSEUR_SIGLE":
			{
				if (marchandise.getFOURNISSEUR() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getSIGLE());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_ADRESSE1":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_ADRESSE2":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_BP":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getBP());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null
						&& marchandise.getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null
						&& marchandise.getFOURNISSEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_VILLE":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FOURNISSEUR_ADRESSE_SITEWEB":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getADRESSE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FOURNISSEUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getTELEPHONEFIXE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FOURNISSEUR_TELEPHONE_FIXE_NUMERO":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getTELEPHONEFIXE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FOURNISSEUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getTELEPHONEMOBILE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FOURNISSEUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getTELEPHONEMOBILE() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FOURNISSEUR_FAX_INDICATIFPAYS":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getFAX() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FOURNISSEUR_FAX_NUMERO":
			{
				if (marchandise.getFOURNISSEUR() != null && marchandise.getFOURNISSEUR().getFAX() != null)
				{
					fileItemFieldValue.setValue(marchandise.getFOURNISSEUR().getFAX().getNUMERO());
				}
				break;
			}
			default:
				break;
		}
		return fileItemFieldValue;
	}

}

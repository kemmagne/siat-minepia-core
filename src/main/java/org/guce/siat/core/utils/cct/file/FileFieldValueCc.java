package org.guce.siat.core.utils.cct.file;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueCc.
 */
public class FileFieldValueCc
{
	/**
	 * Generate file field value cc ct.
	 *
	 * @param file
	 *           the file
	 * @param fileField
	 *           the file field
	 * @param document
	 *           the document
	 * @param applicationPropretiesService
	 *           the application propreties service
	 * @return the file field value
	 */
	public static FileFieldValue generateFileFieldValueCcCT(final File file, final FileField fileField,
			final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT document,
			final ApplicationPropretiesService applicationPropretiesService)
	{
		FileFieldValueUtils.applicationPropretiesService = applicationPropretiesService;
		final FileFieldValue fileFieldValue = new FileFieldValue();
		fileFieldValue.setFileField(fileField);
		fileFieldValue.setFile(file);
		switch (fileField.getCode())
		{
			case "CODE_BUREAU":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCODEBUREAU());
				}
				break;
			}
			case "PROMOTEUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getBP());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "PROMOTEUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getADRESSE().getSITEWEB());
				}
				break;
			}

			case "PROMOTEUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "PROMOTEUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "PROMOTEUR_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getPROMOTEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getPROMOTEUR().getFAX().getNUMERO());
				}
				break;
			}

			case "FABRICANT_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getRAISONSOCIALE());
				}
				break;
			}
			case "FABRICANT_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FABRICANT_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FABRICANT_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getBP());
				}
				break;
			}
			case "FABRICANT_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FABRICANT_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FABRICANT_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getVILLE());
				}
				break;
			}
			case "FABRICANT_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FABRICANT_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}

			case "FABRICANT_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANT() != null
						&& document.getCONTENT().getFABRICANT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANT().getFAX().getNUMERO());
				}
				break;
			}

			case "CARACTERISTIQUES_TECHNIQUES_CLES":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCARACTERISTIQUESTECHNIQUESCLES());
				}
				break;
			}

			case "ACCESSOIRES":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getACCESSOIRES());
				}
				break;
			}
			case "SIGNATAIRE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getNOM());
				}
				break;
			}
			case "SIGNATAIRE_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getQUALITE());
				}
				break;
			}
			case "SIGNATAIRE_LIEU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getLIEU());
				}
				break;
			}
			case "SIGNATAIRE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
				}
				break;
			}
			case "CERTIFICATION_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCERTIFICATION().getNUMERO());
				}
				break;
			}
			case "CERTIFICATION_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getCERTIFICATION().getVALIDITE());
				}
				break;
			}
			case "CERTIFICATION_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATION() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getCERTIFICATION().getDATE()));
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_REGION_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getREGION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getREGION().getCODE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_REGION_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getREGION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getREGION().getLIBELLE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_DEPARTEMENT_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getDEPARTEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getDEPARTEMENT().getCODE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_DEPARTEMENT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getDEPARTEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getDEPARTEMENT().getLIBELLE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_ARRONDISSEMENT_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getARRONDISSEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getARRONDISSEMENT().getCODE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_ARRONDISSEMENT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getARRONDISSEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getARRONDISSEMENT().getLIBELLE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_VILLAGE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getVILLAGE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getVILLAGE().getCODE());
				}
				break;
			}
			case "INSPECTION_LIEU_INSPECTION_VILLAGE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getVILLAGE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getVILLAGE().getLIBELLE());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getBP());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getPAYSADRESSE()
							.getNOMPAYS());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getVILLE());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getEMAIL());
				}
				break;
			}
			case "INSPECTION_LIEU_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "INSPECTION_NUMERO_LOT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getNUMEROLOT());
				}
				break;
			}
			case "INSPECTION_CONTENEURS_CONTENEUR":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
						&& document.getCONTENT().getINSPECTION().getCONTENEURS() != null
						&& CollectionUtils.isNotEmpty(document.getCONTENT().getINSPECTION().getCONTENEURS().getCONTENEUR()))
				{
					final List<String> columns = new ArrayList<String>();
					columns.add("Identification");
					columns.add("Type equipement");
					columns.add("Remplissage");
					columns.add("Scelles");
					final List<String> filedsValuesList = new ArrayList<String>();


					final int elementSize = document.getCONTENT().getINSPECTION().getCONTENEURS().getCONTENEUR().size();
					for (int i = 0; i < elementSize; i++)
					{
						if (document.getCONTENT().getINSPECTION().getCONTENEURS().getCONTENEUR().get(i) != null)
						{
							final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.INSPECTION.CONTENEURS.CONTENEUR currentEssai = document
									.getCONTENT().getINSPECTION().getCONTENEURS().getCONTENEUR().get(i);
							filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getIDENTIFICATION()) ? currentEssai
									.getIDENTIFICATION() : "-");
							filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getTYPEEQUIPMENT()) ? currentEssai
									.getTYPEEQUIPMENT() : "-");
							filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getREMPLISSAGE()) ? currentEssai.getREMPLISSAGE()
									: "-");
							filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getSCELLES()) ? currentEssai.getSCELLES() : "-");
						}
					}
					fileFieldValue.setValue(FileFieldValueUtils.addValueRepetable(filedsValuesList, columns, null));
				}
				break;
			}
			default:
				break;
		}
		return fileFieldValue;
	}
}

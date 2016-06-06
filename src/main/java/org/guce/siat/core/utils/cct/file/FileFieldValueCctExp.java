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
 * The Class FileFieldValueCct.
 */
public class FileFieldValueCctExp
{
	/**
	 * Generate file field value cc ct exp.
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
	public static FileFieldValue generateFileFieldValueCctCtExp(final File file, final FileField fileField,
			final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document, final ApplicationPropretiesService applicationPropretiesService)
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
			case "TYPE_DEMANDE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTYPEDEMANDE());
				}
				break;
			}
			case "TRANSITAIRE_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "TRANSITAIRE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getRAISONSOCIALE());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getBP());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getVILLE());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "TRANSITAIRE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "TRANSITAIRE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "TRANSITAIRE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "TRANSITAIRE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
						&& document.getCONTENT().getTRANSITAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getNUMERO());
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
			case "DESTINATAIRE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getRAISONSOCIALE());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getBP());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getVILLE());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "DESTINATAIRE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "DESTINATAIRE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "DESTINATAIRE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "DESTINATAIRE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
						&& document.getCONTENT().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getCERTIFICATEXPERTISE().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getTYPE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getCONTRATCOMMERCIAL().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
							.getCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
							.getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
							.getCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
							.getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_DATE_ARRIVEE_DEPART":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getTRANSPORT().getDATEARRIVEEDEPART()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TRANSPORT_NUM_CONNAISSEMENT_LTA":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getNUMCONNAISSEMENTLTA());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_TRANSIT_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_TRANSIT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getNOM());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_QUALITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getQUALITE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_LIEU":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getLIEU());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_SIGNATAIRE_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getSIGNATAIRE().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_NUMERO_PERMIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getNUMEROPERMIS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getPERMIS().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getRAISONSOCIALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getADRESSE1());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getADRESSE2());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getBP());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getVILLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getEMAIL());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
							.getSITEWEB());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
							.getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
							.getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_PAYS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_PAYS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_ESCALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT().getNUMEROESCALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_TYPE_LETTRE_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
							.getTYPELETTRETRANSPORT());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_LETTRE_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
							.getNUMEROLETTRETRANSPORT());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_DATE_LETTRE_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getLETTRETRANSPORT().getDATELETTRETRANSPORT()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_TRANSIT_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_TRANSIT_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_CONDITIONS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONDITIONS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE_DEVISE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODEDEVISE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANT());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT_TOTAL_DEVISE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALDEVISE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_TERMES_MONTANT_TOTAL_FCFA":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALFCFA());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_POINT_ENTREE_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getUNLOCODE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_POINT_ENTREE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getLIBELLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_AGREMENT_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getTYPE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_AGREMENT_REFERENCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getREFERENCE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_AGREMENT_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getAGREMENT().getDATE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_NUMERO_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION()
							.getNUMEROFACTURE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_DATE_FACTURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
							.getPERMISEXPLOITATION().getDATEFACTURE()));
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getVALIDITE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_TITULAIRE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getTITULAIRE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getRAISONSOCIALE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getADRESSE1());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getADRESSE2());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getBP());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue
							.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getVILLE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue
							.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
							.getSITEWEB());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
							.getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
							.getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_DESTINATAIRE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX().getNUMERO());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_LIEU_DELIVRANCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getLIEUDELIVRANCE());
				}
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_ORGANISME":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getORGANISME());
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
					fileFieldValue
							.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION().getARRONDISSEMENT().getLIBELLE());
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
			case "EXPEDITION_DATE_EXPEDITION_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getEXPEDITION() != null
						&& document.getCONTENT().getEXPEDITION().getDATEEXPEDITION() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getEXPEDITION()
							.getDATEEXPEDITION().getDATE()));
				}
				break;
			}
			case "EXPEDITION_DATE_EXPEDITION_HEURE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getEXPEDITION() != null
						&& document.getCONTENT().getEXPEDITION().getDATEEXPEDITION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getEXPEDITION().getDATEEXPEDITION().getHEURE());
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
							final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.INSPECTION.CONTENEURS.CONTENEUR currentEssai = document.getCONTENT().getINSPECTION().getCONTENEURS().getCONTENEUR().get(i);
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

package org.guce.siat.core.utils.ap.file;

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
 * The Class FileFieldValueAeMINMIDT.
 */
public class FileFieldValueBsbeMINFOF
{
	/**
	 * Generate file field value_ a e_ minmidt.
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
	public static FileFieldValue generateFileFieldValueBsbeMINFOF(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT document,
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
				if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null
						&& document.getCONTENT().getSIGNATAIRE().getDATE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDateSignatairePattern(document.getCONTENT().getSIGNATAIRE()
							.getDATE()));
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_NUMERO_BULLETIN":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getNUMEROBULLETIN());
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_DATE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getBULLETINSPECIFICATION()
							.getDATE()));
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_NUMERO_ENREGISTREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getNUMEROENREGISTREMENT());
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_LIEU_EXPORTATION_UNLOCODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null
						&& document.getCONTENT().getBULLETINSPECIFICATION().getLIEUEXPORTATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getLIEUEXPORTATION().getUNLOCODE());
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_LIEU_EXPORTATION_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null
						&& document.getCONTENT().getBULLETINSPECIFICATION().getLIEUEXPORTATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getLIEUEXPORTATION().getLIBELLE());
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_PAYS_DESTINATION_CODE_PAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null
						&& document.getCONTENT().getBULLETINSPECIFICATION().getPAYSDESTINATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getPAYSDESTINATION().getCODEPAYS());
				}
				break;
			}
			case "BULLETIN_SPECIFICATION_PAYS_DESTINATION_NOM_PAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null
						&& document.getCONTENT().getBULLETINSPECIFICATION().getPAYSDESTINATION() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getPAYSDESTINATION().getNOMPAYS());
				}
				break;
			}
			case "CONTENEURS_CONTENEUR":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getCONTENEURS() != null
						&& CollectionUtils.isNotEmpty(document.getCONTENT().getCONTENEURS().getCONTENEUR()))
				{
					final List<String> columns = new ArrayList<String>();
					columns.add("Identification");
					columns.add("Type equipement");
					columns.add("Remplissage");
					columns.add("Scelles");
					final List<String> filedsValuesList = new ArrayList<String>();


					final int elementSize = document.getCONTENT().getCONTENEURS().getCONTENEUR().size();
					for (int i = 0; i < elementSize; i++)
					{
						if (document.getCONTENT().getCONTENEURS().getCONTENEUR().get(i) != null)
						{
							final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR currentEssai = document
									.getCONTENT().getCONTENEURS().getCONTENEUR().get(i);
							filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getIDENTIFICATION()) ? currentEssai
									.getIDENTIFICATION() : "-");
							filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getTYPE()) ? currentEssai.getTYPE() : "-");
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

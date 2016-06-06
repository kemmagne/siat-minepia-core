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
import org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSANALYSES.ANALYSES.ANALYSE;
import org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSTESTS.TESTS.TEST;


/**
 * The Class FileFieldValueEhMINADER.
 */
public class FileFieldValueEhMINADER
{
	/**
	 * Generate file field value_ e h_ minader.
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
	public static FileFieldValue generateFileFieldValueEhMINADER(final File file, final FileField fileField,
			final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT document,
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
			case "NUMERO_EH":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROEH());
				}
				break;
			}
			case "DATE_EH":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEEH()));
				}
				break;
			}
			case "NUMERO_ARRETE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROARRETE());
				}
				break;
			}
			case "DATE_REUNION":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getDATEREUNION()));
				}
				break;
			}
			case "NUMERO_AIE":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMEROAIE());
				}
				break;
			}
			case "NUMERO_DI":
			{
				if (document.getCONTENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getNUMERODI());
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
			case "FORMULATEUR_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getRAISONSOCIALE());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getBP());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getVILLE());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FORMULATEUR_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFORMULATEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FORMULATEUR_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FORMULATEUR_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FORMULATEUR_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getPROMOTEUR() != null
						&& document.getCONTENT().getFORMULATEUR().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFORMULATEUR().getFAX().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getRAISONSOCIALE());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getBP());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getPAYSADRESSE()
							.getNOMPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getVILLE());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getEMAIL());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "FABRICANT_MATIERE_ACTIVE_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getFABRICANTMATIEREACTIVE() != null
						&& document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getFABRICANTMATIEREACTIVE().getFAX().getNUMERO());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_NUMERO_CONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getRAISONSOCIALE());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getBP());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_PAYSADDRESS_CODEPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_PAYSADDRESS_NOMPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue
							.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getPAYSADRESSE().getNOMPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getVILLE());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_ADRESSEELECTRONIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getEMAIL());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_ADRESSE_SITEWEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE().getINDICATIFPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE().getINDICATIFPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "REPRESENTANT_CAMEROUN_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getREPRESENTANTCAMEROUN() != null
						&& document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getREPRESENTANTCAMEROUN().getFAX().getNUMERO());
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
			case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_Lettre_TRANSPORT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
						&& document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
							.getNUMEROLettreTRANSPORT());
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
			case "RESULTATS_ANALYSES_ANALYSES":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& CollectionUtils.isNotEmpty(document.getCONTENT().getRESULTATSANALYSES().getANALYSES().getANALYSE()))
				{

					final List<String> analyseFiledsValuesList = new ArrayList<String>();
					final List<String> columns = new ArrayList<String>();
					columns.add("Type analyse");
					columns.add("Laboratoire");
					columns.add("Description");
					columns.add("Resultas");
					columns.add("Date");
					columns.add("Observation");
					final int analysesSize = document.getCONTENT().getRESULTATSANALYSES().getANALYSES().getANALYSE().size();
					for (int i = 0; i < analysesSize; i++)
					{
						if (document.getCONTENT().getRESULTATSANALYSES().getANALYSES().getANALYSE().get(i) != null)
						{
							final ANALYSE currentAnalyse = document.getCONTENT().getRESULTATSANALYSES().getANALYSES().getANALYSE()
									.get(i);
							analyseFiledsValuesList.add(StringUtils.isNotBlank(currentAnalyse.getTYPEANALYSE()) ? currentAnalyse
									.getTYPEANALYSE() : "-");
							analyseFiledsValuesList.add(StringUtils.isNotBlank(currentAnalyse.getLABORATOIRE()) ? currentAnalyse
									.getLABORATOIRE() : "-");
							analyseFiledsValuesList.add(StringUtils.isNotBlank(currentAnalyse.getDESCRIPTION()) ? currentAnalyse
									.getDESCRIPTION() : "-");
							analyseFiledsValuesList.add(StringUtils.isNotBlank(currentAnalyse.getRESULTATS()) ? currentAnalyse
									.getRESULTATS() : "-");
							analyseFiledsValuesList.add(FileFieldValueUtils.formatDatePattern(currentAnalyse.getDATE()));
							analyseFiledsValuesList.add(StringUtils.isNotBlank(currentAnalyse.getOBSERVATIONS()) ? currentAnalyse
									.getOBSERVATIONS() : "-");
						}
					}
					fileFieldValue.setValue(FileFieldValueUtils.addValueRepetable(analyseFiledsValuesList, columns, null));
				}
				break;
			}
			case "RESULTATS_TESTS_TESTS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& CollectionUtils.isNotEmpty(document.getCONTENT().getRESULTATSTESTS().getTESTS().getTEST()))
				{

					final List<String> testFiledsValuesList = new ArrayList<String>();
					final List<String> columns = new ArrayList<String>();
					columns.add("Type test");
					columns.add("Nature test");
					columns.add("Condition");
					columns.add("Culture");
					columns.add("Stade");
					columns.add("Description");
					columns.add("Date");
					columns.add("Lieu");
					columns.add("Code village");
					columns.add("Nom");
					columns.add("Intervenats");
					columns.add("Resultats");
					columns.add("Observation");
					final int testsSize = document.getCONTENT().getRESULTATSTESTS().getTESTS().getTEST().size();
					for (int i = 0; i < testsSize; i++)
					{
						if (document.getCONTENT().getRESULTATSTESTS().getTESTS().getTEST().get(i) != null)
						{
							final TEST currentTest = document.getCONTENT().getRESULTATSTESTS().getTESTS().getTEST().get(i);
							testFiledsValuesList
									.add(StringUtils.isNotBlank(currentTest.getTYPETEST()) ? currentTest.getTYPETEST() : "-");

							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getNATURETEST()) ? currentTest.getNATURETEST()
									: "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getCONDITION()) ? currentTest.getCONDITION()
									: "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getCULTURE()) ? currentTest.getCULTURE() : "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getSTADE()) ? currentTest.getSTADE() : "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getDESCRIPTION()) ? currentTest.getDESCRIPTION()
									: "-");
							testFiledsValuesList.add(FileFieldValueUtils.formatDatePattern(currentTest.getDATE()));
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getLIEU()) ? currentTest.getLIEU() : "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getCODEVILLAGE()) ? currentTest.getCODEVILLAGE()
									: "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getNOM()) ? currentTest.getNOM() : "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getINTERVENANTS()) ? currentTest
									.getINTERVENANTS() : "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getRESULTATS()) ? currentTest.getRESULTATS()
									: "-");
							testFiledsValuesList.add(StringUtils.isNotBlank(currentTest.getOBSERVATIONS()) ? currentTest
									.getOBSERVATIONS() : "-");
						}
					}
					fileFieldValue.setValue(FileFieldValueUtils.addValueRepetable(testFiledsValuesList, columns, null));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_NUMEROCONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getRAISONSOCIALE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_COMMERCE_NUMERO_INSCRIPTION_FICHIER":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTCOMMERCE()
							.getNUMEROINSCRIPTIONFICHIER());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_COMMERCE_DATE_OBTENTION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSANALYSES()
							.getCLIENT().getAGREMENTCOMMERCE().getDATEOBTENTION()));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_COMMERCE_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSANALYSES()
							.getCLIENT().getAGREMENTCOMMERCE().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_COMMERCE_NUMERO_CARTE_COMMERCANT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTCOMMERCE()
							.getNUMEROCARTECOMMERCANT());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_METIER_TYPE_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTMETIER()
							.getTYPEAGREMENT());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_METIER_DATE_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSANALYSES()
							.getCLIENT().getAGREMENTMETIER().getDATEAGREMENT()));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_METIER_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSANALYSES()
							.getCLIENT().getAGREMENTMETIER().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_AGREMENT_METIER_NUMERO_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getAGREMENTMETIER()
							.getNUMEROAGREMENT());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_PERMIS_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPERMIS().getTYPE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_PERMIS_DATE_OBTENTION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSANALYSES()
							.getCLIENT().getPERMIS().getDATEOBTENTION()));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_PERMIS_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSANALYSES()
							.getCLIENT().getPERMIS().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_PERMIS_NUMERO_PERMIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPERMIS().getNUMEROPERMIS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_PROFESSION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getPROFESSION());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_NUMERO_REGISTRE_COMMERCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getNUMEROREGISTRECOMMERCE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_CNI":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getCNI());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getBP());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_PAYS_ADRESSE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_PAYS_ADRESSE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getPAYSADRESSE()
							.getNOMPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getVILLE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_EMAIL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getEMAIL());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_ADRESSE_SITE_WEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEFIXE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEMOBILE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_CLIENT_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getCLIENT().getFAX().getNUMERO());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_CODE_TARIF_CODE_NSH":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getCODETARIF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getCODETARIF().getCODENSH());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_CODE_TARIF_DESIGNATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getCODETARIF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getCODETARIF().getDESIGNATION());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_SOUS_FAMILLE_CODE_SOUS_FAMILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getSOUSFAMILLE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getSOUSFAMILLE()
							.getCODESOUSFAMILLE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_SOUS_FAMILLE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getSOUSFAMILLE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getSOUSFAMILLE().getNOM());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_MATIERE_ACTIVE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getMATIEREACTIVE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_CONCENTRATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getCONCENTRATION());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_TYPE_FORMULATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getTYPEFORMULATION());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_USAGE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getUSAGE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_DOSES_TRAITEMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getDOSESTRAITEMENT());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_PAYS_ORIGINE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getPAYSORIGINE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getPAYSORIGINE().getCODEPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_PAYS_ORIGINE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getPAYSORIGINE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getPAYSORIGINE().getNOMPAYS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_NOM_COMMERCIAL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getNOMCOMMERCIAL());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_NOM_SCIENTIFIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getNOMSCIENTIFIQUE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_FORMULE_CHIMIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getFORMULECHIMIQUE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_SPECIFICATION_TECHNIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getSPECIFICATIONTECHNIQUE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_QUANTITEE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getQUANTITE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_UNITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getUNITE());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_POIDS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getPOIDS());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_VOLUME":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getVOLUME());
				}
				break;
			}
			case "RESULTATS_ANALYSES_PRODUIT_VALEUR_FOB_DEVISEE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSANALYSES() != null
						&& document.getCONTENT().getRESULTATSANALYSES().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSANALYSES().getPRODUIT().getVALEURFOBDEVISE());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_NUMEROCONTRIBUABLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getNUMEROCONTRIBUABLE());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_RAISONSOCIALE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getRAISONSOCIALE());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_COMMERCE_NUMERO_INSCRIPTION_FICHIER":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTCOMMERCE()
							.getNUMEROINSCRIPTIONFICHIER());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_COMMERCE_DATE_OBTENTION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSTESTS()
							.getCLIENT().getAGREMENTCOMMERCE().getDATEOBTENTION()));
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_COMMERCE_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSTESTS()
							.getCLIENT().getAGREMENTCOMMERCE().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_COMMERCE_NUMERO_CARTE_COMMERCANT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTCOMMERCE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTCOMMERCE()
							.getNUMEROCARTECOMMERCANT());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_METIER_TYPE_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTMETIER()
							.getTYPEAGREMENT());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_METIER_DATE_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSTESTS()
							.getCLIENT().getAGREMENTMETIER().getDATEAGREMENT()));
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_METIER_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSTESTS()
							.getCLIENT().getAGREMENTMETIER().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_AGREMENT_METIER_NUMERO_AGREMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTMETIER() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getAGREMENTMETIER()
							.getNUMEROAGREMENT());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_PERMIS_TYPE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPERMIS().getTYPE());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_PERMIS_DATE_OBTENTION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSTESTS()
							.getCLIENT().getPERMIS().getDATEOBTENTION()));
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_PERMIS_DATE_VALIDITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getRESULTATSTESTS()
							.getCLIENT().getPERMIS().getDATEVALIDITE()));
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_PERMIS_NUMERO_PERMIS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPERMIS() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPERMIS().getNUMEROPERMIS());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_PROFESSION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getPROFESSION());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_NUMERO_REGISTRE_COMMERCE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getNUMEROREGISTRECOMMERCE());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_CNI":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getCNI());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_ADRESSE1":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getADRESSE1());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_ADRESSE2":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getADRESSE2());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_BP":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getBP());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_PAYS_ADRESSE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getPAYSADRESSE()
							.getCODEPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_PAYS_ADRESSE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getPAYSADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getPAYSADRESSE()
							.getNOMPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_VILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getVILLE());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_EMAIL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getEMAIL());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_ADRESSE_SITE_WEB":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getADRESSE().getSITEWEB());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_TELEPHONE_FIXE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEFIXE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_TELEPHONE_FIXE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEFIXE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEFIXE().getNUMERO());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_TELEPHONE_MOBILE_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEMOBILE()
							.getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_TELEPHONE_MOBILE_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEMOBILE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getTELEPHONEMOBILE().getNUMERO());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_FAX_INDICATIFPAYS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getFAX().getINDICATIFPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_CLIENT_FAX_NUMERO":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getCLIENT().getFAX() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getCLIENT().getFAX().getNUMERO());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_CODE_TARIF_CODE_NSH":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getCODETARIF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getCODETARIF().getCODENSH());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_CODE_TARIF_DESIGNATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getCODETARIF() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getCODETARIF().getDESIGNATION());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_SOUS_FAMILLE_CODE_SOUS_FAMILLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getSOUSFAMILLE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getSOUSFAMILLE()
							.getCODESOUSFAMILLE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_SOUS_FAMILLE_NOM":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getSOUSFAMILLE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getSOUSFAMILLE().getNOM());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_MATIERE_ACTIVE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getMATIEREACTIVE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_CONCENTRATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getCONCENTRATION());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_TYPE_FORMULATION":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getTYPEFORMULATION());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_USAGE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getUSAGE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_DOSES_TRAITEMENT":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getDOSESTRAITEMENT());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_PAYS_ORIGINE_CODE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getPAYSORIGINE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getPAYSORIGINE().getCODEPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_PAYS_ORIGINE_LIBELLE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getPAYSORIGINE() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getPAYSORIGINE().getNOMPAYS());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_NOM_COMMERCIAL":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getNOMCOMMERCIAL());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_NOM_SCIENTIFIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getNOMSCIENTIFIQUE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_FORMULE_CHIMIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getFORMULECHIMIQUE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_SPECIFICATION_TECHNIQUE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getSPECIFICATIONTECHNIQUE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_QUANTITEE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getQUANTITE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_UNITE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getUNITE());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_POIDS":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getPOIDS());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_VOLUME":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getVOLUME());
				}
				break;
			}
			case "RESULTATS_TESTS_PRODUIT_VALEUR_FOB_DEVISEE":
			{
				if (document.getCONTENT() != null && document.getCONTENT().getRESULTATSTESTS() != null
						&& document.getCONTENT().getRESULTATSTESTS().getPRODUIT() != null)
				{
					fileFieldValue.setValue(document.getCONTENT().getRESULTATSTESTS().getPRODUIT().getVALEURFOBDEVISE());
				}
				break;
			}
			default:
				break;
		}
		return fileFieldValue;
	}

}

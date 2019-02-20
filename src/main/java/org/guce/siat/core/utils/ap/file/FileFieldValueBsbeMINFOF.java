package org.guce.siat.core.utils.ap.file;

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
				if(document.getCONTENT() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getCODEBUREAU());
                                }
				break;
			}
			case "SIGNATAIRE_NOM":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getNOM());
                                }
				break;
			}
                        case "SIGNATAIRE_QUALITE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getQUALITE());
                                }
				break;
			}
                        case "SIGNATAIRE_LIEU":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getLIEU());
                                }
				break;
			}
                        case "SIGNATAIRE_DATE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null && document.getCONTENT().getSIGNATAIRE().getDATE() != null) {
                                  fileFieldValue.setValue(FileFieldValueUtils.formatDateSignatairePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
                                }
				break;
			}
			case "BULLETIN_SPECIFICATION_NUMERO_BULLETIN":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getNUMEROBULLETIN());
                                }
				break;
			}
			case "BULLETIN_SPECIFICATION_DATE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null) {
                                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getBULLETINSPECIFICATION().getDATE()));
                                }
				break;
			}
                        case "BULLETIN_SPECIFICATION_NUMERO_ENREGISTREMENT":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getBULLETINSPECIFICATION() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getBULLETINSPECIFICATION().getNUMEROENREGISTREMENT());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_UNLOCODE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getUNLOCODE());
                                }
				break;
			}
                        case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_LIBELLE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getLIBELLE());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_UNLOCODE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getUNLOCODE());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_LIBELLE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getLIBELLE());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_DESTINATION_CODE_PAYS":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_DESTINATION_NOM_PAYS":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getNOMPAYS());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_ORIGINE_CODE_PAYS":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_PAYS_ORIGINE_NOM_PAYS":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getNOMPAYS());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_BSB_CERTIFICAT_ENREGISTREMENT_TYPE_PRODUIT":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT().getTYPEPRODUIT());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_BSB_CERTIFICAT_ENREGISTREMENT_NUMERO_ENREGISTREMENT":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT() != null) {
                                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT().getNUMEROENREGISTREMENT());
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_BSB_CERTIFICAT_ENREGISTREMENT_DATE_DELIVRANCE":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT() != null) {
                                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT().getDATEDELIVRANCE()));
                                }
				break;
			}
			case "INFORMATIONS_GENERALES_BSB_CERTIFICAT_ENREGISTREMENT_DATE_EXPIRATION":
			{
				if(document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT() != null) {
                                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES().getBSBCERTIFICATENREGISTREMENT().getDATEEXPIRATION()));
                                }
				break;
			}
			default:
				break;
		}
		return fileFieldValue;
	}

}

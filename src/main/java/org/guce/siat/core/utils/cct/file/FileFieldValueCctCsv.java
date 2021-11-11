package org.guce.siat.core.utils.cct.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;
import org.guce.siat.jaxb.cct.CCT_CSV.DOCUMENT;

/**
 *
 * @author tadzotsa
 */
public class FileFieldValueCctCsv {

    /**
     * Generate file field value cc ct.
     *
     * @param file the file
     * @param fileField the file field
     * @param document the document
     * @param applicationPropretiesService the application propreties service
     * @return the file field value
     */
    public static FileFieldValue generateFileFieldValueCctCSV(File file, FileField fileField, DOCUMENT document, ApplicationPropretiesService applicationPropretiesService) {

        FileFieldValueUtils.applicationPropretiesService = applicationPropretiesService;
        FileFieldValue fileFieldValue = new FileFieldValue();
        fileFieldValue.setFileField(fileField);
        fileFieldValue.setFile(file);

        switch (fileField.getCode()) {
            case "CODE_BUREAU": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getCODEBUREAU());
                }
                break;
            }
            case "TRANSITAIRE_NUMERO_CONTRIBUABLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getNUMEROCONTRIBUABLE());
                }
                break;
            }
            case "TRANSITAIRE_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getRAISONSOCIALE());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE1());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getADRESSE2());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getBP());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getVILLE());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getEMAIL());
                }
                break;
            }
            case "TRANSITAIRE_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getSITEWEB());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "TRANSITAIRE_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "TRANSITAIRE_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getINDICATIFPAYS());
                }
                break;
            }
            case "TRANSITAIRE_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getFAX().getNUMERO());
                }
                break;
            }
            case "SIGNATAIRE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getNOM());
                }
                break;
            }
            case "SIGNATAIRE_QUALITE": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getQUALITE());
                }
                break;
            }
            case "SIGNATAIRE_LIEU": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSIGNATAIRE().getLIEU());
                }
                break;
            }
            case "SIGNATAIRE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getSIGNATAIRE().getDATE()));
                }
                break;
            }
            case "EXPORTATEUR_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getRAISONSOCIALE());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getADRESSE1());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getADRESSE2());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getBP());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getVILLE());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getEMAIL());
                }
                break;
            }
            case "EXPORTATEUR_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getADRESSE().getSITEWEB());
                }
                break;
            }
            case "EXPORTATEUR_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "EXPORTATEUR_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "EXPORTATEUR_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "EXPORTATEUR_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "EXPORTATEUR_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getFAX().getINDICATIFPAYS());
                }
                break;
            }
            case "EXPORTATEUR_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                        && document.getCONTENT().getEXPORTATEUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getFAX().getNUMERO());
                }
                break;
            }
            case "DECLARATION_DOUANE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getDECLARATIONDOUANE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDECLARATIONDOUANE().getNUMERO());
                }
                break;
            }
            case "DECLARATION_DOUANE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getDECLARATIONDOUANE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDECLARATIONDOUANE().getDATE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CERTIFICAT_EXPERTISE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCERTIFICATEXPERTISE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getCERTIFICATEXPERTISE().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_TYPE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getTYPE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONTRAT_COMMERCIAL_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getCONTRATCOMMERCIAL() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getCONTRATCOMMERCIAL().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
                            .getCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MOYEN_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMOYENTRANSPORT()
                            .getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
                            .getCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_MODE_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getMODETRANSPORT()
                            .getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_DATE_ARRIVEE_DEPART": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getTRANSPORT().getDATEARRIVEEDEPART()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TRANSPORT_NUM_CONNAISSEMENT_LTA": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTRANSPORT().getNUMCONNAISSEMENTLTA());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_CHARGEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUCHARGEMENT().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_TRANSIT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_TRANSIT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUTRANSIT().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DECHARGEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDECHARGEMENT().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getNOM());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_QUALITE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getQUALITE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_LIEU": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE().getLIEU());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_SIGNATAIRE_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getSIGNATAIRE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getSIGNATAIRE().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_EXPORTATION_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUEXPORTATION().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_NUMERO_PERMIS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getNUMEROPERMIS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getPERMIS().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getRAISONSOCIALE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getADRESSE1());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getADRESSE2());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getBP());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getVILLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getEMAIL());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getADRESSE()
                            .getSITEWEB());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR()
                            .getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_DELIVREUR_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getDELIVREUR().getFAX()
                            .getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_PAYS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_PAYS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMIS().getPAYS().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_ESCALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT().getNUMEROESCALE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_TYPE_LETTRE_TRANSPORT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
                            .getTYPELETTRETRANSPORT());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_NUMERO_LETTRE_TRANSPORT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT()
                            .getNUMEROLETTRETRANSPORT());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LETTRE_TRANSPORT_DATE_LETTRE_TRANSPORT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLETTRETRANSPORT() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getLETTRETRANSPORT().getDATELETTRETRANSPORT()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_TRANSIT_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_TRANSIT_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSTRANSIT().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_ORIGINE_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_ORIGINE_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_DESTINATION_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PAYS_DESTINATION_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_CONDITIONS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getCONDITIONS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_CODE_DEVISE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getCODEDEVISE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANT());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_VENTE_MONTANT_TOTAL_DEVISE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALDEVISE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_TERMES_MONTANT_TOTAL_FCFA": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getTERMESVENTE().getMONTANTTOTALFCFA());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_POINT_ENTREE_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getUNLOCODE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_POINT_ENTREE_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPOINTENTREE().getLIBELLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_AGREMENT_TYPE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getTYPE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_AGREMENT_REFERENCE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT().getREFERENCE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_AGREMENT_DATE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getAGREMENT() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getAGREMENT().getDATE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_NUMERO_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION()
                            .getNUMEROFACTURE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_DATE_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getINFORMATIONSGENERALES()
                            .getPERMISEXPLOITATION().getDATEFACTURE()));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_VALIDITE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getVALIDITE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_PERMIS_EXPLOITATION_TITULAIRE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getPERMISEXPLOITATION().getTITULAIRE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getRAISONSOCIALE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getADRESSE1());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getADRESSE2());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getBP());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue
                            .setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getVILLE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue
                            .setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE().getEMAIL());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getADRESSE()
                            .getSITEWEB());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEFIXE()
                            .getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getTELEPHONEMOBILE()
                            .getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX()
                            .getINDICATIFPAYS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_EXPORTATEUR_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getDESTINATAIRE().getFAX().getNUMERO());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_LIEU_DELIVRANCE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getLIEUDELIVRANCE());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_LIEU_DELIVRANCE_ORGANISME": {
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINFORMATIONSGENERALES().getLIEUDELIVRANCE().getORGANISME());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_OBSERVATIONS": {
                if (document.getCONTENT() != null && document.getCONTENT().getDECISIONORGANISME() != null
                        && document.getCONTENT().getDECISIONORGANISME().getOBSERVATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDECISIONORGANISME().getOBSERVATION());
                }
                break;
            }
            case "MINEPIA_DATE_DEPART": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIADATEDEPART());
                }
                break;
            }
            case "MINEPIA_NO_PERMIS_CITES": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIANOPERMISCITES());
                }
                break;
            }
            case "MINEPIA_TEMPERATURE_PRODUIT": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIATEMPERATUREPRODUIT());
                }
                break;
            }
            case "MINEPIA_NOMBRE_UNITES_EMBALLES": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIANOMBREUNITESEMBALLES());
                }
                break;
            }
            case "MINEPIA_NATURE_EMBALLAGE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIANATUREEMBALLAGE());
                }
                break;
            }
            case "MINEPIA_ID_CONTENEURS_SCELLES": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAIDCONTENEURSSCELLES());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_POUR": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISEPOUR());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_ESPECE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISEESPECE());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_NATURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISENATURE());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_TRAITEMENT": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISETRAITEMENT());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_NB_COLIS": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null && document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISENBCOLIS() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISENBCOLIS().toString());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_NB_APPROUVES": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISENBAPPROUVES());
                }
                break;
            }
            case "MINEPIA_MARCHANDISE_POIDS_NET": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null && document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISEPOIDSNET() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getMINEPIAMARCHANDISEPOIDSNET().toString());
                }
                break;
            }
            case "MINEPIA_LIEU_ORIGINE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null && document.getCONTENT().getMINEPIAINFO().getLIEUORIGINE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getLIEUORIGINE().getNOM());
                }
                break;
            }
            case "MINEPIA_LIEU_ORIGINE_ADRESSE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null && document.getCONTENT().getMINEPIAINFO().getLIEUORIGINE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getLIEUORIGINE().getADRESSE());
                }
                break;
            }
            case "MINEPIA_ZONE_ORIGINE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMINEPIAINFO() != null && document.getCONTENT().getMINEPIAINFO().getZONEORIGINE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMINEPIAINFO().getZONEORIGINE());
                }
                break;
            }
        }

        return fileFieldValue;
    }

}

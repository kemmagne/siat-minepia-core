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
public class FileFieldValueCctExp {

    /**
     * Generate file field value cc ct exp.
     *
     * @param file the file
     * @param fileField the file field
     * @param document the document
     * @param applicationPropretiesService the application propreties service
     * @return the file field value
     */
    public static FileFieldValue generateFileFieldValueCctCtExp(final File file, final FileField fileField,
            final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document, final ApplicationPropretiesService applicationPropretiesService) {
        FileFieldValueUtils.applicationPropretiesService = applicationPropretiesService;
        final FileFieldValue fileFieldValue = new FileFieldValue();
        fileFieldValue.setFileField(fileField);
        fileFieldValue.setFile(file);
        switch (fileField.getCode()) {
            case "CODE_BUREAU": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getCODEBUREAU());
                }
                break;
            }
            case "NATURE_DEMANDE": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getNATUREDEMANDE());
                }
                break;
            }
            case "TYPE_DOSSIER_EGUCE": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTYPEDOSSIER());
                }
                break;
            }
            case "TYPE_PRODUIT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTYPEPRODUIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTYPEPRODUIT().getCODE());
                }
                break;
            }
            case "TYPE_PRODUIT_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getTYPEPRODUIT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTYPEPRODUIT().getNOM());
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
            case "DESTINATAIRE_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getRAISONSOCIALE());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_ADRESSE1": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getADRESSE1());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_ADRESSE2": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getADRESSE2());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getBP());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_PAYSADDRESS_CODEPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_PAYSADDRESS_NOMPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getVILLE());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_ADRESSEELECTRONIQUE": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getEMAIL());
                }
                break;
            }
            case "DESTINATAIRE_ADRESSE_SITEWEB": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getADRESSE().getSITEWEB());
                }
                break;
            }
            case "DESTINATAIRE_TELEPHONE_FIXE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE().getINDICATIFPAYS());
                }
                break;
            }
            case "DESTINATAIRE_TELEPHONE_FIXE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEFIXE().getNUMERO());
                }
                break;
            }
            case "DESTINATAIRE_TELEPHONE_MOBILE_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE().getINDICATIFPAYS());
                }
                break;
            }
            case "DESTINATAIRE_TELEPHONE_MOBILE_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getTELEPHONEMOBILE().getNUMERO());
                }
                break;
            }
            case "DESTINATAIRE_FAX_INDICATIFPAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getINDICATIFPAYS());
                }
                break;
            }
            case "DESTINATAIRE_FAX_NUMERO": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getNUMERO());
                }
                break;
            }
            case "DESTINATAIRE_AUTRE_CONTACT": {
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null
                        && document.getCONTENT().getDESTINATAIRE().getAUTRECONTACT()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getAUTRECONTACT());
                }
                break;
            }
            case "CLIENT_AUTRE_CONTACT": {
                if (document.getCONTENT() != null && document.getCONTENT().getCLIENT()!= null
                        && document.getCONTENT().getCLIENT().getAUTRECONTACT()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getCLIENT().getAUTRECONTACT());
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
            case "EXIGENCES_PHYTOSANITAIRES": {
                fileFieldValue.setValue(document.getCONTENT().getEXIGENCESPHYTOSANITAIRES());
                break;
            }//
            case "TRAITEMENT_SOCIETE_TRAITEMENT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getCODE());
                }
                break;
            }
            case "TRAITEMENT_SOCIETE_TRAITEMENT_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getNOM());
                }
                break;
            }
            case "TRAITEMENT_SOCIETE_TRAITEMENT_ADRESSE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getADRESSE());
                }
                break;
            }
            case "TRAITEMENT_SOCIETE_TRAITEMENT_TELEPHONE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getTELEPHONE());
                }
                break;
            }
            case "TRAITEMENT_SOCIETE_TRAITEMENT_FAX": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getFAX());
                }
                break;
            }
            case "TRAITEMENT_SOCIETE_TRAITEMENT_EMAIL": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getEMAIL());
                }
                break;
            }
            case "TRAITEMENT_SOCIETE_TRAITEMENT_BP": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null
                        && document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getBP());
                }
                break;
            }
            case "TRAITEMENT_TYPE_TRAITEMENT": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getTYPETRAITEMENT());
                }
                break;
            }
            case "TRAITEMENT_LIEU_TRAITEMENT": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getLIEUTRAITEMENT());
                }
                break;
            }
            case "TRAITEMENT_DATE_TRAITEMENT_PROPOSEE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRAITEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRAITEMENT().getDATETRAITEMENTPROPOSEE());
                }
                break;
            }
            case "INSPECTION_LIEU_INSPECTION": {
                if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null
                        && document.getCONTENT().getINSPECTION().getLIEUINSPECTION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getLIEUINSPECTION());
                }
                break;
            }
            case "INSPECTION_DATE_INSPECTION_PROPOSEE": {
                if (document.getCONTENT() != null && document.getCONTENT().getINSPECTION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getINSPECTION().getDATEINSPECTIONPROPOSEE());
                }
                break;
            }
            case "INSPECTION_CONTENEURS_CONTENEUR": {
                if (document.getCONTENT() != null
                        && document.getCONTENT().getCONTENEURS() != null
                        && CollectionUtils.isNotEmpty(document.getCONTENT().getCONTENEURS().getCONTENEUR())) {
                    final List<String> columns = new ArrayList<>();
                    columns.add("Numéro");
                    columns.add("Scellés");
                    columns.add("Type");
                    columns.add("Volume");
                    columns.add("Tonnage");
                    columns.add("Marque");
                    columns.add("Quantité colis");
                    columns.add("Essence");
                    final List<String> filedsValuesList = new ArrayList<>();

                    final int elementSize = document.getCONTENT().getCONTENEURS().getCONTENEUR().size();
                    for (int i = 0; i < elementSize; i++) {
                        if (document.getCONTENT().getCONTENEURS().getCONTENEUR().get(i) != null) {
                            final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR currentEssai = document.getCONTENT().getCONTENEURS().getCONTENEUR().get(i);
                            filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getNUMERO()) ? currentEssai.getNUMERO() : "-");
                            filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getSCELLE1()) ? currentEssai.getSCELLE1() : "-");
                            filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getTYPE()) ? currentEssai.getTYPE() : "-");
                            filedsValuesList.add(currentEssai.getVOLUME() != null ? currentEssai.getVOLUME().toString() : "-");
                            filedsValuesList.add(currentEssai.getTONNAGE() != null ? currentEssai.getTONNAGE().toString() : "-");
                            filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getMARQUE()) ? currentEssai.getMARQUE() : "-");
                            filedsValuesList.add(currentEssai.getQUANTITECOLIS() != null ? currentEssai.getQUANTITECOLIS().toString() : "-");
                            filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getESSENCE()) ? currentEssai.getESSENCE() : "-");
                        }
                    }
                    fileFieldValue.setValue(FileFieldValueUtils.addValueRepetable(filedsValuesList, columns, null));
                }
                break;
            }
            case "NUMEROS_LOTS": {
                if (document.getCONTENT() != null && document.getCONTENT().getLOTS() != null
                        && CollectionUtils.isNotEmpty(document.getCONTENT().getLOTS().getLOT())) {
                    final StringBuilder lotsBuilder = new StringBuilder(document.getCONTENT().getLOTS().getLOT().get(0).getNUMLOT());
                    final int elementSize = document.getCONTENT().getLOTS().getLOT().size();
                    for (int i = 1; i < elementSize; i++) {
                        lotsBuilder.append(" ");
                        lotsBuilder.append(document.getCONTENT().getLOTS().getLOT().get(i).getNUMLOT());
                    }
                    fileFieldValue.setValue(lotsBuilder.toString());

//                    final List<String> columns = new ArrayList<>();
//                    columns.add("Numéro");
//                    final List<String> filedsValuesList = new ArrayList<>();
//
//                    final int elementSize = document.getCONTENT().getLOTS().getLOT().size();
//                    for (int i = 0; i < elementSize; i++) {
//                        if (document.getCONTENT().getLOTS().getLOT().get(i) != null) {
//                            final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.LOTS.LOT currentEssai = document.getCONTENT().getLOTS().getLOT().get(i);
//                            filedsValuesList.add(StringUtils.isNotBlank(currentEssai.getNUMLOT()) ? currentEssai
//                                    .getNUMLOT() : "-");
//                        }
//                    }
//                    fileFieldValue.setValue(FileFieldValueUtils.addValueRepetable(filedsValuesList, columns, null));
                }
                break;
            }
            case "INFORMATIONS_GENERALES_OBSERVATIONS" : {
                if (document.getCONTENT() != null && document.getCONTENT().getOBSERVATIONS() != null){
                    fileFieldValue.setValue(document.getCONTENT().getOBSERVATIONS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_REFERENCE_BASE" : {
                if (document.getCONTENT() != null && document.getCONTENT().getBASEREFERENCE() != null){
                    fileFieldValue.setValue(document.getCONTENT().getBASEREFERENCE());
                    file.setNumeroDossierBase(document.getCONTENT().getBASEREFERENCE());
                }
                break;
            }
            case "AUTRE_INFORMATION_DECLARATION_ADDITIONNELLE" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDECLARATIONADDITIONNELLE() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDECLARATIONADDITIONNELLE());
                }
                break;
            }
            case "AUTRE_INFORMATION_DATE_TRAITEMENT" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDATETRAITEMENT() != null){
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDATETRAITEMENT()));
                }
                break;
            }
            case "AUTRE_INFORMATION_TYPE_TRAITEMENT" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getTYPETRAITEMENT() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getTYPETRAITEMENT());
                }
                break;
            }
            case "AUTRE_INFORMATION_DUREE_TRAITEMENT" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDUREETRAITEMENT() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDUREETRAITEMENT());
                }
                break;
            }
            case "AUTRE_INFORMATION_TEMPERATURE" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getTEMPERATURE() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getTEMPERATURE());
                }
                break;
            }
            case "AUTRE_INFORMATION_TRAITEMENT_EFFECTUE" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getTRAITEMENTEFFECTUE() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getTRAITEMENTEFFECTUE());
                }
                break;
            }
            case "AUTRE_INFORMATION_PRODUIT_CHIMIQUE" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getPRODUITCHIMIQUE() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getPRODUITCHIMIQUE());
                }
                break;
            }
            case "AUTRE_INFORMATION_CONCENTRATION" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getCONCENTRATION() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getCONCENTRATION());
                }
                break;
            }
            case "AUTRE_INFORMATION_RENSEIGNEMENT_COMPLEMENTAIRE" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getRENSEIGNEMENTCOMPLEMENTAIRE() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getRENSEIGNEMENTCOMPLEMENTAIRE());
                }
                break;
            }
            case "AUTRE_INFORMATION_FUMIGATION" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getFUMIGATION() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getFUMIGATION());
                }
                break;
            }
            case "AUTRE_INFORMATION_DESINFECTION" : {
                if (document.getCONTENT() != null && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE() != null
                        && document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDESINFECTION() != null){
                    fileFieldValue.setValue(document.getCONTENT().getCERTIFICATPHYTOSANITAIRE().getDESINFECTION());
                }
                break;
            }
            default:
                break;
        }
        return fileFieldValue;
    }

}


package org.guce.siat.core.utils.cct.file;

import org.apache.commons.lang3.BooleanUtils;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueCct.
 */
public class FileFieldValuePve {

    /**
     * Generate file field value cc ct exp.
     *
     * @param file the file
     * @param fileField the file field
     * @param document the document
     * @param applicationPropretiesService the application propreties service
     * @return the file field value
     */
    public static FileFieldValue generateFileFieldValuePve(final File file, final FileField fileField, final org.guce.siat.jaxb.cct.PVE.DOCUMENT document, final ApplicationPropretiesService applicationPropretiesService) {
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
            case "TYPE_PRODUIT_DETAIL": {
                if (document.getCONTENT() != null && document.getCONTENT().getTYPEPRODUIT() != null) {
                    boolean bool = BooleanUtils.toBoolean(document.getCONTENT().getTYPEPRODUIT().isDETAIL());
                    String label = BooleanUtils.toString(bool, Constants.YES_FR, Constants.NO_FR);
                    fileFieldValue.setValue(label);
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
            case "TRANSITAIRE_ADRESSE_EMAIL": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSITAIRE() != null
                        && document.getCONTENT().getTRANSITAIRE().getADRESSE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSITAIRE().getADRESSE().getEMAIL());
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
                if (document.getCONTENT() != null && document.getCONTENT().getDESTINATAIRE() != null && document.getCONTENT().getDESTINATAIRE().getFAX() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDESTINATAIRE().getFAX().getNUMERO());
                }
                break;
            }
            case "NAVIRE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getNAVIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getNAVIRE().getCODE());
                }
                break;
            }
            case "NAVIRE_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getNAVIRE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getNAVIRE().getLIBELLE());
                }
                break;
            }
            case "MODE_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMODETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMODETRANSPORT().getCODE());
                }
                break;
            }
            case "MODE_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getMODETRANSPORT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getMODETRANSPORT().getLIBELLE());
                }
                break;
            }
            case "LIEU_DESTINATION_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getLIEUDESTINATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getLIEUDESTINATION().getUNLOCODE());
                }
                break;
            }
            case "LIEU_DESTINATION_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getLIEUDESTINATION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getLIEUDESTINATION().getLIBELLE());
                }
                break;
            }
            case "LIEU_EMBARQUEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getLIEUXEMBARQUEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getLIEUXEMBARQUEMENT().getUNLOCODE());
                }
                break;
            }
            case "LIEU_EMBARQUEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getLIEUXEMBARQUEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getLIEUXEMBARQUEMENT().getLIBELLE());
                }
                break;
            }
            case "LIEU_DEDOUANEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getLIEUDEDOUANEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getLIEUDEDOUANEMENT().getUNLOCODE());
                }
                break;
            }
            case "LIEU_DEDOUANEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getLIEUDEDOUANEMENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getLIEUDEDOUANEMENT().getLIBELLE());
                }
                break;
            }
            case "DATE_SIGNATURE_RAPPORT": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDATESIGNATURERAPPORT());
                }
                break;
            }
            case "DATE_RDV_FINALE": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDATERDVFINALE());
                }
                break;
            }
            case "DATE_RDV_PROPOSEE": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDATERDVPROPOSEE());
                }
                break;
            }
            case "DATE_EMPOTAGE_EFFECTIF": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getDATEEMPOTAGEEFFECTIF());
                }
                break;
            }
            case "SUPERVISEUR_OPERATION": {
                if (document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSUPERVISEUROPERATION());
                }
                break;
            }
            case "ADMINISTRATION_TECHNIQUE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getADMINISTRATIONTECHNIQUE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getADMINISTRATIONTECHNIQUE().getCODE());
                }
                break;
            }
            case "ADMINISTRATION_TECHNIQUE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getADMINISTRATIONTECHNIQUE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getADMINISTRATIONTECHNIQUE().getNAME());
                }
                break;
            }
            case "SITE_EMPOTAGE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getSITEEMPOTAGE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSITEEMPOTAGE().getCODE());
                }
                break;
            }
            case "SITE_EMPOTAGE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getSITEEMPOTAGE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSITEEMPOTAGE().getNOM());
                }
                break;
            }
            case "SITE_EMPOTAGE_VILLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getSITEEMPOTAGE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSITEEMPOTAGE().getVILLE());
                }
                break;
            }
            case "SITE_EMPOTAGE_CODE_REGION": {
                if (document.getCONTENT() != null && document.getCONTENT().getSITEEMPOTAGE() != null && document.getCONTENT().getSITEEMPOTAGE().getREGION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSITEEMPOTAGE().getREGION().getCode());
                }
                break;
            }
            case "SITE_EMPOTAGE_NOM_REGION": {
                if (document.getCONTENT() != null && document.getCONTENT().getSITEEMPOTAGE() != null && document.getCONTENT().getSITEEMPOTAGE().getREGION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getSITEEMPOTAGE().getREGION().getLibelle());
                }
                break;
            }
            case "POSTE_CONTROLE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getPOSTECONTROLE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getPOSTECONTROLE().getCODE());
                }
                break;
            }
            case "POSTE_CONTROLE_NOM": {
                if (document.getCONTENT() != null && document.getCONTENT().getPOSTECONTROLE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getPOSTECONTROLE().getNOM());
                }
                break;
            }
            case "POSTE_CONTROLE_DELEGATION": {
                if (document.getCONTENT() != null && document.getCONTENT().getPOSTECONTROLE() != null) {
                    boolean isDelegation = BooleanUtils.toBoolean(document.getCONTENT().getPOSTECONTROLE().isDELEGATION());
                    String label = BooleanUtils.toString(isDelegation, Constants.YES_FR, Constants.NO_FR);
                    fileFieldValue.setValue(label);
                }
                break;
            }
            case "POSTE_CONTROLE_CODE_REGION": {
                if (document.getCONTENT() != null && document.getCONTENT().getPOSTECONTROLE() != null && document.getCONTENT().getPOSTECONTROLE().getREGION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getPOSTECONTROLE().getREGION().getCode());
                }
                break;
            }
            case "POSTE_CONTROLE_NOM_REGION": {
                if (document.getCONTENT() != null && document.getCONTENT().getPOSTECONTROLE() != null && document.getCONTENT().getPOSTECONTROLE().getREGION() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getPOSTECONTROLE().getREGION().getLibelle());
                }
                break;
            }
            case "CEMAC": {
                if (document.getCONTENT() != null) {
                    boolean bool = BooleanUtils.toBoolean(document.getCONTENT().isCEMAC());
                    String label = BooleanUtils.toString(bool, Constants.YES_FR, Constants.NO_FR);
                    fileFieldValue.setValue(label);
                }
                break;
            }
            case "DEBITES": {
                if (document.getCONTENT() != null) {
                    boolean bool = BooleanUtils.toBoolean(document.getCONTENT().isDEBITES());
                    String label = BooleanUtils.toString(bool, Constants.YES_FR, Constants.NO_FR);
                    fileFieldValue.setValue(label);
                }
                break;
            }
            case "PLACAGE": {
                if (document.getCONTENT() != null) {
                    boolean bool = BooleanUtils.toBoolean(document.getCONTENT().isPLACAGE());
                    String label = BooleanUtils.toString(bool, Constants.YES_FR, Constants.NO_FR);
                    fileFieldValue.setValue(label);
                }
                break;
            }
            case "CONTRE_PLAQUE": {
                if (document.getCONTENT() != null) {
                    boolean bool = BooleanUtils.toBoolean(document.getCONTENT().isCONTREPLAQUE());
                    String label = BooleanUtils.toString(bool, Constants.YES_FR, Constants.NO_FR);
                    fileFieldValue.setValue(label);
                }
                break;
            }
        }
        return fileFieldValue;
    }

}

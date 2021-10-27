package org.guce.siat.core.utils.cct.file;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.utils.FileFieldValueUtils;

/**
 * The Class FileFieldValueCcsMinsante.
 */
public class FileFieldValueCcsMinsante {

    /**
     * Generate file field value_ vt d_ minsante.
     *
     * @param file the file
     * @param fileField the file field
     * @param document the document
     * @param applicationPropretiesService the application propreties service
     * @return the file field value
     */
    public static FileFieldValue generateFileFieldValueCcsMinsante(final File file, final FileField fileField,
            final org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT document,
            final ApplicationPropretiesService applicationPropretiesService) {
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

            case "EXPORTATEUR_RAISONSOCIALE": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getRAISONSOCIALE());
                }
                break;
            }
            case "EXPORTATEUR_SIGLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getEXPORTATEUR().getSIGLE());
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
            case "FACTURE_NUMERO_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE()!= null
                        && document.getCONTENT().getFACTURE().getNUMEROFACTURE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getNUMEROFACTURE());
                }
                break;
            }
            case "FACTURE_DATE_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE()!= null
                        && document.getCONTENT().getFACTURE().getDATEFACTURE() != null) {
                    fileFieldValue.setValue(FileFieldValueUtils.formatDatePattern(document.getCONTENT().getFACTURE().getDATEFACTURE()));
                }
                break;
            }
            case "FACTURE_MONTANT_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE()!= null
                        && document.getCONTENT().getFACTURE().getMONTANTFACTURE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getMONTANTFACTURE());
                }
                break;
            }
            case "FACTURE_DEVISE_FACTURE_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE()!= null
                        && document.getCONTENT().getFACTURE().getDEVISEFACTURE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getDEVISEFACTURE().getCODE());
                }
                break;
            }
            case "FACTURE_DEVISE_FACTURE_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE()!= null
                        && document.getCONTENT().getFACTURE().getDEVISEFACTURE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getDEVISEFACTURE().getLIBELLE());
                }
                break;
            }
            case "FACTURE_MONTANT_CFA_FACTURE": {
                if (document.getCONTENT() != null && document.getCONTENT().getFACTURE()!= null
                        && document.getCONTENT().getFACTURE().getMONTANTFACTURE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getFACTURE().getMONTANTFACTURECFA());
                }
                break;
            }
            case "TRANSPORT_MOYEN_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getCODE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getCODE());
                }
                break;
            }
            case "TRANSPORT_MOYEN_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT()!= null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getLIBELLE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getLIBELLE());
                }
                break;
            }
            case "TRANSPORT_MOYEN_TRANSPORT_IMMO": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getIMMO()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getIMMO());
                }
                break;
            }
            case "TRANSPORT_MOYEN_TRANSPORT_MMSC": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT()!= null
                        && document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getMMSC()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMOYENTRANSPORT().getMMSC());
                }
                break;
            }
            case "TRANSPORT_MODE_TRANSPORT_CODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT()!= null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getCODE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getCODE());
                }
                break;
            }
            case "TRANSPORT_MODE_TRANSPORT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT()!= null
                        && document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getLIBELLE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getMODETRANSPORT().getLIBELLE());
                }
                break;
            }
            case "TRANSPORT_NUMERO_BL": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getNUMEROBL()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getNUMEROBL());
                }
                break;
            }
            case "TRANSPORT_LIEU_DEDOUANEMENT_UNLOCODE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getUNLOCODE());
                }
                break;
            }
            case "TRANSPORT_LIEU_DEDOUANEMENT_LIBELLE": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getLIEUDEDOUANEMENT().getLIBELLE());
                }
                break;
            }
            case "TRANSPORT_PAYS_ORIGINE_CODE_PAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getPAYSORIGINE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getCODEPAYS());
                }
                break;
            }
            case "TRANSPORT_PAYS_ORIGINE_NOM_PAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getPAYSORIGINE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getNOMPAYS());
                }
                break;
            }
            case "TRANSPORT_PAYS_PROVENANCE_CODE_PAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE().getCODEPAYS());
                }
                break;
            }
            case "TRANSPORT_PAYS_PROVENANCE_NOM_PAYS": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE().getNOMPAYS());
                }
                break;
            }
            case "TRANSPORT_NB_CONTENEUR20": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getNBCONTENEUR20()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getNBCONTENEUR20());
                }
                break;
            }
            case "TRANSPORT_NB_CONTENEUR40": {
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getNBCONTENEUR40()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getTRANSPORT().getNBCONTENEUR40());
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
            case "DOCUMENTS_NUMERO_DI": {
                if (document.getCONTENT() != null && document.getCONTENT().getDOCUMENTS()!= null 
                        && document.getCONTENT().getDOCUMENTS().getNUMERODI()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getDOCUMENTS().getNUMERODI());
                }
                break;
            }
            case "DOCUMENTS_NUMERO_VTP": {
                if (document.getCONTENT() != null && document.getCONTENT().getDOCUMENTS()!= null
                        && document.getCONTENT().getDOCUMENTS().getNUMEROVTP()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getDOCUMENTS().getNUMEROVTP());
                }
                break;
            }
            case "DOCUMENTS_NUMERO_VTD": {
                if (document.getCONTENT() != null && document.getCONTENT().getDOCUMENTS()!= null
                        && document.getCONTENT().getDOCUMENTS().getNUMEROVTD()!= null) {
                    fileFieldValue.setValue(document.getCONTENT().getDOCUMENTS().getNUMEROVTD());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_REFERENCE_OBSERVATIONS": {
                if (document.getCONTENT() != null && document.getCONTENT() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getOBSERVATIONS());
                }
                break;
            }
            case "INFORMATIONS_GENERALES_REFERENCE_BASE": {
                if (document.getCONTENT() != null && document.getCONTENT().getREFERENCEBASE() != null) {
                    fileFieldValue.setValue(document.getCONTENT().getREFERENCEBASE());
                    file.setNumeroDossierBase(document.getCONTENT().getREFERENCEBASE());
                }
                break;
            }
            
            default:
                int fieldType = org.guce.siat.core.utils.FileFieldValueUtils.FIELD_TYPE_STRING;
                if (fileField.getCode().contains("_DATE") || fileField.getCode().contains("DATE_") || fileField.getCode().equals("DATE")) {
                    fieldType = org.guce.siat.core.utils.FileFieldValueUtils.FIELD_TYPE_DATE;
                }
                fileFieldValue.setValue(org.guce.siat.core.utils.FileFieldValueUtils.retrieveValue(document.getCONTENT(), fileField.getCode(), fieldType));
                break;
        }
        return fileFieldValue;
    }

}

package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.AppointmentItemFlow;
import org.guce.siat.common.model.Attachment;
import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.FlowGuceSiat;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.utils.ConverterGuceSiatUtils;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.DecisionOrganism;
import org.guce.siat.common.utils.ExceptionConstants;
import org.guce.siat.common.utils.ebms.ESBConstants;
import org.guce.siat.common.utils.ebms.EbmsUtility;
import org.guce.siat.common.utils.ebms.UtilitiesException;
import org.guce.siat.common.utils.enums.CompanyType;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.common.utils.exception.ValidationException;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PottingReport;
import org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl;
import static org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl.DATE_FORMAT;
import org.guce.siat.core.ct.util.PottingReportConstants;
import org.guce.siat.core.utils.cct.file.FileFieldValuePve;
import org.guce.siat.utility.jaxb.common.PAIEMENT;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ht
 */
public class XmlConverterPve extends AbstractXmlConverter {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConverterPve.class);

    public XmlConverterPve(XmlConverterServiceImpl xmlConverterService) {
        super(xmlConverterService);
    }

    @Override
    protected org.guce.siat.jaxb.cct.PVE.DOCUMENT checkInstance(Serializable serializable) {
        return (org.guce.siat.jaxb.cct.PVE.DOCUMENT) serializable;
    }

    @Override
    public File convertDocumentToFile(final Serializable serializable) throws ParseException, ValidationException {

        final org.guce.siat.jaxb.cct.PVE.DOCUMENT document = checkInstance(serializable);

        initXmlConverterService(document.getREFERENCEDOSSIER(), document.getMESSAGE(), document.getTYPEDOCUMENT(), document.getCONTENT().getCODEBUREAU());

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        FileType fileType;
        if (xmlConverterService.getFlowGuceSiat() != null) {
            fileType = xmlConverterService.getFlowGuceSiat().getFileType();
        } else {
            fileType = xmlConverterService.getFileTypeDao().findByCode(FileTypeCode.CCT_CT_E_PVE);
        }

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValuePve.generateFileFieldValuePve(file, fileField, document, xmlConverterService.getApplicationPropretiesService());
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_CT_61.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCESIAT() != null && !document.getREFERENCEDOSSIER().getREFERENCESIAT().isEmpty()) {
                file.setReferenceSiat(document.getREFERENCEDOSSIER().getREFERENCESIAT());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuce(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getNUMERODEMANDE() != null) {
                file.setNumeroDemande(document.getREFERENCEDOSSIER().getNUMERODEMANDE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getNUMERODOSSIER() != null) {
                file.setNumeroDossier(document.getREFERENCEDOSSIER().getNUMERODOSSIER());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getDATECREATION() != null) {
                file.setCreatedDate(DATE_FORMAT.parse(document.getREFERENCEDOSSIER().getDATECREATION()));
            }
            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuce(document.getREFERENCEDOSSIER().getSERVICE());
            }
            if (document.getROUTAGE() != null && document.getROUTAGE().getEMETTEUR() != null) {
                file.setEmetteur(document.getROUTAGE().getEMETTEUR());
            }

            if (document.getROUTAGE() != null && document.getROUTAGE().getDESTINATAIRE() != null) {
                file.setDestinataire(document.getROUTAGE().getDESTINATAIRE());
            }

            setNumeroDossier(file);

        }

        /* ADD CLIENT */
        if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null && document.getCONTENT().getEXPORTATEUR().getNUMEROCONTRIBUABLE() != null) {
            Company client = xmlConverterService.getCompanyDao().findCompanyByNumContribuable(document.getCONTENT().getEXPORTATEUR().getNUMEROCONTRIBUABLE());
            if (client != null) {
                file.setClient(client);
            } else {
                client = new Company();
                if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null) {
                    client.setNumContribuable(document.getCONTENT().getEXPORTATEUR().getNUMEROCONTRIBUABLE());
                    client.setCompanyName(document.getCONTENT().getEXPORTATEUR().getRAISONSOCIALE());
                    client.setCompanyType(CompanyType.DECLARANT);
                    client.setcNI(document.getCONTENT().getEXPORTATEUR().getCNI());
                    if (document.getCONTENT().getEXPORTATEUR().getADRESSE() != null) {
                        client.setFirstAddress(document.getCONTENT().getEXPORTATEUR().getADRESSE().getADRESSE1());
                        client.setSecondAddress(document.getCONTENT().getEXPORTATEUR().getADRESSE().getADRESSE2());
                        client.setPostalCode(document.getCONTENT().getEXPORTATEUR().getADRESSE().getBP());
                        client.setCity(document.getCONTENT().getEXPORTATEUR().getADRESSE().getVILLE());
                        client.setEmail(document.getCONTENT().getEXPORTATEUR().getADRESSE().getEMAIL());
                        client.setWebSite(document.getCONTENT().getEXPORTATEUR().getADRESSE().getSITEWEB());
                        // Get country from database
                    }
                    if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                            && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null
                            && document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE() != null
                            && document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS() != null) {
                        Country country = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                        if (country != null) {
                            client.setCountry(country);
                        } else {
                            country = new Country();
                            if (document.getCONTENT() != null && document.getCONTENT().getEXPORTATEUR() != null
                                    && document.getCONTENT().getEXPORTATEUR().getADRESSE() != null
                                    && document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE() != null) {
                                country.setCountryIdAlpha2(document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                                country.setCountryName(document.getCONTENT().getEXPORTATEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                                xmlConverterService.getCountryDao().save(country);
                                client.setCountry(country);
                            }
                        }
                    }
                    if (document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE() != null) {
                        client.setPhone(document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE().getINDICATIFPAYS() != null ? "("
                                + document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE().getINDICATIFPAYS() + ")"
                                + document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE().getNUMERO() : StringUtils.EMPTY
                                + document.getCONTENT().getEXPORTATEUR().getTELEPHONEFIXE().getNUMERO());
                    }
                    if (document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE() != null) {
                        client.setMobile(document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS() != null ? "("
                                + document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS() + ")"
                                + document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE().getNUMERO() : StringUtils.EMPTY
                                + document.getCONTENT().getEXPORTATEUR().getTELEPHONEMOBILE().getNUMERO());
                    }
                    if (document.getCONTENT().getEXPORTATEUR().getFAX() != null) {
                        client.setFax(document.getCONTENT().getEXPORTATEUR().getFAX().getINDICATIFPAYS() != null ? "("
                                + document.getCONTENT().getEXPORTATEUR().getFAX().getINDICATIFPAYS() + ")"
                                + document.getCONTENT().getEXPORTATEUR().getFAX().getNUMERO() : StringUtils.EMPTY
                                + document.getCONTENT().getEXPORTATEUR().getFAX().getNUMERO());
                    }
                }
                xmlConverterService.getCompanyDao().save(client);
                file.setClient(client);
            }
        }

        /* CONTENEURS */
        xmlConverterService.populateContainers(document, file);

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document.getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
                    fileItem.setNumEbmsMessage(document.getMESSAGE().getNUMEROMESSAGE());
                }

                if (marchandise.getLINENUMBER() != null) {

                    fileItem.setLineNumber(marchandise.getLINENUMBER());

                }

                if (marchandise.getQUANTITE() != null) {

                    fileItem.setQuantity(marchandise.getQUANTITE());
                }

                if (marchandise.getVALEURFOBDEVISE() != null) {

                    fileItem.setFobValue(marchandise.getVALEURFOBDEVISE());
                }

                //				ServicesItem subfamily = null;
                if (marchandise.getCODETARIF() != null && StringUtils.isNotBlank(marchandise.getCODETARIF().getCODENSH())) {
                    fileItem.setNsh(xmlConverterService.getItemDao().findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
                }

                fileItems.add(fileItem);

            }

            file.setFileItemsList(fileItems);
        }

        /* PIECES JOINTES */
        final List<Attachment> attachmentList = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getPIECESJOINTES() != null
                && document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE() != null) {
            for (final PIECESJOINTES.PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ());
                }
                if (StringUtils.isNotBlank(pieceJointe.getTYPEPJ())) {
                    attachment.setAttachmentType(pieceJointe.getTYPEPJ());
                } else {
                    throw new ValidationException(ExceptionConstants.ATTACHEMENT);
                }

                attachmentList.add(attachment);
            }

            file.setAttachmentsList(attachmentList);
        }

        /* ADD DECISION ORGANISM POUR DOSSIER */
        if (document.getCONTENT() != null && document.getCONTENT().getDECISIONORGANISME() != null) {
            final DecisionOrganism decisionOrganism = new DecisionOrganism();
            decisionOrganism.setCode(document.getCONTENT().getDECISIONORGANISME().getCODE());
            decisionOrganism.setLibelle(document.getCONTENT().getDECISIONORGANISME().getLIBELLE());
            decisionOrganism.setObservation(document.getCONTENT().getDECISIONORGANISME().getOBSERVATION());

            xmlConverterService.getDecisionDossier().put(file, decisionOrganism);
        }

        return file;

    }

    @Override
    public org.guce.siat.jaxb.cct.PVE.DOCUMENT convertFileToDocument(File file, List<FileItem> fileItemList, List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        org.guce.siat.jaxb.cct.PVE.DOCUMENT ciDocument = new org.guce.siat.jaxb.cct.PVE.DOCUMENT();

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());

        ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT());

        if (Arrays.asList(FlowCode.FL_CT_08.name(), FlowCode.FL_CT_89.name(), FlowCode.FL_CT_140.name(), FlowCode.FL_CT_114.name()).contains(flowToExecute.getCode())) {
            String pjType = PottingReportConstants.PVE_ATTACHMENT_TYPE;
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE().add(new PIECESJOINTES.PIECEJOINTE(pjType, file.getReferenceGuce() + ESBConstants.PDF_FILE_EXTENSION));

            ciDocument.getCONTENT().setPVEMPOTAGE(new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.PVEMPOTAGE());

            PottingReport pottingReport = xmlConverterService.getPottingReportDao().findPottingReportByFile(file);
            if (pottingReport == null) {
                pottingReport = xmlConverterService.getPottingReportDao().findPottingReportByFile(file, false);
                if (pottingReport != null) {
                    pottingReport.setValidated(true);
                    if (pottingReport.getPottingController() == null) {
                        if(file.getAssignedUser() != null){
                            pottingReport.setPottingController(file.getAssignedUser());
                        }
                    }
                    xmlConverterService.getPottingReportDao().update(pottingReport);
                }
            }

            ciDocument.getCONTENT().getPVEMPOTAGE().setNUMEROPV(file.getNumeroDossier());
            ciDocument.getCONTENT().getPVEMPOTAGE().setNUMEROAT(pottingReport.getTreatmentCertNumber());
            if (pottingReport.getTreatmentCertDate() != null) {
                ciDocument.getCONTENT().getPVEMPOTAGE().setDATEAT(DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, pottingReport.getTreatmentCertDate()));
            }
            ciDocument.getCONTENT().getPVEMPOTAGE().setDATEPV(DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, Calendar.getInstance().getTime()));
            ciDocument.getCONTENT().getPVEMPOTAGE().setSIGNATAIRE(String.format("%s %s", file.getSignatory().getLastName(), file.getSignatory().getFirstName()));
            ciDocument.getCONTENT().setNUMEROAUTORISATION(pottingReport.getAuthorizationNumber());
            if (pottingReport.getAuthorizationDate() != null) {
                ciDocument.getCONTENT().setDATEAUTORISATION(DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, pottingReport.getAuthorizationDate()));
            }
            if (pottingReport.getPottingController() != null) {
                ciDocument.getCONTENT().setSUPERVISEUROPERATION(String.format("%s %s", pottingReport.getPottingController().getLastName(), pottingReport.getPottingController().getFirstName())); // ???
            }
            if (pottingReport.getPottingEndDate() != null) {
                ciDocument.getCONTENT().setDATEEMPOTAGEEFFECTIF(DateUtils.formatSimpleDate(DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS_FR, pottingReport.getPottingEndDate()));
            }
        } else if (FlowCode.FL_CT_121.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_133.name().equals(flowToExecute.getCode())) {
            String pjType = "INVOICE";
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE().add(new PIECESJOINTES.PIECEJOINTE(pjType, "INV-" + file.getNumeroDossier() + ESBConstants.PDF_FILE_EXTENSION));
        } else if (FlowCode.FL_CT_104.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_118.name().equals(flowToExecute.getCode())) {
            PottingReport pottingReport = xmlConverterService.getPottingReportDao().findPottingReportByFile(file, false);
            if (pottingReport.getAppointmentDate() != null) {
                ciDocument.getCONTENT().setDATERDVFINALE(DateUtils.formatSimpleDate(DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS_FR, pottingReport.getAppointmentDate()));
            }
        }
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_CT_63.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_62.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        // si facture
        if (FlowCode.FL_CT_121.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_133.name().equals(flowToExecute.getCode())) {
            PaymentData paymentData = xmlConverterService.getPaymentDataDao().findPaymentDataByFileItem(file.getFileItemsList().get(0));

            PAIEMENT paiement = new PAIEMENT();

            PAIEMENT.FACTURE facture = new PAIEMENT.FACTURE();

            ItemFlow itemFlow = itemFlowList.get(0);

            facture.setREFERENCEFACTURE(paymentData.getRefFacture());
            facture.setTYPEFACTURE(file.getFileType().getPaymentFileType());
            facture.setMONTANTHT(paymentData.getMontantHt().toString());
            facture.setMONTANTTVA(paymentData.getMontantTva().toString());
            facture.setMONTANTTTC(Long.toString(paymentData.getMontantHt() + paymentData.getMontantTva()));
            facture.setOBJET(paymentData.getNatureFrais());
            facture.setDATEFACTURATION(DateUtils.formatSimpleDate(DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS_XXX, itemFlow.getCreated()));

            paiement.setFACTURE(facture);

            PAIEMENT.CHARGEUR chargeur = new PAIEMENT.CHARGEUR();
            chargeur.setNUMEROCONTRIBUABLE(file.getClient().getNumContribuable());
            chargeur.setRAISONSOCIALE(file.getClient().getCompanyName());
            paiement.setCHARGEUR(chargeur);

            PAIEMENT.BENEFICIAIRE beneficiaire = new PAIEMENT.BENEFICIAIRE();
            beneficiaire.setCODE(file.getBureau().getCode());
            beneficiaire.setLIBELLE(file.getBureau().getLabelFr());
            paiement.setBENEFICIAIRE(beneficiaire);

            if (ciDocument.getCONTENT() == null) {
                ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT());
            }

            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE().setNOM(itemFlow.getSender().getLastName());
            ciDocument.getCONTENT().getSIGNATAIRE().setLIEU(itemFlow.getSender().getAdministration().getLabelFr());
            ciDocument.getCONTENT().getSIGNATAIRE().setDATE(DateUtils.formatSimpleDate(DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS, itemFlow.getCreated()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlow.getSender().getPosition().getLabelFr());

            ciDocument.getCONTENT().setPAIEMENT(paiement);
        }

        /* DETECTER SI DECISION PAR ARTICLE OU PAR DOSSIER */
        if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList()) && ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // Decision organisme

            ItemFlowData itemFlowDataToInsert = null;

            if (FlowCode.FL_CT_104.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_118.name().equals(flowToExecute.getCode())) {
                for (ItemFlowData itemFlowData : itemFlowList.get(0).getItemFlowsDataList()) {
                    if (itemFlowData.getDataType().getCode() == null) {
                        itemFlowDataToInsert = itemFlowData;
                        break;
                    }
                }
            } else if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }

            ciDocument.getCONTENT().setDECISIONORGANISME(ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));
        } else if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())) {
            /* DECISION PAR ARTICLE */
            final List<org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandiseList = new ArrayList<>();
            for (final FileItem fileItem : fileItemList) {
                ItemFlowData itemFlowDataToInsert = null;
                for (final ItemFlow itemFlow : itemFlowList) {
                    if (itemFlow.getFileItem().getId().equals(fileItem.getId())) {

                        if (CollectionUtils.isNotEmpty(itemFlow.getItemFlowsDataList())) {
                            itemFlowDataToInsert = itemFlow.getItemFlowsDataList().get(0);
                        }
                        break;
                    }
                }
                final org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();

                marchandise.setLINENUMBER(fileItem.getLineNumber());
                // code tarif
                final org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif = new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF();
                final org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille = new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE();
                codetarif.setCODENSH(fileItem.getNsh() != null ? fileItem.getNsh().getGoodsItemCode() : null);
                sousfamille.setCODESOUSFAMILLE(fileItem.getSubfamily() != null ? fileItem.getSubfamily().getCode() : null);
                marchandise.setCODETARIF(codetarif);
                marchandise.setSOUSFAMILLE(sousfamille);

                marchandiseList.add(marchandise);

            }
            ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.MARCHANDISES());
            ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().addAll(marchandiseList);

        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
        }

        ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.SIGNATAIRE());

        ciDocument.getCONTENT().getSIGNATAIRE().setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
        ciDocument.getCONTENT().getSIGNATAIRE().setLIEU(itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0).getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration().getLabelFr().subSequence(0, 34).toString());
        ciDocument.getCONTENT().getSIGNATAIRE().setNOM(String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender().getLastName()));
        ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

        return ciDocument;
    }

    @Override
    public void update(File file, Serializable serializable) {

        // notification de rendez-vous après confirmation par l'administration technique principale
        boolean notifRdv = FlowCode.FL_CT_130.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat());
        // notification par l'admin princ après émission de la modification du rapport d'empotage
        boolean notifPpModified = FlowCode.FL_CT_110.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())
                && "E030".equals(xmlConverterService.getFlowGuceSiat().getFlowGuce());
        if (notifRdv || notifPpModified) {

            final org.guce.siat.jaxb.cct.PVE.DOCUMENT document = checkInstance(serializable);

            PottingReport pottingReport = new PottingReport();

            Appointment appointment = null;
            if (notifRdv) {
                appointment = new Appointment();
            }

            if (appointment != null) {
                appointment.setBundle("Appointment_".concat(file.getFileType().getCode().name()));
                List<ItemFlow> itemFlows = xmlConverterService.getItemFlowDao().findLastItemFlowsByFileAndFlow(file, FlowCode.FL_CT_130);
                for (ItemFlow itemFlow : itemFlows) {
                    AppointmentItemFlow appIflow = new AppointmentItemFlow();

                    appIflow.setAppointment(appointment);
                    appIflow.setAppointmentDate(appointment.getBeginTime());
                    appIflow.setDeleted(Boolean.FALSE);
                    appIflow.setItemFlow(itemFlow);

                    appointment.getAppointmentItemFlowList().add(appIflow);
                }
            }

            pottingReport.setFile(file);

            if (document.getCONTENT().getDATERDVFINALE() != null) {
                Date start = DateUtils.parse(document.getCONTENT().getDATERDVFINALE(), DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS_FR);
                pottingReport.setAppointmentDate(start);
                if (appointment != null) {
                    appointment.setBeginTime(start);
                }
            }

            if (document.getCONTENT().getDATEEMPOTAGEEFFECTIF() != null) {
                Date end = DateUtils.parse(document.getCONTENT().getDATEEMPOTAGEEFFECTIF(), DateUtils.PATTERN_YYYY_MM_DD_HH_MM_SS_FR);
                pottingReport.setPottingEndDate(end);
                if (appointment != null) {
                    appointment.setEndTime(end);
                }
            }

            if (pottingReport.getPottingController() == null) {
                if (file.getAssignedUser() != null) {
                    pottingReport.setPottingController(file.getAssignedUser());
                }
            }

            xmlConverterService.getPottingReportDao().save(pottingReport);
            if (appointment != null) {
                xmlConverterService.getAppointmentDao().save(appointment);
            }
        }
    }

}

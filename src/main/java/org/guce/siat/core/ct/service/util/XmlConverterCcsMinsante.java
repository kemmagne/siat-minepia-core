package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.Attachment;
import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Container;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;
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
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl;
import static org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl.DATE_FORMAT;
import org.guce.siat.core.ct.util.DecisionHistoryUtils;
import org.guce.siat.core.utils.PaiementGenerator;
import org.guce.siat.core.utils.cct.file.FileFieldValueCcsMinsante;
import org.guce.siat.core.utils.cct.file.FileFieldValueCcsMinsante;
import org.guce.siat.core.utils.cct.item.FileItemFieldValueCcsMinsante;
import org.guce.siat.utility.jaxb.common.PAIEMENT;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ht
 */
public class XmlConverterCcsMinsante extends AbstractXmlConverter {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConverterCcsMinsante.class);

    public XmlConverterCcsMinsante(XmlConverterServiceImpl xmlConverterService) {
        super(xmlConverterService);
    }

    @Override
    protected org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT checkInstance(Serializable serializable) {
        return (org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT) serializable;
    }

    @Override
    public File convertDocumentToFile(final Serializable serializable) throws ParseException, ValidationException {

        final org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT document = checkInstance(serializable);

        initXmlConverterService(document.getREFERENCEDOSSIER(), document.getMESSAGE(), document.getTYPEDOCUMENT(), document.getCONTENT().getCODEBUREAU());

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        FileType fileType;
        if (xmlConverterService.getFlowGuceSiat() != null) {
            fileType = xmlConverterService.getFlowGuceSiat().getFileType();
        } else {
            fileType = xmlConverterService.getFileTypeDao().findByCode(FileTypeCode.CCS_MINSANTE);
        }

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCcsMinsante.generateFileFieldValueCcsMinsante(file, fileField, document, xmlConverterService.getApplicationPropretiesService());
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

        } else if (FlowCode.FL_CT_160.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGucePaiement(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGucePaiement(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCESIAT() != null
                    && !document.getREFERENCEDOSSIER().getREFERENCESIAT().isEmpty()) {
                file.setReferenceSiat(document.getREFERENCEDOSSIER().getREFERENCESIAT());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuce(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getNUMERODEMANDE() != null) {
                file.setNumeroDemande(document.getREFERENCEDOSSIER().getNUMERODEMANDE());
            }

            if (xmlConverterService.getNumDossier() != null) {
                file.setNumeroDossier(xmlConverterService.getNumDossier());
            } else if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getNUMERODOSSIER() != null) {
                file.setNumeroDossier(document.getREFERENCEDOSSIER().getNUMERODOSSIER());
            }

            // Set Numero dossier and parent File for modification file
            if (FlowCode.FL_CT_CCS_01.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {
                setNumeroDossierModif(file);
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
        }

        /* ADD IMPORTATEUR */
        if (document.getCONTENT() != null && document.getCONTENT().getIMPORTATEUR() != null && document.getCONTENT().getIMPORTATEUR().getNUMEROCONTRIBUABLE() != null) {
            Company client = xmlConverterService.getCompanyDao().findCompanyByNumContribuable(document.getCONTENT().getIMPORTATEUR().getNUMEROCONTRIBUABLE());
            Company buildClient = buildCompany(document);
            boolean newClient = !buildClient.equalsWithoutId(client);
            if (newClient) {
                xmlConverterService.getCompanyDao().save(buildClient);
                file.setClient(buildClient);
            } else {
                file.setClient(client);
            }
        }

        /* CONTENEURS */
        populateContainers(document, file);

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document.getCONTENT()
                    .getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCcsMinsante.generateFileItemFieldValueCcsMinsante(
                            fileItem, fileItemField, marchandise);
                    if (StringUtils.isNotBlank(fileItemFieldValue.getValue())) {

                        fileItemFieldValues.add(fileItemFieldValue);
                    }

                }
                fileItem.setFileItemFieldValueList(fileItemFieldValues);

                if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
                    fileItem.setNumEbmsMessage(document.getMESSAGE().getNUMEROMESSAGE());
                }

                if (marchandise.getLINENUMBER() != null) {

                    fileItem.setLineNumber(marchandise.getLINENUMBER());

                }

                if (marchandise.getQUANTITE() != null) {

                    fileItem.setQuantity(marchandise.getQUANTITE());
                } else if (marchandise.getPOIDS() != null) {
                    fileItem.setQuantity(marchandise.getPOIDS());
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
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                && document.getCONTENT().getTRANSPORT().getPAYSORIGINE() != null
                && document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getTRANSPORT()
                    .getPAYSORIGINE().getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getPAYSORIGINE() != null) {
                    countryOfOrigin
                            .setCountryIdAlpha2(document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getCODEPAYS());
                    countryOfOrigin.setCountryName(document.getCONTENT().getTRANSPORT().getPAYSORIGINE().getNOMPAYS());

                    xmlConverterService.getCountryDao().save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                && document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE() != null
                && document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getTRANSPORT()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getTRANSPORT() != null
                        && document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE()
                            .getCODEPAYS());
                    countryOfProvenance.setCountryName(document.getCONTENT().getTRANSPORT().getPAYSPROVENANCE()
                            .getNOMPAYS());

                    xmlConverterService.getCountryDao().save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        return file;

    }

    private Company buildCompany(org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT document) {
        Company client = new Company();
        if (document.getCONTENT() != null && document.getCONTENT().getIMPORTATEUR() != null) {
            client.setNumContribuable(document.getCONTENT().getIMPORTATEUR().getNUMEROCONTRIBUABLE());
            client.setCompanyName(document.getCONTENT().getIMPORTATEUR().getRAISONSOCIALE());
            client.setCompanyType(CompanyType.DECLARANT);
            if (document.getCONTENT().getIMPORTATEUR().getAGREMENTCOMMERCE() != null) {
                client.setCommerceApprovalRegistrationNumberFile(document.getCONTENT().getIMPORTATEUR().getAGREMENTCOMMERCE()
                        .getNUMEROINSCRIPTIONFICHIER());
                client.setCommerceApprovalObtainedDate(document.getCONTENT().getIMPORTATEUR().getAGREMENTCOMMERCE()
                        .getDATEOBTENTION());
                client.setCommerceApprovalValidityDate(document.getCONTENT().getIMPORTATEUR().getAGREMENTCOMMERCE()
                        .getDATEVALIDITE());
                client.setCommerceApprovalNumberTraderMap(document.getCONTENT().getIMPORTATEUR().getAGREMENTCOMMERCE()
                        .getNUMEROCARTECOMMERCANT());
            }
            if (document.getCONTENT().getIMPORTATEUR().getAGREMENTMETIER() != null) {
                client.setBusinessApprovalType(document.getCONTENT().getIMPORTATEUR().getAGREMENTMETIER().getTYPEAGREMENT());
                client.setBusinessApprovalRegistrationNumber(document.getCONTENT().getIMPORTATEUR().getAGREMENTMETIER()
                        .getNUMEROAGREMENT());
                client.setBusinessApprovalDate(document.getCONTENT().getIMPORTATEUR().getAGREMENTMETIER().getDATEAGREMENT());
                client.setBusinessApprovalValidityDate(document.getCONTENT().getIMPORTATEUR().getAGREMENTMETIER().getDATEVALIDITE());
            }
            if (document.getCONTENT().getIMPORTATEUR().getPERMIS() != null) {
                client.setPermitNumber(document.getCONTENT().getIMPORTATEUR().getPERMIS().getNUMEROPERMIS());
                client.setPermitObtainingDate(document.getCONTENT().getIMPORTATEUR().getPERMIS().getDATEOBTENTION());
                client.setPermitApprovalDate(document.getCONTENT().getIMPORTATEUR().getPERMIS().getDATEVALIDITE());
                client.setPermitType(document.getCONTENT().getIMPORTATEUR().getPERMIS().getTYPE());
            }
            client.setProfession(document.getCONTENT().getIMPORTATEUR().getPROFESSION());
            client.setTradeRegisterNumber(document.getCONTENT().getIMPORTATEUR().getNUMEROREGISTRECOMMERCE());
            client.setcNI(document.getCONTENT().getIMPORTATEUR().getCNI());
            if (document.getCONTENT().getIMPORTATEUR().getADRESSE() != null) {
                client.setFirstAddress(document.getCONTENT().getIMPORTATEUR().getADRESSE().getADRESSE1());
                client.setSecondAddress(document.getCONTENT().getIMPORTATEUR().getADRESSE().getADRESSE2());
                client.setPostalCode(document.getCONTENT().getIMPORTATEUR().getADRESSE().getBP());
                client.setCity(document.getCONTENT().getIMPORTATEUR().getADRESSE().getVILLE());
                client.setEmail(document.getCONTENT().getIMPORTATEUR().getADRESSE().getEMAIL());
                client.setWebSite(document.getCONTENT().getIMPORTATEUR().getADRESSE().getSITEWEB());
                // Get country from database
            }
            if (document.getCONTENT() != null && document.getCONTENT().getIMPORTATEUR() != null
                    && document.getCONTENT().getIMPORTATEUR().getADRESSE() != null
                    && document.getCONTENT().getIMPORTATEUR().getADRESSE().getPAYSADRESSE() != null
                    && document.getCONTENT().getIMPORTATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS() != null) {
                Country country = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getIMPORTATEUR().getADRESSE()
                        .getPAYSADRESSE().getCODEPAYS());
                if (country != null) {
                    client.setCountry(country);
                } else {
                    country = new Country();
                    if (document.getCONTENT() != null && document.getCONTENT().getIMPORTATEUR() != null
                            && document.getCONTENT().getIMPORTATEUR().getADRESSE() != null
                            && document.getCONTENT().getIMPORTATEUR().getADRESSE().getPAYSADRESSE() != null) {
                        country.setCountryIdAlpha2(document.getCONTENT().getIMPORTATEUR().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                        country.setCountryName(document.getCONTENT().getIMPORTATEUR().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                        xmlConverterService.getCountryDao().save(country);
                        client.setCountry(country);
                    }
                }
            }
            if (document.getCONTENT().getIMPORTATEUR().getTELEPHONEFIXE() != null) {
                client.setPhone(document.getCONTENT().getIMPORTATEUR().getTELEPHONEFIXE().getINDICATIFPAYS() != null ? "("
                        + document.getCONTENT().getIMPORTATEUR().getTELEPHONEFIXE().getINDICATIFPAYS() + ")"
                        + document.getCONTENT().getIMPORTATEUR().getTELEPHONEFIXE().getNUMERO() : StringUtils.EMPTY
                        + document.getCONTENT().getIMPORTATEUR().getTELEPHONEFIXE().getNUMERO());
            }
            if (document.getCONTENT().getIMPORTATEUR().getTELEPHONEMOBILE() != null) {
                client.setMobile(document.getCONTENT().getIMPORTATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS() != null ? "("
                        + document.getCONTENT().getIMPORTATEUR().getTELEPHONEMOBILE().getINDICATIFPAYS() + ")"
                        + document.getCONTENT().getIMPORTATEUR().getTELEPHONEMOBILE().getNUMERO() : StringUtils.EMPTY
                        + document.getCONTENT().getIMPORTATEUR().getTELEPHONEMOBILE().getNUMERO());
            }
            if (document.getCONTENT().getIMPORTATEUR().getFAX() != null) {
                client.setFax(document.getCONTENT().getIMPORTATEUR().getFAX().getINDICATIFPAYS() != null ? "("
                        + document.getCONTENT().getIMPORTATEUR().getFAX().getINDICATIFPAYS() + ")"
                        + document.getCONTENT().getIMPORTATEUR().getFAX().getNUMERO() : StringUtils.EMPTY
                        + document.getCONTENT().getIMPORTATEUR().getFAX().getNUMERO());
            }
        }

        return client;
    }

    private void populateContainers(org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT document, File file) {

        if (document.getCONTENT() == null || document.getCONTENT().getCONTENEURS() == null || CollectionUtils.isEmpty(document.getCONTENT().getCONTENEURS().getCONTENEUR())) {
            return;
        }

        if (CollectionUtils.isNotEmpty(file.getContainers())) {
            xmlConverterService.getDao().delete(file.getContainers());
        }

        List<org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> conteneurs = document.getCONTENT().getCONTENEURS().getCONTENEUR();
        Set<Container> containers = new HashSet<>();
        for (org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR conteneur : conteneurs) {

            final Container container = new Container();

            if (file.getId() != null) {
                container.setFile(file);
            }

            container.setContNumber(conteneur.getNUMEROCONTENEUR());
            container.setContSeal1(StringUtils.isNotBlank(conteneur.getSELLE1()) ? conteneur.getSELLE1() : "-");
            container.setContSeal2(StringUtils.isNotBlank(conteneur.getSELLE2()) ? conteneur.getSELLE2() : "-");
            container.setContSeal3(StringUtils.isNotBlank(conteneur.getSELLE3()) ? conteneur.getSELLE3() : "-");
            container.setContType(StringUtils.isNotBlank(conteneur.getTYPE()) ? conteneur.getTYPE() : "-");
            if (StringUtils.isNotEmpty(conteneur.getVOLUME())) {
                container.setContVolume(new BigDecimal(conteneur.getVOLUME()));
            }
            if (StringUtils.isNotEmpty(conteneur.getPOIDS())) {
                container.setContGrossMass(new BigDecimal(conteneur.getPOIDS()));
            }
            container.setContMark(StringUtils.isNotBlank(conteneur.getMARQUE()) ? conteneur.getMARQUE() : "-");
            container.setContNumberOfPackages(conteneur.getNOMBRECOLIS() != null ? conteneur.getNOMBRECOLIS().intValue() : null);
            if (StringUtils.isNotEmpty(conteneur.getVGM())) {
                container.setContVgm(new BigDecimal(conteneur.getVGM()));
            }
            container.setContFull(conteneur.isContFull());
            container.setContDangerousIndicator(conteneur.getINDICATEURDANGER());
            container.setContRefrigerated(conteneur.isREFRIGERE());

            containers.add(container);
        }

        if (file.getId() == null) {
            file.setContainers(new ArrayList<>(containers));
        } else {
            xmlConverterService.getDao().save(new ArrayList<>(containers));
        }
    }

    @Override
    public org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT convertFileToDocument(File file, List<FileItem> fileItemList, List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT ciDocument = new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT());

        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        }
        if (Arrays.asList(FlowCode.FL_CT_158.name(), FlowCode.FL_CT_160.name()).contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT());
//            final ItemFlow paymentFlow = xmlConverterService.getItemFlowDao().findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
//                    FlowCode.valueOf(flowToExecute.getCode()));
//            final PaymentData paymentData = xmlConverterService.getPaymentDataDao().findPaymentDataByItemFlow(paymentFlow);
            ItemFlow lastItemFlow;
            PaymentData paymentData = null;
            final List<ItemFlow> lastPaymentItemFlowList = xmlConverterService.getItemFlowDao().findLastItemFlowsByFileAndFlow(file, FlowCode.FL_CT_158);
            for (final ItemFlow itemFlow : lastPaymentItemFlowList) {
                lastItemFlow = itemFlow;
                paymentData = xmlConverterService.getPaymentDataDao().findPaymentDataByItemFlow(lastItemFlow);
                if (paymentData != null) {
                    break;
                }
            }
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
            if (FlowCode.FL_CT_158.name().equals(flowToExecute.getCode())) {
//                String pjType = "INVOICE";
//                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
//                ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE().add(new PIECESJOINTES.PIECEJOINTE(pjType, "INV-" + file.getNumeroDossier() + ESBConstants.PDF_FILE_EXTENSION));
            }
        }
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_CT_63.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_62.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
            
        }

        /* DETECTER SI DECISION PAR ARTICLE OU PAR DOSSIER */
        if (ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // Decision organisme

            ItemFlowData itemFlowDataToInsert = null;

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }
            ciDocument.getCONTENT().setDECISIONORGANISME(
                    ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

        } else {
            /* DECISION PAR ARTICLE */
            final List<org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandiseList = new ArrayList<>();
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
                final org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();

                marchandise.setLINENUMBER(fileItem.getLineNumber());
                // code tarif
                final org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif = new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF();
                codetarif.setCODENSH(fileItem.getNsh() != null ? fileItem.getNsh().getGoodsItemCode() : null);
                marchandise.setCODETARIF(codetarif);

                marchandiseList.add(marchandise);

            }
            ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES());
            ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().addAll(marchandiseList);

        }
        // ******* AJOUT NUMERO_CCS et DATE SIGNATURE *********///
        if (file.getSignatory() != null && file.getSignatureDate() != null) {
            ciDocument.getCONTENT().setNUMEROCCSMINSANTE(file.getNumeroDossier());
            ciDocument.getCONTENT().setDATECCSMINSANTE(DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, file.getSignatureDate()));
        }

        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.CCS_MINSANTE.DOCUMENT.CONTENT.SIGNATAIRE());
        ciDocument.getCONTENT().getSIGNATAIRE().setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
        ciDocument.getCONTENT()
                .getSIGNATAIRE()
                .setLIEU(itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                        .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration().getLabelFr().subSequence(0, 34).toString());
        ciDocument
                .getCONTENT()
                .getSIGNATAIRE()
                .setNOM(String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender().getLastName()));
        ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

        return ciDocument;
    }

    private void updateContainers(org.guce.siat.jaxb.cct.PVE.DOCUMENT document, File file) {

        if (document.getCONTENT() == null || document.getCONTENT().getCONTENEURS() == null || CollectionUtils.isEmpty(document.getCONTENT().getCONTENEURS().getCONTENEUR())) {
            return;
        }

        List<org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> conteneurs = document.getCONTENT().getCONTENEURS().getCONTENEUR();
        List<Container> containers = new ArrayList<>();
        for (org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR conteneur : conteneurs) {

            Container container = xmlConverterService.getDao().findContainerByFileAndNumber(file, conteneur.getNUMERO());

            if (container == null) {
                continue;
            }

            container.setContSeal1(conteneur.getSCELLE1());
            container.setContSeal2(conteneur.getSCELLE2());
            container.setContSeal3(conteneur.getSCELLE2());

            containers.add(container);
        }

        xmlConverterService.getDao().update(containers);
    }

    private void setNumeroDossierModif(File current) {

        String numeroDossier = current.getNumeroDossier();

        File root = xmlConverterService.getFileDao().findByNumDossierGuce(numeroDossier);
        if (root == null) {
            return;
        }

        List<File> children = root.getChildrenList();
        String suffix = new DecimalFormat("M00").format(children.size() + 1);
        numeroDossier = numeroDossier.concat(suffix);

        current.setNumeroDossier(numeroDossier);
        current.setParent(root);
        current.setNumeroDossierBase(root.getNumeroDossier());
        xmlConverterService.setNumDossier(numeroDossier);
    }
}

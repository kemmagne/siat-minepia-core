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
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.Attachment;
import org.guce.siat.common.model.Company;
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
import org.guce.siat.core.utils.cct.file.FileFieldValueCctExp;
import org.guce.siat.core.utils.cct.item.FileItemFieldValueCctExp;
import org.guce.siat.utility.jaxb.common.PAIEMENT;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ht
 */
public class XmlConverterCctCtExp extends AbstractXmlConverter {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConverterCctCtExp.class);

    public XmlConverterCctCtExp(XmlConverterServiceImpl xmlConverterService) {
        super(xmlConverterService);
    }

    @Override
    protected org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT checkInstance(Serializable serializable) {
        return (org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) serializable;
    }

    @Override
    public File convertDocumentToFile(final Serializable serializable) throws ParseException, ValidationException {

        final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document = checkInstance(serializable);

        initXmlConverterService(document.getREFERENCEDOSSIER(), document.getMESSAGE(), document.getTYPEDOCUMENT(), document.getCONTENT().getCODEBUREAU());

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        FileType fileType;
        if (xmlConverterService.getFlowGuceSiat() != null) {
            fileType = xmlConverterService.getFlowGuceSiat().getFileType();
        } else {
            fileType = xmlConverterService.getFileTypeDao().findByCode(FileTypeCode.CCT_CT_E);
        }

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCctExp.generateFileFieldValueCctCtExp(file, fileField, document, xmlConverterService.getApplicationPropretiesService());
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        // Set Parent File
        if (file.getNumeroDossierBase() != null) {
            final File parent = xmlConverterService.getFileDao().findByNumDossierGuce(file.getNumeroDossierBase());
            file.setParent(parent);
            file.setAssignedUser(parent.getAssignedUser());
        }

        if (FlowCode.FL_CT_61.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_CT_93.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

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
        }

        /* ADD CLIENT */
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = xmlConverterService.getCompanyDao().findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
            Company buildClient = buildCompany(document);
            boolean newClient = !buildClient.equalsWithoutId(client);
            if (newClient) {
                xmlConverterService.getCompanyDao().save(buildClient);
                file.setClient(buildClient);
            } else {
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document.getCONTENT()
                    .getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCctExp.generateFileItemFieldValueCctCtExp(
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
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSORIGINE().getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                    countryOfOrigin
                            .setCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS());
                    countryOfOrigin.setCountryName(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getNOMPAYS());

                    xmlConverterService.getCountryDao().save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSDESTINATION().getCODEPAYS());
            if (countryOfDestination != null) {
                file.setCountryOfDestination(countryOfDestination);
            } else {
                countryOfDestination = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    countryOfDestination.setCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getCODEPAYS());
                    countryOfDestination.setCountryName(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getNOMPAYS());

                    xmlConverterService.getCountryDao().save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }

        return file;

    }

    private Company buildCompany(org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT document) {
        Company client = new Company();
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null) {
            client.setNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
            client.setCompanyName(document.getCONTENT().getCLIENT().getRAISONSOCIALE());
            client.setCompanyType(CompanyType.DECLARANT);
            if (document.getCONTENT().getCLIENT().getAGREMENTCOMMERCE() != null) {
                client.setCommerceApprovalRegistrationNumberFile(document.getCONTENT().getCLIENT().getAGREMENTCOMMERCE()
                        .getNUMEROINSCRIPTIONFICHIER());
                client.setCommerceApprovalObtainedDate(document.getCONTENT().getCLIENT().getAGREMENTCOMMERCE()
                        .getDATEOBTENTION());
                client.setCommerceApprovalValidityDate(document.getCONTENT().getCLIENT().getAGREMENTCOMMERCE()
                        .getDATEVALIDITE());
                client.setCommerceApprovalNumberTraderMap(document.getCONTENT().getCLIENT().getAGREMENTCOMMERCE()
                        .getNUMEROCARTECOMMERCANT());
            }
            if (document.getCONTENT().getCLIENT().getAGREMENTMETIER() != null) {
                client.setBusinessApprovalType(document.getCONTENT().getCLIENT().getAGREMENTMETIER().getTYPEAGREMENT());
                client.setBusinessApprovalRegistrationNumber(document.getCONTENT().getCLIENT().getAGREMENTMETIER()
                        .getNUMEROAGREMENT());
                client.setBusinessApprovalDate(document.getCONTENT().getCLIENT().getAGREMENTMETIER().getDATEAGREMENT());
                client.setBusinessApprovalValidityDate(document.getCONTENT().getCLIENT().getAGREMENTMETIER().getDATEVALIDITE());
            }
            if (document.getCONTENT().getCLIENT().getPERMIS() != null) {
                client.setPermitNumber(document.getCONTENT().getCLIENT().getPERMIS().getNUMEROPERMIS());
                client.setPermitObtainingDate(document.getCONTENT().getCLIENT().getPERMIS().getDATEOBTENTION());
                client.setPermitApprovalDate(document.getCONTENT().getCLIENT().getPERMIS().getDATEVALIDITE());
                client.setPermitType(document.getCONTENT().getCLIENT().getPERMIS().getTYPE());
            }
            client.setProfession(document.getCONTENT().getCLIENT().getPROFESSION());
            client.setTradeRegisterNumber(document.getCONTENT().getCLIENT().getNUMEROREGISTRECOMMERCE());
            client.setcNI(document.getCONTENT().getCLIENT().getCNI());
            if (document.getCONTENT().getCLIENT().getADRESSE() != null) {
                client.setFirstAddress(document.getCONTENT().getCLIENT().getADRESSE().getADRESSE1());
                client.setSecondAddress(document.getCONTENT().getCLIENT().getADRESSE().getADRESSE2());
                client.setPostalCode(document.getCONTENT().getCLIENT().getADRESSE().getBP());
                client.setCity(document.getCONTENT().getCLIENT().getADRESSE().getVILLE());
                client.setEmail(document.getCONTENT().getCLIENT().getADRESSE().getEMAIL());
                client.setWebSite(document.getCONTENT().getCLIENT().getADRESSE().getSITEWEB());
                // Get country from database
            }
            if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                    && document.getCONTENT().getCLIENT().getADRESSE() != null
                    && document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE() != null
                    && document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE().getCODEPAYS() != null) {
                Country country = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
                        .getPAYSADRESSE().getCODEPAYS());
                if (country != null) {
                    client.setCountry(country);
                } else {
                    country = new Country();
                    if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                            && document.getCONTENT().getCLIENT().getADRESSE() != null
                            && document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE() != null) {
                        country.setCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE().getCODEPAYS());
                        country.setCountryName(document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE().getNOMPAYS());
                        xmlConverterService.getCountryDao().save(country);
                        client.setCountry(country);
                    }
                }
            }
            if (document.getCONTENT().getCLIENT().getTELEPHONEFIXE() != null) {
                client.setPhone(document.getCONTENT().getCLIENT().getTELEPHONEFIXE().getINDICATIFPAYS() != null ? "("
                        + document.getCONTENT().getCLIENT().getTELEPHONEFIXE().getINDICATIFPAYS() + ")"
                        + document.getCONTENT().getCLIENT().getTELEPHONEFIXE().getNUMERO() : StringUtils.EMPTY
                        + document.getCONTENT().getCLIENT().getTELEPHONEFIXE().getNUMERO());
            }
            if (document.getCONTENT().getCLIENT().getTELEPHONEMOBILE() != null) {
                client.setMobile(document.getCONTENT().getCLIENT().getTELEPHONEMOBILE().getINDICATIFPAYS() != null ? "("
                        + document.getCONTENT().getCLIENT().getTELEPHONEMOBILE().getINDICATIFPAYS() + ")"
                        + document.getCONTENT().getCLIENT().getTELEPHONEMOBILE().getNUMERO() : StringUtils.EMPTY
                        + document.getCONTENT().getCLIENT().getTELEPHONEMOBILE().getNUMERO());
            }
            if (document.getCONTENT().getCLIENT().getFAX() != null) {
                client.setFax(document.getCONTENT().getCLIENT().getFAX().getINDICATIFPAYS() != null ? "("
                        + document.getCONTENT().getCLIENT().getFAX().getINDICATIFPAYS() + ")"
                        + document.getCONTENT().getCLIENT().getFAX().getNUMERO() : StringUtils.EMPTY
                        + document.getCONTENT().getCLIENT().getFAX().getNUMERO());
            }
        }

        return client;
    }

    @Override
    public org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT convertFileToDocument(File file, List<FileItem> fileItemList, List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT ciDocument = new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT());

        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        }
        if (FlowCode.FL_CT_89.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_08.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_114.name().equals(flowToExecute.getCode())) {
            String pjType = "";
            if (null != file.getFileType().getCode()) {
                switch (file.getFileType().getCode()) {
                    case CCT_CT_E:
                        pjType = file.getFileTypeGuce().toUpperCase();
                        break;
                    case CCT_CT_E_ATP:
                        pjType = "CTE_ATP";
                        break;
                    case CCT_CT_E_FSTP:
                        pjType = "CTE_FSTP";
                        break;
                    case CCT_CT_E_PVI:
                        pjType = "CTE_PVI";
                }
            }
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE().add(new PIECESJOINTES.PIECEJOINTE(pjType, file.getReferenceGuce() + ESBConstants.PDF_FILE_EXTENSION));
        } else if (FlowCode.FL_CT_121.name().equals(flowToExecute.getCode())) {
            String pjType = "INVOICE";
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE().add(new PIECESJOINTES.PIECEJOINTE(pjType, "INV-" + file.getNumeroDossier() + ESBConstants.PDF_FILE_EXTENSION));
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_26.name(), FlowCode.FL_CT_42.name(), FlowCode.FL_CT_41.name()).contains(flowToExecute.getCode())) {
            ciDocument.getCONTENT().setINSPECTION(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.INSPECTION());
            final Appointment appointment = xmlConverterService.getAppointmentService().findAppointmentByItemFlowList(itemFlowList);
            if (appointment != null) {
                final Date appointmentDate = appointment.getBeginTime();

            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && FlowCode.FL_CT_29.name().equals(flowToExecute.getCode())) {
            // copy recepient analyse
            final AnalyseOrder anayseOrder = xmlConverterService.getAnalyseOrderDao().findByItemFlow(itemFlowList.get(0));
            if (anayseOrder != null) {
                ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES());
                final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();
                marchandise.setLINENUMBER(anayseOrder.getItemFlow().getFileItem().getLineNumber());
                ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().add(marchandise);

            }
        } else if (FlowCode.FL_CT_104.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_118.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_119.name().equals(flowToExecute.getCode())) {
            final String dateRDV;
            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                dateRDV = itemFlowList.get(0).getItemFlowsDataList().get(0).getValue();
            } else {
                Appointment appointment = xmlConverterService.getAppointmentDao().findAppointmentByItemFlow(itemFlowList.get(0));
                dateRDV = DateUtils.formatSimpleDate(DateUtils.PATTERN_YYYY_MM_DD_HH_MM_FR, appointment.getBeginTime());
            }
            if (file.getFileType().getCode().equals(FileTypeCode.CCT_CT_E_FSTP)) {
                ciDocument.getCONTENT().setTRAITEMENT(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.TRAITEMENT());
                ciDocument.getCONTENT().getTRAITEMENT().setDATETRAITEMENT(dateRDV);
            } else if (file.getFileType().getCode().equals(FileTypeCode.CCT_CT_E_PVI) || file.getFileType().getCode().equals(FileTypeCode.CCT_CT_E)) {
                ciDocument.getCONTENT().setINSPECTION(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.INSPECTION());
                ciDocument.getCONTENT().getINSPECTION().setDATEINSPECTION(dateRDV);
            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && FlowCode.FL_CT_64.name().equals(flowToExecute.getCode())) {
            // copy recepient traitement
            final TreatmentOrder treatmentOrder = xmlConverterService.getTreatmentOrderDao().findTreatmentOrderByItemFlow(itemFlowList.get(0));
            if (treatmentOrder != null) {
                ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES());
                final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();
                marchandise.setLINENUMBER(treatmentOrder.getItemFlow().getFileItem().getLineNumber());
                ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().add(marchandise);
            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_92.name(), FlowCode.FL_CT_93.name()).contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = xmlConverterService.getItemFlowDao().findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
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

        // si facture
        if (FlowCode.FL_CT_121.name().equals(flowToExecute.getCode())) {
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
                ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT());
            }

            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.SIGNATAIRE());
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

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }
            ciDocument.getCONTENT().setDECISIONORGANISME(
                    ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

        } else if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())) {
            /* DECISION PAR ARTICLE */
            final List<org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandiseList = new ArrayList<>();
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
                final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();

                marchandise.setLINENUMBER(fileItem.getLineNumber());
                // code tarif
                final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif = new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF();
                final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille = new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE();
                codetarif.setCODENSH(fileItem.getNsh() != null ? fileItem.getNsh().getGoodsItemCode() : null);
                sousfamille.setCODESOUSFAMILLE(fileItem.getSubfamily() != null ? fileItem.getSubfamily().getCode() : null);
                marchandise.setCODETARIF(codetarif);
                marchandise.setSOUSFAMILLE(sousfamille);
//                marchandise.setDECISIONORGANISME(ConverterGuceSiatUtils
//                        .generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

                marchandiseList.add(marchandise);

            }
            ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.MARCHANDISES());
            ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().addAll(marchandiseList);

        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            //
            AbstractModel entity = null;
            switch (file.getFileType().getCode()) {
                case CCT_CT_E:
                    entity = xmlConverterService.getTreatmentInfosDao().findTreatmentInfosByFileItem(itemFlowList.get(0).getFileItem());
                    break;
                case CCT_CT_E_ATP:
                case CCT_CT_E_FSTP:
                    entity = xmlConverterService.getTreatmentResultDao().findLastTreatmentResultByFileItem(itemFlowList.get(0).getFileItem());
                    break;
                case CCT_CT_E_PVI:
                    entity = xmlConverterService.getInspectionReportDao().findLastInspectionReportsByFileItem(itemFlowList.get(0).getFileItem());
            }
            ciDocument = DecisionHistoryUtils.putDecisionHistories(ciDocument, entity, file.getFileType().getCode().name());
        }
        ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.SIGNATAIRE());
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

}

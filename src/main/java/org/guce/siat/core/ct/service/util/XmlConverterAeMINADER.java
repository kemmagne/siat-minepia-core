package org.guce.siat.core.ct.service.util;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
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
import org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl;
import org.guce.siat.core.utils.PaiementGenerator;
import org.guce.siat.core.utils.ap.file.FileFieldValueAeMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAeMINADER;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ht
 */
public class XmlConverterAeMINADER extends AbstractXmlConverter {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConverterAeMINADER.class);

    public XmlConverterAeMINADER(XmlConverterServiceImpl xmlConverterService) {
        super(xmlConverterService);
    }

    @Override
    protected org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT checkInstance(Serializable serializable) {
        return (org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) serializable;
    }

    @Override
    public File convertDocumentToFile(final Serializable serializable) throws ParseException, ValidationException {

        final org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT document = checkInstance(serializable);

        initXmlConverterService(document.getREFERENCEDOSSIER(), document.getMESSAGE(), document.getTYPEDOCUMENT(), document.getCONTENT().getCODEBUREAU());

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = xmlConverterService.getFileTypeDao().findByCode(FileTypeCode.AE_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAeMINADER.generateFileFieldValueAeMINADER(file, fileField, document, xmlConverterService.getApplicationPropretiesService());
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        // Cancel Request Case
        if (FlowCode.FL_AP_147.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

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
                file.setCreatedDate(XmlConverterServiceImpl.DATE_FORMAT.parse(document.getREFERENCEDOSSIER().getDATECREATION()));
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = xmlConverterService.getCompanyDao().findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
            if (client != null) {

                file.setClient(client);
            } else {
                client = new Company();
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
                xmlConverterService.getCompanyDao().save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAeMINADER.generateFileItemFieldValueAeMINADER(
                            fileItem, fileItemField, marchandise);
                    if (StringUtils.isNotBlank(fileItemFieldValue.getValue())) {
                        fileItemFieldValues.add(fileItemFieldValue);
                    }

                }
                fileItem.setFileItemFieldValueList(fileItemFieldValues);

                // Cancel Request Case
                if (FlowCode.FL_AP_147.name().equals(xmlConverterService.getFlowGuceSiat().getFlowSiat())) {

                    if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
                        fileItem.setNumEbmsMessageAnnulation(document.getMESSAGE().getNUMEROMESSAGE());
                    }
                } else if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
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
                    //
                    //					if (marchandise.getSOUSFAMILLE() != null
                    //							&& StringUtils.isNotBlank(marchandise.getSOUSFAMILLE().getCODESOUSFAMILLE()))
                    //					{
                    //						subfamily = servicesItemDao.findByNshAndCode(marchandise.getCODETARIF().getCODENSH(), marchandise
                    //								.getSOUSFAMILLE().getCODESOUSFAMILLE());
                    //
                    //					}
                    //					else
                    //					{
                    //						subfamily = servicesItemDao.findNativeServiceItemByNSH(marchandise.getCODETARIF().getCODENSH());
                    //
                    //					}
                }

                //				if (subfamily != null)
                //				{
                //					fileItem.setNsh(subfamily.getNsh());
                //					fileItem.setSubfamily(subfamily);
                //				}
                //				else
                //				{
                //					throw new ValidationException(ExceptionConstants.NSH);
                //				}
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
                    attachment.setAttachmentType(pieceJointe.getTYPEPJ().toUpperCase());
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
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = xmlConverterService.getCountryDao().findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                        && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getCODEPAYS());
                    countryOfProvenance.setCountryName(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getNOMPAYS());

                    xmlConverterService.getCountryDao().save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
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
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    countryOfDestination.setCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
                    countryOfDestination.setCountryName(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getNOMPAYS());
                    xmlConverterService.getCountryDao().save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }

        return file;
    }

    @Override
    public org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT convertFileToDocument(File file, List<FileItem> fileItemList, List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AE_MINADER_REPORT_FIELD = "NUMERO_AE_MINADER";

        final org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = xmlConverterService.getFileFieldValueDao().findValueByFileFieldAndFile(AE_MINADER_REPORT_FIELD, file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROAEMINADER(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECESJOINTES.PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue() + ESBConstants.PDF_FILE_EXTENSION));

            }

        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = xmlConverterService.getItemFlowDao().findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = xmlConverterService.getPaymentDataDao().findPaymentDataByItemFlow(paymentFlow);
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
        }
        /* DETECTER SI DECISION PAR ARTICLE OU PAR DOSSIER */

        if (ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // DECISION ORGANISME

            ItemFlowData itemFlowDataToInsert = null;

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }

            ciDocument.getCONTENT().setDECISIONORGANISME(
                    ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration().getLabelFr().subSequence(0, 34).toString());
            ciDocument.getCONTENT().getSIGNATAIRE().setNOM(String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender().getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = xmlConverterService.getItemFlowDao().findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(), XmlConverterServiceImpl.ACCEPT_AP_FLOW_LIST);
            if (decisionItemFlow != null) {
                ciDocument.getCONTENT().getDECISION().setDECISIONGENERALE(decisionItemFlow.getFlow().getLabelFr());
                final List<ItemFlowData> itemFlowDataList = decisionItemFlow.getItemFlowsDataList();

                for (final ItemFlowData itemFlowData : itemFlowDataList) {
                    switch (itemFlowData.getDataType().getLabel()) {
                        case "Spécification technique":
                            ciDocument.getCONTENT().getDECISION().setSPECIFICATIONTECHNIQUE(itemFlowData.getValue());
                            break;
                        case "Condition":
                            ciDocument.getCONTENT().getDECISION().setCONDITION(itemFlowData.getValue());
                            break;
                        case "Consigne":
                            ciDocument.getCONTENT().getDECISION().setCONSIGNE(itemFlowData.getValue());
                            break;
                        case "Quantité accordé":
                            ciDocument.getCONTENT().getDECISION().setQUANTITEACCORDE(itemFlowData.getValue());
                            break;
                        case "Date validité":
                            try {
                            if (StringUtils.isNotBlank(itemFlowData.getValue())) {
                                ciDocument
                                        .getCONTENT()
                                        .getDECISION()
                                        .setDATEVALIDITE(XmlConverterServiceImpl.SIMPLE_DATE_FORMAT.format(XmlConverterServiceImpl.DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                            }
                        } catch (final ParseException e) {
                            LOG.info(Objects.toString(e), e);
                            ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                        }
                        break;
                        default:
                            break;
                    }
                }

            }
        }
        return ciDocument;
    }

}

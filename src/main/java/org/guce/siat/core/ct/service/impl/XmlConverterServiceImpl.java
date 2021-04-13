package org.guce.siat.core.ct.service.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import javax.persistence.PersistenceException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.SerializationUtils;
import org.apache.commons.lang.StringUtils;
import org.guce.siat.common.dao.AdministrationDao;
import org.guce.siat.common.dao.AppointmentDao;
import org.guce.siat.common.dao.AttachmentDao;
import org.guce.siat.common.dao.BureauDao;
import org.guce.siat.common.dao.CompanyDao;
import org.guce.siat.common.dao.CoreDao;
import org.guce.siat.common.dao.CountryDao;
import org.guce.siat.common.dao.DataTypeDao;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.dao.FileFieldDao;
import org.guce.siat.common.dao.FileFieldValueDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.FileItemFieldValueDao;
import org.guce.siat.common.dao.FileMarshallDao;
import org.guce.siat.common.dao.FileTypeDao;
import org.guce.siat.common.dao.FlowDao;
import org.guce.siat.common.dao.FlowGuceSiatDao;
import org.guce.siat.common.dao.GuceSiatBureauDao;
import org.guce.siat.common.dao.ItemDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.dao.ItemFlowDataDao;
import org.guce.siat.common.dao.ServiceDao;
import org.guce.siat.common.dao.ServicesItemDao;
import org.guce.siat.common.dao.UserDao;
import org.guce.siat.common.mail.MailConstants;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.Attachment;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Container;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.DataType;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileAdministration;
import org.guce.siat.common.model.FileField;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;
import org.guce.siat.common.model.FileMarshall;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.FlowGuceSiat;
import org.guce.siat.common.model.GuceSiatBureau;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.model.ServicesItem;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AbstractXmlConverterService;
import org.guce.siat.common.service.AlfrescoDirectoryCreator;
import org.guce.siat.common.service.ApplicationPropretiesService;
import org.guce.siat.common.service.AppointmentService;
import org.guce.siat.common.service.MailService;
import org.guce.siat.common.utils.ConverterGuceSiatUtils;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.DecisionOrganism;
import org.guce.siat.common.utils.ExceptionConstants;
import org.guce.siat.common.utils.FileFieldValueUtils;
import org.guce.siat.common.utils.FileItemUtils;
import org.guce.siat.common.utils.SiatUtils;
import org.guce.siat.common.utils.ebms.ESBConstants;
import org.guce.siat.common.utils.ebms.EbmsUtility;
import org.guce.siat.common.utils.ebms.UtilitiesException;
import org.guce.siat.common.utils.enums.CompanyType;
import org.guce.siat.common.utils.enums.DataTypeNameEnnumeration;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.common.utils.enums.InformationSystemCode;
import org.guce.siat.common.utils.enums.ServiceItemType;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.common.utils.exception.ValidationException;
import org.guce.siat.common.utils.ged.AlfrescoDirectoriesInitializer;
import org.guce.siat.core.ct.dao.AnalyseOrderDao;
import org.guce.siat.core.ct.dao.AnalyseResultApDao;
import org.guce.siat.core.ct.dao.CommonDao;
import org.guce.siat.core.ct.dao.DecisionHistoryDao;
import org.guce.siat.core.ct.dao.EssayTestAPDao;
import org.guce.siat.core.ct.dao.InspectionReportDao;
import org.guce.siat.core.ct.dao.PaymentDataDao;
import org.guce.siat.core.ct.dao.PottingReportDao;
import org.guce.siat.core.ct.dao.TreatmentInfosDao;
import org.guce.siat.core.ct.dao.TreatmentOrderDao;
import org.guce.siat.core.ct.dao.TreatmentResultDao;
import org.guce.siat.core.ct.dao.WoodSpecificationDao;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.AnalyseResultAp;
import org.guce.siat.core.ct.model.DecisionHistory;
import org.guce.siat.core.ct.model.EssayTestAP;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PaymentItemFlow;
import org.guce.siat.core.ct.model.PottingPresent;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.guce.siat.core.ct.model.WoodSpecification;
import org.guce.siat.core.ct.service.CotationService;
import org.guce.siat.core.ct.service.util.XmlConverter;
import org.guce.siat.core.ct.service.util.XmlConverterAeMINADER;
import org.guce.siat.core.ct.service.util.XmlConverterCctCtExp;
import org.guce.siat.core.ct.service.util.XmlConverterPayment;
import org.guce.siat.core.ct.service.util.XmlConverterPve;
import org.guce.siat.core.utils.PaiementGenerator;
import org.guce.siat.core.utils.ap.file.FileFieldValueAeMINMIDT;
import org.guce.siat.core.utils.ap.file.FileFieldValueAiMINMIDT;
import org.guce.siat.core.utils.ap.file.FileFieldValueAiMINSANTE;
import org.guce.siat.core.utils.ap.file.FileFieldValueAieMINADER;
import org.guce.siat.core.utils.ap.file.FileFieldValueAsMINADER;
import org.guce.siat.core.utils.ap.file.FileFieldValueAsMINFOF;
import org.guce.siat.core.utils.ap.file.FileFieldValueAtMINEPIA;
import org.guce.siat.core.utils.ap.file.FileFieldValueAtMINSANTE;
import org.guce.siat.core.utils.ap.file.FileFieldValueBsbeMINFOF;
import org.guce.siat.core.utils.ap.file.FileFieldValueCatMINADER;
import org.guce.siat.core.utils.ap.file.FileFieldValueCeaMINMIDT;
import org.guce.siat.core.utils.ap.file.FileFieldValueCoFauneMINFOF;
import org.guce.siat.core.utils.ap.file.FileFieldValueCoForetMINFOF;
import org.guce.siat.core.utils.ap.file.FileFieldValueCpMINEPDED;
import org.guce.siat.core.utils.ap.file.FileFieldValueDiMINADER;
import org.guce.siat.core.utils.ap.file.FileFieldValueEhMINADER;
import org.guce.siat.core.utils.ap.file.FileFieldValueLvtbMINFOF;
import org.guce.siat.core.utils.ap.file.FileFieldValuePivpsvpMINADER;
import org.guce.siat.core.utils.ap.file.FileFieldValueVtMINEPDED;
import org.guce.siat.core.utils.ap.file.FileFieldValueVtMINEPIA;
import org.guce.siat.core.utils.ap.file.FileFieldValueVtdMINSANTE;
import org.guce.siat.core.utils.ap.file.FileFieldValueVtpMINSANTE;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAeMINMIDT;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAiMINMIDT;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAiMINSANTE;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAieMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAsMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAsMINFOF;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAtMINEPIA;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueAtMINSANTE;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueBsbeMINFOF;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueCatMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueCeaMINMIDT;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueCoFauneMINFOF;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueCoForetMINFOF;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueCpMINEPDED;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueDiMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueEhMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueLvtbMINFOF;
import org.guce.siat.core.utils.ap.item.FileItemFieldValuePivpsvpMINADER;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueVtMINEPDED;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueVtMINEPIA;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueVtdMINSANTE;
import org.guce.siat.core.utils.ap.item.FileItemFieldValueVtpMINSANTE;
import org.guce.siat.core.utils.cct.file.FileFieldValueCc;
import org.guce.siat.core.utils.cct.file.FileFieldValueCct;
import org.guce.siat.core.utils.cct.file.FileFieldValueCq;
import org.guce.siat.core.utils.cct.item.FileItemFieldValueCc;
import org.guce.siat.core.utils.cct.item.FileItemFieldValueCct;
import org.guce.siat.core.utils.cct.item.FileItemFieldValueCq;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueAsMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueDeMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueDiMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueFimex;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueFimexWF;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueIDE;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueIDI;
import org.guce.siat.core.utils.monotoring.file.FileFieldValueIrmpMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueAsMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueDeMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueDiMINCOMMERCE;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueFimexWF;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueIDE;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueIDI;
import org.guce.siat.core.utils.monotoring.item.FileItemFieldValueIrmpMINCOMMERCE;
import org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT.CONTENT;
import org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT;
import org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES;
import org.guce.siat.utility.jaxb.common.PIECESJOINTES.PIECEJOINTE;
import org.guce.siat.utility.jaxb.common.PaymentDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class XmlConverterServiceImpl.
 */
@Service("xmlConverterService")
@Transactional
public class XmlConverterServiceImpl extends AbstractXmlConverterService {

    /**
     * The Constant LOG.
     */
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The Constant DATE_FORMAT.
     */
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ENGLISH);

    /**
     * The Constant SIMPLE_DATE_FORMAT.
     */
    public static final DateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);

    /**
     * The Constant DATA_TYPE_DATE_PARSER.
     */
    public static final DateFormat DATA_TYPE_DATE_PARSER = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    /**
     * The Constant ACCEPT_AP_FLOW_LIST.
     */
    public static final List<String> ACCEPT_AP_FLOW_LIST = Arrays.asList(FlowCode.FL_AP_101.name(), FlowCode.FL_AP_102.name(),
            FlowCode.FL_AP_103.name(), FlowCode.FL_AP_104.name(), FlowCode.FL_AP_105.name(), FlowCode.FL_AP_106.name(),
            FlowCode.FL_AP_169.name(), FlowCode.FL_AP_170.name(),
            FlowCode.FL_AP_171.name(), FlowCode.FL_AP_172.name(), FlowCode.FL_AP_173.name(), FlowCode.FL_AP_174.name());
    private static final List AMENDMENT_AP_FLOW_LIST = Arrays.asList(new String[]{FlowCode.FL_AP_200.name()});

    private static final List<String> AMENDEMENT_CTE_FLOW_LIST = Arrays.asList(FlowCode.FL_CT_110.name());
    /**
     * The Constant PREFIXE_FACTURE.
     */
    public static final String PREFIXE_FACTURE = "FAC-";

    /**
     * The application propreties service.
     */
    @Autowired
    private ApplicationPropretiesService applicationPropretiesService;

    @Autowired
    private CotationService cotationService;

    @Autowired
    private AppointmentDao appointmentDao;

    @Autowired
    private CommonDao commonDao;

    @Autowired
    private PottingReportDao pottingReportDao;

    @Autowired
    private CoreDao dao;

    /**
     * The file dao.
     */
    @Autowired
    private FileDao fileDao;

    /**
     * The file type dao.
     */
    @Autowired
    private FileTypeDao fileTypeDao;

    /**
     * The data type dao.
     */
    @Autowired
    private DataTypeDao dataTypeDao;

    /**
     * The services item service.
     */
    @Autowired
    private ServicesItemDao servicesItemDao;

    /**
     * The service dao.
     */
    @Autowired
    private ServiceDao serviceDao;

    /**
     * The file item dao.
     */
    @Autowired
    private FileItemDao fileItemDao;

    /**
     * The guce siat bureau dao.
     */
    @Autowired
    private GuceSiatBureauDao guceSiatBureauDao;

    /**
     * The bureau dao.
     */
    @Autowired
    private BureauDao bureauDao;

    /**
     * The flow dao.
     */
    @Autowired
    private FlowDao flowDao;

    /**
     * The file field dao.
     */
    @Autowired
    private FileFieldDao fileFieldDao;

    /**
     * The file field value dao.
     */
    @Autowired
    private FileFieldValueDao fileFieldValueDao;

    /**
     * The file item field value dao.
     */
    @Autowired
    private FileItemFieldValueDao fileItemFieldValueDao;

    /**
     * The item flow dao.
     */
    @Autowired
    private ItemFlowDao itemFlowDao;

    /**
     * The payment data dao.
     */
    @Autowired
    private PaymentDataDao paymentDataDao;

    /**
     * The Essay test ap dao.
     */
    @Autowired
    private EssayTestAPDao essayTestAPDao;

    /**
     * The analyse result ap dao.
     */
    @Autowired
    private AnalyseResultApDao analyseResultApDao;

    /**
     * The attachment dao.
     */
    @Autowired
    private AttachmentDao attachmentDao;

    /**
     * The user dao.
     */
    @Autowired
    private UserDao userDao;

    /**
     * The flow guce siat dao.
     */
    @Autowired
    private FlowGuceSiatDao flowGuceSiatDao;

    /**
     * The company dao.
     */
    @Autowired
    private CompanyDao companyDao;

    /**
     * The country dao.
     */
    @Autowired
    private CountryDao countryDao;

    /**
     * The item flow data dao.
     */
    @Autowired
    private ItemFlowDataDao itemFlowDataDao;

    /**
     * The appointment service.
     */
    @Autowired
    private AppointmentService appointmentService;

    /**
     * The analyse order dao.
     */
    @Autowired
    private AnalyseOrderDao analyseOrderDao;

    /**
     * The treatment order dao.
     */
    @Autowired
    private TreatmentOrderDao treatmentOrderDao;

    @Autowired
    private WoodSpecificationDao woodSpecificationDao;

    @Autowired
    private FileMarshallDao fileMarshallDao;

    private FlowGuceSiat flowGuceSiat;

    /**
     * The guce siat bureau.
     */
    private GuceSiatBureau guceSiatBureau;
    /**
     * The ref siat.
     */
    private String refSiat;

    /**
     * The num dossier.
     */
    private String numDossier;

    /**
     * The num ebms message.
     */
    private String numEbmsMessage;

    /**
     * The decision dossier.
     */
    private Map<File, DecisionOrganism> decisionDossier;

    /**
     * The decision articles.
     */
    private Map<FileItem, DecisionOrganism> decisionArticles;

    /**
     * The declarant.
     */
    private User declarant;

    private XmlConverter xmlConverter;

    /**
     * The alfresco directory creator.
     */
    @Autowired
    private AlfrescoDirectoryCreator alfrescoDirectoryCreator;

    /**
     * The Constant EMAIL_BODY_NOTIFICATION_FR.
     */
    private static final String EMAIL_BODY_NOTIFICATION_FR = "emailBodyNotification_fr.vm";

    /**
     * The Constant EMAIL_BODY_NOTIFICATION_EN.
     */
    private static final String EMAIL_BODY_NOTIFICATION_EN = "emailBodyNotification_en.vm";

    /**
     * The administration dao.
     */
    @Autowired
    private AdministrationDao administrationDao;

    /**
     * The mail service.
     */
    @Autowired
    private MailService mailService;

    /**
     * The item dao.
     */
    @Autowired
    private ItemDao itemDao;

    @Autowired
    private TreatmentInfosDao treatmentInfosDao;

    @Autowired
    private TreatmentResultDao treatmentResultDao;

    @Autowired
    private InspectionReportDao inspectionReportDao;

    @Autowired
    private DecisionHistoryDao decisionHistoryDao;

    List<WoodSpecification> woodSpecifications;

    /**
     * Inits the.
     */
    private void init() {
        flowGuceSiat = null;
        refSiat = null;
        numDossier = null;
        decisionDossier = null;
        decisionArticles = null;
        xmlConverter = null;
        declarant = userDao.getUserByLogin("DECLARANT");
    }

    /**
     * Checks if is cancel request.
     *
     * @param flowGuceSiat the flow guce siat
     * @return true, if is cancel request
     */
    private boolean isCancelRequest(final FlowGuceSiat flowGuceSiat) {
        return FlowCode.FL_CT_61.name().equals(flowGuceSiat.getFlowSiat())
                || FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat());
    }

    /**
     * Checks if is payment request.
     *
     * @param flowGuceSiat the flow guce siat
     * @return true, if is payment request
     */
    private boolean isPaymentRequest(final FlowGuceSiat flowGuceSiat) {
        return Arrays.asList(FlowCode.FL_AP_166.name(), FlowCode.FL_CT_93.name(), FlowCode.FL_CT_123.name(), FlowCode.FL_CT_126.name(), FlowCode.FL_CT_135.name(), FlowCode.FL_CT_145.name())
                .contains(flowGuceSiat.getFlowSiat());
    }

    private boolean isAmendment(FlowGuceSiat flowGuceSiat) {
        return AMENDMENT_AP_FLOW_LIST.contains(flowGuceSiat.getFlowSiat());
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.XmlConverterService# saveReceivedFileAndExecuteFlow(java.io.Serializable)
     */
    @Override
    public File saveReceivedFileAndExecuteFlow(final Serializable document) throws ParseException, PersistenceException, NullPointerException, ValidationException {
        init();
        final File fileConverted = convertDocumentToFile(document);
        String attachmentRootFolder;
        File fileFromSiat;
        // ce n'est pas un flux initiateur ou flux demande d'annulation
        if (StringUtils.isNotBlank(refSiat) || isCancelRequest(flowGuceSiat) || isPaymentRequest(flowGuceSiat) || isAmendment(flowGuceSiat)) {
            if (isCancelRequest(flowGuceSiat) || isPaymentRequest(flowGuceSiat) || isAmendment(flowGuceSiat)) {
                fileFromSiat = fileDao.findByNumDossierGuce(numDossier);
            } else {
                fileFromSiat = fileDao.findByRefSiat(refSiat);
            }

            fileFromSiat.setLastDecisionDate(Calendar.getInstance().getTime());

            fileDao.update(prepareFileFromSiat(fileFromSiat, fileConverted));

            /* PRESENTS */
            if (document instanceof org.guce.siat.jaxb.cct.PVE.DOCUMENT) {
                populateContainers((org.guce.siat.jaxb.cct.PVE.DOCUMENT) document, fileFromSiat);
            }

            final List<Attachment> addedAttachments = new ArrayList<>();
            final List<Attachment> attachmentListFromConvertedFile = fileConverted.getAttachmentsList();
            if (CollectionUtils.isNotEmpty(attachmentListFromConvertedFile)) {
                if (fileFromSiat.getBureau() != null) {
                    attachmentRootFolder = alfrescoDirectoryCreator.generateAlfrescoPath(fileFromSiat) + AlfrescoDirectoriesInitializer.SLASH + fileFromSiat.getNumeroDossier();
                } else {
                    attachmentRootFolder = AlfrescoDirectoriesInitializer.GED_DIRECTORY;
                }
                for (final Attachment attachment : attachmentListFromConvertedFile) {
                    attachment.setPath(attachmentRootFolder);
                    attachment.setFile(fileFromSiat);
                    if (!alfrescoDirectoryCreator.attachmentExist(attachmentRootFolder + AlfrescoDirectoriesInitializer.SLASH + attachment.getDocumentName())) {
                        addedAttachments.add(attachment);
                        attachmentDao.save(attachment);
                    }
                }
            }
            if (CollectionUtils.isNotEmpty(addedAttachments)) {
                fileFromSiat.getAttachmentsList().addAll(addedAttachments);
            }

            if (isCancelRequest(flowGuceSiat)) {
                proceedWorkflowForCancelRequest(fileFromSiat, document);
            } else if (isPaymentRequest(flowGuceSiat)) {
                proceedWorkflowForPaymentRequest(fileFromSiat, document);
            } else if (!FileTypeCode.PAYMENT.equals(flowGuceSiat.getFileType().getCode())) {
                proceedWorkflow(fileConverted, fileFromSiat, document);
            }

            return fileFromSiat;
        } else {
//            final List<Attachment> addedAttachments = new ArrayList<>();
            final List<Attachment> attachmentList = fileConverted.getAttachmentsList();
//            final List<FileItem> addedFileItemList = new ArrayList<>();
            final List<FileItem> fileItemList = fileConverted.getFileItemsList();

            String nsh;
            ServicesItem snsh;
            final List<org.guce.siat.common.model.Service> serviceList = serviceDao.findServiceByFileType(fileConverted.getFileType());
            if (serviceList != null && serviceList.size() == 1) {
                fileConverted.setBureau(serviceList.get(0).getCentralBureau());
            } else if (serviceList != null && serviceList.size() > 1) {
                final List<org.guce.siat.common.model.Service> serviceByMinistry = serviceDao.findServicesByFileTypeAndMinistry(fileConverted.getFileType(), fileConverted.getDestinataire());
                if (serviceByMinistry.isEmpty()) {
                    throw new IllegalStateException("There are no service available in the ministry to process the file " + fileConverted.getReferenceGuce()
                            + " : [fileType = " + fileConverted.getFileType() + ", MinistryCode = " + fileConverted.getDestinataire() + "]");
                } else if (serviceByMinistry.size() == 1) {
                    fileConverted.setBureau(serviceByMinistry.get(0).getCentralBureau());
                } else {
                    //fileConverted.setBureau(serviceByMinistry.get(0).getCentralBureau());
                    List<FileAdministration> adminList = new ArrayList<>();
                    List<org.guce.siat.common.model.Service> remainingServices = new ArrayList<>();
                    for (int i = 0, n = serviceByMinistry.size(); i < n; i++) {
                        remainingServices.add(serviceByMinistry.get(i));
                    }
                    //we need to filter the services and keep only those related to the nsh if possible
                    if (CollectionUtils.isNotEmpty(fileConverted.getFileItemsList()) && fileConverted.getFileItemsList().get(0).getNsh() != null) {
                        List<org.guce.siat.common.model.Service> realServices = new ArrayList<>();
                        String nsh_ = fileConverted.getFileItemsList().get(0).getNsh().getGoodsItemCode();
                        for (org.guce.siat.common.model.Service s : remainingServices) {
                            List<ServicesItem> sis = servicesItemDao.findActiveItemsByNshAndService(nsh_, s);
                            if (sis != null && !sis.isEmpty()) {
                                realServices.add(s);
                            }
                        }
                        if (!realServices.isEmpty()) {
                            remainingServices = realServices;
                        }
                    }
                    for (int i = 0, n = remainingServices.size(); i < n; i++) {
                        FileAdministration fa = new FileAdministration();
                        fa.setFile(fileConverted);
                        fa.setAdministration(remainingServices.get(i));
                        adminList.add(fa);
                    }
                    fileConverted.setBureau(remainingServices.get(0).getCentralBureau());
                    fileConverted.setFileAdministrationsList(adminList);
                }
            } else if (CollectionUtils.isNotEmpty(fileConverted.getFileItemsList())
                    && fileConverted.getFileItemsList().get(0).getSubfamily() != null
                    && fileConverted.getFileItemsList().get(0).getSubfamily().getNsh() != null
                    && (ServiceItemType.NATIVE.getCode().equals(fileConverted.getFileItemsList().get(0).getSubfamily().getType().toString()) || fileConverted.getFileItemsList().get(0).getSubfamily().getCode() != null)) {
                final String subfamilyCode = fileConverted.getFileItemsList().get(0).getSubfamily().getCode();

                nsh = fileConverted.getFileItemsList().get(0).getSubfamily().getNsh().getGoodsItemCode();

                if (StringUtils.isNotBlank(subfamilyCode)) {
                    snsh = servicesItemDao.findByNshAndCode(nsh, subfamilyCode);
                } else {
                    snsh = servicesItemDao.findNativeServiceItemByNSH(nsh);
                }

                fileConverted.setBureau(snsh.getService().getCentralBureau());

            }

            if (guceSiatBureau != null) {
                final Bureau bureau = bureauDao.findByServiceAndCode(fileConverted.getBureau().getService(), guceSiatBureau.getSiatBureau());
                if (bureau != null) {
                    fileConverted.setBureau(bureau);
                }
                // in fine le bureau auquel doit être affecté le dossier est celui auquel il a été
                // envoyé depus WEBGUCE
                if (Arrays.asList(FileTypeCode.CCT_CT_E, FileTypeCode.CCT_CT_E_ATP, FileTypeCode.CCT_CT_E_PVI, FileTypeCode.CCT_CT_E_FSTP, FileTypeCode.CCT_CT_E_PVE).contains(fileConverted.getFileType().getCode())) {
                    final Bureau bureau1 = bureauDao.findByCode(guceSiatBureau.getSiatBureau());
                    if (bureau1 != null) {
                        fileConverted.setBureau(bureau1);
                    }
                }
            }
            for (final FileItem fileItem : fileItemList) {
                fileItem.setFile(fileConverted);
//                addedFileItemList.add(fileItem);
            }

            // set the file last decision date to the current date
            fileConverted.setCreatedDate(Calendar.getInstance().getTime());
            fileConverted.setLastDecisionDate(Calendar.getInstance().getTime());
            final File addedFile = fileDao.save(fileConverted);

            if (addedFile != null && addedFile.getFileType() != null) {
                FileTypeCode fileCode = addedFile.getFileType().getCode();
                if (FileTypeCode.BSBE_MINFOF.equals(fileCode) && CollectionUtils.isNotEmpty(woodSpecifications)) {
                    for (WoodSpecification spec : woodSpecifications) {
                        spec.setFile(addedFile);
                        woodSpecificationDao.save(spec);
                    }
                }
            } else if (addedFile == null) {
                throw new RuntimeException(String.format("The file got from %s cannot be null", fileConverted));
            }

            // save related decision histories
            try {
                if (document instanceof org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) {

                    final org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT doc = (org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) document;

                    if (doc.getCONTENT() != null && doc.getCONTENT().getDETAILSDECISIONSSIAT() != null
                            && CollectionUtils.isNotEmpty(doc.getCONTENT().getDETAILSDECISIONSSIAT().getDETAILSDECISION())) {

                        final List<org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION> list = doc.getCONTENT().getDETAILSDECISIONSSIAT().getDETAILSDECISION();

                        for (org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT.CONTENT.DETAILSDECISIONSSIAT.DETAILSDECISION detail : list) {

                            final DecisionHistory decisionHistory = new DecisionHistory();

                            decisionHistory.setCode(detail.getCODE());
                            decisionHistory.setLabelEn(detail.getLABELEN());
                            decisionHistory.setLabelFr(detail.getLABELFR());
                            decisionHistory.setValue(detail.getVALEUR());
                            decisionHistory.setFileType(fileTypeDao.findByCode(FileTypeCode.valueOf(detail.getCODEPROCEDURESIAT())));
                            decisionHistory.setFile(addedFile);

                            decisionHistoryDao.save(decisionHistory);
                        }

                    }
                }
            } catch (Exception ex) {
                logger.error("Problem occured when trying to create decision histories", ex);
            }

            final String formatPrefix = InformationSystemCode.CT.name();

            addedFile.setReferenceSiat(new DecimalFormat(formatPrefix + "000000").format(addedFile.getId()));
            if (CollectionUtils.isNotEmpty(attachmentList)) {

                attachmentRootFolder = alfrescoDirectoryCreator.generateAlfrescoPath(fileConverted) + AlfrescoDirectoriesInitializer.SLASH + fileConverted.getNumeroDossier();

                for (final Attachment attachment : attachmentList) {
                    attachment.setFile(addedFile);
                    attachment.setPath(attachmentRootFolder);
                    if (!alfrescoDirectoryCreator.attachmentExist(attachmentRootFolder + AlfrescoDirectoriesInitializer.SLASH + attachment.getDocumentName())) {
//                        addedAttachments.add(attachment);
                        attachmentDao.save(attachment);
                    }
                }
            }

            executeFirstFlow(addedFile);

            if (xmlConverter != null) {
                xmlConverter.update(addedFile, document);
            }

            return addedFile;
        }

    }

    /**
     * Proceed workflow.
     *
     * @param fileconverted the fileconverted
     * @param fileFromSiat the file from siat
     * @param document the document
     */
    private void proceedWorkflow(final File fileconverted, final File fileFromSiat, final Serializable document) {
        final List<ItemFlow> itemFlowsToAdd = new ArrayList<>();

        final Flow flowToExecute;
        boolean ci = false;
        if (flowGuceSiat.getFlowSiat() != null) {
            flowToExecute = flowDao.findFlowByCode(flowGuceSiat.getFlowSiat());
        } else {
            ci = true;
            flowToExecute = ciDestinationFlowToExecute(fileconverted);
        }
        final List<ItemFlowData> itemFlowDataList = retrieveItemFlowDatas(document, flowToExecute);
        File file = fileDao.findByNumDossierGuce(numDossier);
        if (decisionDossier != null && !decisionDossier.isEmpty() || fileFromSiat != null && fileFromSiat.getSignatureDate() != null || ci && FileTypeCode.CCT_CT_E_PVE.equals(file.getFileType().getCode())) {

            if (fileFromSiat != null) {
                for (final FileItem fileItem : fileFromSiat.getFileItemsList()) {
                    final ItemFlow itemFlow = new ItemFlow();

                    itemFlow.setFileItem(fileItem);
                    itemFlow.setFlow(flowToExecute);
                    itemFlow.setSender(declarant);
                    itemFlow.setSent(Boolean.TRUE);
                    itemFlow.setUnread(Boolean.TRUE);
                    itemFlow.setItemFlowsDataList(itemFlowDataList);
                    itemFlowsToAdd.add(itemFlow);

                    fileItem.setDraft(Boolean.FALSE);
                    if (flowToExecute.getToStep() != null) {
                        fileItem.setStep(flowToExecute.getToStep());
                    }
                    fileItemDao.save(fileItem);
                }
            }
        }

        if (decisionArticles != null && !decisionArticles.isEmpty()) {

            for (FileItem fileItem : fileconverted.getFileItemsList()) {
                final ItemFlow itemFlow = new ItemFlow();

                final List<FileItem> fileItems = fileItemDao.findByLineNumberAndNumSiat(Collections.singletonList(fileItem.getLineNumber()), fileconverted.getReferenceSiat());
                fileItem = CollectionUtils.isNotEmpty(fileItems) ? fileItems.get(0) : null;
                itemFlow.setFileItem(fileItem);
                itemFlow.setFlow(flowToExecute);
                itemFlow.setSender(declarant);
                itemFlow.setSent(Boolean.TRUE);
                itemFlow.setUnread(Boolean.TRUE);
                itemFlow.setItemFlowsDataList(itemFlowDataList);
                itemFlowsToAdd.add(itemFlow);

                fileItem.setDraft(Boolean.FALSE);
                if (flowToExecute.getToStep() != null) {
                    fileItem.setStep(flowToExecute.getToStep());
                }
                fileItemDao.update(fileItem);
            }
        }

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            for (final ItemFlowData itemFlowData : itemFlow.getItemFlowsDataList()) {
                final ItemFlowData ifd = new ItemFlowData();
                ifd.setItemFlow(itemFlow);
                ifd.setDataType(itemFlowData.getDataType());
                ifd.setValue(itemFlowData.getValue());
                itemFlowDataDao.save(ifd);
            }
        }

        /**
         * Notification par email depot de dossier *
         */
        try {
            notificationEmail(fileFromSiat, flowToExecute);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

    /**
     * Fetch ci flow to execute.
     *
     * @param recievedFile the recieved file
     * @return the flow
     */
    public Flow ciDestinationFlowToExecute(final File recievedFile) {

        String fluxSource = null;

        if (decisionDossier != null && !decisionDossier.isEmpty()) {
            fluxSource = decisionDossier.get(recievedFile).getCode();
        } else if (decisionArticles != null && !decisionArticles.isEmpty()) {
            fluxSource = decisionArticles.get(recievedFile.getFileItemsList().get(0)).getCode();
        }

        Flow ciResponseFlow;
        if (StringUtils.isNotBlank(fluxSource)) {
            ciResponseFlow = flowDao.findCiResponseFlow(fluxSource);
        } else {
            File file = fileDao.findByNumDossierGuce(numDossier);
            ItemFlow itemFlow = itemFlowDao.findLastDecisionByFile(file);
            fluxSource = itemFlow != null ? itemFlow.getFlow().getCode() : null;
            ciResponseFlow = flowDao.findCiResponseFlow(fluxSource);
        }

        return ciResponseFlow;
    }

    /**
     * Execute first flow.
     *
     * @param file the file
     */
    private void executeFirstFlow(final File file) {
        Flow firstFlow = null;
        if (null != file.getFileType().getCode()) {
            switch (file.getFileType().getCode()) {
                case VT_MINEPIA:
                case VT_MINEPDED:
                case AT_MINEPIA:
                case AIE_MINADER:
                case AE_MINADER:
                case EH_MINADER:
                case CAT_MINADER:
                case DI_MINADER:
                case PIVPSRP_MINADER:
                case AT_MINSANTE:
                case CEA_MINMIDT:
                case AI_MINSANTE:
                case AS_MINADER:
                case VTP_MINSANTE:
                case VTD_MINSANTE:
                case AI_MINMIDT:
                case AE_MINMIDT:
                case CP_MINEPDED:
                case AS_MINFOF:
                case FIMEX:
                case IDI:
                case IDE:
                case DI_MINCOMMERCE:
                case DE_MINCOMMERCE:
                case CO_MINFOF_FORET:
                case CO_MINFOF_FAUNE:
                case AS_MINCOMMERCE:
                case LVTB_MINFOF:
                case BSBE_MINFOF:
                case FIMEX_WF:
                case IRMP_MINCOMMERCE:
                    firstFlow = flowDao.findFlowByCode(FlowCode.FL_AP_85.name());
                    break;
                default:
                    firstFlow = flowDao.findFlowByCode(flowGuceSiat.getFlowSiat());
                    break;
            }
        }

        if (firstFlow == null) {
            throw new RuntimeException(String.format("It wasn't possible to find the the first flow for %s", file));
        }

        final User declarant1 = userDao.getUserByLogin("DECLARANT");
        final List<FileItem> fileItemList = fileItemDao.findFileItemsByFile(file);
        for (final FileItem fileItem : fileItemList) {
            final ItemFlow itemFlow = new ItemFlow();
            itemFlow.setSender(declarant1);
            itemFlow.setSent(Boolean.TRUE);
            itemFlow.setUnread(Boolean.TRUE);
            itemFlow.setFileItem(fileItem);
            itemFlow.setFlow(firstFlow);
            itemFlowDao.save(itemFlow);
            fileItem.setDraft(Boolean.FALSE);
            fileItem.setStep(firstFlow.getToStep());
            fileItemDao.save(fileItem);
        }

        if (FileTypeCode.CCT_CT_E_PVE.equals(file.getFileType().getCode())) {
            cotationService.dispatch(file, firstFlow);
        }

        /**
         * Notification par email depot de dossier *
         */
        try {
            notificationEmail(file, firstFlow);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }

    }

    /**
     * Prepare file from siat.
     *
     * @param fileFromSiat the file from siat
     * @param fileConverted the file converted
     * @return the file
     */
    @Transactional(readOnly = false)
    private File prepareFileFromSiat(final File fileFromSiat, final File fileConverted) {

        // Cancel request case
        if (isCancelRequest(flowGuceSiat)) {
            fileFromSiat.setReferenceGuceAnnulation(fileConverted.getReferenceGuceAnnulation());
            fileFromSiat.setFileTypeGuceAnnulation(fileConverted.getFileTypeGuceAnnulation());
            fileFromSiat.setNumeroDemandeAnnulation(fileConverted.getNumeroDemandeAnnulation());
        } else if (isPaymentRequest(flowGuceSiat)) {
            fileFromSiat.setReferenceGucePaiement(fileConverted.getReferenceGucePaiement());
            fileFromSiat.setFileTypeGucePaiement(fileConverted.getFileTypeGucePaiement());
            fileFromSiat.setNumeroDemandePaiement(fileConverted.getNumeroDemandePaiement());
        }
        if (isAmendment(flowGuceSiat)) {
            try {
                Serializable object;
                switch (fileFromSiat.getFileType().getCode()) {
                    case BSBE_MINFOF:
                        object = convertFileToDocumentBsbeMINFOF(fileFromSiat, fileFromSiat.getFileItemsList(), null, new Flow(FlowCode.FL_AP_107.name()), flowGuceSiat);
                        break;
                    default:
                        object = null;
                }
                if (object != null) {
                    FileMarshall fileTypeCode = fileMarshallDao.findByFile(fileFromSiat);
                    boolean fileItem = true;
                    if (fileTypeCode == null) {
                        fileTypeCode = new FileMarshall(fileFromSiat);
                        fileItem = false;
                    }

                    fileTypeCode.setMarshall(SerializationUtils.serialize(object));
                    if (fileItem) {
                        fileMarshallDao.update(fileTypeCode);
                    } else {
                        fileMarshallDao.save(fileTypeCode);
                    }
                }
            } catch (UtilitiesException ex) {
                logger.error(XmlConverterServiceImpl.class.getName(), ex);
            }
        }
        List<FileFieldValue> newFileFieldValueList = null;
        if (CollectionUtils.isNotEmpty(fileConverted.getFileFieldValueList())) {
            for (final FileFieldValue fileFieldValue : fileFromSiat.getFileFieldValueList()) {
                newFileFieldValueList = fileConverted.getFileFieldValueList();
                final Iterator<FileFieldValue> iterator = newFileFieldValueList.iterator();
                while (iterator.hasNext()) {
                    final FileFieldValue newFileFieldValue = iterator.next();
                    if (fileFieldValue.getFileField().equals(newFileFieldValue.getFileField())) {
                        if (fileFieldValue.getFileField().getUpdatable()) {
                            fileFieldValue.setValue(newFileFieldValue.getValue());
                        }
                        iterator.remove();
                        break;
                    }
                }
            }
        }
        if (CollectionUtils.isNotEmpty(newFileFieldValueList)) {
            for (final FileFieldValue fileFieldValue : newFileFieldValueList) {
                fileFieldValue.setFile(fileFromSiat);
                fileFieldValueDao.save(fileFieldValue);
                fileFromSiat.getFileFieldValueList().add(fileFieldValue);
            }
        }

        if (CollectionUtils.isNotEmpty(fileFromSiat.getFileItemsList())) {
            for (final FileItem fileItem : fileFromSiat.getFileItemsList()) {

                if (isCancelRequest(flowGuceSiat)) {
                    fileItem.setNumEbmsMessageAnnulation(numEbmsMessage);
                } else if (isPaymentRequest(flowGuceSiat)) {
                    fileItem.setNumEbmsMessagePaiement(numEbmsMessage);
                } else {
                    fileItem.setNumEbmsMessage(numEbmsMessage);
                }

                if (CollectionUtils.isNotEmpty(fileConverted.getFileItemsList())) {
                    final FileItem newFileItem = FileItemUtils.findFileItemByLineNumber(fileItem.getLineNumber(),
                            fileConverted.getFileItemsList());

                    if (!Objects.equals(newFileItem, null)) {
                        fileItem.setFobValue(newFileItem.getFobValue());
                        fileItem.setQuantity(newFileItem.getQuantity());

                        List<FileItemFieldValue> fileItemFieldValueList;
                        final List<FileItemFieldValue> fileItemFieldValueToAdd = new ArrayList<>();
                        if (CollectionUtils.isNotEmpty(newFileItem.getFileItemFieldValueList())) {
                            for (final FileItemFieldValue newFileItemFieldValue : newFileItem.getFileItemFieldValueList()) {

                                fileItemFieldValueList = fileItem.getFileItemFieldValueList();
                                final Iterator<FileItemFieldValue> fiIterator = fileItemFieldValueList.iterator();
                                FileItemFieldValue fileItemFieldValue;
                                Boolean exist = false;
                                while (fiIterator.hasNext() && !exist) {
                                    fileItemFieldValue = fiIterator.next();
                                    if (fileItemFieldValue.getFileItemField().getCode()
                                            .equals(newFileItemFieldValue.getFileItemField().getCode())) {
                                        if (fileItemFieldValue.getFileItemField().getUpdatable()) {
                                            fileItemFieldValue.setValue(newFileItemFieldValue.getValue());
                                        }
                                        exist = true;
                                    }

                                }

                                if (!exist) {
                                    fileItemFieldValueToAdd.add(newFileItemFieldValue);
                                }

                            }
                        }
                        if (CollectionUtils.isNotEmpty(fileItemFieldValueToAdd)) {
                            for (final FileItemFieldValue fifv : fileItemFieldValueToAdd) {
                                final FileItemFieldValue fifvToAdd = new FileItemFieldValue();

                                fifvToAdd.setFileItem(fileItem);
                                fifvToAdd.setFileItemField(fifv.getFileItemField());
                                fifvToAdd.setValue(fifv.getValue());
                                fileItemFieldValueDao.save(fifvToAdd);
                            }

                        }
                    }
                }
            }
        }
        FileTypeCode fileTypeCode = fileFromSiat.getFileType().getCode();
        if (FileTypeCode.BSBE_MINFOF.equals((Object) fileTypeCode)) {
            woodSpecificationDao.removeByFile(fileFromSiat);
            if (CollectionUtils.isNotEmpty(woodSpecifications)) {
                for (WoodSpecification spec : woodSpecifications) {
                    spec.setFile(fileFromSiat);
                    woodSpecificationDao.save((Serializable) spec);
                }
            }
        }
        fileFromSiat.setCountryOfDestination(fileConverted.getCountryOfDestination());
        fileFromSiat.setCountryOfOrigin(fileConverted.getCountryOfOrigin());
        fileFromSiat.setCountryOfProvenance(fileConverted.getCountryOfProvenance());
        fileFromSiat.setReferenceGuce(fileConverted.getReferenceGuce());

        return fileFromSiat;
    }

    @Transactional(readOnly = false)
    @Override
    public void rollbackFile(File currentFile, File nextFile) {
        List<FileFieldValue> newFileFieldValueList = null;
        for (FileFieldValue fileFieldValue : currentFile.getFileFieldValueList()) {
            newFileFieldValueList = nextFile.getFileFieldValueList();
            Iterator iterator = newFileFieldValueList.iterator();
            while (iterator.hasNext()) {
                FileFieldValue newFileFieldValue = (FileFieldValue) iterator.next();
                if (fileFieldValue.getFileField().equals(newFileFieldValue.getFileField())) {
                    if (BooleanUtils.toBoolean(fileFieldValue.getFileField().getUpdatable())) {
                        fileFieldValue.setValue(newFileFieldValue.getValue());
                    }
                }
                iterator.remove();
                break;
            }
        }
        if (newFileFieldValueList != null && !newFileFieldValueList.isEmpty()) {
            for (FileFieldValue fileFieldValue : newFileFieldValueList) {
                fileFieldValue.setFile(currentFile);
                fileFieldValueDao.save(fileFieldValue);
                currentFile.getFileFieldValueList().add(fileFieldValue);
            }
        }
        for (FileItem fileItem : currentFile.getFileItemsList()) {
            FileItem newFileItem;
            if (isCancelRequest(flowGuceSiat)) {
                fileItem.setNumEbmsMessageAnnulation(numEbmsMessage);
            } else if (this.isPaymentRequest(flowGuceSiat)) {
                fileItem.setNumEbmsMessagePaiement(numEbmsMessage);
            } else {
                fileItem.setNumEbmsMessage(numEbmsMessage);
            }
            if (CollectionUtils.isNotEmpty(nextFile.getFileItemsList())) {
                newFileItem = FileItemUtils.findFileItemByLineNumber(fileItem.getLineNumber(), nextFile.getFileItemsList());
                if (!Objects.equals(newFileItem, null)) {
                    fileItem.setFobValue(newFileItem.getFobValue());
                    fileItem.setQuantity(newFileItem.getQuantity());
                    List fileItemFieldValueList;
                    ArrayList<FileItemFieldValue> fileItemFieldValueToAdd = new ArrayList<>();
                    if (CollectionUtils.isNotEmpty(newFileItem.getFileItemFieldValueList())) {
                        for (FileItemFieldValue newFileItemFieldValue : newFileItem.getFileItemFieldValueList()) {
                            fileItemFieldValueList = fileItem.getFileItemFieldValueList();
                            Iterator fifvToAdd = fileItemFieldValueList.iterator();
                            FileItemFieldValue fileItemFieldValue;
                            Boolean exist = false;
                            while (fifvToAdd.hasNext() && !exist) {
                                fileItemFieldValue = (FileItemFieldValue) fifvToAdd.next();
                                if (fileItemFieldValue.getFileItemField().getCode().equals(newFileItemFieldValue.getFileItemField().getCode())) {
                                    if (fileItemFieldValue.getFileItemField().getUpdatable()) {
                                        fileItemFieldValue.setValue(newFileItemFieldValue.getValue());
                                    }
                                }
                                exist = true;
                            }
                            if (!exist) {
                                fileItemFieldValueToAdd.add(newFileItemFieldValue);
                            }
                        }
                    }
                    if (CollectionUtils.isNotEmpty(fileItemFieldValueToAdd)) {
                        for (FileItemFieldValue fifv : fileItemFieldValueToAdd) {
                            FileItemFieldValue fifvToAdd = new FileItemFieldValue();
                            fifvToAdd.setFileItem((FileItem) fileItem);
                            fifvToAdd.setFileItemField(fifv.getFileItemField());
                            fifvToAdd.setValue(fifv.getValue());
                            fileItemFieldValueDao.save(fifvToAdd);
                        }
                    }
                }
            }
        }
        FileTypeCode fileTypeCode = currentFile.getFileType().getCode();
        if (FileTypeCode.BSBE_MINFOF.equals((Object) fileTypeCode)) {
            woodSpecificationDao.removeByFile(currentFile);
            if (CollectionUtils.isNotEmpty(woodSpecifications)) {
                for (WoodSpecification spec : woodSpecifications) {
                    spec.setFile(currentFile);
                    woodSpecificationDao.save(spec);
                }
            }
        }
        currentFile.setCountryOfDestination(nextFile.getCountryOfDestination());
        currentFile.setCountryOfOrigin(nextFile.getCountryOfOrigin());
        currentFile.setCountryOfProvenance(nextFile.getCountryOfProvenance());
        currentFile.setReferenceGuce(nextFile.getReferenceGuce());
        fileDao.update(currentFile);
    }

    /**
     * Proceed workflow for cancel request.
     *
     * @param fileFromSiat the file from siat
     * @param document the document
     */
    private void proceedWorkflowForCancelRequest(final File fileFromSiat, final Serializable document) {
        final List<ItemFlow> itemFlowsToAdd = new ArrayList<>();
        final Flow flowToExecute = flowDao.findFlowByCode(flowGuceSiat.getFlowSiat());
        final List<ItemFlowData> itemFlowDataList = retrieveItemFlowDatas(document, flowToExecute);

        for (final FileItem fileItem : fileFromSiat.getFileItemsList()) {
            final ItemFlow itemFlow = new ItemFlow();

            itemFlow.setFileItem(fileItem);
            itemFlow.setFlow(flowToExecute);
            itemFlow.setSender(declarant);
            itemFlow.setSent(Boolean.TRUE);
            itemFlow.setUnread(Boolean.TRUE);
            itemFlow.setItemFlowsDataList(itemFlowDataList);
            itemFlowsToAdd.add(itemFlow);

            fileItem.setDraft(Boolean.FALSE);
            fileItem.setStep(flowToExecute.getToStep());
            fileItemDao.save(fileItem);
        }

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            for (final ItemFlowData itemFlowData : itemFlow.getItemFlowsDataList()) {
                final ItemFlowData ifd = new ItemFlowData();
                ifd.setItemFlow(itemFlow);
                ifd.setDataType(itemFlowData.getDataType());
                ifd.setValue(itemFlowData.getValue());
                itemFlowDataDao.save(ifd);
            }
        }

        /**
         * Notification par email depot de dossier *
         */
        try {
            notificationEmail(fileFromSiat, flowToExecute);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

    /**
     * Proceed workflow for paiment request.
     *
     * @param fileFromSiat the file from siat
     * @param document the document
     */
    private void proceedWorkflowForPaymentRequest(final File fileFromSiat, final Serializable document) {

        List<FileItem> fileItems = fileItemDao.findFileItemsByFile(fileFromSiat);
        FileItem item = fileItems.get(0);
        if (!Arrays.asList(StepCode.ST_CT_42, StepCode.ST_CT_61).contains(item.getStep().getStepCode())) {
            return;
        }

        final Flow flowToExecute;
        FileTypeCode fileTypeCode = fileFromSiat.getFileType().getCode();
        if (Arrays.asList(FileTypeCode.CCT_CT_E, FileTypeCode.CCT_CT_E_ATP).contains(fileTypeCode)) {
            flowToExecute = flowDao.findFlowByCode(FlowCode.FL_CT_123.name());
        } else if (Arrays.asList(FileTypeCode.CCT_CT_E_PVI, FileTypeCode.CCT_CT_E_FSTP).contains(fileTypeCode)) {
            flowToExecute = flowDao.findFlowByCode(FlowCode.FL_CT_126.name());
        } else if (Arrays.asList(FileTypeCode.CCT_CT_E_PVE).contains(fileTypeCode)) {
            ItemFlow invValidItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow2(item, FlowCode.FL_CT_121);
            if (invValidItemFlow == null) {
                invValidItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow2(item, FlowCode.FL_CT_133);
            }
            if (FlowCode.FL_CT_121.name().equals(invValidItemFlow.getFlow().getCode())) {
                if (fileFromSiat.getParent() == null) {
                    flowToExecute = flowDao.findFlowByCode(FlowCode.FL_CT_126.name());
                } else {
                    flowToExecute = flowDao.findFlowByCode(FlowCode.FL_CT_145.name());
                }
            } else {
                flowToExecute = flowDao.findFlowByCode(FlowCode.FL_CT_135.name());
            }
        } else if (Arrays.asList(FileTypeCode.CCT_CT, FileTypeCode.CC_CT, FileTypeCode.CQ_CT).contains(fileTypeCode)) {
            flowToExecute = flowDao.findFlowByCode(FlowCode.FL_CT_93.name());
        } else if (!FileTypeCode.PIVPSRP_MINADER.equals(fileTypeCode)) {
            flowToExecute = flowDao.findFlowByCode(FlowCode.FL_AP_166.name());
        } else {
            flowToExecute = flowDao.findFlowByCode(FlowCode.FL_AP_168.name());
        }

        final List<PaymentItemFlow> paymentItemFlowList = new ArrayList<>();

        final PaymentData paymentDataNew = new PaymentData();
        final Flow paymentFlow = itemFlowDao.findLastSentItemFlowByFileItem(fileItems.get(0)).getFlow();
        final PaymentData paymentData = paymentDataDao.findPaymentDataByFileItem(fileItems.get(0));
        BeanUtils.copyProperties(paymentData, paymentDataNew, "id", "paymentItemFlowList", "invoiceLines");

        for (final FileItem fileItem : fileItems) {

            final ItemFlow itemFlow = new ItemFlow();

            itemFlow.setFileItem(fileItem);
            itemFlow.setFlow(flowToExecute);
            itemFlow.setSender(null);
            itemFlow.setSent(Boolean.TRUE);
            itemFlow.setUnread(Boolean.TRUE);
            final ItemFlow savedItemFlow = itemFlowDao.save(itemFlow);

            // Add Payment_ItemFlow
            final PaymentItemFlow paymentItemFlow = new PaymentItemFlow();

            paymentItemFlow.setPaymentData(paymentDataNew);
            paymentItemFlow.setItemFlow(savedItemFlow);
            paymentItemFlow.setDeleted(Boolean.FALSE);
            paymentItemFlowList.add(paymentItemFlow);

            // Update File item and execute flow
            fileItem.setDraft(Boolean.FALSE);

            //le STEP dépond du nombre des cotation
            if (Arrays.asList(FlowCode.FL_CT_123.name(), FlowCode.FL_CT_126.name(), FlowCode.FL_CT_135.name(), FlowCode.FL_CT_145.name()).contains(flowToExecute.getCode())) {
                fileItem.setStep(flowToExecute.getToStep());
            } else {
                fileItem.setStep(paymentFlow.getFromStep());
            }
            fileItemDao.update(fileItem);
        }

        paymentData.setDateEncaissement(Calendar.getInstance().getTime());
        if (document instanceof org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT()
                            .getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof PaymentDocument) {
            final PaymentDocument jaxbDocument = (PaymentDocument) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
                paymentData.setDateEncaissement(java.util.Calendar.getInstance().getTime());
            }
        } else if (document instanceof org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        } else if (document instanceof org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT jaxbDocument = (org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) document;
            if (jaxbDocument.getCONTENT() != null && jaxbDocument.getCONTENT().getPAIEMENT() != null
                    && jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT() != null) {
                if (jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT() != null) {
                    paymentData.setMontantEncaissement(Double.valueOf(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getMONTANT()));
                }
                paymentData.setNatureEncaissement(jaxbDocument.getCONTENT().getPAIEMENT().getENCAISSEMENT().getNATURE());
            }
        }
        paymentDataNew.setPaymentItemFlowList(paymentItemFlowList);
        paymentDataDao.save(paymentDataNew);
        paymentDataDao.update(paymentData);

        cotationService.dispatch(fileFromSiat, flowToExecute);
    }

    /**
     * Retrieve item flow datas.
     *
     * @param document the document
     * @param flowToExecute the flow to execute
     * @return the list
     */
    private List<ItemFlowData> retrieveItemFlowDatas(final Serializable document, final Flow flowToExecute) {
        String observation = null;
        final List<ItemFlowData> itemFlowDatas = new ArrayList<>();

        if (document instanceof org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT retrievedocument = (org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }

            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getDATE() != null) {
                final DataType dataTypeDateInspDemandeDate = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.DATE_INSPECTION_DEMANDEE_DATE);

                if (dataTypeDateInspDemandeDate != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(FileFieldValueUtils.formatDatePattern(retrievedocument.getCONTENT().getINSPECTION()
                            .getDATEINSPECTION().getDATE()));
                    itemFlowData.setDataType(dataTypeDateInspDemandeDate);
                    itemFlowDatas.add(itemFlowData);
                }
            }
            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getHEURE() != null) {

                final DataType dataTypeDateInspDemandeHeure = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.DATE_INSPECTION_DEMANDEE_HEURE);

                if (dataTypeDateInspDemandeHeure != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getHEURE());
                    itemFlowData.setDataType(dataTypeDateInspDemandeHeure);
                    itemFlowDatas.add(itemFlowData);
                }

            }
            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getSOCIETETRAITEMENT() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getSOCIETETRAITEMENT().getCODE() != null) {

                final DataType dataTypeSocieteTraitCode = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.SOCIETE_TRAITEMENT_SOHAITEE_CODE);

                if (dataTypeSocieteTraitCode != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(retrievedocument.getCONTENT().getINSPECTION().getSOCIETETRAITEMENT().getCODE());
                    itemFlowData.setDataType(dataTypeSocieteTraitCode);
                    itemFlowDatas.add(itemFlowData);
                }

            }
            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getSOCIETETRAITEMENT() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getSOCIETETRAITEMENT().getLIBELLE() != null) {

                final DataType dataTypeSocieteTraitLibelle = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.SOCIETE_TRAITEMENT_SOHAITEE_LIBELLE);

                if (dataTypeSocieteTraitLibelle != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(retrievedocument.getCONTENT().getINSPECTION().getSOCIETETRAITEMENT().getLIBELLE());
                    itemFlowData.setDataType(dataTypeSocieteTraitLibelle);
                    itemFlowDatas.add(itemFlowData);
                }

            }
        }

        if (document instanceof org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT retrievedocument = (org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }

            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getDATE() != null) {
                final DataType dataTypeDateInspDemandeDate = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.DATE_INSPECTION_DEMANDEE_DATE);

                if (dataTypeDateInspDemandeDate != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(FileFieldValueUtils.formatDatePattern(retrievedocument.getCONTENT().getINSPECTION()
                            .getDATEINSPECTION().getDATE()));
                    itemFlowData.setDataType(dataTypeDateInspDemandeDate);
                    itemFlowDatas.add(itemFlowData);
                }
            }
            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getHEURE() != null) {

                final DataType dataTypeDateInspDemandeHeure = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.DATE_INSPECTION_DEMANDEE_HEURE);

                if (dataTypeDateInspDemandeHeure != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getHEURE());
                    itemFlowData.setDataType(dataTypeDateInspDemandeHeure);
                    itemFlowDatas.add(itemFlowData);
                }

            }
        }

        if (document instanceof org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT retrievedocument = (org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }

            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getDATE() != null) {
                final DataType dataTypeDateInspDemandeDate = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.DATE_INSPECTION_DEMANDEE_DATE);

                if (dataTypeDateInspDemandeDate != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(FileFieldValueUtils.formatDatePattern(retrievedocument.getCONTENT().getINSPECTION()
                            .getDATEINSPECTION().getDATE()));
                    itemFlowData.setDataType(dataTypeDateInspDemandeDate);
                    itemFlowDatas.add(itemFlowData);
                }
            }
            if (retrievedocument.getCONTENT() != null && retrievedocument.getCONTENT().getINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION() != null
                    && retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getHEURE() != null) {

                final DataType dataTypeDateInspDemandeHeure = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute,
                        DataTypeNameEnnumeration.DATE_INSPECTION_DEMANDEE_HEURE);

                if (dataTypeDateInspDemandeHeure != null) {

                    final ItemFlowData itemFlowData = new ItemFlowData();
                    itemFlowData.setValue(retrievedocument.getCONTENT().getINSPECTION().getDATEINSPECTION().getHEURE());
                    itemFlowData.setDataType(dataTypeDateInspDemandeHeure);
                    itemFlowDatas.add(itemFlowData);
                }

            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }

        if (document instanceof org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.monitoring.IDE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.IDE.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.IDE.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }
        if (document instanceof org.guce.siat.jaxb.monitoring.IDI.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.IDI.DOCUMENT retrievedocument = (org.guce.siat.jaxb.monitoring.IDI.DOCUMENT) document;
            if (retrievedocument.getCONTENT() != null) {
                observation = retrievedocument.getCONTENT().getOBSERVATIONS();
            }
        }

        if (observation != null) {
            final DataType dataTypeObservation = dataTypeDao.findDataTypeByNameAndFlowCode(flowToExecute, DataTypeNameEnnumeration.OBSERVATION);
            if (dataTypeObservation != null) {
                final ItemFlowData itemFlowData = new ItemFlowData();
                itemFlowData.setDataType(dataTypeObservation);
                itemFlowData.setValue(observation);
                itemFlowDatas.add(itemFlowData);
            }
        }
        return itemFlowDatas;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.XmlConverterService#convertDocumentToFile (java.io.Serializable)
     */
    @Override
    public File convertDocumentToFile(final Serializable document) throws ParseException, ValidationException {
        flowGuceSiat = null;
        refSiat = null;
        numEbmsMessage = null;
        decisionArticles = new HashMap<>();
        decisionDossier = new HashMap<>();

        File fileToReturn = null;

        if (document instanceof org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT) {
            final DOCUMENT returnedDocument = (DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCctCT(returnedDocument);

        } else if (document instanceof org.guce.siat.jaxb.cct.CCT_CT_E.DOCUMENT) {
            xmlConverter = new XmlConverterCctCtExp(this);
            fileToReturn = xmlConverter.convertDocumentToFile(document);
        } else if (document instanceof org.guce.siat.jaxb.cct.PVE.DOCUMENT) {
            xmlConverter = new XmlConverterPve(this);
            fileToReturn = xmlConverter.convertDocumentToFile(document);
        } else if (document instanceof org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT returnedDocument = (org.guce.siat.jaxb.cct.CC_CT.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCcCT(returnedDocument);

        } else if (document instanceof org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) {
            final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT returnedDocument = (org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCqCT(returnedDocument);

        } else if (document instanceof org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileVtMINEPIA(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileVtMINEPDED(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAtMINEPIA(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAieMINADER(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AE_MINADER.DOCUMENT) {
            xmlConverter = new XmlConverterAeMINADER(this);
            fileToReturn = xmlConverter.convertDocumentToFile(document);
        } else if (document instanceof org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileEhMINADER(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCatMINADER(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFilePivpsrpMINADER(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileDiMINADER(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAtMINSANTE(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCeaMINMIDT(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAiMINSANTE(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAsMINADER(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileVtpMINSANTE(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileVtdMINSANTE(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAiMINMIDT(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAeMINMIDT(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCpMINEPDED(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) {
            final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAsMINFOF(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCoForetMINFOF(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) {
            final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileCoFauneMINFOF(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileAsMINCOMMERCE(returnedDocument);

        } else if (document instanceof org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = null;
            fileToReturn = convertDocumentToFileFIMEX(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileFIMEXWF(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.monitoring.IDI.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.IDI.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.IDI.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = null;
            fileToReturn = convertDocumentToFileIDI(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.monitoring.IDE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.IDE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.IDE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = null;
            fileToReturn = convertDocumentToFileIDE(returnedDocument);
        } // DI MINCOMMERCE
        else if (document instanceof org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = null;
            fileToReturn = convertDocumentToFileDiMINCOMMERCE(returnedDocument);
        } // DE MINCOMMERCE
        else if (document instanceof org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = null;
            fileToReturn = convertDocumentToFileDeMINCOMMERCE(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT) {
            final org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileLvtbMINFOF(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT) {
            final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT returnedDocument = (org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileBsbeMINFOF(returnedDocument);
        } else if (document instanceof org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT) {
            final org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT returnedDocument = (org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT) document;
            flowGuceSiat = flowGuceSiatDao.findFlowGuceSiatByFlowGuce(returnedDocument.getTYPEDOCUMENT());
            refSiat = returnedDocument.getREFERENCEDOSSIER().getREFERENCESIAT();
            numDossier = returnedDocument.getREFERENCEDOSSIER().getNUMERODOSSIER();
            numEbmsMessage = returnedDocument.getMESSAGE().getNUMEROMESSAGE();
            guceSiatBureau = guceSiatBureauDao.findByBureauGuce(returnedDocument.getCONTENT().getCODEBUREAU());
            fileToReturn = convertDocumentToFileIrmpMINCOMMERCE(returnedDocument);
        } else if (document instanceof PaymentDocument) {
            xmlConverter = new XmlConverterPayment(this);
            fileToReturn = xmlConverter.convertDocumentToFile(document);
        }
        if (flowGuceSiat != null && fileToReturn != null && !(document instanceof PaymentDocument)) {
            fileToReturn.setFileType(flowGuceSiat.getFileType());
        }

        return fileToReturn;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.XmlConverterService#convertFileToDocument (org.guce.siat.common.model.File,
	 * java.util.List, java.util.List, org.guce.siat.common.model.Flow)
     */
    @Override
    public Serializable convertFileToDocument(final File file, final List<FileItem> fileItemList, final List<ItemFlow> itemFlowList, final Flow flowToExecute) throws UtilitiesException {

        FileType fileType = file.getFileType();
        FlowGuceSiat fgsByFAndFT = flowGuceSiatDao.findFlowGuceSiatByFlowSiatAndFileType(flowToExecute.getCode(), fileType.getId());

        if (null == fileType.getCode()) {
            return null;
        } else {
            switch (fileType.getCode()) {
                case CCT_CT:
                    return convertFileToDocumentCctCT(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CCT_CT_E:
                case CCT_CT_E_PVI:
                case CCT_CT_E_ATP:
                case CCT_CT_E_FSTP:
                    if (!FlowCode.FL_CT_123.name().equals(flowToExecute.getCode()) && !FlowCode.FL_CT_126.name().equals(flowToExecute.getCode())) {
                        xmlConverter = new XmlConverterCctCtExp(this);
                        return xmlConverter.convertFileToDocument(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                    } else {
                        xmlConverter = new XmlConverterPayment(this);
                        return xmlConverter.convertFileToDocument(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                    }
                case CCT_CT_E_PVE:
                    if (Arrays.asList(FlowCode.FL_CT_126.name(), FlowCode.FL_CT_135.name(), FlowCode.FL_CT_145.name()).contains(flowToExecute.getCode())) {
                        xmlConverter = new XmlConverterPayment(this);
                        return xmlConverter.convertFileToDocument(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                    } else {
                        xmlConverter = new XmlConverterPve(this);
                        return xmlConverter.convertFileToDocument(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                    }
                case CC_CT:
                    return convertFileToDocumentCcCT(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CQ_CT:
                    return convertFileToDocumentCqCT(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case VT_MINEPIA:
                    return convertFileToDocumentVtMINEPIA(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case VT_MINEPDED:
                    return convertFileToDocumentVtMINEPDED(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AT_MINEPIA:
                    return convertFileToDocumentAtMINEPIA(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CEA_MINMIDT:
                    return convertFileToDocumentCeaMINMIDT(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AI_MINSANTE:
                    return convertFileToDocumentAiMINSANTE(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AT_MINSANTE:
                    return convertFileToDocumentAtMINSANTE(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case DI_MINADER:
                    return convertFileToDocumentDiMINADER(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case PIVPSRP_MINADER:
                    return convertFileToDocumentPivpsrpMINADER(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CAT_MINADER:
                    return convertFileToDocumentCatMINADER(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case EH_MINADER:
                    return convertFileToDocumentEhMINADER(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AIE_MINADER:
                    return convertFileToDocumentAieMINADER(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AE_MINADER:
                    xmlConverter = new XmlConverterAeMINADER(this);
                    return xmlConverter.convertFileToDocument(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AS_MINADER:
                    return convertFileToDocumentAsMINADER(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case VTP_MINSANTE:
                    return convertFileToDocumentVtpMINSANTE(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case VTD_MINSANTE:
                    return convertFileToDocumentVtdMINSANTE(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AI_MINMIDT:
                    return convertFileToDocumentAiMINMIDT(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AE_MINMIDT:
                    return convertFileToDocumentAeMINMIDT(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CP_MINEPDED:
                    return convertFileToDocumentCpMINEPDED(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case AS_MINFOF:
                    return convertFileToDocumentAsMINFOF(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case BSBE_MINFOF: {
                    return convertFileToDocumentBsbeMINFOF(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                }
                case AS_MINCOMMERCE:
                    return convertFileToDocumentAsMINCOMMERCE(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CO_MINFOF_FORET:
                    return convertFileToDocumentCoForetMINFOF(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case CO_MINFOF_FAUNE:
                    return convertFileToDocumentCoFauneMINFOF(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case FIMEX_WF:
                    return convertFileToDocumentFIMEXWF(file, fileItemList, itemFlowList, flowToExecute, fgsByFAndFT);
                case IRMP_MINCOMMERCE:
                    return convertFileToDocumentIrmpMINCOMMERCE(file, fileItemList, itemFlowList, flowToExecute, flowGuceSiat);
                default:
                    return null;
            }
        }
    }

    /**
     * Convert file to cct document.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCctCT(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT ciDocument = new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT());

        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        }
        if (FlowCode.FL_CT_89.name().equals(flowToExecute.getCode()) || FlowCode.FL_CT_08.name().equals(flowToExecute.getCode())) {
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()
                    .add(new PIECEJOINTE(file.getFileTypeGuce(), file.getReferenceGuce() + ESBConstants.PDF_FILE_EXTENSION));
        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_26.name(), FlowCode.FL_CT_42.name(), FlowCode.FL_CT_41.name()).contains(
                        flowToExecute.getCode())) {
            ciDocument.getCONTENT().setINSPECTION(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.INSPECTION());
            final Appointment appointment = appointmentService.findAppointmentByItemFlowList(itemFlowList);
            if (appointment != null) {
                final Date appointmentDate = appointment.getBeginTime();
                ciDocument.getCONTENT().getINSPECTION()
                        .setDATEINSPECTION(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION());

                ciDocument.getCONTENT().getINSPECTION().getDATEINSPECTION()
                        .setDATE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, appointmentDate));
                ciDocument.getCONTENT().getINSPECTION().getDATEINSPECTION()
                        .setHEURE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.HOURE_ONLY, appointmentDate));

            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && FlowCode.FL_CT_29.name().equals(flowToExecute.getCode())) {
            // copy recepient analyse
            final AnalyseOrder anayseOrder = analyseOrderDao.findByItemFlow(itemFlowList.get(0));
            ciDocument.getCONTENT().setANALYSE(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.ANALYSE());
            if (anayseOrder != null) {
                ciDocument.getCONTENT().getANALYSE()
                        .setDATE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, anayseOrder.getDate()));
                ciDocument.getCONTENT().getANALYSE().setINSTRUCTION(anayseOrder.getObservation());
                ciDocument.getCONTENT().getANALYSE()
                        .setLABORATOIRE(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.ANALYSE.LABORATOIRE());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE().setNOMLABO(anayseOrder.getLaboratory().getLabelFr());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE().setADRESSE(anayseOrder.getLaboratory().getAddress());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE().setEMAIL(anayseOrder.getLaboratory().getEmail());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE()
                        .setTELEPHONE(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.TELEPHONE());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE().getTELEPHONE()
                        .setNUMERO(anayseOrder.getLaboratory().getTelephone());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE()
                        .setFAX(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.ANALYSE.LABORATOIRE.FAX());
                ciDocument.getCONTENT().getANALYSE().getLABORATOIRE().getFAX().setNUMERO(anayseOrder.getLaboratory().getFax());
                ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES());
                final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();
                marchandise.setLINENUMBER(anayseOrder.getItemFlow().getFileItem().getLineNumber());
                ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().add(marchandise);

            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && FlowCode.FL_CT_64.name().equals(flowToExecute.getCode())) {
            // copy recepient traitement
            final TreatmentOrder treatmentOrder = treatmentOrderDao.findTreatmentOrderByItemFlow(itemFlowList.get(0));
            ciDocument.getCONTENT().setTRAITEMENT(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.TRAITEMENT());
            if (treatmentOrder != null) {
                ciDocument.getCONTENT().getTRAITEMENT()
                        .setDATE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, treatmentOrder.getDate()));
                ciDocument.getCONTENT().getTRAITEMENT().setINSTRUCTION(treatmentOrder.getObservation());
                ciDocument.getCONTENT().getTRAITEMENT()
                        .setSOCIETETRAITEMENT(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT()
                        .setNOMSOCIETE(treatmentOrder.getTreatmentCompany().getLabelFr());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT()
                        .setADRESSE(treatmentOrder.getTreatmentCompany().getAddress());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT()
                        .setEMAIL(treatmentOrder.getTreatmentCompany().getEmail());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT()
                        .setTELEPHONE(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.TELEPHONE());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getTELEPHONE()
                        .setNUMERO(treatmentOrder.getTreatmentCompany().getTelephone());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT()
                        .setFAX(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.TRAITEMENT.SOCIETETRAITEMENT.FAX());
                ciDocument.getCONTENT().getTRAITEMENT().getSOCIETETRAITEMENT().getFAX()
                        .setNUMERO(treatmentOrder.getTreatmentCompany().getFax());
                ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES());
                final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();
                marchandise.setLINENUMBER(treatmentOrder.getItemFlow().getFileItem().getLineNumber());
                ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().add(marchandise);
            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_92.name(), FlowCode.FL_CT_93.name()).contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
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
        if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())
                && ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // Decision organisme

            ItemFlowData itemFlowDataToInsert = null;

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }
            ciDocument.getCONTENT().setDECISIONORGANISME(ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

        } else if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())) {
            /* DECISION PAR ARTICLE */
            final List<MARCHANDISE> marchandiseList = new ArrayList<>();
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
                final MARCHANDISE marchandise = new MARCHANDISE();

                marchandise.setLINENUMBER(fileItem.getLineNumber());
                // code tarif
                final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif = new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF();
                final org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille = new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE();
                codetarif.setCODENSH(fileItem.getNsh() != null ? fileItem.getNsh().getGoodsItemCode() : null);
                sousfamille.setCODESOUSFAMILLE(fileItem.getSubfamily() != null ? fileItem.getSubfamily().getCode() : null);
                marchandise.setCODETARIF(codetarif);
                marchandise.setSOUSFAMILLE(sousfamille);
                marchandise.setDECISIONORGANISME(ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

                marchandiseList.add(marchandise);

            }
            ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.MARCHANDISES());
            ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().addAll(marchandiseList);

        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.CCT_CT.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
        }
        return ciDocument;
    }

    /**
     * Convert file to document cc ct.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCcCT(final File file, final List<FileItem> fileItemList, final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT ciDocument = new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT());
        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_26.name(), FlowCode.FL_CT_42.name(), FlowCode.FL_CT_41.name()).contains(flowToExecute.getCode())) {
            ciDocument.getCONTENT().setINSPECTION(new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.INSPECTION());
            final Appointment appointment = appointmentService.findAppointmentByItemFlowList(itemFlowList);
            if (appointment != null) {
                final Date appointmentDate = appointment.getBeginTime();
                ciDocument.getCONTENT().getINSPECTION()
                        .setDATEINSPECTION(new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION());

                ciDocument.getCONTENT().getINSPECTION().getDATEINSPECTION()
                        .setDATE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, appointmentDate));
                ciDocument.getCONTENT().getINSPECTION().getDATEINSPECTION()
                        .setHEURE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.HOURE_ONLY, appointmentDate));
            }

        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_92.name(), FlowCode.FL_CT_93.name()).contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
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
        if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())
                && ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // Decision organisme

            ItemFlowData itemFlowDataToInsert = null;

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }
            ciDocument.getCONTENT().setDECISIONORGANISME(
                    ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

        } else if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())) {
            /* DECISION PAR ARTICLE */
            final List<org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandiseList = new ArrayList<>();
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
                final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();

                marchandise.setLINENUMBER(fileItem.getLineNumber());
                // code tarif
                final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif = new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF();
                final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE sousfamille = new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE();

                codetarif.setCODENSH(fileItem.getNsh() != null ? fileItem.getNsh().getGoodsItemCode() : null);
                sousfamille.setCODESOUSFAMILLE(fileItem.getSubfamily() != null ? fileItem.getSubfamily().getCode() : null);
                marchandise.setCODETARIF(codetarif);
                marchandise.setSOUSFAMILLE(sousfamille);
                marchandise.setDECISIONORGANISME(ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

                marchandiseList.add(marchandise);

            }
            ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES());
            ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().addAll(marchandiseList);
            // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL
            // *********///
            if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
                ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.SIGNATAIRE());
                ciDocument.getCONTENT().getSIGNATAIRE()
                        .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
                ciDocument
                        .getCONTENT()
                        .getSIGNATAIRE()
                        .setLIEU(
                                itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                                .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                        .getLabelFr().subSequence(0, 34).toString());
                ciDocument
                        .getCONTENT()
                        .getSIGNATAIRE()
                        .setNOM(String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender().getLastName()));
                ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            }

            // ****************************************************************//
        }

        return ciDocument;
    }

    /**
     * Convert file to document cq ct.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCqCT(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT ciDocument = new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT());
        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_26.name(), FlowCode.FL_CT_42.name(), FlowCode.FL_CT_41.name()).contains(
                        flowToExecute.getCode())) {
            ciDocument.getCONTENT().setINSPECTION(new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.INSPECTION());
            final Appointment appointment = appointmentService.findAppointmentByItemFlowList(itemFlowList);
            if (appointment != null) {
                final Date appointmentDate = appointment.getBeginTime();
                ciDocument.getCONTENT().getINSPECTION()
                        .setDATEINSPECTION(new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.INSPECTION.DATEINSPECTION());

                ciDocument.getCONTENT().getINSPECTION().getDATEINSPECTION()
                        .setDATE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.GUCE_DATE, appointmentDate));
                ciDocument.getCONTENT().getINSPECTION().getDATEINSPECTION()
                        .setHEURE(org.guce.siat.common.utils.DateUtils.formatSimpleDate(DateUtils.HOURE_ONLY, appointmentDate));
            }
        } else if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_CT_92.name(), FlowCode.FL_CT_93.name()).contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
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
        if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())
                && ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // Decision organisme

            ItemFlowData itemFlowDataToInsert = null;

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }
            ciDocument.getCONTENT().setDECISIONORGANISME(
                    ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

        } else if (CollectionUtils.isEmpty(flowToExecute.getCopyRecipientsList())) {
            /* DECISION PAR ARTICLE */
            final List<org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE> marchandiseList = new ArrayList<>();
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
                final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise = new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE();

                marchandise.setLINENUMBER(fileItem.getLineNumber());
                // code tarif
                final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF codetarif = new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.CODETARIF();
                final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE codesousfamille = new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE.SOUSFAMILLE();
                codetarif.setCODENSH(fileItem.getNsh() != null ? fileItem.getNsh().getGoodsItemCode() : null);
                codesousfamille.setCODESOUSFAMILLE(fileItem.getSubfamily() != null ? fileItem.getSubfamily().getCode() : null);
                marchandise.setCODETARIF(codetarif);
                marchandise.setSOUSFAMILLE(codesousfamille);
                marchandise.setDECISIONORGANISME(ConverterGuceSiatUtils
                        .generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));

                marchandiseList.add(marchandise);

            }
            ciDocument.getCONTENT().setMARCHANDISES(new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES());
            ciDocument.getCONTENT().getMARCHANDISES().getMARCHANDISE().addAll(marchandiseList);
            // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL
            // *********///
            if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
                ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.SIGNATAIRE());
                ciDocument.getCONTENT().getSIGNATAIRE()
                        .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
                ciDocument
                        .getCONTENT()
                        .getSIGNATAIRE()
                        .setLIEU(
                                itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                                .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                        .getLabelFr().subSequence(0, 34).toString());
                ciDocument
                        .getCONTENT()
                        .getSIGNATAIRE()
                        .setNOM(
                                String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                        .getLastName()));
                ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            }

            // ****************************************************************//
        }

        return ciDocument;
    }

    /**
     * Convert file to vtm document.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentVtMINEPIA(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        // VT MINEPIA REPORT FIELD NAME
        final String VT_MINEPIA_REPORT_FIELD = "NUMERO_VT_MINEPIA";

        final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT.CONTENT());
        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(VT_MINEPIA_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROVTMINEPIA(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));
            }

        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name(),
                        FlowCode.FL_AP_193.name(), FlowCode.FL_AP_194.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }

        }

        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ v t_ minepded.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentVtMINEPDED(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        // VT MINEPDED REPORT FIELD NAME
        final String VT_MINEPDED_REPORT_FIELD = "NUMERO_VT_MINEPDED";

        final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT();

        ciDocument.setCONTENT(new CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(VT_MINEPDED_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROVTMINEPDED(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }
        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ a t_ minepia.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAtMINEPIA(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        // AT MINEPIA REPORT FIELD NAME
        final String AT_MINEPIA_REPORT_FIELD = "NUMERO_AT_MINEPIA";

        final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT();
        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT.CONTENT());
        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AT_MINEPIA_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROATMINEPIA(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ ce a_ minmidt.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCeaMINMIDT(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        // VT MINEPIA REPORT FIELD NAME
        final String CEA_MINMIDT_REPORT_FIELD = "NUMERO_CEA_MINMIDT";

        final org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(CEA_MINMIDT_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROCEAMINMIDT(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ a i_ minsante.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAiMINSANTE(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AI_MINSANTE_REPORT_FIELD = "NUMERO_AI_MINSANTE";

        final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AI_MINSANTE_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROAIMINSANTE(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
        /* PAYS */
        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getPROVENANCE() != null
                && ciDocument.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null
                && ciDocument.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getPROVENANCE()
                    .getPAYSORIGINE().getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getPROVENANCE() != null
                        && ciDocument.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(ciDocument.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS());
                    countryOfOrigin.setCountryName(ciDocument.getCONTENT().getPROVENANCE().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getPROVENANCE() != null
                && ciDocument.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null
                && ciDocument.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getPROVENANCE()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getPROVENANCE() != null
                        && ciDocument.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(ciDocument.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS());
                    countryOfProvenance.setCountryName(ciDocument.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ a t_ minsante.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAtMINSANTE(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AT_MINSANTE_REPORT_FIELD = "NUMERO_AT_MINSANTE";

        final org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AT_MINSANTE_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROATMINSANTE(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ d i_ minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentDiMINADER(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String DI_MINADER_AT_REPORT_FIELD = "NUMERO_DI_MINADER_AT";
        final String DI_MINADER_IE_REPORT_FIELD = "NUMERO_DI_MINADER_IE";
        final String DI_MINADER_S_REPORT_FIELD = "NUMERO_DI_MINADER_S";

        final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));
        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(DI_MINADER_AT_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMERODIMINADER(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ pivpsr p_ minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentPivpsrpMINADER(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String PIVPSRP_MINADER_REPORT_FIELD = "NUMERO_PIVPSRP_MINADER";

        final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(
                    PIVPSRP_MINADER_REPORT_FIELD, file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROPIVPSRPMINADER(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_167.name(), FlowCode.FL_AP_168.name()).contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ ca t_ minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCatMINADER(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String CAT_MINADER_REPORT_FIELD = "NUMERO_CAT_MINADER";

        final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(CAT_MINADER_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROCATMINADER(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // /// SET RESULTAT ESSAIS Dans la decision final (toStep isFinal)
            ciDocument.getCONTENT().setRESULTATSESSAIS(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.RESULTATSESSAIS());
            ciDocument.getCONTENT().getRESULTATSESSAIS()
                    .setESSAIS(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS());

            for (final ItemFlow itemFlow : itemFlowList) {
                final ItemFlow essayTestFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlow.getFileItem(), FlowCode.FL_AP_102);
                if (essayTestFlow != null) {
                    final EssayTestAP essayTest = essayTestAPDao.findByItemFlow(essayTestFlow);
                    if (essayTest != null) {
                        final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI esseyXml = new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI();
                        esseyXml.setNATUREESSAI(essayTest.getNature());
                        esseyXml.setLIEU(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.RESULTATSESSAIS.ESSAIS.ESSAI.LIEU());
                        esseyXml.getLIEU().setLIBELLE(essayTest.getPlace());
                        esseyXml.setDATE(essayTest.getTestDate() != null ? SIMPLE_DATE_FORMAT.format(essayTest.getTestDate()) : null);
                        esseyXml.setOBSERVATIONS(essayTest.getObsevations());
                        esseyXml.setCODEVILLAGE(essayTest.getTownCode());
                        esseyXml.setCULTURE(essayTest.getCulture());
                        esseyXml.setRESULTATS(essayTest.getResultats());
                        esseyXml.setCONDITIONS(essayTest.getCondition());
                        esseyXml.setINTERVENANTS(essayTest.getContributors());
                        esseyXml.setTYPEESSAIS(essayTest.getType());
                        ciDocument.getCONTENT().getRESULTATSESSAIS().getESSAIS().getESSAI().add(esseyXml);
                    }
                }
            }
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }

            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ e h_ minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentEhMINADER(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String EH_MINADER_REPORT_FIELD = "NUMERO_EH_MINADER";

        final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(EH_MINADER_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROARRETE(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

        }

        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
        }
        /* DETECTER SI DECISION PAR ARTICLE OU PAR DOSSIER */

        if (ConverterGuceSiatUtils.isDecisionDossier(file, fileItemList)) {
            // DECISION ORGANISME

            ItemFlowData itemFlowDataToInsert = null;

            if (CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
                itemFlowDataToInsert = itemFlowList.get(0).getItemFlowsDataList().get(0);
            }

            ciDocument.getCONTENT().setDECISIONORGANISME(ConverterGuceSiatUtils.generateDecisionOrganisme(flowToExecute, itemFlowDataToInsert));
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

            for (final ItemFlow itemFlow : itemFlowList) {
                final ItemFlow analyseItemFlow = itemFlowDao
                        .findItemFlowByFileItemAndFlow(itemFlow.getFileItem(), FlowCode.FL_AP_102);
                final AnalyseResultAp analyseAp = analyseResultApDao.findAnalyseResultApByItemFlow(analyseItemFlow);
                if (analyseAp != null) {
                    ciDocument.getCONTENT().setRESULTATSANALYSES(
                            new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSANALYSES());

                    ciDocument.getCONTENT().getRESULTATSANALYSES()
                            .setANALYSES(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSANALYSES.ANALYSES());
                    final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSANALYSES.ANALYSES.ANALYSE analyseResultXml = new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSANALYSES.ANALYSES.ANALYSE();
                    analyseResultXml
                            .setDATE(analyseAp.getAnalyseDate() != null ? SIMPLE_DATE_FORMAT.format(analyseAp.getAnalyseDate()) : null);
                    analyseResultXml.setDESCRIPTION(analyseAp.getDescription());
                    analyseResultXml.setLABORATOIRE(analyseAp.getLaboratory() != null ? analyseAp.getLaboratory().getCode()
                            : StringUtils.EMPTY);
                    analyseResultXml.setTYPEANALYSE(analyseAp.getAnalyseType());
                    analyseResultXml.setRESULTATS(analyseAp.getResult());
                    ciDocument.getCONTENT().getRESULTATSANALYSES().getANALYSES().getANALYSE().add(analyseResultXml);
                }
                final EssayTestAP essayTestAP = essayTestAPDao.findByItemFlow(analyseItemFlow);
                if (essayTestAP != null) {
                    ciDocument.getCONTENT().setRESULTATSTESTS(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSTESTS());
                    ciDocument.getCONTENT().getRESULTATSTESTS()
                            .setTESTS(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSTESTS.TESTS());
                    final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSTESTS.TESTS.TEST testResultXml = new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.RESULTATSTESTS.TESTS.TEST();
                    testResultXml.setDATE(essayTestAP.getTestDate() != null ? SIMPLE_DATE_FORMAT.format(essayTestAP.getTestDate())
                            : null);
                    testResultXml.setRESULTATS(essayTestAP.getResultats());
                    testResultXml.setTYPETEST(essayTestAP.getType());
                    testResultXml.setOBSERVATIONS(essayTestAP.getObsevations());
                    testResultXml.setSTADE(essayTestAP.getStage());
                    testResultXml.setLIEU(essayTestAP.getPlace());
                    testResultXml.setINTERVENANTS(essayTestAP.getContributors());
                    testResultXml.setCULTURE(essayTestAP.getCulture());
                    testResultXml.setCONDITION(essayTestAP.getCondition());
                    testResultXml.setCODEVILLAGE(essayTestAP.getTownCode());
                    ciDocument.getCONTENT().getRESULTATSTESTS().getTESTS().getTEST().add(testResultXml);
                }
            }
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }

            }

        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ ai e_ minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAieMINADER(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AIE_MINADER_REPORT_FIELD = "NUMERO_AIE_MINADER";

        final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AIE_MINADER_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROAIEMINADER(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
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

    /**
     * Convert file to document ae minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
//    public Serializable convertFileToDocumentAeMINADER(final File file, final List<FileItem> fileItemList, final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {
//    }
    /**
     * Convert file to document_ a s_ minader.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAsMINADER(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AS_MINADER_REPORT_FIELD = "NUMERO_AS_MINADER";

        final org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AS_MINADER_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROASMINADER(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ vt p_ minsante.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentVtpMINSANTE(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String VTP_MINESANTE_REPORT_FIELD = "NUMERO_VTP_MINESANTE";

        final org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_169.name().equalsIgnoreCase(flowToExecute.getCode())) {
//			final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(VTP_MINESANTE_REPORT_FIELD,
//					file);
//			if (!Objects.equals(reportNumberFieldValue, null)) {
//				ciDocument.getCONTENT().setNUMEROVTPMINSANTE(reportNumberFieldValue.getValue());
            final String fileName = file.getNumeroDemande() + "_" + file.getReferenceSiat();
            ciDocument.getCONTENT().setNUMEROVTPMINSANTE(fileName);
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument
                    .getCONTENT()
                    .getPIECESJOINTES()
                    .getPIECEJOINTE()
                    .add(new PIECEJOINTE(file.getFileTypeGuce(), fileName
                            + ESBConstants.PDF_FILE_EXTENSION));

//            }
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ vt d_ minsante.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentVtdMINSANTE(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String VTD_MINSANTE_REPORT_FIELD = "NUMERO_VTD_MINSANTE";

        final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(VTD_MINSANTE_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROVTDMINSANTE(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }

        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ a i_ minmidt.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAiMINMIDT(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AI_MINMIDT_REPORT_FIELD = "NUMERO_AI_MINMIDT";

        final org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AI_MINMIDT_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROAIMINMIDT(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
        /* PAYS */
        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSORIGINE().getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE()
                            .getCODEPAYS());
                    countryOfOrigin.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getCODEPAYS());
                    countryOfProvenance.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT()
                    .getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
            if (countryOfDestination != null) {
                file.setCountryOfDestination(countryOfDestination);
            } else {
                countryOfDestination = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    countryOfDestination.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getCODEPAYS());
                    countryOfDestination.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getNOMPAYS());

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ a e_ minmidt.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAeMINMIDT(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String AE_MINMIDT_REPORT_FIELD = "NUMERO_AE_MINMIDT";

        final org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(AE_MINMIDT_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROAEMINMIDT(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }

                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ c p_ minepded.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCpMINEPDED(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String CP_MINEPDED_REPORT_FIELD = "NUMERO_CP_MINEPDED";

        final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(CP_MINEPDED_REPORT_FIELD,
                    file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROCPMINEPDED(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_ a s_ minfof.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAsMINFOF(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document_bsbe_minfof.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentBsbeMINFOF(File file, List<FileItem> fileItemList, List<ItemFlow> itemFlowList, Flow flowToExecute, FlowGuceSiat flowGuceSiat) throws UtilitiesException {
        String BSBE_MINFOF_REPORT_FIELD = "BULLETIN_SPECIFICATION_NUMERO_BULLETIN";
        String BSBE_MINFOF_REGISTRATION_NUMBER_FIELD = "BULLETIN_SPECIFICATION_NUMERO_ENREGISTREMENT";
        String BSB_MINFOF_REPORT_DATE_FIELD = "BULLETIN_SPECIFICATION_DATE";
        org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT();
        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT());
        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce((File) file));
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier((File) file, (Boolean) true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage((String) ((FileItem) file.getFileItemsList().get(0)).getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier((File) file, (Boolean) false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage((String) ((FileItem) file.getFileItemsList().get(0)).getNumEbmsMessage()));
        }
        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            FileFieldValue reportNumberFieldValue = this.fileFieldValueDao.findValueByFileFieldAndFile(BSBE_MINFOF_REPORT_FIELD, file);
            FileFieldValue registrationNumberFieldValue = this.fileFieldValueDao.findValueByFileFieldAndFile(BSBE_MINFOF_REGISTRATION_NUMBER_FIELD, file);
            FileFieldValue registrationDateFieldValue = this.fileFieldValueDao.findValueByFileFieldAndFile(BSB_MINFOF_REPORT_DATE_FIELD, file);
            if (!Objects.equals((Object) reportNumberFieldValue, null) || !Objects.equals((Object) registrationNumberFieldValue, null)) {
                ciDocument.getCONTENT().setBULLETINSPECIFICATION(new org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT.BULLETINSPECIFICATION());
                ciDocument.getCONTENT().getBULLETINSPECIFICATION().setNUMEROBULLETIN(Objects.equals((Object) reportNumberFieldValue, null) ? "" : reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().getBULLETINSPECIFICATION().setNUMEROENREGISTREMENT(Objects.equals((Object) registrationNumberFieldValue, null) ? "" : registrationNumberFieldValue.getValue());
                ciDocument.getCONTENT().getBULLETINSPECIFICATION().setDATE(Objects.equals((Object) registrationDateFieldValue, null) ? SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime()) : registrationDateFieldValue.getValue());
            }
            if (!Objects.equals((Object) reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROBSBEMINFOF(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE().add(new PIECESJOINTES.PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue() + ESBConstants.PDF_FILE_EXTENSION));
            }
        }
        ItemFlowData itemFlowDataToInsert = null;
        if (CollectionUtils.isNotEmpty(itemFlowList) && CollectionUtils.isNotEmpty(itemFlowList.get(0).getItemFlowsDataList())) {
            itemFlowDataToInsert = (ItemFlowData) itemFlowList.get(0).getItemFlowsDataList().get(0);
        }
        ciDocument.getCONTENT().setDECISIONORGANISME(ConverterGuceSiatUtils.generateDecisionOrganisme((Flow) flowToExecute, itemFlowDataToInsert));
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE().setDATE(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S", Locale.ENGLISH).format(Calendar.getInstance().getTime()));
            ciDocument.getCONTENT().getSIGNATAIRE().setLIEU(itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0).getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration().getLabelFr().subSequence(0, 34).toString());
            ciDocument.getCONTENT().getSIGNATAIRE().setNOM(String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender().getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
        }
        return ciDocument;
    }

    /**
     * Convert file to document as mincommerce.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentAsMINCOMMERCE(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT ciDocument = new org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
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
        /* PAYS */
        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSORIGINE().getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE()
                            .getCODEPAYS());
                    countryOfOrigin.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getCODEPAYS());
                    countryOfProvenance.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT()
                    .getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
            if (countryOfDestination != null) {
                file.setCountryOfDestination(countryOfDestination);
            } else {
                countryOfDestination = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    countryOfDestination.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getCODEPAYS());
                    countryOfDestination.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getNOMPAYS());

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
            // Set RT Decision
            ciDocument.getCONTENT().setDECISION(new org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT.CONTENT.DECISION());
            final ItemFlow decisionItemFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    ACCEPT_AP_FLOW_LIST);
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
                                            .setDATEVALIDITE(SIMPLE_DATE_FORMAT.format(DATA_TYPE_DATE_PARSER.parse(itemFlowData.getValue())));
                                }
                            } catch (final ParseException e) {
                                logger.info(Objects.toString(e), e);
                                ciDocument.getCONTENT().getDECISION().setDATEVALIDITE(null);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document co foret minfof.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCoForetMINFOF(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String CO_CITIES_MINFOF_REPORT_FIELD = "NUMERO_CO_CITIES_MINFOF";

        final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT.CONTENT());

        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());

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

        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(
                    CO_CITIES_MINFOF_REPORT_FIELD, file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROCOCITESMINFOF(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

        }

        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert file to document co faune minfof.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentCoFauneMINFOF(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String CO_CITIES_MINFOF_REPORT_FIELD = "NUMERO_CO_CITIES_MINFOF";

        final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT ciDocument = new org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT.CONTENT());

        if (flowGuceSiat != null) {
            ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());

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

        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(
                    CO_CITIES_MINFOF_REPORT_FIELD, file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROCOCITESMINFOF(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

        }

        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }
        if (CollectionUtils.isNotEmpty(flowToExecute.getCopyRecipientsList())
                && Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
                        FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_AP_166.name())
                        .contains(flowToExecute.getCode())) {
            ciDocument.setCONTENT(new org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT.CONTENT());
            final ItemFlow paymentFlow = itemFlowDao.findItemFlowByFileItemAndFlow(itemFlowList.get(0).getFileItem(),
                    FlowCode.valueOf(flowToExecute.getCode()));
            final PaymentData paymentData = paymentDataDao.findPaymentDataByItemFlow(paymentFlow);
            ciDocument.getCONTENT().setPAIEMENT(PaiementGenerator.generatePaiement(paymentData, flowToExecute.getCode()));
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Convert document to file.
     *
     * @param document the document
     * @return the file cct
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCctCT(final DOCUMENT document) throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CCT_CT);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCct.generateFileFieldValueCctCT(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_CT_61.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_CT_93.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final MARCHANDISE marchandise : document.getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCct.generateFileItemFieldValueCctCT(fileItem,
                            fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                // ADD Decisions des articles
                if (marchandise.getDECISIONORGANISME() != null) {
                    final DecisionOrganism decisionOrganism = new DecisionOrganism();
                    decisionOrganism.setCode(marchandise.getDECISIONORGANISME().getCODE());
                    decisionOrganism.setLibelle(marchandise.getDECISIONORGANISME().getLIBELLE());
                    decisionOrganism.setObservation(marchandise.getDECISIONORGANISME().getOBSERVATION());

                    decisionArticles.put(fileItem, decisionOrganism);
                }

                fileItems.add(fileItem);

            }

            file.setFileItemsList(fileItems);
        }

        /* PIECES JOINTES */
        final List<Attachment> attachmentList = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getPIECESJOINTES() != null
                && document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE() != null) {
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }

        return file;
    }

    public void populateContainers(org.guce.siat.jaxb.cct.PVE.DOCUMENT document, File file) {

        if (document.getCONTENT() == null || document.getCONTENT().getCONTENEURS() == null || CollectionUtils.isEmpty(document.getCONTENT().getCONTENEURS().getCONTENEUR())) {
            return;
        }

        List<Container> containersList = dao.findContainersByFile(file);
        if (CollectionUtils.isEmpty(containersList)) {
            File file1 = fileDao.findByNumDossierGuce(file.getNumeroDossier());
            if (file1 != null) {
                containersList = dao.findContainersByFile(file1);
            }
        }
        if (CollectionUtils.isNotEmpty(containersList)) {
            dao.delete(containersList);
        }

        List<org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> conteneurs = document.getCONTENT().getCONTENEURS().getCONTENEUR();
        Set<Container> containersToSave = new HashSet<>();
        Container container;
        for (org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR conteneur : conteneurs) {

            container = new Container();
            String contNumber = conteneur.getNUMERO();

            if (file.getId() != null) {
                container.setFile(file);
            }

            container.setContNumber(contNumber);
            container.setContSeal1(StringUtils.isNotBlank(conteneur.getSCELLE1()) ? conteneur.getSCELLE1() : "-");
            container.setContType(StringUtils.isNotBlank(conteneur.getTYPE()) ? conteneur.getTYPE() : "-");
            container.setContVolume(conteneur.getVOLUME());
            container.setContGrossMass(conteneur.getTONNAGE());
            container.setContMark(StringUtils.isNotBlank(conteneur.getMARQUE()) ? conteneur.getMARQUE() : "-");
            container.setContNumberOfPackages(conteneur.getQUANTITECOLIS() != null ? conteneur.getQUANTITECOLIS().intValue() : null);
            container.setContDenomination(StringUtils.isNotBlank(conteneur.getESSENCE()) ? conteneur.getESSENCE() : "-");

            containersToSave.add(container);
        }

        if (file.getId() == null) {
            file.setContainers(new ArrayList<>(containersToSave));
        } else {
            dao.save(new ArrayList<>(containersToSave));
        }
    }

    private void updateContainers(org.guce.siat.jaxb.cct.PVE.DOCUMENT document, File file) {

        if (document.getCONTENT() == null || document.getCONTENT().getCONTENEURS() == null || CollectionUtils.isEmpty(document.getCONTENT().getCONTENEURS().getCONTENEUR())) {
            return;
        }

        List<org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR> conteneurs = document.getCONTENT().getCONTENEURS().getCONTENEUR();
        List<Container> containers = new ArrayList<>();
        for (org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.CONTENEURS.CONTENEUR conteneur : conteneurs) {

            Container container = dao.findContainerByFileAndNumber(file, conteneur.getNUMERO());

            if (container == null) {
                continue;
            }

            container.setContSeal1(conteneur.getSCELLE1());
            container.setContSeal2(conteneur.getSCELLE2());
            container.setContSeal3(conteneur.getSCELLE2());

            containers.add(container);
        }

        dao.update(containers);
    }

    private void populatePottingPresents(org.guce.siat.jaxb.cct.PVE.DOCUMENT document, File file) {

        if (document.getCONTENT() == null || document.getCONTENT().getPRESENTS() == null || CollectionUtils.isEmpty(document.getCONTENT().getPRESENTS().getPRESENT())) {
            return;
        }

        List<org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.PRESENTS.PRESENT> presents = document.getCONTENT().getPRESENTS().getPRESENT();

        for (org.guce.siat.jaxb.cct.PVE.DOCUMENT.CONTENT.PRESENTS.PRESENT present : presents) {

            PottingPresent pp = new PottingPresent();

            pp.setName(present.getNOM());
            pp.setOrganism(present.getORGANISME());
            pp.setQuality(present.getQUALITE());

            pp.setFile(file);

            commonDao.savePottingPresent(pp);
        }
    }

    /**
     * Convert document to file cc ct.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCcCT(final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT document) throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CC_CT);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCc.generateFileFieldValueCcCT(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_CT_61.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_CT_93.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.cct.CC_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document.getCONTENT()
                    .getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCc.generateFileItemFieldValueCcCT(fileItem,
                            fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                if (marchandise.getDECISIONORGANISME() != null) {
                    final DecisionOrganism decisionOrganism = new DecisionOrganism();
                    decisionOrganism.setCode(marchandise.getDECISIONORGANISME().getCODE());
                    decisionOrganism.setLibelle(marchandise.getDECISIONORGANISME().getLIBELLE());
                    decisionOrganism.setObservation(marchandise.getDECISIONORGANISME().getOBSERVATION());

                    decisionArticles.put(fileItem, decisionOrganism);
                }

                fileItems.add(fileItem);

            }

            file.setFileItemsList(fileItems);
        }

        /* PIECES JOINTES */
        final List<Attachment> attachmentList = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getPIECESJOINTES() != null
                && document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE() != null) {
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;
    }

    /**
     * Convert document to file cq ct.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCqCT(final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CQ_CT);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCq.generateFileFieldValueCqCT(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_CT_61.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_CT_93.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.cct.CQ_CT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document.getCONTENT()
                    .getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCq.generateFileItemFieldValueCqCT(fileItem,
                            fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                if (marchandise.getDECISIONORGANISME() != null) {
                    final DecisionOrganism decisionOrganism = new DecisionOrganism();
                    decisionOrganism.setCode(marchandise.getDECISIONORGANISME().getCODE());
                    decisionOrganism.setLibelle(marchandise.getDECISIONORGANISME().getLIBELLE());
                    decisionOrganism.setObservation(marchandise.getDECISIONORGANISME().getOBSERVATION());

                    decisionArticles.put(fileItem, decisionOrganism);
                }

                fileItems.add(fileItem);

            }

            file.setFileItemsList(fileItems);
        }

        /* PIECES JOINTES */
        final List<Attachment> attachmentList = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getPIECESJOINTES() != null
                && document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE() != null) {
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;
    }

    /**
     * Convert vtm document to file.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileVtMINEPIA(final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT document) throws ParseException,
            ValidationException {
        final File file = new File();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.VT_MINEPIA);
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        // Set file type
        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueVtMINEPIA.generateFileFieldValueVtMINEPIA(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.VT_MINEPIA.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueVtMINEPIA.generateFileItemFieldValueVtMINEPIA(
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

                //final ServicesItem subfamily = null;
                if (marchandise.getCODETARIF() != null && StringUtils.isNotBlank(marchandise.getCODETARIF().getCODENSH())) {
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE()
                    .getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                        && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS());
                    countryOfOrigin.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                        && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS());
                    countryOfProvenance.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }
        return file;
    }

    /**
     * Convert document to file_ v t_ minepded.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileVtMINEPDED(final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.VT_MINEPDED);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueVtMINEPDED.generateFileFieldValueVtMINEPDED(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
            if (client != null) {
                client.setProfession(document.getCONTENT().getCLIENT().getPROFESSION());
                Company newClient = companyDao.save(client);
                file.setClient(newClient);
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.VT_MINEPDED.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueVtMINEPDED.generateFileItemFieldValueVtMINEPDED(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));

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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE()
                    .getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                countryOfOrigin.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS());
                countryOfOrigin.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getNOMPAYS());

                countryDao.save(countryOfOrigin);
                file.setCountryOfOrigin(countryOfOrigin);
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                countryOfProvenance.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS());
                countryOfProvenance.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getNOMPAYS());

                countryDao.save(countryOfProvenance);
                file.setCountryOfProvenance(countryOfProvenance);
            }
        }
        return file;

    }

    /**
     * Convert document to file_ a t_ minepia.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAtMINEPIA(final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AT_MINEPIA);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAtMINEPIA.generateFileFieldValueAtMINEPIA(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AT_MINEPIA.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAtMINEPIA.generateFileItemFieldValueAtMINEPIA(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));

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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE()
                    .getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                        && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS());
                    countryOfOrigin.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                        && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS());
                    countryOfProvenance.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ ai e_ minader.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAieMINADER(final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AIE_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAieMINADER.generateFileFieldValueAieMINADER(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        // Cancel Request Case
        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AIE_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAieMINADER.generateFileItemFieldValueAieMINADER(
                            fileItem, fileItemField, marchandise);
                    if (StringUtils.isNotBlank(fileItemFieldValue.getValue())) {
                        fileItemFieldValues.add(fileItemFieldValue);
                    }

                }
                fileItem.setFileItemFieldValueList(fileItemFieldValues);

                // Cancel Request Case
                if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

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

                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
                    //
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }//

    /**
     * Convert document to file_ e h_ minader.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileEhMINADER(final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.EH_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueEhMINADER.generateFileFieldValueEhMINADER(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.EH_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueEhMINADER.generateFileItemFieldValueEhMINADER(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
                    //					fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ ca t_ minader.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCatMINADER(final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CAT_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCatMINADER.generateFileFieldValueCatMINADER(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.CAT_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCatMINADER.generateFileItemFieldValueCatMINADER(
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

                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));

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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file_ pivpsr p_ minader.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFilePivpsrpMINADER(final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.PIVPSRP_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValuePivpsvpMINADER.generateFileFieldValuePivpsrpMINADER(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.PIVPSRP_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValuePivpsvpMINADER
                            .generateFileItemFieldValuePivpsrpMINADER(fileItem, fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ d i_ minader.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileDiMINADER(final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.DI_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueDiMINADER.generateFileFieldValueDiMINADER(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.DI_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueDiMINADER.generateFileItemFieldValueDiMINADER(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                //
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ a t_ minsante.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAtMINSANTE(final org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AT_MINSANTE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAtMINSANTE.generateFileFieldValueAtMINSANTE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AT_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAtMINSANTE.generateFileItemFieldValueAtMINSANTE(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE()
                    .getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                        && document.getCONTENT().getPROVENANCE().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getCODEPAYS());
                    countryOfOrigin.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null
                && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getPROVENANCE()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getPROVENANCE() != null
                        && document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getCODEPAYS());
                    countryOfProvenance.setCountryName(document.getCONTENT().getPROVENANCE().getPAYSPROVENANCE().getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ ce a_ minmidt.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCeaMINMIDT(final org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CEA_MINMIDT);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCeaMINMIDT.generateFileFieldValueCeaMINMIDT(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.CEA_MINMIDT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCeaMINMIDT.generateFileItemFieldValueCeaMINMIDT(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ a i_ minsante.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAiMINSANTE(final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AI_MINSANTE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAiMINSANTE.generateFileFieldValueAiMINSANTE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AI_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAiMINSANTE.generateFileItemFieldValueAiMINSANTE(
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

                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file_ a s_ minader.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAsMINADER(final org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AS_MINADER);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAsMINADER.generateFileFieldValueAsMINADER(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AS_MINADER.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAsMINADER.generateFileItemFieldValueAsMINADER(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ vt p_ minsante.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileVtpMINSANTE(final org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.VTP_MINSANTE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueVtpMINSANTE.generateFileFieldValueVtpMINSANTE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        // Cancel Request Case
        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.VTP_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueVtpMINSANTE.generateFileItemFieldValueVtpMINSANTE(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ vt d_ minsante.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileVtdMINSANTE(final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.VTD_MINSANTE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueVtdMINSANTE.generateFileFieldValueVtdMINSANTE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.VTD_MINSANTE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueVtdMINSANTE.generateFileItemFieldValueVtdMINSANTE(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ a i_ minmidt.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAiMINMIDT(final org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AI_MINMIDT);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAiMINMIDT.generateFileFieldValueAiMINMIDT(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AI_MINMIDT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAiMINMIDT.generateFileItemFieldValueAiMINMIDT(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file_ a e_ minmidt.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAeMINMIDT(final org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AE_MINMIDT);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAeMINMIDT.generateFileFieldValueAeMINMIDT(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AE_MINMIDT.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAeMINMIDT.generateFileItemFieldValueAeMINMIDT(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file_ c p_ minepded.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCpMINEPDED(final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CP_MINEPDED);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCpMINEPDED.generateFileFieldValueCpMINEPDED(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.CP_MINEPDED.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCpMINEPDED.generateFileItemFieldValueCpMINEPDED(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file_ a s_ minfof.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAsMINFOF(final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AS_MINFOF);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAsMINFOF.generateFileFieldValueAsMINFOF(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.AS_MINFOF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document.getCONTENT()
                    .getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAsMINFOF.generateFileItemFieldValueAsMINFOF(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file as mincommerce.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileAsMINCOMMERCE(final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT document)
            throws ParseException, ValidationException {
        final File file = new File();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.AS_MINCOMMERCE);
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueAsMINCOMMERCE.generateFileFieldValueAsMINCOMMERCE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.monitoring.AS_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();

                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueAsMINCOMMERCE
                            .generateFileItemFieldValueAsMINCOMMERCE(fileItem, fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;
    }

    /**
     * Convert document to file fimex.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileFIMEX(final org.guce.siat.jaxb.monitoring.FIMEX.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.FIMEX);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueFimex.generateFileFieldValueFimex(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

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

        /* ADD CLIENT */
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* PIECES JOINTES */
        final List<Attachment> attachmentList = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getPIECESJOINTES() != null
                && document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE() != null) {
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        // ajouter fileItem fictif pour que le workflow puisse marcher
        final List<FileItem> fileItems = new ArrayList<>();
        final FileItem fileItem = new FileItem();

        if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
            fileItem.setNumEbmsMessage(document.getMESSAGE().getNUMEROMESSAGE());
        }
        fileItem.setLineNumber(0);
        fileItem.setIsFictive(true);
        fileItems.add(fileItem);

        file.setFileItemsList(fileItems);

        return file;

    }

    /**
     * Convert document to file fimexwf.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileFIMEXWF(final org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.FIMEX_WF);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueFimexWF.generateFileFieldValueFimexWf(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* PIECES JOINTES */
        final List<Attachment> attachmentList = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getPIECESJOINTES() != null
                && document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE() != null) {
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                if (pieceJointe.getLIBELLEPJ() != null && pieceJointe.getTYPEPJ() != null) {
                    final Attachment attachment = new Attachment();
                    if (pieceJointe.getLIBELLEPJ() != null) {
                        attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
                    }
                    if (StringUtils.isNotBlank(pieceJointe.getTYPEPJ())) {
                        attachment.setAttachmentType(pieceJointe.getTYPEPJ());
                    } else {
                        throw new ValidationException(ExceptionConstants.ATTACHEMENT);
                    }

                    attachmentList.add(attachment);
                    file.setAttachmentsList(attachmentList);
                }
            }
        }

        /* ADD DECISION ORGANISM POUR DOSSIER */
        if (document.getCONTENT() != null && document.getCONTENT().getDECISIONORGANISME() != null) {
            final DecisionOrganism decisionOrganism = new DecisionOrganism();
            decisionOrganism.setCode(document.getCONTENT().getDECISIONORGANISME().getCODE());
            decisionOrganism.setLibelle(document.getCONTENT().getDECISIONORGANISME().getLIBELLE());
            decisionOrganism.setObservation(document.getCONTENT().getDECISIONORGANISME().getOBSERVATION());

            decisionDossier.put(file, decisionOrganism);
        }

        // ajouter fileItem fictif pour que le workflow puisse marcher
        /*
		 * final List<FileItem> fileItems = new ArrayList<FileItem>(); final FileItem fileItem = new FileItem();
		 *
		 * if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
		 * fileItem.setNumEbmsMessage(document.getMESSAGE().getNUMEROMESSAGE()); } fileItem.setLineNumber(0);
		 * fileItem.setIsFictive(true); fileItems.add(fileItem);
		 *
		 * file.setFileItemsList(fileItems);
         */

 /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueFimexWF.generateFileItemFieldValueFimexWF(
                            fileItem, fileItemField, marchandise);
                    if (StringUtils.isNotBlank(fileItemFieldValue.getValue())) {
                        fileItemFieldValues.add(fileItemFieldValue);
                    }
                }
                fileItem.setFileItemFieldValueList(fileItemFieldValues);
                if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
                    fileItem.setNumEbmsMessage(document.getMESSAGE().getNUMEROMESSAGE());
                }
                fileItem.setLineNumber(0);
                fileItem.setIsFictive(false);
                fileItems.add(fileItem);

            }

        } else {

            final FileItem fileItem = new FileItem();

            if (document.getMESSAGE() != null && document.getMESSAGE().getNUMEROMESSAGE() != null) {
                fileItem.setNumEbmsMessage(document.getMESSAGE().getNUMEROMESSAGE());
            }
            fileItem.setLineNumber(0);
            fileItem.setIsFictive(true);
            fileItems.add(fileItem);
        }
        file.setFileItemsList(fileItems);

        return file;

    }

    /**
     * Convert document to file idi.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileIDI(final org.guce.siat.jaxb.monitoring.IDI.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.IDI);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueIDI.generateFileFieldValueIdi(file, fileField, document,
                    applicationPropretiesService);

            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

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

        /* ADD CLIENT */
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.monitoring.IDI.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueIDI.generateFileItemFieldValueIdi(fileItem,
                            fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file ide.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileIDE(final org.guce.siat.jaxb.monitoring.IDE.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.IDE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueIDE.generateFileFieldValueIde(file, fileField, document,
                    applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

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

        /* ADD CLIENT */
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.monitoring.IDE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueIDE.generateFileItemFieldValueIde(fileItem,
                            fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
            for (final PIECEJOINTE pieceJointe : document.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()) {
                final Attachment attachment = new Attachment();
                if (pieceJointe.getLIBELLEPJ() != null) {
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }

        return file;

    }

    /**
     * Convert document to file di mincommerce.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileDiMINCOMMERCE(final org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.DI_MINCOMMERCE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueDiMINCOMMERCE.generateFileFieldValueDiMINCOMMERCE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.monitoring.DI_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueDiMINCOMMERCE
                            .generateFileItemFieldValueDiMINCOMMERCE(fileItem, fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file de mincommerce.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileDeMINCOMMERCE(final org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.DE_MINCOMMERCE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueDeMINCOMMERCE.generateFileFieldValueDeMINCOMMERCE(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.monitoring.DE_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueDeMINCOMMERCE
                            .generateFileItemFieldValueDeMINCOMMERCE(fileItem, fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file co foret minfof.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCoForetMINFOF(final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CO_MINFOF_FORET);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCoForetMINFOF.generateFileFieldValueCoForetMINFOF(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.CO_MINFOF_FORET.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCoForetMINFOF
                            .generateFileItemFieldValueCoForetMINFOF(fileItem, fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));

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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file co faune minfof.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileCoFauneMINFOF(final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT document)
            throws ParseException, ValidationException {

        final File file = new File();
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.CO_MINFOF_FAUNE);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueCoFauneMINFOF.generateFileFieldValueCoFauneMINFOF(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
            }

        } else if (FlowCode.FL_AP_166.name().equals(flowGuceSiat.getFlowSiat())) {

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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.ap.CO_MINFOF_FAUNE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {

                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueCoFauneMINFOF
                            .generateFileItemFieldValueCoFauneMINFOF(fileItem, fileItemField, marchandise);
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }
        /* PAYS */
        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES()
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

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        return file;

    }

    /**
     * Convert document to file lvtb minfof.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileLvtbMINFOF(final org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.LVTB_MINFOF);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueLvtbMINFOF.generateFileFieldValueLvtbMINFOF(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }
        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.ap.LVTB_MINFOF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueLvtbMINFOF.generateFileItemFieldValueLvtbMINFOF(
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
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert document to file bsbe minfof.
     *
     * @param document the document
     * @return the file
     * @throws ParseException the parse exception
     * @throws ValidationException the validation exception
     */
    public File convertDocumentToFileBsbeMINFOF(final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT document) throws ParseException,
            ValidationException {

        final File file = new File();

        final List<FileFieldValue> fileFieldValues = new ArrayList<>();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.BSBE_MINFOF);
        file.setFileType(fileType);

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueBsbeMINFOF.generateFileFieldValueBsbeMINFOF(file, fileField,
                    document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }
        file.setFileFieldValueList(fileFieldValues);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                    }
                    if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                            && document.getCONTENT().getCLIENT().getADRESSE() != null
                            && document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE() != null
                            && document.getCONTENT().getCLIENT().getADRESSE().getPAYSADRESSE().getCODEPAYS() != null) {
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }
        if (document.getCONTENT() != null && document.getCONTENT().getLISTEDESSPECIFICATIONS() != null && document.getCONTENT().getLISTEDESSPECIFICATIONS().getSPECIFICATION() != null) {
            woodSpecificationDao.removeByFile(file);
            woodSpecifications = new ArrayList<>();
            for (org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT.LISTEDESSPECIFICATIONS.SPECIFICATION specification : document.getCONTENT().getLISTEDESSPECIFICATIONS().getSPECIFICATION()) {
                WoodSpecification newSpec = new WoodSpecification();
                newSpec.setFile(file);
                newSpec.setDiamGrosBout(specification.getDIAMETREGROSBOUT() == null ? null : Integer.parseInt(specification.getDIAMETREGROSBOUT()));
                newSpec.setDiamMoyen(specification.getDIAMETREMOYENGENERAL() == null ? null : Integer.parseInt(specification.getDIAMETREMOYENGENERAL()));
                newSpec.setDiamPetitBout(specification.getDIAMETREPETITBOUT() == null ? null : Integer.parseInt(specification.getDIAMETREPETITBOUT()));
                newSpec.setEpaisseur(specification.getEPAISSEUR() == null ? null : Integer.parseInt(specification.getEPAISSEUR()));
                newSpec.setLongueurGrume(specification.getLONGUEURGRUME() == null ? null : new BigDecimal(specification.getLONGUEURGRUME()));
                newSpec.setLargeur(specification.getLARGEUR() == null ? null : new BigDecimal(specification.getLARGEUR()));
                newSpec.setLineNumber(specification.getLINENUMBER());
                newSpec.setFournisseur(specification.getFOURNISSEUR());
                newSpec.setWoodSpecies(specification.getESSENCE());
                newSpec.setNumMarqueGrume(specification.getNUMEROMARQUEGRUME());
                newSpec.setNumColis(specification.getNUMEROCOLIS());
                newSpec.setNbrePieces(specification.getNOMBREPIECES() == null ? null : Integer.parseInt(specification.getNOMBREPIECES()));
                newSpec.setObservations(specification.getOBSERVATIONS());
                newSpec.setVolume(specification.getVOLUME() == null ? null : new BigDecimal(specification.getVOLUME()));
                this.woodSpecifications.add(newSpec);
            }
        }
        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {
            for (final org.guce.siat.jaxb.ap.BSBE_MINFOF.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();
                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueBsbeMINFOF.generateFileItemFieldValueBsbeMINFOF(
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
                if (marchandise.getCODETARIF() != null && StringUtils.isNotBlank(marchandise.getCODETARIF().getCODENSH())) {
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

        if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = this.countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
            if (countryOfDestination != null) {
                file.setCountryOfDestination(countryOfDestination);
            } else {
                countryOfDestination = new Country();
                if (document.getCONTENT() != null && document.getCONTENT().getINFORMATIONSGENERALES() != null && document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    countryOfDestination.setCountryIdAlpha2(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
                    countryOfDestination.setCountryName(document.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getNOMPAYS());
                    countryDao.save(countryOfDestination);
                    file.setCountryOfDestination(countryOfDestination);
                }
            }
        }

        if (document.getCONTENT() != null && document.getCONTENT().getDECISIONORGANISME() != null) {
            final DecisionOrganism decisionOrganism = new DecisionOrganism();
            decisionOrganism.setCode(document.getCONTENT().getDECISIONORGANISME().getCODE());
            decisionOrganism.setLibelle(document.getCONTENT().getDECISIONORGANISME().getLIBELLE());
            decisionOrganism.setObservation(document.getCONTENT().getDECISIONORGANISME().getOBSERVATION());

            decisionDossier.put(file, decisionOrganism);
        }

        return file;

    }

    /**
     * Convert file to document fimexwf.
     *
     * @param file the file
     * @param fileItemList the file item list
     * @param itemFlowList the item flow list
     * @param flowToExecute the flow to execute
     * @param flowGuceSiat the flow guce siat
     * @return the serializable
     * @throws UtilitiesException the utilities exception
     */
    public Serializable convertFileToDocumentFIMEXWF(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {
        //REPORT REPORT FIELD NAME
        final String FIMEX_REPORT_FIELD = "NUMERO_FIMEX";
        final org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT ciDocument = new org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }
        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            ciDocument.getCONTENT().setNUMEROFIMEX(file.getNumeroDossier());
            ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
            ciDocument.getCONTENT().getPIECESJOINTES().getPIECEJOINTE()
                    .add(new PIECEJOINTE(file.getFileTypeGuce(), file.getNumeroDossier() + ESBConstants.PDF_FILE_EXTENSION));

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
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.monitoring.FIMEX_WF.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());
        }
        // ****************************************************************//
        return ciDocument;
    }

    /**
     * Notification email.
     *
     * @param file the file
     * @param firstFlow the first flow
     */
    public void notificationEmail(final File file, final Flow firstFlow) {

        final Map<String, String> map = new HashMap<>();

        if (file.getAssignedUser() != null && firstFlow.getToStep() != null) {
            final User usr = file.getAssignedUser();

            if ("FR".equals(usr.getPreferedLanguage())) {
                map.put(MailConstants.SUBJECT, "SIAT : Notification de réception d'un dossier");
                map.put(MailConstants.VMF, EMAIL_BODY_NOTIFICATION_FR);
            } else if ("EN".equals(usr.getPreferedLanguage())) {
                map.put(MailConstants.SUBJECT, "SIAT : Notification of receipt of a folder");
                map.put(MailConstants.VMF, EMAIL_BODY_NOTIFICATION_EN);
            }

            map.put("firstName", usr.getFirstName());
            map.put(MailConstants.FROM, mailService.getFromValue());
            map.put(MailConstants.EMAIL, usr.getEmail());
            map.put("referenceSiat", file.getReferenceSiat());

            mailService.sendMail(map);

        } else if (file.getBureau() != null && firstFlow.getToStep() != null) {

            final Administration administration = administrationDao.find(file.getBureau().getId());
            final List<Administration> adminList = new ArrayList<>();
            adminList.add(administration);

            // get the bureaus for the administration of the logged user and
            // their delegator users
            final List<Bureau> bureauList = SiatUtils.findCombinedBureausByAdministrationList(adminList);

            final List<User> users = userDao.findByStepAndFileTypeAndAdministration(firstFlow.getToStep().getId(), file
                    .getFileType().getId(), bureauList);

            for (final User usr : users) {

                if ("FR".equals(usr.getPreferedLanguage())) {
                    map.put(MailConstants.SUBJECT, "SIAT : Notification de réception d'un dossier");
                    map.put(MailConstants.VMF, EMAIL_BODY_NOTIFICATION_FR);
                } else if ("EN".equals(usr.getPreferedLanguage())) {
                    map.put(MailConstants.SUBJECT, "SIAT : Notification of receipt of a folder");
                    map.put(MailConstants.VMF, EMAIL_BODY_NOTIFICATION_EN);
                }

                map.put("firstName", usr.getFirstName());
                map.put(MailConstants.FROM, mailService.getFromValue());
                map.put(MailConstants.EMAIL, usr.getEmail());
                map.put("referenceSiat", file.getReferenceSiat());

                mailService.sendMail(map);

            }

        }

    }

    /**
     * Gets the administration dao.
     *
     * @return the administration dao
     */
    public AdministrationDao getAdministrationDao() {
        return administrationDao;
    }

    /**
     * Sets the administration dao.
     *
     * @param administrationDao the new administration dao
     */
    public void setAdministrationDao(final AdministrationDao administrationDao) {
        this.administrationDao = administrationDao;
    }

    /**
     * Gets the mail service.
     *
     * @return the mail service
     */
    public MailService getMailService() {
        return mailService;
    }

    /**
     * Sets the mail service.
     *
     * @param mailService the new mail service
     */
    public void setMailService(final MailService mailService) {
        this.mailService = mailService;
    }

    /**
     * Gets the item dao.
     *
     * @return the item dao
     */
    public ItemDao getItemDao() {
        return itemDao;
    }

    /**
     * Sets the item dao.
     *
     * @param itemDao the new item dao
     */
    public void setItemDao(final ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public Serializable convertFileToDocumentIrmpMINCOMMERCE(final File file, final List<FileItem> fileItemList,
            final List<ItemFlow> itemFlowList, final Flow flowToExecute, final FlowGuceSiat flowGuceSiat) throws UtilitiesException {

        final String IRMP_MINCOMMERCE_REPORT_FIELD = "NUMERO_AAM_MINCOMMERCE";
        final org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT ciDocument = new org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT();

        ciDocument.setCONTENT(new org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT.CONTENT());

        ciDocument.setTYPEDOCUMENT(flowGuceSiat.getFlowGuce());
        // ROUTAGE
        ciDocument.setROUTAGE(ConverterGuceSiatUtils.generateRoutageSiatToGuce(file));

        // REFERENCE DOSSIER
        if (FlowCode.FL_AP_152.name().equals(flowToExecute.getCode()) || FlowCode.FL_AP_151.name().equals(flowToExecute.getCode())) {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, true));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0)
                    .getNumEbmsMessageAnnulation()));
        } else {
            ciDocument.setREFERENCEDOSSIER(ConverterGuceSiatUtils.generateReferenceDossier(file, false));
            ciDocument.setMESSAGE(ConverterGuceSiatUtils.generateMessage(file.getFileItemsList().get(0).getNumEbmsMessage()));
        }

        if (FlowCode.FL_AP_107.name().equals(flowToExecute.getCode())) {
            final FileFieldValue reportNumberFieldValue = fileFieldValueDao.findValueByFileFieldAndFile(
                    IRMP_MINCOMMERCE_REPORT_FIELD, file);
            if (!Objects.equals(reportNumberFieldValue, null)) {
                ciDocument.getCONTENT().setNUMEROAAMMINCOMMERCE(reportNumberFieldValue.getValue());
                ciDocument.getCONTENT().setPIECESJOINTES(new PIECESJOINTES());
                ciDocument
                        .getCONTENT()
                        .getPIECESJOINTES()
                        .getPIECEJOINTE()
                        .add(new PIECEJOINTE(file.getFileTypeGuce(), reportNumberFieldValue.getValue()
                                + ESBConstants.PDF_FILE_EXTENSION));

            }

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
        /* PAYS */
        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getCODEPAYS() != null) {
            Country countryOfOrigin = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSORIGINE().getCODEPAYS());
            if (countryOfOrigin != null) {
                file.setCountryOfOrigin(countryOfOrigin);
            } else {
                countryOfOrigin = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE() != null) {
                    countryOfOrigin.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE()
                            .getCODEPAYS());
                    countryOfOrigin.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSORIGINE().getNOMPAYS());

                    countryDao.save(countryOfOrigin);
                    file.setCountryOfOrigin(countryOfOrigin);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE().getCODEPAYS() != null) {
            Country countryOfProvenance = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES()
                    .getPAYSPROVENANCE().getCODEPAYS());
            if (countryOfProvenance != null) {
                file.setCountryOfProvenance(countryOfProvenance);
            } else {
                countryOfProvenance = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE() != null) {
                    countryOfProvenance.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getCODEPAYS());
                    countryOfProvenance.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSPROVENANCE()
                            .getNOMPAYS());

                    countryDao.save(countryOfProvenance);
                    file.setCountryOfProvenance(countryOfProvenance);
                }
            }
        }

        if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null
                && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS() != null) {
            Country countryOfDestination = countryDao.findCountryByCountryIdAlpha2(ciDocument.getCONTENT()
                    .getINFORMATIONSGENERALES().getPAYSDESTINATION().getCODEPAYS());
            if (countryOfDestination != null) {
                file.setCountryOfDestination(countryOfDestination);
            } else {
                countryOfDestination = new Country();
                if (ciDocument.getCONTENT() != null && ciDocument.getCONTENT().getINFORMATIONSGENERALES() != null
                        && ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION() != null) {
                    countryOfDestination.setCountryIdAlpha2(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getCODEPAYS());
                    countryOfDestination.setCountryName(ciDocument.getCONTENT().getINFORMATIONSGENERALES().getPAYSDESTINATION()
                            .getNOMPAYS());

                    countryDao.save(countryOfDestination);
                    file.setCountryOfProvenance(countryOfDestination);
                }
            }
        }
        // ******* AJOUT SIGNATAIRE AUX FLUX DONT toStep IS FINAL *********///
        if (flowToExecute.getToStep() != null && BooleanUtils.isTrue(flowToExecute.getToStep().getIsFinal())) {
            ciDocument.getCONTENT().setSIGNATAIRE(new org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT.CONTENT.SIGNATAIRE());
            ciDocument.getCONTENT().getSIGNATAIRE()
                    .setDATE(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setLIEU(
                            itemFlowList.get(0).getSender().getAdministration().getLabelFr().length() <= 35 ? itemFlowList.get(0)
                            .getSender().getAdministration().getLabelFr() : itemFlowList.get(0).getSender().getAdministration()
                                    .getLabelFr().subSequence(0, 34).toString());
            ciDocument
                    .getCONTENT()
                    .getSIGNATAIRE()
                    .setNOM(
                            String.format("%s %s", itemFlowList.get(0).getSender().getFirstName(), itemFlowList.get(0).getSender()
                                    .getLastName()));
            ciDocument.getCONTENT().getSIGNATAIRE().setQUALITE(itemFlowList.get(0).getSender().getPosition().getCode());

        }
        // ****************************************************************//
        return ciDocument;
    }

    public File convertDocumentToFileIrmpMINCOMMERCE(final org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT document)
            throws ParseException, ValidationException {
        final File file = new File();
        final FileType fileType = fileTypeDao.findByCode(FileTypeCode.IRMP_MINCOMMERCE);
        final List<FileFieldValue> fileFieldValues = new ArrayList<>();

        for (final FileField fileField : fileType.getFileFieldList()) {
            final FileFieldValue fileFieldValue = FileFieldValueIrmpMINCOMMERCE.generateFileFieldValueIrmpMINCOMMERCE(file, fileField, document, applicationPropretiesService);
            if (StringUtils.isNotBlank(fileFieldValue.getValue())) {
                fileFieldValues.add(fileFieldValue);
            }
        }

        file.setFileFieldValueList(fileFieldValues);
        file.setFileType(fileType);

        if (FlowCode.FL_AP_147.name().equals(flowGuceSiat.getFlowSiat())) {

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getREFERENCEGUCE() != null) {
                file.setReferenceGuceAnnulation(document.getREFERENCEDOSSIER().getREFERENCEGUCE());
            }

            if (document.getREFERENCEDOSSIER() != null && document.getREFERENCEDOSSIER().getSERVICE() != null) {
                file.setFileTypeGuceAnnulation(document.getREFERENCEDOSSIER().getSERVICE());
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
        if (document.getCONTENT() != null && document.getCONTENT().getCLIENT() != null
                && document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE() != null) {
            Company client = companyDao.findCompanyByNumContribuable(document.getCONTENT().getCLIENT().getNUMEROCONTRIBUABLE());
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
                        Country country = countryDao.findCountryByCountryIdAlpha2(document.getCONTENT().getCLIENT().getADRESSE()
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
                                countryDao.save(country);
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
                companyDao.save(client);
                file.setClient(client);
            }
        }

        /* MARCHANDISES */
        final List<FileItem> fileItems = new ArrayList<>();
        if (document.getCONTENT() != null && document.getCONTENT().getMARCHANDISES() != null
                && document.getCONTENT().getMARCHANDISES().getMARCHANDISE() != null) {

            for (final org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise : document
                    .getCONTENT().getMARCHANDISES().getMARCHANDISE()) {
                final FileItem fileItem = new FileItem();
                final List<FileItemFieldValue> fileItemFieldValues = new ArrayList<>();

                for (final FileItemField fileItemField : fileType.getFileItemFieldList()) {
                    final FileItemFieldValue fileItemFieldValue = FileItemFieldValueIrmpMINCOMMERCE.generateFileItemFieldValueIrmpMINCOMMERCE(fileItem, fileItemField, marchandise);
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

                if (marchandise.getCODETARIF() != null && StringUtils.isNotBlank(marchandise.getCODETARIF().getCODENSH())) {
                    fileItem.setNsh(itemDao.findByGoodsItemCode(marchandise.getCODETARIF().getCODENSH()));
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
                    attachment.setDocumentName(pieceJointe.getLIBELLEPJ().trim());
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

            decisionDossier.put(file, decisionOrganism);
        }

        return file;
    }

    public ApplicationPropretiesService getApplicationPropretiesService() {
        return applicationPropretiesService;
    }

    public CotationService getCotationService() {
        return cotationService;
    }

    public CommonDao getCommonDao() {
        return commonDao;
    }

    public PottingReportDao getPottingReportDao() {
        return pottingReportDao;
    }

    public CoreDao getDao() {
        return dao;
    }

    public FileDao getFileDao() {
        return fileDao;
    }

    public FileTypeDao getFileTypeDao() {
        return fileTypeDao;
    }

    public DataTypeDao getDataTypeDao() {
        return dataTypeDao;
    }

    public ServicesItemDao getServicesItemDao() {
        return servicesItemDao;
    }

    public ServiceDao getServiceDao() {
        return serviceDao;
    }

    public FileItemDao getFileItemDao() {
        return fileItemDao;
    }

    public GuceSiatBureauDao getGuceSiatBureauDao() {
        return guceSiatBureauDao;
    }

    public BureauDao getBureauDao() {
        return bureauDao;
    }

    public FlowDao getFlowDao() {
        return flowDao;
    }

    public FileFieldDao getFileFieldDao() {
        return fileFieldDao;
    }

    public FileFieldValueDao getFileFieldValueDao() {
        return fileFieldValueDao;
    }

    public FileItemFieldValueDao getFileItemFieldValueDao() {
        return fileItemFieldValueDao;
    }

    public ItemFlowDao getItemFlowDao() {
        return itemFlowDao;
    }

    public PaymentDataDao getPaymentDataDao() {
        return paymentDataDao;
    }

    public EssayTestAPDao getEssayTestAPDao() {
        return essayTestAPDao;
    }

    public AnalyseResultApDao getAnalyseResultApDao() {
        return analyseResultApDao;
    }

    public AttachmentDao getAttachmentDao() {
        return attachmentDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public FlowGuceSiatDao getFlowGuceSiatDao() {
        return flowGuceSiatDao;
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public CountryDao getCountryDao() {
        return countryDao;
    }

    public ItemFlowDataDao getItemFlowDataDao() {
        return itemFlowDataDao;
    }

    public AppointmentService getAppointmentService() {
        return appointmentService;
    }

    public AnalyseOrderDao getAnalyseOrderDao() {
        return analyseOrderDao;
    }

    public TreatmentOrderDao getTreatmentOrderDao() {
        return treatmentOrderDao;
    }

    public WoodSpecificationDao getWoodSpecificationDao() {
        return woodSpecificationDao;
    }

    public FileMarshallDao getFileMarshallDao() {
        return fileMarshallDao;
    }

    public FlowGuceSiat getFlowGuceSiat() {
        return flowGuceSiat;
    }

    public GuceSiatBureau getGuceSiatBureau() {
        return guceSiatBureau;
    }

    public String getRefSiat() {
        return refSiat;
    }

    public String getNumDossier() {
        return numDossier;
    }

    public String getNumEbmsMessage() {
        return numEbmsMessage;
    }

    public AlfrescoDirectoryCreator getAlfrescoDirectoryCreator() {
        return alfrescoDirectoryCreator;
    }

    public TreatmentInfosDao getTreatmentInfosDao() {
        return treatmentInfosDao;
    }

    public TreatmentResultDao getTreatmentResultDao() {
        return treatmentResultDao;
    }

    public InspectionReportDao getInspectionReportDao() {
        return inspectionReportDao;
    }

    public Map<File, DecisionOrganism> getDecisionDossier() {
        return decisionDossier;
    }

    public Map<FileItem, DecisionOrganism> getDecisionArticles() {
        return decisionArticles;
    }

    public DecisionHistoryDao getDecisionHistoryDao() {
        return decisionHistoryDao;
    }

    public User getDeclarant() {
        return declarant;
    }

    public List<WoodSpecification> getWoodSpecifications() {
        return woodSpecifications;
    }

    public void setFlowGuceSiat(FlowGuceSiat flowGuceSiat) {
        this.flowGuceSiat = flowGuceSiat;
    }

    public void setGuceSiatBureau(GuceSiatBureau guceSiatBureau) {
        this.guceSiatBureau = guceSiatBureau;
    }

    public void setRefSiat(String refSiat) {
        this.refSiat = refSiat;
    }

    public void setNumDossier(String numDossier) {
        this.numDossier = numDossier;
    }

    public void setNumEbmsMessage(String numEbmsMessage) {
        this.numEbmsMessage = numEbmsMessage;
    }

    public AppointmentDao getAppointmentDao() {
        return appointmentDao;
    }

    public void setDao(CoreDao dao) {
        this.dao = dao;
    }

}

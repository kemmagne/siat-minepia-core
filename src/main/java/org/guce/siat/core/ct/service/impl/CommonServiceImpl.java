package org.guce.siat.core.ct.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.chemistry.opencmis.commons.exceptions.CmisObjectNotFoundException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Transformer;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.dao.AppointmentDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.dao.ItemFlowDataDao;
import org.guce.siat.common.dao.UserAuthorityFileTypeDao;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.AppointmentItemFlow;
import org.guce.siat.common.model.AppointmentItemFlowId;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.FlowService;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.SiatUtils;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.common.utils.ged.CmisSession;
import org.guce.siat.common.utils.ged.CmisUtils;
import org.guce.siat.core.ct.dao.AnalyseOrderDao;
import org.guce.siat.core.ct.dao.AnalysePartDao;
import org.guce.siat.core.ct.dao.AnalyseResultApDao;
import org.guce.siat.core.ct.dao.AnalyseResultDao;
import org.guce.siat.core.ct.dao.ApprovedDecisionDao;
import org.guce.siat.core.ct.dao.CommonDao;
import org.guce.siat.core.ct.dao.EssayTestAPDao;
import org.guce.siat.core.ct.dao.InspectionControllerDao;
import org.guce.siat.core.ct.dao.InspectionReportDao;
import org.guce.siat.core.ct.dao.InterceptionNotificationDao;
import org.guce.siat.core.ct.dao.PaymentDataDao;
import org.guce.siat.core.ct.dao.SampleDao;
import org.guce.siat.core.ct.dao.TreatmentInfosDao;
import org.guce.siat.core.ct.dao.TreatmentOrderDao;
import org.guce.siat.core.ct.dao.TreatmentPartDao;
import org.guce.siat.core.ct.dao.TreatmentResultDao;
import org.guce.siat.core.ct.filter.CteFilter;
import org.guce.siat.core.ct.filter.Filter;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.AnalysePart;
import org.guce.siat.core.ct.model.AnalyseResult;
import org.guce.siat.core.ct.model.AnalyseResultAp;
import org.guce.siat.core.ct.model.ApprovedDecision;
import org.guce.siat.core.ct.model.EssayTestAP;
import org.guce.siat.core.ct.model.InspectionController;
import org.guce.siat.core.ct.model.InspectionReport;
import org.guce.siat.core.ct.model.InterceptionNotification;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PaymentItemFlow;
import org.guce.siat.core.ct.model.Sample;
import org.guce.siat.core.ct.model.TreatmentInfos;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.guce.siat.core.ct.model.TreatmentPart;
import org.guce.siat.core.ct.model.TreatmentResult;
import org.guce.siat.core.ct.service.CommonService;
import org.guce.siat.core.ct.util.quota.QuotaDto;
import org.guce.siat.core.utils.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class CommonServiceImpl.
 */
@Service("commonService")
@Transactional
@PropertySources(value = @PropertySource("classpath:global-config.properties"))
public class CommonServiceImpl extends AbstractServiceImpl<ItemFlow> implements CommonService {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CommonServiceImpl.class);

    /**
     * The item flow dao.
     */
    @Autowired
    private ItemFlowDao itemFlowDao;

    /**
     * The file item dao.
     */
    @Autowired
    private FileItemDao fileItemDao;

    /**
     * The inspection report dao.
     */
    @Autowired
    private InspectionReportDao inspectionReportDao;

    /**
     * The appointment dao.
     */
    @Autowired
    private AppointmentDao appointmentDao;

    /**
     * The item flow data dao.
     */
    @Autowired
    private ItemFlowDataDao itemFlowDataDao;

    /**
     * The analyse result ap dao.
     */
    @Autowired
    private AnalyseResultApDao analyseResultApDao;

    /**
     * The essay test ap dao.
     */
    @Autowired
    private EssayTestAPDao essayTestAPDao;

    /**
     * The analyse order dao.
     */
    @Autowired
    private AnalyseOrderDao analyseOrderDao;

    @Autowired
    private SampleDao sampleDao;

    /**
     * The treatment result dao.
     */
    @Autowired
    private TreatmentResultDao treatmentResultDao;
    /**
     * The analyse part dao.
     */
    @Autowired
    private AnalysePartDao analysePartDao;

    /**
     * The treatment order dao.
     */
    @Autowired
    private TreatmentOrderDao treatmentOrderDao;

    /**
     * The treatment part dao.
     */
    @Autowired
    private TreatmentPartDao treatmentPartDao;

    /**
     * The analyse result dao.
     */
    @Autowired
    private AnalyseResultDao analyseResultDao;

    /**
     * The inspection controller dao.
     */
    @Autowired
    private InspectionControllerDao inspectionControllerDao;

    /**
     * The common dao.
     */
    @Autowired
    private CommonDao commonDao;

    /**
     * The user authority file type dao.
     */
    @Autowired
    private UserAuthorityFileTypeDao userAuthorityFileTypeDao;

    /**
     * The payment data dao.
     */
    @Autowired
    private PaymentDataDao paymentDataDao;

    /**
     * The flow service.
     */
    @Autowired
    private FlowService flowService;

    @Autowired
    private TreatmentInfosDao treatmentInfosDao;

    @Autowired
    private ApprovedDecisionDao approvedDecisionDao;

    @Autowired
    private InterceptionNotificationDao interceptionNotificationDao;

    /**
     * The directory.
     */
    private static final String GED_DIRECTORY = "/siat";

    /**
     * Instantiates a new common service impl.
     */
    public CommonServiceImpl() {
        super();
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<ItemFlow> getJpaDao() {
        return itemFlowDao;
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<ItemFlow> jpaDao) {
        this.itemFlowDao = (ItemFlowDao) jpaDao;
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#sendAttachedReports(java.util.List)
     */
    @Override
    public void sendAttachedReports(final List<File> attachments) {
        LOG.info("Rapport d'analyse : {} name :{} ", attachments.get(0).getAbsolutePath(), attachments.get(0).getName());
        try {
            CmisUtils.sendDocument(attachments, CmisSession.getInstance(), GED_DIRECTORY);
        } catch (IOException | CmisObjectNotFoundException e) {
            LOG.error(Objects.toString(e), e);
        }
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#deleteAttachedReports(java.util.List)
     */
    @Override
    public void deleteAttachedReports(final List<String> attachments) {
        try {
            if (CollectionUtils.isNotEmpty(attachments)) {
                CmisUtils.deleteDocument(attachments, CmisSession.getInstance(), GED_DIRECTORY);
            }
        } catch (final CmisObjectNotFoundException e) {
            LOG.error(Objects.toString(e), e);
        }
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveInspectionReports(java.util.List,
	 * java.util.List)
     */
    @Override
    @Transactional
    public void takeDecisionAndSaveInspectionReports(final List<InspectionReport> reports, final List<ItemFlow> itemFlowsToAdd) {

        final List<FileItem> fileItemList = new ArrayList<>();
        final List<InspectionReport> irsToSave = new ArrayList<>();

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            @SuppressWarnings("unchecked")
            final List<InspectionReport> inspectionReports = (List<InspectionReport>) CollectionUtils.select(reports, new Predicate() {
                @Override
                public boolean evaluate(final Object object) {
                    return ((InspectionReport) object).getFileItem() != null
                            && ((InspectionReport) object).getFileItem().getId().equals(itemFlow.getFileItem().getId());
                }
            });
            InspectionReport inspectionReport = null;
            if (CollectionUtils.isNotEmpty(inspectionReports)) {
                inspectionReport = inspectionReports.get(0);
            }
            if (inspectionReport == null && CollectionUtils.isNotEmpty(reports)) {
                inspectionReport = reports.get(0);
            }
            if (inspectionReport == null) {
                return;
            }

            inspectionReport.setItemFlow(itemFlow);
            inspectionReport.setFileItem(itemFlow.getFileItem());

            inspectionReportDao.save(inspectionReport);

            // Set draft = true to be updated
            final FileItem item = itemFlow.getFileItem();
            item.setDraft(Boolean.TRUE);
            fileItemList.add(item);
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }

    /**
     *
     * @param report
     * @param itemFlowsToAdd
     * @throws Exception
     *
     * @see
     * org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveInspectionReport(org.guce.siat.core.ct.model.InspectionReport,
     * java.util.List)
     */
    @Override
    @Transactional
    public void takeDecisionAndSaveInspectionReport(final InspectionReport report, final List<ItemFlow> itemFlowsToAdd) throws Exception {

        final List<FileItem> fileItemList = new ArrayList<>();

        for (final ItemFlow itemFlow : itemFlowsToAdd) {

            itemFlowDao.save(itemFlow);

            final InspectionReport ir = CommonUtils.clone(report);

            ir.setItemFlow(itemFlow);
            ir.setFileItem(itemFlow.getFileItem());
            inspectionReportDao.save(ir);

            // Set draft = true to be updated
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemList.add(itemFlow.getFileItem());
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }

    /**
     * Clone inspection controller list.
     *
     * @param inspectionControllerList the inspection controller list
     * @return the list
     */
    private List<InspectionController> cloneInspectionControllerList(final List<InspectionController> inspectionControllerList) {
        final List<InspectionController> insContList = new ArrayList<>();

        for (final InspectionController inspectionController : inspectionControllerList) {
            final InspectionController insCont = new InspectionController();

            insCont.setName(inspectionController.getName());
            insCont.setPosition(inspectionController.getPosition());
            insCont.setService(inspectionController.getService());
            insCont.setInspection(inspectionController.getInspection());

            insContList.add(insCont);
        }

        return insContList;
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveAnalyseRequest(java.util.List,
	 * org.guce.siat.core.ct.model.AnalyseOrder, java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveAnalyseRequest(final List<AnalysePart> analysePartsList, final AnalyseOrder analyseOrder,
            final List<ItemFlow> itemFlowsToAdd) {

        final List<FileItem> fileItemList = new ArrayList<>();

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            analyseOrder.setItemFlow(itemFlow);
            analyseOrderDao.save(analyseOrder);
            for (final AnalysePart analysePart : analysePartsList) {
                analysePartDao.save(analysePart);
            }

            // Set draft = true to be updated
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemList.add(itemFlow.getFileItem());
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#takeDecisionAndAppointment(java.util.List,
	 * org.guce.siat.common.model.Appointment)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndAppointment(final List<ItemFlow> itemFlows, final Appointment appointment) {
        @SuppressWarnings("unchecked")
        final Collection<ItemFlow> visiteAQuaiValidationFlows = CollectionUtils.select(itemFlows, new Predicate() {

            @Override
            public boolean evaluate(final Object object) {
                return FlowCode.FL_CT_42.name().equals(((ItemFlow) object).getFlow().getCode());
            }
        });
        for (final AppointmentItemFlow toDeleted : appointment.getAppointmentItemFlowList()) {
            toDeleted.setDeleted(Boolean.TRUE);
        }

        final List<FileItem> fileItemList = new ArrayList<>();
        for (final ItemFlow itemFlow : itemFlows) {
            final ItemFlow savedItemFlow = itemFlowDao.save(itemFlow);

            final AppointmentItemFlowId appointmentItemFlowId = new AppointmentItemFlowId();
            appointmentItemFlowId.setItemFlow(savedItemFlow);
            appointmentItemFlowId.setAppointment(appointment);
            final AppointmentItemFlow appointmentItemFlow = new AppointmentItemFlow(appointmentItemFlowId);
            appointmentItemFlow.setDeleted(Boolean.FALSE);
            appointment.getAppointmentItemFlowList().add(appointmentItemFlow);

            // Set draft = true to be updated
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemList.add(itemFlow.getFileItem());
        }
        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);

        if (CollectionUtils.isEmpty(visiteAQuaiValidationFlows) || appointment.getId() == null) {
            appointmentDao.save(appointment);
        } else if (appointment.getId() != null) {
            final ItemFlow propositionVisiteAQuai = itemFlowDao.findLastSentItemFlowByFileItem(itemFlows.get(0).getFileItem()
                    .getId());
            final Appointment proposedAppointment = appointmentDao.findAppointmentsByItemFlow(propositionVisiteAQuai);
            proposedAppointment.setBeginTime(appointment.getBeginTime());
            proposedAppointment.setCar(appointment.getCar());
            proposedAppointment.setController(appointment.getController());
            proposedAppointment.setEndTime(appointment.getEndTime());
            proposedAppointment.setInspectionPlace(appointment.getInspectionPlace());
            proposedAppointment.setObservations(appointment.getObservations());
            proposedAppointment.setDeleted(Boolean.FALSE);
            if (proposedAppointment.getAppointmentItemFlowList().size() == appointment.getAppointmentItemFlowList().size()) {
                for (final AppointmentItemFlow appointmentItemFlow : appointment.getAppointmentItemFlowList()) {
                    appointmentItemFlow.setAppointment(proposedAppointment);
                    proposedAppointment.getAppointmentItemFlowList().add(appointmentItemFlow);
                }
            } else {
                proposedAppointment.setAppointmentItemFlowList(appointment.getAppointmentItemFlowList());
            }
            appointmentDao.update(proposedAppointment);

        }
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#rollbackDecision(java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void rollbackDecision(final List<Long> fileItems) {
        final List<ItemFlow> itemFlows = itemFlowDao.findItemFlowsByFileItemList(fileItems);
        final List<String> acceptationFlows = Arrays.asList(FlowCode.FL_AP_101.name(), FlowCode.FL_AP_102.name(),
                FlowCode.FL_AP_103.name(), FlowCode.FL_AP_104.name(), FlowCode.FL_AP_105.name(), FlowCode.FL_AP_106.name());
        final List<String> DCC_FLOW_CODES = Arrays.asList(FlowCode.FL_CT_CVS_03.name(), FlowCode.FL_CT_CVS_07.name());

        boolean alreadyDeleted = true;
        for (final ItemFlow itemFlow : itemFlows) {
            final String flowCode = itemFlow.getFlow().getCode();

            // suppression des décisions relatives au phyto
            if ("MINADER".equals(itemFlow.getFileItem().getFile().getDestinataire())
                    && (FlowCode.FL_CT_07.name().equals(flowCode) || FlowCode.FL_CT_117.name().equals(flowCode) || FlowCode.FL_CT_112.name().equals(flowCode))) {
                switch (itemFlow.getFileItem().getFile().getFileType().getCode()) {
                    case CCT_CT_E:
                        final TreatmentInfos ti = treatmentInfosDao.findTreatmentInfosByItemFlow(itemFlow);
                        if (ti != null) {
                            treatmentInfosDao.delete(ti);
                        }
                        break;
                    case CCT_CT_E_FSTP:
                    case CCT_CT_E_ATP:
                        final TreatmentResult tr = treatmentResultDao.findTreatmentResultByItemFlow(itemFlow);
                        if (tr != null) {
                            treatmentResultDao.delete(tr);
                        }
                        break;
                    case CCT_CT_E_PVI:
                        final InspectionReport ir = inspectionReportDao.findByItemFlow(itemFlow);
                        if (ir != null) {
                            if (CollectionUtils.isNotEmpty(ir.getInspectionControllerList())) {
                                inspectionControllerDao.deleteList(ir.getInspectionControllerList());
                            }
                            inspectionReportDao.delete(ir);
                        }
                }
            } //Proposition RDV Visite à Quai OR Validation RDV chez Déclarant
            else if (alreadyDeleted && (FlowCode.FL_CT_26.name().equals(flowCode) || FlowCode.FL_CT_41.name().equals(flowCode))) {
                final AppointmentItemFlow appointmentItemFlow = appointmentDao.findAppointmentItemFlowByItemFlow(itemFlow);
                final Appointment dratftAppointment = appointmentDao.findAppointmentByItemFlow(itemFlow);
                appointmentDao.delete(appointmentItemFlow);
                appointmentDao.delete(dratftAppointment);
                alreadyDeleted = false;
            } //			Validation RDV Visite à Quai
            else if (alreadyDeleted && FlowCode.FL_CT_42.name().equals(flowCode)) {
                final AppointmentItemFlow draftAppointmentItemFlow = appointmentDao.findAppointmentItemFlowByItemFlow(itemFlow);
                final AppointmentItemFlow deletedAppointmentsItemFlow = appointmentDao
                        .findDeletedAppointmentItemFlowAppointmentByAppointment(draftAppointmentItemFlow.getAppointment());
                if (deletedAppointmentsItemFlow != null) {
                    deletedAppointmentsItemFlow.setDeleted(Boolean.FALSE);
                    appointmentDao.update(deletedAppointmentsItemFlow);
                } else {
                    final Appointment dratftAppointment = appointmentDao.findAppointmentByItemFlow(itemFlow);
                    appointmentDao.delete(draftAppointmentItemFlow);
                    appointmentDao.delete(dratftAppointment);
                    alreadyDeleted = false;

                }
                appointmentDao.delete(draftAppointmentItemFlow);
            } //Saisie Constat Suite Visite à Quai ou Saisie Constat Suite RDV chez Déclarant
            else if (FlowCode.FL_CT_44.name().equals(flowCode) || FlowCode.FL_CT_28.name().equals(flowCode)) {
                final InspectionReport daraftInspectionReport = inspectionReportDao.findLastInspectionReportsByFileItem(itemFlow
                        .getFileItem());
                inspectionReportDao.delete(daraftInspectionReport);
            } //			Demande d Analyse
            else if (FlowCode.FL_CT_29.name().equals(flowCode)) {
                final AnalyseOrder draftAnalyseOrder = analyseOrderDao.findByItemFlow(itemFlow);
                analyseOrderDao.delete(draftAnalyseOrder);
            } //			Demande de Traitement
            else if (FlowCode.FL_CT_64.name().equals(flowCode)) {
                final TreatmentOrder draftTreatmentOrder = treatmentOrderDao.findTreatmentOrderByItemFlow(itemFlow);
                treatmentOrderDao.delete(draftTreatmentOrder);
            } //Envoie Résultat d Analyse
            else if (FlowCode.FL_CT_31.name().equals(flowCode)) {
                final List<String> attachments = new ArrayList<>();
                final AnalyseResult draftAnalyseResult = analyseResultDao.findAnalyseResultByItemFlow(itemFlow);
                final AnalyseOrder analyseOrder = draftAnalyseResult.getAnalyseOrder();
                final List<AnalysePart> analyseParts = analyseOrder.getAnalysePartsList();
                for (final AnalysePart analysePart : analyseParts) {
                    if (analysePart.getAttachment() != null) {
                        attachments.add(analysePart.getAttachment());
                    }
                    analysePart.setAttachment(null);
                    analysePart.setCompliant(null);
                    analysePart.setObservation(null);
                }
                for (final AnalyseResult result : analyseOrder.getAnalysesResultsList()) {
                    result.setAnalyseOrder(null);
                }
                analyseOrder.getAnalysePartsList().clear();
                analyseResultDao.update(draftAnalyseResult);
                analyseResultDao.delete(draftAnalyseResult);
                this.deleteAttachedReports(attachments);
            } //			Envoie Résultat e Traitement
            else if (FlowCode.FL_CT_66.name().equals(flowCode)) {
                final List<String> attachments = new ArrayList<>();
                final TreatmentResult draftTreatmentResult = treatmentResultDao.findTreatmentResultByItemFlow(itemFlow);
                final TreatmentOrder treatmentOrder = draftTreatmentResult.getTreatmentOrder();
                final List<TreatmentPart> treatmentPartsList = treatmentOrder.getTreatmentPartsList();
                for (final TreatmentPart treatmentPart : treatmentPartsList) {
                    if (treatmentPart.getAttachment() != null) {
                        attachments.add(treatmentPart.getAttachment());
                    }
                    treatmentPart.setAttachment(null);
                    treatmentPart.setObservation(null);
                }
                for (final TreatmentResult result : treatmentOrder.getTreatmentsResultsList()) {
                    result.setTreatmentOrder(null);
                }
                treatmentOrder.getTreatmentsResultsList().clear();
                treatmentResultDao.update(draftTreatmentResult);
                treatmentResultDao.delete(draftTreatmentResult);
                this.deleteAttachedReports(attachments);
            } //ANALYSE Result AP
            else if (acceptationFlows.contains(flowCode)
                    && FileTypeCode.EH_MINADER.equals(fileItemDao.find(fileItems.get(0)).getFile().getFileType().getCode())) {
                final AnalyseResultAp draftAnalyseResult = analyseResultApDao.findAnalyseResultApByItemFlow(itemFlow);
                analyseResultApDao.delete(draftAnalyseResult);
                itemFlowDataDao.deleteList(itemFlowDataDao.findByItemFlows(Collections.singletonList(itemFlow)));
            } //EssayTestAP  result AP
            else if (acceptationFlows.contains(flowCode)
                    && FileTypeCode.CAT_MINADER.equals(fileItemDao.find(fileItems.get(0)).getFile().getFileType().getCode())) {
                final EssayTestAP draftEssayTestAP = essayTestAPDao.findByItemFlow(itemFlow);
                essayTestAPDao.delete(draftEssayTestAP);
                itemFlowDataDao.deleteList(itemFlowDataDao.findByItemFlows(Collections.singletonList(itemFlow)));
            } else if (DCC_FLOW_CODES.contains(flowCode)) {
                ApprovedDecision ad = approvedDecisionDao.findApprovedDecisionByItemFlow(itemFlow);
                if (ad != null) {
                    approvedDecisionDao.delete(ad);
                }
            }

            final List<ItemFlowData> itemFlowData = itemFlowDataDao
                    .findByItemFlows(Collections.singletonList(itemFlow));
            if (CollectionUtils.isNotEmpty(itemFlowData)) {
                itemFlowDataDao.deleteList(itemFlowData);
            }

            itemFlowDao.delete(itemFlow);
        }

        for (final ItemFlow itemFlow : itemFlows) {
            // Set draft = false to be updated
            itemFlow.getFileItem().setDraft(Boolean.FALSE);
            // Update fileItems : Set draft = false
            fileItemDao.update(itemFlow.getFileItem());
        }
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveTreatmentRequest(java.util.List,
	 * org.guce.siat.core.ct.model.TreatmentOrder, java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveTreatmentRequest(final List<TreatmentPart> treatmentPartsList,
            final TreatmentOrder treatmentOrder, final List<ItemFlow> itemFlowsToAdd) {

        final List<FileItem> fileItemList = new ArrayList<>();
        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            treatmentOrder.setItemFlow(itemFlow);
            treatmentOrderDao.save(treatmentOrder);
            for (final TreatmentPart treatmentPart : treatmentPartsList) {
                treatmentPartDao.save(treatmentPart);
            }

            // Set draft = true to be updated
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemList.add(itemFlow.getFileItem());
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }

    @Override
    @Transactional(readOnly = false)
    public void saveTreatmentOrder(final TreatmentOrder treatmentOrder, final ItemFlow itemFlow) {
        itemFlowDao.save(itemFlow);

        treatmentOrder.setItemFlow(itemFlow);
        treatmentOrderDao.save(treatmentOrder);

        itemFlow.getFileItem().setDraft(Boolean.TRUE);
        fileItemDao.saveOrUpdateList(Arrays.asList(itemFlow.getFileItem()));
    }

    @Override
    @Transactional(readOnly = false)
    public void saveTreatmentInfos(final TreatmentInfos treatmentInfos, final ItemFlow itemFlow) {
        itemFlowDao.save(itemFlow);

        treatmentInfos.setItemFlow(itemFlow);
        treatmentInfosDao.save(treatmentInfos);

        itemFlow.getFileItem().setDraft(Boolean.TRUE);
        fileItemDao.saveOrUpdateList(Arrays.asList(itemFlow.getFileItem()));
    }

    @Override
    @Transactional(readOnly = false)
    public void saveApprovedDecision(final ApprovedDecision approvedDecision, final ItemFlow itemFlow) {
        itemFlowDao.save(itemFlow);

        approvedDecision.setItemFlow(itemFlow);
        approvedDecisionDao.save(approvedDecision);

        itemFlow.getFileItem().setDraft(Boolean.TRUE);
        fileItemDao.saveOrUpdateList(Arrays.asList(itemFlow.getFileItem()));
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveAnalyzeResult(org.guce.siat.core.ct.model.
	 * AnalyseResult, java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveAnalyzeResult(final AnalyseResult analyseResult, final List<ItemFlow> itemFlows) {
        final AnalyseOrder analyseOrder = analyseResult.getAnalyseOrder();

        final List<AnalysePart> analyseParts = analyseOrder.getAnalysePartsList();

        if (CollectionUtils.isNotEmpty(itemFlows) && itemFlows.size() == Constants.ONE) {
            final ItemFlow itemFlow = itemFlowDao.save(itemFlows.get(0));
            sampleDao.update(analyseOrder.getSample());
            analyseOrderDao.update(analyseOrder);
            for (final AnalysePart analysePart : analyseParts) {
                analysePartDao.update(analysePart);
            }
            analyseResult.setItemFlow(itemFlow);
            analyseResultDao.save(analyseResult);

            // Update fileItems : Set draft = true
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemDao.update(itemFlow.getFileItem());
        } else {
            throw new UnsupportedOperationException("Multiple Items not Allowed");
        }

    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveTreatmentResult(org.guce.siat.core.ct.model.
	 * TreatmentResult, java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveTreatmentResult(final TreatmentResult treatmentResult, final List<ItemFlow> itemFlows) {
        final TreatmentOrder treatmentOrder = treatmentResult.getTreatmentOrder();

        if (CollectionUtils.isNotEmpty(itemFlows) && itemFlows.size() == Constants.ONE) {
            if (treatmentOrder != null) {
                treatmentOrderDao.update(treatmentOrder);
                final List<TreatmentPart> treatmentParts = treatmentOrder.getTreatmentPartsList();
                for (final TreatmentPart treatmentPart : treatmentParts) {
                    treatmentPartDao.update(treatmentPart);
                }
            }

            final ItemFlow itemFlow = itemFlowDao.save(itemFlows.get(0));
            treatmentResult.setItemFlow(itemFlow);
            treatmentResultDao.save(treatmentResult);

            // Update fileItems : Set draft = true
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemDao.update(itemFlow.getFileItem());
        } else {
            throw new UnsupportedOperationException("Multiple Items not Allowed");
        }

    }

    /**
     *
     * @param treatmentResult
     * @param itemFlowsToAdd
     * @throws Exception
     *
     * @see
     * org.guce.siat.core.ct.service.CommonService#takeDecisionAndSaveTreatmentResult2(org.guce.siat.core.ct.model.TreatmentResult,
     * java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveTreatmentResult2(final TreatmentResult treatmentResult, final List<ItemFlow> itemFlowsToAdd) throws Exception {

        final List<FileItem> fileItemList = new ArrayList<>();

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            final TreatmentResult tr = CommonUtils.clone(treatmentResult);

            tr.setItemFlow(itemFlow);
            treatmentResultDao.save(tr);

            // Set draft = true to be updated
            final FileItem item = itemFlow.getFileItem();
            item.setDraft(Boolean.TRUE);
            fileItemList.add(item);
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }

    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveInterceptionNotification(final InterceptionNotification interceptionNotif, final List<ItemFlow> itemFlows) {
        if (CollectionUtils.isNotEmpty(itemFlows) && itemFlows.size() == Constants.ONE) {
            final ItemFlow itemFlow = itemFlows.get(0);
            interceptionNotif.setItemFlow(itemFlow);
            interceptionNotificationDao.save(interceptionNotif);
        } else {
            throw new UnsupportedOperationException("Multiple Items not Allowed");
        }

    }

    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveTreatmentInfos(final TreatmentInfos treatmentInfos, final List<ItemFlow> itemFlowsToAdd) throws Exception {

        final List<FileItem> fileItemList = new ArrayList<>();
        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            final TreatmentInfos ti = CommonUtils.clone(treatmentInfos);

            ti.setItemFlow(itemFlow);
            treatmentInfosDao.save(ti);

            // Set draft = true to be updated
            final FileItem item = itemFlow.getFileItem();
            item.setDraft(Boolean.TRUE);
            fileItemList.add(item);
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }

    @Override
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveApprovedDecision(final ApprovedDecision approvedDecision, final List<ItemFlow> itemFlowsToAdd) throws Exception {

        final List<FileItem> fileItemList = new ArrayList<>();
        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            final ApprovedDecision ad = CommonUtils.clone(approvedDecision);

            ad.setItemFlow(itemFlow);
            ad.setId(null);
            approvedDecisionDao.save(ad);

            // Set draft = true to be updated
            final FileItem item = itemFlow.getFileItem();
            item.setDraft(Boolean.TRUE);
            fileItemList.add(item);
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#findSampleByFileItem(org.guce.siat.common.model.FileItem)
     */
    @Override
    public Sample findSampleByFileItem(final FileItem fileItem) {
        return commonDao.findSampleByFileItem(fileItem);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.FileItemService#findByFilter(org.guce.siat.core.ct.utils.fiter.FileItemFilter,
	 * org.guce.siat.common.model.User, org.guce.siat.common.model.Administration, java.util.List)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FileItem> findByFilter(final Filter filter, final User loggedUser, final Administration administration) {

        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<FileTypeCode> fileTypeCodes = (List<FileTypeCode>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getCode();
            }
        });

        List<Administration> administrations = new ArrayList<>();
        administrations.add(administration);
        if (loggedUser.getAdministrationExtendRoles() != null) {
            administrations.add(loggedUser.getAdministrationExtendRoles());
        }
        return commonDao.findByFilter(filter, administrations, fileTypeCodes);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#findStatisticByFilter(org.guce.siat.core.ct.filter.Filter)
     */
    @Override
    public List<AnalyseOrder> findStatisticByFilter(final Filter filter) {
        return commonDao.findStatisticByFilter(filter);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#fileItemByDesicionByFilter(org.guce.siat.core.ct.filter.Filter,
	 * org.guce.siat.common.model.User, java.util.List, java.util.List, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FileItem> fileItemByDesicionByFilter(final Filter filter, final User loggedUser, final List<String> flowCodeList,
            final List<String> restrectionFlowCode, final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<FileTypeCode> fileTypeCodes = (List<FileTypeCode>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getCode();
            }
        });

        return commonDao.fileItemByDesicionByFilter(filter, fileTypeCodes, flowCodeList, restrectionFlowCode, administration);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.CommonService#fileItemByCompanyAndDecicionByFilter(org.guce.siat.core.ct.filter.
	 * Filter, org.guce.siat.common.model.User, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FileItem> fileItemByCompanyAndDecicionByFilter(final Filter filter, final User loggedUser,
            final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<FileTypeCode> fileTypeCodes = (List<FileTypeCode>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getCode();
            }
        });
        return commonDao.fileItemByCompanyAndDecicionByFilter(filter, fileTypeCodes, administration);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#fileItemByCompanyAndProductByFilter(org.guce.siat.core.ct.filter.
	 * Filter , org.guce.siat.common.model.User, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FileItem> fileItemByCompanyAndProductByFilter(final Filter filter, final User loggedUser,
            final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<FileTypeCode> fileTypeCodes = (List<FileTypeCode>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getCode();
            }
        });
        return commonDao.fileItemByCompanyAndProductByFilter(filter, fileTypeCodes, administration);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#fileItemByInspectionDestribByFilter(org.guce.siat.core.ct.filter.
	 * Filter , org.guce.siat.common.model.User, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FileItem> fileItemByInspectionDestribByFilter(final Filter filter, final User loggedUser,
            final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<FileTypeCode> fileTypeCodes = (List<FileTypeCode>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getCode();
            }
        });
        return commonDao.fileItemByInspectionDestribByFilter(filter, fileTypeCodes, administration);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.CommonService#serviceItemProductsQuantitiesByFilter(org.guce.siat.core.ct.filter
	 * .Filter, org.guce.siat.common.model.User, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> serviceItemProductsQuantitiesByFilter(final Filter filter, final User loggedUser,
            final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });
        return commonDao.serviceItemProductsQuantitiesByFilter(filter, fileTypeIdList, administration);
    }
    
    public void setDefaultOffice(final CteFilter filter, final User loggedUser){
        if (filter.getOfficeCodeList() == null || filter.getOfficeCodeList().length <= 0){
            filter.setOfficeCodeList(new String[]{String.valueOf(loggedUser.getAdministration().getId())});
        }
    }

    @Override
    public List<Object[]> getActivitiesReport(final CteFilter filter, final User loggedUser) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });
        
        setDefaultOffice(filter, loggedUser);
        return commonDao.getActivitiesReport(filter, fileTypeIdList);
    }

    @Override
    public List<Object[]> getDelayListingStakeholder(CteFilter filter, User loggedUser) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });
        setDefaultOffice(filter, loggedUser);
        return commonDao.getDelayListingStakeholder(filter, fileTypeIdList);
    }
    @Override
    public List<Object[]> getGlobalDelayListing(CteFilter filter, User loggedUser) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });
        setDefaultOffice(filter, loggedUser);
        return commonDao.getGlobalDelayListing(filter, fileTypeIdList);
    }
    @Override
    public List<Object[]> getExportNshDestination(CteFilter filter, User loggedUser) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });
        setDefaultOffice(filter, loggedUser);
        return commonDao.getExportNshDestination(filter, fileTypeIdList);
    }
    @Override
    public List<Object[]> getExportNshDestinationSender(CteFilter filter, User loggedUser) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });
        setDefaultOffice(filter, loggedUser);
        return commonDao.getExportNshDestinationSender(filter, fileTypeIdList);
    }
    
    


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#serviceItemProductsQuantitiesByDrdByFilter(org.guce.siat.core.ct.
	 * filter .Filter, java.util.List, org.guce.siat.common.model.User, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Object[]> serviceItemProductsQuantitiesByDrdByFilter(final Filter filter, final List<String> flowCodeList,
            final User loggedUser, final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<Long> fileTypeIdList = (List<Long>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getId();
            }
        });

        final List<Flow> flowList = flowService.findFlowListByFlowCodeList(flowCodeList);
        final List<Long> flowIdList = (List<Long>) CollectionUtils.collect(flowList, new Transformer() {
            @Override
            public Object transform(final Object flow) {
                return ((Flow) flow).getId();
            }
        });
        return commonDao.serviceItemProductsQuantitiesByDrdByFilter(filter, flowIdList, fileTypeIdList, administration);
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#findQuotsByCreteria(org.guce.siat.core.ct.util.quota.QuotaDto)
     */
    @Override
    public List<QuotaDto> findQuotsByCreteria(final QuotaDto searchFilter) {
        List<QuotaDto> quotaDtos = commonDao.findQuotsByCreteria(searchFilter);
        quotaDtos = commonDao.getImportedExportedQuatityByQuotaList(quotaDtos);
        return commonDao.getGrantedQuantityByQuotaList(quotaDtos, searchFilter);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#fileItemByStatisticBusinessByFilter(org.guce.siat.core.ct.filter.
	 * Filter , org.guce.siat.common.model.User, org.guce.siat.common.model.Administration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<FileItem> fileItemByStatisticBusinessByFilter(final Filter filter, final User loggedUser,
            final Administration administration) {
        final List<FileType> fileTypesByUser = userAuthorityFileTypeDao.findFilesTypesByAuthorizedUser(loggedUser);

        final List<FileTypeCode> fileTypeCodes = (List<FileTypeCode>) CollectionUtils.collect(fileTypesByUser, new Transformer() {
            @Override
            public Object transform(final Object fileType) {
                return ((FileType) fileType).getCode();
            }
        });

        return commonDao.fileItemByStatisticBusinessByFilter(filter, administration, fileTypeCodes);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.co.service.CommonService#takeDacisionAndSavePayment(java.util.List, java.util.List)
     */
    @Override
    @Transactional(readOnly = false)
    public void takeDacisionAndSavePayment(final List<ItemFlow> itemFlowsToAdd, final PaymentData paymentData) {

        itemFlowDao.saveOrUpdateList(itemFlowsToAdd);

        // Update fileItems : set draft = true
        final List<FileItem> fileItemList = new ArrayList<>();
        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemList.add(itemFlow.getFileItem());
        }
        fileItemDao.saveOrUpdateList(fileItemList);

        //	final List<PaymentItemFlow> paymentItemFlowList = new ArrayList<PaymentItemFlow>();
        paymentData.setDeleted(false);

        for (final ItemFlow iflow : itemFlowsToAdd) {
            for (final PaymentItemFlow paymentItemFlow : paymentData.getPaymentItemFlowList()) {
                if (paymentItemFlow.getFileItemId().equals(iflow.getFileItem().getId())) {
                    //final PaymentItemFlow paymentItemFlow = new PaymentItemFlow();
                    paymentItemFlow.setPaymentData(paymentData);
                    paymentItemFlow.setItemFlow(iflow);
                }
            }
        }
        //	paymentData.setPaymentItemFlowList(paymentItemFlowList);

        paymentDataDao.save(paymentData);

    }


    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.CommonService#findPindingFileItem(org.guce.siat.core.ct.filter.Filter,
	 * org.guce.siat.common.model.User)
     */
    @Override
    public List<FileItem> findPindingFileItem(final Filter filter, final User user) {
        return commonDao.findPindingFileItem(filter, user);
    }

    @Override
    public boolean showEnabledFileItem(final FileItem item, final ItemFlow itemFlow, final User user) {
        final List<StepCode> specificStepsCodesList = Arrays.asList(StepCode.ST_CT_12, StepCode.ST_CT_14, StepCode.ST_CT_15,
                StepCode.ST_CT_19);
        if (specificStepsCodesList.contains(item.getStep().getStepCode())) {
            if (StepCode.ST_CT_12.equals(item.getStep().getStepCode()) || StepCode.ST_CT_19.equals(item.getStep().getStepCode())) {
                final Appointment appointment = appointmentDao.findAppointmentsByItemFlow(itemFlow);
                if (appointment != null && !appointment.getController().equals(user)) {
                    return false;
                }
            } else if (StepCode.ST_CT_14.equals(item.getStep().getStepCode())) {
                final AnalyseOrder analyseOrder = analyseOrderDao.findByItemFlow(itemFlow);
                if (analyseOrder != null && !((Administration) analyseOrder.getLaboratory()).equals(user.getAdministration())) {
                    return false;
                }
            }
//            else if (StepCode.ST_CT_14.equals(item.getStep().getStepCode())) {
//                final TreatmentOrder treatmentOrder = treatmentOrderDao.findTreatmentOrderByItemFlow(itemFlow);
//                if (treatmentOrder != null
//                        && !((Administration) treatmentOrder.getTreatmentCompany()).equals(user.getAdministration())) {
//                    return false;
//                }
//            }
        }
        return true;
    }
}

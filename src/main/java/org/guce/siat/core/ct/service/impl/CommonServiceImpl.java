/*
 *
 */
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
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.FlowService;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.common.utils.ged.CmisSession;
import org.guce.siat.common.utils.ged.CmisUtils;
import org.guce.siat.core.ct.dao.AnalyseOrderDao;
import org.guce.siat.core.ct.dao.AnalysePartDao;
import org.guce.siat.core.ct.dao.AnalyseResultApDao;
import org.guce.siat.core.ct.dao.AnalyseResultDao;
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
import org.guce.siat.core.ct.filter.Filter;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.model.AnalysePart;
import org.guce.siat.core.ct.model.AnalyseResult;
import org.guce.siat.core.ct.model.AnalyseResultAp;
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
@Transactional(readOnly = true)
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
    @Transactional(readOnly = false)
    public void takeDecisionAndSaveInspectionReports(final List<InspectionReport> reports, final List<ItemFlow> itemFlowsToAdd) {
        final List<ItemFlow> itemFlows = new ArrayList<>();

        final List<FileItem> fileItemList = new ArrayList<>();

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlows.add(itemFlowDao.save(itemFlow));

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
            final List<InspectionController> inspectionControllers = inspectionReport.getInspectionControllerList();
            if (inspectionControllers != null) {
                for (final InspectionController inspectionController : inspectionControllers) {
                    inspectionController.setInspection(null);
                }
                inspectionReport.setInspectionControllerList(cloneInspectionControllerList(inspectionReport
                        .getInspectionControllerList()));
            }

            inspectionReportDao.save(inspectionReport);
            if (inspectionControllers != null) {
                for (final InspectionController inspectionController : inspectionControllers) {
                    inspectionController.setInspection(inspectionReport);
                    inspectionControllerDao.save(inspectionController);
                }
            }

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
        final List<InspectionController> insContList = new ArrayList<InspectionController>();

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
        final List<ItemFlow> itemFlows = new ArrayList<>();

        final List<FileItem> fileItemList = new ArrayList<FileItem>();

        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlows.add(itemFlowDao.save(itemFlow));

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

        final List<FileItem> fileItemList = new ArrayList<FileItem>();
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
        boolean alreadyDeleted = true;
        for (final ItemFlow itemFlow : itemFlows) {
            final String flowCode = itemFlow.getFlow().getCode();

            //Proposition RDV Visite à Quai OR Validation RDV chez Déclarant
            if (alreadyDeleted && (FlowCode.FL_CT_26.name().equals(flowCode) || FlowCode.FL_CT_41.name().equals(flowCode))) {
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
                final List<String> attachments = new ArrayList<String>();
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
                final List<String> attachments = new ArrayList<String>();
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
            } //GENERIC DECISION or AnalyseResultAp or essayTestAp
            else {
                itemFlowDataDao.deleteList(itemFlowDataDao.findByItemFlows(Collections.singletonList(itemFlow)));
            }
        }

        itemFlowDao.deleteList(itemFlows);

        final List<FileItem> fileItemList = new ArrayList<>();

        for (final ItemFlow itemFlow : itemFlows) {
            // Set draft = false to be updated
            itemFlow.getFileItem().setDraft(Boolean.FALSE);
            fileItemList.add(itemFlow.getFileItem());
        }
        // Update fileItems : Set draft = false
        fileItemDao.saveOrUpdateList(fileItemList);
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
    public void takeDecisionAndSaveTreatmentInfos(final TreatmentInfos treatmentInfos, final List<ItemFlow> itemFlowsToAdd) {

        final List<FileItem> fileItemList = new ArrayList<>();
        for (final ItemFlow itemFlow : itemFlowsToAdd) {
            itemFlowDao.save(itemFlow);

            treatmentInfos.setItemFlow(itemFlow);
            treatmentInfosDao.save(treatmentInfos);

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

        return commonDao.findByFilter(filter, administration, fileTypeCodes);
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
        final List<FileItem> fileItemList = new ArrayList<FileItem>();
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
            } else if (StepCode.ST_CT_14.equals(item.getStep().getStepCode())) {
                final TreatmentOrder treatmentOrder = treatmentOrderDao.findTreatmentOrderByItemFlow(itemFlow);
                if (treatmentOrder != null
                        && !((Administration) treatmentOrder.getTreatmentCompany()).equals(user.getAdministration())) {
                    return false;
                }
            }
        }
        return true;
    }
}

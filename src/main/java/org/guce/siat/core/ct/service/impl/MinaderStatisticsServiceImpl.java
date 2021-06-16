package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.BooleanUtils;
import org.guce.siat.common.dao.AppointmentDao;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.dao.FileTypeStepDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileTypeStep;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.Pair;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.dao.MinaderStatisticsDao;
import org.guce.siat.core.ct.filter.MinaderFileTrackingFilter;
import org.guce.siat.core.ct.model.MinaderFileTracking;
import org.guce.siat.core.ct.service.MinaderStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ht
 */
@Service("minaderStatisticsService")
@Transactional(readOnly = true)
public class MinaderStatisticsServiceImpl implements MinaderStatisticsService {

    @Autowired
    private FileTypeStepDao fileTypeStepDao;
    @Autowired
    private FileDao fileDao;
    @Autowired
    private ItemFlowDao itemFlowDao;
    @Autowired
    private AppointmentDao appointmentDao;

    @Autowired
    private MinaderStatisticsDao minaderStatisticsDao;

    @Override
    public List<String> findMinaderProductNames() {
        return minaderStatisticsDao.findMinaderProductNames();
    }

    @Override
    public List<Pair> findCDAs() {
        return minaderStatisticsDao.findCDAs();
    }

    @Override
    public List<Pair> findTreatmentSocieties() {
        return minaderStatisticsDao.findTreatmentSocieties();
    }

    @Override
    public List<Pair> findDestinationCountries() {
        return minaderStatisticsDao.findDestinationCountries();
    }

    @Override
    public List<User> retrievePotentialAgents(MinaderFileTracking fileTracking) {
        return minaderStatisticsDao.retrievePotentialAgents(fileTracking);
    }

    @Override
    public List<MinaderFileTracking> retrieveFilesForTracking(MinaderFileTrackingFilter filter) {

        List<Object[]> list = minaderStatisticsDao.retrieveFilesForTracking(filter);

        List<MinaderFileTracking> result = new ArrayList<>(list.size());

        for (Object[] objects : list) {

            MinaderFileTracking mft = new MinaderFileTracking();

            int i = 0;
            mft.setRequestNumber(Objects.toString(objects[i++]));
            mft.setFileNumber(Objects.toString(objects[i++]));

            File file = fileDao.findByNumDossierGuce(mft.getFileNumber());
            if (file.getFileItemsList().isEmpty()) {
                continue;
            }

            FileItem fileItem = file.getFileItemsList().get(0);
            Step currentStep = file.getFileItemsList().get(0).getStep();
            if (currentStep == null) {
                continue;
            }
            boolean fileClosed = BooleanUtils.toBoolean(currentStep.getIsFinal());
//
//            if (MinaderFileTrackingFilter.FileStateFilter.IN_PROCESS.equals(filter.getFileState()) && fileClosed) {
//                continue;
//            } else if (MinaderFileTrackingFilter.FileStateFilter.CLOSED.equals(filter.getFileState()) && !fileClosed) {
//                continue;
//            }
//
            mft.setFileTypeCode(Objects.toString(objects[i++]));
            mft.setFileTypeNameFr(Objects.toString(objects[i++]));
            mft.setFileTypeNameEn(Objects.toString(objects[i++]));
            i++;
            mft.setNiu(Objects.toString(objects[i++]));
            mft.setExporterName(Objects.toString(objects[i++]));
            mft.setProductyTypeCode(Objects.toString(objects[i++]));
            mft.setProductyTypeName(Objects.toString(objects[i++]));
            mft.setOfficeId(Long.parseLong(Objects.toString(objects[i++])));
            mft.setOfficeCode(Objects.toString(objects[i++]));
            mft.setOfficeNameFr(Objects.toString(objects[i++]));
            mft.setOfficeNameFr(Objects.toString(objects[i++]));

//            Date createdDate = file.getCreatedDate();
            List<ItemFlow> itemFlows = itemFlowDao.findItemFlowByFileItem(fileItem);
            Date createdDate = itemFlows.get(0).getCreated();
            FileTypeStep fileTypeStep = fileTypeStepDao.findFileTypeStepByFileTypeAndStep(file.getFileType(), currentStep);
            if (fileTypeStep != null) {
                file.setRedefinedLabelEn(fileTypeStep.getLabelEn());
                file.setRedefinedLabelFr(fileTypeStep.getLabelFr());
            }
            mft.setCurrenStep(currentStep);
            file.setStep(currentStep);
            if (TREATMENT_STEPS_CODES.contains(currentStep.getStepCode())) {
                mft.setCurrenStepUser(file.getAssignedUser());
            }
            Appointment appointment = appointmentDao.findAppointmentByFileItem(fileItem);
            if (appointment != null) {
                mft.setAppointmentDate(appointment.getBeginTime());
            }

            mft.setFile(file);
            mft.setCreationDate(createdDate);

            Date now = Calendar.getInstance().getTime();
            if (!fileClosed) {
                mft.setUserReceivedDate(file.getLastDecisionDate());
                mft.setUserDeadline(now.getTime() - file.getLastDecisionDate().getTime());
                mft.setGlobalDeadline(now.getTime() - createdDate.getTime());
            } else {
                mft.setGlobalDeadline(file.getLastDecisionDate().getTime() - createdDate.getTime());
            }

            result.add(mft);
        }

        return result;
    }

    @Override
    public List<Pair> findDestinationCountriesByCodeORNameLike(String searchQuery) {
        return minaderStatisticsDao.findDestinationCountriesByCodeORNameLike(searchQuery);
    }

    @Override
    public List<Pair> findCDAsByNuiOrNameLike(String searchQuery) {
        return minaderStatisticsDao.findCDAsByNuiOrNameLike(searchQuery);
    }

    @Override
    public List<Pair> findTreatmentSocietiesByNuiOrNameLike(String searchQuery) {
        return minaderStatisticsDao.findTreatmentSocietiesByNuiOrNameLike(searchQuery);
    }

}

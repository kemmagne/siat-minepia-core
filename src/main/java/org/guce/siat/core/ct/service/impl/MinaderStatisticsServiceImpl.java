package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.dao.FileTypeStepDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileTypeStep;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.enums.StepCode;
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

    private static final List<StepCode> TREATMENT_STEPS_CODES = Arrays.asList(StepCode.ST_CT_04, StepCode.ST_CT_48, StepCode.ST_CT_63, StepCode.ST_CT_55);

    @Autowired
    private FileDao fileDao;
    @Autowired
    private FileTypeStepDao fileTypeStepDao;

    @Autowired
    private MinaderStatisticsDao minaderStatisticsDao;

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
            mft.setFileTypeCode(Objects.toString(objects[i++]));
            mft.setFileTypeNameFr(Objects.toString(objects[i++]));
            mft.setFileTypeNameEn(Objects.toString(objects[i++]));
            i++;
//            mft.setCreationDate((Date) objects[i++]);
            mft.setNiu(Objects.toString(objects[i++]));
            mft.setExporterName(Objects.toString(objects[i++]));
            mft.setProductyTypeCode(Objects.toString(objects[i++]));
            mft.setProductyTypeName(Objects.toString(objects[i++]));
            mft.setOfficeId(Long.parseLong(Objects.toString(objects[i++])));
            mft.setOfficeCode(Objects.toString(objects[i++]));
            mft.setOfficeNameFr(Objects.toString(objects[i++]));
            mft.setOfficeNameFr(Objects.toString(objects[i++]));

            File file = fileDao.findByNumDossierGuce(mft.getFileNumber());
            mft.setCreationDate(file.getCreatedDate());
            mft.setFile(file);
            if (file.getSignatureDate() == null) {
                mft.setUserReceivedDate(file.getLastDecisionDate());
                Date now = Calendar.getInstance().getTime();
                mft.setUserDeadline(now.getTime() - file.getLastDecisionDate().getTime());
                mft.setGlobalDeadline(now.getTime() - file.getCreatedDate().getTime());
            } else {
                mft.setGlobalDeadline(file.getLastDecisionDate().getTime() - file.getCreatedDate().getTime());
            }
            if (!file.getFileItemsList().isEmpty()) {
                Step currentStep = file.getFileItemsList().get(0).getStep();
                FileTypeStep fileTypeStep = fileTypeStepDao.findFileTypeStepByFileTypeAndStep(file.getFileType(), currentStep);
                if (fileTypeStep != null) {
                    currentStep.setLabelFr(fileTypeStep.getLabelFr());
                    currentStep.setLabelEn(fileTypeStep.getLabelEn());
                }
                mft.setCurrenStep(currentStep);
                if (TREATMENT_STEPS_CODES.contains(currentStep.getStepCode())) {
                    mft.setCurrenStepUser(file.getAssignedUser());
                }
            }

            result.add(mft);
        }

        return result;
    }

}

package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.exception.DAOException;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.service.FlowService;
import org.guce.siat.common.service.StepService;
import org.guce.siat.common.utils.Constants;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class FlowServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class FlowServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(FlowServiceTest.class);

    private static final String FIND_FLOWS_BY_FROMSTEP_01 = "findFlowsByFromStep_01";

    private static final String FIND_FLOWS_BY_FROMSTEP_02 = "findFlowsByFromStep_02";

    private static final String FIND_FLOWS_BY_FROMSTEP_03 = "findFlowsByFromStep_03";

    private static final String FIND_FLOWS_BY_STEPS_IDS_01 = "findByStepsIDs_01";

    private static final String FIND_FLOWS_BY_STEPS_IDS_02 = "findByStepsIDs_02";

    private static final String FIND_FLOWS_BY_STEPS_IDS_03 = "findByStepsIDs_03";

    private static final String FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_01 = "findFlowByLabelSourceAndTarget_01";

    private static final String FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_02 = "findFlowByLabelSourceAndTarget_02";

    private static final String FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_03 = "findFlowByLabelSourceAndTarget_03";

    private static final String FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_04 = "findFlowByLabelSourceAndTarget_04";

    private static final String FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_05 = "findFlowByLabelSourceAndTarget_05";

    private static final String FIND_FLOW_BY_CURRENT_STEP_01 = "findFlowByCurrentStep_01";

    private static final String FIND_FLOW_BY_CURRENT_STEP_02 = "findFlowByCurrentStep_02";

    private static final String FIND_FLOW_BY_CURRENT_STEP_03 = "findFlowByCurrentStep_03";

    private static final String COTATION_FLOW_LABEL_FR = "Cotation";

    private static final String LOCALE_FR = "fr";

    private static final String CODE = "FL_CT_06";

    /**
     * The flow service.
     */
    @Autowired
    private FlowService flowService;

    /**
     * The step service.
     */
    @Autowired
    private StepService stepService;

    /**
     * Find flows by from step_01.
     */
    @Ignore
    @Test
    public void findFlowsByFromStep_01() {
        final Step fromStep = stepService.find(Long.valueOf(Constants.ONE));
        final FileType fileType = new FileType();
        fileType.setId(Long.valueOf(Constants.NINETEEN));

        final List<Flow> flows = flowService.findFlowsByFromStepAndFileType(fromStep, fileType);
        assertNotNull(flows);
        assertTrue(CollectionUtils.isNotEmpty(flows));
        assertTrue(flows.size() == Constants.THREE);
        assertTrue(flows.get(Constants.ZERO).getId() == Long.valueOf(Constants.ONE));
        assertTrue(flows.get(Constants.ONE).getId() == Long.valueOf(Constants.THREE));
        assertTrue(flows.get(Constants.TWO).getId() == Long.valueOf(Constants.SIXTY_EIGHT));
        LOG.info(FIND_FLOWS_BY_FROMSTEP_01);
    }

    /**
     * Find flows by from step_02.
     */
    @Ignore
    @Test
    public void findFlowsByFromStep_02() {
        final FileType fileType = new FileType();
        fileType.setId(Long.valueOf(Constants.NINETEEN));

        final Step fromStep = stepService.find(Long.valueOf(Constants.ONE_HUNDRED_AND_EIGHTEEN));
        final List<Flow> flows = flowService.findFlowsByFromStepAndFileType(fromStep, fileType);
        assertNotNull(flows);
        assertTrue(CollectionUtils.isEmpty(flows));
        LOG.info(FIND_FLOWS_BY_FROMSTEP_02);
    }

    /**
     * Find flows by from step_03.
     */
    @Ignore
    @Test
    public void findFlowsByFromStep_03() {
        final FileType fileType = new FileType();
        fileType.setId(Long.valueOf(Constants.NINETEEN));

        final List<Flow> flows = flowService.findFlowsByFromStepAndFileType(null, fileType);
        assertNotNull(flows);
        assertTrue(CollectionUtils.isEmpty(flows));
        LOG.info(FIND_FLOWS_BY_FROMSTEP_03);
    }

    /**
     * Find by steps i ds_01.
     */
    @Ignore
    @Test
    public void findByStepsIDs_01() {
        final List<Long> stepsIds = new ArrayList<Long>();
        stepsIds.add(Long.valueOf(Constants.ONE));
        stepsIds.add(Long.valueOf(Constants.TWO));
        stepsIds.add(Long.valueOf(Constants.THREE));
        final List<Flow> flows = flowService.findByStepsIDs(stepsIds);
        assertTrue(CollectionUtils.isNotEmpty(flows));
        assertTrue(flows.size() == Long.valueOf(Constants.EIGHT));
        assertTrue(flows.get(Constants.ZERO).getId() == Long.valueOf(Constants.ONE));
        assertTrue(flows.get(Constants.ONE).getId() == Long.valueOf(Constants.TWO));
        assertTrue(flows.get(Constants.TWO).getId() == Long.valueOf(Constants.THREE));
        assertTrue(flows.get(Constants.THREE).getId() == Long.valueOf(Constants.FOUR));
        assertTrue(flows.get(Constants.FOUR).getId() == Long.valueOf(Constants.FIVE));
        assertTrue(flows.get(Constants.FIVE).getId() == Long.valueOf(Constants.SIX));
        assertTrue(flows.get(Constants.SIX).getId() == Long.valueOf(Constants.TWENTYFOUR));
        assertTrue(flows.get(Constants.SEVEN).getId() == Long.valueOf(Constants.SIXTY_EIGHT));

        LOG.info(FIND_FLOWS_BY_STEPS_IDS_01);
    }

    /**
     * Find by steps i ds_02.
     */
    @Ignore
    @Test
    public void findByStepsIDs_02() {
        final List<Long> stepsIds = new ArrayList<Long>();
        stepsIds.add(Long.valueOf(Constants.ONE_HUNDRED_AND_TWENTY));
        stepsIds.add(Long.valueOf(Constants.ONE_HUNDRED_AND_TWENTY_TWO));
        stepsIds.add(Long.valueOf(Constants.ONE_HUNDRED_AND_TWENTY_THREE));
        final List<Flow> flows = flowService.findByStepsIDs(stepsIds);
        assertNotNull(flows);
        assertTrue(CollectionUtils.isEmpty(flows));

        LOG.info(FIND_FLOWS_BY_STEPS_IDS_02);
    }

    /**
     * Find by steps i ds_03.
     */
    @Ignore
    @Test
    public void findByStepsIDs_03() {
        final List<Flow> flows = flowService.findByStepsIDs(null);
        assertNotNull(flows);
        assertTrue(CollectionUtils.isEmpty(flows));

        LOG.info(FIND_FLOWS_BY_STEPS_IDS_03);
    }

    /**
     * Find flow by label source and target_01.
     */
    @Ignore
    @Test
    public void findFlowByLabelSourceAndTarget_01() {
        final Flow flow = flowService.findFlowByLabelSourceAndTarget(COTATION_FLOW_LABEL_FR, "3", "4", LOCALE_FR);

        assertNotNull(flow);
        assertTrue(flow.getId() == Long.valueOf(Constants.SIX));
        assertTrue(CODE.equals(flow.getCode()));

        LOG.info(FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_01);
    }

    /**
     * Find flow by label source and target_02.
     */
    @Ignore
    @Test
    public void findFlowByLabelSourceAndTarget_02() {
        final Flow flow = flowService.findFlowByLabelSourceAndTarget(null, "1", "2", LOCALE_FR);

        assertNull(flow);

        LOG.info(FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_02);
    }

    /**
     * Find flow by label source and target_03.
     */
    @Ignore
    @Test
    public void findFlowByLabelSourceAndTarget_03() {
        try {
            final Flow flow = flowService.findFlowByLabelSourceAndTarget(null, "X", "Y", LOCALE_FR);
            assertNull(flow);
        } catch (final Exception e) {
            assertTrue(e instanceof DAOException);
            LOG.info(FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_03);
        }
    }

    /**
     * Find flow by label source and target_04.
     */
    @Ignore
    @Test
    public void findFlowByLabelSourceAndTarget_04() {
        final Flow flow = flowService.findFlowByLabelSourceAndTarget(null, null, null, LOCALE_FR);
        assertNull(flow);

        LOG.info(FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_04);
    }

    /**
     * Find flow by label source and target_05.
     */
    @Ignore
    @Test
    public void findFlowByLabelSourceAndTarget_05() {
        final Flow flow = flowService.findFlowByLabelSourceAndTarget(null, null, null, null);
        assertNull(flow);

        LOG.info(FIND_FLOWS_BY_LABEL_SOURCE_AND_TARGET_05);
    }

    /**
     * Find flow by current step_01.
     */
    @Ignore
    @Test
    public void findFlowByCurrentStep_01() {
        final Step step = stepService.find(Long.valueOf(Constants.THREE));
        final Flow flow = flowService.findFlowByCurrentStep(step);
        assertNotNull(flow);
        assertTrue(flow.getId() == Long.valueOf(Constants.SIX));

        LOG.info(FIND_FLOW_BY_CURRENT_STEP_01);
    }

    /**
     * Find flow by current step_02.
     */
    @Ignore
    @Test
    public void findFlowByCurrentStep_02() {
        final Step step = stepService.find(Long.valueOf(Constants.ONE));
        final Flow flow = flowService.findFlowByCurrentStep(step);
        assertNull(flow);

        LOG.info(FIND_FLOW_BY_CURRENT_STEP_02);
    }

    /**
     * Find flow by current step_03.
     */
    @Ignore
    @Test
    public void findFlowByCurrentStep_03() {
        final Flow flow = flowService.findFlowByCurrentStep(null);
        assertNull(flow);

        LOG.info(FIND_FLOW_BY_CURRENT_STEP_03);
    }
}


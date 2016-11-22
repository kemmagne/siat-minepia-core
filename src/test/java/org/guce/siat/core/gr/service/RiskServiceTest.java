package org.guce.siat.core.gr.service;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.FileItemService;
import org.guce.siat.core.gr.utils.SynthesisConfig;
import org.guce.siat.core.gr.utils.SynthesisResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class RiskServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class RiskServiceTest
{

	/** The ConstantgetSynthesis LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(RiskServiceTest.class);

	/** The Constant FILE_ITEM_ID. */
	private static final Long FILE_ITEM_ID = 1L;

	private static final String GET_SYNTHESIS = "getSynthesis";



	@Autowired
	private RiskService riskService;
	@Autowired
	private FileItemService fileItemService;


	/**
	 * Gets the pending requests.
	 */
	@Test
	@SuppressWarnings("unused")
	public void getPendingRequests()
	{

		final int clearanceDelay = 15;
		final int mecDelay = 15;
		final int rddDelay = 60;
		//final List<DocumentInfo> documentList = riskService.getPendingRequests(CLIENT_ID, clearanceDelay, mecDelay, rddDelay);
		//assertTrue(CollectionUtils.isEmpty(documentList));
	}

	/**
	 * Gets the synthesis.
	 *
	 * the synthesis
	 */
	@Test
	public void getSynthesis()
	{
		final FileItem fileItem = fileItemService.find(FILE_ITEM_ID);

		final SynthesisResult synthesisResult = riskService.getSynthesis(prepareConfig(), fileItem);
		Assert.assertNotNull(synthesisResult);
		//Assert.assertNotNull(synthesisResult.getProductNeedsInspection());
		Assert.assertNotNull(synthesisResult.getProductIsKnown());
		Assert.assertNotNull(synthesisResult.getProductHasAlert());
		//Assert.assertNotNull(synthesisResult.getCountryHasTarget());
		LOG.info(GET_SYNTHESIS);
	}


	private SynthesisConfig prepareConfig()
	{
		final SynthesisConfig synthesisConfig = new SynthesisConfig();

		synthesisConfig.setProductKnownThreshold(2);
		synthesisConfig.setImporterKnownThreshold(2);
		synthesisConfig.setNegativeDecisionsPeriod(2);
		synthesisConfig.setMecDelay(5);
		synthesisConfig.setRddDelay(2);
		synthesisConfig.setClearanceDelay(5);
		synthesisConfig.setProductTestedPeriod(10);
		synthesisConfig.setProductTestedPeriod(10);
		synthesisConfig.setQuantityCoefficient(10);
		return synthesisConfig;
	}
}

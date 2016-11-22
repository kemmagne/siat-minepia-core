package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.guce.siat.common.model.Company;
import org.guce.siat.common.service.CompanyService;
import org.guce.siat.common.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class CompanyServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class CompanyServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(CompanyServiceTest.class);

	/** The Constant FIND_OPERATOR. */
	private static final String FIND_OPERATOR = "findOperator";

	/** The Constant COMPANY_NAME. */
	private static final String COMPANY_NAME = "Tunise Transit";


	/** The company service. */
	@Autowired
	private CompanyService companyService;


	/**
	 * Find operator.
	 */
	@Test
	public void findOperator()
	{
		final List<Company> companies = companyService.findOperator();
		assertNotNull(companies);
		assertTrue(companies.size() == Constants.ONE);
		assertTrue(COMPANY_NAME.equals(companies.get(Constants.ZERO).getCompanyName()));
		LOG.info(FIND_OPERATOR);
	}

}

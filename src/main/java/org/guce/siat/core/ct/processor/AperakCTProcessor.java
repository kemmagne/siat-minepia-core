package org.guce.siat.core.ct.processor;

import java.util.HashMap;
import java.util.Objects;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.guce.siat.core.ct.service.CtDocumentReciever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * The Class AperakCTProcessor.
 */
public class AperakCTProcessor implements Processor
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AperakCTProcessor.class);

	/** The ct document reciever. */
	@Autowired
	private CtDocumentReciever ctDocumentReciever;


	/*
	 * (non-Javadoc)
	 *
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void process(final Exchange exchange) throws Exception
	{
		final Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		LOG.error("Send Aperak C due to : " + Objects.toString(cause.getMessage()));
		final HashMap<String, Object> ebxmlBytes = (HashMap<String, Object>) exchange.getIn().getBody();
		final HashMap<String, Object> result = ctDocumentReciever.generateAperakCFile(ebxmlBytes, cause.getMessage());
		exchange.getOut().setBody(result);
	}

}

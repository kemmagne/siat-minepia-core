package org.guce.siat.core.ct.processor;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.logging.Level;

import javax.persistence.PersistenceException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.guce.siat.common.utils.exception.ValidationException;
import org.guce.siat.core.ct.service.CtDocumentReciever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.SAXException;

/**
 * The Class RetrieveCTMessageProcessor.
 */
public class RetrieveCTMessageProcessor implements Processor {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(RetrieveCTMessageProcessor.class);

    /**
     * The ct document reciever.
     */
    @Autowired
    private CtDocumentReciever ctDocumentReciever;

    /**
     * (non-Javadoc)
     *
     * @param exchange
     * @throws org.guce.siat.common.utils.exception.ValidationException
     * @throws java.io.IOException
     * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
     */
    @SuppressWarnings("unchecked")
    @Override
    public void process(final Exchange exchange) throws ValidationException, IOException {
        final HashMap<String, Object> ebxmlBytes = (HashMap<String, Object>) exchange.getIn().getBody();
        LOG.warn("####start Bean Process result : Done");
        try {
            final HashMap<String, Object> result = ctDocumentReciever.uploadEbxmlFile(ebxmlBytes);
            if (result != null) {
                exchange.getOut().setBody(result);
            }
            LOG.warn("####end Bean Process result : Done");
        } catch (final ValidationException | ParseException | TransformerException | SOAPException | SAXException
                | ParserConfigurationException | JAXBException | XPathExpressionException | IndexOutOfBoundsException
                | PersistenceException | NullPointerException e) {
            java.util.logging.Logger.getLogger(RetrieveCTMessageProcessor.class.getName()).log(Level.SEVERE, null, e);
            LOG.error("####Process Recieved exception : " + e.getMessage(), e);
            throw new ValidationException(e.getMessage());

        }
    }
}


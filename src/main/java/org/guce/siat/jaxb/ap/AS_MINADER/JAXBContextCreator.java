package org.guce.siat.jaxb.ap.AS_MINADER;

import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class JAXBContextCreator.
 */
public final class JAXBContextCreator {

	/**
	 * The Constant LOG.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(JAXBContextCreator.class);

	/**
	 * The instance.
	 */
	private static JAXBContext instance;

	/**
	 * Instantiates a new JAXB context creator.
	 */
	private JAXBContextCreator() {
	}

	/**
	 * Gets the single instance of JAXBContextCreator.
	 *
	 * @return single instance of JAXBContextCreator
	 */
	public static synchronized JAXBContext getInstance() {
		try {
			if (instance == null) {
				instance = JAXBContext.newInstance(DOCUMENT.class);
			}
		} catch (final JAXBException e) {
			LOG.error(Objects.toString(e), e);
		}
		return instance;
	}

}

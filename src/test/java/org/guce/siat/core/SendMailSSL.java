package org.guce.siat.core;

import java.util.Objects;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class SendMailSSL.
 */
public class SendMailSSL {

	/**
	 * The Constant LOG.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(SendMailSSL.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final String to = "chawki.mguedmini@businessdecision.com";//change accordingly

		//Get the session object
		final Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		final Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("chawki.mguedmini@gmail.com", "chaw$007");//change accordingly
			}
		});

		//compose message
		try {
			final MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("chawki.mguedmini@gmail.com"));//change accordingly
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello");
			message.setText("Testing.......");

			//send message
			Transport.send(message);

			LOG.info("message sent successfully");
		} catch (final MessagingException e) {
			LOG.info("Error sending mail : " + Objects.toString(e), e);
			throw new RuntimeException(e);
		}

	}
}

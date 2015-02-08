package org.shirdrn.spring.jms.integration;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

public class ReceiveMessageListener implements MessageListener {

	private static final Logger LOG = Logger.getLogger(ReceiveMessageListener.class);
	
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage text = (TextMessage) message;
			try {
				LOG.info("Received message:" + text.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
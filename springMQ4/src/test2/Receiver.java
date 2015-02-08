package test2;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

public class Receiver {
	private JmsTemplate jmsTemplate;

	// getter and setter
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	/**
	 * 构造函数
	 */
	public Receiver() {
	}

	public String receiveMessage() {
		String my = "";
		MapMessage message = (MapMessage) jmsTemplate.receive();
		try {
			my = message.getString("lastName");
		} catch (JMSException e) {
			throw JmsUtils.convertJmsAccessException(e);
		}
		return my;
	}

}
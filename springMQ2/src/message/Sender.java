package message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class Sender {
	private JmsTemplate jmsTemplate;
	public void setJmsTemplate(JmsTemplate jmsTemplate){
		this.jmsTemplate=jmsTemplate;
	}
	
	public void send(final String text){
		jmsTemplate.send(new MessageCreator(){
			public Message createMessage(Session session)throws JMSException{
				return session.createTextMessage(text);
			}
		});
	}
}

package com.andyao.activemq;

import javax.jms.Topic;

import org.springframework.jms.core.JmsTemplate;

public class TopicMessageProducer {
    
    private JmsTemplate template;

	private Topic destination;

	public void setTemplate(JmsTemplate template) {
		this.template = template;
	}

	public void setDestination(Topic destination) {
		this.destination = destination;
	}

	public void send(FooMessage message) {
		template.convertAndSend(this.destination, message);
	}
}

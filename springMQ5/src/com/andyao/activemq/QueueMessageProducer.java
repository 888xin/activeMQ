package com.andyao.activemq;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;

/**
 * Date: 2008-8-28
 * Time: 17:14:23
 */
public class QueueMessageProducer {

    private JmsTemplate template;

    private Queue destination;

    public void setTemplate(JmsTemplate template) {
        this.template = template;
    }

    public void setDestination(Queue destination) {
        this.destination = destination;
    }

    public void send(FooMessage message) {
        template.convertAndSend(this.destination, message);
    }

}

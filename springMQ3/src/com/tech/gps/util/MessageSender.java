package com.tech.gps.util;

import org.springframework.jms.core.JmsTemplate;

 
public class MessageSender {  
    
    private JmsTemplate jmsTemplate;  
  
    public void sendMessage(String msg){  
       
        jmsTemplate.convertAndSend(msg);  
    }

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}  
 
}  
 
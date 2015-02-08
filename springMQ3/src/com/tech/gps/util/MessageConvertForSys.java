package com.tech.gps.util;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TopicPublisher;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

public class MessageConvertForSys implements MessageConverter {  
    
    public Message toMessage(Object object, Session session)  
            throws JMSException, MessageConversionException {  
    	
        System.out.println("sendMessage:"+object.toString());  
        ObjectMessage objectMessage = session.createObjectMessage();  
        objectMessage.setStringProperty("key",object.toString());  
          
        return objectMessage;  
    }  
     
    public Object fromMessage(Message message) throws JMSException,  
            MessageConversionException {  
    	
       
        ObjectMessage objectMessage = (ObjectMessage) message;  
        return objectMessage.getObjectProperty("key");  
    }
 
} 

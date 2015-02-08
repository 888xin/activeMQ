package com.tech.gps.util;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

public class MessageReceiver implements MessageListener {  
      
    public void onMessage(Message m) {  
    	
        ObjectMessage om = (ObjectMessage) m;  
        try {  
            String key = om.getStringProperty("key"); 
            System.out.println(" ");
            System.out.println("receiveMessage:"+key);    
            
        } catch (JMSException e) {  
            e.printStackTrace();  
        }  
    }

	 
}  

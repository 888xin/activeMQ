package com.andyao.activemq;

/**
 * Date: 2008-8-28
 * Time: 17:10:34
 */
public class QueueConsumer {

    public void receive(FooMessage message) {
		System.out.println("*************************************** Queue : " + message.getId());
	}
    
}

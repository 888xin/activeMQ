package com.andyao.activemq;

public class TopicConsumerB {

	public void receive(FooMessage message) {
		System.out.println("*************************************** Topic B : " + message.getId());
	}
}

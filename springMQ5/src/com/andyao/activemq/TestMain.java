package com.andyao.activemq;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.generic.GenericBeanFactoryAccessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ListableBeanFactory lsb = new ClassPathXmlApplicationContext("classpath:com/andyao/activemq/applicationContext-activemq.xml");
		GenericBeanFactoryAccessor gba = new GenericBeanFactoryAccessor(lsb);
		TopicMessageProducer fmpa = gba.getBean("topicMessageProducer");
		QueueMessageProducer fmpb = gba.getBean("queueMessageProducer");
		int count = 1;
		while (true) {
			FooMessage fm = new FooMessage();
			fm.setId(count);
			fmpa.send(fm);
			fmpb.send(fm);
			count ++;
		}
	}
}

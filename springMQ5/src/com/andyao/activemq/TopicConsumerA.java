package com.andyao.activemq;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.jms.support.converter.SimpleMessageConverter;

/**
 * 使用多线程接受消息
 */
public class TopicConsumerA {

	ExecutorService exec = Executors.newFixedThreadPool(10);
	SimpleMessageConverter simpleMessageConverter;

	public void receive(final FooMessage message) {
		System.out.println(Thread.currentThread().getName());
		exec.submit((new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("************************************** Topic A : " + message.getId());
			}
		}));
	}

}

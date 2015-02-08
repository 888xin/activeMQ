package com.andyao.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/andyao/listener/*.xml");
		TestBean tb = (TestBean)ctx.getBean("testBean");
		tb.go();
	}
}

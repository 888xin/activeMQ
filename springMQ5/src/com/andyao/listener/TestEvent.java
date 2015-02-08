package com.andyao.listener;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
	public TestEvent(Object source) {
		super(source);
	}

	public void go () {
		System.out.println("***********************************************");
		for (int i =0; i < 999; i ++) {
			System.out.println("-----------------------------------------------: " + i);
		}
	}
}

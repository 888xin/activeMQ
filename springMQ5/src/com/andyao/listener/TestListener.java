package com.andyao.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class TestListener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof TestEvent) {
			TestEvent cast = (TestEvent)event;
			cast.go();
		}
	}

}

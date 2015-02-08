package com.andyao.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service("testBean")
public class TestBean implements ApplicationEventPublisherAware {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;

	public void go () {
			TestEvent event = new TestEvent(this);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
			applicationEventPublisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

}

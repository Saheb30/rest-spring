package org.saheb.listener;

import org.saheb.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private CmsService service;
	@Override
	public void onApplicationEvent(final ContextRefreshedEvent event) {
		System.out.println("inside MyListener ContextRefreshedEvent::"+service);
		service.prepareDataWithoutCaching();
	}
}
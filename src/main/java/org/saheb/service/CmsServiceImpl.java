package org.saheb.service;

import org.saheb.beans.Employee;
import org.saheb.cache.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CmsServiceImpl implements CmsService {
	@Autowired
	private CacheService cacheService;
	/*@Value( "${message}" )
	private String message;*/
	@Autowired
	private Environment env;
	
	@Override
	public Employee getPageContent(int pageNum) {
		System.out.println("inside serviceImpl");
		return cacheService.getPageContent(pageNum);
	}
	@Override
	public void prepareData() {
		cacheService.prepareData();
	}
	@Override
	public boolean prepareDataWithoutCaching() {
		getProperty("message");
		cacheService.prepareDataWithoutCaching();
		for(int i=1; i<=3; i++ ) {
			cacheService.getPageContent(i);
		}
		return true;
	}
	private String getProperty(String key) {
		System.out.println("Env Active Profile::"+env.getProperty(key));
		return env.getProperty(key);
	}

}

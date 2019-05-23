package org.saheb.service;

import org.saheb.beans.Employee;
import org.saheb.dao.CmsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CmsServiceImpl implements CmsService {
	@Autowired
	private CmsDao cmsDao;
	@Cacheable(value="cmsCache", key="#pageNum", unless="#result==null")
	@Override
	public Employee getPageContent(int pageNum) {
		System.out.println("inside serviceImpl");
		return cmsDao.getPageContent(pageNum);
	}

}

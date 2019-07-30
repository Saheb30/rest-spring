package org.saheb.cache;

import org.saheb.beans.Employee;
import org.saheb.dao.CmsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class CacheServiceImpl implements CacheService {
	@Autowired
	private CmsDao cmsDao;
	@Autowired
	private CacheManager cacheManager;
	@Cacheable(value="cmsCache", key="#pageNum", unless="#result==null") //"key = "#p0" means first argument"
	@Override
	public Employee getPageContent(int pageNum) {
		System.out.println("inside CacheServiceImpl cache miss");
		return cmsDao.getPageContent(pageNum);
	}
	@Override
	public void prepareData() {
		for(int i=1;i<=3;i++) {
			cacheManager.getCache("cmsCache").put(i, cmsDao.prepareData(i, "abc-"+i));
		}
	}
	@Override
	public boolean prepareDataWithoutCaching() {
		cmsDao.prepareData();
		return true;
	}
}

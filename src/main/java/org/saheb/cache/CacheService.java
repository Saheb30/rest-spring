package org.saheb.cache;

import org.saheb.beans.Employee;

public interface CacheService {
	public Employee getPageContent(int pageNum);
	public void prepareData();
	public boolean prepareDataWithoutCaching();
}

package org.saheb.service;

import org.saheb.beans.Employee;

public interface CmsService {
	public Employee getPageContent(int pageNum);
	public void prepareData();
	public boolean prepareDataWithoutCaching();
}

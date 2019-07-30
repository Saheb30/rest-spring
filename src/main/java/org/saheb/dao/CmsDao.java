package org.saheb.dao;

import org.saheb.beans.Employee;

public interface CmsDao {
	public Employee getPageContent(int pageNum);
	public Employee prepareData(int id, String name);
	public boolean prepareData();
}

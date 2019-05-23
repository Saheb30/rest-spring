package org.saheb.dao;

import java.util.HashMap;
import java.util.Map;

import org.saheb.beans.Employee;
import org.springframework.stereotype.Service;

@Service
public class CmsDaoImpl implements CmsDao {
	private static final Map<Integer, Employee> empMap = new HashMap<>();
	@Override
	public Employee getPageContent(int pageNum) {
		System.out.println("inside daoImpl");
		return empMap.get(pageNum);
	}
	public void prepareData() {
		empMap.put(1, new Employee(1,"Saheb"));
		empMap.put(2, new Employee(1,"Sahil"));
		empMap.put(3, new Employee(1,"Rahul"));
	}

}

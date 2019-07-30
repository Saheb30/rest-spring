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
	public Employee prepareData(int id, String name) {
		Employee emp = new Employee(id,name);
		empMap.put(id, emp);
		return emp;
	}
	public boolean prepareData() {
		for(int i=1; i<=3; i++ ) {
			Employee emp = new Employee(i,"abc-"+i);
			empMap.put(i, emp);
		}
		return true;
	}

}

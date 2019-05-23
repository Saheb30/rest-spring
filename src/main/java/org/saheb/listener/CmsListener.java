package org.saheb.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.saheb.dao.CmsDao;
import org.springframework.beans.factory.annotation.Autowired;

@WebListener
public class CmsListener implements ServletContextListener {
	@Autowired
	private CmsDao cmsDao;
	@Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("inside CmsListener");
        cmsDao.prepareData();
    }
}

package org.saheb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ServletComponentScan(basePackages="org.saheb.listener")
@ComponentScan(basePackages="org.saheb")
@EnableCaching
public class RestSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestSpringApplication.class, args);
	}
	//Instantiate cacheManager explicitly. If no cache provider is mentioned in classpath spring
	//will use Simple cache implemention using ConcurrenthHashMap
	//Instead of the below implementation if we declare some cache property in application.properties file
	//spring-boot will auto configure for us
	/*public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("cmsCache");
	}*/
	
}

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
		System.setProperty("spring.profiles.default", "dev");
		SpringApplication.run(RestSpringApplication.class, args);
	}
}

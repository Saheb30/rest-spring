package org.saheb.controller;

import org.saheb.beans.Employee;
import org.saheb.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmsController {
	@Autowired
	private CmsService cmsService;
	
	@GetMapping(value = "/members/{pageNum}")
	public ResponseEntity<Employee> getPageContent(@PathVariable("pageNum") Integer pageNum) {
		Employee emp = cmsService.getPageContent(pageNum);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}

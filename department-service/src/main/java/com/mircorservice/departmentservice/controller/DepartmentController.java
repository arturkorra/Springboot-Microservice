package com.mircorservice.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mircorservice.departmentservice.entity.Department;
import com.mircorservice.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Department> saveDeparment(@RequestBody Department department) {
		
		return new ResponseEntity<Department>(departmentService.saveDepartment(department),HttpStatus.OK);
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
		
		return new ResponseEntity<Department>(departmentService.findById(departmentId),HttpStatus.OK);
		
	}

}

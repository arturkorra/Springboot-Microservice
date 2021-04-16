package com.mircorservice.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mircorservice.departmentservice.entity.Department;
import com.mircorservice.departmentservice.repository.DepartmentReposity;
@Service
public class DepartmentService {
	@Autowired
	private DepartmentReposity departmentReposity;

	public Department saveDepartment(Department department) {
		return departmentReposity.save(department);
	}

	public Department findById(Long id) {
		return departmentReposity.findById(id).get();
	}
	
	
	

}

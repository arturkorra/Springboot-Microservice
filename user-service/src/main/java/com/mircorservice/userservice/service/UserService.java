package com.mircorservice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mircorservice.userservice.ValueObjects.Department;
import com.mircorservice.userservice.ValueObjects.ResponseTemplateUserObjects;
import com.mircorservice.userservice.entity.User;
import com.mircorservice.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateUserObjects findById(Long usertId) {
		ResponseTemplateUserObjects responseTemplateUserObjects = new ResponseTemplateUserObjects();
		User user = userRepository.findById(usertId).get();
		responseTemplateUserObjects.setUser(user);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		responseTemplateUserObjects.setDepartment(department);
		return responseTemplateUserObjects;
	}

}

package com.mircorservice.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mircorservice.userservice.ValueObjects.ResponseTemplateUserObjects;
import com.mircorservice.userservice.entity.User;
import com.mircorservice.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);
		
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseTemplateUserObjects> findUserById(@PathVariable("id") Long usertId) {
		
		return new ResponseEntity<ResponseTemplateUserObjects>(userService.findById(usertId),HttpStatus.OK);
		
	}

}

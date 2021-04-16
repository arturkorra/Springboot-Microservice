package com.mircorservice.userservice.ValueObjects;

import com.mircorservice.userservice.entity.User;

public class ResponseTemplateUserObjects {
	private User user;
	private Department department;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}

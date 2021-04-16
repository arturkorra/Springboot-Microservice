package com.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	@GetMapping("/userFallBack")
	public String userFallBack() {
		return "User Service is down";
	}
	
	@GetMapping("/departmentFallBack")
	public String departmentFallBack() {
		return "Department Service is down";
	}
}
package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("/test")
	public String getMethodName() {
		return "Alok Mishra";
	}
}

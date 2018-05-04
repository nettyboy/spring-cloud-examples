package com.zhht.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testconfig")
public class ConfigTestController {

	@Value("${profile}")
	private String applicationProfile;
	
	@GetMapping("/getprofile")
	public String getProfile() {
		return applicationProfile;
	}
}

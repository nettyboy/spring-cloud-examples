package com.zhht.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testconfig")
@RefreshScope
public class ConfigTestController {

	@Value("${profile}")
	private String applicationProfile;
	
	@Value("${profile_config}")
	private String profileConfig;
	
	@GetMapping("/getprofile")
	public String getProfile() {
		return applicationProfile;
	}
	
	@RequestMapping("/profileConfig")
	public String getProfileConfig() {
	    return profileConfig;
	}
}

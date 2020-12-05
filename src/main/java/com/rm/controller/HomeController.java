package com.rm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}

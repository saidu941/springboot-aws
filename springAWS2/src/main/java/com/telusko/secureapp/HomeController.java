package com.telusko.secureapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping("/")
	public String getHi() {
		return "Hello World...!";
	}
}

package com.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/Home")
//	 This is Handler only .
	public String home() {
		return "I am rishabh 123 ";
	}
}

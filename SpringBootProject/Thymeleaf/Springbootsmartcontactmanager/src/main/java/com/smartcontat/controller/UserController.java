package com.smartcontat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") 
public class UserController {
	
	@RequestMapping("/index") 
	public String user_dashboard() {
		
		
		return "normal/user_dashboard";
		
	}
	

}

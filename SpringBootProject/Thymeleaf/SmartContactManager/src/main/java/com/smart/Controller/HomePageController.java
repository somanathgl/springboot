package com.smart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {
	@RequestMapping("/homepage")
	@ResponseBody
public String homepage() {
		
		return "home";
	}
	
	@RequestMapping("/basepage")	
public String basepage() {
		
		return "base";
	}
@RequestMapping("/user")
public String user() {
		
		return "user";
	}
}

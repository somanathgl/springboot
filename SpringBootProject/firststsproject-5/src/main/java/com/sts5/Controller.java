package com.sts5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/test")
	@ResponseBody
	public String home() {
		
		return "this is home page";
		
	}
}

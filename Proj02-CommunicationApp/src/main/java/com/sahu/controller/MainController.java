package com.sahu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/welcome")
	public String showHomePage() {
		return "home";
	}
	
}

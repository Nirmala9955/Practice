package com.sahu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sahu.service.IWishMessageGenerator;

@Controller
public class WIshMessageGenerateController {

	@Autowired
	private IWishMessageGenerator generator;
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping("/getMessage")
	public ModelAndView showMessage() {
		//user service
		String message = generator.generateWishMessage();
	
		return new ModelAndView("display", "wishMessage", message);
	}
	
}

package com.sahu.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class TestController {

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		//add data to map object
		map.put("name", "Mr. Dan");
		map.put("age", 40);
		map.put("address", "USA");
		map.put("nickNames", new String[] {"D", "Jhon", "DON", "KING"});
		map.put("mobileNos", Set.of(4546509865349l, 46527349524l));
		map.put("subjectExpert", List.of("Java", "Spring", "Spring Boot", "Microservice"));
		map.put("ids", Map.of("Aadhar", 34343223l, "Voter Id", 3435333l, "Pan No", 553334l));
		//return LVN
		return "show_report";
	}
}

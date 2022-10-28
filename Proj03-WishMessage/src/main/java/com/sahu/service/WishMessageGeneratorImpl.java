package com.sahu.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageGeneratorImpl implements IWishMessageGenerator {

	@Override
	public String generateWishMessage() {
		LocalDateTime dateTime = LocalDateTime.now();
		//get current hour
		int hour = dateTime.getHour();
		if (hour<12) 
			return "Good Morning";
		else if (hour<16) 
			return "Good Afternoon";
		if (hour<20) 
			return "Good Evening";
		else
			return "Good Night";
	}

}

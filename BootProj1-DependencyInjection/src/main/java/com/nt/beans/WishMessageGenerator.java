package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired  //field injection
	private LocalDateTime date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		//get current hour of the day
		int hour=date.getHour(); //gives 0 to 23 hr format
		
		//generate wish message
		if(hour<12)
			return "good morning..."+user; 
		else if(hour<16)
			return "good afternoon..."+user;
		else if(hour<20)
			return "good evening..."+user;
		else 
			return "good night..."+user;
		
	}
	

}

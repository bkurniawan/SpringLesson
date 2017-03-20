package com.personal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	public FortuneService fortuneService;
		
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Skipping for 30 minutes";
	}

	@Override
	public String getDailyFortuneMessage() {
		return fortuneService.getFortuneMessage();
	}

}

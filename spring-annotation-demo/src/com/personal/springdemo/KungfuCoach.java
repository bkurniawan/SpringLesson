package com.personal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("killerCoach")
@Component
public class KungfuCoach implements Coach {

	public FortuneService fortuneService;
	
	@Autowired
	public KungfuCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "100 Left Kicks";
	}

	@Override
	public String getDailyFortuneMessage() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneMessage();
	}

}

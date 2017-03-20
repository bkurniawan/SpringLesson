package com.personal.springdemo;


public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim like hell";
	}

	@Override
	public String getDailyFortuneMessage() {
		return fortuneService.getFortuneMessage();
	}

}

package com.personal.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public BaseballCoach(){
		
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyPractice() {
		return "30 minutes of batting practice";
	}

	@Override
	public String getNutritionAdvice() {
		return "Drink a lot!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

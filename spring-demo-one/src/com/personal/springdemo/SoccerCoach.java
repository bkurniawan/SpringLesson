package com.personal.springdemo;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	private String myField;
	
	public SoccerCoach(FortuneService thefs) {
		fortuneService = thefs;
	}
	
	@Override
	public String getDailyPractice() {
		return "30 minutes of kicking the ball";
	}

	@Override
	public String getNutritionAdvice() {
		return "No Fastfood!";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it!!! " + fortuneService.getFortune();
	}

	public void setMyField(String myField) {
		this.myField = myField;
	}

	public String getMyField() {
		return myField;
	}
	
	
	public void myUnLoadMethod(){
		System.out.println("We are inside the Destroy Method of the bean - myUnLoadMethod");
	}

	public void myLoadMethod(){
		System.out.println("We are inside the Init Method of the bean - myLoadMethod");
	}
}

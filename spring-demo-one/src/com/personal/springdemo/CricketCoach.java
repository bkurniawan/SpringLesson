package com.personal.springdemo;

public class CricketCoach implements Coach {


	private FortuneService fortuneService; 
	private String email;
	private String teamName;
	
	private String email2;
	private String teamName2;
	
	
	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getTeamName2() {
		return teamName2;
	}

	public void setTeamName2(String teamName2) {
		this.teamName2 = teamName2;
	}

	public String getEmail() {
		return email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("We are inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("We are inside no-arg constructor");
	}
	
	@Override
	public String getDailyPractice() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getNutritionAdvice() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

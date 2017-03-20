package com.personal.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${foo.email}")
	public String email;
	
	@Value("${foo.team}")
	public String teamName;

	
	public String getEmail() {
		return email;
	}

	public String getTeamName() {
		return teamName;
	}

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

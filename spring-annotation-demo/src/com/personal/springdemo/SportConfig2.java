package com.personal.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig2 {

	//define fortuneService bean
	@Bean
	public FortuneService optimistFortuneService(){
		return new OptimistFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(optimistFortuneService());
	}

	
}

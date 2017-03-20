package com.personal.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
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

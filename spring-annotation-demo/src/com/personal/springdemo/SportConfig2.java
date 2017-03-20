package com.personal.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig2 {
	// define bean for the sad fortune service
	@Bean
	public SadFortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for the swim coach
	@Bean
	public Coach swimCoach(){
		return new SwimCoach (sadFortuneService());
	}
}

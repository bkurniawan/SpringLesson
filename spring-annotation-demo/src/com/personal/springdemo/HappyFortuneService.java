package com.personal.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneMessage() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}

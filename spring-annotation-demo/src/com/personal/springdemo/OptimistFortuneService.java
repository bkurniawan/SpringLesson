package com.personal.springdemo;

public class OptimistFortuneService implements FortuneService {

	@Override
	public String getFortuneMessage() {
		return "Today is beautiful day";
	}

}

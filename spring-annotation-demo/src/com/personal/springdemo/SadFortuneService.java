package com.personal.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneMessage() {
		return "Today is a beautiful day";
	}

}

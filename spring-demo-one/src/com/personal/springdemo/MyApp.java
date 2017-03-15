package com.personal.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach coach = new BaseballCoach();
		System.out.println(coach.getDailyPractice());
	}

}

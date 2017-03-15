package com.personal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyPractice());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeamName());

		
		System.out.println(theCoach.getEmail2());
		System.out.println(theCoach.getTeamName2());
		
		
		// close the context
		context.close();
	}

}

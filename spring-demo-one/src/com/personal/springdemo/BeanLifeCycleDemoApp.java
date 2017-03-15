package com.personal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve the bean from spring container
		SoccerCoach theCoach = context.getBean("myBean", SoccerCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyPractice());
		
		
		// close the context
		context.close();
	}

}

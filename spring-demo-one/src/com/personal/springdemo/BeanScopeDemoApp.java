package com.personal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		SoccerCoach theCoach = context.getBean("myBean", SoccerCoach.class);
		SoccerCoach theOtherCoach = context.getBean("myBean", SoccerCoach.class);
		
		theCoach.setMyField("Bobby");
		theOtherCoach.setMyField("Betty");
		
		boolean result = theCoach == theOtherCoach;
		
		System.out.println(theCoach.getMyField());
		System.out.println(theOtherCoach.getMyField());
		
		System.out.println(theCoach);
		System.out.println(theOtherCoach);
		System.out.println("Is theCouch and theOtherCouch the same? Answer : " + result );
		
		context.close();
	}

}

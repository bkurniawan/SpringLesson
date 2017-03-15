package com.personal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("kungfuCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortuneMessage());
		
		context.close();
		
	}

}

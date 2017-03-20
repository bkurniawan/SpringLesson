package com.personal.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotationDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach = context.getBean("kungfuCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortuneMessage());
		
		context.close();
		
	}

}

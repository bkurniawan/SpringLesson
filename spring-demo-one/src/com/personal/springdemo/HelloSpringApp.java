package com.personal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load Spring COntainer from Configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from Spring container
		Coach theCoach = context.getBean("myBean", Coach.class);
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyPractice());
		System.out.println(theCoach.getNutritionAdvice());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}

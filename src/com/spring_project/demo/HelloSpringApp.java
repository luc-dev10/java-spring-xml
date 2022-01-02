package com.spring_project.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from container
		Coach baseBallCoach = context.getBean("myCoach", Coach.class);
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);

		// check if runs
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());

		// check the fortune DI
		System.out.println(baseBallCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyFortune());

		// close context
		context.close();
	}

}

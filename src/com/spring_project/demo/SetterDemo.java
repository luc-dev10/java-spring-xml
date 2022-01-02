package com.spring_project.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// check the fortune DI
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getDailyFortune());

		// close context
		context.close();
	}

}

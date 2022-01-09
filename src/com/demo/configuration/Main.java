package com.demo.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		// call method from bean
		System.out.println(swimCoach.getName());

		// print fortune of service
		System.out.println(swimCoach.getFortune());

		// get team
		System.out.println(swimCoach.getEmail());

		// get email
		System.out.println(swimCoach.getTeam());

		// close context
		context.close();
	}

}

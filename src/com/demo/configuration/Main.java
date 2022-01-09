package com.demo.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

		ICoach swimCoach = context.getBean("swimCoach", ICoach.class);

		// call method from bean
		System.out.println(swimCoach.getName());

		// print fortune of service
		System.out.println(swimCoach.getFortune());

		// close context
		context.close();
	}

}

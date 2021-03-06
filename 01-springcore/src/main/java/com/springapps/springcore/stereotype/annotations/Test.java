package com.springapps.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/stereotype/annotations/config.xml");

		// get the hospital bean from the container
		Coach coach1 = (Coach) context.getBean("supercoach");

		// print the bean
		System.out.println(coach1);
		

		Coach coach2 = (Coach) context.getBean("supercoach");
		
	}

}
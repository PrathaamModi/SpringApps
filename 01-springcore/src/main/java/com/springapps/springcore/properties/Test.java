package com.springapps.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/properties/config.xml");
		
		//get the employee bean from the container
		Locations loc=(Locations) context.getBean("Locations");
		
		System.out.println(loc.getDialect().getClass());
		
		
		//print the bean 		
		System.out.println(loc);
	}

}

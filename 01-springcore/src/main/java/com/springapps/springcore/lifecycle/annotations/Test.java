package com.springapps.springcore.lifecycle.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/lifecycle/annotations/config.xml");
		
		//get the employee bean from the container
		Patient patient=(Patient) context.getBean("patient");
		
		
		
		
		//print the bean 		
		System.out.println(patient);
		
		context.registerShutdownHook();
	}

}

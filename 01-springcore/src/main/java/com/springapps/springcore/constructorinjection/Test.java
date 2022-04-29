package com.springapps.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/constructorinjection/config.xml");
		
		//get the employee bean from the container
		Address address=(Address) context.getBean("address");
		
		
		
		
		//print the bean 		
		System.out.println(address);
		
		context.registerShutdownHook();
	}

}

package com.springapps.springcore.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/autowiring/config.xml");
		
		//get the employee bean from the container
		Employee emp=(Employee) context.getBean("emp");
		
		
		
		
		//print the bean 		
		System.out.println(emp);
	}

}

package com.springapps.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/stereotype/annotations/config.xml");
		
		//get the employee bean from the container
		Coach coach=(Coach) context.getBean("coach");
		
		
		
		
		//print the bean 		
		System.out.println(coach);
	}

}

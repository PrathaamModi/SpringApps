package com.springapps.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/stereotype/annotations/config.xml");
		
		//get the employee bean from the container
		Coach coach1=(Coach) context.getBean("supercoach");
		Coach coach2=(Coach) context.getBean("supercoach");
		
		
		
		
		//print the bean 		
		System.out.println(coach1.hashCode());
		System.out.println(coach1);
		System.out.println(coach2.hashCode());
		System.out.println(coach2);
	}

}

package com.springapps.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/map/config.xml");
		
		//get the employee bean from the container
		Customer cust=(Customer) context.getBean("Customer");
		
		System.out.println(cust.getProducts().getClass());
		
		
		//print the bean 		
		System.out.println(cust);
	}

}

package com.springapps.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/standalone/collections/config.xml");
		
		//get the employee bean from the container
		ProductList prods=(ProductList) context.getBean("products");
		
		
		
		
		//print the bean 		
		System.out.println(prods);
	}

}

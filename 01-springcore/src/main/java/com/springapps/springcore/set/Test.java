package com.springapps.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/set/config.xml");
		
		//get the employee bean from the container
		CarDealer cardealer=(CarDealer) context.getBean("cardealer");
		
		System.out.println(cardealer.getModels().getClass());
		
		
		//print the bean 		
		System.out.println(cardealer);
	}

}

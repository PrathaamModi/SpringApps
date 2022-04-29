package com.springapps.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/list/config.xml");
		
		//get the employee bean from the container
		Hospital hosp=(Hospital) context.getBean("Hospital");
		
		System.out.println(hosp.getDepartments().getClass());
		
		
		//print the bean 		
		System.out.println(hosp);
	}

}

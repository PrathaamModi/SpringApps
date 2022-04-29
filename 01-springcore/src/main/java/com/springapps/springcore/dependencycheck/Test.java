package com.springapps.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/dependencycheck/config.xml");
		Prescription pres=(Prescription) context.getBean("prescription");
	}

}

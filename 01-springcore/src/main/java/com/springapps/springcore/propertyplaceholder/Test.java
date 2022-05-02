package com.springapps.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/propertyplaceholder/config.xml");

		// get the employee bean from the container
		MyDAO mydao = (MyDAO) context.getBean("mydao");

		// print the bean
		System.out.println(mydao);
	}

}

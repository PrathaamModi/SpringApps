package com.springapps.springcore.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport{
	
	public String play() {
		return ("Playing Cricket");
	}

}

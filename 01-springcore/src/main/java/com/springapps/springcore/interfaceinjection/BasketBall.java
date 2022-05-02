package com.springapps.springcore.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Sport{
	
	public String play() {
		return ("Playing BasketBall");
	}

}

package com.springapps.springcore.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coach {

	@Value("11")
	private int id = 9;

	@Value("Max")
	private String name;

	@Autowired
	@Qualifier("cricket")
	private Sport sport;
	
	
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport=" + sport.play() + "]";
	}

}
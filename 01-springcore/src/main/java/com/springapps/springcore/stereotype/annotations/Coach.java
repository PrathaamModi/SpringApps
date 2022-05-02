package com.springapps.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("supercoach")
@Scope("prototype")
public class Coach {

	
	@Value("11")
	private int id=9;
	@Value("Prathaam")
	private String name="John";

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

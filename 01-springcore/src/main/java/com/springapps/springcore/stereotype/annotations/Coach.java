package com.springapps.springcore.stereotype.annotations;

import org.springframework.stereotype.Component;

@Component
public class Coach {

	private int id;
	private String name;

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

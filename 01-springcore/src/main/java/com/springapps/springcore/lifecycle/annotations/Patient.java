package com.springapps.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the Id setter method");
	}

	@PostConstruct
	public void hi() {
		System.out.println("Inside method Hi");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside method Bye");
	}
}

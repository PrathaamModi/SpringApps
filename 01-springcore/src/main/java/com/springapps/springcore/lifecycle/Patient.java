package com.springapps.springcore.lifecycle;

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
	}
	
	public void hi() {
		System.out.println("Inside method Hi");
		}
	
	public void bye() {
		System.out.println("Inside method Bye");
		}
}

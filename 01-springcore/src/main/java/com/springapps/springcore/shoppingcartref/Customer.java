package com.springapps.springcore.shoppingcartref;

public class Customer {

	private int id;
	private Items items;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", items=" + items + ", getId()=" + getId() + ", getItems()=" + getItems()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

}

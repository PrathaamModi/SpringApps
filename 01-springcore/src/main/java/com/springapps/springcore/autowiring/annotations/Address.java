package com.springapps.springcore.autowiring.annotations;

public class Address {

	private int housenumber;
	private String street;
	private String city;

	@Override
	public String toString() {
		return "Address [housenumber=" + getHousenumber() + ", street=" + getStreet() + ", city=" + getCity() + "]";
	}

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

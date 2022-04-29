package com.springapps.springcore.properties;

import java.util.Properties;

public class Locations {

	private Properties dialect;

	@Override
	public String toString() {
		return "Locations [dialect=" + dialect + ", getDialect()=" + getDialect() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Properties getDialect() {
		return dialect;
	}

	public void setDialect(Properties dialect) {
		this.dialect = dialect;
	}

}

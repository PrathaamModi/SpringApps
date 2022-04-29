package com.springapps.springcore.shoppingcartref;

import java.util.Map;

public class Items {

	private int itemid;
	private String itemname;

	@Override
	public String toString() {
		return "Items [itemid=" + itemid + ", itemname=" + itemname + ", getItemname()=" + getItemname()
				+ ", getItemid()=" + getItemid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

}

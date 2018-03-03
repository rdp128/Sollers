package com.sollers.course.jf.day5;

public class Fruits {

	private String name;
	private int qty;

	public Fruits(int qty, String name) {
		super();
		this.name = name;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}

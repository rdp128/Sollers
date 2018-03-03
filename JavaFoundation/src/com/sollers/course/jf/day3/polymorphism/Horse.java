package com.sollers.course.jf.day3.polymorphism;

class Horse extends Animal {
	public Horse(String name) {
		super(name);
	}

	@Override
	public String sound() {
		return "neigh";
	}
}
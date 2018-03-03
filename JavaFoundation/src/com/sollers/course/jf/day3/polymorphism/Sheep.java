package com.sollers.course.jf.day3.polymorphism;

class Sheep extends Animal {
	public Sheep(String name) {
		super(name);
	}

	@Override
	public String sound() {
		return "baaaa";
	}
}
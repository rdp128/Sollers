package com.sollers.course.jf.day3.polymorphism;

class Cow extends Animal {
	public Cow(String name) {
		super(name);
	}

	@Override
	public String sound() {
		return "moooooo";
	}
}

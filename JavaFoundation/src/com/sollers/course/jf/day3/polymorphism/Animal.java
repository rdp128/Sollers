package com.sollers.course.jf.day3.polymorphism;

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String speak() {
		return name + " says " + sound();
	}

	public abstract String sound();
}
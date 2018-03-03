package com.sollers.course.jf.day3.inheritance.sample2;

public class Fish extends Animal {
	String name;

	public Fish() {
		System.out.println("\nFISH");
	}

	public void setName(String nm) {
		name = nm;
	}

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void play() {
		System.out.println("Fish can play");
	}

}

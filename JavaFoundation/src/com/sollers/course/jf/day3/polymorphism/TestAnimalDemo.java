package com.sollers.course.jf.day3.polymorphism;

public class TestAnimalDemo {
	public static void main(String[] args) {
		Animal h = new Horse("CJ");
		System.out.println(h.speak());
		Animal c = new Cow("Bessie");
		System.out.println(c.speak());
		System.out.println(new Sheep("Little Lamb").speak());
	}
}
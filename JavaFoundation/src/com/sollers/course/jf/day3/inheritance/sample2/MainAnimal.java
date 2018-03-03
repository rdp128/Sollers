package com.sollers.course.jf.day3.inheritance.sample2;

public class MainAnimal {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.setAnimal(4);
		animal.getAnimal();
		animal.walk();
		animal.eat();

		Spider spider = new Spider();
		spider.setAnimal(8);
		spider.getAnimal();
		spider.walk();
		spider.eat();

		Cat cat = new Cat();
		cat.setName("Mueeza");
		cat.getName();
		cat.setAnimal(4);
		cat.getAnimal();
		cat.walk();
		cat.play();
		cat.eat();

		Fish fish = new Fish();
		fish.setName("Rocky");
		fish.getName();
		fish.setAnimal(0);
		fish.getAnimal();
		fish.play();
		fish.walk();
		fish.eat();

	}
}

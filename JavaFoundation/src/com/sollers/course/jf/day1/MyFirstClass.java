package com.sollers.course.jf.day1;

public class MyFirstClass {

	String myClassVariable = "classvariable";
	static String myStaticClassVarilable = "myStaticVarilable";
	
	//static class level variable	
	static String id;
	static String name;

	public MyFirstClass() {

	}

	public MyFirstClass(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("This is my first class - in main method");

		MyFirstClass myFirstClass = new MyFirstClass();
		myFirstClass.listenToClass();
		System.out.println(myFirstClass.myStaticClassVarilable);

		MyFirstClass myFirstClass1 = new MyFirstClass("1", "name1");
		listenToClass(id, name);
		
		MyFirstClass myFirstClass2 = new MyFirstClass("2", "name2");
		listenToClass(id, name);

		// listenToClass();

	}

	protected static void listenToClass(String id, String name) {
		String myMethodVariable = "methodVariable";
		System.out.println("This is my first class - " + id + " name <> " + name);
	}

	static void listenToClass() {
		String myMethodVariable = "methodVariable";
		System.out.println("This is my first class - " + myMethodVariable);
	}

}

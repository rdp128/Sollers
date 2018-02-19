package com.rohan.bigdata.class1;

public class Class1 {

	String myClassVariable = " class variable";
	static String myStaticVariable = " static variable";

	public static void main(String[] args) {
		System.out.println("This is my first class - in main method");
		Class1 sc = new Class1(); // create instance of class
		sc.listenToClass();
		System.out.println(sc.myClassVariable);

		// listenToClass();
	}

	static void listenToClass() {
		String myMethodVariable = " method variable";
		System.out.println("Rohan Patel");
	}

}

package com.rohan.bigdata.class1;

public class Exercise {

	String ns = "Non static Local variable";// non static class variable
	static String sv = "Static Local variable";// static class variable

	public static void main(String[] args) {
		Exercise es = new Exercise();// new instance of class
		es.staticMethod();// print variable in static method
		es.nonStaticMethod();// print variable in non static method
		System.out.println(es.ns);// print non static class variable
		System.out.println(es.sv);// print static class variable

	}

	static void staticMethod() {
		String sv1 = "Static Method variable";
		System.out.println("Inside Static Method -" + sv);
		System.out.println(sv1);// print static method local variable
	}

	public void nonStaticMethod() {
		String sv2 = "Non Static Method variable";
		System.out.println("Inside Non Static Method -" + ns);
		System.out.println(sv2);// print non static method local variable
	}
}

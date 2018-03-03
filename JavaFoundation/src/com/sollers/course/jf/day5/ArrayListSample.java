package com.sollers.course.jf.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		
		//No Generics
		ArrayList al = new ArrayList();
		
		
		//No Generics
		ArrayList al1 = new ArrayList(25);
		
		Fruits f1 = new Fruits(1,"Mango");
		Fruits f2 = new Fruits(1,"ORange");
		Fruits f3 = new Fruits(1,"Grapes");
		
		ArrayList<Fruits> listOfFruits = new ArrayList<Fruits>();
		listOfFruits.add(f1);
		listOfFruits.add(f2);
		listOfFruits.add(f3);
		
	}

	/*
	 * With Generics -
	 */
	private static void initNormalWay() {
		ArrayList<String> books = new ArrayList<String>();
		books.add("Java Book1");
		books.add("Java Book2");
		books.add("Java Book3");
		System.out.println("Books stored in array list are: " + books);
	}

	private static void initUsingAsList() {
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));
		System.out.println("Elements are:" + obj);
	}

	private static void createArrayListOfStrings() {
		/*
		 * Creation of ArrayList: I'm going to add String elements so I made it of
		 * string type
		 */
		ArrayList<String> obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + obj);

		/* Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Harry");

		System.out.println("Current array list is:" + obj);

		/* Remove element from the given index */
		obj.remove(1);

		System.out.println("Current array list is:" + obj);
	}

	private static void usingLoops() {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		/* Advanced For Loop */
		System.out.println("Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.println(num);
		}

		/* While Loop for iterating ArrayList */
		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		/* Looping Array List using Iterator */
		System.out.println("Iterator");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	private static void usingEnumeration() {
		// create an ArrayList object
		ArrayList<String> arrayList = new ArrayList<String>();

		// Add elements to ArrayList
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Java");
		arrayList.add("DotNet");
		arrayList.add("Perl");

		// Get the Enumeration object
		Enumeration<String> e = Collections.enumeration(arrayList);

		// Enumerate through the ArrayList elements
		System.out.println("ArrayList elements: ");
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}

	private static void sortArrayList() {
		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		/* Sort statement */
		Collections.sort(listofcountries);

		/* Sorted List */
		System.out.println("After Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}
	}
}
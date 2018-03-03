package com.sollers.course.jf.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
	public static void main(String args[]) {

		// Default load factor is 0.75f
		// Threshold = (CurrentCapacity) * (Load Factor)
		// Ex: Threshold=16*0.75=12
		// Capacity will increase from 16 to 32 after the 12th element
		HashSet<String> h = new HashSet<String>(16, 0.5f);
		//HashSet<String> h = new HashSet<String>(16);
		h.add("Test1");
		h.add("Test2");
		h.add("Test3");
		h.add("Test4");

		System.out.println(h);

		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);
	}

	private static void convertHashSetToArray() {
		// Create a HashSet
		HashSet<String> hset = new HashSet<String>();

		// add elements to HashSet
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");

		// Displaying HashSet elements
		System.out.println("HashSet contains: " + hset);

		// Creating an Array
		String[] array = new String[hset.size()];
		hset.toArray(array);

		// Displaying Array elements
		System.out.println("Array elements: ");
		for (String temp : array) {
			System.out.println(temp);
		}
	}

	private static void convertHashSetToArrayList() {
		// Create a HashSet
		HashSet<String> hset = new HashSet<String>();

		// add elements to HashSet
		hset.add("Steve");
		hset.add("Matt");
		hset.add("Govinda");
		hset.add("John");
		hset.add("Tommy");

		// Displaying HashSet elements
		System.out.println("HashSet contains: " + hset);

		// Creating a List of HashSet elements
		List<String> list = new ArrayList<String>(hset);

		// Displaying ArrayList elements
		System.out.println("ArrayList contains: " + list);
	}
}
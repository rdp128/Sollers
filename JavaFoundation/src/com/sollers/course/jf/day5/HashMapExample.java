package com.sollers.course.jf.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		createListOfUsers();

		getListOfUsers();
		
		String temp = getUserValue(3);
		
		System.out.println("Value retrieved is " + temp);
	}

	private static HashMap<Integer, String> createListOfUsers() {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		// Add elements
		hMap.put(1, "Steve");
		hMap.put(2, "Shahid");
		hMap.put(3, "Atif");
		hMap.put(4, "Richard");
		hMap.put(4, "sdfsdfsdf");
		return hMap;
	}

	private static void getListOfUsers() {
		Set set = createListOfUsers().entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println("Value available ? ");
			Map.Entry mEntry = (Entry) it.next();
			System.out.println("Key is " + mEntry.getKey() + " and Value is " + mEntry.getValue());
		}
	}

	private static String getUserValue(int key) {
		Set set = createListOfUsers().entrySet();
		Iterator it = set.iterator();
		String value = "";
		while (it.hasNext()) {
			System.out.println("Value available ? ");
			Map.Entry mEntry = (Entry) it.next();
			System.out.println("Key is " + mEntry.getKey() + " and Value is " + mEntry.getValue());

			int tempKey = (int) mEntry.getKey();
			if (key == tempKey) {
				System.out.println("Key is available  - " + tempKey);
				value = (String) mEntry.getValue();
			}
		}
		return value;
	}

}

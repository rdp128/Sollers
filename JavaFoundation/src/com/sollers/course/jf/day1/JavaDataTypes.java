package com.sollers.course.jf.day1;

public class JavaDataTypes {

	public static void main(String[] args) {

	}

	private static void exampleOne() {
		// 1. Create a byte variable and set it to any valid byte number.
		// 2. Create a short variable and set it to any valid short number.
		// 3. Create a int variable and set it to any valid in number.
		// 4. Create a variable of type long, and make it equal to
		// 50000 + 10 times the sum of the byte, plus the short plus the int

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;

		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println("longTotal = " + longTotal);
		System.out.println("shortTotal = " + shortTotal);
	}

	private static void exampleTwo() {
		// width of int = 32 (4 bytes)
		int myIntValue = 5 / 3;
		// width of float = 32 (4 bytes)
		float myFloatValue = 5f / 3f;
		// width of double = 64 (8 bytes)
		double myDoubleValue = 5d / 3d;

		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue  = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);

		// Convert a given number of pounds to kilograms
		// 1. Create a variable to store the number of pounds
		// 2. Calculate the number of Kilograms for the number above and store in a
		// variable.
		// 3. Print out the result.
		//
		// NOTES: 1 pound is equal to 0.45359237 kilograms.

		double numPounds = 200d;
		double convertedKilograms = numPounds * 0.45359237d;
		System.out.println("Kilograms = " + convertedKilograms);
		// 90.7185
		double pi = 3_000_000.1415927d;
	}

	private static void exampleString() {
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2015";
		System.out.println("myString is equal to " + myString);

		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println("The result is " + numberString);

		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);
		double doubleNumber = 120.47;
		lastString = lastString + doubleNumber;
		System.out.println("LastString value: " + lastString);
	}

}

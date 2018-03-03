package com.sollers.course.jf.day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sollers.course.jf.error.ValidationException;

public class TestFIle {

	public static void main(String[] args) {
		// readFile();
		try {
			String fileName = "f:\\ValidationException.java";
			// readFileThrowException(null);
			readFileThrowNewException(fileName);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Final log - " + e.getMessage());
		}
	}

	// Option 3 - throw new exception (Custom class)
	private static void readFileThrowNewException(String fileName) throws ValidationException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);

			String s = null;// assume - value cmg from somwehere
			if (s == null) {
				throw new NullPointerException();
			}

			int k;
			// byte[] a = new byte[] {(byte)200};
			// byte[] b = "200".getBytes();
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}

			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new ValidationException("Unable to find the file", "ERRORCODE1001");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new ValidationException("Unable to find the file null pointyer", "ERRORCODE1002");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Option 2 - using throws
	private static void readFileThrowException(String fileName) throws Exception, FileNotFoundException {
		FileInputStream fis = null;
		fis = new FileInputStream(fileName);
		int k;
		// byte[] a = new byte[] {(byte)200};
		// byte[] b = "200".getBytes();
		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}

		fis.close();
	}

	// Option 1 - using trey catch block
	private static void readFile() {
		FileInputStream fis = null;
		// code
		try {
			fis = new FileInputStream("f:\\ValidationException.java");
			int k;
			// byte[] a = new byte[] {(byte)200};
			// byte[] b = "200".getBytes();
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}

			fis.close();

		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Exception occured in main method - " + e.getMessage());
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.sollers.course.jf.day3.inheritance.sample1;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.lang.*;

/**
 *
 * @author Marc
 */
public abstract class Profile {

	static int flag = 0;
	static File F;
	static FileWriter fw;
	static BufferedWriter bw;
	String password;
	String Username;
	String role;

	public Profile(String Username, String password, String role) {
		if (flag == 0) {
			createFile();
			flag = 1;
		}
		this.Username = Username;
		this.password = password;
		this.role = role;
		addFile();

	}

	public int login(String username, String password) {
		doneFile();
		Scanner read = null;
		String user = "", pass = "", temp;
		try {
			read = new Scanner(new File("Profiles.txt"));
		} catch (Exception e) {
		}

		while (read.hasNext()) {
			temp = read.next();
			if (temp.equals("Username:")) {
				user = read.next();
				pass = read.next();
				pass = read.next();
			}
			if (user.equals(username) && pass.equals(password)) {
				System.out.println("login sucessful");
				if (username.equals("admin")) {
					return 1;
				} else {
					return 2;
				}
			}
		}
		System.out.println("login not sucessful");
		return 0;
	}

	public void createFile() {

		F = new File("Profiles.txt");
		try {
			fw = new FileWriter(F);
			bw = new BufferedWriter(fw);
		} catch (Exception e) {

		}

	}

	public void addFile() {
		try {
			bw.write(" Username: " + Username + " Password: " + password + " Role: " + role);
		} catch (Exception e) {

		}

	}

	public void overwriteFile(List<Customer> customers) {
		createFile();

		try {
			this.bw.write(" Username: " + Username + " Password: " + password + " Role: " + role);
			for (int i = 0; i < customers.size(); i++) {
				bw.write(" Username: " + customers.get(i).Username + " Password: " + customers.get(i).password
						+ " Role: " + customers.get(i).role);
			}
		} catch (Exception e) {

		}
	}

	public void doneFile() {
		try {
			bw.close();
		} catch (Exception e) {

		}

	}
}

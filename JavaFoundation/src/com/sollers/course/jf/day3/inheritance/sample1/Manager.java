package com.sollers.course.jf.day3.inheritance.sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Profile {

	List<Customer> customers;

	public Manager() {
		super("admin", "admin", "Manager");
		customers = new ArrayList<Customer>();
	}

	public void addAccount() {
		String name, username, Password;
		boolean flag1 = false;
		int flag, flag2 = 0;
		double balance1, balance2 = 21;
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter customer's username");
		username = scan1.nextLine();
		System.out.println("Enter customer's password");
		Password = scan1.nextLine();
		System.out.println("Enter Balance of customers Chequing account");
		balance1 = scan2.nextDouble();
		System.out.println("enter 1 if the customer has a saving account, otherwise enter 0");
		flag = scan3.nextInt();
		if (flag == 1) {
			flag1 = true;
			System.out.println("Enter Balance of customers saving account");
			balance2 = scan2.nextDouble();
		}
		for (int i = 0; i < customers.size(); i++) {
			if (username.equals(customers.get(i).Username)) {
				flag2 = 1;
				break;
			}
		}
		if (balance1 >= 20 && balance2 >= 20 && flag2 == 0) {
			Customer person = new Customer(username, Password, balance1, balance2, flag1);
			customers.add(person);
		} else {
			System.out.println(
					"Account was not created, because balance is less than 20 or because the username already exists");

		}

	}

	public void deleteAccount() {
		String username;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter the username of the customer you would like to delete");
		username = scan1.nextLine();
		int size = customers.size();
		int flag = 0;
		for (int i = 0; i < size; i++) {
			if (customers.get(i).Username.equals(username)) {
				customers.remove(i);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("the customer you tried to delete does not exist");
		}
		this.overwriteFile(customers);
	}

}
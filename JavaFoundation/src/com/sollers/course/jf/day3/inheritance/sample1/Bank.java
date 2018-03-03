package com.sollers.course.jf.day3.inheritance.sample1;

import java.util.Scanner;

public class Bank {

	public static void managerCommands(Manager M) {
		Scanner scan1 = new Scanner(System.in);
		int flag, flag2 = 0;
		while (flag2 != 1) {
			System.out.println("enter 0 if u want to add account");
			System.out.println("enter 1 if u want to delete account");
			System.out.println("enter 2 if u want to logout");
			flag = scan1.nextInt();
			if (flag == 0) {
				M.addAccount();
			} else if (flag == 1) {
				M.deleteAccount();
			} else if (flag == 2) {
				flag2 = 1;
			}
		}

	}

	public static void customerCommands(Customer P) {
		Scanner scan1 = new Scanner(System.in);
		int flag, flag2 = 0;
		while (flag2 != 1) {
			System.out.println("enter 0 if u want transfer");
			System.out.println("enter 1 if u want view balances");
			System.out.println("enter 2 if u want to logout");
			flag = scan1.nextInt();
			if (flag == 0) {
				P.transferFunds();
			} else if (flag == 1) {
				P.displayBalance();
			} else if (flag == 2) {
				flag2 = 1;
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int command;
		int flag, terminate = 0;
		Customer Person = null;
		String username, password;
		Manager marc = new Manager();
		while (terminate != 1) {
			System.out.println("enter 0 if u wanna login");
			System.out.println("enter 1 if u wanna end program");
			command = scan1.nextInt();
			if (command == 0) {
				System.out.println("enter username");
				username = scan2.nextLine();
				System.out.println("enter password");
				password = scan2.nextLine();
				flag = marc.login(username, password);
				marc.overwriteFile(marc.customers);
				if (flag == 2) {
					for (int i = 0; i < marc.customers.size(); i++) {
						if (marc.customers.get(i).Username.equals(username)) {
							Person = marc.customers.get(i);
							break;
						}
					}
					customerCommands(Person);
				} else if (flag == 1) {
					managerCommands(marc);
				}

			} else if (command == 1) {
				terminate = 1;
				marc.doneFile();

			}

		}

	}

}

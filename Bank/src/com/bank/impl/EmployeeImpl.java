package com.bank.impl;

import com.bank.beans.*;
import java.util.Scanner;
import com.bank.beans.Bank;
public class EmployeeImpl {
	public void createCustomer(String un, String pw, String name, String address, String dob) {
		Customer usr = new Customer(un, pw, name, address, dob);
		insertUser(usr);
	}
	public static void createCustomer() {
		System.out.println("* Create a new user: ");
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("** Enter username: ");
	    String userName = scanner.nextLine();  // Read user input
	    System.out.print("** Enter password: ");
	    String passWord = scanner.nextLine();  // Read user input
	    System.out.print("** Enter name: ");
	    String name = scanner.nextLine();  // Read user input
	    System.out.print("** Enter address: ");
	    String address = scanner.nextLine();  // Read user input
	    System.out.print("** Enter date of birth: ");
	    String dob = scanner.nextLine();  // Read user input
	    
	    Customer usr = new Customer(userName, passWord, name, address, dob);
	    insertUser(usr);
	}
	public static void insertUser(User u) {
		Bank.usr.put(u.userName, u);
	}
	public static void deleteCustomer(Customer c) {
		Bank.usr.remove(c.userName);
	}
	public static void manageCustomer(Employee e, Customer c) {
		e.manages.add(c);
		System.out.println("Employee: " + e.userName + " manages Customer: " + c.userName);
	}
	public static void displayManaged(Employee e) {
		System.out.println("Employee: " + e.userName + " manages Customers: ");
		for(Customer c:e.manages) {
			System.out.println(c.toString());
		}
	}
}

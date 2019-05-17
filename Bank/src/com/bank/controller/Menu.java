package com.bank.controller;
import java.util.Scanner;

import com.bank.beans.*;
import com.bank.controller.LoginController;
import com.bank.impl.CustomerImpl;
import com.bank.impl.EmployeeImpl;

public class Menu {
	public static void displayMenu(Employee e) {
		System.out.println("*** Menu Options ***");
		System.out.println("1.) Create Customer");
		System.out.println("2.) Delete Customer");
		System.out.println("3.) Create Employee");
		System.out.println("4.) Logout");
		System.out.println("Enter Option: ");
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    int input = scanner.nextInt();  // Read user input
	    switch(input) {
	    case 1:
	    	EmployeeImpl.createCustomer();
	    	displayMenu(e);
	    	break;
	    case 2:
	    	break;
	    case 3:
	    case 4:
	    	LoginController.userLogin();
	    }
	}
	public static void displayMenu(Customer c) {
		System.out.println("*** Menu Options ***");
		System.out.println("1.) Create Account");
		System.out.println("2.) Show Accounts");
		System.out.println("3.) Make Deposit");
		System.out.println("4.) Make Withdrawal");
		System.out.println("5.) Check Balance");
		System.out.println("6.) Transfer Funds");
		System.out.println("7.) Logout");
		
		System.out.println("Enter Option: ");
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    int input = scanner.nextInt();  // Read user input
	    switch(input) {
	    case 1:
	    	CustomerImpl.createAccount(c);
	    	displayMenu(c);
	    	break;
	    case 2:
	    	CustomerImpl.showAccounts(c);
	    	displayMenu(c);
	    	break;
	    case 3:
	    case 4:
	    case 5:
	    case 6:
	    case 7:
	    	LoginController.userLogin();
	    }
	}
}

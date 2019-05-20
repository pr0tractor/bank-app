package com.bank.beans;
import java.util.HashMap;
import java.util.Scanner;

import com.bank.controller.LoginController;
import com.bank.impl.CustomerImpl;
import com.bank.impl.EmployeeImpl;

public class Menu {
	public static void displayMenu(Employee e) {
		System.out.println("*** Menu Options ***");
		System.out.println("1.) Create Customer");
		System.out.println("2.) Delete Customer");
		System.out.println("3.) Create Employee");
		System.out.println("4.) Manage Customer");
		System.out.println("5.) View Managed Customers");
		System.out.println("6.) Logout");
		System.out.println("Enter Option: ");
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    int input = scanner.nextInt();  // Read user input
	    switch(input) {
	    case 1:
	    	EmployeeImpl.createCustomer();
	    	displayMenu(e);
	    	break;
	    case 2:
	    	HashMap<Integer, Customer> m = new HashMap<Integer, Customer>();
	    	int i = 1;
	    	System.out.println("Select a customer to delete: ");
	    	for(Customer c : e.manages) {
	    		m.put(i, c);
	    		System.out.println(i + ".) " + c);
	    	}
	    	int option = scanner.nextInt();
	    	try {
	    		EmployeeImpl.deleteCustomer(m.get(option));
	    	} catch (NullPointerException ex) {
	    		System.out.println("No customer to delete.");
	    		displayMenu(e);
	    	}
	    	break;
	    case 3:
	    	displayMenu(e);
	    case 4:
	    	System.out.println("Select a customer to manage: ");
	    	HashMap<Integer, Customer> n = new HashMap<Integer, Customer>();
	    	int j = 1;
	    	for(User c : Bank.usr.values()) {
	    		if(c.getClass().getTypeName().equals("com.bank.beans.Customer") && !e.manages.contains(c)) {
	    			n.put(j, (Customer)c);
	    			System.out.println(j + ".) " + c.userName);
	    			j++;
	    		}
	    	}
	    	int k = scanner.nextInt();
	    	EmployeeImpl.manageCustomer(e, n.get(k));
	    	displayMenu(e);
	    case 5: 
	    	EmployeeImpl.displayManaged(e);
	    	displayMenu(e);
	    case 6:
	    	LoginController.userLogin();
	    	break;
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

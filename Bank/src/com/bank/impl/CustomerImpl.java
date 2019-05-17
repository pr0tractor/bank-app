package com.bank.impl;

import java.util.Scanner;
import com.bank.beans.*;

public class CustomerImpl {
	public static void createAccount(Customer c){
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("* Create a new account ");
	    System.out.println("** Please enter the type of account (Checking or Savings):");
	    String accountType = scanner.next();  // Read user input
		switch(accountType) {
		case "Checking":
			CheckingAccount ca = new CheckingAccount();
			c.accounts.put(c.accountNum, ca);
			break;
		case "Savings":
			SavingsAccount sa = new SavingsAccount();
			c.accounts.add(sa);
			break;
		}
	}
	public static void showAccounts(Customer c) {
		int i=1;
		for(Account temp : c.accounts.values()) {
			System.out.println(i + ".) " + temp.toString());
		}
	}
	public static void deposit(Customer c, double ammount) {
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("* Select an account: ");
	    showAccounts(c);
	    int account = scanner.nextInt();  // Read user input
	    c.accounts.
	}
}

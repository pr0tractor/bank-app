package com.bank.controller;

import java.util.Scanner;
import com.bank.beans.*;
public class LoginController {
	public static void userLogin() {
		System.out.println("**** Bank Application ****");
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter username: ");
	    String userName = scanner.nextLine();  // Read user input
	    System.out.print("Enter password: ");
	    String passWord = scanner.nextLine();  // Read user input
	    if(Bank.usr.containsKey(userName)) {

	    	if(passWord.equals(Bank.usr.get(userName).getPassWord())) {
	    		User u = Bank.usr.get(userName);
	    		System.out.println(u.getClass().getTypeName());
	    		switch(u.getClass().getTypeName()){
	    			case "com.bank.beans.Employee":
	    				Employee e = (Employee)u;
	    				Menu.displayMenu(e);
	    				break;
	    			case "com.bank.beans.Customer":
	    				Customer c = (Customer)u;
	    				Menu.displayMenu(c);
	    				break;
	    		}

	    	}else {
	    		System.out.println("Password incorrect.");
	    		userLogin();
	    	}
	    } else {
	    	System.out.println("User not found.");
	    	userLogin();
	    }
	}
}

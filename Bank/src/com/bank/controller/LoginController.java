package com.bank.controller;

import java.util.Scanner;
import com.bank.beans.*;
//import com.bank.beans.User;
public class LoginController {
	public static void userLogin() {
		System.out.println("**** Bank Application ****");
	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter username: ");
	    String userName = scanner.nextLine();  // Read user input
	    System.out.print("Enter password: ");
	    String passWord = scanner.nextLine();  // Read user input
	    //System.out.println("Username is: " + userName + ", Password is: " + passWord);  // Output user input
	    if(Bank.usr.containsKey(userName)) {
	    	//System.out.println(Bank.usr.get(userName));
	    	//System.out.println(Bank.usr.get(userName).userName);
	    	//System.out.println(Bank.usr.get(userName).passWord);
	    	if(passWord.equals(Bank.usr.get(userName).getPassWord())) {
	    		User u = Bank.usr.get(userName);
	    		System.out.println(u.getClass().getTypeName());
	    		switch(u.getClass().getTypeName()){
	    			case "com.bank.beans.Employee":
	    				Employee e = (Employee)u;
	    				System.out.println(e);
	    				Menu.displayMenu(e);
	    				//LoginController.userLogin();
	    				break;
	    			case "com.bank.beans.Customer":
	    				Customer c = (Customer)u;
	    				Menu.displayMenu(c);
	    				break;
	    		}
	    		//System.out.println(u.getClass());
	    		//Menu.displayMenu(u);
	    		//System.out.println("password correct.");
	    	}else {
	    		System.out.println("password incorrect.");
	    		userLogin();
	    	}
	    } else {
	    	System.out.println("User not found.");
	    	userLogin();
	    }
	}
}

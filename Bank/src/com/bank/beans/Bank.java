package com.bank.beans;

import java.util.ArrayList;
import java.util.Hashtable;
//import com.bank.beans.Employee;
//import com.bank.Customer;

public class Bank {
	//public static ArrayList<Customer> customers = new ArrayList<Customer>();
	//public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static Hashtable<String, User> usr = new Hashtable<String, User>();
	public Bank() {
		//(un, pw, name, address, dob)
		Employee admin = new Employee("admin","password","name","address","dob");
		this.usr.put("admin",admin);
	}
}

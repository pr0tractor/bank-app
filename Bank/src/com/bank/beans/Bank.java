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
		Customer c1 = new Customer("user1", "password", "user1", "addr1", "dob1");
		Customer c2 = new Customer("user2", "password", "user2", "addr2", "dob2");
		Customer c3 = new Customer("user3", "password", "user3", "addr3", "dob3");
		
		this.usr.put(admin.userName, admin);
		this.usr.put(c1.userName, c1);
		this.usr.put(c2.userName, c2);
		this.usr.put(c3.userName, c3);
		
	}
}

package com.bank.beans;

import java.util.ArrayList;

public class Employee extends User{
	public ArrayList<Customer> manages = new ArrayList<Customer>();
	public Employee(String un, String pw, String name, String address, String dob) {
		super(un, pw, name, address, dob);
	}
}

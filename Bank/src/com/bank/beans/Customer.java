package com.bank.beans;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends User{
	public HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	public int accountNum;
	public Customer(String un, String pw, String name, String address, String dob) {
		super(un, pw, name, address, dob);
		
	}
}

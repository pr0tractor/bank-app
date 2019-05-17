package com.bank.beans;

import java.util.Arrays;

public abstract class Account {
	long accountNum;
	double balance;
	Transaction transactions[];
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", balance=" + balance + ", transactions="
				+ Arrays.toString(transactions) + "]";
	}
}

package com.bank.clientsim;
import com.bank.controller.LoginController;
import com.bank.beans.Bank;
public class client {

	public static void main(String args[]) {
		Bank b = new Bank();
		LoginController.userLogin();
		}
}

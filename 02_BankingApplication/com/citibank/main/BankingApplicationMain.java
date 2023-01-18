package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {
	
	public static void main(String[] args) {
		
		Myclass
//Object Creation
		Account account = new Account();
//		account.setAccountNumber(101);
//		System.out.println(account.getAccountNumber());
		account.setAccountnumber(101);
		System.out.println(account.getAccountnumber());
		account.setName("Rahul Mhaske");
		System.out.println(account.getName());
//Function Calling
		account.deposit(100);
		System.out.println(account.getBalance());
		account.withdraw(10);
		System.out.println(account.getBalance());
			

	}

}

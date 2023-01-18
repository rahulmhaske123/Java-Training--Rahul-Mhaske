package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {

		System.out.println("Welcome To CITI Bank");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account number-");
		int accnountNumber = scanner.nextInt();
		System.out.println("Enter Name-");
		String name = scanner.next();
	
		System.out.println("Enter Balance-");
		double balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountnumber(accnountNumber);
		account.setName(name);
		account.setBalance(balance);
		System.out.println("Your Account " + "\nOpened sucessfully" );
		System.out.println("Your Account number-" + account.getAccountnumber());
		System.out.println("Your Account Name-" + account.getName());
		System.out.println("Your Account Balance-" + account.getBalance());
	}

}

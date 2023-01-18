package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account;
		int accnountNumber;
		char choice;
		String name, continuechoice;
		double balance, amount;

		System.out.println("Enter Account number-");
		accnountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name-");
		name = scanner.nextLine();
		System.out.println("Enter Balance-");
		balance = scanner.nextDouble();

		account = new Account(accnountNumber, name, balance);
//		account.setAccountnumber(accnountNumber);
//		account.setName(name);
//		account.setBalance(balance);

		System.out.println("Account Opened Successfully");
		System.out.println("Your Account number-" + account.getAccountnumber());
		System.out.println("Your Account Name-" + account.getName());
		System.out.println("Your Account Balance-" + account.getBalance());

		System.out.println();

		do {

			showTransactionMenu(scanner, account);
			System.out.println("Want to Continue?");
			continuechoice = scanner.next();
		} while (continuechoice.equalsIgnoreCase("Yes") || continuechoice.equalsIgnoreCase("Y"));
		System.out.println("Thank You !!");

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1 for deposit");
		System.out.println("Press 2 for withdraw");
		System.out.println("Press 3 for Check Balance");
		System.out.println("Press 4 for exit");

		System.out.println("Enter your Choice-");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter the amnount to Deposit ");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit Successfully");
			else
				System.out.println("deposit Unsuccessful");
			break;
		case '2':
			System.out.println("Enter the amount to Withdraw");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdrwa Successfull");
			else
				System.out.println("Withdraw Unsccessfull");
			break;
		case '3':
			System.out.println("Your Account balance-" + account.getBalance());
			break;
		case '4':
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}

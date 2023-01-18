package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings;
		int accnountNumber;
		char choice;
		String name, continuechoice,acctType;
		double balance, amount;
		boolean isSalary;
		
		System.out.println("Enter Account number-");
		accnountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name-");
		name = scanner.nextLine();
		System.out.println("Enter Balance-");
		balance = scanner.nextDouble();
		System.out.println("Do you want salary Account");
		isSalary =  scanner.nextBoolean();

		savings = new Savings(accnountNumber, name, balance,isSalary);
		System.out.println("Account Opened Successfully");
		System.out.println("Your Account number-" + savings.getAccountnumber());
		System.out.println("Your Account Name-" + savings.getName());
		System.out.println("Your Account Balance-" + savings.getBalance());
		if (savings.isSalary())
			acctType = "Salary";
		else
		acctType = "Savings";
		System.out.println("Your Account Type-" + acctType);

		System.out.println();

		do {

			showTransactionMenu(scanner, savings);
			System.out.println("Want to Continue?");
			continuechoice = scanner.next();
		} while (continuechoice.equalsIgnoreCase("Yes") || continuechoice.equalsIgnoreCase("Y"));
		System.out.println("Thank You !!");

	}

	private static void showTransactionMenu(Scanner scanner, Savings savings) {
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
			if (savings.deposit(amount))
				System.out.println("Deposit Successfully");
			else
				System.out.println("deposit Unsuccessful");
			break;
		case '2':
			System.out.println("Enter the amount to Withdraw");
			amount = scanner.nextDouble();
			if (savings.withdraw(amount))
				System.out.println("Withdrwa Successfull");
			else
				System.out.println("Withdraw Unsccessfull");
			break;
		case '3':
			System.out.println("Your Account balance-" + savings.getBalance());
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

package com.citibank.main.domain;

public abstract class Account {

	private int accountnumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println("Default Constructor");
	}

	public Account(int accountnumber, String name, double balance) {
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name2) {
		this.name = name2;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract boolean withdraw(double amount);

	public abstract boolean deposit(double amount);

}

//	{
//		System.out.println("Withdraw () Method Called");
//		if (amount > 0 && balance >= amount) {
//			balance = balance - amount;
//			return true;
//		}
//		return false;
//	}

//	{
//		System.out.println("Deposit() Method Called");
//		if (amount > 0) {
//			balance = balance + amount;
//			return true;
//		}
//		return false;
//	}

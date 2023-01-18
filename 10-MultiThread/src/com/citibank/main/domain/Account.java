package com.citibank.main.domain;

public class Account {

	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized boolean withdraw(double amount) {
		System.out.println("Withdraw Start ");
		System.out.println("Initial Balance- " + getBalance());

		if (amount > 0 ) {
			setBalance(getBalance() - amount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Balance After Withdraw- " + getBalance());
			return true;
		}

		return false;
	}

	public synchronized  boolean deposit(double amount) {
		System.out.println("Deposit Start ");
		System.out.println("Initial Balance- " + getBalance());
		if (amount > 0) {
			setBalance(getBalance() + amount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Balance After Deposit- " + getBalance());
			return true;
		}
		return false;

	}

}

package com.citibank.main.domain;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Resource;

public class AccountThread implements Runnable {
	Account account;
	private int choice;
	private double amount;

	public AccountThread(Account account, double amount, int choice) {
		super();
		this.account = account;
		this.amount = amount;
		this.choice = choice;
	}

	@Override
	public void run() {
		if (choice == 1) {
			account.withdraw(amount);
		}

		if (choice == 2) {
			account.deposit(amount);
		}

	}

}

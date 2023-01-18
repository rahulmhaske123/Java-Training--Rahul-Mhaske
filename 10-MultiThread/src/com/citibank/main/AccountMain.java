package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountMain {

	public static void main(String[] args) {

		Account account = new Account(50000);

		AccountThread AccountThread1 = new AccountThread(account, 3000, 1);
		Thread thread1 = new Thread(AccountThread1);
		thread1.start();

		AccountThread AccountThread2 = new AccountThread(account, 10000, 2);
		Thread thread2 = new Thread(AccountThread2);
		thread2.start();

	}

}

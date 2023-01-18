package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		ThreadTwo threadTwo = new ThreadTwo();
		Thread thread = new Thread(threadTwo);
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread Main Two - " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		thread.start();

	}

}

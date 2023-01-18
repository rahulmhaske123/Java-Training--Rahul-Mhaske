package com.citibank.main;

import com.citibank.main.domain.ThreadOne;
import com.citibank.main.domain.ThreadTwo;

public class ThreadOneTwoMain {

	public static void main(String[] args) {
		System.out.println("Main start ");
		System.out.println("Main is Creating Child ThreadOne ");
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
		System.out.println("Main is Creating Child ThreadTwo ");
		ThreadTwo Two = new ThreadTwo();
		Thread threadTwo = new Thread(Two);
		threadTwo.start();
		System.out.println("Main End ");
	}

}

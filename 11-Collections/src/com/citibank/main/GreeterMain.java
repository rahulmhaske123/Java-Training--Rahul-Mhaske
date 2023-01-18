package com.citibank.main;

import com.citibank.main.domain.GoodAfternoonGreeter;
import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();

		greeter.greet();

		Greeter greeterAfternoon = new GoodAfternoonGreeter();

		greeterAfternoon.greet();

		Greeter goodEveningGreeter = new Greeter() {

			@Override
			public void greet() {
				System.out.println("Good Evening Java");

			}
		};
		goodEveningGreeter.greet();

		Greeter goodNightGreeter = new Greeter() {

			@Override
			public void greet() {
				System.out.println("Good Night Java");

			}
		};
		goodNightGreeter.greet();

		System.out.println("---------------");

		Greeter lambdaGreeter = () -> {
			System.out.println("This is Lambda Expression");
			System.out.println("New way of Good Morning Java");
		};
		lambdaGreeter.greet();

		Greeter lambdaGreeterNight = () -> System.out.println("New Way of Good Night");
		lambdaGreeterNight.greet();
		
		Runnable runnable = () -> System.out.println("We are in Thread");
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("---------------");
		
		Thread thread2 = new Thread(() -> System.out.println("We are in Thread2"));
		thread2.start();
		
//		new Thread(() -> System.out.println("We are in Thread3")).start();
	
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
					System.out.println("We are in for loop of thread");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();

		
		
//		for (int i = 0; i < 100; i++) {
//			Thread thread3 = new Thread(() -> System.out.println("We are in Thread Loop"));
//			thread3.start();
//			try {
//				thread3.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i);
//			
//		}
	}

	
	
	

}

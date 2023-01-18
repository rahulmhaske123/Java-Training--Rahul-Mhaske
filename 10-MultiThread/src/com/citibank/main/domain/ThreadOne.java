package com.citibank.main.domain;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println("We are in Threadone");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread one " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}

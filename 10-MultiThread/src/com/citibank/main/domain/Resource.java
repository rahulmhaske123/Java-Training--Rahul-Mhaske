package com.citibank.main.domain;

public class Resource {
	public synchronized   void message(String textmessage) {
		System.out.print("[");
		System.out.print(textmessage);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}

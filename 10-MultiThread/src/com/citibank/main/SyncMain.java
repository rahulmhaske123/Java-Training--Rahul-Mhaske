package com.citibank.main;

import com.citibank.main.domain.MyThread;
import com.citibank.main.domain.Resource;

public class SyncMain {

	public static void main(String[] args) {
		// Below is thread for main
//		Thread thread = Thread.currentThread();
//		System.out.println(thread);
//		thread.setName("Main Thread");
//		thread.setPriority(9);
//		System.out.println(thread);
//		//
//		
//		Resource resource = new Resource();
//		resource.message("Hi");
//		resource.message("Hello");
//		resource.message("How are you Doing");
		Resource resource = new Resource();
		
		MyThread myThreadone = new MyThread(resource, "Hi");
		Thread thread1 = new Thread(myThreadone);
		thread1.start();
		
		MyThread myThreadtwo = new MyThread(resource, "Hello");
		Thread thread2 = new Thread(myThreadtwo);
		thread2.start();
		
		MyThread myThreadthree = new MyThread(resource, "How are you Doing");
		Thread thread3 = new Thread(myThreadthree);
		thread3.start();

	}

}

package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main start");
//		MyClass myclass = new MyClass();
		new MyClass();
		new MyClass(4);
		new MyClass(" Rahul").show();
		System.out.println("Main end");
	}

}

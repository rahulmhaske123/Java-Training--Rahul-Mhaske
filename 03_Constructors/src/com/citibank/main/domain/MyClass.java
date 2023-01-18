package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		System.out.println("Default Constructor");
	}

	public MyClass(int num) {
		System.out.println("First Constructor" + num);
	}

	public MyClass(String str) {
		System.out.println("Second Constructor" + str);
	}

	public void show() {
		System.out.println("Hi");
	}
}

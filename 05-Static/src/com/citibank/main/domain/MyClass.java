package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		System.out.println("Default constructor");
	}
	
	static {System.out.println("Staic Blocks");}
	{System.out.println("Non Staic Blocks");}
	
//	int num1 = 10;
	public static int num2 = 10;
//	final int num3 = 10;
//	
//	public void display() {
//		System.out.println("Num1-" + num1);
//		System.out.println("Num2-" + num2);
//		num1 = num1 +10;
//		num2 = num2 +10;
//		System.out.println("Num1-" + num1);
//		System.out.println("Num2-" + num2);
//	}

}

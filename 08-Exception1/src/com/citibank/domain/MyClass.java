package com.citibank.domain;

import java.util.Scanner;

public class MyClass {
	
	private double num1;
	private double num2;
	private double result;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number-");
		num1 = scanner.nextDouble();
		System.out.println("Enter Second Number-");
		num2 = scanner.nextDouble();	
	}
	
	public void calculate() {
		result = num1 / num2;
	}
	
	public void display() {
		System.out.println("Result-" + result);
	}


}

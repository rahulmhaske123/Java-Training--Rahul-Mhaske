package com.citibank.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	
	private double num1;
	private double num2;
	private double result;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter First Number-");
		num1 = scanner.nextDouble();
		System.out.println("Enter Second Number-");
		num2 = scanner.nextDouble();	
		}
		catch (InputMismatchException e ) {
//		} catch (Exception exception ) { //If you don't know exception class then use Exception class
			System.out.println("Invalid input from user");
			System.out.println("Program will Continue");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception in Code!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you");
			scanner.close();
		}
	}
	
	public void calculate() {
		System.out.println("Calculating Result-");
		result = num1 / num2;
	}
	
	public void display() {
		System.out.println("Result-" + result);
	}


}

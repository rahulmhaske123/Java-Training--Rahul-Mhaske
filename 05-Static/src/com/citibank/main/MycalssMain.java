package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MycalssMain {
	int number1 =10 ;
	static int number2 = 10;
	public static void main(String[] args) {
		System.out.println("Main Start ");
		MyClass.num2 = 10;
		MyClass myClass = new MyClass();
		System.out.println("Main End ");
//		MyClass myClass = new MyClass();
//		myClass.display();
//		System.out.println("-----------");
//		MyClass myClass1 = new MyClass();
//		myClass1.display();
//		myClass.num2 =20;
//		MyClass.num2 = 20;
//		System.out.println( "Number1- " + number1);
//		System.out.println("Number2- " + number2);
//		
//		System.out.println("Num2-" + MyClass.num2);
	}

}

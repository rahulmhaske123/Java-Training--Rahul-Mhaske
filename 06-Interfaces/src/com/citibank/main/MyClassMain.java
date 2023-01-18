package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.domain.YourClass;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
//		System.out.println("Main start");
//		MyClass myClass = new MyClass();
//		myClass.show();
//		System.out.println("-----------");
//		MyInterface myInterface ;
//		myInterface.show();
//		System.out.println("-----------");
//		System.out.println(MyInterface.message);
//		System.out.println(MyClass.message);
//		YourClass yourClass = new YourClass();
//		yourClass.show();
//		System.out.println("Main End");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. MyClass" + "\n2. YourClas");
		System.out.println("Enter Your Choice");
		int Choice = scanner.nextInt();
		MyInterface myInterface = MyFactory.getobject(Choice);
		if (myInterface != null)
			myInterface.show();
		else	
			System.out.println("Invalid Choice");
		
		System.out.println("Main End");
				
		
	}

}

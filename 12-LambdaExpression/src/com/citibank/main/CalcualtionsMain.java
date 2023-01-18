package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalcualtionsMain {

	public static void main(String[] args) {
		double num1 =10;
		double num2 =10;
		CalculationsInterface cal = new CalculationsInterface() {

			@Override
			public double doCalculation(double num1, double num2) {
				return num1 + num2;
			}
		};
		double result = cal.doCalculation(10, 20);
		System.out.println("Result-" + result);
		
		System.out.println("------------");
		
		 
		CalculationsInterface cal2 = (n1 ,n2) -> {
			return num1 + num2;	
		};
		double result1 = cal.doCalculation(20, 20);
		System.out.println("Result-" + result1);
		
		System.out.println("------------");
		 
		cal = (n1 ,n2) -> n1 + n2;
		System.out.println("Result-" + cal.doCalculation(20, 30));
		
	}
}
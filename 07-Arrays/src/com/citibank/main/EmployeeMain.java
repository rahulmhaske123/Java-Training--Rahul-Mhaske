package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int empid;
		String name;
		double salary;
		Employee employee1 = new Employee(101,"Rahul",1000);
		Employee employee2 = new Employee(102,"Parithosh",1000);
		Employee employee3 = new Employee(103,"Dipti",1000);
		Employee employee4 = new Employee(104,"Prashant",1000);
		Employee employee5 = new Employee(105,"Anuj",1000);
		
		
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		
		System.out.println("--------");
		
		Employee [] allemp = new Employee[5];
		
		for (int i = 0; i < allemp.length; i++) {
			System.out.println("Enter Emp id -");
			empid = scanner.nextInt();
			System.out.println("Enter Emp Name -");
			name = scanner.next();
			System.out.println("Enter Emp Salary -");
			salary = scanner.nextDouble();
			Employee employee = new Employee(empid,name,salary);
			allemp[i] = employee;	
			System.out.println();
		}
		System.out.println("Employee Details");

		for (Employee employee : allemp) {
			System.out.println(employee);
			
		}
	}

}

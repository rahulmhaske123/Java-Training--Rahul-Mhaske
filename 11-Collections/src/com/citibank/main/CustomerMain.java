package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer = null;
		Customer customer1 = new Customer(1, "Rahul", "Akurdi");
		Customer customer2 = new Customer(2, "Anuj", "Wagholi");
		Customer customer3 = new Customer(3, "Prashant", "Kharadi");
		Customer customer4 = new Customer(4, "xyz", "a");
		Customer customer5 = new Customer(5, "abc", "b");

		List<Customer> customerlist = new ArrayList<Customer>();

		customerlist.add(customer1);
		customerlist.add(customer2);
		customerlist.add(customer3);
		customerlist.add(customer4);
		customerlist.add(customer5);

		printAllCustomers(customerlist);

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter The Customer Id");
//		int customerid = scanner.nextInt();
//		printcustomerBycustomerId(customerlist, customerid);

//		System.out.println("Enter The Customer Id");
//		int customerid = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Enter new Name");
//		String name = scanner.nextLine();
//		System.out.println("Enter new Address");
//		String address = scanner.next();
//
//		Customer customerupd = new Customer(customerid, name, address);
//		updateCustomerDetails(customerlist, customerupd);
//		printAllCustomers(customerlist);
		
		
		System.out.println("Enter The Customer Id");
		int customerid = scanner.nextInt();
		deleteCustomerBycustomerId(customerlist,customerid);


	}

	private static void deleteCustomerBycustomerId(List<Customer> customerlist, int customerid) {
		boolean flag = false;
		for (Customer c2 : customerlist) {
			if (c2.getCustomerId() == customerid) {
				customerlist.remove(c2);
				printAllCustomers(customerlist);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("No Customer found");
		}
		
	}

	private static void updateCustomerDetails(List<Customer> customerlist, Customer customerupd) {
		boolean flag = false;
		for (Customer c : customerlist) {
			if (c.getCustomerId() == customerupd.getCustomerId()) {
				c.setName(customerupd.getName());
				c.setAddress(customerupd.getAddress());
				flag = true;
				System.out.println(c);
				break;
			}
		}
		if (flag == false) {
			System.out.println("No Customer found");
		}
	}

	private static void printcustomerBycustomerId(List<Customer> customerlist, int customerid) {
		boolean flag = false;
		for (Customer customer : customerlist) {
			if (customer.getCustomerId() == customerid) {
				System.out.println(customer);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("No Customer found");
		}
	}

	private static void printAllCustomers(List<Customer> customerlist) {
		System.out.println("All customers");
		for (Customer customer : customerlist) {
			System.out.println(customer);

		}
	}

}

package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		Set<Customer> customerset = new HashSet<>();
		
		System.out.println("Adding Customer");
		
		Customer customer1 = new Customer(101, "Rahul", "Akurdi");
		Customer customer2 = new Customer(102, "Anuj", "Wagholi");
		Customer customer3 = new Customer(103, "Prashant", "Kharadi");
		Customer customer4 = new Customer(104, "Dipti", "Mumbai");
		Customer customer5 = new Customer(105, "Nikhil", "Pune");
		Customer customer6 = new Customer(105, "Nikhil", "Pune");
		
		System.out.println("First Customer-" + customer1.hashCode());
		System.out.println("Addiing First Customer-" + customerset.add(customer1));
//		System.out.println("Addiing Second Customer-" + customerset.add(customer2));
//		System.out.println("Addiing Third Customer-" + customerset.add(customer3));
//		System.out.println("Addiing Four Customer-" + customerset.add(customer4));
		System.out.println("Fifth Customer-" + customer5.hashCode());
		System.out.println("Addiing Five Customer-" + customerset.add(customer5));
		System.out.println("Sixth Customer-" + customer6.hashCode());
		System.out.println("Addiing Five Customer-" + customerset.add(customer6));
		System.out.println(customerset);
//		for (Customer customer : customerset) {
//			System.out.println(customer);
//		}


	}

}

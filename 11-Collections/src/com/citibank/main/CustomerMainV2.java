package com.citibank.main;

import java.util.List;

import com.citibank.main.Service.CustomerService;
import com.citibank.main.domain.Customer;

public class CustomerMainV2 {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		System.out.println("Adding Customer");
		
		Customer customer1 = new Customer(101, "Rahul", "Akurdi");
		Customer customer2 = new Customer(102, "Anuj", "Wagholi");
		Customer customer3 = new Customer(103, "Prashant", "Kharadi");
		Customer customer4 = new Customer(104, "Dipti", "Mumbai");
		Customer customer5 = new Customer(105, "Nikhil", "Pune");
		
		
		System.out.println("Addiing First Customer-" + customerService.addNewCustomer(customer1));
		System.out.println("Addiing Second Customer-" + customerService.addNewCustomer(customer2));
		System.out.println("Addiing Third Customer-" + customerService.addNewCustomer(customer3));
		System.out.println("Addiing Four Customer-" + customerService.addNewCustomer(customer4));
		System.out.println("Addiing Five Customer-" + customerService.addNewCustomer(customer5));
		
		System.out.println("----------------------------");
		System.out.println("Readig all the Customer");
		
		
		List<Customer> customerlist =  customerService.getAllCustomerByCustomer();
		for (Customer customer : customerlist) {
			System.out.println(customer);
		}
		
		System.out.println("----------------------------");
		System.out.println("Readig one Customer By Customer Id");
		System.out.println("Reading One Customer by customer ID-" + customerService.getCustomerByCustomer(102));
		
		System.out.println("----------------------------");
		System.out.println("Updating Customer By Customer Id");
		Customer customerupd = new Customer(101, "Sushma", "Akurdi");
		boolean result =  customerService.updateCustomerByCustomerId(customerupd);
		if(result) 
			System.out.println("Updated Sucessfully");
		else
			System.out.println("No Customer Found");
		
		System.out.println("----------------------------");
		System.out.println("Deleting Customer by Object ");
		boolean delresult = customerService.deleteCustomerBycustomer(101);
		if(delresult) 
			System.out.println("Deleted Sucessfully");
		else
			System.out.println("No Customer Found");
		
		System.out.println("Updated Lsit");
		List<Customer> customerlist1 =  customerService.getAllCustomerByCustomer();
		for (Customer customer : customerlist1) {
			System.out.println(customer);
		}

	}

}

package com.citibank.main;

import java.util.List;

import com.citibank.main.Service.CustomerService;
import com.citibank.main.domain.Customer;

public class CustomerJDBCMain {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		System.out.println("-------Print All Customers-----------");
		
		List<Customer> customerlist =  customerService.getAllCustomerByCustomer();
		for (Customer customer : customerlist) {
			System.out.println(customer);
		}
		
		System.out.println("------Print Given Customer------------");
		Customer customer = customerService.getCustomerByCustomer(11);
		if (customer != null)
			System.out.println(customer);
		else 
			System.out.println("Customer Not found");
		
		
		
		System.out.println("--------Insert Customer Details----------");
		
		Customer customerAdd = new Customer(0,"Riyansh","Ahmednagar");
		
		boolean insert =  customerService.addNewCustomer(customerAdd);
		
		if(insert)
			System.out.println("Inserted successfully");
		else
			System.out.println("Not Inesrted");
		
		
		System.out.println("--------Update Customer Details----------");
		
		Customer customerUpd = customerService.getCustomerByCustomer(1);
		
		if (customerUpd != null) {
			customerUpd = new Customer(1,"Rahul Mhaske  New","Ahmednagar");
			boolean update = customerService.updateCustomerByCustomerId(customerUpd);
			if (update)
				System.out.println("Update Sucessfully");
			else
				System.out.println("Error While Updating Data");
		}
		
		else {
			System.out.println("Customer Not found");
		}
		
		
		System.out.println("--------Delete Customer Details----------");
		
		boolean customerDel = customerService.deleteCustomerBycustomer(4);
		
		if (customerDel)
			System.out.println("Delete Successfully");
		else
			System.out.println("Delete Unsucessfully");
			
		

	}

}

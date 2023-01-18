package com.citibank.main.Service;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface {
	
	public boolean addNewCustomer(Customer customer);

	public Customer getCustomerByCustomer(int customerid);

	public List<Customer> getAllCustomerByCustomer();

	public boolean updateCustomerByCustomerId(Customer customer);

	public boolean deleteCustomerBycustomer(int customerid);

}

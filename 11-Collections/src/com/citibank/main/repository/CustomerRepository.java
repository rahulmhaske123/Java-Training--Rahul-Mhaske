package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {
	private List<Customer> customerlist = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerlist.add(customer);
	}

	@Override
	public Customer getCustomerByCustomer(int customerid) {

		for (Customer customer : customerlist) {
			if (customer.getCustomerId() == customerid) {
				System.out.println(customer);

				return customer;
			}
		}

		return null;

	}

	@Override
	public List<Customer> getAllCustomerByCustomer() {

		return customerlist;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		for (Customer c : customerlist) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerBycustomer(int customerid) {
		for (Customer c : customerlist) {
			if (c.getCustomerId() == customerid) {
				return customerlist.remove(c);
			}
		}
		return false;
	}

}

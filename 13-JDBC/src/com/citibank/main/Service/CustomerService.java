package com.citibank.main.Service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {
//We called it as compostion its 'HAS A' relationship with CustomerRepository.
	
//	private CustomerRepository customerRepository = new CustomerRepository();
	//Below is Polymorphisam 
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();


	@Override
	public boolean addNewCustomer(Customer customer) {
		//Logging
		//Authentication
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomer(int customerid) {
		return customerRepository.getCustomerByCustomer(customerid);
	}

	@Override
	public List<Customer> getAllCustomerByCustomer() {
		return customerRepository.getAllCustomerByCustomer();
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		return customerRepository.updateCustomerByCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerBycustomer(int customerid) {
		return customerRepository.deleteCustomerBycustomer(customerid);
	}

}

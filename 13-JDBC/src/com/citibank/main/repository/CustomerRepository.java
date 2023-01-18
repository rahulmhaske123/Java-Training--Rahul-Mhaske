package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;
import com.mysql.cj.protocol.Resultset;

public class CustomerRepository implements CustomerRepositoryInterface {
	private List<Customer> customerlist = new ArrayList<>();
	private String drivername = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String userId = "root";
	private String password = "root";
	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultset; 
	private int rowCount;
	
	

	@Override
	public boolean addNewCustomer(Customer customer) {
		
		connection = new ConnectionFactory().getConnection();
		
		sql = "insert into customer_details(name,address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			int rowcount = preparedStatement.executeUpdate();
			if (rowcount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error in Add Customer Query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;
	}

	@Override
	public Customer getCustomerByCustomer(int customerid) {

		connection = new ConnectionFactory().getConnection();
		
		sql = "select * from customer_details where customer_id = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerid);
			resultset = preparedStatement.executeQuery();
			if(resultset.next()) {
				int customerId = resultset.getInt("customer_id");
				String name = resultset.getString("name");
				String address = resultset.getString("address");
				
				Customer customer = new Customer(customerId,name,address);
				return customer;
			}
		} catch (SQLException e) {
			System.out.println("Error in Query");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		return null;

	}

	@Override
	public List<Customer> getAllCustomerByCustomer() {
//		ConnectionFactory connectionFactory = new ConnectionFactory();
//		connectionFactory.getConnection();
		
		connection = new ConnectionFactory().getConnection();
		
		sql = "select * from customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultset = preparedStatement.executeQuery();
			while(resultset.next()) {
				int customerId = resultset.getInt("customer_id");
				String name = resultset.getString("name");
				String address = resultset.getString("address");
				
				Customer customer = new Customer(customerId,name,address);
				
				customerlist.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("Error in Query");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return customerlist;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		
		connection = new ConnectionFactory().getConnection();

		sql = "update customer_details set name = ? , address = ? where customer_id = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setInt(3, customer.getCustomerId());
			int rowcount = preparedStatement.executeUpdate();
			if(rowcount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error in Update Query");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;
	}

	@Override
	public boolean deleteCustomerBycustomer(int customerid) {
		
		
		connection = new ConnectionFactory().getConnection();

		sql = "delete from customer_details where customer_id = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerid);
			int rowcount = preparedStatement.executeUpdate();
			if(rowcount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error in Delete Query");
			System.out.println(e.getMessage());
		}finally {
			try {
				connection.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;
		
		
	}

}

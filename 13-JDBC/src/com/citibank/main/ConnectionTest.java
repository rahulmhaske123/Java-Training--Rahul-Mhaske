package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.Predicate;

public class ConnectionTest {


	public static void main(String[] args) {
		System.out.println("Main Start");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded Successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root","root");
			System.out.println("Connection  Successfully");
			String sql = "insert into customer_details(name,address) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < 5; i++) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Customer Name");
				String CusName = scanner.next();
				System.out.println("Enter Customer Address");
				String CusAdd = scanner.next();
				preparedStatement.setString(1, CusName);
				preparedStatement.setString(2, CusAdd);
				int rowcount = preparedStatement.executeUpdate();
				if (rowcount > 0) {
//					int rowcountAll = rowcountAll + rowcount;
					System.out.println("Record inserted Sucessfully-" );
				}
				else
					System.out.println("Record Not inserted Sucessfully.");
				
			}
			
//			System.out.println("Number Record Updated Succssfully-" + rowcountAll );
//			preparedStatement.setString(1, "Sushma Mhaske");
//			preparedStatement.setString(2, "Akurdi");
//			int rowcount = preparedStatement.executeUpdate();
			
//			if (rowcount > 0)
//				System.out.println("Number of Record inserted Sucessfully-" + rowcount);
//			else
//				System.out.println("Record Not inserted Sucessfully.");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver Not Found");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		System.out.println("Main End");

	}

}

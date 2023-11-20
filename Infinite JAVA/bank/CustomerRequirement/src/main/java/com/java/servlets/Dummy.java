package com.java.servlets;

import java.sql.SQLException;

public class Dummy {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Smrutipragyan");
		customer.setLastName("Rath");
		customer.setUserName("Smruti");
		customer.setPassword("Smruti");
		customer.setEmail("smrutipragyanrath@gmail.com");
		customer.setPhoneNo("7735302306");
		CustomerDAO dao = new CustomerDAOImpl();
		try {
			System.out.println(dao.addCustomer(customer));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.infinite;

import java.sql.SQLException;

import java.util.List;
public interface CustomerDAO {
	 
	    List<Customer> showCustomerDao() throws ClassNotFoundException, SQLException;
	    Customer getCustomerById(int customerId) throws SQLException, ClassNotFoundException;
	    Customer searchCustomerDao(int customerId) throws ClassNotFoundException, SQLException;
	   // List<Customer> getAllCustomers() throws SQLException, ClassNotFoundException ;	  
	    String updateCustomer(Customer customer) throws SQLException, ClassNotFoundException ;
	    String deleteCustomer(int customerId) throws SQLException, ClassNotFoundException ;
	    String addCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	
}

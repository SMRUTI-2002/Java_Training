package com.java.infinite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl  implements CustomerDAO {

	Connection connection;
	
	@Override
	public Customer getCustomerById(int customerId) throws SQLException, ClassNotFoundException {
		 connection = ConnectionHelper.getConnection();
        String cmd = "SELECT * FROM HotelCustomer WHERE CustomerID = ?";
        PreparedStatement pst = connection.prepareStatement(cmd);
        ResultSet resultSet = pst.executeQuery();
        pst.setInt(1, customerId);
        while (resultSet.next()) {
            String name = resultSet.getString("Name");
            Timestamp checkInTime = resultSet.getTimestamp("CheckInTime");
            Timestamp checkOutTime = resultSet.getTimestamp("CheckOutTime");
            int roomNumber = resultSet.getInt("RoomNumber");
            return new Customer(customerId, name, checkInTime, checkOutTime, roomNumber);
            
        }
        return null;
	}
	
/*	@Override
	public List<Customer> getAllCustomers()throws ClassNotFoundException, SQLException {
	   	 connection = ConnectionHelper.getConnection();	
        String cmd = "SELECT * FROM HotelCustomer";
        PreparedStatement pst = connection.prepareStatement(cmd);
        ResultSet resultSet = pst.executeQuery();
        List<Customer> customers = new ArrayList<>();
        Customer customer = null;
   
            while (resultSet.next()) {
                int customerId = resultSet.getInt("CustomerID");
                String name = resultSet.getString("Name");
                Timestamp checkInTime = resultSet.getTimestamp("CheckInTime");
                Timestamp checkOutTime = resultSet.getTimestamp("CheckOutTime");
                int roomNumber = resultSet.getInt("RoomNumber");
                Customer Customer= new Customer(customerId, name, checkInTime, checkOutTime, roomNumber);
                customers.add(customer);
               
        }
        return customers;
    }
	*/

	@Override
	public String updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		Customer customerFound = searchCustomerDao(customer.getCustomerId());
		if(customerFound!=null) {
			 connection = ConnectionHelper.getConnection();
	        String cmd = "UPDATE HotelCustomer SET Name = ?, CheckInTime = ?, CheckOutTime = ?, RoomNumber = ? WHERE CustomerID = ?";
	        PreparedStatement pst = connection.prepareStatement(cmd);
	           pst.setString(1, customer.getName());
	           pst.setTimestamp(2, new java.sql.Timestamp(customer.getCheckOutTime().getTime()));
	           pst.setTimestamp(3, new java.sql.Timestamp(customer.getCheckOutTime().getTime()));
	           pst.setInt(4, customer.getRoomNumber());
	           pst.setInt(5, customer.getCustomerId());

	          pst.executeUpdate();
	          return "Customer Details has been Updated...";
			
		}
		return "Customer Details Not Found....";
		
	}

	@Override
	public String deleteCustomer(int customerId) throws SQLException, ClassNotFoundException {
		Customer customer = searchCustomerDao(customerId);
		if (customer!=null) {
			 connection = ConnectionHelper.getConnection();
			String cmd = "Delete from hotelcustomer where customerId=?";
			PreparedStatement pst = connection.prepareStatement (cmd);
			pst.setInt(1, customerId);
			pst.executeUpdate();
			return "Customer details Deleted...";

			} return "Customer Not Found...";
	}

	@Override
	public List<Customer> showCustomerDao() throws ClassNotFoundException, SQLException {
		 SimpleDateFormat sdf = new  SimpleDateFormat ("yyyy-MM-dd");
		 	 connection = ConnectionHelper.getConnection();	
        String cmd = "SELECT * FROM HotelCustomer";
        PreparedStatement pst = connection.prepareStatement(cmd);
        ResultSet rs = pst.executeQuery();
        List<Customer> customerList = new ArrayList<Customer>();
        Customer customer = null;
        while (rs.next()) {
            customer = new Customer();
            customer.setCustomerId(rs.getInt("customerId"));
            customer.setName(rs.getString("name"));
            customer.setCheckInTime(rs.getTimestamp("checkInTime"));
            customer.setCheckOutTime(rs.getTimestamp("checkOutTime"));
            customer.setRoomNumber(rs.getInt("roomNumber"));
            customerList.add(customer);
        
        }
            return customerList;
 
        
        
        }

	@Override
	public Customer searchCustomerDao(int customerId) throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
		String cmd = "select * from hotelcustomer where customerId=?";
		PreparedStatement pst = connection.prepareStatement (cmd);
		pst.setInt(1, customerId);
		 ResultSet rs = pst.executeQuery();
		 Customer customer = null;
		 while (rs.next()) {
	            customer = new Customer();
	            customer.setCustomerId(rs.getInt("customerId"));
	            customer.setName(rs.getString("name"));
	            customer.setCheckInTime(rs.getTimestamp("checkInTime"));
	            customer.setCheckOutTime(rs.getTimestamp("checkOutTime"));
	            customer.setRoomNumber(rs.getInt("roomNumber"));
		 }
		return customer;
		
	}

	@Override
	public String addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Customer(customerId,Name,checkIn,checkOut,roomNo)"
				+ "values(?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement (cmd);
		pst.setInt(1, customer.getCustomerId());
		  pst.setString(1, customer.getName());
		  pst.setTimestamp(2, new java.sql.Timestamp(customer.getCheckOutTime().getTime()));
          pst.setTimestamp(3, new java.sql.Timestamp(customer.getCheckOutTime().getTime()));
          pst.setInt(4, customer.getRoomNumber());
          pst.setInt(5, customer.getCustomerId());

         pst.executeUpdate();
         return "Customer Details has been added....";
		
	}
        
	       
}	
		 

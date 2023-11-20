package com.java.servlets;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class OtpAppDaoImpl implements OtpAppDAO{
	PreparedStatement pst;
	Connection connection;
	
	public static int generateOtp() {
		Random r = new Random( System.currentTimeMillis() );
	    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	

	@Override
	public Customer searchCustomerDao(String username) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customer where Customer_UserName=?";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setString(1, username);
		ResultSet rs = pst.executeQuery();
		Customer customer = null;
		if (rs.next()) {
			customer = new Customer();
			customer.setCust_ID(rs.getInt("Cust_ID"));
			customer.setCustomer_FirstName(rs.getString("Customer_FirstName"));
			customer.setCustomer_LastName(rs.getString("Customer_LastName"));
			customer.setCustomer_UserName(rs.getString("Customer_UserName"));
			customer.setCustomer_Password(rs.getString("Customer_Password"));
			customer.setCustomer_Email(rs.getString("Customer_Email"));
			customer.setCustomer_PhoneNo(rs.getString("Customer_Status"));
		}
		return customer;
	}

	@Override
	public String validateOtpDao(String username, int otp) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select OtpCode from otp where Cust_ID=(select Cust_ID from customer where Customer_UserName=?) order by otp_id desc limit 1;";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setString(1, username);
		ResultSet rs = pst.executeQuery();
		int otpfromdb=1;
		if (rs.next()) {
			otpfromdb = rs.getInt("OtpCode");
		}
		if(otp==otpfromdb) {
			cmd = "update customer set Customer_Status='active' where Customer_UserName=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, username);
			pst.executeUpdate();
			}else {
				return "Invalid Otp...";
			}
		
		return "Account Created";
	}



	@Override
	public String createAccountDao(Customer customer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}

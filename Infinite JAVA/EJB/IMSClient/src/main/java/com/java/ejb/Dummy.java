package com.java.ejb;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Dummy {
	public static void main(String[] args) throws ParseException {
		
	CustomerDetailsDAO dao = new CustomerDetailsDaoImpl();
	CustomerDetails CustomerNew = new CustomerDetails();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	// Date date = sdf.parse("2002-03-10");
	CustomerNew.setFirstName("Smruti");
	CustomerNew.setLastName("Prangya");
	// CustomerNew.setDateOfBirth(dob);
	CustomerNew.setUserName("iconic");
	
	System.out.println(dao.addCustomerDao(CustomerNew));
	}
}

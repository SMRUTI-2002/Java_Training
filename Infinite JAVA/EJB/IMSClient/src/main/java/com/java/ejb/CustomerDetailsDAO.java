package com.java.ejb;

import java.util.List;

public interface CustomerDetailsDAO {
	List<CustomerDetails> showCustomerDetails();
	String addCustomerDao(CustomerDetails customer);
}

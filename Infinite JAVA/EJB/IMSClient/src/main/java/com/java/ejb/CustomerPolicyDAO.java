package com.java.ejb;

import java.text.ParseException;

public interface CustomerPolicyDAO {
	//String redirectToTakePolicy(int insuranceId);
		String takePolicy(CustomerPolicy policyNew) throws ParseException;
		String redirectToTakePolicy(int planId, double premiumAmount);
}

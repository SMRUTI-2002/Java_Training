package com.java.ejb;

import javax.naming.NamingException;

public class Dummy2 {
	
	public static void main(String[] args) {
		try {
			System.out.println(new InsuranceEjbImpl().showInsuranceEjb());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.infinite;

public class ValidateMain {
	
	public static void main(String[] args) {
		Login log = new Login();
		log.setUserName("Puja");
		log.setPassCode("Puja");
		long count = new LoginDAOImpl().loginValidate(log);
		if (count==1) {
			System.out.println("correct");
		}else {
			System.out.println("invalid");
		}
		/*
		Login login = new LoginDAOImpl().authenticate(log);
		if (login!=null) {
			System.out.println("Correct");
		}
		else {
			System.out.println("invalid");
		}
	}
	*/
	}

}

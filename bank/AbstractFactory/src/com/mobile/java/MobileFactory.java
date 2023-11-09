package com.mobile.java;

public class MobileFactory extends AbstractFactory {

	@Override
	public Mobile getDetails(String mobile) {

		  if (mobile.equalsIgnoreCase("OnePlus")) {
	            return new OnePlus();
	        } else if (mobile.equalsIgnoreCase("IPhone")) {
	            return new IPhone();
	        } else if (mobile.equalsIgnoreCase("Samsung")) {
	            return new Samsung();
	        }
		
		return null;
	}

}

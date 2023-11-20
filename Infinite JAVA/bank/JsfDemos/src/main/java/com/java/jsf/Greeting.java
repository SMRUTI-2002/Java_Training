package com.java.jsf;

import java.util.Date;

public class Greeting {
	
	public String company() {
		return "company is infinite....";
	}
	
	public String saluation() {
		Date obj = new Date();
		int hr = obj.getHours();
		if (hr<=12) {
			return "Good mrng";
		} else if (hr > 12 && hr < 16) {
			return "Good afternoon";
		} else {
			return "Good evng";
		}
	}

}

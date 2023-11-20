package com.java.junitdemo;

import java.util.Hashtable;
import java.util.Map;

public class Data {
	
	
	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}
	
	public Object mapEx(String Key) {
		Map data = new Hashtable();
		data.put("Smruti", "Rath");
		data.put("Soumya", "panda");
		data.put("Smita", "rani");
		data.put("Sagar", "Behera");
		data.put("Akash", "Mishra");
		return data.get(Key);
	}
	
	public int max3(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m<c) {
			m=c;
		}
		return m;
	}
	
	public String sayHello() {
		return "welcome to Junit Programming";
	}
	
	public int sum (int a, int b) {
		return a+b;
	}
	

}

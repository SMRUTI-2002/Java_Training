package com.java.cols;

import java.util.Optional;

public class OptionalExample1 {
	
	public static void main(String[] args) {
		String[] str = new String [10]; 
		str[0] = "Rahul";		
		str[1] = "Rasmi";
		str[2] = "sahul";	
		str[3] = "tina";
		str[4] = "Rati";
		str[5] = "Raja";	
		Optional<String> result = Optional.ofNullable(str[8]);
		if (result.isPresent()) {
			System.out.println(str[8]);
		} else {
			System.out.println("Value is not available in the Index");
		}
	}

}

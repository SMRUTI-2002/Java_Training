package com.java.agent;

import java.util.ArrayList;
import java.util.List;

public class hello {
	
	public static void main(String[] args) {
		List<Integer> int1 = new ArrayList<>();
		int1.add(3);
		int1.add(54);
		int1.add(77);
		System.out.println("Elements are:-");
		
		for(int i= 0; i<int1.size();i++) {
			System.out.println(i + int1.get(i));
			
		}
		
	}

}

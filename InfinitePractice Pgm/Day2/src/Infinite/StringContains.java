package Infinite;

import java.util.Scanner;

public class StringContains {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
//		if we use eqaualsIgnoreCase then it will check lower and upper case also..
		
		if(str.contains("Java")) {
			System.out.println("Contains Java...");
		}else if (str.equalsIgnoreCase("Pakistan")) {
			System.out.println("You are Restricted...");
		}else {
			System.out.println("Does not Conatains Java...");
		}
	}

}

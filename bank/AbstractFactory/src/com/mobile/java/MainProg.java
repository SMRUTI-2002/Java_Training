package com.mobile.java;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the mobile: ");
        String mobileName = scanner.nextLine();
        System.out.println("You entered: " + mobileName); 

        AbstractFactory factory = new MobileFactory();
        Mobile mobile = factory.getDetails(mobileName);

        if (mobile != null) {
            System.out.println("Details for " + mobileName + ":"); 
            mobile.name();
            mobile.model();
            mobile.price();
        } else {
            System.out.println("Mobile not found!");
        }
		
		
	}
}

package com.java.infinite;
import java.util.ArrayList;

public class WrapperEx3 {
	
	public static void main(String[] args) {
        // Create an ArrayList to store Integer objects
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Adding integer values to the list
        numbersList.add(42);
        numbersList.add(123);
        numbersList.add(78);

        // Retrieving values from the list and printing them
        //using foreach loop
        for (Integer number : numbersList) {
            System.out.println("Value: " + number);
        }
	}

}
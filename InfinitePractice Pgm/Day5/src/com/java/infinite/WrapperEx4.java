package com.java.infinite;

public class WrapperEx4 {
	
	public static void main(String[] args) {
        // Using wrapper classes to work with primitive data types
        Integer intWrapper = 42;        // Autoboxing: primitive int to Integer
        Double doubleWrapper = 3.14;    // Autoboxing: primitive double to Double

        // Performing operations with wrapper objects
        Integer sum = intWrapper + 10;  // Autounboxing, addition, and autoboxing
        Double product = doubleWrapper * 2.5;  // Autounboxing, multiplication, and autoboxing

        // Printing results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

}

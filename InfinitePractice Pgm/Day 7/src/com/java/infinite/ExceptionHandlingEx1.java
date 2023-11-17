package com.java.infinite;

public class ExceptionHandlingEx1 {
	
	public static void main(String[] args) {
        try {
            // Code that may throw an exception due to division by zero
            int result = divide(10, 0); // result = 10/0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {  //it's throws an ArithmeticExceptions
            // Handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // This block will always execute, whether an exception is thrown or not
            System.out.println("Execution complete.");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
        	// Throw an exception when attempting to divide by zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend/divisor;
    }
}
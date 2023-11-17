package Infinite;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExp {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            int[] arr = new int[3]; //{2,5,7}
	            for (int i = 0; i < 3; i++) {
	                System.out.print("Enter an integer: ");
	                arr[i] = scanner.nextInt(); // Input mismatch exception
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Input mismatch exception.");
	        }
	    }
	}


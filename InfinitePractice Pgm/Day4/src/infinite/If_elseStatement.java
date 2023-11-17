package infinite;

import java.util.Scanner;

public class If_elseStatement {
	
	public static void main(String[] args) {
	    int number = 10;

	    // checks if number is greater than 0
	    if (number > 0) {
	      System.out.println("The number is positive.");
	    }
	    
	    // execute this block
	    // if number is not greater than 0
	    else {
	      System.out.println("The number is not positive.");
	    }

	    System.out.println("Statement outside if...else block");
	  }
	
	
	/*
	    public static void main(String args[]) {
        int year; // integer variable named year
        System.out.println("Enter Year : "); //: Display a message to the user, asking them to enter a year.
        Scanner in = new Scanner(System.in); //Create a Scanner object named in to read input 
        year = in.nextInt(); // integer input from the user and store it in the year variable.
  //if statement checks whether the year is a leap year using the leap year rule
        
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
        	
       //year % 4 == 0: This condition checks if the year is evenly divisible by 4.
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

    }
*/	 

}

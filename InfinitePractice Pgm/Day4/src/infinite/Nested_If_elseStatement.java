package infinite;

public class Nested_If_elseStatement {
	
	public static void main(String[] args) {

	    // declaring double type variables
	    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

	    // checks if n1 is greater than or equal to n2
	    if (n1 >= n2) {

	      // if...else statement inside the if block
	      // checks if n1 is greater than or equal to n3
	      if (n1 >= n3) {
	        largest = n1; // Set 'largest' to n1 if n1 is the largest.
	      }

	      else {
	        largest = n3; // Set 'largest' to n3 if n1 is not the largest.
	      }
	    } else {

	      // if..else statement inside else block
	      // checks if n2 is greater than or equal to n3
	      if (n2 >= n3) {
	        largest = n2; // Set 'largest' to n2 if n2 is the largest.
	      }

	      else {
	        largest = n3;  // Set 'largest' to n3 if n2 is not the largest.
	      }
	    }

	    System.out.println("Largest Number: " + largest); // Print the largest number.
	  }
}


package infinite;
import java.util.Scanner;

/*
Else If Ladder
90-100 Grade-A
80-89  Grade-B
70-79  Grade-C
<70    Grade-D
*/
// This is a Java program that calculates and assigns a grade based on the average mark.
public class else_ifStatement {
	
	public static void main(String args[]) {
        float avg; // Declare a variable named 'avg' to store the average mark.
        System.out.println("Enter The Average Mark : ");// Display a message asking the user to enter the average mark.
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input.
        avg = in.nextFloat();// Read a floating-point number from the user and store it in the 'avg' variable.
        // Check the value of 'avg' and assign a grade accordingly.
        if (avg >= 90 && avg <= 100) { // If 'avg' is between 90 and 100, print "Grade A."
            System.out.println("Grade A");
        } else if (avg >= 80 && avg <= 89) {  // If 'avg' is between 80 and 89, print "Grade B."
            System.out.println("Grade B");
        } else if (avg >= 70 && avg <= 79) { // If 'avg' is between 70 and 79, print "Grade C."
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D"); // If 'avg' is less than 70, print "Grade D."
        }
    }

}

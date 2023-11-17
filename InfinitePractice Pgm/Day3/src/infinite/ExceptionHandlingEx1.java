package infinite;

public class ExceptionHandlingEx1 {
	
	public static void main(String []args) { 
	      try { 
	         int data = 10/2; // it is a valid division operation 10 divided by 2
	         System.out.println(data); // Print the result, which is 5.
	      } catch(NullPointerException e) { 
	         System.out.println(e);
	      } finally { 
	         System.out.println("finally block is always executed"); 
	      } 
	      System.out.println("rest of the code...");
	 }
}

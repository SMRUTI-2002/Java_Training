package infinite;

public class CatchExample {
	
	 public static void main(String[] args) {  
	        int i=50; // Declare an integer variable 'i' with the value 50.
	        int j=0;  // Declare an integer variable 'i' with the value 0. 
	        int data;   // Declare an integer variable 'data'.
	        try  
	        {  
	        data=i/j; // here to divide 'i' by 'j' it's may throw an exception   
	        }  
	            // handling the exception  
	        catch(Exception e)  
	        {  
	             // resolving the exception in catch block  
	            System.out.println(i/(j+2)); // If an exception is caught, perform a different division and print the result.
	        }  
	    }  
	}  


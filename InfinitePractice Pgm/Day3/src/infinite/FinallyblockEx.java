package infinite;

public class FinallyblockEx {
	
	 public static void main(String[] args) {
	        try {
	            int result = 10 / 2;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exceptionf: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block always executes.");
	        }
	    }

}

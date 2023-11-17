package infinite;

public class MulExpHandling {
	
	public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4] / 0; // ArrayIndexOutOfBoundsException and ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        }
    }
  
	/*
	  try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4] / 0; // Attempt to access an out-of-bounds index and divide by zero
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
	 */
}

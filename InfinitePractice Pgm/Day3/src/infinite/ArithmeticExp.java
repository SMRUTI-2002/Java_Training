package infinite;

public class ArithmeticExp {
	
	public static void main(String[] args) {
		int arr[] = new int [] {2,3,5}; //  an integer array 'arr' with values [2, 3, 5].
		try {
			int a = arr[2]/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannnot be Divisible..."); // If an ArithmeticException is caught, print this message.
        }
		}
	}



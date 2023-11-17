package Infinite;

public class NullException {
	
	public static void main(String[] args) {
		int[] arr = null;
		try {
			int value = arr[0];
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block

			System.out.println("Null object is Passed...");
		
		}
	}

}



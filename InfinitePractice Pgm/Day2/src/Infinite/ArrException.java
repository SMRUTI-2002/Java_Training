package Infinite;

public class ArrException {
	
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3};
		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("It's Array Out of Bound...");
		}
		
	}

}

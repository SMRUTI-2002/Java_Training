package infinite;

public class Ex7 {
	
	// Java Program to Add Two Binary Strings

    //  two binary strings as input x and y.
    static String add_Binary(String x, String y)
    {
        // the binary string x is converted into an integer (decimal) by using the Integer.
    	// parseInt method with base 2
        int num1 = Integer.parseInt(x, 2);
        // converting binary string into integer(decimal
        // number)
 
        int num2 = Integer.parseInt(y, 2);
        // converting binary string into integer(decimal
        // number)
 
        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum
 
        String result = Integer.toBinaryString(sum);
        // Converting that resultant decimal into binary
        // string
 
        return result;
    }
   // Main driver method
    public static void main(String args[])
    {
        String x = "011011", y = "1010111";
 
        System.out.print(add_Binary(x, y));
    }
}



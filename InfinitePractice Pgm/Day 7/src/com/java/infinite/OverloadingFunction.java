package com.java.infinite;

public class OverloadingFunction {
	
	 // function for adding two integers
    void add(int a, int b)
    {
        int sum = a + b;
        System.out.println(" Addition of two integer :"
                           + sum);
    }
 
    // function for concatenating two strings
    void add(String s1, String s2)
    {
        String con_str = s1 + s2;
        System.out.println("Concatenated strings :"
                           + con_str);
    }
 
    public static void main(String args[])
    {
    	OverloadingFunction  obj = new OverloadingFunction();
       
        // addition of two numbers
        obj.add(10, 10);
        // concatenation of two string
        obj.add("Operator","overloading");
    }

}

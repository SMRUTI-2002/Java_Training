package com.java.infinite;

public class OverloadingintChar {
	// arguments of this function are of int and char type
    static void show(int a, char ch)
    {
        System.out.println("integer : " + a
                           + " and character : " + ch);
    }
 
    // argument of this function are of char and int type
    static void show(char ch, int a)
    {
        System.out.println("character : " + ch
                           + " and integer : " + a);
    }
 
    public static void main(String[] args)
    {
        // 1st show function
        show(6, 'G');
 
        // 2nd show function
        show('G', 7);
    }

}

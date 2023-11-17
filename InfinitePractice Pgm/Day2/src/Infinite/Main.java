package Infinite;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    
	    //user input
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    int d = sc.nextInt();
	    
	    //main code
	    
	    int index = -1;
	    for(int i=0;i<n;i++){
	        if(arr[i] == d){
	            index = i;
	            break;
	        }
	    }
	    
	    System.out.println(index);
	    
	 }


}

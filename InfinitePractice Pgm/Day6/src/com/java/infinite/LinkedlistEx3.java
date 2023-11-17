package com.java.infinite;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedlistEx3 {
	 public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  // Create an Iterator to traverse the LinkedList
		  Iterator<String> itr=al.iterator();  
		  // Use a while loop to iterate through the LinkedList
		  while(itr.hasNext()){  
			  // Print each element in the LinkedList
		   System.out.println(itr.next());  
		  }  
     }  

}

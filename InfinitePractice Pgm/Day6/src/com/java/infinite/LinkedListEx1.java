package com.java.infinite;

import java.util.LinkedList;

public class LinkedListEx1 {
	
	public static void main(String[] args) {
	    LinkedList<String> languages = new LinkedList<>();

	    // add elements in the linked list
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add("Sql");
	    System.out.println("LinkedList: " + languages);

	    // change elements at index 3
	    languages.add(3, "Kotlin");
	    System.out.println("Updated LinkedList: " + languages);
	  }

}

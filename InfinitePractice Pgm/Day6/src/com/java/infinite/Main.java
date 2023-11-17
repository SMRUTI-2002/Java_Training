package com.java.infinite;
import java.util.LinkedList;

public class Main {

	    public static void main(String[] args) {
	        // Creating a linked list
	        LinkedList<String> animals = new LinkedList<>();
	     // Adding elements to the linked list
	        animals.add("Cow");
	        animals.add("Cat");
	        animals.add("Dog");
	        // Printing the original linked list
	        System.out.println("LinkedList: " + animals);

	        // Using forEach loop to access linked list elements
	        System.out.println("Accessing linked list elements:");
	        for(String animal: animals) {
	            System.out.print(animal);
	            System.out.print(", ");
	        }
	   }
}

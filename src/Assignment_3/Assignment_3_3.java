/**
 * 
 */
package Assignment_3;																												// Package Declared
public class Assignment_3_3 {																										// Class Declared
/**
 * Create a program to demonstrate Constructor Chaining Between the same class and between the child and parent class.
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
	public static void main(String[] args) {																						// Main Method Started
	        System.out.println("Constructor Chaining Between the Parent class and between the child and parent class is Shown below :\n");	// This will Print the argument in the next line
	        new ParentClass();     																									// Invokes default constructor of Parent Class
	        System.out.println("**********************************************************************************************\n"); // This will Print the argument in the next line
	        new ChildClass();																										// Invokes default constructor of Child Class
	    }																															// Main Method closed
}																																	// Assignment_3_3 class closed


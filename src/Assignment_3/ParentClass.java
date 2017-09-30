/**
 * 
 */
package Assignment_3;																									// Package Declared
/**
 *  Constructor Chaining within the Parent class Using this() keyword
 *
 *         Why do we need constructor chaining ?
 * This process is used when we want to perform multiple tasks
 * in a single constructor rather than creating a code for each task in a
 * single constructor we create a separate constructor for each task
 * and make their chain which makes the program more readable.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class ParentClass {																							// Class Declared
    ParentClass()                                                   												// Default constructor 1 Created, 
    { this(100);                                                   													// Default constructor will call another constructor 2 using this keyword from same class
      System.out.println (" --> The Default constructor of Parent Class with No Argument \n");}						// This will print the argument in the next line
    ParentClass(int myFirstInteger)                                              									// Parametrized constructor 2 created
    { this(100, 150);                                            													// constructor 3 called
      System.out.print(myFirstInteger);																				// This will print the argument in the next line
      System.out.println(" --> Parameterized Constructor of Parent Class with One Integer Argument\n" );}			// This will print the argument in the next line
    ParentClass(int myFirstInteger, int mySecondInteger)                                        					// Parametrized constructor 3 called
    { System.out.print(myFirstInteger * mySecondInteger);															// This will print the multiplication of myFirstInteger and mySecondInteger in the next line
      System.out.println(" --> Parameterized Constructor of Parent Class with Multiplication Two Integer Arguments\n"); } // This will print the argument in the next line
}																													// ParesntClass closed


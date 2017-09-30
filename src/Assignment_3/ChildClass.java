package Assignment_3;																			// Package declared
public class ChildClass extends ParentClass{													// Child Cat Declared which will inherit the properties of Parent class
	public ChildClass() {																		// Default Constructor of Child Class Created
        System.out.println("The Default Constructor Called in CHILD Class with No Argument");}	// This will print argument in the next line.
    public ChildClass(int myFirstInteger) {                                                     // second Parametrized constructor created
        super(myFirstInteger);}																	// Keyword Super is declared to inherit the properties of Parent Class
    public ChildClass(int myFirstInteger, int mySecondInteger) {								// Third Parametrized constructor created
        super(myFirstInteger, mySecondInteger);	}												// Keyword Super is declared to inherit the properties of Parent Class
}																								// Child Class Closed

/*
FILENAME: Person.java

DESCRIPTION: This file is the base class for the Customer 
             and Operator objects. It defaults to a generic 
	     name and handles renaming and returning the 
	     name of the Person
             
AUTHOR: Jacob Meyer 200364255
*/

public class Person {
    String name;

    public Person() {
	name = "Steeve";
    }
    public String getName() {
	return name;
    }
    public void setName(String nameString) {
	name = nameString;
	System.out.println("The name is set to " + name + ".");
    }

    public void functionTest() {
	// Called by Test.java during development to test each function
	// as I was developing the object
	System.out.println("\nTesting base class Person functions:");
	System.out.println("calling function getName() returns: " + getName());
	System.out.println("calling function setName(new name)");
	setName("new name");
	System.out.println("calling function getName() returns: " + getName());
    }
	
}
    

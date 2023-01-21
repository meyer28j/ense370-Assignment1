/*
FILENAME: Main

DESCRIPTION: This class is the driver for the ATM, Customer,
             and Operator classes. Note there are a few small
	     changes in the ATM class functions and output to
	     try and make it a little smaller and make the output 
	     a little more human-readable
             
AUTHOR: Jacob Meyer 200364255
*/


import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
	Scanner inputReader = new Scanner(System.in);
	int userInputInt;
	String userInputString; 
	System.out.print("Enter a whole dollar amount (an integer) between 0 and 10 000: $");
	userInputInt = inputReader.nextInt();
	while (userInputInt < 0 || userInputInt > 10000) {
	    System.out.print("You have entered an invalid number; please enter an integer between 0 and 10 000: $");
	    userInputInt = inputReader.nextInt();
	}
			     
	ATM atm1 = new ATM(0, false);
	ATM atm2 = new ATM(userInputInt, true);

	Operator operator = new Operator();
	System.out.print("Please enter the name of an ATM Operator: ");
	userInputString = inputReader.next();
	while (userInputString == "") {
	    System.out.print("You have entered an invalid name; please enter a name: ");
	    userInputString = inputReader.next();
	}
	operator.setName(userInputString);

	System.out.println("\nProcessing ATM 1");
	operator.topUpATM(atm1);
	System.out.println("\nProcessing ATM 2");
	operator.topUpATM(atm2);

	Customer customer = new Customer();
	System.out.print("Please enter the name of a Customer: ");
	userInputString = inputReader.next();
	while (userInputString == "") {
	    System.out.print("You have entered an invalid name; please enter a name: ");
	    userInputString = inputReader.next();
	}
	customer.setName(userInputString);
	
	System.out.print("Enter a whole dollar amount (an integer) to withdraw: $");
	userInputInt = inputReader.nextInt();
	while (userInputInt < 0 || userInputInt > 10000) {
	    System.out.print("You have entered an invalid number; please enter an integer: ");
	    userInputInt = inputReader.nextInt();
	}
	customer.withdrawCash(atm1, userInputInt);
    }
}

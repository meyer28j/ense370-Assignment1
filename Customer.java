/*
FILENAME: Customer.java

DESCRIPTION: This file contains the child class Customer
             from the base class Person. It can only
	     withdraw cash from an ATM (if there are
	     the proper conditions)
             
AUTHOR: Jacob Meyer 200364255
*/


public class Customer extends Person {

    public void withdrawCash(ATM atm, int amount) {
	atm.printServiceStatus();
	if (atm.queryCash() < amount)
	    System.out.println("ATM has insufficient cash for a withdrawal of $" + amount + ".");
	else {
	    atm.reader.readCard();
	    atm.display.displayPINVerification();
	    atm.dispenser.dispenseCash(amount);
	    atm.printer.printReceipt();
	    System.out.println("$" + amount + " successfully withdrawn from ATM. Have a nice day!");
	}
    }    
}

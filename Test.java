/*
FILENAME: Test.java

DESCRIPTION: This file instances each object written for the assignment
             and runs a test of all functions for each object.
	     
	     ****************************
	     This file was used to check functions and objects as they were
	     being developed; it is not part of the assignment, but I wanted
	     to include so you can see the whole picture with each of the
	     functionTest() functions I made for some of the objects.
	     ****************************

AUTHOR: Jacob Meyer 200364255
 */

public class Test {
    
    public static void main(String [] args) {
	System.out.println("Begin Testing:");
	
	ATM testATM = new ATM();
	testATM.constructorTest();
	ATM testATM2 = new ATM(50, true);
	testATM2.constructorTest();
	testATM.functionTest();

	
	ATM.CashDispenser testDispenser = testATM2.new CashDispenser();
	testDispenser.functionTest();
	ATM.ReceiptPrinter testPrinter = testATM2.new ReceiptPrinter();
	testPrinter.printReceipt();
	ATM.CardReader testReader = testATM2.new CardReader();
	testReader.readCard();
	ATM.KeypadDisplay testDisplay = testATM2.new KeypadDisplay();
	testDisplay.displayPINVerification();
	

	Person testPerson = new Person();
	testPerson.functionTest();

	Operator testOperator = new Operator();
	System.out.println("\ntesting subclass Operator:\ncalling function topUpATM(atm)");
	testOperator.topUpATM(testATM2);

	Customer testCustomer = new Customer();
	System.out.println("\ntesting subclass Customer:\ncalling function withdrawCash(atm, 450)");
	testCustomer.withdrawCash(testATM2, 450);
    }
}

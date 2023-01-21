/*
FILENAME: ATM.java

DESCRIPTION: This file contains the ATM object and all
             child objects, including test functions
	     for the ATM class each subclass
             
AUTHOR: Jacob Meyer 200364255
*/


public class ATM {
    public static void main (String [] args) {

    }
    private int cash;
    private boolean inService;
    
    public ATM() {
	cash = 0;
	inService = false;
    }

    public ATM(int x, boolean y) {
	cash = x;
	inService = y;
    }
    
    public int queryCash() {
	return cash;
    }
    public void increaseCash(int x) {
	cash += x;
    }
    public void reduceCash(int x) {
	cash -= x;
    }
    public boolean getServiceStatus() {
	return inService;
    }
    public void changeServiceStatus() {
	inService = !inService;
	if (inService)
	    System.out.println("ATM status changed to 'in service.'");
	else
	    System.out.println("ATM status changed to 'not in service.'");
    }

    public void printServiceStatus() {
	// I added this function because:
	//    1. the code inside was called more than once in Main.java
	//    2. I wanted to create a more "human-readable" output
	//   (3.)I just wanted to try out the ternary operator :D
	String status;
	status = (getServiceStatus()) ? "ATM is in service." : "ATM is not in service.";
	System.out.println(status);	
    }

    public void constructorTest() {
	// Called by Test.java during development to test each constructor
	// as I was developing the object
	System.out.println("\nNew ATM constructed:\n\tcash: " + cash + "\n\tinService: " + inService);
    }
    public void functionTest() {
	// Called by Test.java during development to test each function
	// as I was developing the object

	System.out.println("\nTesting base class ATM functions:");
	
	System.out.println("calling function queryCash() returns " + queryCash());
	System.out.println("calling function increaseCash(71)");
	increaseCash(71);
	System.out.println("calling function queryCash() returns " + queryCash());
	System.out.println("calling function reduceCash(49)");
	reduceCash(49);
	System.out.println("calling function queryCash() returns " + queryCash());
	System.out.println("calling function getServiceStatus() returns " + getServiceStatus());
	System.out.println("calling function changeServiceStatus()");
	changeServiceStatus();
	System.out.println("calling function getServiceStatus() returns " + getServiceStatus());
    }

    public class CashDispenser {
	public void dispenseCash(int x) {
	    if (x < 1) {
		System.out.println("Invalid dollar amount entered. Please enter a number greater than zero.");
		return;
	    }
	    String plural;
	    reduceCash(x);
	    System.out.print("$" + x + " dollar");
	    plural = (x == 1) ? " has" : "s have";
	    System.out.println(plural + " been dispensed. Please take your cash.");
	}
	public void functionTest() {
	    // Called by Test.java during development to test each function
	    // as I was developing the object
	    System.out.println("\nTesting nested class CashDispenser functions: ");
	    System.out.println("calling function dispenseCash(0)");
	    dispenseCash(0);
	    System.out.println("remaining cash: " + queryCash());
	    System.out.println("calling function dispenseCash(1)");
	    dispenseCash(1);
	    System.out.println("remaining cash: " + queryCash());
	    System.out.println("calling function dispenseCash(33)");
	    dispenseCash(33);
	    System.out.println("remaining cash: " + queryCash());
	}
    }
    
    public class ReceiptPrinter {
	public void printReceipt() {
	    System.out.println("Receipt has been printed. Please take your receipt.");
	}
    }
    
    public class CardReader {
	public void readCard() {
	    System.out.println("Card has been read.");
	}
    }
    
    public class KeypadDisplay {
	public void displayPINVerification () {
	    System.out.println("PIN has been verified.");
	}
    }

    CashDispenser dispenser = new CashDispenser();
    ReceiptPrinter printer = new ReceiptPrinter();
    CardReader reader = new CardReader();
    KeypadDisplay display = new KeypadDisplay();
}


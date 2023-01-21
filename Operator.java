/*
FILENAME: Operator.java

DESCRIPTION: This is the child class Operator
             from the base class Person. It can
	     only add money to the ATM (if there
	     are the proper conditions)
             
AUTHOR: Jacob Meyer 200364255
*/


public class Operator extends Person {

    public void topUpATM(ATM atm) {
	atm.printServiceStatus();
	System.out.println("Current cash amount: $" + atm.queryCash());
        if (atm.getServiceStatus())
	    atm.changeServiceStatus();
	if (atm.queryCash() < 5000)
	    atm.increaseCash(5000);
	System.out.println("ATM cash topped up to $" + atm.queryCash());
	atm.changeServiceStatus();
    }
}

package com.xworkz.abstraction.Banking;

public class BankTester {
	
	public static void main (String []ar) {
		
		Bank bank = new SbiBankImpl();
		bank.aClose();
		bank.aOpen();
		bank.transComplete();
		
		Bank bank2 = new HdfcBankImpl();
		bank2.aClose();
		bank2.aOpen();
		bank2.transComplete();
		
		Bank bank3 = new ICICIBankImpl();
		bank3.aClose();
		bank3.aOpen();
		bank3.transComplete();
		
		Bank bank4 = new AxisBankImpl();
		bank4.aClose();
		bank4.aOpen();
		bank4.transComplete();
	}

}

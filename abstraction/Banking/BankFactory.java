package com.xworkz.abstraction.Banking;

public class BankFactory {
	
	public static Bank getAccount(String type) {
		if(type.equalsIgnoreCase("AxisBank")) {
			AxisBankImpl impl = new AxisBankImpl();
			return impl;
		}
		else if(type.equalsIgnoreCase("HdfcBank")) {
			HdfcBankImpl impl2 = new HdfcBankImpl();
			return impl2;
		}
		else if(type.equalsIgnoreCase("ICICIBank")) {
			ICICIBankImpl impl3 = new ICICIBankImpl();
			return impl3;
		}
		else if(type.equalsIgnoreCase("SbiBank")) {
			SbiBankImpl impl4 = new SbiBankImpl();
			return impl4;
		
		}return null;
	} 
	
}	




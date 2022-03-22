package com.xworkz.abstraction.Banking;

public class AxisBankImpl implements Bank {

	@Override
	public void aOpen() {
		// TODO Auto-generated method stub
		System.out.println("Your AXIS bank account is opened sucessfully");
	}

	@Override
	public void aClose() {
		// TODO Auto-generated method stub
		System.out.println("Your AXIS bank account closed sucessfully...!");
	}

	@Override
	public void transComplete() {
		// TODO Auto-generated method stub
		System.out.println("Axis bank transation of 45000 is completed");
	}

}

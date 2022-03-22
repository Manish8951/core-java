package com.xworkz.abstraction.Banking;

public class ICICIBankImpl implements Bank{

	@Override
	public void aOpen() {
		// TODO Auto-generated method stub
		System.out.println("Your ICICI bank account opened sucessfully");
	}

	@Override
	public void aClose() {
		// TODO Auto-generated method stub
		System.out.println("Your ICICI bank account is closed ");
	}

	@Override
	public void transComplete() {
		// TODO Auto-generated method stub
		System.out.println("Your ICICI transation of 1,25,450 is completed");
	}

}

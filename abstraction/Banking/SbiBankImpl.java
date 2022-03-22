package com.xworkz.abstraction.Banking;

public class SbiBankImpl implements Bank{

	@Override
	public void aOpen() {
		// TODO Auto-generated method stub
		System.out.println("SBI account is open sucessfully");
	}

	@Override
	public void aClose() {
		// TODO Auto-generated method stub
		System.out.println("SBI account closed ....!");
	}

	@Override
	public void transComplete() {
		// TODO Auto-generated method stub
		System.out.println("Your SBI transation of 25000 is sucessful");
	}
	
	
	

}

package com.xworkz.abstraction.Banking;

public class HdfcBankImpl implements Bank {

	@Override
	public void aOpen() {
		// TODO Auto-generated method stub
		System.out.println("Your HDFC account opened sucessfully");
	}

	@Override
	public void aClose() {
		// TODO Auto-generated method stub
		System.out.println("Your HDFC account closed ");
	}

	@Override
	public void transComplete() {
		// TODO Auto-generated method stub
		System.out.println("Your HDFC transation of 850000 is completed");
	}

}

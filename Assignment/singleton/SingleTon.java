package com.xworkz.assign;

public class SingleTon {

	static SingleTon obj= new SingleTon();
	
	private SingleTon() {
		
	}
	public static SingleTon geSingleTon() {
		return obj;
	}
}

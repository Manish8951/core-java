package com.xworkz.abstraction;

public class LightTester {
	
	public static void main (String []ar) {
		
		//abstarsction
		Switch switch1 = new TubelightImpl();
		switch1.sOff();
		switch1.sOn();
		
		Switch switch2 = new CflImpl();
		switch2.sOff();
		switch2.sOn();
		
	}

}

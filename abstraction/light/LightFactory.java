package com.xworkz.abstraction;

public class LightFactory {
	
	public static Switch getLight(String type) {
		if(type.equalsIgnoreCase("tube light")) {
			
			TubelightImpl impl = new TubelightImpl();
			return impl;
		}
		else if(type.equalsIgnoreCase("cfllight")) {
			
			CflImpl impl2 = new CflImpl();
			return impl2;
		}
			return null;	
	}
	

}

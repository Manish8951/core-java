package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.Contract.RedBusContract;

public class TravelAgency {
	
	RedBusContract redBusContract;
	
	static String name ="Aairavat Club Class";
	
	public TravelAgency (RedBusContract redBusContract) {
		super();
		
		this.redBusContract=redBusContract;
	}
	public boolean booking(int noOfBooking) {
		boolean booking = true;
		System.out.println("You are inside Booking...");
		boolean warrenty = redBusContract.warrenty();
		
		if(warrenty) {
			System.out.println("Warrenty checked ...proceed for booking ..");
			
			     if(noOfBooking <=redBusContract.minbooking()) {
			    	 System.out.println("Booking is sucessful ..!");
			    	 return true;
			     }
			     else {
			    	 System.out.println("Can't proceed for booking ...no exceedes try again");
			     }
			     System.out.println("Outside booking");
		}
		return booking;
	}
	
	
	

}

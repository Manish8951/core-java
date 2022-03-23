package com.xworkz.redbusapp.Tester;

import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.Contract.*;
import com.xworkz.redbusapp.Tester.*;
import com.xworkz.redbusapp.Vrl.*;

public class BusTester {
	
	public static void main (String []ar) {
		RedBusContract BusContract = new VrlImplementation();
		TravelAgency agency = new TravelAgency(BusContract);
		
		agency.booking(4);
	}

}

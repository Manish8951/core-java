package com.xworkz.collectionapp.ship;

import java.security.KeyStore.PrivateKeyEntry;

import com.xworkz.collectionapp.dvd.DvdDTO;

public class ShipDTO implements Comparable<ShipDTO>{
	
	private int noOf_blades;
	private String name;
	
	

	public ShipDTO(int noOf_blades) {
		// TODO Auto-generated constructor stub
		this.noOf_blades = noOf_blades;
	}
	
	@Override
	
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.hashCode();
	}



	@Override
	public int compareTo(ShipDTO dto) {
		// TODO Auto-generated method stub
		return this.noOf_blades - dto.noOf_blades;
	}



	@Override
	public String toString() {
		return "ShipDTO [noOf_blades=" + noOf_blades + ", name=" + name + "]";
	}
	
	

}

package com.xworkz.collectionapp.dvd;

public class DvdDTO implements Comparable<DvdDTO>{
	
	private int capacity;
	private String brand;
	private int id;
	
	
	
	public DvdDTO(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id;
	}
    
	@Override
	public int compareTo(DvdDTO dto) {
		return this.id - dto.id;
	}

	@Override
	public String toString() {
		return "DvdDTO [capacity=" + capacity + ", brand=" + brand + ", id=" + id + "]";
	}
	
	
}

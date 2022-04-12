package com.xworkz.collectionapp.dream11;

public class Dream11DTO implements Comparable<Dream11DTO> {
	
	private String name;
	private int id;
	
	

	public  Dream11DTO(int id) {
	   this.id = id;
	}
	
	@Override
	
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public int compareTo(Dream11DTO dto) {
		// TODO Auto-generated method stub
		return this.id - dto.id;
	}

	@Override
	public String toString() {
		return "Dream11DTO [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}

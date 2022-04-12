package com.xworkz.collectionapp.Politician;

public class PoliticianDTO implements Comparable<PoliticianDTO> {
	
	private String politician_name;
	private int id;

	public PoliticianDTO(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public int compareTo(PoliticianDTO dto) {
		// TODO Auto-generated method stub
		return this.id-dto.id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String toString() {
		return "PoliticianDTO [politician_name=" + politician_name + ", id=" + id + "]";
	}
	
	

}

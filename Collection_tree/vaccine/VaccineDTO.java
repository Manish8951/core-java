package com.xworkz.collectionapp.vaccine;

public class VaccineDTO  implements Comparable<VaccineDTO>{
	
	private String vaccine_name;
	private int id;

	public VaccineDTO(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(VaccineDTO dto) {
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
		return "VaccineDTO [vaccine_name=" + vaccine_name + ", id=" + id + "]";
	}
	

}

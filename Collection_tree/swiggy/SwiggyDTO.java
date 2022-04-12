package com.xworkz.collectionapp.swiggy;

public class SwiggyDTO implements Comparable<SwiggyDTO> {
	
	private String app_name;
	private int id;

	public SwiggyDTO(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(SwiggyDTO dto) {
		// TODO Auto-generated method stub
		return this.id- dto.id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String toString() {
		return "SwiggyDTO [app_name=" + app_name + ", id=" + id + "]";
	}
	
	
	

}

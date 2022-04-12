package com.xworkz.collectionapp.postoffice;

public class PostOfficeDTO implements Comparable<PostOfficeDTO> {
	
	private String branch_name;
	private int id;
	

	public PostOfficeDTO(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public int compareTo(PostOfficeDTO dto) {
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
		return "PostOfficeDTO [branch_name=" + branch_name + ", id=" + id + "]";
	}
	

}

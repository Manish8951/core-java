package com.xworkz.collectionapp.youtube;

public class YoutubeDTO implements Comparable<YoutubeDTO> {
	
	private String name;
	private int id;
	

	public YoutubeDTO(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}


	@Override
	public int compareTo(YoutubeDTO dto) {
		// TODO Auto-generated method stub
		return this.id - dto.id;
	}


	@Override
	public String toString() {
		return "YoutubeDTO [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}

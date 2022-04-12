package com.xworkz.collectionapp.paint;

public class PaintDTO implements Comparable<PaintDTO>{

	
	private int id;
	private String name;
	private float price;
	
	public PaintDTO(int id) {
		this.id= id;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public int compareTo(PaintDTO dto) {
		return this.id -dto.id;
	}

	@Override
	public String toString() {
		return "PaintDTO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}

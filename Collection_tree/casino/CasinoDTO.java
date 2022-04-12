package com.xworkz.collectionapp.casino;

import com.xworkz.collectionapp.dvd.DvdDTO;

public class CasinoDTO  implements Comparable<CasinoDTO>{
	
	private int id;
	private String name;
	
	
	@Override
	public int hashCode() {
		return this.id;
	}

	public CasinoDTO(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public int compareTo(CasinoDTO dto) {
		// TODO Auto-generated method stub
		return this.id -dto.id;
	}

	@Override
	public String toString() {
		return "CasinoDTO [id=" + id + ", name=" + name + "]";
	}
	
	

}

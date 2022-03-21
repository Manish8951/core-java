package com.xworkz.socialmedia.dto.Atm;

public class Atm {
	
	private long Number;
	private String Name;
    private String Vallidity;
    private int Cvv;
    
    
    public Atm() {
    	System.out.println(this.getClass().getSimpleName()+"object is created");    	
    }


	public long getNumber() {
		return Number;
	}


	public void setNumber(long number) {
		Number = number;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getVallidity() {
		return Vallidity;
	}


	public void setVallidity(String vallidity) {
		Vallidity = vallidity;
	}


	public int getCvv() {
		return Cvv;
	}


	public void setCvv(int cvv) {
		Cvv = cvv;
	}


	@Override
	public String toString() {
		return "Atm [Number=" + Number + ", Name=" + Name + ", Vallidity=" + Vallidity + ", Cvv=" + Cvv + "]";
	}
    
	@Override
	public int hashCode() {
		return Cvv;
	}
	
	@Override
	public boolean equals(Object obj) {
		Atm card = (Atm)obj;
		if(this.hashCode()==card.hashCode())
			return true;
		
		return false;
	}
    

}

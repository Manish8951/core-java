package com.xworkz.socialmedia.dto.garbage;

public class GarbageCollector {
	
	  public static void main (String[]ar){

	       for(int i=0;i<5;i++){

	          for(int j=5;j>i;j--){

	               System.out.print("*");

	            }
	              System.out.println("");
	             
	            }
	       
	       System.gc();
	}

}

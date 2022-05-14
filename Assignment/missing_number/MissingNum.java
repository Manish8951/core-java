package com.xworkz.assign.missing_number;

public class MissingNum {

	public static void main(String[] args) {
		
int[]a= {7,10,2,5,8,1,3,4,13};
		
		int min,i=0;
		for( i=0;i<a.length;i++) {
			min=i;
			int temp=0;
			
			   for(int j=i+1;j<a.length;j++) {
				
				   
				   if(a[min]>a[j]) {
					min=j;
				}
			   }
			 //  System.out.println("Min number is " + a[min]);
			  
			   temp =a[i];
			    a[i]=a[min];
			    a[min]=temp;
		}
		for( i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		for ( i = 0; i < a.length-1; i++) {
			if((a[i+1]-a[i]!=1)) {
				
				System.out.println("missing number is "+(a[i]+1));
			}
			
		}
		
	}

}

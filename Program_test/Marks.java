class Marks{
public static void main(String []ar){
  int []a = {72,88,89};
  int max = a[0];
  
  for( int i=1;i<a.length;i++) {
			
		   if(a[i]>max) {
			max = a[i];
		
		}
	}
		if(max==72){
			System.out.println("highest marks belongs to Munnu :"+max);
		}
		else if(max==88){
			
			System.out.println("highest marks belongs to satish :"+max);
			
		}
		else{
			System.out.println("highest marks belongs to sreekanth :"+max);
		}
	}

  

}


class Fibboo{
 public static void main (String []ar){
 int i=0,j=1,res=0,num=245;
        System.out.println(j);
 
 for(int m=0;m<num;m++){
    
	res=m-1;
	m=i+j;
	
	i=j;
	j=m;
	System.out.println(m);
 }
 
 System.out.println("nearest fibonacci of "+num+ " is :"+res);
 }
}
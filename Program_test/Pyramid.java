class Pyramid {
	
	public static void main(String[] args) {
		
		int i,j,n=7;
		
		for(i=0;i<n;i++) {
			for(j=n;j>0;j--) {
				
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
package methodprograms.workonmethod;

public class Exampleproblems {

	
	 public static void main (String [] ar) {
			
			String word = ("shut down you computer");
			System.out.println(word.indexOf("u"));
			
			

	                String myStr = ("lenovo");
	                System.out.println(myStr.replace('o','m'));

	                String letter1 = "keyboard";
			String letter2 = "";
			System.out.println(letter1.isEmpty());
			System.out.println(letter2.isEmpty());

	                String text = "java programming language";
			
			String[] result = text.split(" ");
			
			System.out.print("output is = ");
			for (String str :result) {
				System.out.print(str +"," );
	                  }

	                
	                
			String s1 = "dolbyatmos";
			
			char[] arr = s1.toCharArray();
		
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	                }

	                
			String word1 = "good night";
			System.out.println(word1.toUpperCase());
		

	               
	                String word2 = "HELLO..GOOD MORNING";
			System.out.println(word2.toLowerCase());

	                int value = 20;
			String s2 = String.valueOf(value);
			System.out.println(s2+22);


	                String name = "college";
			char ch = name.charAt(5);
			System.out.println(ch);

	                
	    }           
	}



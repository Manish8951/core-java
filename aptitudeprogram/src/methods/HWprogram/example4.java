package methods.HWprogram;

public class example4 {

	public static void main (String []ar) {
		
		String text = "java programming language";
		
		String[] result = text.split(" ");
		
		System.out.println("output is = ");
		for (String str :result) {
			System.out.print(str +"," );
		}
		
	}
}

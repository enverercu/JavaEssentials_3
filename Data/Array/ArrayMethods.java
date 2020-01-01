package Data.Array;

public class ArrayMethods {
	
	public static void main(String[] args) {
		
		String str = String.valueOf("abcdefgh");
		
		char[] chr = str.toCharArray();
		
		for(char c:chr){
			System.out.print(c + " ");
		}

		System.out.println();
		
		char ch = str.charAt(0);
		
		for (int i=0; i<str.length(); i++){
			System.out.print(str.charAt(i) + " ");
		}
		
		
		

	}

}

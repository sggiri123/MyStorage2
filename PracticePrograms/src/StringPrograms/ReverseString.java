package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "This is a java program";
		
		String rev="";
		
		char ch;
		
		for (int i=0; i<s.length(); i++) 
		{
			ch = s.charAt(i);
			rev = ch + rev;
			
		}
		System.out.print(rev);
		
		
	}

}

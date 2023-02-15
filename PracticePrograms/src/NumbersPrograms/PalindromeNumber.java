package NumbersPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int a =1215;
		String s = Integer.toString(a);
		
		String n ="";
		char ch;
		
		for (int i=0; i<s.length(); i++) {
			
			ch = s.charAt(i);
			n= ch + n;
			
		}
		System.out.println(n);
		
		if (s.equalsIgnoreCase(n)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}

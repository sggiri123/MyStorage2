package StringPrograms;

public class PalindromeString {
public static void main(String[] args) {
		
		String s = "Madam";
		
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

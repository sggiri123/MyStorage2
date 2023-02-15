package ArrayPrograms;

public class ArrayString {

	public static void main(String[] args) {
		
		String s ="Hello My Name is Shridhar";
		
		String [] p = s.split(" ");
		
		for (int i=0; i<p.length; i++) {
			reverse(p[i]);
		}
		
	}
	
	public static String reverse(String word) {
		
		String a= word;
		
		String n ="";
		
		char ch;
		
		for (int i=0; i<a.length(); i++) {
			ch = a.charAt(i);
			n= ch+n;
		}
		
		System.out.print(n+" ");
		return n;
		
	}

}

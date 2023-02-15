package ArrayPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		String [] s = {"Shridhar", "Shankar", "Neha", "Vaibhav","Reyvan", "shreya"};
		
		Arrays.sort(s);
		
		System.out.println("Array Elements in alphabetical order");
		System.out.println("====================================");
		
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]);
			
		}
	System.out.println("Array elements starting from specific letters");
	System.out.println("=============================================");
		
		for (int i=0; i<s.length; i++) {
			
		s[i] = s[i].toLowerCase();
		if (s[i].startsWith("s")) {
			System.out.println(s[i]);
	
		}
		
			
		}
	}

}

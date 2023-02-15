package StringPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String s ="Shridhar Giri";
		
		for (int i=0; i<s.length()-1; i++) {
			
			for (int j=i+1; j<s.length(); j++) {
				
				if (s.charAt(i)==s.charAt(j)) {
					s= s.replace(s.charAt(i), ' ');
				}
				
			}
		}
		System.out.println(s.replaceAll(" ", ""));
		
	
	}

}

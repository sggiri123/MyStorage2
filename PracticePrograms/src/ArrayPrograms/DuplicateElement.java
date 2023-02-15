package ArrayPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
	 int [] a = {1,2,3,4,5,20,7,8,5,7,9,10,1,8,20,20};
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
				
				
			}
		}
	
	
	}

}

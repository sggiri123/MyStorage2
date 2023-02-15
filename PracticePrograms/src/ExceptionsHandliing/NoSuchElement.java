package ExceptionsHandliing;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class NoSuchElement {

	public static void main(String[] args) {
	
		Set <Character> set = new HashSet<>();
	try {
		set.iterator().next();
	}
		catch (Exception e) {
			
		}
			Scanner sc = new Scanner("123");
			
			System.out.println(sc.nextLine());
			
	}

}

package StringPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String s = "qfsgduASDySf$%ksndfkj&*#24@";
		
		s = s.replaceAll("[^A-z0-9]", "");
		
		System.out.println(s);
		
		System.out.println("No of special characters are: "+s.length());
		
		
		
	}

}

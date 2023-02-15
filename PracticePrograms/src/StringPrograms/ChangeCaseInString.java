package StringPrograms;

public class ChangeCaseInString {

	public static void main(String[] args) {
		
		String s = "This is a java Program";
		
		System.out.println(s.replaceAll("a", "Q"));
		
		String k = s.substring(0,1).toLowerCase() + s.substring(1);
		System.out.println(k);
		
	
		
		
	}

}

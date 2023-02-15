package StringPrograms;

public class HalfhalfCapitalSmall {

	public static void main(String[] args) {

		String h = "This is a harshal this is a harshal";
		
		h= h.substring(0, h.length()/2).toUpperCase()+h.substring(h.length()/2).toLowerCase();
		
		System.out.println(h);

	}

}

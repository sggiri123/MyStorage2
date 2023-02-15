package StringPrograms;

public class AdditionOfIntegers {

	public static void main(String[] args) {
		
		String s = "ghsc5s64s6dse454sdfsd5";
		int f=0;
		char k;
		int sum=0;
	    for (int i =0; i<s.length(); i++) {
	  
	    try {
		     k= s.charAt(i);
		     f = Integer.parseInt(String.valueOf(k));
		     sum += f; 
		   
	   }
	   catch (Exception e) {	
		   
	   }
	    	 	
	    }
		System.out.println(sum);
		
	}

}

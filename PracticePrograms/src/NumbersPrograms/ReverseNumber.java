package NumbersPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		int remainder =0;
		int number=1257;
		int sum =0;
		String s = Integer.toString(number);
		
		for (int i=0; i<s.length(); i++) {
		 
			 remainder = number%10;
			number = number/10;
		   sum += remainder;
	       System.out.print(remainder);
	    }
		System.out.println();
		 System.out.println(sum);
	}

}

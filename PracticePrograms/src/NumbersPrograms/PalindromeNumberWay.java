package NumbersPrograms;

public class PalindromeNumberWay {

	public static void main(String[] args) {
		  int a = 131;
		  int orignalNumber =a;
		    int remainder;
		    int reverse =0;
		    while(a !=0) {
		        remainder = a%10;
		        reverse = reverse*10+remainder;
		        a = a/10;
		       
		    }
		     System.out.println(reverse);
		    
		     if (orignalNumber== reverse) 
		         {
			        System.out.println("The number is palindrome");
			    }
			     else {
			        System.out.println("The number is not palindrome"); 
			     }
	}

}

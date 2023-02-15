package NumbersPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int a = 153;
		String s = Integer.toString(a);
//		String s ="153";
		
		int count = s.length();
		char k;
		int sum=0;
		int f=0;
		for (int i=0; i<count; i++) {
			
			  k= s.charAt(i);
			
		     f = Integer.parseInt(String.valueOf(k));
		    
		    sum += Math.pow(f, count);    
			
		}
		
       if (Integer.parseInt(s)==sum)
         {
	       System.out.println("Armstrong number");
         }
      else {
	       System.out.println("Not a Armstrong numebr");
           }

	    }

}

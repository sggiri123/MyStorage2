package NumbersPrograms;

import java.util.Scanner;

public class OddEvenNumberSum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		
		System.out.println("Enter starting Number: ");
		int a = s.nextInt();
		System.out.println("Enter a Ending Number");
		int b = s.nextInt();
		int sumEven=0;
		int sumOdd=0;
		int sum1=0;
		for(int i=a; i<=b; i++) 
		{
			if (i%2 == 0) {
				sumEven += i;
				
			}
			
			else {
				
				sumOdd += i;
				
			}
			
			if (i==8) {
				continue;
			}
			
			sum1 += i;
			
		}
		System.out.println("The sum of even Numbers is:" + sumEven);
		System.out.println("The sum of odd numbers is: "+sumOdd);
		System.out.println(sum1);
		
		

	}

}

package NumbersPrograms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int a =4;
		int factorial=1;
		for (int i=a; i>=1; i--) {
			
			factorial *= i;
			
		}
		System.out.println(factorial);

	}

}

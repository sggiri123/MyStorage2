package NumbersPrograms;

public class LargestNumber {

	public static void main(String[] args) {

		int a = 250;
		int b = 500;
		int c = 40;

		if (a > b) {
			if (a > c)

			{
				System.out.println("a is largest");
				if (b > c) 
				{
					System.out.println("c is smallest");
				} 
				else 
				{
					System.out.println("b is smallest");
				}

			} 
			else 
			{
				System.out.println(" c is oldest");
				System.out.println("b is smallest");
			}

		} 
		else 
		{
			if (b > c) 
			{
				System.out.println("b is largest");
				if (a > c) 
				{
					System.out.println("c is smallest");
				} else {
					System.out.println("a is smallest");
				}
			} else {
				System.out.println("c is oldest");
				System.out.println("a is smallest");
			}

		}

	}

}

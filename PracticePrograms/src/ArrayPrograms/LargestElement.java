package ArrayPrograms;

public class LargestElement {

	public static void main(String[] args) {
		
		int [] a = {20,30,40,90,70,80};
   
		int largest = a[0];
		
		for (int i=0; i<a.length; i++) 
		{
			if (largest < a[i])
			{
				largest = a[i];
			}
		}
		System.out.println(largest);
		
	}

}

package ArrayPrograms;

public class MissingNumInArray {

	static int differencefactor;
	static int multiplicationfactor;

	public static void main(String[] args) {

		int[] a = {2,4,6,8};
		
		int b = relationOfElements(a);
		
		
		for (int i=0; i<a.length; i++) {
			
			if (b == differencefactor) {
				a[i] = a[i] + b;
				System.out.println(a[i]); 
			}
			else if(b == multiplicationfactor){
				a[i] = a[i] * b;
				System.out.println(a[i]); 
			}
			else {
				System.out.println("Array relation not detected");
			}
		}
	}
        
	

	public static int relationOfElements(int[] array) {
		if (array[1] - array[0] == array[2] - array[1]) {
			differencefactor = array[2] - array[1];
	        System.out.println(differencefactor);
	        return differencefactor;
			
		} 
		else if (array[1] / array[0] == array[2] / array[1]) {
	        multiplicationfactor = array[1] / array[0];
			System.out.println(multiplicationfactor);
			return multiplicationfactor;
		}
		return 0; 
		
		
	}

	}

package basicjava;

import java.util.Arrays;
public class ArrMethoods {

	public static void main(String[] args) {
		
		int [] num= {3,7,5,9,2,4};
	     Arrays.sort(num);

	     System.out.println(Arrays.toString(num));
	     
	     int index= Arrays.binarySearch(num, 5);
	     System.out.println("Index Value of 5 is"+index);
	     
	     Arrays.fill(num, 5);
	     System.out.println(Arrays.toString(num));
	     
	     int []num1= {1,3,5,7,9};
	     int [] copiedArray= Arrays.copyOf(num1, num1.length);
	     System.out.println("Original Array :"+ Arrays.toString(num1));
	     System.out.println("Copied Array:"+Arrays.toString(copiedArray));
	     
	    int [] num2= {1,2,3,4,5};
	    int [] num3 = {1,2,3,4,5};
	    boolean arrequal=Arrays.equals(num2, num3);
	    System.out.println(arrequal);
	    
	    int mismatchIndex = Arrays.mismatch(num2, num3);
        System.out.println("First mismatch at index: " + mismatchIndex); 

	
	}
}

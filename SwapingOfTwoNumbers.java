package basicjava;

import java.lang.reflect.Array;

public class SwapingOfTwoNumbers {

	public static void main(String[] args) {
		int[] numbers = {10, 20};
      System.out.println("Before Swapping the Two Numbers:"+numbers[0]+" "+numbers[1]);
      if(numbers.length!=2) {
    	  System.out.println("Array Should contain only two elements");
      }
      int temp=numbers[0];
      numbers[0]=numbers[1];
      numbers[1]=temp;
      
      System.out.println("After Swapping numbers are :"+ numbers[0]+" "+numbers[1]);

	}

}

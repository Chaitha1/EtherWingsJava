package javaPackage;
import java.lang.Math;   // lang Package
import java.util.ArrayList;  // util Package

public class Built_in_Package {
	    public static void main(String[] args) {
	    	
	    	//To Find the Square of a number
	    	int num =36;
	    	double squareRoot = Math.sqrt(num);
	    	double n = Math.floor(6.23);
	    	System.out.println("Ceiling of a number is:"+n);
	    	System.out.println("Square root of"+ num + " is :"+squareRoot);
	    	
	        // Creating an ArrayList
	        ArrayList<String> list = new ArrayList<>();

	        // Adding elements to the ArrayList
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");// it can hold the duplicate Values

	        // Displaying the elements of the ArrayList
	        System.out.println("Fruits in the list: " + list);

	        // Removing an element from the ArrayList
	        list.remove("Banana");
	       

	        // Displaying the elements after removal
	        System.out.println("Fruits in the list after removal: " + list);

	        // Accessing an element by index
	        String fruit = list.get(1);
	        System.out.println("Fruit at index 1: " + fruit);

	        // Checking if the list contains a specific element
	        boolean hasApple = list.contains("Apple");
	        System.out.println("List contains Apple: " + hasApple);
	    }
	}




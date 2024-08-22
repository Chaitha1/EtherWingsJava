package javaPackage;

public class UsingThrow {
	
	static void checkName(String name) {
		if(name == null) {
			throw new NullPointerException("String is Empty");
		}
		else {
			System.out.println("Length of the String"+ name.length());
		}
	}
	static void checkAge(int age) {
        if (age < 18) { 
               throw new ArithmeticException("Access denied - You must be at least 18 years old.");
               } 
       else { 
                 System.out.println("Access granted - You are old enough!"); }
} 
  public static void main(String[] args) { 
	  try {
            checkAge(20);// Set age to 15 (which is below 18...)
            checkName(null);
	  }
	  catch(ArithmeticException e) {
		  System.out.println(" "+e.getMessage());
	  }
	  catch(NullPointerException e) {
		  System.out.println(" "+e.getMessage());
	  }
	  
	  
}
} 


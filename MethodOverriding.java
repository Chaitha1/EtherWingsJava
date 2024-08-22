package objectOrientedProgramming;

  class Anim{
	 public void display() {
		 System.out.println("Parent Class Method");
	 } 
 } 
   class Bnim extends Anim{
	   public void display() {
			 System.out.println("Child Class Method");
		 }
   }

public class MethodOverriding {

	public static void main(String[] args) {
		Anim b = new Anim();// Object type
		Anim a = new Bnim();// reference type
		a.display();
	    b.display();

	}

}

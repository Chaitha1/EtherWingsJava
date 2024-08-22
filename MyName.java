package objectOrientedProgramming;
// Multiple Parameters 
public class MyName {
	
	   void display(String name) {
		System.out.println("MyName is:"+name+" "+"G");	
	}
	   void displayAge(int age) {
		   System.out.println("My age is:"+ age);
	   }

	public static void main(String[] args) {
		MyName my = new MyName();
		my.display("Kavya");
		my.displayAge(26);

	}

}

package basicjava;
import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// Creating the object to the Scanner
	   Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the  integer Value");
       
       
       int x= scanner.nextInt();
       
       
       System.out.println("The Value of the X is:" + x);
       scanner.close();
       
	}

}

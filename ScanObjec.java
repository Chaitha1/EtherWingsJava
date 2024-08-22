package basicjava;
import java.util.*;
public class ScanObjec {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        System.out.println("You entered: " + inputString);
        
        // Read an integer
        System.out.println("Enter an integer:");
        int inputInt = scanner.nextInt();
        System.out.println("You entered: " + inputInt);
        
        // Read a double
        System.out.println("Enter a double:");
        double inputDouble = scanner.nextDouble();
        System.out.println("You entered: " + inputDouble);
        
        // Read a single word
        System.out.println("Enter a single word:");
        String inputWord = scanner.next();
        System.out.println("You entered: " + inputWord);
        
        // Close the scanner
        scanner.close();
    }
}


	

package javaPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		String str ="Reva";
        int[] numbers = new int[2];
        
        try {
        	System.out.println(numbers[1]);
            System.out.println(str.length()); // Might throw NullPointerException
            // Might throw ArrayIndexOutOfBoundsException
            int result = 10/0;
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch(ArithmeticException e) {
        	System.out.println("Caught an ArithmeticException"+ e.getMessage());	
        }catch (Exception e) {
            System.out.println("Caught a general Exception: " + e.getMessage());
        }
		finally {
			System.out.println("Finally Block Executed");
			
		}

	}

}

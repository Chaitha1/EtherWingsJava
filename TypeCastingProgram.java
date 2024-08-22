package basicjava;

public class TypeCastingProgram {

	public static void main(String[] args) {
		int myInt = 9;
        double myDouble = myInt; 
        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Converted to double: " + myDouble);

        // Explicit Casting (Narrowing Casting)
        double myAnotherDouble = 9.78;
        int myAnotherInt = (int) myAnotherDouble; 
        System.out.println("Explicit Casting:");
        System.out.println("Double value: " + myAnotherDouble);
        System.out.println("Converted to integer: " + myAnotherInt);
    }
}



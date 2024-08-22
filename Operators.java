package basicjava;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("Add and Assign: " + c);
        c -= 5;
        System.out.println("Subtract and Assign: " + c);
        c *= 2;
        System.out.println("Multiply and Assign: " + c);
        c /= 2;
        System.out.println("Divide and Assign: " + c);
        c %= 3;
        System.out.println("Modulus and Assign: " + c);

        // Comparison Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or Equal to: " + (a >= b));
        System.out.println("Less than or Equal to: " + (a <= b));

        // Logical Operators
        System.out.println("Logical AND: " + ((a > b) && (b < a)));
        System.out.println("Logical OR: " + ((a > b) || (b > a)));
        System.out.println("Logical NOT: " + !(a > b));

        // Unary Operators
        int d = 10;
        d++;
        System.out.println("Increment: " + d);
        d--;
        System.out.println("Decrement: " + d);

        // Bitwise Operators
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise Complement: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        System.out.println("Unsigned Right Shift: " + (a >>> 1));

        // Ternary Operator
        int result = (a > b) ? a : b;
        System.out.println("Ternary Operator: " + result);
  


	}

}

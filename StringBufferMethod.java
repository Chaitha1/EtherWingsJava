package basicjava;

public class StringBufferMethod {

	public static void main(String[] args) {
		// Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // Insert
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb); // Output: Hello Beautiful World

        // Delete
        sb.delete(6, 16);
        System.out.println("After delete: " + sb); // Output: Hello World

        // Replace
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb); // Output: Hello Java

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: avaJ olleH

        // Convert to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str); // Output: avaJ olleH


	}

}

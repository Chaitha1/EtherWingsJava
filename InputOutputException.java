package javaPackage;

import java.io.IOException;

public class InputOutputException {

	public static void main(String[] args) {
		try {
            readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
    	throw new IOException("File not found");
    		}
}


	



package interviewProgram;

public class PalidromSequence {

	public static void main(String[] args) {
		String str =  "1234321"; 
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--)
          {
            revStr = revStr + str.charAt(i);
          }        
        System.out.println("Reverse string = "+revStr);
        if(revStr.equals(str))
          System.out.println("The given string is a palindrome string");
        else
          System.out.println("The given string is not a palindrome string");

	}

}

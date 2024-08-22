package interviewProgram;

public class StringContainVowles {

	public static boolean  stringContainVowwels(String name) {
		return name.toLowerCase().matches(".*[aeiou].*");
		// ". *" used to traverse from each char in the String with the vowels
	}
	
	public static void main(String[] args) {
		
		System.out.println(stringContainVowwels(" Hello "));
		
		

	}

}

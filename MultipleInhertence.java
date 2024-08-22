package objectOrientedProgramming;

interface Character{
	void attrack();
}

interface Words{
	void use();
}


public class MultipleInhertence implements Character, Words{
	public void attrack() {
		System.out.println("Character");
	}
	public void use() {
		System.out.println("Words");
	}

	public static void main(String[] args) {
		
		MultipleInhertence mi = new MultipleInhertence();
		mi.attrack();
		mi.use();
	}

}

package objectOrientedProgramming;

class School{// superclass
	void run() {
		System.out.println("Running!!...");
	}
}
public class SingleInhertience extends School {
	
	void walk() {
		System.out.println("walking!!...");
	}

	public static void main(String[] args) {
		SingleInhertience d = new SingleInhertience();
		d.run();
		d.walk();
		

	}

}

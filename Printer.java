package objectOrientedProgramming;

public class Printer {

	public void print(String name) {
		System.out.println("Name :"+name);
	}
	
	public void print(int age) {
		System.out.println("Age :"+age);
	}
	
	public void print(String name, int age) {
		System.out.println("Name :"+name+"\t"+"Age :"+age);
	}
	
	public static void main(String[] args) {
		Printer	p = new Printer();
		p.print("Kavya");
		p.print(22);
		p.print("Bubba", 26);
 
	}

}

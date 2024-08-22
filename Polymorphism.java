package objectOrientedProgramming;

public class Polymorphism {
    
	public int add(int x, int y) {
		return x+y;	
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;	
	}
	public double add(double x, float y) {
		return x+y;	
	}
	
	
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		System.out.println("Method Add for 2 parameters:"+p.add(2, 4));
		System.out.println("Method add for 3 parameters:"+p.add(2, 4, 7));
		System.out.println("Method Add for 2 parameters:"+p.add(2.34, 2));
		

	}

}

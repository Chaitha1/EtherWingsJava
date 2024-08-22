package objectOrientedProgramming;

class Animals{// Single Superclass
	void food() {
		System.out.println("Animal Foods are");
	}
}
class Lion extends Animals{// subclass1
	void meat() {
		System.out.println(" Lion eat meat");
	}
}

class Tiger extends Animals{// subclass 2
	void freshMeat() {
		System.out.println("Tiger Eat FreshMeat");
	}
}
public class HierachicalInhertance {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.food();
		t.freshMeat();
		
		Lion l = new Lion();
		l.food();
		l.meat();
		

	}

}

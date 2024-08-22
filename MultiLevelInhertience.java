package objectOrientedProgramming;

class Animal{//superclass
	void sound() {
		System.out.println("Animal Sounds are:");
	}
}
class Dog extends Animal{//intermiate class
	void bark() {
		System.out.println("Barking");
	}
}
class BabyDog extends Dog{// subclass
	void babyBark() {
		System.out.println("Baby Barking");
	}
}

public class MultiLevelInhertience {

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.sound();
		bd.babyBark();
		bd.bark();
	

	}

}

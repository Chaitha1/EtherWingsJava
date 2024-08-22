package objectOrientedProgramming;

public class Person {
     String name;
      int age;
	public Person(String n, int a) {
		this.name=n;
		this.age=a;
	}
	void display() {
		System.out.println(name+" "+ age);
	}

	public static void main(String[] args) {
		// creating a Object of class
	    Person obj = new Person("Kavya",27);
		
		System.out.println("Method Named Display");
		obj.display();

	}

}

package objectOrientedProgramming;
//Interface A
interface A {
 void methodA();
}

//Interface B
interface B {
 void methodB();
}

//Class C implements interfaces A and B
class C implements A, B {
 public void methodA() {
     System.out.println("Method A from Interface A");
 }

 public void methodB() {
     System.out.println("Method B from Interface B");
 }
}

//Another interface D extending A and B
interface D extends A, B {
 void methodD();
}

//Class E extends C and implements D
class E extends C implements D {
 public void methodD() {
     System.out.println("Method D from Interface D");
 }
}
public class HybridInhertence {

	public static void main(String[] args) {
        E obj = new E();
     obj.methodA(); // Method from Interface A
     obj.methodB(); // Method from Interface B
     obj.methodD(); // Method from Interface D
 
		
	}

}

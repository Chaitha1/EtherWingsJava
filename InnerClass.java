package objectOrientedProgramming;

class OuterClass{
	int x=2;
	public void num() {
		System.out.println("Value of x is :"+ x);
	}
	class InnerClass{
		int y =4;
		public void num() {
			System.out.println("Value of x is :"+ y);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		oc.num();
		ic.num();
		System.out.println("Sum of x+y="+(oc.x + ic.y));
      
	}

}

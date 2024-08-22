package basicjava;
import  objectOrientedProgramming.AccessModifiersExample;

public class DifferentPackageClass {
    
	public static void main(String[] args) {
		
		AccessModifiersExample obj = new AccessModifiersExample(10,20,30,40);
		obj.display();
        obj.publicMethod();
       // obj.protectedMethod();
        //obj.defaultMethod();
        //obj.privateMethod();
	}

}

package objectOrientedProgramming;

public class AccessModifiersExample {
   
	public int publicField;       // Accessible from anywhere
    protected int protectedField; // Accessible within the same package and subclasses
    int defaultField;             // Accessible only within the same package
    private int privateField;     // Accessible only within this class

 public AccessModifiersExample(int publicField2, int protectedField, int defaultField, int privateField ) {
	 super();
	 this.publicField=publicField2;
	 this.protectedField= protectedField;
	 this.defaultField= defaultField;
	 this.privateField= privateField;
	}
   
    public void display() {
    	System.out.println(publicField);
    	System.out.println(protectedField);
    	System.out.println(defaultField);
    	System.out.println(privateField);
    }
	// Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default (Package-private) method
    void defaultMethod() {
        System.out.println("Default (Package-private) method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }


	/*public static void main(String[] args) {
		AccessModifiersExample example = new AccessModifiersExample(10);
        example.publicField = 10;
        example.protectedField = 20;
        example.defaultField = 30;
        example.privateField = 40; 
        
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
        System.out.println(example.publicField+" "+example.protectedField+ " "+example.defaultField+" " +example.privateField);
*/
	}



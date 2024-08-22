package objectOrientedProgramming;

class Company{// Parent Class
	String companyname;
	
	Company(String name){
		this.companyname= name;
		System.out.println(companyname);
	}
}
class Employee extends Company{

	Employee(String name) {
		super(name);
		}
	void display() {
		System.out.println(super.companyname);
	}
	}
public class DemonstrateSuper {

	public static void main(String[] args) {
		Employee e = new Employee("Amazon");
        e.display();
	}

}

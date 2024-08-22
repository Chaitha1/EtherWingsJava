package objectOrientedProgramming;
abstract class Vehicle {
    private String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Concrete method
    public String getBrand() {
        return brand;
    }

    // Abstract method (no implementation)
    public abstract void honk();
    
    // Non-Abstract Method
    public void sound() {
    	System.out.println("BaZZZ");
    }
    
    //Static Method
    public static void speed() {
    	System.out.println("120KM/S");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    public void honk() {
        System.out.println(getBrand() + " goes beep beep!");
    }
}
public class AbstractionUsingAbstract {
      
	public static void speed() {
    	System.out.println("190KM/S");
    }
	
	public static void main(String[] args) {
		Vehicle myCar = new Car("Toyota");
        myCar.honk();// Output: Toyota goes beep beep!
        myCar.sound();
        
        Vehicle.speed();// to access the static Method no need to create object className.StaticMethod()
	     speed();
	}
	

}

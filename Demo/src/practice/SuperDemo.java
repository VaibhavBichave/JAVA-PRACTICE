package practice;
class Vehicle {
    int maxSpeed;
    String defaultColour;
    
    Vehicle(){
        maxSpeed = 100;
        defaultColour = "White";
    }
    
    void display() {
        System.out.println("This method is called from child class using 'super' keyword");
    }
}

class Car extends Vehicle{
    int maxSpeed = 200;
    String brand;
    
    Car(){
        super();
        brand = "Toyota";
    }
    
    void displaySpeed() {
        System.out.println("Brand : " + brand);
        System.out.println("Vehicle Speed : " + super.maxSpeed);
        System.out.println("Car Speed : " + maxSpeed);
        System.out.println("Colour : " + super.defaultColour);
        super.display();
    }
}

public class SuperDemo {
	public static void main(String args[]) {
	        Car c = new Car();
	        c.displaySpeed();
	    }
	}
package practice;
interface Vehicle1{
	public void start();
	public void stop();	
}
class Car1 implements Vehicle1{
	public void start () {
		System.out.println("Starting car engine");
	}
	public void stop() {
		System.out.println("Stopping car engine");
	}
}
class Truck1 implements Vehicle1{
	public void start () {
		System.out.println("Starting Truck engine");
	}
	public void stop() {
		System.out.println("Stopping Truck engine");
	}
}
public class Starter {
	 public static void startEngine(Vehicle1 vehicle) {
		 vehicle.start();
		 vehicle.stop();
	 }
	public static void main(String[] args) {
		Vehicle1 tesla = new Car1();
		Vehicle1 tata = new Truck1();
		Starter.startEngine(tesla);
		Starter.startEngine(tata);	
	}
}

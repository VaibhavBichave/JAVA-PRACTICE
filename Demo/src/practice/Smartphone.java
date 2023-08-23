package practice;
interface GPS{
	public void getCoordinates();
	default public void getRoughCoordinates() {
		System.out.println("Fetching rough coordinares....");
	}
}
interface Radio{
	public void startRadio();
	public void stopRadio();
	
}
public class Smartphone implements  GPS,Radio{
	public void getCoordinates() {
		System.out.println("Coordinte are 5367.645 ,  46448.575");
	}
	public void startRadio() {
		System.out.println("Radio is starting ");
	}
	public void stopRadio() {
		System.out.println("Radio is stoping ");
	}
	public static void main(String[] args) {
		Smartphone mi =new Smartphone();
		mi.getCoordinates();
		mi.getRoughCoordinates();
		mi.startRadio();
		mi.startRadio();
	}

}

package oopl;
class Publication{
	protected String title;
	protected double price;
	protected int copies;

//define constrctor
	public int getcopies() {
		return this.copies;
	}
	public void setcopies(int copies) {
		this.copies=copies;
	}
	public double getprice() {
		return this.price;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String gettitle() {
		return this.title;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public void sellcopy(int qty) {
		System.out.println("Total Publication sell:$"+(qty*price));
	}
}
class Book1 extends Publication{
	private String author;
	
	
}
public class MainClass {

	public static void main(String[] args) {
		
	}

}

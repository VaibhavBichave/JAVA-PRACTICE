package oopl;

public class Point1 {

	public static void main(String[] args) {
		Point pp =new Point();
		pp.init(4,3);
		pp.display();
		
	}

}
class Point{
	int x,y;
	
	void init(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		
	}
}
package practice;

class FinalDemo {
	public void display() {
		System.out.println("This is final method");
	}
}

public class FinalKeyword extends FinalDemo {
	public void display() {
		System.out.println("The final method is overridden");
	}

	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		obj.display();

	}

}

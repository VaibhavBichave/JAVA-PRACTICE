package practice;

class ParentClass{
	ParentClass(){
		System.out.println("Constructor of Parent class");
	}
	void display() {
		System.out.println("Parent Method");
	}
}
public class MethodOverriding extends ParentClass {
	MethodOverriding(){
		System.out.println("Constructor of Child class");
	}
	void display() {
		System.out.println("Child Method");
		super.display();
	}
	public static void main(String[] args) {
		MethodOverriding obj=new MethodOverriding();
		obj.display();

	}

}

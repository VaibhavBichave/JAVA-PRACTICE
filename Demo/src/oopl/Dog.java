package oopl;

public class Dog {
	private String name;
	private int age;

	public Dog(String nameDog, int myAge) {
		name = nameDog;
		age = myAge;
		System.out.println("The name of dog is" + name);
	}

	public void Age() {
		System.out.println("Dog age is " + age);
	}

	public static void main(String[] args) {
		Dog myDog = new Dog("tommy", 5);
		myDog.Age();
	}
}

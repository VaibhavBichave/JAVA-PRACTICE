package oopl;

public class Student {
	private int id;
	private String name;

	public Student() {
		name = "Vaibhav";
		id = 23209;
	}

	public Student(String myname, int myid) {
		this.name = myname;
		this.id = myid;
	}

	void display() {
		System.out.println("Name is " + name);
		System.out.println("ID is " + id + "\n");
	}

	public static void main(String[] args) {
		Student St = new Student("Shubham", 23346);
		St.display();
		Student Stu = new Student();
		Stu.display();
	}
}

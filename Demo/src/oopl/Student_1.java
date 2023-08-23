package oopl;
public class Student_1 {
	String name;
	Student_1(String name){
		this.name=name;	
	}
	
	Student_1(){
		this.name="Unknown";	
	}
	
	void display() {
		System.out.println("Student name :: "+name);
	}
	
	public static void main(String[] args) {
		Student_1 stud1 =new Student_1();
		stud1.display();
		Student_1 stud2 =new Student_1("vaibhav");
		stud2.display();	
	}
}

package oopl;

public class Load {
	String fname;
	String lname;
	int age;
	String prof;
	
	Load fload(String fname, String lname, int age, String prof)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.prof = prof;
		return this;
	}
	
	Load fload(String firstname, String lastname, String profession)
	{
		this.fname = firstname;
		this.lname = lastname;
		this.prof = profession;
		return this;
	}
	
	Load fload(int a, String p)
	{
		this.age = a;
		this.prof = p;
		return this;
	}
	
	void display()
	{
		System.out.println(fname+" "+lname+" "+age+" "+prof);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Load obj = new Load();
		System.out.println();
		obj.display();
		
		obj.fload( 20, "Student");
		obj.display();
		obj.fload("Vaibhav", "Bichave", 20, "Student");
		obj.display();
		obj.fload("sachin", "Tendulkar", "Cricketer");
		obj.display();

	}

}

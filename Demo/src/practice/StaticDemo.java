package practice;
class Emp{
	int empId;
	String name;
	static String CompanyName="PICT";
	static void change() {
		CompanyName="SCTR PICT";
	}
	public void show() {
		System.out.println(empId+" : "+name+" : Whose Company Name is "+CompanyName);
	}
}

public class StaticDemo {
	
	public static void main(String[] args) {
//		String s="sgh";
		int a =0x000f;
		int b=0x2222;
		System.out.println(a&b);
		//System.out.println(s[1]);
		Emp.change();
		Emp John =new Emp();
		John.empId=1;
		John.name="John";
		John.show();
	
		Emp X =new Emp();
		X.empId=2;
		X.name="Vaibhav";
		X.show();
		
		
	}

}

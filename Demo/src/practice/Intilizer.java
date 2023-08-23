package practice;

class A{  
	A(){  
		System.out.println("parent class constructor invoked");  
	}  
}  
  
class Intilizer extends A{  
	Intilizer(){  
		super();  
		System.out.println("child class constructor invoked");  
	}  
  
	Intilizer( int a){  
		super();  
		a+=2;
		System.out.println("child class constructor invoked "+a);  
	}  
	void display(){
		System.out.println("====================");
	}
	  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
	Intilizer b1=new Intilizer();
	b1.display();
	Intilizer b2=new Intilizer(10);  
	b2.display();
}  
}  
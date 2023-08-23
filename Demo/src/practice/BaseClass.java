package practice;
import java.util.*;
class Parent{
	void show() {
		System.out.println("Hii");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("Vaibhav");
	}
}
public class BaseClass {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		/*Parent p =new Parent();
		Child ch =new Child();
		p.show();
		ch.show();*/
		//int a='a',z='Z';
		int max =122,min =97;
		String t="";
		for (int i=0;i<5;i++) {
		double a = Math.random()*(max-min+1)+min; 
		//String t;
		 t+=(char)a;
		}
		System.out.println("Capcha:: "+t);
		String t1= sc.next();
		System.out.println(t1.equals(t));
		
		
	}
}


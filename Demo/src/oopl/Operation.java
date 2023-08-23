package oopl;

public class Operation {

	public static void main(String[] args) {
		int a=1,b=2,c=3;
		System.out.println("Before any Operation : a=1 , b=2 , c=3");
		a+=5;
		System.out.println("after increment by 5 : a = "+a);
		b*=4;
		System.out.println("after multiply by 4 : b = "+b);
		c+=a*b;
		System.out.println("after operation c+=a*b : c = "+c);
		c%=6;
		System.out.println("after dividing by 6 : c = "+c);

	}

}

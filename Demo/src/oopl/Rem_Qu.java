package oopl;

import java.util.Scanner;

class Cal1 {
	int x,y;
	Cal1(int x,int y){
		this.x=x;
		this.y=y;
	}
	void Display() {
		System.out.println("Remender :: "+x%y);
		System.out.println("Quotient :: "+x/y);
	}
}
public class Rem_Qu {

	public static void main(String[] args) {
		int x,y;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter First Number:: ");
		x=sc.nextInt();
		System.out.print("Enter Second Number:: ");
		y=sc.nextInt();
		sc.close();
		Cal1 cal=new Cal1(x,y);
		cal.Display();
		

	}

}

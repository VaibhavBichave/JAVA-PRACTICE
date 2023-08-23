package practice;

import java.util.Scanner;
import java.lang.Math;
public class Ditance {
	
	static double distance(int a,int b,int c,int d) {
		double t= (a-c)*(a-c)+(b-d)*(b-d);
		return Math.sqrt(t);
	}
	public static void main(String[] args) {
		double total=0;
		System.out.print("input");
		Scanner sc =new Scanner(System.in);
		int px=sc.nextInt();
		int t1=px;
		int py=sc.nextInt();
		int t2=py;
		for(int i=0; i<3;i++) {
			
			int x=sc.nextInt();
			int y=sc.nextInt();
			total+=(Ditance.distance(x, y, px, py));
			//if(total<temp) {total=temp;}}
			px=x;py=y;
		}
		sc.close();
		total+=Ditance.distance(t1, t2, px, py);
	System.out.println(total);


}}
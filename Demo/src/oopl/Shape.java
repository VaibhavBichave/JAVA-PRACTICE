package oopl;

import java.util.Scanner;

public class Shape {

	double circle(double r) {
		return 3.14 * r * r;
	}

	double square(double a) {
		return a * a;
	}

	double rectangle(double l, double b) {
		return b * l;
	}

	double triangle(double b, double h) {
		return 0.5 * b * h;
	}

	public static void main(String[] args) {
		double area;
		Shape sh = new Shape();
		do {
			System.out.println("Choose\t1.Circle \t2.Square \t3.Rectangle \t4.Triangle");
			System.out.print("Enter the Choice: ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();

			switch (x) {

				case 1:
					System.out.print("Enter Radius of the Circle: ");
					double r = sc.nextDouble();
					area = sh.circle(r);
					System.out.print("Area of Circle is " + area + "\n");
					break;

				case 2:
					System.out.print("Enter side length of Square: ");
					double a = sc.nextDouble();
					area = sh.square(a);
					System.out.println("Area of Square is " + area + "\n");
					break;

				case 3:
					System.out.print("Enter the length of rectangle: ");
					double l = sc.nextDouble();
					System.out.print("Enter the breadth of rectangle: ");
					double b = sc.nextDouble();
					area = sh.rectangle(l, b);
					System.out.println("Area of Rectangle is " + area + "\n");
					break;

				case 4:
					System.out.print("Enter the base of Triangle: ");
					double bs = sc.nextDouble();
					System.out.print("Enter the height of Triangle: ");
					double h = sc.nextDouble();
					area = sh.triangle(bs, h);
					System.out.println("Area of Trianle is " + area + "\n");
					break;

			}
			System.out.println("\n");
			sc.close();
		} while (true);

	}

}

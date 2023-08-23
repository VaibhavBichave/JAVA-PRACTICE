package oopl;

import java.util.Scanner;

public class _2DArray {
	int[][] coord = new int[3][3];

	void set() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter New Array elements [3][3]::");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				coord[i][j] = Sc.nextInt();
			}
		}
	}

	void display() {
		System.out.println("2D array is::");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(coord[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		_2DArray arr = new _2DArray();
		arr.set();
		arr.display();
	}
}

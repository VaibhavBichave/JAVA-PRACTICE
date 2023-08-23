package oopl;

import java.util.Scanner;

public class _2DMatrixAdd {
	int coord1[][]=new int[3][3];
	int coord2[][]=new int[3][3];
	void set1() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 1st matrix elements::");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				coord1[i][j]=Sc.nextInt();
			}
		}
	}
	void set2() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 2st matrix elements::");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				coord2[i][j]=Sc.nextInt();
			}
		}
	}
	void display() {
		System.out.println("2D Matrix Addition is::");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(coord1[i][j]+coord2[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		_2DMatrixAdd arr= new _2DMatrixAdd();
		arr.set1();
		arr.set2();
		arr.display();
	}
}

package oopl;

import java.util.Scanner;

public class Array {
	void display(int arr[]) {
		System.out.println("Array elements are::");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		System.out.println("Enter New Array elements 5 ::");
		Scanner Sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
		Sc.close();
		Array ar=new Array();
		ar.display(arr);
		
}

}

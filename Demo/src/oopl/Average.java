package oopl;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int sum=0;
		int [] arr= new int[5];
		System.out.println("Enter New Array elements::");
		Scanner Sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Average is ::"+sum/5);

	}

}

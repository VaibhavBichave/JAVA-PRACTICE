package oopl;

import java.util.Scanner;

public class StringMid {

	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int n= Sc.nextInt()	;
		String []arr=new String[n];
		for (int i=0; i<n;i++) {
			arr[i]=Sc.next();
		}
		if(arr.length%2!=0) {
		System.out.print(arr[arr.length/2]);
		}
		else{
			System.out.print(arr[arr.length/2-1]+" "+arr[arr.length/2]);
		}
		Sc.close();
		
	}

}

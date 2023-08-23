package oopl;

import java.util.Scanner;

public class StringFromArr {
	public static void main(String[] args) {
		
		String s="Now is the time all good men of the contry to come to the aid of their country and pay their taxes.";
		StringBuilder sb=new StringBuilder(s); 
		sb.reverse();
		String ss = new String (sb);
		System.out.println("index of t from start::"+s.indexOf('t'));
		System.out.println("index of t from end::"+(ss.length()-ss.indexOf('t')));
		System.out.println("index of t from 10::"+s.indexOf('t',10));
		System.out.print(ss.indexOf('t',ss.length()));
		
		

	}

}

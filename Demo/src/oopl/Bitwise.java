package oopl;

import java.util.*;

class Bitwise {
	void Reverse(String myString) {
		StringBuffer sb = new StringBuffer(myString);
		sb = sb.reverse();
		myString = sb.toString();
		String[] splitString = myString.split(" ");
		for (int i = 0; i < splitString.length / 2; i++) {
			System.out.print(splitString[i] + " ");
			System.out.print(splitString[splitString.length - i - 1] + " ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Bitwise Bitwise = new Bitwise();
		String myString = sc.nextLine();
		Bitwise.Reverse(myString);
	}
}

package oopl;

import java.util.*;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the character");
		String ch = sc.nextLine();
		if (ch == "a" | ch == "e" | ch == "i" | ch == "o" | ch == "u") {
			System.out.println("vowel");
		} else {
			System.out.println("Consonant");
		}
		sc.close();
		// System.out.println(ch);
	}

}

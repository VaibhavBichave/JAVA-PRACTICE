package oopl;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.print("First " + number + " terms: ");

        for (int i = 1; i <= number; ++i) {
            System.out.print(a + "  ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
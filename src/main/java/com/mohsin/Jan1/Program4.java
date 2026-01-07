package com.mohsin.Jan1;

import java.util.Scanner;

// Find largest of 4 integers using if-else ladder.
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 number");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        if (n1 > n2 && n1>n3 && n1>n4)
            System.out.println("Largest number is "+n1);
        else if (n2>n1 && n2>n3 && n2>n4)
            System.out.println("Lagest numbe is " +n2);
        else if (n3>n1 && n3>n2 && n3>n4)
            System.out.println("Largest number is " +n3);
        else System.out.println("Largest number is " + n4);

    }
}

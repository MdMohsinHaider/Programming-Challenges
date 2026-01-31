package com.mohsin.Jan2;

import java.util.Scanner;

public class Program2 {
    // Check whether a number is divisible by both 3 and 5.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("is divisible by both 3 and 5: "+isDivisible(scanner));
    }

    private static boolean isDivisible(Scanner scanner) {
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        return num % 3 == 0 && num % 5 == 0;
    }
}
